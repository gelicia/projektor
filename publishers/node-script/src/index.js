async function runCLI(cliArgs, publishToken, defaultConfigFilePath) {
  const parsedArgs = require("minimist")(cliArgs, {
    boolean: "exitWithFailure",
  });

  parsedArgs.resultsFileGlobs = parsedArgs._;

  return run(parsedArgs, publishToken, defaultConfigFilePath);
}

async function run(args, publishToken, defaultConfigFilePath) {
  const fs = require("fs");
  const { collectAndSendResults } = require("./publish");
  const { writeSlackMessageFileToDisk } = require("./slack");
  const { writeResultsFileToDisk } = require("./results-file");

  let serverUrl;
  let resultsFileGlobs;
  let attachmentFileGlobs;
  let coverageFileGlobs;
  let exitWithFailure;
  let writeSlackMessageFile;
  let slackMessageFileName;
  let projectName;

  const configFilePath = args.configFile || defaultConfigFilePath;

  if (fs.existsSync(configFilePath)) {
    const configFileContents = fs.readFileSync(configFilePath).toString();
    const config = JSON.parse(configFileContents);

    serverUrl = config.serverUrl;
    resultsFileGlobs = config.results;
    attachmentFileGlobs = config.attachments;
    coverageFileGlobs = config.coverage;
    exitWithFailure = config.exitWithFailure;
    writeSlackMessageFile = config.writeSlackMessageFile;
    slackMessageFileName = config.slackMessageFileName;
    projectName = config.projectName;
  } else {
    serverUrl = args.serverUrl;
    resultsFileGlobs = args.resultsFileGlobs;

    if (args.attachments) {
      attachmentFileGlobs = Array.isArray(args.attachments)
        ? args.attachments
        : [args.attachments];
    }
    if (args.coverage) {
      coverageFileGlobs = Array.isArray(args.coverage)
        ? args.coverage
        : [args.coverage];
    }
    exitWithFailure = args.exitWithFailure;
    writeSlackMessageFile = args.writeSlackMessageFile;
    slackMessageFileName = args.slackMessageFileName;
    projectName = args.projectName;
  }

  if (resultsFileGlobs) {
    const isCI = Boolean(process.env.CI) && process.env.CI !== "false";
    const gitRepoName =
      process.env.VELA_REPO_FULL_NAME || process.env.GITHUB_REPOSITORY;
    const gitBranchName = findGitBranchName();

    const { resultsBlob, reportUrl, publicId } = await collectAndSendResults(
      serverUrl,
      publishToken,
      resultsFileGlobs,
      attachmentFileGlobs,
      coverageFileGlobs,
      gitRepoName,
      gitBranchName,
      projectName,
      isCI
    );

    if (!resultsBlob) {
      console.log(
        `No test results files found in locations ${resultsFileGlobs}`
      );
    }

    if (isCI) {
      writeResultsFileToDisk(publicId, reportUrl, "projektor_report.json");
    }

    if (writeSlackMessageFile) {
      writeSlackMessageFileToDisk(
        reportUrl,
        slackMessageFileName || "projektor_failure_message.json",
        projectName
      );
    }

    if (exitWithFailure && containsTestFailure(resultsBlob)) {
      console.log(
        "Projektor exiting with non-zero exit code due to test failure"
      );
      process.exitCode = 1;
    }

    return { reportUrl, publicId };
  } else {
    console.error(
      `Results files not configured, please specify them either on the command line or in the ${configFilePath} config file`
    );

    return { reportUrl: null, publicId: null };
  }
}

function printLinkFromFile(resultsFileName) {
  const fs = require("fs");
  const {
    defaultResultsFileName,
    readResultsFileFromDisk,
  } = require("./results-file");

  const fileName = resultsFileName || defaultResultsFileName;

  if (fs.existsSync(fileName)) {
    const results = readResultsFileFromDisk(fileName);

    console.log(`View Projektor results at ${results.reportUrl}`);

    return results.reportUrl;
  } else {
    console.log(`No Projektor results file found with name ${fileName}`);
    return null;
  }
}

function containsTestFailure(resultsBlob) {
  return resultsBlob.indexOf("<failure") != -1;
}

function findGitBranchName() {
  const gitRef = process.env.VELA_BUILD_REF || process.env.GITHUB_REF;
  const gitBranchParts = gitRef ? gitRef.split("/") : [];

  // refs/head/branch-name
  return gitBranchParts.length === 3 ? gitBranchParts[2] : null;
}

module.exports = {
  runCLI,
  run,
  printLinkFromFile,
};

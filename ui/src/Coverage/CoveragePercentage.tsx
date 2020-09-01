import * as React from "react";
import { CoverageStat } from "../model/TestRunModel";
import { makeStyles, Tooltip } from "@material-ui/core";

interface CoveragePercentageProps {
  coverageStat: CoverageStat;
  previousTestRunId?: string;
}

const useStyles = makeStyles({
  positive: {
    color: "green",
    textDecoration: "none",
    "&:hover": {
      textDecoration: "underline",
    },
    "&:visited": {
      color: "green",
    },
  },
  negative: {
    color: "red",
    textDecoration: "none",
    "&:hover": {
      textDecoration: "underline",
    },
    "&:visited": {
      color: "red",
    },
  },
});

const CoveragePercentage = ({
  coverageStat,
  previousTestRunId,
}: CoveragePercentageProps) => {
  const classes = useStyles({});

  if (coverageStat.coveredPercentageDelta) {
    if (coverageStat.coveredPercentageDelta > 0) {
      return (
        <span>
          {coverageStat.coveredPercentage}%{" "}
          <Tooltip
            title="Coverage percentage increased between this run and the previous main branch run in this repo. Click to see the previous run's coverage data."
            placement="top"
          >
            <a
              href={`/tests/${previousTestRunId}/coverage`}
              className={classes.positive}
              target="_blank"
            >
              +{coverageStat.coveredPercentageDelta}%
            </a>
          </Tooltip>
        </span>
      );
    } else {
      return (
        <span>
          {coverageStat.coveredPercentage}%{" "}
          <Tooltip
            title="Coverage percentage decreased between this run and the previous main branch run in this repo. Click to see the previous run's coverage data."
            placement="top"
          >
            <a
              href={`/tests/${previousTestRunId}/coverage`}
              className={classes.negative}
              target="_blank"
            >
              {coverageStat.coveredPercentageDelta}%
            </a>
          </Tooltip>
        </span>
      );
    }
  } else {
    return <span>{coverageStat.coveredPercentage}%</span>;
  }
};

export default CoveragePercentage;

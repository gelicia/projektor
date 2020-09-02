package projektor.compare

import kotlinx.coroutines.runBlocking
import org.apache.commons.lang3.RandomStringUtils
import org.junit.jupiter.api.Test
import org.koin.core.inject
import projektor.DatabaseRepositoryTestCase
import projektor.incomingresults.randomPublicId
import projektor.server.example.coverage.JacocoXmlLoader
import strikt.api.expectThat
import strikt.assertions.isEqualTo
import strikt.assertions.isNull

class PreviousTestRunServiceTest : DatabaseRepositoryTestCase() {
    @Test
    fun `should exclude test run that is newer than specified test run`() {
        val previousTestRunService: PreviousTestRunService by inject()

        val previousPublicId = randomPublicId()
        val thisPublicId = randomPublicId()
        val newerPublicId = randomPublicId()

        val repoName = "${RandomStringUtils.randomAlphabetic(8)}/${RandomStringUtils.randomAlphabetic(8)}"

        val previousTestRun = testRunDBGenerator.createSimpleTestRun(previousPublicId)
        testRunDBGenerator.addGitMetadata(previousTestRun, repoName, true, "main")
        runBlocking { coverageService.saveReport(JacocoXmlLoader().serverApp(), previousPublicId) }

        val thisTestRun = testRunDBGenerator.createSimpleTestRun(thisPublicId)
        testRunDBGenerator.addGitMetadata(thisTestRun, repoName, true, "main")
        runBlocking { coverageService.saveReport(JacocoXmlLoader().serverApp(), thisPublicId) }

        val newerTestRun = testRunDBGenerator.createSimpleTestRun(newerPublicId)
        testRunDBGenerator.addGitMetadata(newerTestRun, repoName, true, "main")
        runBlocking { coverageService.saveReport(JacocoXmlLoader().serverApp(), newerPublicId) }

        val returnedId = runBlocking { previousTestRunService.findPreviousMainBranchRunWithCoverage(thisPublicId) }
        expectThat(returnedId).isEqualTo(previousPublicId)

        val previousIdFromOldest = runBlocking { previousTestRunService.findPreviousMainBranchRunWithCoverage(previousPublicId) }
        expectThat(previousIdFromOldest).isNull()
    }
}
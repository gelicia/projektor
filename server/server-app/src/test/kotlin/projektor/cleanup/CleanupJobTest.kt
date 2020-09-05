package projektor.cleanup

import io.ktor.util.*
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.koin.test.get
import projektor.DatabaseRepositoryTestCase
import projektor.incomingresults.randomPublicId
import strikt.api.expectThat
import strikt.assertions.isNotNull
import strikt.assertions.isNull

@KtorExperimentalAPI
class CleanupJobTest : DatabaseRepositoryTestCase() {
    @Test
    fun `should execute cleanup`() {
        val cleanupService = CleanupService(
                CleanupConfig(true, 30, false),
                get(),
                get(),
                get(),
                null
        )
        val cleanupScheduledJob = CleanupScheduledJob(cleanupService)

        val publicIdToDelete = randomPublicId()
        val testRunToDelete = testRunDBGenerator.createTestRun(publicIdToDelete, LocalDate.now().minusDays(31), false)

        val publicIdToSave = randomPublicId()
        val testRunToSave = testRunDBGenerator.createTestRun(publicIdToSave, LocalDate.now().minusDays(29), false)

        cleanupScheduledJob.run()

        expectThat(testRunDao.fetchOneById(testRunToDelete.id)).isNull()
        expectThat(testRunDao.fetchOneById(testRunToSave.id)).isNotNull()
    }
}
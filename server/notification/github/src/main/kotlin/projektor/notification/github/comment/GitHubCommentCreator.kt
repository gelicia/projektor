package projektor.notification.github.comment

import java.math.BigDecimal
import java.time.format.DateTimeFormatter

object GitHubCommentCreator {
    const val headerText = "Projektor reports"

    private val dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")

    fun appendComment(existingComment: String, report: ReportCommentData): String {
        return existingComment + "\n" + createReportTableRow(report)
    }

    fun createComment(report: ReportCommentData): String {
        return createReportTableHeader() + "\n" + createReportTableRow(report)
    }

    private fun createReportTableHeader(): String {
        return """
**$headerText**

| Projektor report | Result | Tests executed | Coverage | Project | Date | 
| ---------------- | ------ | -------------- | -------- | ------- | ---- |
        """.trimIndent().trim()
    }

    private fun createReportTableRow(report: ReportCommentData): String {
        val resultText = if (report.passed) "Passed" else "Failed"
        val testText = if (report.passed)
            "[${report.totalTestCount} total](${createReportLink(report, "all")})"
        else
            "[${report.failedTestCount} failed](${createReportLink(report, "failed")}) / [${report.totalTestCount} total](${createReportLink(report, "all")})"

        return "| [Projektor report](${createReportLink(report, "")}) | $resultText | $testText | ${createCoverageCellValue(report)} | ${report.project ?: ""} | ${dateFormatter.format(report.createdDate)} UTC |"
    }

    private fun createReportLink(report: ReportCommentData, uri: String): String {
        val baseUrl = if (report.projektorServerBaseUrl.endsWith("/")) report.projektorServerBaseUrl else "${report.projektorServerBaseUrl}/"

        return "${baseUrl}tests/${report.publicId}/$uri"
    }

    private fun createCoverageCellValue(report: ReportCommentData): String {
        val coverage = report.coverage

        return if (coverage != null) {
            val (lineCoveredPercentage, lineCoverageDelta) = report.coverage

            val deltaString = if (lineCoverageDelta != null) {
                when {
                    lineCoverageDelta > BigDecimal.ZERO -> "(+$lineCoverageDelta%)"
                    lineCoverageDelta < BigDecimal.ZERO -> "($lineCoverageDelta%)"
                    else -> null
                }
            } else {
                null
            }

            val displayValue = if (deltaString != null) {
                "$lineCoveredPercentage% $deltaString"
            } else {
                "$lineCoveredPercentage%"
            }

            "[$displayValue](${createReportLink(report, "coverage")})"
        } else {
            ""
        }
    }
}

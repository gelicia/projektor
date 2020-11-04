/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated;


import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import projektor.database.generated.tables.CodeCoverageFile;
import projektor.database.generated.tables.CodeCoverageGroup;
import projektor.database.generated.tables.CodeCoverageRun;
import projektor.database.generated.tables.CodeCoverageStats;
import projektor.database.generated.tables.GitMetadata;
import projektor.database.generated.tables.GitRepository;
import projektor.database.generated.tables.PerformanceResults;
import projektor.database.generated.tables.ProcessingFailure;
import projektor.database.generated.tables.ResultsMetadata;
import projektor.database.generated.tables.ResultsProcessing;
import projektor.database.generated.tables.ResultsProcessingFailure;
import projektor.database.generated.tables.TestCase;
import projektor.database.generated.tables.TestFailure;
import projektor.database.generated.tables.TestRun;
import projektor.database.generated.tables.TestRunAttachment;
import projektor.database.generated.tables.TestRunSystemAttributes;
import projektor.database.generated.tables.TestSuite;
import projektor.database.generated.tables.TestSuiteGroup;
import projektor.database.generated.tables.records.CodeCoverageFileRecord;
import projektor.database.generated.tables.records.CodeCoverageGroupRecord;
import projektor.database.generated.tables.records.CodeCoverageRunRecord;
import projektor.database.generated.tables.records.CodeCoverageStatsRecord;
import projektor.database.generated.tables.records.GitMetadataRecord;
import projektor.database.generated.tables.records.GitRepositoryRecord;
import projektor.database.generated.tables.records.PerformanceResultsRecord;
import projektor.database.generated.tables.records.ProcessingFailureRecord;
import projektor.database.generated.tables.records.ResultsMetadataRecord;
import projektor.database.generated.tables.records.ResultsProcessingFailureRecord;
import projektor.database.generated.tables.records.ResultsProcessingRecord;
import projektor.database.generated.tables.records.TestCaseRecord;
import projektor.database.generated.tables.records.TestFailureRecord;
import projektor.database.generated.tables.records.TestRunAttachmentRecord;
import projektor.database.generated.tables.records.TestRunRecord;
import projektor.database.generated.tables.records.TestRunSystemAttributesRecord;
import projektor.database.generated.tables.records.TestSuiteGroupRecord;
import projektor.database.generated.tables.records.TestSuiteRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CodeCoverageFileRecord> CODE_COVERAGE_FILE_PKEY = Internal.createUniqueKey(CodeCoverageFile.CODE_COVERAGE_FILE, DSL.name("code_coverage_file_pkey"), new TableField[] { CodeCoverageFile.CODE_COVERAGE_FILE.ID }, true);
    public static final UniqueKey<CodeCoverageGroupRecord> CODE_COVERAGE_GROUP_PKEY = Internal.createUniqueKey(CodeCoverageGroup.CODE_COVERAGE_GROUP, DSL.name("code_coverage_group_pkey"), new TableField[] { CodeCoverageGroup.CODE_COVERAGE_GROUP.ID }, true);
    public static final UniqueKey<CodeCoverageRunRecord> CODE_COVERAGE_RUN_PKEY = Internal.createUniqueKey(CodeCoverageRun.CODE_COVERAGE_RUN, DSL.name("code_coverage_run_pkey"), new TableField[] { CodeCoverageRun.CODE_COVERAGE_RUN.ID }, true);
    public static final UniqueKey<CodeCoverageStatsRecord> CODE_COVERAGE_STATS_PKEY = Internal.createUniqueKey(CodeCoverageStats.CODE_COVERAGE_STATS, DSL.name("code_coverage_stats_pkey"), new TableField[] { CodeCoverageStats.CODE_COVERAGE_STATS.ID }, true);
    public static final UniqueKey<GitMetadataRecord> GIT_METADATA_PKEY = Internal.createUniqueKey(GitMetadata.GIT_METADATA, DSL.name("git_metadata_pkey"), new TableField[] { GitMetadata.GIT_METADATA.ID }, true);
    public static final UniqueKey<GitRepositoryRecord> GIT_REPOSITORY_PKEY = Internal.createUniqueKey(GitRepository.GIT_REPOSITORY, DSL.name("git_repository_pkey"), new TableField[] { GitRepository.GIT_REPOSITORY.REPO_NAME }, true);
    public static final UniqueKey<PerformanceResultsRecord> PERFORMANCE_RESULTS_PKEY = Internal.createUniqueKey(PerformanceResults.PERFORMANCE_RESULTS, DSL.name("performance_results_pkey"), new TableField[] { PerformanceResults.PERFORMANCE_RESULTS.ID }, true);
    public static final UniqueKey<ProcessingFailureRecord> PROCESSING_FAILURE_PKEY = Internal.createUniqueKey(ProcessingFailure.PROCESSING_FAILURE, DSL.name("processing_failure_pkey"), new TableField[] { ProcessingFailure.PROCESSING_FAILURE.ID }, true);
    public static final UniqueKey<ResultsMetadataRecord> RESULTS_METADATA_PKEY = Internal.createUniqueKey(ResultsMetadata.RESULTS_METADATA, DSL.name("results_metadata_pkey"), new TableField[] { ResultsMetadata.RESULTS_METADATA.ID }, true);
    public static final UniqueKey<ResultsProcessingRecord> RESULTS_PROCESSING_PKEY = Internal.createUniqueKey(ResultsProcessing.RESULTS_PROCESSING, DSL.name("results_processing_pkey"), new TableField[] { ResultsProcessing.RESULTS_PROCESSING.PUBLIC_ID }, true);
    public static final UniqueKey<ResultsProcessingFailureRecord> RESULTS_PROCESSING_FAILURE_PKEY = Internal.createUniqueKey(ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE, DSL.name("results_processing_failure_pkey"), new TableField[] { ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE.PUBLIC_ID }, true);
    public static final UniqueKey<TestCaseRecord> TEST_CASE_PKEY = Internal.createUniqueKey(TestCase.TEST_CASE, DSL.name("test_case_pkey"), new TableField[] { TestCase.TEST_CASE.ID }, true);
    public static final UniqueKey<TestFailureRecord> TEST_FAILURE_PKEY = Internal.createUniqueKey(TestFailure.TEST_FAILURE, DSL.name("test_failure_pkey"), new TableField[] { TestFailure.TEST_FAILURE.ID }, true);
    public static final UniqueKey<TestRunRecord> TEST_RUN_PKEY = Internal.createUniqueKey(TestRun.TEST_RUN, DSL.name("test_run_pkey"), new TableField[] { TestRun.TEST_RUN.ID }, true);
    public static final UniqueKey<TestRunRecord> TEST_RUN_PUBLIC_ID_KEY = Internal.createUniqueKey(TestRun.TEST_RUN, DSL.name("test_run_public_id_key"), new TableField[] { TestRun.TEST_RUN.PUBLIC_ID }, true);
    public static final UniqueKey<TestRunAttachmentRecord> TEST_RUN_ATTACHMENT_PKEY = Internal.createUniqueKey(TestRunAttachment.TEST_RUN_ATTACHMENT, DSL.name("test_run_attachment_pkey"), new TableField[] { TestRunAttachment.TEST_RUN_ATTACHMENT.ID }, true);
    public static final UniqueKey<TestRunSystemAttributesRecord> TEST_RUN_SYSTEM_ATTRIBUTES_PKEY = Internal.createUniqueKey(TestRunSystemAttributes.TEST_RUN_SYSTEM_ATTRIBUTES, DSL.name("test_run_system_attributes_pkey"), new TableField[] { TestRunSystemAttributes.TEST_RUN_SYSTEM_ATTRIBUTES.TEST_RUN_PUBLIC_ID }, true);
    public static final UniqueKey<TestSuiteRecord> TEST_SUITE_PKEY = Internal.createUniqueKey(TestSuite.TEST_SUITE, DSL.name("test_suite_pkey"), new TableField[] { TestSuite.TEST_SUITE.ID }, true);
    public static final UniqueKey<TestSuiteGroupRecord> TEST_SUITE_GROUP_PKEY = Internal.createUniqueKey(TestSuiteGroup.TEST_SUITE_GROUP, DSL.name("test_suite_group_pkey"), new TableField[] { TestSuiteGroup.TEST_SUITE_GROUP.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CodeCoverageFileRecord, CodeCoverageGroupRecord> CODE_COVERAGE_FILE__CODE_COVERAGE_FILE_CODE_COVERAGE_GROUP_ID_FKEY = Internal.createForeignKey(CodeCoverageFile.CODE_COVERAGE_FILE, DSL.name("code_coverage_file_code_coverage_group_id_fkey"), new TableField[] { CodeCoverageFile.CODE_COVERAGE_FILE.CODE_COVERAGE_GROUP_ID }, Keys.CODE_COVERAGE_GROUP_PKEY, new TableField[] { CodeCoverageGroup.CODE_COVERAGE_GROUP.ID }, true);
    public static final ForeignKey<CodeCoverageFileRecord, CodeCoverageRunRecord> CODE_COVERAGE_FILE__CODE_COVERAGE_FILE_CODE_COVERAGE_RUN_ID_FKEY = Internal.createForeignKey(CodeCoverageFile.CODE_COVERAGE_FILE, DSL.name("code_coverage_file_code_coverage_run_id_fkey"), new TableField[] { CodeCoverageFile.CODE_COVERAGE_FILE.CODE_COVERAGE_RUN_ID }, Keys.CODE_COVERAGE_RUN_PKEY, new TableField[] { CodeCoverageRun.CODE_COVERAGE_RUN.ID }, true);
    public static final ForeignKey<CodeCoverageFileRecord, CodeCoverageStatsRecord> CODE_COVERAGE_FILE__CODE_COVERAGE_FILE_STATS_ID_FKEY = Internal.createForeignKey(CodeCoverageFile.CODE_COVERAGE_FILE, DSL.name("code_coverage_file_stats_id_fkey"), new TableField[] { CodeCoverageFile.CODE_COVERAGE_FILE.STATS_ID }, Keys.CODE_COVERAGE_STATS_PKEY, new TableField[] { CodeCoverageStats.CODE_COVERAGE_STATS.ID }, true);
    public static final ForeignKey<CodeCoverageGroupRecord, CodeCoverageRunRecord> CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_CODE_COVERAGE_RUN_ID_FKEY = Internal.createForeignKey(CodeCoverageGroup.CODE_COVERAGE_GROUP, DSL.name("code_coverage_group_code_coverage_run_id_fkey"), new TableField[] { CodeCoverageGroup.CODE_COVERAGE_GROUP.CODE_COVERAGE_RUN_ID }, Keys.CODE_COVERAGE_RUN_PKEY, new TableField[] { CodeCoverageRun.CODE_COVERAGE_RUN.ID }, true);
    public static final ForeignKey<CodeCoverageGroupRecord, CodeCoverageStatsRecord> CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_STATS_ID_FKEY = Internal.createForeignKey(CodeCoverageGroup.CODE_COVERAGE_GROUP, DSL.name("code_coverage_group_stats_id_fkey"), new TableField[] { CodeCoverageGroup.CODE_COVERAGE_GROUP.STATS_ID }, Keys.CODE_COVERAGE_STATS_PKEY, new TableField[] { CodeCoverageStats.CODE_COVERAGE_STATS.ID }, true);
    public static final ForeignKey<CodeCoverageStatsRecord, CodeCoverageRunRecord> CODE_COVERAGE_STATS__CODE_COVERAGE_STATS_CODE_COVERAGE_RUN_ID_FKEY = Internal.createForeignKey(CodeCoverageStats.CODE_COVERAGE_STATS, DSL.name("code_coverage_stats_code_coverage_run_id_fkey"), new TableField[] { CodeCoverageStats.CODE_COVERAGE_STATS.CODE_COVERAGE_RUN_ID }, Keys.CODE_COVERAGE_RUN_PKEY, new TableField[] { CodeCoverageRun.CODE_COVERAGE_RUN.ID }, true);
    public static final ForeignKey<GitMetadataRecord, TestRunRecord> GIT_METADATA__GIT_METADATA_TEST_RUN_ID_FKEY = Internal.createForeignKey(GitMetadata.GIT_METADATA, DSL.name("git_metadata_test_run_id_fkey"), new TableField[] { GitMetadata.GIT_METADATA.TEST_RUN_ID }, Keys.TEST_RUN_PKEY, new TableField[] { TestRun.TEST_RUN.ID }, true);
    public static final ForeignKey<PerformanceResultsRecord, TestRunRecord> PERFORMANCE_RESULTS__PERFORMANCE_RESULTS_TEST_RUN_ID_FKEY = Internal.createForeignKey(PerformanceResults.PERFORMANCE_RESULTS, DSL.name("performance_results_test_run_id_fkey"), new TableField[] { PerformanceResults.PERFORMANCE_RESULTS.TEST_RUN_ID }, Keys.TEST_RUN_PKEY, new TableField[] { TestRun.TEST_RUN.ID }, true);
    public static final ForeignKey<ProcessingFailureRecord, TestRunRecord> PROCESSING_FAILURE__PROCESSING_FAILURE_PUBLIC_ID_FKEY = Internal.createForeignKey(ProcessingFailure.PROCESSING_FAILURE, DSL.name("processing_failure_public_id_fkey"), new TableField[] { ProcessingFailure.PROCESSING_FAILURE.PUBLIC_ID }, Keys.TEST_RUN_PUBLIC_ID_KEY, new TableField[] { TestRun.TEST_RUN.PUBLIC_ID }, true);
    public static final ForeignKey<ResultsMetadataRecord, TestRunRecord> RESULTS_METADATA__RESULTS_METADATA_TEST_RUN_ID_FKEY = Internal.createForeignKey(ResultsMetadata.RESULTS_METADATA, DSL.name("results_metadata_test_run_id_fkey"), new TableField[] { ResultsMetadata.RESULTS_METADATA.TEST_RUN_ID }, Keys.TEST_RUN_PKEY, new TableField[] { TestRun.TEST_RUN.ID }, true);
    public static final ForeignKey<ResultsProcessingFailureRecord, ResultsProcessingRecord> RESULTS_PROCESSING_FAILURE__RESULTS_PROCESSING_FAILURE_PUBLIC_ID_FKEY = Internal.createForeignKey(ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE, DSL.name("results_processing_failure_public_id_fkey"), new TableField[] { ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE.PUBLIC_ID }, Keys.RESULTS_PROCESSING_PKEY, new TableField[] { ResultsProcessing.RESULTS_PROCESSING.PUBLIC_ID }, true);
    public static final ForeignKey<TestCaseRecord, TestSuiteRecord> TEST_CASE__TEST_CASE_TEST_SUITE_ID_FKEY = Internal.createForeignKey(TestCase.TEST_CASE, DSL.name("test_case_test_suite_id_fkey"), new TableField[] { TestCase.TEST_CASE.TEST_SUITE_ID }, Keys.TEST_SUITE_PKEY, new TableField[] { TestSuite.TEST_SUITE.ID }, true);
    public static final ForeignKey<TestFailureRecord, TestCaseRecord> TEST_FAILURE__TEST_FAILURE_TEST_CASE_ID_FKEY = Internal.createForeignKey(TestFailure.TEST_FAILURE, DSL.name("test_failure_test_case_id_fkey"), new TableField[] { TestFailure.TEST_FAILURE.TEST_CASE_ID }, Keys.TEST_CASE_PKEY, new TableField[] { TestCase.TEST_CASE.ID }, true);
    public static final ForeignKey<TestRunSystemAttributesRecord, TestRunRecord> TEST_RUN_SYSTEM_ATTRIBUTES__TEST_RUN_SYSTEM_ATTRIBUTES_TEST_RUN_PUBLIC_ID_FKEY = Internal.createForeignKey(TestRunSystemAttributes.TEST_RUN_SYSTEM_ATTRIBUTES, DSL.name("test_run_system_attributes_test_run_public_id_fkey"), new TableField[] { TestRunSystemAttributes.TEST_RUN_SYSTEM_ATTRIBUTES.TEST_RUN_PUBLIC_ID }, Keys.TEST_RUN_PUBLIC_ID_KEY, new TableField[] { TestRun.TEST_RUN.PUBLIC_ID }, true);
    public static final ForeignKey<TestSuiteRecord, TestRunRecord> TEST_SUITE__TEST_SUITE_TEST_RUN_ID_FKEY = Internal.createForeignKey(TestSuite.TEST_SUITE, DSL.name("test_suite_test_run_id_fkey"), new TableField[] { TestSuite.TEST_SUITE.TEST_RUN_ID }, Keys.TEST_RUN_PKEY, new TableField[] { TestRun.TEST_RUN.ID }, true);
    public static final ForeignKey<TestSuiteRecord, TestSuiteGroupRecord> TEST_SUITE__TEST_SUITE_TEST_SUITE_GROUP_ID_FKEY = Internal.createForeignKey(TestSuite.TEST_SUITE, DSL.name("test_suite_test_suite_group_id_fkey"), new TableField[] { TestSuite.TEST_SUITE.TEST_SUITE_GROUP_ID }, Keys.TEST_SUITE_GROUP_PKEY, new TableField[] { TestSuiteGroup.TEST_SUITE_GROUP.ID }, true);
    public static final ForeignKey<TestSuiteGroupRecord, TestRunRecord> TEST_SUITE_GROUP__TEST_SUITE_GROUP_TEST_RUN_ID_FKEY = Internal.createForeignKey(TestSuiteGroup.TEST_SUITE_GROUP, DSL.name("test_suite_group_test_run_id_fkey"), new TableField[] { TestSuiteGroup.TEST_SUITE_GROUP.TEST_RUN_ID }, Keys.TEST_RUN_PKEY, new TableField[] { TestRun.TEST_RUN.ID }, true);
}

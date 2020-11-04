/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

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


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.code_coverage_file</code>.
     */
    public final CodeCoverageFile CODE_COVERAGE_FILE = CodeCoverageFile.CODE_COVERAGE_FILE;

    /**
     * The table <code>public.code_coverage_group</code>.
     */
    public final CodeCoverageGroup CODE_COVERAGE_GROUP = CodeCoverageGroup.CODE_COVERAGE_GROUP;

    /**
     * The table <code>public.code_coverage_run</code>.
     */
    public final CodeCoverageRun CODE_COVERAGE_RUN = CodeCoverageRun.CODE_COVERAGE_RUN;

    /**
     * The table <code>public.code_coverage_stats</code>.
     */
    public final CodeCoverageStats CODE_COVERAGE_STATS = CodeCoverageStats.CODE_COVERAGE_STATS;

    /**
     * The table <code>public.git_metadata</code>.
     */
    public final GitMetadata GIT_METADATA = GitMetadata.GIT_METADATA;

    /**
     * The table <code>public.git_repository</code>.
     */
    public final GitRepository GIT_REPOSITORY = GitRepository.GIT_REPOSITORY;

    /**
     * The table <code>public.performance_results</code>.
     */
    public final PerformanceResults PERFORMANCE_RESULTS = PerformanceResults.PERFORMANCE_RESULTS;

    /**
     * The table <code>public.processing_failure</code>.
     */
    public final ProcessingFailure PROCESSING_FAILURE = ProcessingFailure.PROCESSING_FAILURE;

    /**
     * The table <code>public.results_metadata</code>.
     */
    public final ResultsMetadata RESULTS_METADATA = ResultsMetadata.RESULTS_METADATA;

    /**
     * The table <code>public.results_processing</code>.
     */
    public final ResultsProcessing RESULTS_PROCESSING = ResultsProcessing.RESULTS_PROCESSING;

    /**
     * The table <code>public.results_processing_failure</code>.
     */
    public final ResultsProcessingFailure RESULTS_PROCESSING_FAILURE = ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE;

    /**
     * The table <code>public.test_case</code>.
     */
    public final TestCase TEST_CASE = TestCase.TEST_CASE;

    /**
     * The table <code>public.test_failure</code>.
     */
    public final TestFailure TEST_FAILURE = TestFailure.TEST_FAILURE;

    /**
     * The table <code>public.test_run</code>.
     */
    public final TestRun TEST_RUN = TestRun.TEST_RUN;

    /**
     * The table <code>public.test_run_attachment</code>.
     */
    public final TestRunAttachment TEST_RUN_ATTACHMENT = TestRunAttachment.TEST_RUN_ATTACHMENT;

    /**
     * The table <code>public.test_run_system_attributes</code>.
     */
    public final TestRunSystemAttributes TEST_RUN_SYSTEM_ATTRIBUTES = TestRunSystemAttributes.TEST_RUN_SYSTEM_ATTRIBUTES;

    /**
     * The table <code>public.test_suite</code>.
     */
    public final TestSuite TEST_SUITE = TestSuite.TEST_SUITE;

    /**
     * The table <code>public.test_suite_group</code>.
     */
    public final TestSuiteGroup TEST_SUITE_GROUP = TestSuiteGroup.TEST_SUITE_GROUP;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.<Sequence<?>>asList(
            Sequences.CODE_COVERAGE_FILE_ID_SEQ,
            Sequences.CODE_COVERAGE_GROUP_ID_SEQ,
            Sequences.CODE_COVERAGE_RUN_ID_SEQ,
            Sequences.CODE_COVERAGE_STATS_ID_SEQ,
            Sequences.GIT_METADATA_ID_SEQ,
            Sequences.PERFORMANCE_RESULTS_ID_SEQ,
            Sequences.PROCESSING_FAILURE_ID_SEQ,
            Sequences.RESULTS_METADATA_ID_SEQ,
            Sequences.TEST_CASE_ID_SEQ,
            Sequences.TEST_CASE_TEST_SUITE_ID_SEQ,
            Sequences.TEST_FAILURE_ID_SEQ,
            Sequences.TEST_FAILURE_TEST_CASE_ID_SEQ,
            Sequences.TEST_RUN_ATTACHMENT_ID_SEQ,
            Sequences.TEST_RUN_ID_SEQ,
            Sequences.TEST_SUITE_GROUP_ID_SEQ,
            Sequences.TEST_SUITE_ID_SEQ,
            Sequences.TEST_SUITE_TEST_RUN_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            CodeCoverageFile.CODE_COVERAGE_FILE,
            CodeCoverageGroup.CODE_COVERAGE_GROUP,
            CodeCoverageRun.CODE_COVERAGE_RUN,
            CodeCoverageStats.CODE_COVERAGE_STATS,
            GitMetadata.GIT_METADATA,
            GitRepository.GIT_REPOSITORY,
            PerformanceResults.PERFORMANCE_RESULTS,
            ProcessingFailure.PROCESSING_FAILURE,
            ResultsMetadata.RESULTS_METADATA,
            ResultsProcessing.RESULTS_PROCESSING,
            ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE,
            TestCase.TEST_CASE,
            TestFailure.TEST_FAILURE,
            TestRun.TEST_RUN,
            TestRunAttachment.TEST_RUN_ATTACHMENT,
            TestRunSystemAttributes.TEST_RUN_SYSTEM_ATTRIBUTES,
            TestSuite.TEST_SUITE,
            TestSuiteGroup.TEST_SUITE_GROUP);
    }
}

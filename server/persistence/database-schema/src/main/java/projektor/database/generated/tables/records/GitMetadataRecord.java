/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import projektor.database.generated.tables.GitMetadata;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GitMetadataRecord extends UpdatableRecordImpl<GitMetadataRecord> implements Record7<Long, Long, String, Boolean, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.git_metadata.id</code>.
     */
    public GitMetadataRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.git_metadata.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.git_metadata.test_run_id</code>.
     */
    public GitMetadataRecord setTestRunId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.git_metadata.test_run_id</code>.
     */
    public Long getTestRunId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.git_metadata.repo_name</code>.
     */
    public GitMetadataRecord setRepoName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.git_metadata.repo_name</code>.
     */
    public String getRepoName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.git_metadata.is_main_branch</code>.
     */
    public GitMetadataRecord setIsMainBranch(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.git_metadata.is_main_branch</code>.
     */
    public Boolean getIsMainBranch() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.git_metadata.branch_name</code>.
     */
    public GitMetadataRecord setBranchName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.git_metadata.branch_name</code>.
     */
    public String getBranchName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.git_metadata.org_name</code>.
     */
    public GitMetadataRecord setOrgName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.git_metadata.org_name</code>.
     */
    public String getOrgName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.git_metadata.project_name</code>.
     */
    public GitMetadataRecord setProjectName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.git_metadata.project_name</code>.
     */
    public String getProjectName() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, String, Boolean, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, String, Boolean, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return GitMetadata.GIT_METADATA.ID;
    }

    @Override
    public Field<Long> field2() {
        return GitMetadata.GIT_METADATA.TEST_RUN_ID;
    }

    @Override
    public Field<String> field3() {
        return GitMetadata.GIT_METADATA.REPO_NAME;
    }

    @Override
    public Field<Boolean> field4() {
        return GitMetadata.GIT_METADATA.IS_MAIN_BRANCH;
    }

    @Override
    public Field<String> field5() {
        return GitMetadata.GIT_METADATA.BRANCH_NAME;
    }

    @Override
    public Field<String> field6() {
        return GitMetadata.GIT_METADATA.ORG_NAME;
    }

    @Override
    public Field<String> field7() {
        return GitMetadata.GIT_METADATA.PROJECT_NAME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getTestRunId();
    }

    @Override
    public String component3() {
        return getRepoName();
    }

    @Override
    public Boolean component4() {
        return getIsMainBranch();
    }

    @Override
    public String component5() {
        return getBranchName();
    }

    @Override
    public String component6() {
        return getOrgName();
    }

    @Override
    public String component7() {
        return getProjectName();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getTestRunId();
    }

    @Override
    public String value3() {
        return getRepoName();
    }

    @Override
    public Boolean value4() {
        return getIsMainBranch();
    }

    @Override
    public String value5() {
        return getBranchName();
    }

    @Override
    public String value6() {
        return getOrgName();
    }

    @Override
    public String value7() {
        return getProjectName();
    }

    @Override
    public GitMetadataRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public GitMetadataRecord value2(Long value) {
        setTestRunId(value);
        return this;
    }

    @Override
    public GitMetadataRecord value3(String value) {
        setRepoName(value);
        return this;
    }

    @Override
    public GitMetadataRecord value4(Boolean value) {
        setIsMainBranch(value);
        return this;
    }

    @Override
    public GitMetadataRecord value5(String value) {
        setBranchName(value);
        return this;
    }

    @Override
    public GitMetadataRecord value6(String value) {
        setOrgName(value);
        return this;
    }

    @Override
    public GitMetadataRecord value7(String value) {
        setProjectName(value);
        return this;
    }

    @Override
    public GitMetadataRecord values(Long value1, Long value2, String value3, Boolean value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GitMetadataRecord
     */
    public GitMetadataRecord() {
        super(GitMetadata.GIT_METADATA);
    }

    /**
     * Create a detached, initialised GitMetadataRecord
     */
    public GitMetadataRecord(Long id, Long testRunId, String repoName, Boolean isMainBranch, String branchName, String orgName, String projectName) {
        super(GitMetadata.GIT_METADATA);

        setId(id);
        setTestRunId(testRunId);
        setRepoName(repoName);
        setIsMainBranch(isMainBranch);
        setBranchName(branchName);
        setOrgName(orgName);
        setProjectName(projectName);
    }
}

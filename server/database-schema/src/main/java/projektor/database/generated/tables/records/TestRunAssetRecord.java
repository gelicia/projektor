/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import projektor.database.generated.tables.TestRunAsset;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRunAssetRecord extends UpdatableRecordImpl<TestRunAssetRecord> implements Record5<Long, Long, String, String, Long> {

    private static final long serialVersionUID = -240958816;

    /**
     * Setter for <code>public.test_run_asset.id</code>.
     */
    public TestRunAssetRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run_asset.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.test_run_asset.test_run_id</code>.
     */
    public TestRunAssetRecord setTestRunId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run_asset.test_run_id</code>.
     */
    public Long getTestRunId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.test_run_asset.file_name</code>.
     */
    public TestRunAssetRecord setFileName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run_asset.file_name</code>.
     */
    public String getFileName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.test_run_asset.bucket_name</code>.
     */
    public TestRunAssetRecord setBucketName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run_asset.bucket_name</code>.
     */
    public String getBucketName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.test_run_asset.file_size</code>.
     */
    public TestRunAssetRecord setFileSize(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run_asset.file_size</code>.
     */
    public Long getFileSize() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, String, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, String, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TestRunAsset.TEST_RUN_ASSET.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TestRunAsset.TEST_RUN_ASSET.TEST_RUN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TestRunAsset.TEST_RUN_ASSET.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TestRunAsset.TEST_RUN_ASSET.BUCKET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return TestRunAsset.TEST_RUN_ASSET.FILE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getTestRunId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBucketName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getFileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTestRunId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBucketName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getFileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunAssetRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunAssetRecord value2(Long value) {
        setTestRunId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunAssetRecord value3(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunAssetRecord value4(String value) {
        setBucketName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunAssetRecord value5(Long value) {
        setFileSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunAssetRecord values(Long value1, Long value2, String value3, String value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestRunAssetRecord
     */
    public TestRunAssetRecord() {
        super(TestRunAsset.TEST_RUN_ASSET);
    }

    /**
     * Create a detached, initialised TestRunAssetRecord
     */
    public TestRunAssetRecord(Long id, Long testRunId, String fileName, String bucketName, Long fileSize) {
        super(TestRunAsset.TEST_RUN_ASSET);

        set(0, id);
        set(1, testRunId);
        set(2, fileName);
        set(3, bucketName);
        set(4, fileSize);
    }
}

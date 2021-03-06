/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import projektor.database.generated.tables.ResultsProcessingFailure;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResultsProcessingFailureRecord extends UpdatableRecordImpl<ResultsProcessingFailureRecord> implements Record3<String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.results_processing_failure.public_id</code>.
     */
    public ResultsProcessingFailureRecord setPublicId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.results_processing_failure.public_id</code>.
     */
    public String getPublicId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.results_processing_failure.body</code>.
     */
    public ResultsProcessingFailureRecord setBody(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.results_processing_failure.body</code>.
     */
    public String getBody() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.results_processing_failure.created_timestamp</code>.
     */
    public ResultsProcessingFailureRecord setCreatedTimestamp(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.results_processing_failure.created_timestamp</code>.
     */
    public LocalDateTime getCreatedTimestamp() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, LocalDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE.PUBLIC_ID;
    }

    @Override
    public Field<String> field2() {
        return ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE.BODY;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE.CREATED_TIMESTAMP;
    }

    @Override
    public String component1() {
        return getPublicId();
    }

    @Override
    public String component2() {
        return getBody();
    }

    @Override
    public LocalDateTime component3() {
        return getCreatedTimestamp();
    }

    @Override
    public String value1() {
        return getPublicId();
    }

    @Override
    public String value2() {
        return getBody();
    }

    @Override
    public LocalDateTime value3() {
        return getCreatedTimestamp();
    }

    @Override
    public ResultsProcessingFailureRecord value1(String value) {
        setPublicId(value);
        return this;
    }

    @Override
    public ResultsProcessingFailureRecord value2(String value) {
        setBody(value);
        return this;
    }

    @Override
    public ResultsProcessingFailureRecord value3(LocalDateTime value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public ResultsProcessingFailureRecord values(String value1, String value2, LocalDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResultsProcessingFailureRecord
     */
    public ResultsProcessingFailureRecord() {
        super(ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE);
    }

    /**
     * Create a detached, initialised ResultsProcessingFailureRecord
     */
    public ResultsProcessingFailureRecord(String publicId, String body, LocalDateTime createdTimestamp) {
        super(ResultsProcessingFailure.RESULTS_PROCESSING_FAILURE);

        setPublicId(publicId);
        setBody(body);
        setCreatedTimestamp(createdTimestamp);
    }
}

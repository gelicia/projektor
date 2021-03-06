/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import projektor.database.generated.tables.ProcessingFailure;
import projektor.database.generated.tables.records.ProcessingFailureRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcessingFailureDao extends DAOImpl<ProcessingFailureRecord, projektor.database.generated.tables.pojos.ProcessingFailure, Long> {

    /**
     * Create a new ProcessingFailureDao without any configuration
     */
    public ProcessingFailureDao() {
        super(ProcessingFailure.PROCESSING_FAILURE, projektor.database.generated.tables.pojos.ProcessingFailure.class);
    }

    /**
     * Create a new ProcessingFailureDao with an attached configuration
     */
    public ProcessingFailureDao(Configuration configuration) {
        super(ProcessingFailure.PROCESSING_FAILURE, projektor.database.generated.tables.pojos.ProcessingFailure.class, configuration);
    }

    @Override
    public Long getId(projektor.database.generated.tables.pojos.ProcessingFailure object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(ProcessingFailure.PROCESSING_FAILURE.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchById(Long... values) {
        return fetch(ProcessingFailure.PROCESSING_FAILURE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projektor.database.generated.tables.pojos.ProcessingFailure fetchOneById(Long value) {
        return fetchOne(ProcessingFailure.PROCESSING_FAILURE.ID, value);
    }

    /**
     * Fetch records that have <code>public_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchRangeOfPublicId(String lowerInclusive, String upperInclusive) {
        return fetchRange(ProcessingFailure.PROCESSING_FAILURE.PUBLIC_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>public_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchByPublicId(String... values) {
        return fetch(ProcessingFailure.PROCESSING_FAILURE.PUBLIC_ID, values);
    }

    /**
     * Fetch records that have <code>body BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchRangeOfBody(String lowerInclusive, String upperInclusive) {
        return fetchRange(ProcessingFailure.PROCESSING_FAILURE.BODY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>body IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchByBody(String... values) {
        return fetch(ProcessingFailure.PROCESSING_FAILURE.BODY, values);
    }

    /**
     * Fetch records that have <code>failure BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchRangeOfFailure(String lowerInclusive, String upperInclusive) {
        return fetchRange(ProcessingFailure.PROCESSING_FAILURE.FAILURE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>failure IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchByFailure(String... values) {
        return fetch(ProcessingFailure.PROCESSING_FAILURE.FAILURE, values);
    }

    /**
     * Fetch records that have <code>body_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchRangeOfBodyType(String lowerInclusive, String upperInclusive) {
        return fetchRange(ProcessingFailure.PROCESSING_FAILURE.BODY_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>body_type IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchByBodyType(String... values) {
        return fetch(ProcessingFailure.PROCESSING_FAILURE.BODY_TYPE, values);
    }

    /**
     * Fetch records that have <code>created_timestamp BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchRangeOfCreatedTimestamp(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ProcessingFailure.PROCESSING_FAILURE.CREATED_TIMESTAMP, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_timestamp IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.ProcessingFailure> fetchByCreatedTimestamp(LocalDateTime... values) {
        return fetch(ProcessingFailure.PROCESSING_FAILURE.CREATED_TIMESTAMP, values);
    }
}

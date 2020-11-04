/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import java.math.BigDecimal;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import projektor.database.generated.tables.PerformanceResults;
import projektor.database.generated.tables.records.PerformanceResultsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PerformanceResultsDao extends DAOImpl<PerformanceResultsRecord, projektor.database.generated.tables.pojos.PerformanceResults, Long> {

    /**
     * Create a new PerformanceResultsDao without any configuration
     */
    public PerformanceResultsDao() {
        super(PerformanceResults.PERFORMANCE_RESULTS, projektor.database.generated.tables.pojos.PerformanceResults.class);
    }

    /**
     * Create a new PerformanceResultsDao with an attached configuration
     */
    public PerformanceResultsDao(Configuration configuration) {
        super(PerformanceResults.PERFORMANCE_RESULTS, projektor.database.generated.tables.pojos.PerformanceResults.class, configuration);
    }

    @Override
    public Long getId(projektor.database.generated.tables.pojos.PerformanceResults object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PerformanceResults.PERFORMANCE_RESULTS.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchById(Long... values) {
        return fetch(PerformanceResults.PERFORMANCE_RESULTS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projektor.database.generated.tables.pojos.PerformanceResults fetchOneById(Long value) {
        return fetchOne(PerformanceResults.PERFORMANCE_RESULTS.ID, value);
    }

    /**
     * Fetch records that have <code>test_run_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchRangeOfTestRunId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PerformanceResults.PERFORMANCE_RESULTS.TEST_RUN_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_run_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchByTestRunId(Long... values) {
        return fetch(PerformanceResults.PERFORMANCE_RESULTS.TEST_RUN_ID, values);
    }

    /**
     * Fetch records that have <code>test_run_public_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchRangeOfTestRunPublicId(String lowerInclusive, String upperInclusive) {
        return fetchRange(PerformanceResults.PERFORMANCE_RESULTS.TEST_RUN_PUBLIC_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>test_run_public_id IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchByTestRunPublicId(String... values) {
        return fetch(PerformanceResults.PERFORMANCE_RESULTS.TEST_RUN_PUBLIC_ID, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(PerformanceResults.PERFORMANCE_RESULTS.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchByName(String... values) {
        return fetch(PerformanceResults.PERFORMANCE_RESULTS.NAME, values);
    }

    /**
     * Fetch records that have <code>request_count BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchRangeOfRequestCount(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(PerformanceResults.PERFORMANCE_RESULTS.REQUEST_COUNT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>request_count IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchByRequestCount(Long... values) {
        return fetch(PerformanceResults.PERFORMANCE_RESULTS.REQUEST_COUNT, values);
    }

    /**
     * Fetch records that have <code>requests_per_second BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchRangeOfRequestsPerSecond(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(PerformanceResults.PERFORMANCE_RESULTS.REQUESTS_PER_SECOND, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>requests_per_second IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchByRequestsPerSecond(BigDecimal... values) {
        return fetch(PerformanceResults.PERFORMANCE_RESULTS.REQUESTS_PER_SECOND, values);
    }

    /**
     * Fetch records that have <code>average BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchRangeOfAverage(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(PerformanceResults.PERFORMANCE_RESULTS.AVERAGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>average IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchByAverage(BigDecimal... values) {
        return fetch(PerformanceResults.PERFORMANCE_RESULTS.AVERAGE, values);
    }

    /**
     * Fetch records that have <code>maximum BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchRangeOfMaximum(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(PerformanceResults.PERFORMANCE_RESULTS.MAXIMUM, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>maximum IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchByMaximum(BigDecimal... values) {
        return fetch(PerformanceResults.PERFORMANCE_RESULTS.MAXIMUM, values);
    }

    /**
     * Fetch records that have <code>p95 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchRangeOfP95(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(PerformanceResults.PERFORMANCE_RESULTS.P95, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>p95 IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.PerformanceResults> fetchByP95(BigDecimal... values) {
        return fetch(PerformanceResults.PERFORMANCE_RESULTS.P95, values);
    }
}

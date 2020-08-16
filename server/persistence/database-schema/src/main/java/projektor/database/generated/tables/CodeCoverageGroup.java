/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import projektor.database.generated.Indexes;
import projektor.database.generated.Keys;
import projektor.database.generated.Public;
import projektor.database.generated.tables.records.CodeCoverageGroupRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CodeCoverageGroup extends TableImpl<CodeCoverageGroupRecord> {

    private static final long serialVersionUID = 881914504;

    /**
     * The reference instance of <code>public.code_coverage_group</code>
     */
    public static final CodeCoverageGroup CODE_COVERAGE_GROUP = new CodeCoverageGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CodeCoverageGroupRecord> getRecordType() {
        return CodeCoverageGroupRecord.class;
    }

    /**
     * The column <code>public.code_coverage_group.id</code>.
     */
    public final TableField<CodeCoverageGroupRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('code_coverage_group_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.code_coverage_group.code_coverage_run_id</code>.
     */
    public final TableField<CodeCoverageGroupRecord, Long> CODE_COVERAGE_RUN_ID = createField(DSL.name("code_coverage_run_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.code_coverage_group.name</code>.
     */
    public final TableField<CodeCoverageGroupRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.code_coverage_group.stats_id</code>.
     */
    public final TableField<CodeCoverageGroupRecord, Long> STATS_ID = createField(DSL.name("stats_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.code_coverage_group</code> table reference
     */
    public CodeCoverageGroup() {
        this(DSL.name("code_coverage_group"), null);
    }

    /**
     * Create an aliased <code>public.code_coverage_group</code> table reference
     */
    public CodeCoverageGroup(String alias) {
        this(DSL.name(alias), CODE_COVERAGE_GROUP);
    }

    /**
     * Create an aliased <code>public.code_coverage_group</code> table reference
     */
    public CodeCoverageGroup(Name alias) {
        this(alias, CODE_COVERAGE_GROUP);
    }

    private CodeCoverageGroup(Name alias, Table<CodeCoverageGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private CodeCoverageGroup(Name alias, Table<CodeCoverageGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> CodeCoverageGroup(Table<O> child, ForeignKey<O, CodeCoverageGroupRecord> key) {
        super(child, key, CODE_COVERAGE_GROUP);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CODE_COVERAGE_GROUP_CODE_COVERAGE_RUN_ID_IDX);
    }

    @Override
    public Identity<CodeCoverageGroupRecord, Long> getIdentity() {
        return Keys.IDENTITY_CODE_COVERAGE_GROUP;
    }

    @Override
    public UniqueKey<CodeCoverageGroupRecord> getPrimaryKey() {
        return Keys.CODE_COVERAGE_GROUP_PKEY;
    }

    @Override
    public List<UniqueKey<CodeCoverageGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<CodeCoverageGroupRecord>>asList(Keys.CODE_COVERAGE_GROUP_PKEY);
    }

    @Override
    public List<ForeignKey<CodeCoverageGroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CodeCoverageGroupRecord, ?>>asList(Keys.CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_CODE_COVERAGE_RUN_ID_FKEY, Keys.CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_STATS_ID_FKEY);
    }

    public CodeCoverageRun codeCoverageRun() {
        return new CodeCoverageRun(this, Keys.CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_CODE_COVERAGE_RUN_ID_FKEY);
    }

    public CodeCoverageStats codeCoverageStats() {
        return new CodeCoverageStats(this, Keys.CODE_COVERAGE_GROUP__CODE_COVERAGE_GROUP_STATS_ID_FKEY);
    }

    @Override
    public CodeCoverageGroup as(String alias) {
        return new CodeCoverageGroup(DSL.name(alias), this);
    }

    @Override
    public CodeCoverageGroup as(Name alias) {
        return new CodeCoverageGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CodeCoverageGroup rename(String name) {
        return new CodeCoverageGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CodeCoverageGroup rename(Name name) {
        return new CodeCoverageGroup(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
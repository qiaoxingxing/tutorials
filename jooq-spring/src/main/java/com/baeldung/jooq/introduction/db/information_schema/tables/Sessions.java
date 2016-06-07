/**
 * This class is generated by jOOQ
 */
package com.baeldung.jooq.introduction.db.information_schema.tables;


import com.baeldung.jooq.introduction.db.information_schema.InformationSchema;
import com.baeldung.jooq.introduction.db.information_schema.tables.records.SessionsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sessions extends TableImpl<SessionsRecord> {

	private static final long serialVersionUID = -975884629;

	/**
	 * The reference instance of <code>INFORMATION_SCHEMA.SESSIONS</code>
	 */
	public static final Sessions SESSIONS = new Sessions();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SessionsRecord> getRecordType() {
		return SessionsRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.ID</code>.
	 */
	public final TableField<SessionsRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.USER_NAME</code>.
	 */
	public final TableField<SessionsRecord, String> USER_NAME = createField("USER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.SESSION_START</code>.
	 */
	public final TableField<SessionsRecord, String> SESSION_START = createField("SESSION_START", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT</code>.
	 */
	public final TableField<SessionsRecord, String> STATEMENT = createField("STATEMENT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT_START</code>.
	 */
	public final TableField<SessionsRecord, String> STATEMENT_START = createField("STATEMENT_START", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.CONTAINS_UNCOMMITTED</code>.
	 */
	public final TableField<SessionsRecord, String> CONTAINS_UNCOMMITTED = createField("CONTAINS_UNCOMMITTED", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
	 */
	public Sessions() {
		this("SESSIONS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
	 */
	public Sessions(String alias) {
		this(alias, SESSIONS);
	}

	private Sessions(String alias, Table<SessionsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Sessions(String alias, Table<SessionsRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Sessions as(String alias) {
		return new Sessions(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Sessions rename(String name) {
		return new Sessions(name, null);
	}
}

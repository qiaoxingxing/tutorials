/**
 * This class is generated by jOOQ
 */
package com.baeldung.jooq.introduction.db.information_schema.tables.records;


import com.baeldung.jooq.introduction.db.information_schema.tables.FunctionAliases;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


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
public class FunctionAliasesRecord extends TableRecordImpl<FunctionAliasesRecord> implements Record12<String, String, String, String, String, Integer, String, Integer, Short, String, Integer, String> {

	private static final long serialVersionUID = -788602015;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_CATALOG</code>.
	 */
	public void setAliasCatalog(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_CATALOG</code>.
	 */
	public String getAliasCatalog() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_SCHEMA</code>.
	 */
	public void setAliasSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_SCHEMA</code>.
	 */
	public String getAliasSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_NAME</code>.
	 */
	public void setAliasName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_NAME</code>.
	 */
	public String getAliasName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_CLASS</code>.
	 */
	public void setJavaClass(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_CLASS</code>.
	 */
	public String getJavaClass() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_METHOD</code>.
	 */
	public void setJavaMethod(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_METHOD</code>.
	 */
	public String getJavaMethod() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.DATA_TYPE</code>.
	 */
	public void setDataType(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.DATA_TYPE</code>.
	 */
	public Integer getDataType() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.TYPE_NAME</code>.
	 */
	public void setTypeName(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.TYPE_NAME</code>.
	 */
	public String getTypeName() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.COLUMN_COUNT</code>.
	 */
	public void setColumnCount(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.COLUMN_COUNT</code>.
	 */
	public Integer getColumnCount() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.RETURNS_RESULT</code>.
	 */
	public void setReturnsResult(Short value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.RETURNS_RESULT</code>.
	 */
	public Short getReturnsResult() {
		return (Short) getValue(8);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.REMARKS</code>.
	 */
	public void setRemarks(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.REMARKS</code>.
	 */
	public String getRemarks() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.SOURCE</code>.
	 */
	public void setSource(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.SOURCE</code>.
	 */
	public String getSource() {
		return (String) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, String, String, String, String, Integer, String, Integer, Short, String, Integer, String> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, String, String, String, String, Integer, String, Integer, Short, String, Integer, String> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return FunctionAliases.FUNCTION_ALIASES.ALIAS_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return FunctionAliases.FUNCTION_ALIASES.ALIAS_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return FunctionAliases.FUNCTION_ALIASES.ALIAS_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return FunctionAliases.FUNCTION_ALIASES.JAVA_CLASS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return FunctionAliases.FUNCTION_ALIASES.JAVA_METHOD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return FunctionAliases.FUNCTION_ALIASES.DATA_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return FunctionAliases.FUNCTION_ALIASES.TYPE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return FunctionAliases.FUNCTION_ALIASES.COLUMN_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field9() {
		return FunctionAliases.FUNCTION_ALIASES.RETURNS_RESULT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return FunctionAliases.FUNCTION_ALIASES.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return FunctionAliases.FUNCTION_ALIASES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return FunctionAliases.FUNCTION_ALIASES.SOURCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getAliasCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getAliasSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getAliasName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getJavaClass();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getJavaMethod();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getDataType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getTypeName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getColumnCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value9() {
		return getReturnsResult();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getRemarks();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getSource();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value1(String value) {
		setAliasCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value2(String value) {
		setAliasSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value3(String value) {
		setAliasName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value4(String value) {
		setJavaClass(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value5(String value) {
		setJavaMethod(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value6(Integer value) {
		setDataType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value7(String value) {
		setTypeName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value8(Integer value) {
		setColumnCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value9(Short value) {
		setReturnsResult(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value10(String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value11(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord value12(String value) {
		setSource(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionAliasesRecord values(String value1, String value2, String value3, String value4, String value5, Integer value6, String value7, Integer value8, Short value9, String value10, Integer value11, String value12) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FunctionAliasesRecord
	 */
	public FunctionAliasesRecord() {
		super(FunctionAliases.FUNCTION_ALIASES);
	}

	/**
	 * Create a detached, initialised FunctionAliasesRecord
	 */
	public FunctionAliasesRecord(String aliasCatalog, String aliasSchema, String aliasName, String javaClass, String javaMethod, Integer dataType, String typeName, Integer columnCount, Short returnsResult, String remarks, Integer id, String source) {
		super(FunctionAliases.FUNCTION_ALIASES);

		setValue(0, aliasCatalog);
		setValue(1, aliasSchema);
		setValue(2, aliasName);
		setValue(3, javaClass);
		setValue(4, javaMethod);
		setValue(5, dataType);
		setValue(6, typeName);
		setValue(7, columnCount);
		setValue(8, returnsResult);
		setValue(9, remarks);
		setValue(10, id);
		setValue(11, source);
	}
}

/*
 * Copyright (c) 2008, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package com.amazon.redshift.core;

import com.amazon.redshift.util.RedshiftObject;

import java.sql.SQLException;
import java.util.Iterator;

public interface TypeInfo {
  void addCoreType(String rsTypeName, Integer oid, Integer sqlType, String javaClass,
      Integer arrayOid);

  void addDataType(String type, Class<? extends RedshiftObject> klass) throws SQLException;

  /**
   * Look up the SQL typecode for a given type oid.
   *
   * @param oid the type's OID
   * @return the SQL type code (a constant from {@link java.sql.Types}) for the type
   * @throws SQLException if an error occurs when retrieving sql type
   */
  int getSQLType(int oid) throws SQLException;

  /**
   * Look up the SQL typecode for a given Redshift type name.
   *
   * @param rsTypeName the server type name to look up
   * @return the SQL type code (a constant from {@link java.sql.Types}) for the type
   * @throws SQLException if an error occurs when retrieving sql type
   */
  int getSQLType(String rsTypeName) throws SQLException;

  /**
   * Look up the oid for a given redshift type name. This is the inverse of
   * {@link #getRSType(int)}.
   *
   * @param rsTypeName the server type name to look up
   * @return the type's OID, or 0 if unknown
   * @throws SQLException if an error occurs when retrieving RS type
   */
  int getRSType(String rsTypeName) throws SQLException;

  /**
   * Look up the redshift type name for a given oid. This is the inverse of
   * {@link #getRSType(String)}.
   *
   * @param oid the type's OID
   * @return the server type name for that OID or null if unknown
   * @throws SQLException if an error occurs when retrieving RS type
   */
  String getRSType(int oid) throws SQLException;

  /**
   * Look up the oid of an array's base type given the array's type oid.
   *
   * @param oid the array type's OID
   * @return the base type's OID, or 0 if unknown
   * @throws SQLException if an error occurs when retrieving array element
   */
  int getRSArrayElement(int oid) throws SQLException;

  /**
   * Determine the oid of the given base Redshift type's array type.
   *
   * @param elementTypeName the base type's
   * @return the array type's OID, or 0 if unknown
   * @throws SQLException if an error occurs when retrieving array type
   */
  int getRSArrayType(String elementTypeName) throws SQLException;

  /**
   * Determine the delimiter for the elements of the given array type oid.
   *
   * @param oid the array type's OID
   * @return the base type's array type delimiter
   * @throws SQLException if an error occurs when retrieving array delimiter
   */
  char getArrayDelimiter(int oid) throws SQLException;

  Iterator<String> getRSTypeNamesWithSQLTypes();

  Class<? extends RedshiftObject> getRSobject(String type);

  String getJavaClass(int oid) throws SQLException;

  String getTypeForAlias(String alias);

  int getPrecision(int oid, int typmod);

  int getScale(int oid, int typmod);

  boolean isCaseSensitive(int oid);

  boolean isSigned(int oid);

  int getDisplaySize(int oid, int typmod);

  int getMaximumPrecision(int oid);

  boolean requiresQuoting(int oid) throws SQLException;

  /**
   * Returns true if particular sqlType requires quoting.
   * This method is used internally by the driver, so it might disappear without notice.
   *
   * @param sqlType sql type as in java.sql.Types
   * @return true if the type requires quoting
   * @throws SQLException if something goes wrong
   */
  boolean requiresQuotingSqlType(int sqlType) throws SQLException;
}

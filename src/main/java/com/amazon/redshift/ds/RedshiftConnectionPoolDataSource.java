/*
 * Copyright (c) 2004, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package com.amazon.redshift.ds;

import com.amazon.redshift.ds.common.BaseDataSource;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.SQLException;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.PooledConnection;

/**
 * Redshift implementation of ConnectionPoolDataSource. The app server or middleware vendor should
 * provide a DataSource implementation that takes advantage of this ConnectionPoolDataSource. If
 * not, you can use the Redshift implementation known as PoolingDataSource, but that should only
 * be used if your server or middleware vendor does not provide their own. Why? The server may want
 * to reuse the same Connection across all EJBs requesting a Connection within the same Transaction,
 * or provide other similar advanced features.
 *
 * <p>
 * In any case, in order to use this ConnectionPoolDataSource, you must set the property
 * databaseName. The settings for serverName, portNumber, user, and password are optional. Note:
 * these properties are declared in the superclass.
 * </p>
 *
 * <p>
 * This implementation supports JDK 1.3 and higher.
 * </p>
 *
 * @author Aaron Mulder (ammulder@chariotsolutions.com)
 */
public class RedshiftConnectionPoolDataSource extends BaseDataSource
    implements DataSource, ConnectionPoolDataSource, Serializable {
  private boolean defaultAutoCommit = true;

  /**
   * Gets a description of this DataSource.
   */
  public String getDescription() {
    return "ConnectionPoolDataSource from " + com.amazon.redshift.util.DriverInfo.DRIVER_FULL_NAME;
  }

  /**
   * Gets a connection which may be pooled by the app server or middleware implementation of
   * DataSource.
   *
   * @throws java.sql.SQLException Occurs when the physical database connection cannot be
   *         established.
   */
  public PooledConnection getPooledConnection() throws SQLException {
    return new RedshiftPooledConnection(getConnection(), defaultAutoCommit);
  }

  /**
   * Gets a connection which may be pooled by the app server or middleware implementation of
   * DataSource.
   *
   * @throws java.sql.SQLException Occurs when the physical database connection cannot be
   *         established.
   */
  public PooledConnection getPooledConnection(String user, String password) throws SQLException {
    return new RedshiftPooledConnection(getConnection(user, password), defaultAutoCommit);
  }

  /**
   * Gets whether connections supplied by this pool will have autoCommit turned on by default. The
   * default value is {@code true}, so that autoCommit will be turned on by default.
   *
   * @return true if connections supplied by this pool will have autoCommit
   */
  public boolean isDefaultAutoCommit() {
    return defaultAutoCommit;
  }

  /**
   * Sets whether connections supplied by this pool will have autoCommit turned on by default. The
   * default value is {@code true}, so that autoCommit will be turned on by default.
   *
   * @param defaultAutoCommit whether connections supplied by this pool will have autoCommit
   */
  public void setDefaultAutoCommit(boolean defaultAutoCommit) {
    this.defaultAutoCommit = defaultAutoCommit;
  }

  private void writeObject(ObjectOutputStream out) throws IOException {
    writeBaseObject(out);
    out.writeBoolean(defaultAutoCommit);
  }

  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    readBaseObject(in);
    defaultAutoCommit = in.readBoolean();
  }
  
  public boolean isWrapperFor(Class<?> iface) throws SQLException {
    return iface.isAssignableFrom(getClass());
  }

  public <T> T unwrap(Class<T> iface) throws SQLException {
    if (iface.isAssignableFrom(getClass())) {
      return iface.cast(this);
    }
    throw new SQLException("Cannot unwrap to " + iface.getName());
  }
}

/*
 * Copyright (c) 2009, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package com.amazon.redshift.xa;

import com.amazon.redshift.util.Base64;

import java.util.Arrays;

import javax.transaction.xa.Xid;

class RecoveredXid implements Xid {
  int formatId;
  byte[] globalTransactionId;
  byte[] branchQualifier;

  public int getFormatId() {
    return formatId;
  }

  public byte[] getGlobalTransactionId() {
    return globalTransactionId;
  }

  public byte[] getBranchQualifier() {
    return branchQualifier;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(branchQualifier);
    result = prime * result + formatId;
    result = prime * result + Arrays.hashCode(globalTransactionId);
    return result;
  }

  public boolean equals(Object o) {
    if (o == this) {
      // optimization for the common case.
      return true;
    }

    if (!(o instanceof Xid)) {
      return false;
    }

    Xid other = (Xid) o;
    if (other.getFormatId() != formatId) {
      return false;
    }
    if (!Arrays.equals(globalTransactionId, other.getGlobalTransactionId())) {
      return false;
    }
    if (!Arrays.equals(branchQualifier, other.getBranchQualifier())) {
      return false;
    }

    return true;
  }

  /**
   * This is for debugging purposes only.
   */
  public String toString() {
    return xidToString(this);
  }

  // --- Routines for converting xid to string and back.

  static String xidToString(Xid xid) {
    return xid.getFormatId() + "_"
        + Base64.encodeBytes(xid.getGlobalTransactionId(), Base64.DONT_BREAK_LINES) + "_"
        + Base64.encodeBytes(xid.getBranchQualifier(), Base64.DONT_BREAK_LINES);
  }

  /**
   * @return recovered xid, or null if s does not represent a valid xid encoded by the driver.
   */
  static Xid stringToXid(String s) {
    RecoveredXid xid = new RecoveredXid();

    int a = s.indexOf("_");
    int b = s.lastIndexOf("_");

    if (a == b) {
      // this also catches the case a == b == -1.
      return null;
    }

    try {
      xid.formatId = Integer.parseInt(s.substring(0, a));
      xid.globalTransactionId = Base64.decode(s.substring(a + 1, b));
      xid.branchQualifier = Base64.decode(s.substring(b + 1));

      if (xid.globalTransactionId == null || xid.branchQualifier == null) {
        return null;
      }
    } catch (Exception ex) {
      return null; // Doesn't seem to be an xid generated by this driver.
    }

    return xid;
  }
}

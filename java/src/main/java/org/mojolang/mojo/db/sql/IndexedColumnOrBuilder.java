// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/indexed_column.proto

package org.mojolang.mojo.db.sql;

public interface IndexedColumnOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.IndexedColumn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string mojo_core_string = 1;</code>
   * @return Whether the mojoCoreString field is set.
   */
  boolean hasMojoCoreString();
  /**
   * <code>string mojo_core_string = 1;</code>
   * @return The mojoCoreString.
   */
  java.lang.String getMojoCoreString();
  /**
   * <code>string mojo_core_string = 1;</code>
   * @return The bytes for mojoCoreString.
   */
  com.google.protobuf.ByteString
      getMojoCoreStringBytes();

  /**
   * <code>.mojo.db.sql.Expression expression = 2;</code>
   * @return Whether the expression field is set.
   */
  boolean hasExpression();
  /**
   * <code>.mojo.db.sql.Expression expression = 2;</code>
   * @return The expression.
   */
  org.mojolang.mojo.db.sql.Expression getExpression();
  /**
   * <code>.mojo.db.sql.Expression expression = 2;</code>
   */
  org.mojolang.mojo.db.sql.ExpressionOrBuilder getExpressionOrBuilder();

  /**
   * <code>.mojo.db.sql.CollateClause collate = 5;</code>
   * @return Whether the collate field is set.
   */
  boolean hasCollate();
  /**
   * <code>.mojo.db.sql.CollateClause collate = 5;</code>
   * @return The collate.
   */
  org.mojolang.mojo.db.sql.CollateClause getCollate();
  /**
   * <code>.mojo.db.sql.CollateClause collate = 5;</code>
   */
  org.mojolang.mojo.db.sql.CollateClauseOrBuilder getCollateOrBuilder();

  /**
   * <code>.mojo.db.sql.Order order = 6;</code>
   * @return The enum numeric value on the wire for order.
   */
  int getOrderValue();
  /**
   * <code>.mojo.db.sql.Order order = 6;</code>
   * @return The order.
   */
  org.mojolang.mojo.db.sql.Order getOrder();

  public org.mojolang.mojo.db.sql.IndexedColumn.NameCase getNameCase();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/indexed_columns.proto

package org.mojo-lang.mojo.db.sql;

public interface IndexedColumnsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.IndexedColumns)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string string = 1;</code>
   * @return Whether the string field is set.
   */
  boolean hasString();
  /**
   * <code>string string = 1;</code>
   * @return The string.
   */
  java.lang.String getString();
  /**
   * <code>string string = 1;</code>
   * @return The bytes for string.
   */
  com.google.protobuf.ByteString
      getStringBytes();

  /**
   * <code>.mojo.db.sql.Expression expression = 2;</code>
   * @return Whether the expression field is set.
   */
  boolean hasExpression();
  /**
   * <code>.mojo.db.sql.Expression expression = 2;</code>
   * @return The expression.
   */
  org.mojo-lang.mojo.db.sql.Expression getExpression();
  /**
   * <code>.mojo.db.sql.Expression expression = 2;</code>
   */
  org.mojo-lang.mojo.db.sql.ExpressionOrBuilder getExpressionOrBuilder();

  /**
   * <code>.mojo.db.sql.CollateClause collate = 5;</code>
   * @return Whether the collate field is set.
   */
  boolean hasCollate();
  /**
   * <code>.mojo.db.sql.CollateClause collate = 5;</code>
   * @return The collate.
   */
  org.mojo-lang.mojo.db.sql.CollateClause getCollate();
  /**
   * <code>.mojo.db.sql.CollateClause collate = 5;</code>
   */
  org.mojo-lang.mojo.db.sql.CollateClauseOrBuilder getCollateOrBuilder();

  /**
   * <code>.mojo.db.sql.Order order = 6;</code>
   * @return The enum numeric value on the wire for order.
   */
  int getOrderValue();
  /**
   * <code>.mojo.db.sql.Order order = 6;</code>
   * @return The order.
   */
  org.mojo-lang.mojo.db.sql.Order getOrder();

  public org.mojo-lang.mojo.db.sql.IndexedColumns.NameCase getNameCase();
}

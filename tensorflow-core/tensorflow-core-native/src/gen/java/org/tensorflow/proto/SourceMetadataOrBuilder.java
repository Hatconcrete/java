// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/event.proto

package org.tensorflow.proto;

public interface SourceMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.SourceMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Low level name of the summary writer, such as
   * `tensorflow.core.util.events_writer`.
   * </pre>
   *
   * <code>string writer = 1;</code>
   * @return The writer.
   */
  java.lang.String getWriter();
  /**
   * <pre>
   * Low level name of the summary writer, such as
   * `tensorflow.core.util.events_writer`.
   * </pre>
   *
   * <code>string writer = 1;</code>
   * @return The bytes for writer.
   */
  com.google.protobuf.ByteString
      getWriterBytes();
}
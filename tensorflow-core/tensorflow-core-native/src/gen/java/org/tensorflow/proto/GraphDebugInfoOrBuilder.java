// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/graph_debug_info.proto

package org.tensorflow.proto;

public interface GraphDebugInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphDebugInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This stores all the source code file names and can be indexed by the
   * `file_index`.
   * </pre>
   *
   * <code>repeated string files = 1;</code>
   * @return A list containing the files.
   */
  java.util.List<java.lang.String>
      getFilesList();
  /**
   * <pre>
   * This stores all the source code file names and can be indexed by the
   * `file_index`.
   * </pre>
   *
   * <code>repeated string files = 1;</code>
   * @return The count of files.
   */
  int getFilesCount();
  /**
   * <pre>
   * This stores all the source code file names and can be indexed by the
   * `file_index`.
   * </pre>
   *
   * <code>repeated string files = 1;</code>
   * @param index The index of the element to return.
   * @return The files at the given index.
   */
  java.lang.String getFiles(int index);
  /**
   * <pre>
   * This stores all the source code file names and can be indexed by the
   * `file_index`.
   * </pre>
   *
   * <code>repeated string files = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the files at the given index.
   */
  com.google.protobuf.ByteString
      getFilesBytes(int index);

  /**
   * <pre>
   * Stack traces and frames are uniqueified during construction. These maps
   * index from the unique id for a frame/trace to the value.
   * </pre>
   *
   * <code>map&lt;fixed64, .tensorflow.GraphDebugInfo.FileLineCol&gt; frames_by_id = 4;</code>
   */
  int getFramesByIdCount();
  /**
   * <pre>
   * Stack traces and frames are uniqueified during construction. These maps
   * index from the unique id for a frame/trace to the value.
   * </pre>
   *
   * <code>map&lt;fixed64, .tensorflow.GraphDebugInfo.FileLineCol&gt; frames_by_id = 4;</code>
   */
  boolean containsFramesById(
      long key);
  /**
   * Use {@link #getFramesByIdMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, org.tensorflow.proto.GraphDebugInfo.FileLineCol>
  getFramesById();
  /**
   * <pre>
   * Stack traces and frames are uniqueified during construction. These maps
   * index from the unique id for a frame/trace to the value.
   * </pre>
   *
   * <code>map&lt;fixed64, .tensorflow.GraphDebugInfo.FileLineCol&gt; frames_by_id = 4;</code>
   */
  java.util.Map<java.lang.Long, org.tensorflow.proto.GraphDebugInfo.FileLineCol>
  getFramesByIdMap();
  /**
   * <pre>
   * Stack traces and frames are uniqueified during construction. These maps
   * index from the unique id for a frame/trace to the value.
   * </pre>
   *
   * <code>map&lt;fixed64, .tensorflow.GraphDebugInfo.FileLineCol&gt; frames_by_id = 4;</code>
   */

  /* nullable */
org.tensorflow.proto.GraphDebugInfo.FileLineCol getFramesByIdOrDefault(
      long key,
      /* nullable */
org.tensorflow.proto.GraphDebugInfo.FileLineCol defaultValue);
  /**
   * <pre>
   * Stack traces and frames are uniqueified during construction. These maps
   * index from the unique id for a frame/trace to the value.
   * </pre>
   *
   * <code>map&lt;fixed64, .tensorflow.GraphDebugInfo.FileLineCol&gt; frames_by_id = 4;</code>
   */

  org.tensorflow.proto.GraphDebugInfo.FileLineCol getFramesByIdOrThrow(
      long key);

  /**
   * <code>map&lt;fixed64, .tensorflow.GraphDebugInfo.StackTrace&gt; traces_by_id = 6;</code>
   */
  int getTracesByIdCount();
  /**
   * <code>map&lt;fixed64, .tensorflow.GraphDebugInfo.StackTrace&gt; traces_by_id = 6;</code>
   */
  boolean containsTracesById(
      long key);
  /**
   * Use {@link #getTracesByIdMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, org.tensorflow.proto.GraphDebugInfo.StackTrace>
  getTracesById();
  /**
   * <code>map&lt;fixed64, .tensorflow.GraphDebugInfo.StackTrace&gt; traces_by_id = 6;</code>
   */
  java.util.Map<java.lang.Long, org.tensorflow.proto.GraphDebugInfo.StackTrace>
  getTracesByIdMap();
  /**
   * <code>map&lt;fixed64, .tensorflow.GraphDebugInfo.StackTrace&gt; traces_by_id = 6;</code>
   */

  /* nullable */
org.tensorflow.proto.GraphDebugInfo.StackTrace getTracesByIdOrDefault(
      long key,
      /* nullable */
org.tensorflow.proto.GraphDebugInfo.StackTrace defaultValue);
  /**
   * <code>map&lt;fixed64, .tensorflow.GraphDebugInfo.StackTrace&gt; traces_by_id = 6;</code>
   */

  org.tensorflow.proto.GraphDebugInfo.StackTrace getTracesByIdOrThrow(
      long key);

  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.GraphDebugInfo.StackTrace&gt; traces = 2;</code>
   */
  int getTracesCount();
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.GraphDebugInfo.StackTrace&gt; traces = 2;</code>
   */
  boolean containsTraces(
      java.lang.String key);
  /**
   * Use {@link #getTracesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.proto.GraphDebugInfo.StackTrace>
  getTraces();
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.GraphDebugInfo.StackTrace&gt; traces = 2;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.proto.GraphDebugInfo.StackTrace>
  getTracesMap();
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.GraphDebugInfo.StackTrace&gt; traces = 2;</code>
   */

  /* nullable */
org.tensorflow.proto.GraphDebugInfo.StackTrace getTracesOrDefault(
      java.lang.String key,
      /* nullable */
org.tensorflow.proto.GraphDebugInfo.StackTrace defaultValue);
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.GraphDebugInfo.StackTrace&gt; traces = 2;</code>
   */

  org.tensorflow.proto.GraphDebugInfo.StackTrace getTracesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * This maps a node name to a trace id contained in `traces_by_id`.
   * The map key is a mangling of the containing function and op name with
   * syntax:
   *   op.name '&#64;' func_name
   * For ops in the top-level graph, the func_name is the empty string and hence
   * the `&#64;` may be ommitted.
   * Note that op names are restricted to a small number of characters which
   * exclude '&#64;', making it impossible to collide keys of this form. Function
   * names accept a much wider set of characters.
   * It would be preferable to avoid mangling and use a tuple key of (op.name,
   * func_name), but this is not supported with protocol buffers.
   * </pre>
   *
   * <code>map&lt;string, fixed64&gt; name_to_trace_id = 5;</code>
   */
  int getNameToTraceIdCount();
  /**
   * <pre>
   * This maps a node name to a trace id contained in `traces_by_id`.
   * The map key is a mangling of the containing function and op name with
   * syntax:
   *   op.name '&#64;' func_name
   * For ops in the top-level graph, the func_name is the empty string and hence
   * the `&#64;` may be ommitted.
   * Note that op names are restricted to a small number of characters which
   * exclude '&#64;', making it impossible to collide keys of this form. Function
   * names accept a much wider set of characters.
   * It would be preferable to avoid mangling and use a tuple key of (op.name,
   * func_name), but this is not supported with protocol buffers.
   * </pre>
   *
   * <code>map&lt;string, fixed64&gt; name_to_trace_id = 5;</code>
   */
  boolean containsNameToTraceId(
      java.lang.String key);
  /**
   * Use {@link #getNameToTraceIdMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getNameToTraceId();
  /**
   * <pre>
   * This maps a node name to a trace id contained in `traces_by_id`.
   * The map key is a mangling of the containing function and op name with
   * syntax:
   *   op.name '&#64;' func_name
   * For ops in the top-level graph, the func_name is the empty string and hence
   * the `&#64;` may be ommitted.
   * Note that op names are restricted to a small number of characters which
   * exclude '&#64;', making it impossible to collide keys of this form. Function
   * names accept a much wider set of characters.
   * It would be preferable to avoid mangling and use a tuple key of (op.name,
   * func_name), but this is not supported with protocol buffers.
   * </pre>
   *
   * <code>map&lt;string, fixed64&gt; name_to_trace_id = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getNameToTraceIdMap();
  /**
   * <pre>
   * This maps a node name to a trace id contained in `traces_by_id`.
   * The map key is a mangling of the containing function and op name with
   * syntax:
   *   op.name '&#64;' func_name
   * For ops in the top-level graph, the func_name is the empty string and hence
   * the `&#64;` may be ommitted.
   * Note that op names are restricted to a small number of characters which
   * exclude '&#64;', making it impossible to collide keys of this form. Function
   * names accept a much wider set of characters.
   * It would be preferable to avoid mangling and use a tuple key of (op.name,
   * func_name), but this is not supported with protocol buffers.
   * </pre>
   *
   * <code>map&lt;string, fixed64&gt; name_to_trace_id = 5;</code>
   */

  long getNameToTraceIdOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <pre>
   * This maps a node name to a trace id contained in `traces_by_id`.
   * The map key is a mangling of the containing function and op name with
   * syntax:
   *   op.name '&#64;' func_name
   * For ops in the top-level graph, the func_name is the empty string and hence
   * the `&#64;` may be ommitted.
   * Note that op names are restricted to a small number of characters which
   * exclude '&#64;', making it impossible to collide keys of this form. Function
   * names accept a much wider set of characters.
   * It would be preferable to avoid mangling and use a tuple key of (op.name,
   * func_name), but this is not supported with protocol buffers.
   * </pre>
   *
   * <code>map&lt;string, fixed64&gt; name_to_trace_id = 5;</code>
   */

  long getNameToTraceIdOrThrow(
      java.lang.String key);
}
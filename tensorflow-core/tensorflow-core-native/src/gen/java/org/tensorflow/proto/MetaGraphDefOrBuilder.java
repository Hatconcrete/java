// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/meta_graph.proto

package org.tensorflow.proto;

public interface MetaGraphDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.MetaGraphDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tensorflow.MetaGraphDef.MetaInfoDef meta_info_def = 1;</code>
   * @return Whether the metaInfoDef field is set.
   */
  boolean hasMetaInfoDef();
  /**
   * <code>.tensorflow.MetaGraphDef.MetaInfoDef meta_info_def = 1;</code>
   * @return The metaInfoDef.
   */
  org.tensorflow.proto.MetaGraphDef.MetaInfoDef getMetaInfoDef();
  /**
   * <code>.tensorflow.MetaGraphDef.MetaInfoDef meta_info_def = 1;</code>
   */
  org.tensorflow.proto.MetaGraphDef.MetaInfoDefOrBuilder getMetaInfoDefOrBuilder();

  /**
   * <pre>
   * GraphDef.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 2;</code>
   * @return Whether the graphDef field is set.
   */
  boolean hasGraphDef();
  /**
   * <pre>
   * GraphDef.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 2;</code>
   * @return The graphDef.
   */
  org.tensorflow.proto.GraphDef getGraphDef();
  /**
   * <pre>
   * GraphDef.
   * </pre>
   *
   * <code>.tensorflow.GraphDef graph_def = 2;</code>
   */
  org.tensorflow.proto.GraphDefOrBuilder getGraphDefOrBuilder();

  /**
   * <pre>
   * SaverDef.
   * </pre>
   *
   * <code>.tensorflow.SaverDef saver_def = 3;</code>
   * @return Whether the saverDef field is set.
   */
  boolean hasSaverDef();
  /**
   * <pre>
   * SaverDef.
   * </pre>
   *
   * <code>.tensorflow.SaverDef saver_def = 3;</code>
   * @return The saverDef.
   */
  org.tensorflow.proto.SaverDef getSaverDef();
  /**
   * <pre>
   * SaverDef.
   * </pre>
   *
   * <code>.tensorflow.SaverDef saver_def = 3;</code>
   */
  org.tensorflow.proto.SaverDefOrBuilder getSaverDefOrBuilder();

  /**
   * <pre>
   * collection_def: Map from collection name to collections.
   * See CollectionDef section for details.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.CollectionDef&gt; collection_def = 4;</code>
   */
  int getCollectionDefCount();
  /**
   * <pre>
   * collection_def: Map from collection name to collections.
   * See CollectionDef section for details.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.CollectionDef&gt; collection_def = 4;</code>
   */
  boolean containsCollectionDef(
      java.lang.String key);
  /**
   * Use {@link #getCollectionDefMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.proto.CollectionDef>
  getCollectionDef();
  /**
   * <pre>
   * collection_def: Map from collection name to collections.
   * See CollectionDef section for details.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.CollectionDef&gt; collection_def = 4;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.proto.CollectionDef>
  getCollectionDefMap();
  /**
   * <pre>
   * collection_def: Map from collection name to collections.
   * See CollectionDef section for details.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.CollectionDef&gt; collection_def = 4;</code>
   */

  /* nullable */
org.tensorflow.proto.CollectionDef getCollectionDefOrDefault(
      java.lang.String key,
      /* nullable */
org.tensorflow.proto.CollectionDef defaultValue);
  /**
   * <pre>
   * collection_def: Map from collection name to collections.
   * See CollectionDef section for details.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.CollectionDef&gt; collection_def = 4;</code>
   */

  org.tensorflow.proto.CollectionDef getCollectionDefOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * signature_def: Map from user supplied key for a signature to a single
   * SignatureDef.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SignatureDef&gt; signature_def = 5;</code>
   */
  int getSignatureDefCount();
  /**
   * <pre>
   * signature_def: Map from user supplied key for a signature to a single
   * SignatureDef.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SignatureDef&gt; signature_def = 5;</code>
   */
  boolean containsSignatureDef(
      java.lang.String key);
  /**
   * Use {@link #getSignatureDefMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.proto.SignatureDef>
  getSignatureDef();
  /**
   * <pre>
   * signature_def: Map from user supplied key for a signature to a single
   * SignatureDef.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SignatureDef&gt; signature_def = 5;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.proto.SignatureDef>
  getSignatureDefMap();
  /**
   * <pre>
   * signature_def: Map from user supplied key for a signature to a single
   * SignatureDef.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SignatureDef&gt; signature_def = 5;</code>
   */

  /* nullable */
org.tensorflow.proto.SignatureDef getSignatureDefOrDefault(
      java.lang.String key,
      /* nullable */
org.tensorflow.proto.SignatureDef defaultValue);
  /**
   * <pre>
   * signature_def: Map from user supplied key for a signature to a single
   * SignatureDef.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.SignatureDef&gt; signature_def = 5;</code>
   */

  org.tensorflow.proto.SignatureDef getSignatureDefOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Asset file def to be used with the defined graph.
   * </pre>
   *
   * <code>repeated .tensorflow.AssetFileDef asset_file_def = 6;</code>
   */
  java.util.List<org.tensorflow.proto.AssetFileDef> 
      getAssetFileDefList();
  /**
   * <pre>
   * Asset file def to be used with the defined graph.
   * </pre>
   *
   * <code>repeated .tensorflow.AssetFileDef asset_file_def = 6;</code>
   */
  org.tensorflow.proto.AssetFileDef getAssetFileDef(int index);
  /**
   * <pre>
   * Asset file def to be used with the defined graph.
   * </pre>
   *
   * <code>repeated .tensorflow.AssetFileDef asset_file_def = 6;</code>
   */
  int getAssetFileDefCount();
  /**
   * <pre>
   * Asset file def to be used with the defined graph.
   * </pre>
   *
   * <code>repeated .tensorflow.AssetFileDef asset_file_def = 6;</code>
   */
  java.util.List<? extends org.tensorflow.proto.AssetFileDefOrBuilder> 
      getAssetFileDefOrBuilderList();
  /**
   * <pre>
   * Asset file def to be used with the defined graph.
   * </pre>
   *
   * <code>repeated .tensorflow.AssetFileDef asset_file_def = 6;</code>
   */
  org.tensorflow.proto.AssetFileDefOrBuilder getAssetFileDefOrBuilder(
      int index);

  /**
   * <pre>
   * Extra information about the structure of functions and stateful objects.
   * </pre>
   *
   * <code>.tensorflow.SavedObjectGraph object_graph_def = 7;</code>
   * @return Whether the objectGraphDef field is set.
   */
  boolean hasObjectGraphDef();
  /**
   * <pre>
   * Extra information about the structure of functions and stateful objects.
   * </pre>
   *
   * <code>.tensorflow.SavedObjectGraph object_graph_def = 7;</code>
   * @return The objectGraphDef.
   */
  org.tensorflow.proto.SavedObjectGraphOuterClass.SavedObjectGraph getObjectGraphDef();
  /**
   * <pre>
   * Extra information about the structure of functions and stateful objects.
   * </pre>
   *
   * <code>.tensorflow.SavedObjectGraph object_graph_def = 7;</code>
   */
  org.tensorflow.proto.SavedObjectGraphOuterClass.SavedObjectGraphOrBuilder getObjectGraphDefOrBuilder();
}
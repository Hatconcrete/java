// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/model.proto

package org.tensorflow.proto.data.model;

/**
 * <pre>
 * Algorithm used for model autotuning optimization.
 * </pre>
 *
 * Protobuf enum {@code tensorflow.data.model.AutotuneAlgorithm}
 */
public enum AutotuneAlgorithm
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEFAULT = 0;</code>
   */
  DEFAULT(0),
  /**
   * <code>HILL_CLIMB = 1;</code>
   */
  HILL_CLIMB(1),
  /**
   * <code>GRADIENT_DESCENT = 2;</code>
   */
  GRADIENT_DESCENT(2),
  /**
   * <code>MAX_PARALLELISM = 3;</code>
   */
  MAX_PARALLELISM(3),
  /**
   * <code>STAGE_BASED = 4;</code>
   */
  STAGE_BASED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEFAULT = 0;</code>
   */
  public static final int DEFAULT_VALUE = 0;
  /**
   * <code>HILL_CLIMB = 1;</code>
   */
  public static final int HILL_CLIMB_VALUE = 1;
  /**
   * <code>GRADIENT_DESCENT = 2;</code>
   */
  public static final int GRADIENT_DESCENT_VALUE = 2;
  /**
   * <code>MAX_PARALLELISM = 3;</code>
   */
  public static final int MAX_PARALLELISM_VALUE = 3;
  /**
   * <code>STAGE_BASED = 4;</code>
   */
  public static final int STAGE_BASED_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AutotuneAlgorithm valueOf(int value) {
    return forNumber(value);
  }

  public static AutotuneAlgorithm forNumber(int value) {
    switch (value) {
      case 0: return DEFAULT;
      case 1: return HILL_CLIMB;
      case 2: return GRADIENT_DESCENT;
      case 3: return MAX_PARALLELISM;
      case 4: return STAGE_BASED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AutotuneAlgorithm>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AutotuneAlgorithm> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AutotuneAlgorithm>() {
          public AutotuneAlgorithm findValueByNumber(int number) {
            return AutotuneAlgorithm.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.tensorflow.proto.data.model.ModelProtos.getDescriptor().getEnumTypes().get(1);
  }

  private static final AutotuneAlgorithm[] VALUES = values();

  public static AutotuneAlgorithm valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AutotuneAlgorithm(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tensorflow.data.model.AutotuneAlgorithm)
}


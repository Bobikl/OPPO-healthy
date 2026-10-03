package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum PullUpStrategyType implements ProtocolMessageEnum {
    STRATEGY_UNKNOWN(0),
    CONSERVATIVE_BACKGROUND(1),
    BALANCED_INTERACTION(2),
    IMMEDIATE_RESPONSE(3),
    CUSTOM(4),
    UNRECOGNIZED(-1);

    public static final int BALANCED_INTERACTION_VALUE = 2;
    public static final int CONSERVATIVE_BACKGROUND_VALUE = 1;
    public static final int CUSTOM_VALUE = 4;
    public static final int IMMEDIATE_RESPONSE_VALUE = 3;
    public static final int STRATEGY_UNKNOWN_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<PullUpStrategyType> internalValueMap = new Internal.EnumLiteMap<PullUpStrategyType>() { // from class: com.oplus.pantaconnect.fusionservice.PullUpStrategyType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public PullUpStrategyType findValueByNumber(int i) {
            return PullUpStrategyType.forNumber(i);
        }
    };
    private static final PullUpStrategyType[] VALUES = values();

    PullUpStrategyType(int i) {
        this.value = i;
    }

    public static PullUpStrategyType forNumber(int i) {
        if (i == 0) {
            return STRATEGY_UNKNOWN;
        }
        if (i == 1) {
            return CONSERVATIVE_BACKGROUND;
        }
        if (i == 2) {
            return BALANCED_INTERACTION;
        }
        if (i == 3) {
            return IMMEDIATE_RESPONSE;
        }
        if (i != 4) {
            return null;
        }
        return CUSTOM;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Fusionservice.getDescriptor().getEnumTypes().get(2);
    }

    public static Internal.EnumLiteMap<PullUpStrategyType> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static PullUpStrategyType valueOf(int i) {
        return forNumber(i);
    }

    public static PullUpStrategyType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

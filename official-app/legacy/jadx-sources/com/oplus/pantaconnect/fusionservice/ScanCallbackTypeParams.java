package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum ScanCallbackTypeParams implements ProtocolMessageEnum {
    ALL_MATCHES(0),
    FIRST_MATCH(1),
    MATCH_LOST(2),
    UNRECOGNIZED(-1);

    public static final int ALL_MATCHES_VALUE = 0;
    public static final int FIRST_MATCH_VALUE = 1;
    public static final int MATCH_LOST_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap<ScanCallbackTypeParams> internalValueMap = new Internal.EnumLiteMap<ScanCallbackTypeParams>() { // from class: com.oplus.pantaconnect.fusionservice.ScanCallbackTypeParams.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ScanCallbackTypeParams findValueByNumber(int i) {
            return ScanCallbackTypeParams.forNumber(i);
        }
    };
    private static final ScanCallbackTypeParams[] VALUES = values();

    ScanCallbackTypeParams(int i) {
        this.value = i;
    }

    public static ScanCallbackTypeParams forNumber(int i) {
        if (i == 0) {
            return ALL_MATCHES;
        }
        if (i == 1) {
            return FIRST_MATCH;
        }
        if (i != 2) {
            return null;
        }
        return MATCH_LOST;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Fusionservice.getDescriptor().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<ScanCallbackTypeParams> internalGetValueMap() {
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
    public static ScanCallbackTypeParams valueOf(int i) {
        return forNumber(i);
    }

    public static ScanCallbackTypeParams valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

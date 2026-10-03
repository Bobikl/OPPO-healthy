package com.oplus.pantaconnect.discovery;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.nt5;

/* JADX INFO: loaded from: classes8.dex */
public enum InternalScanMode implements ProtocolMessageEnum {
    SCAN_MODE_LOW_POWER(0),
    SCAN_MODE_BALANCED(1),
    SCAN_MODE_LOW_LATENCY(2),
    UNRECOGNIZED(-1);

    public static final int SCAN_MODE_BALANCED_VALUE = 1;
    public static final int SCAN_MODE_LOW_LATENCY_VALUE = 2;
    public static final int SCAN_MODE_LOW_POWER_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<InternalScanMode> internalValueMap = new Internal.EnumLiteMap<InternalScanMode>() { // from class: com.oplus.pantaconnect.discovery.InternalScanMode.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalScanMode findValueByNumber(int i) {
            return InternalScanMode.forNumber(i);
        }
    };
    private static final InternalScanMode[] VALUES = values();

    InternalScanMode(int i) {
        this.value = i;
    }

    public static InternalScanMode forNumber(int i) {
        if (i == 0) {
            return SCAN_MODE_LOW_POWER;
        }
        if (i == 1) {
            return SCAN_MODE_BALANCED;
        }
        if (i != 2) {
            return null;
        }
        return SCAN_MODE_LOW_LATENCY;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return nt5.a().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<InternalScanMode> internalGetValueMap() {
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
    public static InternalScanMode valueOf(int i) {
        return forNumber(i);
    }

    public static InternalScanMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

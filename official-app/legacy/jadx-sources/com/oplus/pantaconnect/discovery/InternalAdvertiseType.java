package com.oplus.pantaconnect.discovery;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.nt5;

/* JADX INFO: loaded from: classes8.dex */
public enum InternalAdvertiseType implements ProtocolMessageEnum {
    DISCOVERY_MODEL_ID(0),
    FAST_PAIR_MODEL_ID(1),
    FAST_PAIR_ACCOUNT(2),
    FAST_PAIR_DEVICE_ID(3),
    UNRECOGNIZED(-1);

    public static final int DISCOVERY_MODEL_ID_VALUE = 0;
    public static final int FAST_PAIR_ACCOUNT_VALUE = 2;
    public static final int FAST_PAIR_DEVICE_ID_VALUE = 3;
    public static final int FAST_PAIR_MODEL_ID_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<InternalAdvertiseType> internalValueMap = new Internal.EnumLiteMap<InternalAdvertiseType>() { // from class: com.oplus.pantaconnect.discovery.InternalAdvertiseType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalAdvertiseType findValueByNumber(int i) {
            return InternalAdvertiseType.forNumber(i);
        }
    };
    private static final InternalAdvertiseType[] VALUES = values();

    InternalAdvertiseType(int i) {
        this.value = i;
    }

    public static InternalAdvertiseType forNumber(int i) {
        if (i == 0) {
            return DISCOVERY_MODEL_ID;
        }
        if (i == 1) {
            return FAST_PAIR_MODEL_ID;
        }
        if (i == 2) {
            return FAST_PAIR_ACCOUNT;
        }
        if (i != 3) {
            return null;
        }
        return FAST_PAIR_DEVICE_ID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return nt5.a().getEnumTypes().get(3);
    }

    public static Internal.EnumLiteMap<InternalAdvertiseType> internalGetValueMap() {
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
    public static InternalAdvertiseType valueOf(int i) {
        return forNumber(i);
    }

    public static InternalAdvertiseType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

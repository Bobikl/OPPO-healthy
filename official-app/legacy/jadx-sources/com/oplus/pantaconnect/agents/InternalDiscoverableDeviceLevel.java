package com.oplus.pantaconnect.agents;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum InternalDiscoverableDeviceLevel implements ProtocolMessageEnum {
    SAME_ACCOUNT_DEVICE(0),
    ALL_DEVICE(1),
    UNRECOGNIZED(-1);

    public static final int ALL_DEVICE_VALUE = 1;
    public static final int SAME_ACCOUNT_DEVICE_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<InternalDiscoverableDeviceLevel> internalValueMap = new Internal.EnumLiteMap<InternalDiscoverableDeviceLevel>() { // from class: com.oplus.pantaconnect.agents.InternalDiscoverableDeviceLevel.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public InternalDiscoverableDeviceLevel findValueByNumber(int i) {
            return InternalDiscoverableDeviceLevel.forNumber(i);
        }
    };
    private static final InternalDiscoverableDeviceLevel[] VALUES = values();

    InternalDiscoverableDeviceLevel(int i) {
        this.value = i;
    }

    public static InternalDiscoverableDeviceLevel forNumber(int i) {
        if (i == 0) {
            return SAME_ACCOUNT_DEVICE;
        }
        if (i != 1) {
            return null;
        }
        return ALL_DEVICE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Agents.getDescriptor().getEnumTypes().get(5);
    }

    public static Internal.EnumLiteMap<InternalDiscoverableDeviceLevel> internalGetValueMap() {
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
    public static InternalDiscoverableDeviceLevel valueOf(int i) {
        return forNumber(i);
    }

    public static InternalDiscoverableDeviceLevel valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

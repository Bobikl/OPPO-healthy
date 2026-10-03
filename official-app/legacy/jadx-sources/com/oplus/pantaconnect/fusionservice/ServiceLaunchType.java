package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum ServiceLaunchType implements ProtocolMessageEnum {
    START_SERVICE(0),
    START_FOREGROUND_SERVICE(1),
    BIND_SERVICE(2),
    UNRECOGNIZED(-1);

    public static final int BIND_SERVICE_VALUE = 2;
    public static final int START_FOREGROUND_SERVICE_VALUE = 1;
    public static final int START_SERVICE_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<ServiceLaunchType> internalValueMap = new Internal.EnumLiteMap<ServiceLaunchType>() { // from class: com.oplus.pantaconnect.fusionservice.ServiceLaunchType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ServiceLaunchType findValueByNumber(int i) {
            return ServiceLaunchType.forNumber(i);
        }
    };
    private static final ServiceLaunchType[] VALUES = values();

    ServiceLaunchType(int i) {
        this.value = i;
    }

    public static ServiceLaunchType forNumber(int i) {
        if (i == 0) {
            return START_SERVICE;
        }
        if (i == 1) {
            return START_FOREGROUND_SERVICE;
        }
        if (i != 2) {
            return null;
        }
        return BIND_SERVICE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Fusionservice.getDescriptor().getEnumTypes().get(1);
    }

    public static Internal.EnumLiteMap<ServiceLaunchType> internalGetValueMap() {
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
    public static ServiceLaunchType valueOf(int i) {
        return forNumber(i);
    }

    public static ServiceLaunchType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

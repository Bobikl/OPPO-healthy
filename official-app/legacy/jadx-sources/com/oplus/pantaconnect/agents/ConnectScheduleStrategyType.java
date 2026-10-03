package com.oplus.pantaconnect.agents;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum ConnectScheduleStrategyType implements ProtocolMessageEnum {
    PREEMPT(0),
    FIFO(1),
    PRIORITY(2),
    UNRECOGNIZED(-1);

    public static final int FIFO_VALUE = 1;
    public static final int PREEMPT_VALUE = 0;
    public static final int PRIORITY_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap<ConnectScheduleStrategyType> internalValueMap = new Internal.EnumLiteMap<ConnectScheduleStrategyType>() { // from class: com.oplus.pantaconnect.agents.ConnectScheduleStrategyType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ConnectScheduleStrategyType findValueByNumber(int i) {
            return ConnectScheduleStrategyType.forNumber(i);
        }
    };
    private static final ConnectScheduleStrategyType[] VALUES = values();

    ConnectScheduleStrategyType(int i) {
        this.value = i;
    }

    public static ConnectScheduleStrategyType forNumber(int i) {
        if (i == 0) {
            return PREEMPT;
        }
        if (i == 1) {
            return FIFO;
        }
        if (i != 2) {
            return null;
        }
        return PRIORITY;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Agents.getDescriptor().getEnumTypes().get(2);
    }

    public static Internal.EnumLiteMap<ConnectScheduleStrategyType> internalGetValueMap() {
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
    public static ConnectScheduleStrategyType valueOf(int i) {
        return forNumber(i);
    }

    public static ConnectScheduleStrategyType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

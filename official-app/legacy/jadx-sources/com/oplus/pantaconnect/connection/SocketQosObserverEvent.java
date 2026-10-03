package com.oplus.pantaconnect.connection;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.p1i;

/* JADX INFO: loaded from: classes8.dex */
public enum SocketQosObserverEvent implements ProtocolMessageEnum {
    EVENT_SOCKET_QOS_UNAVAILABLE(0),
    EVENT_SOCKET_QOS_AVAILABLE(1),
    UNRECOGNIZED(-1);

    public static final int EVENT_SOCKET_QOS_AVAILABLE_VALUE = 1;
    public static final int EVENT_SOCKET_QOS_UNAVAILABLE_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<SocketQosObserverEvent> internalValueMap = new Internal.EnumLiteMap<SocketQosObserverEvent>() { // from class: com.oplus.pantaconnect.connection.SocketQosObserverEvent.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SocketQosObserverEvent findValueByNumber(int i) {
            return SocketQosObserverEvent.forNumber(i);
        }
    };
    private static final SocketQosObserverEvent[] VALUES = values();

    SocketQosObserverEvent(int i) {
        this.value = i;
    }

    public static SocketQosObserverEvent forNumber(int i) {
        if (i == 0) {
            return EVENT_SOCKET_QOS_UNAVAILABLE;
        }
        if (i != 1) {
            return null;
        }
        return EVENT_SOCKET_QOS_AVAILABLE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return p1i.a().getEnumTypes().get(1);
    }

    public static Internal.EnumLiteMap<SocketQosObserverEvent> internalGetValueMap() {
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
    public static SocketQosObserverEvent valueOf(int i) {
        return forNumber(i);
    }

    public static SocketQosObserverEvent valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

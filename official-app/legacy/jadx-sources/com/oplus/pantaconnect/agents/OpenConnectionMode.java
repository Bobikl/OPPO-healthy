package com.oplus.pantaconnect.agents;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum OpenConnectionMode implements ProtocolMessageEnum {
    CONNECT_AGENT(0),
    PAIR_ONLY(1),
    CONNECT_CHANNEL_ONLY(2),
    UNRECOGNIZED(-1);

    public static final int CONNECT_AGENT_VALUE = 0;
    public static final int CONNECT_CHANNEL_ONLY_VALUE = 2;
    public static final int PAIR_ONLY_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<OpenConnectionMode> internalValueMap = new Internal.EnumLiteMap<OpenConnectionMode>() { // from class: com.oplus.pantaconnect.agents.OpenConnectionMode.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public OpenConnectionMode findValueByNumber(int i) {
            return OpenConnectionMode.forNumber(i);
        }
    };
    private static final OpenConnectionMode[] VALUES = values();

    OpenConnectionMode(int i) {
        this.value = i;
    }

    public static OpenConnectionMode forNumber(int i) {
        if (i == 0) {
            return CONNECT_AGENT;
        }
        if (i == 1) {
            return PAIR_ONLY;
        }
        if (i != 2) {
            return null;
        }
        return CONNECT_CHANNEL_ONLY;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Agents.getDescriptor().getEnumTypes().get(6);
    }

    public static Internal.EnumLiteMap<OpenConnectionMode> internalGetValueMap() {
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
    public static OpenConnectionMode valueOf(int i) {
        return forNumber(i);
    }

    public static OpenConnectionMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

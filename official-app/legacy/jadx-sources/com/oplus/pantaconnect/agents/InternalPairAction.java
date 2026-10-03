package com.oplus.pantaconnect.agents;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum InternalPairAction implements ProtocolMessageEnum {
    ACCEPT(0),
    REJECT(1),
    PIN_AUTH(2),
    CUSTOMIZE_AUTH(3),
    UNRECOGNIZED(-1);

    public static final int ACCEPT_VALUE = 0;
    public static final int CUSTOMIZE_AUTH_VALUE = 3;
    public static final int PIN_AUTH_VALUE = 2;
    public static final int REJECT_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<InternalPairAction> internalValueMap = new Internal.EnumLiteMap<InternalPairAction>() { // from class: com.oplus.pantaconnect.agents.InternalPairAction.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public InternalPairAction findValueByNumber(int i) {
            return InternalPairAction.forNumber(i);
        }
    };
    private static final InternalPairAction[] VALUES = values();

    InternalPairAction(int i) {
        this.value = i;
    }

    public static InternalPairAction forNumber(int i) {
        if (i == 0) {
            return ACCEPT;
        }
        if (i == 1) {
            return REJECT;
        }
        if (i == 2) {
            return PIN_AUTH;
        }
        if (i != 3) {
            return null;
        }
        return CUSTOMIZE_AUTH;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Agents.getDescriptor().getEnumTypes().get(7);
    }

    public static Internal.EnumLiteMap<InternalPairAction> internalGetValueMap() {
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
    public static InternalPairAction valueOf(int i) {
        return forNumber(i);
    }

    public static InternalPairAction valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

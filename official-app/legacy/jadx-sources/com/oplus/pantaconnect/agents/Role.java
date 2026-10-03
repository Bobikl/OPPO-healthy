package com.oplus.pantaconnect.agents;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum Role implements ProtocolMessageEnum {
    Provider(0),
    Seeker(1),
    UNRECOGNIZED(-1);

    public static final int Provider_VALUE = 0;
    public static final int Seeker_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<Role> internalValueMap = new Internal.EnumLiteMap<Role>() { // from class: com.oplus.pantaconnect.agents.Role.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public Role findValueByNumber(int i) {
            return Role.forNumber(i);
        }
    };
    private static final Role[] VALUES = values();

    Role(int i) {
        this.value = i;
    }

    public static Role forNumber(int i) {
        if (i == 0) {
            return Provider;
        }
        if (i != 1) {
            return null;
        }
        return Seeker;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Agents.getDescriptor().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<Role> internalGetValueMap() {
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
    public static Role valueOf(int i) {
        return forNumber(i);
    }

    public static Role valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

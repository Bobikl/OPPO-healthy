package com.oplus.pantaconnect.discovery;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.nt5;

/* JADX INFO: loaded from: classes8.dex */
public enum InternalDiscoverableServiceUserType implements ProtocolMessageEnum {
    PRIVATE(0),
    PUBLIC(1),
    UNRECOGNIZED(-1);

    public static final int PRIVATE_VALUE = 0;
    public static final int PUBLIC_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<InternalDiscoverableServiceUserType> internalValueMap = new Internal.EnumLiteMap<InternalDiscoverableServiceUserType>() { // from class: com.oplus.pantaconnect.discovery.InternalDiscoverableServiceUserType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalDiscoverableServiceUserType findValueByNumber(int i) {
            return InternalDiscoverableServiceUserType.forNumber(i);
        }
    };
    private static final InternalDiscoverableServiceUserType[] VALUES = values();

    InternalDiscoverableServiceUserType(int i) {
        this.value = i;
    }

    public static InternalDiscoverableServiceUserType forNumber(int i) {
        if (i == 0) {
            return PRIVATE;
        }
        if (i != 1) {
            return null;
        }
        return PUBLIC;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return nt5.a().getEnumTypes().get(6);
    }

    public static Internal.EnumLiteMap<InternalDiscoverableServiceUserType> internalGetValueMap() {
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
    public static InternalDiscoverableServiceUserType valueOf(int i) {
        return forNumber(i);
    }

    public static InternalDiscoverableServiceUserType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

package com.oplus.pantaconnect.discovery;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.nt5;

/* JADX INFO: loaded from: classes8.dex */
public enum InternalServiceFilter implements ProtocolMessageEnum {
    SAME_SERVICE(0),
    ANY_SERVICE(1),
    UNRECOGNIZED(-1);

    public static final int ANY_SERVICE_VALUE = 1;
    public static final int SAME_SERVICE_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap<InternalServiceFilter> internalValueMap = new Internal.EnumLiteMap<InternalServiceFilter>() { // from class: com.oplus.pantaconnect.discovery.InternalServiceFilter.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalServiceFilter findValueByNumber(int i) {
            return InternalServiceFilter.forNumber(i);
        }
    };
    private static final InternalServiceFilter[] VALUES = values();

    InternalServiceFilter(int i) {
        this.value = i;
    }

    public static InternalServiceFilter forNumber(int i) {
        if (i == 0) {
            return SAME_SERVICE;
        }
        if (i != 1) {
            return null;
        }
        return ANY_SERVICE;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return nt5.a().getEnumTypes().get(7);
    }

    public static Internal.EnumLiteMap<InternalServiceFilter> internalGetValueMap() {
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
    public static InternalServiceFilter valueOf(int i) {
        return forNumber(i);
    }

    public static InternalServiceFilter valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

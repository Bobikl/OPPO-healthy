package com.oplus.pantaconnect.discovery;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.oplus.aiunit.vision.nt5;

/* JADX INFO: loaded from: classes8.dex */
public enum InternalReconnectType implements ProtocolMessageEnum {
    DIALOG_ALL(0),
    DIALOG_RECENT(1),
    SILENT_ALL(2),
    SILENT_RECENT(3),
    DIALOG_CUSTOM(4),
    SILENT_CUSTOM(5),
    UNRECOGNIZED(-1);

    public static final int DIALOG_ALL_VALUE = 0;
    public static final int DIALOG_CUSTOM_VALUE = 4;
    public static final int DIALOG_RECENT_VALUE = 1;
    public static final int SILENT_ALL_VALUE = 2;
    public static final int SILENT_CUSTOM_VALUE = 5;
    public static final int SILENT_RECENT_VALUE = 3;
    private final int value;
    private static final Internal.EnumLiteMap<InternalReconnectType> internalValueMap = new Internal.EnumLiteMap<InternalReconnectType>() { // from class: com.oplus.pantaconnect.discovery.InternalReconnectType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalReconnectType findValueByNumber(int i) {
            return InternalReconnectType.forNumber(i);
        }
    };
    private static final InternalReconnectType[] VALUES = values();

    InternalReconnectType(int i) {
        this.value = i;
    }

    public static InternalReconnectType forNumber(int i) {
        if (i == 0) {
            return DIALOG_ALL;
        }
        if (i == 1) {
            return DIALOG_RECENT;
        }
        if (i == 2) {
            return SILENT_ALL;
        }
        if (i == 3) {
            return SILENT_RECENT;
        }
        if (i == 4) {
            return DIALOG_CUSTOM;
        }
        if (i != 5) {
            return null;
        }
        return SILENT_CUSTOM;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return nt5.a().getEnumTypes().get(4);
    }

    public static Internal.EnumLiteMap<InternalReconnectType> internalGetValueMap() {
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
    public static InternalReconnectType valueOf(int i) {
        return forNumber(i);
    }

    public static InternalReconnectType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

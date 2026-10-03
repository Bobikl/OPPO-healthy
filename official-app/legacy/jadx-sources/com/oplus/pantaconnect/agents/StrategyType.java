package com.oplus.pantaconnect.agents;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum StrategyType implements ProtocolMessageEnum {
    BLE(0),
    NSD(1),
    BASED_CONNECT(2),
    RTC(3),
    AUTO(4),
    LAN(5),
    NFC(6),
    USB_CONNECT(7),
    UNRECOGNIZED(-1);

    public static final int AUTO_VALUE = 4;
    public static final int BASED_CONNECT_VALUE = 2;
    public static final int BLE_VALUE = 0;
    public static final int LAN_VALUE = 5;
    public static final int NFC_VALUE = 6;
    public static final int NSD_VALUE = 1;
    public static final int RTC_VALUE = 3;
    public static final int USB_CONNECT_VALUE = 7;
    private final int value;
    private static final Internal.EnumLiteMap<StrategyType> internalValueMap = new Internal.EnumLiteMap<StrategyType>() { // from class: com.oplus.pantaconnect.agents.StrategyType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public StrategyType findValueByNumber(int i) {
            return StrategyType.forNumber(i);
        }
    };
    private static final StrategyType[] VALUES = values();

    StrategyType(int i) {
        this.value = i;
    }

    public static StrategyType forNumber(int i) {
        switch (i) {
            case 0:
                return BLE;
            case 1:
                return NSD;
            case 2:
                return BASED_CONNECT;
            case 3:
                return RTC;
            case 4:
                return AUTO;
            case 5:
                return LAN;
            case 6:
                return NFC;
            case 7:
                return USB_CONNECT;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Agents.getDescriptor().getEnumTypes().get(1);
    }

    public static Internal.EnumLiteMap<StrategyType> internalGetValueMap() {
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
    public static StrategyType valueOf(int i) {
        return forNumber(i);
    }

    public static StrategyType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

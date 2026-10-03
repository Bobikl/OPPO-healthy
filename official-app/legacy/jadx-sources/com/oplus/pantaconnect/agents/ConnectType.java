package com.oplus.pantaconnect.agents;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* JADX INFO: loaded from: classes8.dex */
public enum ConnectType implements ProtocolMessageEnum {
    GATT(0),
    SPP(1),
    SPP_INSECURE(2),
    P2P(3),
    WLAN(4),
    USB(5),
    RTC_CONNECT(6),
    NONE(7),
    NETWORK_SETUP(8),
    TV_WLAN_P2P(9),
    CLOUD(10),
    UNRECOGNIZED(-1);

    public static final int CLOUD_VALUE = 10;
    public static final int GATT_VALUE = 0;
    public static final int NETWORK_SETUP_VALUE = 8;
    public static final int NONE_VALUE = 7;
    public static final int P2P_VALUE = 3;
    public static final int RTC_CONNECT_VALUE = 6;
    public static final int SPP_INSECURE_VALUE = 2;
    public static final int SPP_VALUE = 1;
    public static final int TV_WLAN_P2P_VALUE = 9;
    public static final int USB_VALUE = 5;
    public static final int WLAN_VALUE = 4;
    private final int value;
    private static final Internal.EnumLiteMap<ConnectType> internalValueMap = new Internal.EnumLiteMap<ConnectType>() { // from class: com.oplus.pantaconnect.agents.ConnectType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ConnectType findValueByNumber(int i) {
            return ConnectType.forNumber(i);
        }
    };
    private static final ConnectType[] VALUES = values();

    ConnectType(int i) {
        this.value = i;
    }

    public static ConnectType forNumber(int i) {
        switch (i) {
            case 0:
                return GATT;
            case 1:
                return SPP;
            case 2:
                return SPP_INSECURE;
            case 3:
                return P2P;
            case 4:
                return WLAN;
            case 5:
                return USB;
            case 6:
                return RTC_CONNECT;
            case 7:
                return NONE;
            case 8:
                return NETWORK_SETUP;
            case 9:
                return TV_WLAN_P2P;
            case 10:
                return CLOUD;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Agents.getDescriptor().getEnumTypes().get(3);
    }

    public static Internal.EnumLiteMap<ConnectType> internalGetValueMap() {
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
    public static ConnectType valueOf(int i) {
        return forNumber(i);
    }

    public static ConnectType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}

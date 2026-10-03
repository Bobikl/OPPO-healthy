package com.heytap.wearable.btnet.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum NetworkType implements Internal.EnumLite {
    NETWORKTYPE_WIFI(0),
    NETWORKTYPE_4G(1),
    NETWORKTYPE_OTHER(2),
    UNRECOGNIZED(-1);

    public static final int NETWORKTYPE_4G_VALUE = 1;
    public static final int NETWORKTYPE_OTHER_VALUE = 2;
    public static final int NETWORKTYPE_WIFI_VALUE = 0;
    private static final Internal.EnumLiteMap<NetworkType> internalValueMap = new Internal.EnumLiteMap<NetworkType>() { // from class: com.heytap.wearable.btnet.proto.NetworkType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public NetworkType findValueByNumber(int i) {
            return NetworkType.forNumber(i);
        }
    };
    private final int value;

    public static final class NetworkTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new NetworkTypeVerifier();

        private NetworkTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return NetworkType.forNumber(i) != null;
        }
    }

    NetworkType(int i) {
        this.value = i;
    }

    public static NetworkType forNumber(int i) {
        if (i == 0) {
            return NETWORKTYPE_WIFI;
        }
        if (i == 1) {
            return NETWORKTYPE_4G;
        }
        if (i != 2) {
            return null;
        }
        return NETWORKTYPE_OTHER;
    }

    public static Internal.EnumLiteMap<NetworkType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return NetworkTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NetworkType valueOf(int i) {
        return forNumber(i);
    }
}

package com.heytap.health.linkage.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum LinkageDeviceProto$ConnectState implements Internal.EnumLite {
    CONNECTING(0),
    CONNECTED(1),
    DISCONNECTED(2),
    DISCONNECTING(3),
    UNRECOGNIZED(-1);

    public static final int CONNECTED_VALUE = 1;
    public static final int CONNECTING_VALUE = 0;
    public static final int DISCONNECTED_VALUE = 2;
    public static final int DISCONNECTING_VALUE = 3;
    private static final Internal.EnumLiteMap<LinkageDeviceProto$ConnectState> internalValueMap = new Internal.EnumLiteMap<LinkageDeviceProto$ConnectState>() { // from class: com.heytap.health.linkage.proto.LinkageDeviceProto$ConnectState.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkageDeviceProto$ConnectState findValueByNumber(int i) {
            return LinkageDeviceProto$ConnectState.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return LinkageDeviceProto$ConnectState.forNumber(i) != null;
        }
    }

    LinkageDeviceProto$ConnectState(int i) {
        this.value = i;
    }

    public static LinkageDeviceProto$ConnectState forNumber(int i) {
        if (i == 0) {
            return CONNECTING;
        }
        if (i == 1) {
            return CONNECTED;
        }
        if (i == 2) {
            return DISCONNECTED;
        }
        if (i != 3) {
            return null;
        }
        return DISCONNECTING;
    }

    public static Internal.EnumLiteMap<LinkageDeviceProto$ConnectState> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LinkageDeviceProto$ConnectState valueOf(int i) {
        return forNumber(i);
    }
}

package com.oplus.pantaconnect.sdk.connectionservice.connection;

import com.oplus.pantaconnect.sdk.connection.ConnectionType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toAdvConnectType", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AdvConnectType;", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "connectionservice_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AdvConnectTypeKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            try {
                iArr[ConnectionType.GATT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionType.P2P.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionType.SPP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConnectionType.SPP_INSECURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConnectionType.WLAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ConnectionType.USB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ConnectionType.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ConnectionType.NETWORK_SETUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ConnectionType.TV_WLAN_P2P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ConnectionType.RTC_CONNECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final AdvConnectType toAdvConnectType(@NotNull ConnectionType connectionType) {
        switch (WhenMappings.$EnumSwitchMapping$0[connectionType.ordinal()]) {
            case 1:
                return AdvConnectType.CONNECT_TYPE_BLE;
            case 2:
                return AdvConnectType.CONNECT_TYPE_P2P;
            case 3:
                return AdvConnectType.CONNECT_TYPE_BT;
            case 4:
                return AdvConnectType.CONNECT_TYPE_BT_INSECURE;
            case 5:
                return AdvConnectType.CONNECT_TYPE_LAN;
            case 6:
                return AdvConnectType.CONNECT_TYPE_UNKNOWN;
            case 7:
                return AdvConnectType.CONNECT_TYPE_UNKNOWN;
            case 8:
                return AdvConnectType.CONNECT_TYPE_NETWORK_CONNECT;
            case 9:
                return AdvConnectType.CONNECT_TYPE_P2P;
            case 10:
                return AdvConnectType.CONNECT_TYPE_UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

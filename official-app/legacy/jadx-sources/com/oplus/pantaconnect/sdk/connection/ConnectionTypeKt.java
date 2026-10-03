package com.oplus.pantaconnect.sdk.connection;

import com.oplus.pantaconnect.agents.ConnectType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toConnectType", "Lcom/oplus/pantaconnect/agents/ConnectType;", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionType;", "toConnectionType", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ConnectionTypeKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[ConnectType.values().length];
            try {
                iArr2[ConnectType.GATT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ConnectType.SPP.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ConnectType.SPP_INSECURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ConnectType.P2P.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ConnectType.WLAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ConnectType.USB.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ConnectType.RTC_CONNECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ConnectType.NETWORK_SETUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ConnectType.TV_WLAN_P2P.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final ConnectType toConnectType(@NotNull ConnectionType connectionType) {
        switch (WhenMappings.$EnumSwitchMapping$0[connectionType.ordinal()]) {
            case 1:
                return ConnectType.GATT;
            case 2:
                return ConnectType.P2P;
            case 3:
                return ConnectType.SPP;
            case 4:
                return ConnectType.SPP_INSECURE;
            case 5:
                return ConnectType.WLAN;
            case 6:
                return ConnectType.USB;
            case 7:
                return ConnectType.SPP_INSECURE;
            case 8:
                return ConnectType.NETWORK_SETUP;
            case 9:
                return ConnectType.TV_WLAN_P2P;
            case 10:
                return ConnectType.RTC_CONNECT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final ConnectionType toConnectionType(@NotNull ConnectType connectType) {
        switch (WhenMappings.$EnumSwitchMapping$1[connectType.ordinal()]) {
            case 1:
                return ConnectionType.GATT;
            case 2:
                return ConnectionType.SPP;
            case 3:
                return ConnectionType.SPP_INSECURE;
            case 4:
                return ConnectionType.P2P;
            case 5:
                return ConnectionType.WLAN;
            case 6:
                return ConnectionType.USB;
            case 7:
                return ConnectionType.RTC_CONNECT;
            case 8:
                return ConnectionType.NETWORK_SETUP;
            case 9:
                return ConnectionType.TV_WLAN_P2P;
            default:
                return ConnectionType.SPP_INSECURE;
        }
    }
}

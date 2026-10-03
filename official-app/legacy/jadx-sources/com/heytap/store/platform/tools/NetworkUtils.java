package com.heytap.store.platform.tools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresPermission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001d\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/platform/tools/NetworkUtils;", "", "()V", "getActiveNetworkInfo", "Landroid/net/NetworkInfo;", "getNetWorkType", "Lcom/heytap/store/platform/tools/NetworkType;", "getNetWorkTypeName", "", "getNetworkOperatorName", "getPhoneType", "", "context", "Landroid/content/Context;", "is4G", "", "isAirPlaneModeOn", "isAvailable", "isConnected", "isRegisteredNetworkStatusChangedListener", "listener", "Lcom/heytap/store/platform/tools/OnNetworkStatusChangedListener;", "isWifiConnected", "openWirelessSettings", "", "registerNetworkStatusChangedListener", "simplizeNetworkInfo", "Lcom/heytap/store/platform/tools/SimpleNetworkInfo;", "networkInfo", "unregisterNetworkStatusChangedListener", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class NetworkUtils {
    public static final NetworkUtils INSTANCE = new NetworkUtils();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[NetworkType.NETWORK_WIFI.ordinal()] = 1;
            iArr[NetworkType.NETWORK_4G.ordinal()] = 2;
            iArr[NetworkType.NETWORK_3G.ordinal()] = 3;
            iArr[NetworkType.NETWORK_2G.ordinal()] = 4;
            iArr[NetworkType.NETWORK_NO.ordinal()] = 5;
        }
    }

    private NetworkUtils() {
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    @Nullable
    public final NetworkInfo getActiveNetworkInfo() {
        Object systemService = ContextGetterUtils.INSTANCE.getApp().getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager)) {
            systemService = null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    @NotNull
    public final NetworkType getNetWorkType() {
        NetworkType networkType;
        NetworkType networkType2 = NetworkType.NETWORK_NO;
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return networkType2;
        }
        if (activeNetworkInfo.getType() == 1) {
            networkType = NetworkType.NETWORK_WIFI;
        } else if (activeNetworkInfo.getType() == 0) {
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    networkType = NetworkType.NETWORK_2G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    networkType = NetworkType.NETWORK_3G;
                    break;
                case 13:
                case 18:
                    networkType = NetworkType.NETWORK_4G;
                    break;
                default:
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    networkType = (!StringsKt__StringsJVMKt.equals(subtypeName, "TD-SCDMA", true) && !StringsKt__StringsJVMKt.equals(subtypeName, "WCDMA", true) && !StringsKt__StringsJVMKt.equals(subtypeName, "CDMA2000", true)) ? NetworkType.NETWORK_UNKNOWN : NetworkType.NETWORK_3G;
                    break;
            }
        } else {
            networkType = NetworkType.NETWORK_UNKNOWN;
        }
        return networkType;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    @NotNull
    public final String getNetWorkTypeName() {
        int i = WhenMappings.$EnumSwitchMapping$0[getNetWorkType().ordinal()];
        if (i == 1) {
            return "NETWORK_WIFI";
        }
        if (i == 2) {
            return "NETWORK_4G";
        }
        if (i == 3) {
            return "NETWORK_3G";
        }
        if (i != 4) {
            return i != 5 ? "NETWORK_UNKNOWN" : "NETWORK_NO";
        }
        return "NETWORK_2G";
    }

    @Nullable
    public final String getNetworkOperatorName() {
        return "";
    }

    public final int getPhoneType(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        if (!(systemService instanceof TelephonyManager)) {
            systemService = null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (telephonyManager != null) {
            return telephonyManager.getPhoneType();
        }
        return -1;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public final boolean is4G(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.getSubtype() == 13;
    }

    public final boolean isAirPlaneModeOn(@NotNull Context context) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            i = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on");
        } catch (Settings.SettingNotFoundException e2) {
            e2.printStackTrace();
            i = 0;
        }
        return i == 1;
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public final boolean isAvailable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public final boolean isConnected(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean isRegisteredNetworkStatusChangedListener(@Nullable OnNetworkStatusChangedListener listener) {
        return NetworkChangedReceiver.INSTANCE.get().isRegistered(listener);
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public final boolean isWifiConnected(@NotNull Context context) {
        NetworkInfo activeNetworkInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager)) {
            systemService = null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }

    public final void openWirelessSettings(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent("android.settings.SETTINGS"));
    }

    public final void registerNetworkStatusChangedListener(@Nullable OnNetworkStatusChangedListener listener) {
        NetworkChangedReceiver.INSTANCE.get().registerListener(listener);
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public final SimpleNetworkInfo simplizeNetworkInfo(@Nullable Context context, @Nullable NetworkInfo networkInfo) {
        if (context == null) {
            return null;
        }
        if (networkInfo == null) {
            Boolean bool = Boolean.FALSE;
            return new SimpleNetworkInfo(bool, bool, bool, Boolean.valueOf(isAirPlaneModeOn(context)), getNetWorkType());
        }
        if (!networkInfo.isAvailable()) {
            Boolean bool2 = Boolean.FALSE;
            return new SimpleNetworkInfo(bool2, bool2, bool2, Boolean.valueOf(isAirPlaneModeOn(context)), getNetWorkType());
        }
        if (networkInfo.getType() == 1) {
            Boolean bool3 = Boolean.TRUE;
            Boolean bool4 = Boolean.FALSE;
            return new SimpleNetworkInfo(bool3, bool3, bool4, bool4, getNetWorkType());
        }
        Boolean bool5 = Boolean.TRUE;
        Boolean bool6 = Boolean.FALSE;
        return new SimpleNetworkInfo(bool5, bool6, bool6, bool6, getNetWorkType());
    }

    public final void unregisterNetworkStatusChangedListener(@Nullable OnNetworkStatusChangedListener listener) {
        NetworkChangedReceiver.INSTANCE.get().unregisterListener(listener);
    }
}

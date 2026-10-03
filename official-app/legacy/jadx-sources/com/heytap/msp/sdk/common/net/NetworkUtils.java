package com.heytap.msp.sdk.common.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes19.dex */
public class NetworkUtils {
    private static final String CDMA2000 = "CDMA2000";
    private static final String TD_SCDMA = "TD-SCDMA";
    private static final String WCDMA = "WCDMA";

    private NetworkUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    private static NetworkInfo getActiveNetworkInfo(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (com.heytap.msp.sdk.common.net.NetworkUtils.CDMA2000.equalsIgnoreCase(r2) == false) goto L23;
     */
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NetworkType getNetworkType(Context context) {
        NetworkType networkType = NetworkType.NETWORK_NO;
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return networkType;
        }
        if (activeNetworkInfo.getType() == 1) {
            return NetworkType.NETWORK_WIFI;
        }
        if (activeNetworkInfo.getType() == 0) {
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return NetworkType.NETWORK_2G;
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
                    break;
                case 13:
                case 18:
                    return NetworkType.NETWORK_4G;
                default:
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    if (!TD_SCDMA.equalsIgnoreCase(subtypeName)) {
                        if (!WCDMA.equalsIgnoreCase(subtypeName)) {
                        }
                    }
                    break;
            }
            return NetworkType.NETWORK_3G;
        }
        return NetworkType.NETWORK_UNKNOWN;
    }
}

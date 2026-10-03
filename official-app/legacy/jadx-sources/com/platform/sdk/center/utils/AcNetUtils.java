package com.platform.sdk.center.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcNetUtils {
    public static final int AIRPLANE_MODE_ON_STR = 0;
    public static final int MOBILE_AND_WLAN_NETWORK_NOT_CONNECT_STR = 1;
    public static final int MOBILE_SSL_DATE_INVALID = 4;
    public static final int NETWORK_CONNECT_OK_STR = -1;
    public static final int NET_ERROR_DEFAULT = 6;
    public static final int NO_NETWORK_CONNECT_STR = 3;
    public static final int SERVER_ERROR_STR = 5;
    public static final String TAG = "NoNetworkUtil";
    public static final int WLAN_NEED_LOGIN_STR = 2;

    public static boolean isConnectNet(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
            }
            return false;
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return false;
        }
    }
}

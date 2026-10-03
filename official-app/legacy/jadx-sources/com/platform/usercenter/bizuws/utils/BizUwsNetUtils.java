package com.platform.usercenter.bizuws.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.platform.usercenter.tools.net.NetInfoHelper;
import com.platform.usercenter.uws.util.UwsNoNetworkUtil;

/* JADX INFO: loaded from: classes9.dex */
public class BizUwsNetUtils {
    public static final int AIRPLANE_MODE_ON_STR = 0;
    public static final int MOBILE_AND_WLAN_NETWORK_NOT_CONNECT_STR = 1;
    public static final int NETWORK_CONNECT_OK_STR = -1;
    public static final int NO_NETWORK_CONNECT_STR = 3;
    public static final String TAG = "BizUwsNetworkUtils";

    private static ConnectivityManager getConnectivityManager(Context context) {
        return (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    public static int getDeviceNetStatus(Context context) {
        if (NetInfoHelper.isConnectNet(context)) {
            return -1;
        }
        if (!UwsNoNetworkUtil.isAirplaneMode(context).booleanValue() || isWifiConnected(context)) {
            return !isMobileDataConnected(context) ? 1 : 3;
        }
        return 0;
    }

    public static boolean isMobileDataConnected(Context context) {
        return getConnectivityManager(context).getNetworkInfo(0).getState() == NetworkInfo.State.CONNECTED;
    }

    public static boolean isWifiConnected(Context context) {
        return getConnectivityManager(context).getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED;
    }
}

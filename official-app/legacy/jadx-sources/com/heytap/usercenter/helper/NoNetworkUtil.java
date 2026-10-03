package com.heytap.usercenter.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class NoNetworkUtil {
    public static final String TAG = "NoNetworkUtil";

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

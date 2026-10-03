package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.provider.Settings;
import com.platform.account.webview.R$string;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"MissingPermission"})
public class atc {
    public static final int AIRPLANE_MODE_ON_STR = 0;
    public static final int MOBILE_AND_WLAN_NETWORK_NOT_CONNECT_STR = 1;
    public static final int MOBILE_SSL_DATE_INVALID = 4;
    public static final int NOT_ON_THE_WHITELIST = 6;
    public static final int NO_NETWORK_CONNECT_STR = 3;
    public static final int SERVER_ERROR_STR = 5;
    public static final String TAG = "NoNetworkUtil";
    public static final int WLAN_NEED_LOGIN_STR = 2;

    public static Context a(Context context) {
        return context instanceof Activity ? ((Activity) context).getApplicationContext() : context;
    }

    public static String b(Context context, int i) {
        if (context == null) {
            throw new RuntimeException("context is null");
        }
        Context contextA = a(context);
        if (i == 0) {
            return contextA.getString(R$string.ac_cord_network_status_tips_air_plane);
        }
        if (1 == i) {
            return contextA.getString(R$string.network_status_tips_open_connect);
        }
        if (2 != i && 3 != i) {
            if (5 == i) {
                return contextA.getString(R$string.network_status_tips_server_error);
            }
            return 4 == i ? contextA.getString(R$string.ac_cord_network_status_ssl_date_invalid) : contextA.getString(R$string.dialog_net_error_title);
        }
        return contextA.getString(R$string.network_status_tips_no_connect);
    }

    public static Boolean c(Context context) {
        Context contextA = a(context);
        try {
            boolean z = true;
            if (bvk.a()) {
                if (Settings.Global.getInt(contextA.getContentResolver(), "airplane_mode_on", 0) == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            if (Settings.System.getInt(contextA.getContentResolver(), "airplane_mode_on", 0) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception e2) {
            bn.c("NoNetworkUtil", "isAirplaneMode error = " + e2.getMessage());
            return Boolean.FALSE;
        }
    }

    public static boolean d(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a(context).getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() != null) {
                return connectivityManager.getActiveNetworkInfo().isAvailable();
            }
            return false;
        } catch (Exception e2) {
            bn.c("NoNetworkUtil", "isConnectNet " + e2);
            return false;
        }
    }
}

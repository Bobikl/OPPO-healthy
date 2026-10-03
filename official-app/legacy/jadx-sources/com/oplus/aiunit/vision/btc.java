package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oppo.lib.common.R$string;

/* JADX INFO: loaded from: classes18.dex */
public class btc {
    public static final int AIRPLANE_MODE_ON_STR = 0;
    public static final int MOBILE_SSL_DATE_INVALID = 4;
    public static final int NETWORK_CONNECT_OK_STR = -1;
    public static final int NO_NETWORK_CONNECT_STR = 3;
    public static final int SERVER_ERROR_STR = 5;
    public static final String TAG = "NoNetworkUtil";
    public static final int WLAN_NEED_LOGIN_STR = 2;

    @Nullable
    public static String a(@NonNull Context context, int i) {
        if (context == null) {
            throw new RuntimeException("context is null");
        }
        if (i == 0) {
            return context.getString(R$string.network_status_tips_air_plane);
        }
        if (1 == i) {
            return context.getString(R$string.network_status_tips_open_connect);
        }
        if (2 == i) {
            return context.getString(R$string.network_status_tips_need_login);
        }
        if (3 == i) {
            return context.getString(R$string.network_status_tips_no_connect);
        }
        if (5 == i) {
            return context.getString(R$string.network_status_tips_server_error);
        }
        return 4 == i ? context.getString(R$string.network_status_ssl_date_invalid) : context.getString(R$string.dialog_net_error_title);
    }

    public static Boolean b(Context context) {
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0);
        } catch (Exception e2) {
            t6b.c("isAirplaneMode error = " + e2.getMessage());
            return Boolean.FALSE;
        }
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.oppo.com/cn/"));
            intent.setFlags(272629760);
            intent.setPackage("com.android.browser");
            context.startActivity(intent);
        } catch (Exception e2) {
            t6b.c("onClickLoginBtn error = " + e2.getMessage());
        }
    }
}

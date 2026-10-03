package com.platform.usercenter.uws.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.spc;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.bizuws.R;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class UwsNoNetworkUtil {
    public static final int AIRPLANE_MODE_ON_STR = 0;
    public static final int MOBILE_AND_WLAN_NETWORK_NOT_CONNECT_STR = 1;
    public static final int MOBILE_SSL_DATE_INVALID = 4;
    public static final int NETWORK_CONNECT_OK_STR = -1;
    public static final int NO_NETWORK_CONNECT_STR = 3;
    public static final int SERVER_ERROR_STR = 5;
    public static final String TAG = "NoNetworkUtil";
    public static final int WLAN_NEED_LOGIN_STR = 2;

    public static String getNetStatusMessage(Context context, int i) {
        if (context == null) {
            throw new RuntimeException("context is null");
        }
        if (i == 0) {
            return context.getString(R.string.no_network_with_airplane_mode);
        }
        if (1 == i) {
            return context.getString(R.string.network_status_tips_no_connect);
        }
        if (2 == i) {
            return context.getString(R.string.network_status_tips_need_login);
        }
        if (3 == i) {
            return context.getString(R.string.network_status_tips_no_connect);
        }
        if (5 == i) {
            return context.getString(R.string.network_status_tips_server_error);
        }
        return 4 == i ? context.getString(R.string.network_status_ssl_date_invalid) : context.getString(R.string.dialog_net_error_title);
    }

    public static String getNetworkName(@NonNull Context context) {
        return spc.b(context);
    }

    public static Boolean isAirplaneMode(Context context) {
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0);
        } catch (Exception e2) {
            UCLogUtil.e("NoNetworkUtil", "isAirplaneMode error! " + e2.getMessage());
            return Boolean.FALSE;
        }
    }

    public static boolean isConnectNet(Context context) {
        return spc.c(context);
    }

    public static Map<String, String> multimapToSingle(Map<String, List<String>> map) {
        StringBuilder sb = new StringBuilder();
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            sb.delete(0, sb.length());
            if (value != null && value.size() > 0) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(";");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            map2.put(entry.getKey(), sb.toString());
        }
        return map2;
    }

    public static void onClickLoginBtn(Context context) {
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(UCCommonXor8Provider.getNormalStrByDecryptXOR8("`||x{2''\u007f\u007f\u007f&`mq|ix&kge'")));
            intent.setFlags(272629760);
            context.startActivity(intent);
        } catch (Exception e2) {
            UCLogUtil.e("NoNetworkUtil", "onClickLoginBtn error! " + e2.getMessage());
        }
    }

    public static void onNetworkingSetClickBtn(Context context) {
        if (context == null) {
            return;
        }
        context.startActivity(new Intent("android.settings.AIRPLANE_MODE_SETTINGS"));
    }
}

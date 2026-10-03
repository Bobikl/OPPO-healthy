package com.heytap.usercenter.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.heytap.webview.extension.protocol.Const;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class UCNetInfoHelper {
    private static final String TAG = "UCNetInfoHelper";

    public static String getHostAddress(String str) {
        InetAddress byName;
        try {
            try {
                byName = InetAddress.getByName(new URL(str).getHost());
            } catch (UnknownHostException e2) {
                UCLogUtil.e(TAG, e2.toString());
                byName = null;
            }
            return byName != null ? byName.getHostAddress() : "";
        } catch (Exception e3) {
            UCLogUtil.e(TAG, e3.toString());
            return null;
        }
    }

    public static String getNetType(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return "0";
            }
            String upperCase = activeNetworkInfo.getTypeName().toUpperCase();
            if (!Const.Callback.NetworkState.NetworkType.NETWORK_MOBILE.equalsIgnoreCase(upperCase)) {
                return upperCase;
            }
            String extraInfo = activeNetworkInfo.getExtraInfo();
            return !TextUtils.isEmpty(extraInfo) ? extraInfo.toUpperCase() : upperCase;
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return "0";
        }
    }

    public static int getNetTypeId(Context context) {
        try {
            String netType = getNetType(context);
            if ("3GNET".equalsIgnoreCase(netType)) {
                return 3;
            }
            if ("3GWAP".equalsIgnoreCase(netType)) {
                return 4;
            }
            if ("UNINET".equalsIgnoreCase(netType)) {
                return 5;
            }
            if ("UNIWAP".equalsIgnoreCase(netType)) {
                return 6;
            }
            if ("CMNET".equalsIgnoreCase(netType)) {
                return 7;
            }
            if ("CMWAP".equalsIgnoreCase(netType)) {
                return 8;
            }
            if ("CTNET".equalsIgnoreCase(netType)) {
                return 9;
            }
            if ("CTWAP".equalsIgnoreCase(netType)) {
                return 10;
            }
            return "WIFI".equalsIgnoreCase(netType) ? 2 : 0;
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return 0;
        }
    }

    public static boolean is3GUploading(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            String lowerCase = activeNetworkInfo.getTypeName().toLowerCase();
            if ("mobile".equalsIgnoreCase(lowerCase)) {
                lowerCase = activeNetworkInfo.getExtraInfo().toLowerCase();
            }
            return "3gnet".equals(lowerCase) || "3gwap".equals(lowerCase);
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return false;
        }
    }

    public static boolean isConnectNet(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() != null) {
                return connectivityManager.getActiveNetworkInfo().isAvailable();
            }
            return false;
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return false;
        }
    }

    public static boolean isMobileActive(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
        } catch (Exception e2) {
            UCLogUtil.e(NotificationCompat.CATEGORY_ERROR, "catch exception = " + e2.getMessage());
            return false;
        }
    }

    public static boolean isWifiUploading(Context context) {
        try {
            return "wifi".equalsIgnoreCase(((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getTypeName().toLowerCase());
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return false;
        }
    }

    public static String netType(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            String lowerCase = activeNetworkInfo.getTypeName().toLowerCase();
            if ("mobile".equalsIgnoreCase(lowerCase)) {
                lowerCase = activeNetworkInfo.getExtraInfo().toUpperCase();
            }
            return lowerCase.toUpperCase();
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return "0";
        }
    }
}

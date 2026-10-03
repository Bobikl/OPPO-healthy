package com.platform.usercenter.tools.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.heytap.webview.extension.protocol.Const;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes9.dex */
public class NetInfoHelper {
    public static String getHostAddress(String str) {
        InetAddress byName;
        try {
            try {
                byName = InetAddress.getByName(new URL(str).getHost());
            } catch (UnknownHostException e2) {
                UCLogUtil.e(e2);
                byName = null;
            }
            return byName != null ? byName.getHostAddress() : "";
        } catch (Exception e3) {
            UCLogUtil.e(e3);
            return null;
        }
    }

    public static String getNetType(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) BaseApp.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
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
            if (netType.equals("3GNET")) {
                return 3;
            }
            if (netType.equals("3GWAP")) {
                return 4;
            }
            if (netType.equals("UNINET")) {
                return 5;
            }
            if (netType.equals("UNIWAP")) {
                return 6;
            }
            if (netType.equals("CMNET")) {
                return 7;
            }
            if (netType.equals("CMWAP")) {
                return 8;
            }
            if (netType.equals("CTNET")) {
                return 9;
            }
            if (netType.equals("CTWAP")) {
                return 10;
            }
            return netType.equals("WIFI") ? 2 : 0;
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return 0;
        }
    }

    public static boolean is3GUploading(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) BaseApp.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
            String lowerCase = activeNetworkInfo.getTypeName().toLowerCase();
            if (lowerCase.equals("mobile")) {
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
            ConnectivityManager connectivityManager = (ConnectivityManager) BaseApp.mContext.getSystemService("connectivity");
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
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) BaseApp.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
        } catch (Exception e2) {
            UCLogUtil.e(NotificationCompat.CATEGORY_ERROR, "catch exception = " + e2.getMessage());
            return false;
        }
    }

    public static boolean isWifiUploading(Context context) {
        try {
            return ((ConnectivityManager) BaseApp.mContext.getSystemService("connectivity")).getActiveNetworkInfo().getTypeName().toLowerCase().equals("wifi");
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return false;
        }
    }

    public static String netType(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) BaseApp.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
            String lowerCase = activeNetworkInfo.getTypeName().toLowerCase();
            if (lowerCase.equals("mobile")) {
                lowerCase = activeNetworkInfo.getExtraInfo().toUpperCase();
            }
            return lowerCase.toUpperCase();
        } catch (Exception e2) {
            UCLogUtil.e(e2);
            return "0";
        }
    }
}

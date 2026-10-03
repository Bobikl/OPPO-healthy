package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;

/* JADX INFO: loaded from: classes14.dex */
public class spc {
    public static ConnectivityManager a(Context context) {
        return (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    @SuppressLint({"MissingPermission"})
    public static String b(@NonNull Context context) {
        NetworkInfo activeNetworkInfo = a(context).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() != 0) {
            return "";
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
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
                return "3G";
            case 13:
            case 18:
            case 19:
                return EventRuleEntity.ACCEPT_NET_4G;
            case 20:
                return EventRuleEntity.ACCEPT_NET_5G;
            default:
                return "Mobile";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static boolean c(Context context) {
        try {
            ConnectivityManager connectivityManagerA = a(context);
            if (connectivityManagerA.getActiveNetworkInfo() != null) {
                return connectivityManagerA.getActiveNetworkInfo().isAvailable();
            }
            return false;
        } catch (Exception e2) {
            q7b.f("NetworkUtils", "check is net connect failed!", e2);
            return false;
        }
    }

    public static boolean d(Uri uri) {
        if (uri == null) {
            return false;
        }
        return URLUtil.isNetworkUrl(uri.toString()) || URLUtil.isFileUrl(uri.toString());
    }
}

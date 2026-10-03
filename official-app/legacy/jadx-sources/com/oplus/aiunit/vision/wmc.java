package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes18.dex */
public class wmc {
    public static boolean a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() != null) {
                return connectivityManager.getActiveNetworkInfo().isAvailable();
            }
            return false;
        } catch (Exception e2) {
            t6b.c("isConnectNet e = " + e2.getMessage());
            return true;
        }
    }
}

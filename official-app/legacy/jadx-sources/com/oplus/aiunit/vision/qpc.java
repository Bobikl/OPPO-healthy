package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes8.dex */
public class qpc {
    public static final int CLOSE = 3;
    public static final int NETWORK_NORMAL = 1;
    public static final int WIFI_ONLY = 2;
    public static int a = 0;
    public static int b = 72;

    public static int a() {
        return a;
    }

    public static int b() {
        return b;
    }

    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int iA = a();
        if (iA == 1) {
            return f(connectivityManager) || e(connectivityManager);
        }
        if (iA == 2) {
            return f(connectivityManager);
        }
        return false;
    }

    public static boolean d(Context context) {
        if (context == null) {
            return false;
        }
        return e((ConnectivityManager) context.getSystemService("connectivity"));
    }

    public static boolean e(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(0) && networkCapabilities.hasCapability(16);
    }

    public static boolean f(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) && networkCapabilities.hasCapability(16);
    }

    public static void g(int i) {
        if (i == 1 || i == 2 || i == 3) {
            a = i;
            return;
        }
        a = 3;
        w7i.i("NetworkUtil", "networkType is" + i + ", the setting parameter is wrong. take the default 3", new Object[0]);
    }

    public static void h(int i) {
        if (i >= 0) {
            b = i;
            return;
        }
        w7i.i("NetworkUtil", "UpdateTimeByHours is setting " + i + ", the setting parameter is wrong. take the default 72", new Object[0]);
        b = 72;
    }
}

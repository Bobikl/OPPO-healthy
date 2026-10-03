package com.heytap.omas.a.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class j {
    private static final String a = "GetNetStatusUtil";

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        Objects.toString(activeNetworkInfo);
        if (activeNetworkInfo != null) {
            activeNetworkInfo.isConnected();
            return activeNetworkInfo.isConnected();
        }
        i.b(a, "isOnline", "networkInfo:" + activeNetworkInfo);
        return false;
    }
}

package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public class g95 {
    public static int a(Context context) {
        if (context == null) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getConnectedType() called with: context = [");
        sb.append(context);
        sb.append("]");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            return activeNetworkInfo.getType();
        }
        return -1;
    }

    public static int b() {
        int iA = a(b78.a());
        if (iA == 0) {
            return 2;
        }
        return iA == -1 ? 0 : 1;
    }
}

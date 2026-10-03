package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes15.dex */
public class rpc {
    public static boolean a() {
        return m3k.i();
    }

    @Nullable
    public static Boolean b(Context context) {
        if (context == null) {
            return Boolean.FALSE;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        StringBuilder sb = new StringBuilder();
        sb.append("isMobileConnected() called with: info = [");
        sb.append(activeNetworkInfo);
        sb.append("]");
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            return Boolean.valueOf(activeNetworkInfo.getType() == 0);
        }
        return null;
    }

    public static boolean c() {
        return b(b78.a()) != null;
    }
}

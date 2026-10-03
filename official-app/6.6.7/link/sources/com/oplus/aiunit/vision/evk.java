package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class evk {
    public static InetAddress a(Context context, int i) {
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        int i2 = 0;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && activeNetworkInfo != null && networkInfo.getType() == activeNetworkInfo.getType() && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
                for (InetAddress inetAddress : linkProperties.getDnsServers()) {
                    int i3 = i2 + 1;
                    if (i2 == i) {
                        return inetAddress;
                    }
                    i2 = i3;
                }
            }
        }
        try {
            return InetAddress.getByName("114.114.114.114");
        } catch (UnknownHostException e) {
            o5f.b("Utils", "getDNSServerAddr: ex " + e);
            return null;
        }
    }

    public static int b(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            o5f.e("Utils", "wrong bytes length return 0");
            return 0;
        }
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public static int c(byte b) {
        return b & 255;
    }
}

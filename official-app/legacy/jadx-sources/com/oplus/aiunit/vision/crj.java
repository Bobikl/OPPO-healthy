package com.oplus.aiunit.vision;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes4.dex */
public class crj {
    public static int a(TelephonyManager telephonyManager) {
        if (g9f.a().b("TelephonyManager", "getDataNetworkType", "获取网络类型2")) {
            return 0;
        }
        return telephonyManager.getDataNetworkType();
    }

    public static int b(TelephonyManager telephonyManager) {
        if (g9f.a().b("TelephonyManager", "getNetworkType", "获取网络类型")) {
            return 0;
        }
        return telephonyManager.getNetworkType();
    }
}

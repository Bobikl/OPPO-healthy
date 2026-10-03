package com.oplus.aiunit.vision;

import android.content.IntentFilter;

/* JADX INFO: loaded from: classes17.dex */
public class pca {
    public static void a(IntentFilter intentFilter, String str) {
        if (!"android.intent.action.PACKAGE_ADDED".equals(str) && !"android.intent.action.PACKAGE_REMOVED".equals(str) && !"android.intent.action.PACKAGE_CHANGED".equals(str) && !"android.intent.action.PACKAGE_REPLACED".equals(str) && !"android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(str) && !"android.provider.Telephony.SMS_RECEIVED".equals(str)) {
            intentFilter.addAction(str);
        }
        g9f.a().b("IntentFilter", "addAction", "安装包广播拦截1");
    }

    public static void b(IntentFilter intentFilter, String str) {
        if ("package".equals(str) && intentFilter.hasAction("android.intent.action.PACKAGE_ADDED")) {
            new IntentFilter();
        } else {
            intentFilter.addDataScheme(str);
        }
        g9f.a().b("IntentFilter", "addDataScheme", "安装包广播拦截2");
    }
}

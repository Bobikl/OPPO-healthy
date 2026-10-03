package com.glyphix.mas.service;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class NoticeReceiverManager {
    private static NoticeReceiverManager b;
    public static Context context;
    private Map<String, b> a;

    private NoticeReceiverManager() {
        HashMap map = new HashMap();
        this.a = map;
        map.put(com.lifesense.plugin.ble.device.ancs.c.PACKAGE_NAME_WHATSAPP, new com.glyphix.mas.service.impl.a(context));
    }

    public static NoticeReceiverManager instance() {
        if (b == null) {
            b = new NoticeReceiverManager();
        }
        return b;
    }

    public b findReceiver(String str) {
        return this.a.get(str);
    }

    public Map<String, b> getReceiverMap() {
        return Collections.unmodifiableMap(this.a);
    }

    public boolean receiveNotice(StatusBarNotification statusBarNotification) {
        String packageName = statusBarNotification.getPackageName();
        com.glyphix.mas.utils.b.c().c("receive notice ", packageName);
        b bVarFindReceiver = findReceiver(packageName);
        if (bVarFindReceiver == null) {
            return false;
        }
        return bVarFindReceiver.a(statusBarNotification);
    }
}

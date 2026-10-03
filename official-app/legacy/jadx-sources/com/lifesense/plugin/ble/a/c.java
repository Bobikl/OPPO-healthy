package com.lifesense.plugin.ble.a;

import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
final class c implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        if (a.f == 0 || a.b == null) {
            return;
        }
        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Broadcast_Message, true, "delay callback:" + a.f8663e + " >>time=" + com.lifesense.plugin.ble.c.d.defaultDateFormat.format(new Date(System.currentTimeMillis())), null);
        long unused = a.f = 0L;
        a.b.onCallStateChanged(1, a.f8663e);
    }
}

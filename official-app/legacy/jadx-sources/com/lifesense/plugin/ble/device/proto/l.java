package com.lifesense.plugin.ble.device.proto;

/* JADX INFO: loaded from: classes5.dex */
class l implements Runnable {
    final /* synthetic */ k a;

    public l(k kVar) {
        this.a = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = "reconnect message >> " + ((com.lifesense.plugin.ble.a.a.h) this.a).y;
        k kVar = this.a;
        kVar.printLogMessage(kVar.getSupperLogInfo(((com.lifesense.plugin.ble.a.a.h) kVar).z, str, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
        this.a.f();
    }
}

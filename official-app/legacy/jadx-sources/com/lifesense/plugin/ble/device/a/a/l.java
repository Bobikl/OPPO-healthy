package com.lifesense.plugin.ble.device.a.a;

/* JADX INFO: loaded from: classes5.dex */
class l implements Runnable {
    final /* synthetic */ g a;

    public l(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g gVar = this.a;
        gVar.printLogMessage(gVar.getSupperLogInfo(null, "reset phone state:" + this.a.G, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        this.a.G = 0;
    }
}

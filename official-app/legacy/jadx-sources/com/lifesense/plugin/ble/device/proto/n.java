package com.lifesense.plugin.ble.device.proto;

import com.lifesense.plugin.ble.data.LSConnectState;

/* JADX INFO: loaded from: classes5.dex */
class n implements Runnable {
    final /* synthetic */ k a;

    public n(k kVar) {
        this.a = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (LSConnectState.ConnectSuccess == ((com.lifesense.plugin.ble.a.a.h) this.a).A) {
            k kVar = this.a;
            kVar.printLogMessage(kVar.getSupperLogInfo(((com.lifesense.plugin.ble.a.a.h) kVar).y, "unhandle discover services timeout...", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            return;
        }
        String str = "discover services timeout message >> " + ((com.lifesense.plugin.ble.a.a.h) this.a).y;
        k kVar2 = this.a;
        kVar2.printLogMessage(kVar2.getSupperLogInfo(((com.lifesense.plugin.ble.a.a.h) kVar2).z, str, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
        ((com.lifesense.plugin.ble.a.a.h) this.a).J = true;
        this.a.g();
    }
}

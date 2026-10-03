package com.lifesense.plugin.ble.device.proto.A5;

import com.lifesense.plugin.ble.data.LSConnectState;

/* JADX INFO: loaded from: classes5.dex */
class g implements Runnable {
    final /* synthetic */ d a;

    public g(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = "#onConnectionnTimeout,count=" + ((com.lifesense.plugin.ble.device.proto.k) this.a).k + "; mac=" + ((com.lifesense.plugin.ble.a.a.h) this.a).y + "; state=" + ((com.lifesense.plugin.ble.a.a.h) this.a).A;
        d dVar = this.a;
        dVar.printLogMessage(dVar.getGeneralLogInfo(null, str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        if (((com.lifesense.plugin.ble.a.a.h) this.a).A == LSConnectState.ConnectSuccess) {
            return;
        }
        this.a.g();
    }
}

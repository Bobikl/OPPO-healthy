package com.lifesense.plugin.ble.device.proto.A5;

import com.lifesense.plugin.ble.data.LSDisconnectStatus;

/* JADX INFO: loaded from: classes5.dex */
class m implements Runnable {
    final /* synthetic */ i a;

    public m(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.lifesense.plugin.ble.a.e.a().c()) {
            i iVar = this.a;
            iVar.printLogMessage(iVar.getSupperLogInfo(((com.lifesense.plugin.ble.a.a.h) iVar).y, "unhandle connection request,bluetooth status error..", com.lifesense.plugin.ble.b.a.a.Reconnect_Message, null, false));
        } else {
            this.a.q();
            i iVar2 = this.a;
            iVar2.a(((com.lifesense.plugin.ble.a.a.h) iVar2).B, -1);
            this.a.c(LSDisconnectStatus.Cancel);
        }
    }
}

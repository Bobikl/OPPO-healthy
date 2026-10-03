package com.lifesense.plugin.ble.device.a.a;

import com.lifesense.plugin.ble.data.other.ScanMode;

/* JADX INFO: loaded from: classes5.dex */
class s implements Runnable {
    final /* synthetic */ o a;

    public s(o oVar) {
        this.a = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.lifesense.plugin.ble.a.e.a().c() || !this.a.h() || this.a.o == null) {
            o oVar = this.a;
            oVar.printLogMessage(oVar.getSupperLogInfo(null, "no permission to callback upgrading scan timeout", com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
        } else {
            if (ScanMode.SCAN_FOR_UPGRADE != this.a.r || this.a.H <= 0) {
                return;
            }
            o oVar2 = this.a;
            oVar2.printLogMessage(oVar2.getSupperLogInfo(null, "no scan results about upgrade device broadcast....", com.lifesense.plugin.ble.b.a.a.Scan_Timeout, null, false));
            this.a.o.b();
        }
    }
}

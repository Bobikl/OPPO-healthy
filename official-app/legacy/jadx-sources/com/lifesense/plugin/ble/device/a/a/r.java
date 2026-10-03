package com.lifesense.plugin.ble.device.a.a;

import android.os.Message;
import com.lifesense.plugin.ble.data.other.ScanMode;

/* JADX INFO: loaded from: classes5.dex */
class r implements Runnable {
    final /* synthetic */ o a;

    public r(o oVar) {
        this.a = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zC = com.lifesense.plugin.ble.a.e.a().c();
        if (!zC || !this.a.E) {
            String str = "no permission to handle stop runnable,ble status =" + zC + "; isCancel=" + this.a.E;
            o oVar = this.a;
            oVar.printLogMessage(oVar.getPrintLogInfo(str, 3));
            return;
        }
        if (this.a.v != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("stop scan,scanning time:");
            sb.append(this.a.p() / 1000);
            sb.append(" s");
            com.lifesense.plugin.ble.a.e.a().e();
            this.a.n();
            if (ScanMode.SCAN_FOR_SYNC == this.a.r) {
                if (this.a.B == null || this.a.B.size() <= 0) {
                    Message messageObtainMessage = this.a.v.obtainMessage();
                    messageObtainMessage.arg1 = 5;
                    this.a.v.sendMessage(messageObtainMessage);
                    return;
                }
                com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Scan_Results, true, "target mac=" + this.a.A + ";scan results count=" + this.a.B.size() + " ; macs >>" + this.a.B, null);
                if (this.a.C <= 0 || this.a.C % 2 != 0) {
                    return;
                }
                String str2 = "no target device's broadcast callback scan response >> " + this.a.C;
                o oVar2 = this.a;
                oVar2.printLogMessage(oVar2.getGeneralLogInfo(null, str2, com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
                this.a.j();
            }
        }
    }
}

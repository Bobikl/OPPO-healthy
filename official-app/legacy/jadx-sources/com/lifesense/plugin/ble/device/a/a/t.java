package com.lifesense.plugin.ble.device.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.lifesense.plugin.ble.data.LSManagerStatus;
import com.lifesense.plugin.ble.data.other.BleScanResults;
import com.lifesense.plugin.ble.data.other.ScanMode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
class t extends Handler {
    final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar, Looper looper) {
        super(looper);
        this.a = oVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Object obj;
        if (message == null) {
            return;
        }
        int i = message.arg1;
        if (i == 1) {
            if (this.a.G == LSManagerStatus.Free && this.a.r == ScanMode.SCAN_FOR_NORMAL) {
                String str = "no permission to start scan,status error=" + this.a.G;
                o oVar = this.a;
                oVar.printLogMessage(oVar.getGeneralLogInfo(null, str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                return;
            }
            ScanMode scanMode = ScanMode.SCAN_FOR_SYNC;
            if (scanMode == this.a.r) {
                if (this.a.D == 0) {
                    this.a.D = 1;
                }
                o.o(this.a);
            }
            if (ScanMode.SCAN_FOR_UPGRADE == this.a.r) {
                o oVar2 = this.a;
                oVar2.b(oVar2.o);
            }
            if (scanMode == this.a.r) {
                o oVar3 = this.a;
                oVar3.c(oVar3.o);
            }
            this.a.B = new ArrayList();
            if (com.lifesense.plugin.ble.a.e.a().d()) {
                com.lifesense.plugin.ble.a.e.a().e();
            }
            this.a.k();
            this.a.E = true;
            this.a.m();
            com.lifesense.plugin.ble.a.e.a().a(this.a.L);
            return;
        }
        if (i == 2) {
            this.a.B = new ArrayList();
            this.a.k();
            com.lifesense.plugin.ble.a.e.a().e();
            return;
        }
        if (i == 3 && (obj = message.obj) != null) {
            BleScanResults bleScanResults = (BleScanResults) obj;
            if (bleScanResults.getDevice() == null || bleScanResults.getDevice().getAddress() == null) {
                return;
            }
            bleScanResults.setName(bleScanResults.getDevice().getName());
            bleScanResults.setAddress(bleScanResults.getDevice().getAddress());
            if (ScanMode.SCAN_FOR_UPGRADE == this.a.r) {
                if (this.a.o != null) {
                    this.a.o.a(bleScanResults);
                    return;
                }
                return;
            } else {
                if (this.a.B != null && !this.a.B.contains(bleScanResults.getAddress())) {
                    this.a.B.add(bleScanResults.getAddress());
                }
                this.a.a(bleScanResults);
                return;
            }
        }
        if (i == 4) {
            if (this.a.C <= 0 || this.a.C % 2 != 0) {
                return;
            }
            String str2 = "failed to start scan has exception...." + this.a.C;
            o oVar4 = this.a;
            oVar4.printLogMessage(oVar4.getGeneralLogInfo(null, str2, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        } else {
            if (i != 5 || this.a.o == null || this.a.B.size() > 0 || !this.a.h() || this.a.C <= 0 || this.a.C % 2 != 0) {
                return;
            }
            String str3 = "no scan response=" + this.a.C;
            o oVar5 = this.a;
            oVar5.printLogMessage(oVar5.getGeneralLogInfo(null, str3, com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
        }
        this.a.j();
    }
}

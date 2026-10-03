package com.lifesense.plugin.ble.device.a.a;

import com.lifesense.plugin.ble.OnUpgradingListener;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSErrorCode;
import com.lifesense.plugin.ble.data.LSUpgradeState;
import com.lifesense.plugin.ble.data.other.BleScanResults;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
class b extends com.lifesense.plugin.ble.device.a.b {
    final /* synthetic */ a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public void a(BleScanResults bleScanResults) {
        if (bleScanResults == null || bleScanResults.getAddress() == null) {
            return;
        }
        this.a.a(bleScanResults);
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public void b() {
        if (this.a.g == null && this.a.g.size() == 0) {
            return;
        }
        Set<String> setKeySet = this.a.g.keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (String str : setKeySet) {
            com.lifesense.plugin.ble.device.proto.q qVarB = this.a.b(str);
            if (qVarB == null || LSConnectState.ConnectSuccess != qVarB.h()) {
                if (((OnUpgradingListener) this.a.g.get(str)) != null) {
                    a aVar = this.a;
                    aVar.printLogMessage(aVar.getGeneralLogInfo(str, "failed to upgrade device,scan timeout...", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
                    arrayList.add(str);
                }
            }
        }
        if (arrayList.size() > 0) {
            for (String str2 : arrayList) {
                OnUpgradingListener onUpgradingListenerE = this.a.e(str2);
                this.a.d(str2);
                this.a.a(str2, onUpgradingListenerE, LSUpgradeState.UpgradeFailure, LSErrorCode.ScanTimeout.getCode());
            }
        }
        if (this.a.f == null || this.a.f.size() == 0) {
            a aVar2 = this.a;
            aVar2.printLogMessage(aVar2.getGeneralLogInfo(null, "cancel upgrade scan timeout...", com.lifesense.plugin.ble.b.a.a.Scan_Message, null, true));
            o.a().e();
            o.a().c();
        }
    }
}

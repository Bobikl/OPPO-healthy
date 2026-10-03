package com.lifesense.plugin.ble.device.a.a;

import com.lifesense.plugin.ble.OnUpgradingListener;
import com.lifesense.plugin.ble.data.LSUpgradeState;

/* JADX INFO: loaded from: classes5.dex */
class c extends com.lifesense.plugin.ble.device.a.b {
    final /* synthetic */ a a;

    public c(a aVar) {
        this.a = aVar;
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public synchronized void a(com.lifesense.plugin.ble.device.proto.q qVar, String str, int i, int i2) {
        OnUpgradingListener onUpgradingListenerC = this.a.c(str);
        if (LSUpgradeState.UpgradeSuccess.getValue() == i || LSUpgradeState.UpgradeFailure.getValue() == i) {
            a aVar = this.a;
            aVar.printLogMessage(aVar.getPrintLogInfo("remove upgrade worker and listener >> " + str, 1));
            this.a.d(str);
            this.a.e(str);
            this.a.d();
        }
        this.a.a(str, onUpgradingListenerC, LSUpgradeState.getUpgradeState(i), i2);
    }

    @Override // com.lifesense.plugin.ble.device.a.b
    public void a(String str, int i) {
        OnUpgradingListener onUpgradingListenerC = this.a.c(str);
        if (onUpgradingListenerC == null) {
            a aVar = this.a;
            aVar.printLogMessage(aVar.getSupperLogInfo(str, "failed to callback upgrade progress,no listener." + str, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
            return;
        }
        if (i == 1 || ((i > 0 && i % 10 == 0) || i == 99)) {
            a aVar2 = this.a;
            aVar2.printLogMessage(aVar2.getSupperLogInfo(str, "progress:" + i + "%；listener= true ", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
        }
        onUpgradingListenerC.onProgressUpdate(str, i);
    }
}

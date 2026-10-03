package com.lifesense.plugin.ble.a.a;

import android.bluetooth.BluetoothDevice;
import com.lifesense.plugin.ble.data.LSConnectState;

/* JADX INFO: loaded from: classes5.dex */
class k implements com.lifesense.plugin.ble.a.g {
    final /* synthetic */ h a;

    public k(h hVar) {
        this.a = hVar;
    }

    @Override // com.lifesense.plugin.ble.a.g
    public void a(int i) {
        if (i == 10 || i == 13) {
            String str = "onBluetoothStateChanged=" + i;
            h hVar = this.a;
            hVar.printLogMessage(hVar.getGeneralLogInfo(hVar.y, str, com.lifesense.plugin.ble.b.a.a.Callback_Message, null, true));
            h hVar2 = this.a;
            hVar2.c(hVar2.D, 0, 0);
        }
    }

    @Override // com.lifesense.plugin.ble.a.g
    public void a(BluetoothDevice bluetoothDevice, LSConnectState lSConnectState) {
    }
}

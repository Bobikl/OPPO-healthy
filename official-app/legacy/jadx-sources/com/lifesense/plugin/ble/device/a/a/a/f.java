package com.lifesense.plugin.ble.device.a.a.a;

import com.lifesense.plugin.ble.OnSyncingListener;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.tracker.ATDeviceData;
import com.lifesense.plugin.ble.data.tracker.ATUploadDoneNotify;

/* JADX INFO: loaded from: classes5.dex */
class f extends OnSyncingListener {
    final /* synthetic */ e a;

    public f(e eVar) {
        this.a = eVar;
    }

    @Override // com.lifesense.plugin.ble.OnSyncingListener
    public void onActivityTrackerDataUpdate(String str, int i, ATDeviceData aTDeviceData) {
        if (aTDeviceData == null || !(aTDeviceData instanceof ATUploadDoneNotify)) {
            return;
        }
        String str2 = "upload done=" + ((ATUploadDoneNotify) aTDeviceData).getDataType();
        e eVar = this.a;
        eVar.printLogMessage(eVar.getGeneralLogInfo(str, str2, com.lifesense.plugin.ble.b.a.a.Callback_Message, null, true));
        e eVar2 = this.a;
        eVar2.b(eVar2.f8709c);
        this.a.b();
    }

    @Override // com.lifesense.plugin.ble.OnSyncingListener
    public void onStateChanged(String str, LSConnectState lSConnectState) {
        if (LSConnectState.ConnectSuccess != lSConnectState) {
            this.a.a(str);
        }
    }
}

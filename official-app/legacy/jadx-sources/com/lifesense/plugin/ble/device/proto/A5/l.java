package com.lifesense.plugin.ble.device.proto.A5;

import com.lifesense.plugin.ble.OnSettingListener;
import com.lifesense.plugin.ble.data.LSDeviceInfo;

/* JADX INFO: loaded from: classes5.dex */
class l extends OnSettingListener {
    final /* synthetic */ i a;

    public l(i iVar) {
        this.a = iVar;
    }

    @Override // com.lifesense.plugin.ble.OnSettingListener
    public void onFailure(int i) {
        i iVar;
        LSDeviceInfo lSDeviceInfo;
        int i2;
        super.onFailure(i);
        if (this.a.U) {
            iVar = this.a;
            lSDeviceInfo = ((com.lifesense.plugin.ble.a.a.h) iVar).B;
            i2 = 0;
        } else {
            iVar = this.a;
            lSDeviceInfo = ((com.lifesense.plugin.ble.a.a.h) iVar).B;
            i2 = -1;
        }
        iVar.a(lSDeviceInfo, i2);
        i iVar2 = this.a;
        iVar2.a(iVar2.z());
    }

    @Override // com.lifesense.plugin.ble.OnSettingListener
    public void onSuccess(String str) {
        i iVar;
        LSDeviceInfo lSDeviceInfo;
        int i;
        super.onSuccess(str);
        if (this.a.U) {
            iVar = this.a;
            lSDeviceInfo = ((com.lifesense.plugin.ble.a.a.h) iVar).B;
            i = 0;
        } else {
            iVar = this.a;
            lSDeviceInfo = ((com.lifesense.plugin.ble.a.a.h) iVar).B;
            i = -1;
        }
        iVar.a(lSDeviceInfo, i);
        i iVar2 = this.a;
        iVar2.a(iVar2.z());
    }
}

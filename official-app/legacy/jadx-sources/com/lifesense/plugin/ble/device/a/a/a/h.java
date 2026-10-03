package com.lifesense.plugin.ble.device.a.a.a;

import com.lifesense.plugin.ble.OnSettingListener;
import com.lifesense.plugin.ble.data.IDeviceSetting;
import com.lifesense.plugin.ble.data.LSDataQueryRequest;
import com.lifesense.plugin.ble.data.LSUpgradeState;

/* JADX INFO: loaded from: classes5.dex */
class h extends OnSettingListener {
    final /* synthetic */ OnSettingListener a;
    final /* synthetic */ IDeviceSetting b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f8711c;

    public h(e eVar, OnSettingListener onSettingListener, IDeviceSetting iDeviceSetting) {
        this.f8711c = eVar;
        this.a = onSettingListener;
        this.b = iDeviceSetting;
    }

    @Override // com.lifesense.plugin.ble.OnSettingListener
    public void onDataUpdate(Object obj) {
        this.a.onDataUpdate(obj);
        this.f8711c.g();
        e eVar = this.f8711c;
        eVar.b(eVar.f8709c);
        this.f8711c.b();
    }

    @Override // com.lifesense.plugin.ble.OnSettingListener
    public void onFailure(int i) {
        this.a.onFailure(i);
        this.f8711c.g();
        e eVar = this.f8711c;
        eVar.b(eVar.f8709c);
        this.f8711c.b();
    }

    @Override // com.lifesense.plugin.ble.OnSettingListener
    public void onProgressUpdate(String str, int i) {
        e eVar = this.f8711c;
        eVar.printLogMessage(eVar.getGeneralLogInfo(str, "push onProgressUpdate=" + i + "; forDevice=" + str, com.lifesense.plugin.ble.b.a.a.Callback_Message, null, true));
        this.a.onProgressUpdate(str, i);
    }

    @Override // com.lifesense.plugin.ble.OnSettingListener
    public void onStateChanged(String str, int i, int i2) {
        e eVar = this.f8711c;
        eVar.printLogMessage(eVar.getGeneralLogInfo(str, "push onStateChanged=" + i + "; forDevice=" + str + "; error=" + i2, com.lifesense.plugin.ble.b.a.a.Callback_Message, null, true));
        this.a.onStateChanged(str, i, i2);
        if (LSUpgradeState.UpgradeSuccess.getValue() == i || LSUpgradeState.UpgradeFailure.getValue() == i) {
            this.f8711c.g();
            e eVar2 = this.f8711c;
            eVar2.b(eVar2.f8709c);
            this.f8711c.b();
        }
    }

    @Override // com.lifesense.plugin.ble.OnSettingListener
    public void onSuccess(String str) {
        this.a.onSuccess(str);
        if (this.b instanceof LSDataQueryRequest) {
            this.f8711c.f();
            return;
        }
        this.f8711c.g();
        e eVar = this.f8711c;
        eVar.b(eVar.f8709c);
        this.f8711c.b();
    }
}

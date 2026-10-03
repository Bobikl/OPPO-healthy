package com.lifesense.plugin.ble.device.a.a.a;

import com.lifesense.plugin.ble.OnSettingListener;

/* JADX INFO: loaded from: classes5.dex */
class g extends OnSettingListener {
    final /* synthetic */ OnSettingListener a;
    final /* synthetic */ e b;

    public g(e eVar, OnSettingListener onSettingListener) {
        this.b = eVar;
        this.a = onSettingListener;
    }

    @Override // com.lifesense.plugin.ble.OnSettingListener
    public void onDataUpdate(Object obj) {
        super.onDataUpdate(obj);
        OnSettingListener onSettingListener = this.a;
        if (onSettingListener != null) {
            onSettingListener.onDataUpdate(obj);
        }
        e eVar = this.b;
        eVar.b(eVar.f8710e);
        this.b.c();
    }

    @Override // com.lifesense.plugin.ble.OnSettingListener
    public void onFailure(int i) {
        super.onFailure(i);
        OnSettingListener onSettingListener = this.a;
        if (onSettingListener != null) {
            onSettingListener.onFailure(i);
        }
        e eVar = this.b;
        eVar.b(eVar.f8710e);
        this.b.c();
    }

    @Override // com.lifesense.plugin.ble.OnSettingListener
    public void onSuccess(String str) {
        super.onSuccess(str);
        OnSettingListener onSettingListener = this.a;
        if (onSettingListener != null) {
            onSettingListener.onSuccess(str);
        }
        e eVar = this.b;
        eVar.b(eVar.f8710e);
        this.b.c();
    }
}

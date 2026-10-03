package com.lifesense.plugin.ble.device.a.a;

import android.os.Message;

/* JADX INFO: loaded from: classes5.dex */
class i extends com.lifesense.plugin.ble.device.ancs.m {
    final /* synthetic */ g a;

    public i(g gVar) {
        this.a = gVar;
    }

    @Override // com.lifesense.plugin.ble.device.ancs.m
    public void a(com.lifesense.plugin.ble.device.ancs.a aVar) {
        Message messageObtainMessage = this.a.y.obtainMessage();
        messageObtainMessage.obj = aVar;
        messageObtainMessage.arg1 = 7;
        this.a.y.sendMessage(messageObtainMessage);
    }
}

package com.lifesense.plugin.ble.device.ancs;

import android.os.Message;

/* JADX INFO: loaded from: classes5.dex */
class f implements l {
    final /* synthetic */ e a;

    public f(e eVar) {
        this.a = eVar;
    }

    @Override // com.lifesense.plugin.ble.device.ancs.l
    public synchronized void a(Object obj, a aVar) {
        if (this.a.f8745e == null) {
            return;
        }
        Message messageObtainMessage = this.a.f8745e.obtainMessage();
        messageObtainMessage.arg1 = 1;
        messageObtainMessage.obj = aVar;
        this.a.f8745e.sendMessage(messageObtainMessage);
    }
}

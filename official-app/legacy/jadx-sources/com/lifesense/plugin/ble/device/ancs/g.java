package com.lifesense.plugin.ble.device.ancs;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.lifesense.plugin.ble.data.LSAppCategory;

/* JADX INFO: loaded from: classes5.dex */
class g extends Handler {
    final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, Looper looper) {
        super(looper);
        this.a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null || message.obj == null || this.a.d == null || message.arg1 != 1) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof a) {
            a aVar = (a) obj;
            LSAppCategory.getMessageID(aVar.f());
            aVar.h();
            aVar.i();
            this.a.a(aVar.g(), aVar);
            if (this.a.d != null) {
                this.a.d.a(aVar);
            }
        }
    }
}

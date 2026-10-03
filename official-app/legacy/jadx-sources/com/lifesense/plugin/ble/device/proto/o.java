package com.lifesense.plugin.ble.device.proto;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes5.dex */
public class o extends Handler {
    final /* synthetic */ k a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar, Looper looper) {
        super(looper);
        this.a = kVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        this.a.a(message);
    }
}

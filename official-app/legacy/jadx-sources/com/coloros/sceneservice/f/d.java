package com.coloros.sceneservice.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes13.dex */
public class d extends Handler {
    public final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Looper looper) {
        super(looper);
        this.this$0 = fVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message != null && message.what == 100) {
            com.coloros.sceneservice.n.e.a(new c(this));
        }
    }
}

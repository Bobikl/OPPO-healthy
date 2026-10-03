package com.omron;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class el extends Handler {
    public el() {
    }

    public el(@Nullable Looper looper) {
        super(looper);
    }

    public final void a(int i, Object obj) {
        sendMessage(obtainMessage(i, obj));
    }

    public final boolean a() {
        return Thread.currentThread() == getLooper().getThread();
    }
}

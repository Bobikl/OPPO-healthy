package com.oplus.backup.sdk.common.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public abstract class StaticHandler<T> extends Handler {
    private static final String TAG = "StaticHandler";
    protected WeakReference<T> ref;

    public StaticHandler(T t) {
        this.ref = new WeakReference<>(t);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        T t = this.ref.get();
        if (t == null) {
            BRLog.w(TAG, "ref.get is null.");
        } else {
            handleMessage(message, t);
            super.handleMessage(message);
        }
    }

    public abstract void handleMessage(Message message, T t);

    public StaticHandler(T t, Looper looper) {
        super(looper);
        this.ref = new WeakReference<>(t);
    }
}

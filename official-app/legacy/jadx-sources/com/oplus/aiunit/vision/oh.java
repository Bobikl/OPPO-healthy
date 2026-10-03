package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public abstract class oh<T> extends Handler {
    public final WeakReference<T> a;

    public oh(Looper looper, T t) {
        super(looper);
        this.a = new WeakReference<>(t);
    }

    public abstract void a(Message message, T t);

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        T t = this.a.get();
        if (t != null) {
            a(message, t);
        }
    }
}

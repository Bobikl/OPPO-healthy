package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public abstract class whl<T> extends Handler {
    public final WeakReference<T> a;

    public whl(T t) {
        this.a = new WeakReference<>(t);
    }

    public abstract void a(Message message, @NonNull T t);

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        T t = this.a.get();
        if (t == null) {
            return;
        }
        a(message, t);
    }
}

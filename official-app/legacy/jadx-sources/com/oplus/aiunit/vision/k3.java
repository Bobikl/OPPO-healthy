package com.oplus.aiunit.vision;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public abstract class k3 implements jn9, kn9 {
    public WeakReference<Handler> a;

    public k3(Handler handler) {
        this.a = new WeakReference<>(handler);
    }

    public abstract void f();

    public abstract void g(Intent intent);

    public void h(int i, Object obj) {
        WeakReference<Handler> weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        Message.obtain(this.a.get(), i, obj).sendToTarget();
    }
}

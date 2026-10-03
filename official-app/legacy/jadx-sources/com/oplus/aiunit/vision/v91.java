package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.oplus.aiunit.vision.jm9;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public abstract class v91<V extends jm9> {
    public WeakReference<V> a;

    public void a(V v) {
        this.a = new WeakReference<>(v);
    }

    public void b() {
        WeakReference<V> weakReference = this.a;
        if (weakReference != null) {
            weakReference.clear();
            this.a = null;
        }
    }

    public Context c() {
        Object objD = d();
        if (objD == null) {
            return null;
        }
        return (Context) objD;
    }

    public V d() {
        WeakReference<V> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public abstract void e(Intent intent);

    public abstract void f(Bundle bundle);
}

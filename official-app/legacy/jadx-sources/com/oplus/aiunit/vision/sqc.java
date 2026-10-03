package com.oplus.aiunit.vision;

import com.oplus.aiunit.vision.et9;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public class sqc<V extends et9> {
    public String i = getClass().getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference<V> f16702j;

    public sqc(V v) {
        this.f16702j = new WeakReference<>(v);
    }

    public V a() {
        WeakReference<V> weakReference = this.f16702j;
        if (weakReference != null && weakReference.get() != null) {
            return this.f16702j.get();
        }
        t6b.i(this.i, "mView is null or weakReference is lost ");
        return null;
    }
}

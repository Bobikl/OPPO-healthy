package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public class x2c {
    public final AtomicReference<c7c> a = new AtomicReference<>();
    public final ArrayMap<c7c, List<Class<?>>> b = new ArrayMap<>();

    @Nullable
    public List<Class<?>> a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        c7c andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = new c7c(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.b) {
            list = this.b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new c7c(cls, cls2, cls3), list);
        }
    }
}

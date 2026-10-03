package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public class j3b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.engine.i<?, ?, ?> f12744c = new com.bumptech.glide.load.engine.i<>(Object.class, Object.class, Object.class, Collections.singletonList(new com.bumptech.glide.load.engine.e(Object.class, Object.class, Object.class, Collections.emptyList(), new tik(), null)), null);
    public final ArrayMap<c7c, com.bumptech.glide.load.engine.i<?, ?, ?>> a = new ArrayMap<>();
    public final AtomicReference<c7c> b = new AtomicReference<>();

    @Nullable
    public <Data, TResource, Transcode> com.bumptech.glide.load.engine.i<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        com.bumptech.glide.load.engine.i<Data, TResource, Transcode> iVar;
        c7c c7cVarB = b(cls, cls2, cls3);
        synchronized (this.a) {
            iVar = (com.bumptech.glide.load.engine.i) this.a.get(c7cVarB);
        }
        this.b.set(c7cVarB);
        return iVar;
    }

    public final c7c b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        c7c andSet = this.b.getAndSet(null);
        if (andSet == null) {
            andSet = new c7c();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public boolean c(@Nullable com.bumptech.glide.load.engine.i<?, ?, ?> iVar) {
        return f12744c.equals(iVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable com.bumptech.glide.load.engine.i<?, ?, ?> iVar) {
        synchronized (this.a) {
            ArrayMap<c7c, com.bumptech.glide.load.engine.i<?, ?, ?>> arrayMap = this.a;
            c7c c7cVar = new c7c(cls, cls2, cls3);
            if (iVar == null) {
                iVar = f12744c;
            }
            arrayMap.put(c7cVar, iVar);
        }
    }
}

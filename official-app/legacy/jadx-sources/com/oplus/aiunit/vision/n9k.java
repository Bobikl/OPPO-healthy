package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class n9k {
    public final List<a<?, ?>> a = new ArrayList();

    public static final class a<Z, R> {
        public final Class<Z> a;
        public final Class<R> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final mtf<Z, R> f14412c;

        public a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull mtf<Z, R> mtfVar) {
            this.a = cls;
            this.b = cls2;
            this.f14412c = mtfVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    @NonNull
    public synchronized <Z, R> mtf<Z, R> a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return tik.b();
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                return (mtf<Z, R>) aVar.f14412c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull mtf<Z, R> mtfVar) {
        this.a.add(new a<>(cls, cls2, mtfVar));
    }
}

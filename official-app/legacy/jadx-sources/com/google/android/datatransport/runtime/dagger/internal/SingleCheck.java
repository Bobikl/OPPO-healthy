package com.google.android.datatransport.runtime.dagger.internal;

import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class SingleCheck<T> implements b2f<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile b2f<T> provider;

    private SingleCheck(b2f<T> b2fVar) {
        this.provider = b2fVar;
    }

    public static <P extends b2f<T>, T> b2f<T> provider(P p) {
        return ((p instanceof SingleCheck) || (p instanceof DoubleCheck)) ? p : new SingleCheck((b2f) Preconditions.checkNotNull(p));
    }

    @Override // com.oplus.aiunit.vision.b2f
    public T get() {
        T t = (T) this.instance;
        if (t != UNINITIALIZED) {
            return t;
        }
        b2f<T> b2fVar = this.provider;
        if (b2fVar == null) {
            return (T) this.instance;
        }
        T t2 = b2fVar.get();
        this.instance = t2;
        this.provider = null;
        return t2;
    }
}

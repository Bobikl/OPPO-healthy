package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import com.oplus.aiunit.vision.b2f;

/* JADX INFO: loaded from: classes13.dex */
public final class DoubleCheck<T> implements b2f<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile b2f<T> provider;

    private DoubleCheck(b2f<T> b2fVar) {
        this.provider = b2fVar;
    }

    public static <P extends b2f<T>, T> Lazy<T> lazy(P p) {
        return p instanceof Lazy ? (Lazy) p : new DoubleCheck((b2f) Preconditions.checkNotNull(p));
    }

    public static <P extends b2f<T>, T> b2f<T> provider(P p) {
        Preconditions.checkNotNull(p);
        return p instanceof DoubleCheck ? p : new DoubleCheck(p);
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        if (!((obj == UNINITIALIZED || (obj instanceof MemoizedSentinel)) ? false : true) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // com.oplus.aiunit.vision.b2f
    public T get() {
        T t = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.instance;
                if (t == obj) {
                    t = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t);
                    this.provider = null;
                }
            }
        }
        return t;
    }
}

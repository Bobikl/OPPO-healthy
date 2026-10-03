package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public abstract class g7h<T, P> {
    public volatile T a;

    public abstract T a(P p);

    public final T b(P p) {
        T t;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = a(p);
            }
            t = this.a;
        }
        return t;
    }
}

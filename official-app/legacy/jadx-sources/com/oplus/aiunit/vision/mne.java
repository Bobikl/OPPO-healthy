package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public abstract class mne<T> {
    public final int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wg0<T> f14137c;

    public interface a {
        void reset();
    }

    public mne() {
        this(16, Integer.MAX_VALUE);
    }

    public void a(T t) {
        e(t);
    }

    public void b(T t) {
        if (t == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        wg0<T> wg0Var = this.f14137c;
        if (wg0Var.f18241j >= this.a) {
            a(t);
            return;
        }
        wg0Var.a(t);
        this.b = Math.max(this.b, this.f14137c.f18241j);
        e(t);
    }

    public abstract T c();

    public T d() {
        wg0<T> wg0Var = this.f14137c;
        return wg0Var.f18241j == 0 ? c() : wg0Var.pop();
    }

    public void e(T t) {
        if (t instanceof a) {
            ((a) t).reset();
        }
    }

    public mne(int i, int i2) {
        this.f14137c = new wg0<>(false, i);
        this.a = i2;
    }
}

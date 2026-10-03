package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public final class xya<T> {
    public final T a;
    public xya<T> b;

    public xya(T t, xya<T> xyaVar) {
        this.a = t;
        this.b = xyaVar;
    }

    public static <ST> boolean a(xya<ST> xyaVar, ST st) {
        while (xyaVar != null) {
            if (xyaVar.d() == st) {
                return true;
            }
            xyaVar = xyaVar.c();
        }
        return false;
    }

    public void b(xya<T> xyaVar) {
        if (this.b != null) {
            throw new IllegalStateException();
        }
        this.b = xyaVar;
    }

    public xya<T> c() {
        return this.b;
    }

    public T d() {
        return this.a;
    }
}

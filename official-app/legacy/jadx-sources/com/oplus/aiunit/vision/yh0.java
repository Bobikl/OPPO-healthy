package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class yh0<T> {
    public final String a;
    public final Class<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bi0 f19014c;
    public kb7 d;

    public yh0(String str, Class<T> cls) {
        this(str, cls, (bi0) null);
    }

    public String toString() {
        return this.a + ", " + this.b.getName();
    }

    public yh0(kb7 kb7Var, Class<T> cls) {
        this(kb7Var, cls, (bi0) null);
    }

    public yh0(String str, Class<T> cls, bi0<T> bi0Var) {
        this.a = str;
        this.b = cls;
        this.f19014c = bi0Var;
    }

    public yh0(kb7 kb7Var, Class<T> cls, bi0<T> bi0Var) {
        this.a = kb7Var.j();
        this.d = kb7Var;
        this.b = cls;
        this.f19014c = bi0Var;
    }
}

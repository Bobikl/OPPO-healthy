package com.oplus.aiunit.vision;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class x4m extends m1 implements e1 {
    public static y4m m = kp0.INSTANCE;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18498j;
    public y4m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u8f[] f18499l;

    public x4m(y4m y4mVar, x4m x4mVar) {
        this.f18499l = x4mVar.f18499l;
        this.k = y4mVar;
    }

    public static x4m f(y1 y1Var, boolean z) {
        return h(s1.m(y1Var, true));
    }

    public static x4m g(y4m y4mVar, Object obj) {
        if (obj instanceof x4m) {
            return new x4m(y4mVar, (x4m) obj);
        }
        if (obj != null) {
            return new x4m(y4mVar, s1.n(obj));
        }
        return null;
    }

    public static x4m h(Object obj) {
        if (obj instanceof x4m) {
            return (x4m) obj;
        }
        if (obj != null) {
            return new x4m(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        return new xj4(this.f18499l);
    }

    @Override // com.oplus.aiunit.vision.m1
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x4m) && !(obj instanceof s1)) {
            return false;
        }
        if (c().equals(((f1) obj).c())) {
            return true;
        }
        try {
            return this.k.b(this, new x4m(s1.n(((f1) obj).c())));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.m1
    public int hashCode() {
        if (this.i) {
            return this.f18498j;
        }
        this.i = true;
        int iC = this.k.c(this);
        this.f18498j = iC;
        return iC;
    }

    public u8f[] i() {
        u8f[] u8fVarArr = this.f18499l;
        int length = u8fVarArr.length;
        u8f[] u8fVarArr2 = new u8f[length];
        System.arraycopy(u8fVarArr, 0, u8fVarArr2, 0, length);
        return u8fVarArr2;
    }

    public String toString() {
        return this.k.a(this);
    }

    public x4m(s1 s1Var) {
        this(m, s1Var);
    }

    public x4m(y4m y4mVar, s1 s1Var) {
        this.k = y4mVar;
        this.f18499l = new u8f[s1Var.size()];
        Enumeration enumerationQ = s1Var.q();
        int i = 0;
        while (enumerationQ.hasMoreElements()) {
            this.f18499l[i] = u8f.g(enumerationQ.nextElement());
            i++;
        }
    }
}

package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class lyk {
    public float a;
    public float b;

    public lyk() {
        this(vr3.UNSET, vr3.UNSET);
    }

    public final lyk a(lyk lykVar) {
        this.a += lykVar.a;
        this.b += lykVar.b;
        return this;
    }

    public final lyk b(float f) {
        this.a *= f;
        this.b *= f;
        return this;
    }

    public final lyk c() {
        this.a = -this.a;
        this.b = -this.b;
        return this;
    }

    public final lyk d(float f, float f2) {
        this.a = f;
        this.b = f2;
        return this;
    }

    public final lyk e(lyk lykVar) {
        this.a = lykVar.a;
        this.b = lykVar.b;
        return this;
    }

    public final void f() {
        this.a = vr3.UNSET;
        this.b = vr3.UNSET;
    }

    public final lyk g(lyk lykVar) {
        this.a -= lykVar.a;
        this.b -= lykVar.b;
        return this;
    }

    public final String toString() {
        return "(" + this.a + d14.COMMA_REGEX + this.b + ")";
    }

    public lyk(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}

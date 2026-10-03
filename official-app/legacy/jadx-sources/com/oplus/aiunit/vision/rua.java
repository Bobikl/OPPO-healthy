package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class rua {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16358c;
    public short[][][] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public short[][][] f16359e;
    public short[][] f;
    public short[] g;

    public rua(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i = b & 255;
        this.a = i;
        int i2 = b2 & 255;
        this.b = i2;
        this.f16358c = i2 - i;
        this.d = sArr;
        this.f16359e = sArr2;
        this.f = sArr3;
        this.g = sArr4;
    }

    public short[][][] a() {
        return this.d;
    }

    public short[][][] b() {
        return this.f16359e;
    }

    public short[] c() {
        return this.g;
    }

    public short[][] d() {
        return this.f;
    }

    public int e() {
        return this.f16358c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof rua)) {
            return false;
        }
        rua ruaVar = (rua) obj;
        return this.a == ruaVar.f() && this.b == ruaVar.g() && this.f16358c == ruaVar.e() && r9f.k(this.d, ruaVar.a()) && r9f.k(this.f16359e, ruaVar.b()) && r9f.j(this.f, ruaVar.d()) && r9f.i(this.g, ruaVar.c());
    }

    public int f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((this.a * 37) + this.b) * 37) + this.f16358c) * 37) + eh0.w(this.d)) * 37) + eh0.w(this.f16359e)) * 37) + eh0.v(this.f)) * 37) + eh0.u(this.g);
    }
}

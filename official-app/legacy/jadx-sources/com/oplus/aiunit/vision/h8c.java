package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class h8c extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12053l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f12054n = 0.0f;
    public gj0 o;
    public int p;
    public int q;
    public int r;
    public int t;

    public h8c(int i, String str, gj0 gj0Var) {
        this.f12053l = i < 1 ? 1 : i;
        this.o = gj0Var;
        this.m = m(str);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        t22 t22VarC = this.f12054n == 0.0f ? this.o.c(rpjVar) : new af9(this.o.c(rpjVar), this.f12054n, this.m);
        t22VarC.h = 12;
        return t22VarC;
    }

    public int f() {
        return this.t;
    }

    public int i() {
        return this.r;
    }

    public int j() {
        return this.f12053l;
    }

    public boolean k() {
        return this.q != 0;
    }

    public final int m(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 2;
        boolean z = true;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 'c') {
                z = false;
                i2 = 2;
            } else if (cCharAt == 'l') {
                i2 = 0;
                z = false;
            } else if (cCharAt == 'r') {
                z = false;
                i2 = 1;
            } else if (cCharAt == '|') {
                if (z) {
                    this.p = 1;
                } else {
                    this.q = 1;
                }
                while (true) {
                    i++;
                    if (i >= length) {
                        break;
                    }
                    if (str.charAt(i) != '|') {
                        i--;
                        break;
                    }
                    if (z) {
                        this.p++;
                    } else {
                        this.q++;
                    }
                }
            }
            i++;
        }
        return i2;
    }

    public void q(int i, int i2) {
        this.r = i;
        this.t = i2;
    }

    public void r(float f) {
        this.f12054n = f;
    }
}

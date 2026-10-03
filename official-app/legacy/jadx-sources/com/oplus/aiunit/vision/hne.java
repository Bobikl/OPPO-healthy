package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class hne {
    public j18 a;
    public fne b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fne[] f12207c;
    public fne[] d;

    public hne(j18 j18Var, fne fneVar) {
        this.a = j18Var;
        this.b = fneVar;
        b();
        a();
    }

    public static void d(fne[] fneVarArr, int i, int i2) {
        fne fneVar = fneVarArr[i];
        fneVarArr[i] = fneVarArr[i2];
        fneVarArr[i2] = fneVar;
    }

    public final void a() {
        int iF;
        int iG = this.b.g();
        fne[] fneVarArr = new fne[iG];
        int i = iG - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            fneVarArr[i2] = new fne(this.f12207c[i2]);
        }
        this.d = new fne[iG];
        while (i >= 0) {
            this.d[i] = new fne(this.a, i);
            i--;
        }
        for (int i3 = 0; i3 < iG; i3++) {
            if (fneVarArr[i3].f(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < iG) {
                    if (fneVarArr[i4].f(i3) != 0) {
                        d(fneVarArr, i3, i4);
                        d(this.d, i3, i4);
                        i4 = iG;
                        z = true;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iF2 = this.a.f(fneVarArr[i3].f(i3));
            fneVarArr[i3].m(iF2);
            this.d[i3].m(iF2);
            for (int i5 = 0; i5 < iG; i5++) {
                if (i5 != i3 && (iF = fneVarArr[i5].f(i3)) != 0) {
                    fne fneVarN = fneVarArr[i3].n(iF);
                    fne fneVarN2 = this.d[i3].n(iF);
                    fneVarArr[i5].b(fneVarN);
                    this.d[i5].b(fneVarN2);
                }
            }
        }
    }

    public final void b() {
        int i;
        int iG = this.b.g();
        this.f12207c = new fne[iG];
        int i2 = 0;
        while (true) {
            i = iG >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[i3 + 1];
            iArr[i3] = 1;
            this.f12207c[i2] = new fne(this.a, iArr);
            i2++;
        }
        while (i < iG) {
            int i4 = i << 1;
            int[] iArr2 = new int[i4 + 1];
            iArr2[i4] = 1;
            this.f12207c[i] = new fne(this.a, iArr2).k(this.b);
            i++;
        }
    }

    public fne[] c() {
        return this.d;
    }
}

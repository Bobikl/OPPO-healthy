package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class fc6 {
    public short[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f11293c;
    public int d;
    public final r1h a = new r1h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final aca f11294e = new aca();
    public final r1h f = new r1h();

    public static int b(float f, float f2, float f3, float f4, float f5, float f6) {
        return (int) Math.signum((f * (f6 - f4)) + (f3 * (f2 - f6)) + (f5 * (f4 - f2)));
    }

    public final int a(int i) {
        short[] sArr = this.b;
        int i2 = sArr[i(i)] * 2;
        int i3 = sArr[i] * 2;
        int i4 = sArr[h(i)] * 2;
        float[] fArr = this.f11293c;
        return b(fArr[i2], fArr[i2 + 1], fArr[i3], fArr[i3 + 1], fArr[i4], fArr[i4 + 1]);
    }

    public r1h c(float[] fArr) {
        return d(fArr, 0, fArr.length);
    }

    public r1h d(float[] fArr, int i, int i2) {
        this.f11293c = fArr;
        int i3 = i2 / 2;
        this.d = i3;
        int i4 = i / 2;
        r1h r1hVar = this.a;
        r1hVar.b();
        r1hVar.c(i3);
        r1hVar.b = i3;
        short[] sArr = r1hVar.a;
        this.b = sArr;
        if (g58.a(fArr, i, i2)) {
            for (short s = 0; s < i3; s = (short) (s + 1)) {
                sArr[s] = (short) (i4 + s);
            }
        } else {
            int i5 = i3 - 1;
            for (int i6 = 0; i6 < i3; i6++) {
                sArr[i6] = (short) ((i4 + i5) - i6);
            }
        }
        aca acaVar = this.f11294e;
        acaVar.d();
        acaVar.e(i3);
        for (int i7 = 0; i7 < i3; i7++) {
            acaVar.a(a(i7));
        }
        r1h r1hVar2 = this.f;
        r1hVar2.b();
        r1hVar2.c(Math.max(0, i3 - 2) * 3);
        j();
        return r1hVar2;
    }

    public final void e(int i) {
        short[] sArr = this.b;
        r1h r1hVar = this.f;
        r1hVar.a(sArr[i(i)]);
        r1hVar.a(sArr[i]);
        r1hVar.a(sArr[h(i)]);
        this.a.d(i);
        this.f11294e.g(i);
        this.d--;
    }

    public final int f() {
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (g(i2)) {
                return i2;
            }
        }
        int[] iArr = this.f11294e.a;
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] != -1) {
                return i3;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(int i) {
        int i2;
        int[] iArr = this.f11294e.a;
        if (iArr[i] == -1) {
            return false;
        }
        int i3 = i(i);
        int iH = h(i);
        short[] sArr = this.b;
        int i4 = sArr[i3] * 2;
        int i5 = sArr[i] * 2;
        int i6 = sArr[iH] * 2;
        float[] fArr = this.f11293c;
        float f = fArr[i4];
        int i7 = 1;
        float f2 = fArr[i4 + 1];
        float f3 = fArr[i5];
        float f4 = fArr[i5 + 1];
        float f5 = fArr[i6];
        float f6 = fArr[i6 + 1];
        int iH2 = h(iH);
        while (iH2 != i3) {
            if (iArr[iH2] != i7) {
                int i8 = sArr[iH2] * 2;
                float f7 = fArr[i8];
                float f8 = fArr[i8 + i7];
                i2 = i7;
                if (b(f5, f6, f, f2, f7, f8) >= 0 && b(f, f2, f3, f4, f7, f8) >= 0 && b(f3, f4, f5, f6, f7, f8) >= 0) {
                    return false;
                }
            } else {
                i2 = i7;
            }
            iH2 = h(iH2);
            i7 = i2;
        }
        return i7;
    }

    public final int h(int i) {
        return (i + 1) % this.d;
    }

    public final int i(int i) {
        if (i == 0) {
            i = this.d;
        }
        return i - 1;
    }

    public final void j() {
        int i;
        int[] iArr = this.f11294e.a;
        while (true) {
            i = this.d;
            int i2 = 0;
            if (i <= 3) {
                break;
            }
            int iF = f();
            e(iF);
            int i3 = i(iF);
            if (iF != this.d) {
                i2 = iF;
            }
            iArr[i3] = a(i3);
            iArr[i2] = a(i2);
        }
        if (i == 3) {
            r1h r1hVar = this.f;
            short[] sArr = this.b;
            r1hVar.a(sArr[0]);
            r1hVar.a(sArr[1]);
            r1hVar.a(sArr[2]);
        }
    }
}

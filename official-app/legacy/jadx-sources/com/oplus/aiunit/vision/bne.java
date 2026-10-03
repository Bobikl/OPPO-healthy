package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class bne {
    public final float[] a;
    public final float[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short[] f9794c;
    public final xtj d;

    public bne(xtj xtjVar, float[] fArr, short[] sArr) {
        this.d = xtjVar;
        this.b = fArr;
        this.f9794c = sArr;
        float[] fArr2 = new float[fArr.length];
        this.a = fArr2;
        float f = xtjVar.b;
        float f2 = xtjVar.f18762c;
        float f3 = xtjVar.d - f;
        float f4 = xtjVar.f18763e - f2;
        int i = xtjVar.f;
        int i2 = xtjVar.g;
        int length = fArr.length;
        for (int i3 = 0; i3 < length; i3 += 2) {
            fArr2[i3] = ((fArr[i3] / i) * f3) + f;
            int i4 = i3 + 1;
            fArr2[i4] = ((1.0f - (fArr[i4] / i2)) * f4) + f2;
        }
    }
}

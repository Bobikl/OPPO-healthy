package com.oplus.aiunit.vision;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class g40 extends iz0<ra8, ra8> {
    public g40(List<xoa<ra8>> list) {
        super(d(list));
    }

    public static xoa<ra8> c(xoa<ra8> xoaVar) {
        ra8 ra8Var = xoaVar.b;
        ra8 ra8Var2 = xoaVar.f18704c;
        if (ra8Var == null || ra8Var2 == null || ra8Var.d().length == ra8Var2.d().length) {
            return xoaVar;
        }
        float[] fArrE = e(ra8Var.d(), ra8Var2.d());
        return xoaVar.b(ra8Var.a(fArrE), ra8Var2.a(fArrE));
    }

    public static List<xoa<ra8>> d(List<xoa<ra8>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, c(list.get(i)));
        }
        return list;
    }

    public static float[] e(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.oplus.aiunit.vision.i50
    public w51<ra8, ra8> a() {
        return new ta8(this.a);
    }

    @Override // com.oplus.aiunit.vision.iz0, com.oplus.aiunit.vision.i50
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // com.oplus.aiunit.vision.iz0, com.oplus.aiunit.vision.i50
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // com.oplus.aiunit.vision.iz0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}

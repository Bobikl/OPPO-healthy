package com.oplus.aiunit.vision;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class h40 extends jz0<sa8, sa8> {
    public h40(List<yoa<sa8>> list) {
        super(d(list));
    }

    public static yoa<sa8> c(yoa<sa8> yoaVar) {
        sa8 sa8Var = yoaVar.b;
        sa8 sa8Var2 = yoaVar.f19086c;
        if (sa8Var == null || sa8Var2 == null || sa8Var.e().length == sa8Var2.e().length) {
            return yoaVar;
        }
        float[] fArrE = e(sa8Var.e(), sa8Var2.e());
        return yoaVar.b(sa8Var.b(fArrE), sa8Var2.b(fArrE));
    }

    public static List<yoa<sa8>> d(List<yoa<sa8>> list) {
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

    @Override // com.oplus.aiunit.vision.j50
    public v51<sa8, sa8> a() {
        return new ua8(this.a);
    }

    @Override // com.oplus.aiunit.vision.jz0, com.oplus.aiunit.vision.j50
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // com.oplus.aiunit.vision.jz0, com.oplus.aiunit.vision.j50
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // com.oplus.aiunit.vision.jz0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}

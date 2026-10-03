package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class vib {
    public final lyk a = new lyk();
    public final lyk b = new lyk();

    public static final void b(vib vibVar, lyk lykVar, lyk lykVar2) {
        lyk lykVar3 = vibVar.a;
        float f = lykVar3.a * lykVar.a;
        lyk lykVar4 = vibVar.b;
        float f2 = lykVar4.a;
        float f3 = lykVar.b;
        lykVar2.a = f + (f2 * f3);
        lykVar2.b = (lykVar3.b * lykVar.a) + (lykVar4.b * f3);
    }

    public final vib a() {
        lyk lykVar = this.a;
        float f = lykVar.a;
        lyk lykVar2 = this.b;
        float f2 = lykVar2.a;
        float f3 = lykVar.b;
        float f4 = lykVar2.b;
        float f5 = (f * f4) - (f2 * f3);
        if (f5 != vr3.UNSET) {
            f5 = 1.0f / f5;
        }
        lykVar.a = f4 * f5;
        float f6 = -f5;
        lykVar2.a = f2 * f6;
        lykVar.b = f6 * f3;
        lykVar2.b = f5 * f;
        return this;
    }
}

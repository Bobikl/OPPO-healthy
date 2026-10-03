package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class ghb {
    public final nuk a = new nuk();
    public final nuk b = new nuk();

    public static final void b(ghb ghbVar, nuk nukVar, nuk nukVar2) {
        nuk nukVar3 = ghbVar.a;
        float f = nukVar3.a * nukVar.a;
        nuk nukVar4 = ghbVar.b;
        float f2 = nukVar4.a;
        float f3 = nukVar.b;
        nukVar2.a = f + (f2 * f3);
        nukVar2.b = (nukVar3.b * nukVar.a) + (nukVar4.b * f3);
    }

    public final ghb a() {
        nuk nukVar = this.a;
        float f = nukVar.a;
        nuk nukVar2 = this.b;
        float f2 = nukVar2.a;
        float f3 = nukVar.b;
        float f4 = nukVar2.b;
        float f5 = (f * f4) - (f2 * f3);
        if (f5 != 0.0f) {
            f5 = 1.0f / f5;
        }
        nukVar.a = f4 * f5;
        float f6 = -f5;
        nukVar2.a = f2 * f6;
        nukVar.b = f6 * f3;
        nukVar2.b = f5 * f;
        return this;
    }
}

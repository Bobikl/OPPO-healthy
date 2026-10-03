package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class u78 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static u78[] f17334e;
    public static final int[][][] f;
    public final float a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17335c;
    public final String d;

    static {
        w78 w78Var = new w78();
        f17334e = w78Var.e();
        f = w78Var.c();
    }

    public u78(float f2, float f3, float f4, String str) {
        this.a = f2;
        this.b = f3;
        this.f17335c = f4;
        this.d = str;
    }

    public static t22 b(int i, int i2, rpj rpjVar) {
        if (i > 7) {
            i = 0;
        }
        if (i2 > 7) {
            i2 = 0;
        }
        return f17334e[f[i][i2][rpjVar.m() / 2]].a(rpjVar);
    }

    public final t22 a(rpj rpjVar) {
        spj spjVarN = rpjVar.n();
        float fM = spjVarN.m(rpjVar.m(), spjVarN.L());
        return new v78((this.a / 18.0f) * fM, (this.b / 18.0f) * fM, (this.f17335c / 18.0f) * fM);
    }

    public String c() {
        return this.d;
    }
}

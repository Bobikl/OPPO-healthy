package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class cf1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mk3 f10054j = new mk3(1.0f, 1.0f, 1.0f, 1.0f);
    public final bf1 a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wg0<Object> f10055c = new wg0<>(1);
    public final wg0<Object> d = new wg0<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mk3 f10056e = new mk3(1.0f, 1.0f, 1.0f, 1.0f);
    public float[][] f;
    public int[] g;
    public aca[] h;
    public int[] i;

    public cf1(bf1 bf1Var, boolean z) {
        this.a = bf1Var;
        this.b = z;
        int i = bf1Var.f9718j.f18241j;
        if (i == 0) {
            throw new IllegalArgumentException("The specified font must contain at least one texture page.");
        }
        this.f = new float[i][];
        this.g = new int[i];
        if (i > 1) {
            aca[] acaVarArr = new aca[i];
            this.h = acaVarArr;
            int length = acaVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.h[i2] = new aca();
            }
        }
        this.i = new int[i];
    }

    public void a(boolean z) {
        this.b = z;
    }
}

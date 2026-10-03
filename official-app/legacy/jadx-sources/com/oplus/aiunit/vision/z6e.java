package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class z6e extends m1 {
    public static final BigInteger m = BigInteger.valueOf(0);
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f19301j;
    public int[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f19302l;

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1 g1Var2 = new g1();
        g1 g1Var3 = new g1();
        int i = 0;
        while (true) {
            int[] iArr = this.f19301j;
            if (i >= iArr.length) {
                g1 g1Var4 = new g1();
                g1Var4.a(new k1(this.i));
                g1Var4.a(new xj4(g1Var));
                g1Var4.a(new xj4(g1Var2));
                g1Var4.a(new xj4(g1Var3));
                return new xj4(g1Var4);
            }
            g1Var.a(new k1(iArr[i]));
            g1Var2.a(new k1(this.k[i]));
            g1Var3.a(new k1(this.f19302l[i]));
            i++;
        }
    }
}

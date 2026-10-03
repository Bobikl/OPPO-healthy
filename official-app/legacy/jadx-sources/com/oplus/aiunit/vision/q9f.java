package com.oplus.aiunit.vision;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes11.dex */
public class q9f implements KeySpec {
    public short[][] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[][] f15688j;
    public short[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15689l;

    public q9f(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f15689l = i;
        this.i = sArr;
        this.f15688j = sArr2;
        this.k = sArr3;
    }

    public short[][] a() {
        return this.i;
    }

    public short[] b() {
        return this.k;
    }

    public short[][] c() {
        return this.f15688j;
    }

    public int d() {
        return this.f15689l;
    }
}

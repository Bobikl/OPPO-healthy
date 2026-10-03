package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class y77 extends gj0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18908l;

    public y77(int i) {
        this.f18908l = i;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public t22 c(rpj rpjVar) {
        float fI = d4i.i(5, rpjVar) * 12.0f;
        int i = this.f18908l;
        return new z77(i == 5 ? 4 : i, fI * 1.0f, fI * 0.07f, fI * 0.125f, i == 5);
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int d() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.gj0
    public int e() {
        return 0;
    }
}

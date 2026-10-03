package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class cy3 extends gh1 {
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10292j = true;

    public cy3() {
        this.a = 1;
    }

    @Override // com.oplus.aiunit.vision.gh1
    public void c(int i, byte[] bArr) {
        if (!this.f10292j) {
            super.c(i, bArr);
            return;
        }
        if (i != hh1.SUCCESS) {
            super.c(i, bArr);
        } else if (this.i) {
            super.c(i, bArr);
        } else {
            this.i = true;
        }
    }

    @Override // com.oplus.aiunit.vision.gh1
    public int h() {
        return 1;
    }

    public boolean t() {
        return this.f10292j;
    }

    public void u(boolean z) {
        this.f10292j = z;
    }
}

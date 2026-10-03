package com.oplus.aiunit.vision;

import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public class ybf extends gh1 {
    public nt4 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public is4 f18962j;
    public boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18963l = 0;

    public static ybf t(UUID uuid, UUID uuid2) {
        return u(uuid, uuid2, null);
    }

    public static ybf u(UUID uuid, UUID uuid2, UUID uuid3) {
        ybf ybfVar = new ybf();
        ybfVar.p(uuid);
        ybfVar.l(uuid2);
        ybfVar.m(uuid3);
        return ybfVar;
    }

    @Override // com.oplus.aiunit.vision.gh1
    public void c(int i, byte[] bArr) {
        if (i != hh1.SUCCESS) {
            j(i, bArr);
            return;
        }
        if (this.i == null) {
            j(i, bArr);
            return;
        }
        if (this.f18962j == null) {
            this.f18962j = new is4();
        }
        nt4 nt4Var = this.i;
        is4 is4Var = this.f18962j;
        int i2 = this.f18963l;
        this.f18963l = i2 + 1;
        if (!nt4Var.a(is4Var, bArr, i2)) {
            this.k = true;
            return;
        }
        this.k = false;
        j(i, this.f18962j.a());
        this.f18962j = null;
        this.f18963l = 0;
    }

    @Override // com.oplus.aiunit.vision.gh1
    public boolean s() {
        return this.k;
    }
}

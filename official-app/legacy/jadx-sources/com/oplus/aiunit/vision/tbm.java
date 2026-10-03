package com.oplus.aiunit.vision;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class tbm extends rbm {
    public static final String f = "CancelInstallTask";
    public final uzm<Void> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f16960l;

    public tbm(uzm<Void> uzmVar, int i) {
        super(uzmVar);
        this.k = uzmVar;
        this.f16960l = i;
    }

    @Override // com.oplus.aiunit.vision.rbm, com.oplus.aiunit.vision.l7i.a
    public void c(int i, Bundle bundle) {
        w7i.e(f, "onCancelInstall session: %d", Integer.valueOf(i));
        this.k.a.c(null);
    }

    @Override // com.oplus.aiunit.vision.rbm
    public void e(l7i l7iVar) throws Exception {
        l7iVar.d(this.f16960l, this);
    }

    @Override // com.oplus.aiunit.vision.rbm, com.oplus.aiunit.vision.l7i.a
    public void onError(Bundle bundle) {
        super.onError(bundle);
        w7i.e(f, "onCancelInstall error session: %d", Integer.valueOf(this.f16960l));
    }
}

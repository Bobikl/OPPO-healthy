package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionStateFactory;

/* JADX INFO: loaded from: classes8.dex */
public final class whm<S extends OplusSplitInstallSessionState> extends rbm {
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uzm<S> f18268l;
    public final OplusSplitInstallSessionStateFactory<S> m;

    public whm(OplusSplitInstallSessionStateFactory<S> oplusSplitInstallSessionStateFactory, uzm<S> uzmVar, int i) {
        super(uzmVar);
        this.m = oplusSplitInstallSessionStateFactory;
        this.f18268l = uzmVar;
        this.k = i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.oplus.aiunit.vision.rbm, com.oplus.aiunit.vision.l7i.a
    public void d(int i, Bundle bundle) {
        this.f18268l.a.c((T) this.m.create(bundle));
    }

    @Override // com.oplus.aiunit.vision.rbm
    public void e(l7i l7iVar) throws Exception {
        l7iVar.g(this.k, this);
    }
}

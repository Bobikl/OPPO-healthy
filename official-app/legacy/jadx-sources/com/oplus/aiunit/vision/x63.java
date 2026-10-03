package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionStateFactory;

/* JADX INFO: loaded from: classes8.dex */
public final class x63<S extends OplusSplitInstallSessionState> implements Runnable {
    public final k8i<S> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18507j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OplusSplitInstallSessionStateFactory<S> f18508l;

    public x63(k8i<S> k8iVar, OplusSplitInstallSessionStateFactory<S> oplusSplitInstallSessionStateFactory, int i) {
        this(k8iVar, oplusSplitInstallSessionStateFactory, i, 0);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = this.k;
        if (i != 0) {
            k8i<S> k8iVar = this.i;
            k8iVar.a.c(this.f18508l.newState(k8iVar.b, this.f18507j, i));
        } else {
            k8i<S> k8iVar2 = this.i;
            k8iVar2.a.c(this.f18508l.newState(k8iVar2.b, this.f18507j));
        }
    }

    public x63(k8i<S> k8iVar, OplusSplitInstallSessionStateFactory<S> oplusSplitInstallSessionStateFactory, int i, int i2) {
        this.i = k8iVar;
        this.f18508l = oplusSplitInstallSessionStateFactory;
        this.f18507j = i;
        this.k = i2;
    }
}

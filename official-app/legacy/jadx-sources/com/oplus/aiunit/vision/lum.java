package com.oplus.aiunit.vision;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class lum extends rbm {
    public static final String f = "StartInstallTask";
    public final uzm<Integer> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<String> f13845l;

    public lum(uzm<Integer> uzmVar, List<String> list) {
        super(uzmVar);
        this.f13845l = list;
        this.k = uzmVar;
    }

    @Override // com.oplus.aiunit.vision.rbm, com.oplus.aiunit.vision.l7i.a
    public void a(int i, Bundle bundle) {
        w7i.e(f, "onStartInstall sessionId " + i, new Object[0]);
        this.k.a.c(Integer.valueOf(i));
    }

    @Override // com.oplus.aiunit.vision.rbm
    public void e(l7i l7iVar) {
        l7iVar.j(this.f13845l, this);
    }
}

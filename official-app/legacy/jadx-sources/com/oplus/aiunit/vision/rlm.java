package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionStateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class rlm<S extends OplusSplitInstallSessionState> extends rbm {
    public final uzm<List<S>> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OplusSplitInstallSessionStateFactory<S> f16252l;

    public rlm(OplusSplitInstallSessionStateFactory<S> oplusSplitInstallSessionStateFactory, uzm<List<S>> uzmVar) {
        super(uzmVar);
        this.f16252l = oplusSplitInstallSessionStateFactory;
        this.k = uzmVar;
    }

    @Override // com.oplus.aiunit.vision.rbm, com.oplus.aiunit.vision.l7i.a
    public void b(List<Bundle> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Bundle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f16252l.create(it.next()));
        }
        this.k.a.c(arrayList);
    }

    @Override // com.oplus.aiunit.vision.rbm
    public void e(l7i l7iVar) throws Exception {
        l7iVar.h(this);
    }
}

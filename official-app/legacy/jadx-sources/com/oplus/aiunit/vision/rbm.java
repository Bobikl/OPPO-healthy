package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class rbm implements Runnable, l7i.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16163c = "RemoteTask";
    public final uzm<?> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l7i f16164j = com.oplus.oms.split.full.splitinstall.b.E();

    public rbm(uzm<?> uzmVar) {
        this.i = uzmVar;
    }

    public void a(int i, Bundle bundle) {
    }

    @Override // com.oplus.aiunit.vision.l7i.a
    public void b(List<Bundle> list) {
    }

    @Override // com.oplus.aiunit.vision.l7i.a
    public void c(int i, Bundle bundle) {
    }

    @Override // com.oplus.aiunit.vision.l7i.a
    public void d(int i, Bundle bundle) {
    }

    public abstract void e(l7i l7iVar) throws Exception;

    @Override // com.oplus.aiunit.vision.l7i.a
    public void onError(Bundle bundle) {
        w7i.e(f16163c, "onError data " + bundle, new Object[0]);
        this.i.a.b(new OplusSplitInstallException(bundle.getInt("error_code")));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            l7i l7iVar = this.f16164j;
            if (l7iVar != null) {
                e(l7iVar);
            } else {
                onError(l7i.c(-100));
                w7i.i(f16163c, "Have you call SplitInstallSupervisorImpl#install method?", new Object[0]);
            }
        } catch (Exception e2) {
            w7i.c(f16163c, "execute error, msg: %s", e2.getMessage());
            uzm<?> uzmVar = this.i;
            if (uzmVar != null) {
                uzmVar.a.b(e2);
            }
        }
    }
}

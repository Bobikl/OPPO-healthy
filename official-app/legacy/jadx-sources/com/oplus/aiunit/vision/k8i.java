package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionStateFactory;

/* JADX INFO: loaded from: classes8.dex */
public class k8i<S extends OplusSplitInstallSessionState> {
    public final com.oplus.oms.split.full.core.splitinstall.a<S> a;
    public final S b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OplusSplitInstallSessionStateFactory<S> f13194c;
    public boolean d = false;

    public k8i(com.oplus.oms.split.full.core.splitinstall.a<S> aVar, OplusSplitInstallSessionStateFactory<S> oplusSplitInstallSessionStateFactory, S s) {
        this.a = aVar;
        this.f13194c = oplusSplitInstallSessionStateFactory;
        this.b = s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(OplusSplitInstallSessionState oplusSplitInstallSessionState) {
        if (this.d) {
            return;
        }
        w7i.i("SplitSessionStatusChanger", "session load timeout, sessionId: %d", Integer.valueOf(oplusSplitInstallSessionState.sessionId()));
        d(6, -100);
        this.d = true;
    }

    public void b() {
        this.d = true;
    }

    public void c(int i) {
        this.a.g().post(new x63(this, this.f13194c, i));
    }

    public void d(int i, int i2) {
        this.a.g().post(new x63(this, this.f13194c, i, i2));
    }

    public S e() {
        return this.b;
    }

    public void g(final OplusSplitInstallSessionState oplusSplitInstallSessionState) {
        this.a.g().postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.j8i
            @Override // java.lang.Runnable
            public final void run() {
                this.i.f(oplusSplitInstallSessionState);
            }
        }, 8000L);
    }
}

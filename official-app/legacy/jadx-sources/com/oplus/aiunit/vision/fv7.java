package com.oplus.aiunit.vision;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class fv7<T> extends wt7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ou7<T> f11520j;
    public final AtomicBoolean k = new AtomicBoolean();

    public fv7(ou7<T> ou7Var) {
        this.f11520j = ou7Var;
    }

    public boolean D() {
        return !this.k.get() && this.k.compareAndSet(false, true);
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        this.f11520j.subscribe(v2jVar);
        this.k.set(true);
    }
}

package com.oplus.aiunit.vision;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public final class fw8 extends cfg.c {
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cfg.c f11529j;

    public fw8(String str, cfg.c cVar) {
        this.i = str;
        this.f11529j = cVar;
    }

    @Override // com.oplus.aiunit.vision.cfg.c
    public io.reactivex.rxjava3.disposables.a c(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f11529j.c(new pu8(this.i, runnable), j2, timeUnit);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.f11529j.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.f11529j.isDisposed();
    }
}

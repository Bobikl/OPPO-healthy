package com.oplus.aiunit.vision;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class nv5 implements Future<Object> {
    public final io.reactivex.rxjava3.disposables.a i;

    public nv5(io.reactivex.rxjava3.disposables.a aVar) {
        this.i = aVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.i.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        return null;
    }
}

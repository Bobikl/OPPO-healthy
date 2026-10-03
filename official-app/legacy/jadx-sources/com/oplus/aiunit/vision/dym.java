package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.core.tasks.OplusOnFailureListener;
import com.oplus.oms.split.full.core.tasks.OplusTask;

/* JADX INFO: loaded from: classes8.dex */
public final class dym<T> implements Runnable {
    public final lpm<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OplusTask<T> f10728j;

    public dym(lpm<T> lpmVar, OplusTask<T> oplusTask) {
        this.i = lpmVar;
        this.f10728j = oplusTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        OplusOnFailureListener oplusOnFailureListener = this.i.a;
        if (oplusOnFailureListener != null) {
            oplusOnFailureListener.onFailure(this.f10728j.getException());
        }
    }
}

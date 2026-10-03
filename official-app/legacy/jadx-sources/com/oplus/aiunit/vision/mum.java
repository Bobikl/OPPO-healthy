package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.core.tasks.OplusOnCompleteListener;
import com.oplus.oms.split.full.core.tasks.OplusTask;

/* JADX INFO: loaded from: classes8.dex */
public final class mum<T> implements Runnable {
    public final slm<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OplusTask<T> f14246j;

    public mum(slm<T> slmVar, OplusTask<T> oplusTask) {
        this.i = slmVar;
        this.f14246j = oplusTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        OplusOnCompleteListener<T> oplusOnCompleteListener = this.i.a;
        if (oplusOnCompleteListener != null) {
            oplusOnCompleteListener.onComplete(this.f14246j);
        }
    }
}

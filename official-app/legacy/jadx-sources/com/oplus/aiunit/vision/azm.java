package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.core.tasks.OplusOnSuccessListener;
import com.oplus.oms.split.full.core.tasks.OplusTask;

/* JADX INFO: loaded from: classes8.dex */
public final class azm<T> implements Runnable {
    public final yrm<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OplusTask<T> f9534j;

    public azm(yrm<T> yrmVar, OplusTask<T> oplusTask) {
        this.i = yrmVar;
        this.f9534j = oplusTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        OplusOnSuccessListener<? super T> oplusOnSuccessListener = this.i.a;
        if (oplusOnSuccessListener != null) {
            oplusOnSuccessListener.onSuccess(this.f9534j.getResult());
        }
    }
}

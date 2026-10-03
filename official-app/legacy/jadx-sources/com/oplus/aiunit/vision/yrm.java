package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.core.tasks.OplusOnSuccessListener;
import com.oplus.oms.split.full.core.tasks.OplusTask;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class yrm<T> implements wbm<T> {
    public final OplusOnSuccessListener<? super T> a;
    public final Executor b;

    public yrm(Executor executor, OplusOnSuccessListener<? super T> oplusOnSuccessListener) {
        this.b = executor;
        this.a = oplusOnSuccessListener;
    }

    @Override // com.oplus.aiunit.vision.wbm
    public void a(OplusTask<T> oplusTask) {
        if (this.a != null && oplusTask.isSuccessful()) {
            this.b.execute(new azm(this, oplusTask));
        }
    }
}

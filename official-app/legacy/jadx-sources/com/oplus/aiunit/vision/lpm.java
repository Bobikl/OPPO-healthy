package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.core.tasks.OplusOnFailureListener;
import com.oplus.oms.split.full.core.tasks.OplusTask;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class lpm<T> implements wbm<T> {
    public final OplusOnFailureListener a;
    public final Executor b;

    public lpm(Executor executor, OplusOnFailureListener oplusOnFailureListener) {
        this.b = executor;
        this.a = oplusOnFailureListener;
    }

    @Override // com.oplus.aiunit.vision.wbm
    public void a(OplusTask<T> oplusTask) {
        if (this.a == null || oplusTask.isSuccessful()) {
            return;
        }
        this.b.execute(new dym(this, oplusTask));
    }
}

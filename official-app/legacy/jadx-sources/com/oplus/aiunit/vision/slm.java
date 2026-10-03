package com.oplus.aiunit.vision;

import com.oplus.oms.split.full.core.tasks.OplusOnCompleteListener;
import com.oplus.oms.split.full.core.tasks.OplusTask;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class slm<T> implements wbm<T> {
    public final OplusOnCompleteListener<T> a;
    public final Executor b;

    public slm(Executor executor, OplusOnCompleteListener<T> oplusOnCompleteListener) {
        this.b = executor;
        this.a = oplusOnCompleteListener;
    }

    @Override // com.oplus.aiunit.vision.wbm
    public void a(OplusTask<T> oplusTask) {
        if (this.a == null) {
            return;
        }
        this.b.execute(new mum(this, oplusTask));
    }
}

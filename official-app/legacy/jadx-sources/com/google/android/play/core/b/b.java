package com.google.android.play.core.b;

import androidx.annotation.NonNull;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;
import com.oplus.oms.split.full.core.tasks.OplusOnCompleteListener;
import com.oplus.oms.split.full.core.tasks.OplusTask;

/* JADX INFO: loaded from: classes14.dex */
public class b<T> implements OplusOnCompleteListener<T> {
    public final Task<T> a;
    public final OnCompleteListener<T> b;

    public b(@NonNull Task<T> task, @NonNull OnCompleteListener<T> onCompleteListener) {
        this.a = task;
        this.b = onCompleteListener;
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusOnCompleteListener
    public void onComplete(OplusTask<T> oplusTask) {
        this.b.onComplete(this.a);
    }
}

package com.google.android.play.core.b;

import androidx.annotation.NonNull;
import com.google.android.play.core.tasks.OnFailureListener;
import com.oplus.oms.split.full.core.tasks.OplusOnFailureListener;

/* JADX INFO: loaded from: classes14.dex */
public class c implements OplusOnFailureListener {
    public final OnFailureListener a;

    public c(@NonNull OnFailureListener onFailureListener) {
        this.a = onFailureListener;
    }

    @Override // com.oplus.oms.split.full.core.tasks.OplusOnFailureListener
    public void onFailure(Exception exc) {
        this.a.onFailure(a.a(exc));
    }
}

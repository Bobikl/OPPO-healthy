package com.google.android.play.core.b;

import androidx.annotation.NonNull;
import com.google.android.play.core.tasks.OnFailureListener;
import com.oplus.oms.split.full.core.tasks.OplusOnFailureListener;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c implements OplusOnFailureListener {
    public final OnFailureListener a;

    public c(@NonNull OnFailureListener onFailureListener) {
        this.a = onFailureListener;
    }

    public void onFailure(Exception exc) {
        this.a.onFailure(a.a(exc));
    }
}

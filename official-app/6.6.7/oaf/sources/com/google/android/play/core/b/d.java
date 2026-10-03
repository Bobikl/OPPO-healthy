package com.google.android.play.core.b;

import androidx.annotation.NonNull;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.oplus.oms.split.full.core.tasks.OplusOnSuccessListener;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d<T> implements OplusOnSuccessListener<T> {
    public final OnSuccessListener<T> a;

    public d(@NonNull OnSuccessListener<T> onSuccessListener) {
        this.a = onSuccessListener;
    }

    public void onSuccess(T t) {
        this.a.onSuccess(t);
    }
}

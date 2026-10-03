package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class OnSelectionChangedListener<S> {
    public void onIncompleteSelectionChanged() {
    }

    public abstract void onSelectionChanged(@NonNull S s);
}

package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface ViewOverlayImpl {
    void add(@NonNull Drawable drawable);

    void remove(@NonNull Drawable drawable);
}

package com.google.android.material.slider;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface BaseOnSliderTouchListener<S> {
    void onStartTrackingTouch(@NonNull S s);

    void onStopTrackingTouch(@NonNull S s);
}

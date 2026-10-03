package com.google.android.material.slider;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface LabelFormatter {
    public static final int LABEL_FLOATING = 0;
    public static final int LABEL_GONE = 2;
    public static final int LABEL_VISIBLE = 3;
    public static final int LABEL_WITHIN_BOUNDS = 1;

    @NonNull
    String getFormattedValue(float f);
}

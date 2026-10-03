package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes9.dex */
public class e95 {
    public static final String TAG = "DensityUtil";

    public static int a(Context context, int i, int i2) {
        return (int) TypedValue.applyDimension(i, i2, context.getResources().getDisplayMetrics());
    }

    public static int b(Context context, int i) {
        return a(context, 1, i);
    }
}

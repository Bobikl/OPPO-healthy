package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes8.dex */
public class htf {
    public static int a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int b(Context context, float f) {
        return (int) TypedValue.applyDimension(0, f, context.getResources().getDisplayMetrics());
    }
}

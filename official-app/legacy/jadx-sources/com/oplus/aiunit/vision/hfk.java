package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public class hfk {
    public static float a(@NonNull Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}

package com.oplus.aiunit.vision;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes18.dex */
public abstract class yqk {
    public static int a(float f, Resources resources) {
        return Math.round(TypedValue.applyDimension(1, f, resources.getDisplayMetrics()));
    }
}

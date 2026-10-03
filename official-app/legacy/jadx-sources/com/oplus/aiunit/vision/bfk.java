package com.oplus.aiunit.vision;

import android.content.res.Resources;
import android.util.TypedValue;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0004\"\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", "a", "(F)F", "px", "lib_chart_release"}, k = 2, mv = {1, 8, 0})
public final class bfk {
    public static final float a(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }
}

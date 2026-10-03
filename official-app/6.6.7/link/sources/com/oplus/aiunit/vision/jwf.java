package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class jwf {
    public static int a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int b(Context context, float f) {
        return (int) TypedValue.applyDimension(0, f, context.getResources().getDisplayMetrics());
    }
}

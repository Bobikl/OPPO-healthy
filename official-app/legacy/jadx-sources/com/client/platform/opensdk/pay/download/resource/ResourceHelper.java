package com.client.platform.opensdk.pay.download.resource;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes13.dex */
public class ResourceHelper {
    public static final int getDp(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final int getPx(Context context, float f) {
        return (int) TypedValue.applyDimension(0, f, context.getResources().getDisplayMetrics());
    }
}

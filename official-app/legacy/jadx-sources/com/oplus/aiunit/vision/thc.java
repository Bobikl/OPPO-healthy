package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes18.dex */
public class thc {
    public static int a(Context context, int i) {
        return b(context, i, 0);
    }

    public static int b(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}

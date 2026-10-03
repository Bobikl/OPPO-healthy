package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.ColorUtils;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class lh2 {
    public static int a(Context context, int i) {
        if (i == R$attr.couiColorFocus || i == R$attr.couiColorDisable) {
            return l(b(context, i, 0), b(context, R$attr.couiColorContainerTheme, 0));
        }
        return i == R$attr.couiColorFocusOutline ? l(b(context, i, 0), b(context, R$attr.couiColorLabelTheme, 0)) : b(context, i, 0);
    }

    public static int b(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static int c(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static float d(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        return dimension;
    }

    public static float e(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        return f;
    }

    public static int f(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static String g(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        String string = typedArrayObtainStyledAttributes.getString(0);
        typedArrayObtainStyledAttributes.recycle();
        return string;
    }

    public static int h(Context context, int i) {
        return context.getColor(i);
    }

    public static float i(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        try {
            context.getResources().getValue(i, typedValue, true);
            return typedValue.getFloat();
        } catch (Resources.NotFoundException | NumberFormatException e2) {
            Log.e("COUIContextUtil", "getFloat: failed error=" + e2);
            return 0.0f;
        }
    }

    public static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(R$styleable.COUITheme);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUITheme_isCOUIDarkTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public static boolean k(Context context) {
        if (context == null) {
            return false;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(R$styleable.COUITheme);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUITheme_isCOUITheme, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public static int l(int i, int i2) {
        return ColorUtils.setAlphaComponent(i2, Color.alpha(i));
    }
}

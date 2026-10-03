package com.heytap.wearable.support.watchface.common.utils;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public class DensityUtil {
    private static final float SCALE_CONSTANT = 0.5f;
    private static final float STANDARD_HEIGHT = 476.0f;
    private static final float STANDARD_WIDTH = 402.0f;

    public @interface ScaleType {
        public static final int MAX = 1;
        public static final int MIN = 0;
    }

    public static int dp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Rect getBitmapScaleRect(Context context, int i) {
        float fMax;
        int screenWidth = getScreenWidth(context);
        int screenHeight = getScreenHeight(context);
        if (screenWidth == 0 || screenHeight == 0) {
            return new Rect();
        }
        if (i == 0) {
            fMax = Math.min(screenWidth / STANDARD_WIDTH, screenHeight / STANDARD_HEIGHT);
        } else {
            fMax = i == 1 ? Math.max(screenWidth / STANDARD_WIDTH, screenHeight / STANDARD_HEIGHT) : 0.0f;
        }
        float f = screenWidth / 2.0f;
        float f2 = screenHeight / 2.0f;
        float f3 = (STANDARD_WIDTH * fMax) / 2.0f;
        float f4 = (fMax * STANDARD_HEIGHT) / 2.0f;
        return new Rect((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public static Rect getNewRectByDisplayMetrics(Context context, int i, int i2) {
        float screenWidth = getScreenWidth(context) / 2.0f;
        float screenHeight = getScreenHeight(context) / 2.0f;
        float f = i / 2;
        float f2 = i2 / 2;
        return new Rect((int) (screenWidth - f), (int) (screenHeight - f2), (int) (screenWidth + f), (int) (screenHeight + f2));
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int px2dp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int sp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}

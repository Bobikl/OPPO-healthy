package com.heytap.wearable.support.watchface.common.utils;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import com.heytap.databaseengine.model.UserInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorUtils {
    private static final String COLOR_STR_PREFIX = "#";
    private static final int LIGHT_THRESHOLD = 60;

    public static int blendColor(int i, int i2, float f) {
        float f2 = ((i >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float fPow5 = fPow2 + ((((float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f);
        float fPow6 = fPow3 + (f * (((float) Math.pow((i2 & 255) / 255.0f, 2.2d)) - fPow3));
        float fPow7 = ((float) Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f;
        return Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(fPow8) << 8);
    }

    public static int getColor(Bitmap bitmap, RectF rectF) {
        if (bitmap == null || rectF == null) {
            return -1;
        }
        int i = (int) rectF.left;
        int width = ((int) rectF.right) + i;
        int i2 = (int) rectF.top;
        int height = ((int) rectF.bottom) + i2;
        if (i >= bitmap.getWidth() || i2 >= bitmap.getHeight()) {
            return -1;
        }
        if (width > bitmap.getWidth()) {
            width = bitmap.getWidth();
        }
        if (height > bitmap.getHeight()) {
            height = bitmap.getHeight();
        }
        int i3 = 0;
        int i4 = 0;
        while (i < width) {
            for (int i5 = i2; i5 < height; i5++) {
                if (getColorBrightness(bitmap.getPixel(i, i5)) < 60) {
                    i3++;
                } else {
                    i4++;
                }
            }
            i++;
        }
        return i3 > i4 ? -1 : -16777216;
    }

    private static int getColorBrightness(int i) {
        return (int) ((Math.max(Color.red(i), Math.max(Color.green(i), Color.blue(i))) / 255.0f) * 100.0f);
    }

    public static String int2ArgbString(@ColorInt int i) {
        String hexString = Integer.toHexString(i);
        while (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        while (hexString.length() < 8) {
            hexString = UserInfo.SEX_FEMALE + hexString;
        }
        return COLOR_STR_PREFIX + hexString;
    }

    public static String int2RgbString(@ColorInt int i) {
        String hexString = Integer.toHexString(i & 16777215);
        while (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        return COLOR_STR_PREFIX + hexString;
    }

    public static int setAlphaComponent(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (i & 16777215) | (((int) ((f * 255.0f) + 0.5f)) << 24);
    }

    public static int toTransparentColor(int i, float f) {
        return blendColor(i, (((i >> 16) & 255) << 16) | 0 | (((i >> 8) & 255) << 8) | (i & 255), f);
    }
}

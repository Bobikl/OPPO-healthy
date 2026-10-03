package com.heytap.wearable.support.watchface.common.utils;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class TextUtil {
    public static int getTextBaseLine(Paint paint, Rect rect) {
        if (paint == null || rect == null) {
            return 0;
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (int) ((rect.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
    }

    public static float getTextBaseLineByCenter(Paint paint, Rect rect) {
        if (paint == null || rect == null) {
            return 0.0f;
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (((rect.bottom - rect.top) / 2.0f) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f);
    }

    public static int[] getTextBounds(Paint paint, String str) {
        Rect rect = new Rect();
        if (paint == null || TextUtils.isEmpty(str)) {
            return new int[]{0, 0};
        }
        paint.getTextBounds(str, 0, str.length(), rect);
        return new int[]{rect.width(), rect.height()};
    }

    public static int[] getTextStartPoint(Paint paint, float f, float f2, float f3, float f4) {
        int[] iArr = new int[2];
        if (paint != null && f3 >= 0.0f && f4 >= 0.0f) {
            Paint.Align textAlign = paint.getTextAlign();
            if (textAlign == Paint.Align.LEFT) {
                iArr[0] = (int) f;
            } else if (textAlign == Paint.Align.CENTER) {
                iArr[0] = (int) (f + (f3 / 2.0f));
            } else if (textAlign == Paint.Align.RIGHT) {
                iArr[0] = (int) (f + f3);
            }
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            iArr[1] = (int) (((f2 + (f4 / 2.0f)) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
        }
        return iArr;
    }

    public static float getTextBaseLine(Paint paint, RectF rectF) {
        if (paint == null || rectF == null) {
            return 0.0f;
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (rectF.centerY() - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f);
    }
}

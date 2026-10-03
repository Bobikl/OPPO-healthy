package com.oplus.aiunit.vision;

import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class gg2 {
    public static final int G1 = 1;
    public static final int G2 = 2;
    public static final int G3 = 3;
    public static final int G4 = 4;
    public static final int G5 = 5;
    public static final float H1 = 0.9f;
    public static final float H2 = 1.0f;
    public static final float H3 = 1.15f;
    public static final float H4 = 1.35f;
    public static final float H5 = 1.6f;
    public static final String MEDIUM_FONT = "sans-serif-medium";
    public static final float[] SCALE_LEVEL = {0.9f, 1.0f, 1.15f, 1.35f, 1.6f};

    public static void a(Paint paint, boolean z) {
        if (paint != null) {
            if (bn2.c() < 12) {
                paint.setFakeBoldText(z);
            } else {
                paint.setTypeface(z ? Typeface.create("sans-serif-medium", 0) : Typeface.DEFAULT);
            }
        }
    }

    public static void b(TextView textView, boolean z) {
        if (textView != null) {
            if (bn2.c() < 12) {
                textView.getPaint().setFakeBoldText(z);
            } else {
                textView.setTypeface(z ? Typeface.create("sans-serif-medium", 0) : Typeface.DEFAULT);
            }
        }
    }

    public static void c(@NonNull TextView textView, int i) {
        float textSize = textView.getTextSize();
        Configuration configuration = textView.getResources().getConfiguration();
        textView.getResources().getDisplayMetrics();
        float f = configuration.fontScale;
        int i2 = configuration.densityDpi;
        if (i2 == 300 || i2 == 296 || configuration.smallestScreenWidthDp <= 210) {
            f = 1.0f;
        }
        textView.setTextSize(0, g(textSize, f, i));
    }

    public static int d(TextView textView, int i, int i2, int i3, int i4) {
        if (i <= 0) {
            bj2.c("COUIChangeTextUtil", "Line count should be greater than 0!");
            return 0;
        }
        if (i2 < 0 || i3 < 0) {
            bj2.c("COUIChangeTextUtil", "Width should be greater than 0!");
            return 0;
        }
        if (i2 > i3) {
            bj2.c("COUIChangeTextUtil", "Max width should be greater than min width!");
            return 0;
        }
        if (i4 < 0) {
            bj2.c("COUIChangeTextUtil", "Padding should be greater than 0!");
            return 0;
        }
        int i5 = i2 - i4;
        int i6 = i3 - i4;
        if (i5 < 0) {
            bj2.c("COUIChangeTextUtil", "Min width should be greater than horizontal padding!");
            return 0;
        }
        int i7 = (i5 + i6) / 2;
        while (i5 <= i6) {
            i7 = (i5 + i6) / 2;
            int iH = h(textView, i7, 0);
            int i8 = i7 - 1;
            int iH2 = h(textView, i8, 0);
            if (iH <= i && iH2 > i) {
                break;
            }
            if (iH2 <= i) {
                i6 = i8;
            } else {
                i5 = i7 + 1;
            }
        }
        return i7 + i4;
    }

    public static float e(float f, float f2) {
        return f2 < 1.15f ? f * 1.0f : f * 1.15f;
    }

    public static float f(float f, float f2) {
        float fRound = Math.round(f / f2);
        if (f2 <= 1.0f) {
            return f;
        }
        return f2 < 1.6f ? fRound * 1.15f : fRound * 1.15f;
    }

    public static float g(float f, float f2, int i) {
        if (i < 2) {
            return f;
        }
        float[] fArr = SCALE_LEVEL;
        if (i > fArr.length) {
            i = fArr.length;
        }
        float fRound = Math.round(f / f2);
        if (i == 2) {
            return f2 < 1.15f ? fRound * 1.0f : fRound * 1.15f;
        }
        if (i != 3) {
            float f3 = fArr[i - 1];
            return f2 > f3 ? fRound * f3 : fRound * f2;
        }
        if (f2 < 1.15f) {
            return fRound * 1.0f;
        }
        return f2 < 1.6f ? fRound * 1.15f : fRound * 1.35f;
    }

    public static int h(TextView textView, int i, int i2) {
        if (i2 < 0 || i <= i2) {
            bj2.c("COUIChangeTextUtil", "Illegal width or padding!");
            return 0;
        }
        if (textView == null) {
            return 0;
        }
        return StaticLayout.Builder.obtain(textView.getText(), 0, textView.getText().length(), textView.getPaint(), i - i2).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).build().getLineCount();
    }
}

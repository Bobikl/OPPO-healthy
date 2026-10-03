package com.oplus.aiunit.vision;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public class ugc {
    public static final int G1 = 1;
    public static final int G2 = 2;
    public static final int G3 = 3;
    public static final int G4 = 4;
    public static final int G5 = 5;
    public static final int GN = 6;
    public static final float H1 = 0.9f;
    public static final float H2 = 1.0f;
    public static final float H3 = 1.1f;
    public static final float H4 = 1.25f;
    public static final float H5 = 1.45f;
    public static final float H6 = 1.65f;
    public static final String MEDIUM_FONT = "sans-serif-medium";
    public static final float NEWH3 = 1.15f;
    public static final float[] SCALE_LEVEL = {0.9f, 1.0f, 1.1f, 1.25f, 1.45f, 1.65f};

    public static void a(Paint paint, boolean z) {
        if (paint != null) {
            if (cmc.b() < 12) {
                paint.setFakeBoldText(z);
            } else {
                paint.setTypeface(z ? Typeface.create("sans-serif-medium", 0) : Typeface.DEFAULT);
            }
        }
    }

    public static void b(@NonNull TextView textView, int i) {
        textView.setTextSize(0, d(textView.getTextSize(), textView.getResources().getConfiguration().fontScale, i));
    }

    public static float c(float f, float f2) {
        float fRound = Math.round(f / f2);
        if (f2 <= 1.0f) {
            return f;
        }
        return f2 < 1.65f ? fRound * 1.15f : fRound * 1.15f;
    }

    public static float d(float f, float f2, int i) {
        if (i < 2) {
            return f;
        }
        float[] fArr = SCALE_LEVEL;
        if (i > fArr.length) {
            i = fArr.length;
        }
        float fRound = Math.round(f / f2);
        if (i == 2) {
            return f2 < 1.1f ? fRound * 1.0f : fRound * 1.1f;
        }
        if (i != 3) {
            float f3 = fArr[i - 1];
            return f2 > f3 ? fRound * f3 : fRound * f2;
        }
        if (f2 < 1.1f) {
            return fRound * 1.0f;
        }
        return f2 < 1.45f ? fRound * 1.1f : fRound * 1.25f;
    }
}

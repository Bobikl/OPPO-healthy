package com.oplus.aiunit.vision;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.widget.TextView;
import com.heytap.nearx.uikit.utils.NearDeviceUtil;

/* JADX INFO: loaded from: classes18.dex */
public class z63 {
    public static final int G1 = 1;
    public static final int G2 = 2;
    public static final int G3 = 3;
    public static final int G4 = 4;
    public static final int G5 = 5;
    public static final int GN = 6;
    public static final String MEDIUM_FONT = "sans-serif-medium";
    public static final float[] SCALE_LEVEL = {0.9f, 1.0f, 1.1f, 1.25f, 1.45f, 1.65f};

    public static void a(Paint paint, boolean z) {
        if (paint != null) {
            if (NearDeviceUtil.b() < 12) {
                paint.setFakeBoldText(z);
            } else {
                paint.setTypeface(z ? Typeface.create("sans-serif-medium", 0) : Typeface.DEFAULT);
            }
        }
    }

    public static void b(TextView textView, boolean z) {
        if (textView != null) {
            if (NearDeviceUtil.b() < 12) {
                textView.getPaint().setFakeBoldText(z);
            } else {
                textView.setTypeface(z ? Typeface.create("sans-serif-medium", 0) : Typeface.DEFAULT);
            }
        }
    }

    public static float c(float f, float f2, int i) {
        if (i < 2) {
            return f;
        }
        float[] fArr = SCALE_LEVEL;
        if (i > fArr.length) {
            i = fArr.length;
        }
        float f3 = f / f2;
        if (i == 2) {
            return f2 < 1.1f ? f3 * 1.0f : f3 * 1.1f;
        }
        if (i != 3) {
            float f4 = fArr[i - 1];
            return f2 > f4 ? f3 * f4 : f3 * f2;
        }
        if (f2 < 1.1f) {
            return f3 * 1.0f;
        }
        return f2 < 1.45f ? f3 * 1.1f : f3 * 1.25f;
    }
}

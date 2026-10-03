package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: classes13.dex */
public class ph2 {
    public static boolean a(Context context) {
        return 32 == (context.getResources().getConfiguration().uiMode & 48);
    }

    public static int b(int i, float f) {
        float[] fArr = new float[3];
        ColorUtils.colorToHSL(i, fArr);
        float fMax = Math.max(f, 1.0f - fArr[2]);
        if (fMax >= fArr[2]) {
            return i;
        }
        fArr[2] = fMax;
        return ColorUtils.HSLToColor(fArr);
    }

    public static void c(View view, boolean z) {
        view.setForceDarkAllowed(z);
    }
}

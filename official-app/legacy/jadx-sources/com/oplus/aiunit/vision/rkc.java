package com.oplus.aiunit.vision;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.MainThread;
import com.heytap.nearx.uikit.widget.shape.NearShapePath;

/* JADX INFO: loaded from: classes18.dex */
@MainThread
public class rkc {
    public static rkc b;
    public Path a = new Path();

    public static rkc a() {
        if (b == null) {
            b = new rkc();
        }
        return b;
    }

    public Path b(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, boolean z3, boolean z4) {
        return NearShapePath.getRoundRectPath(this.a, new RectF(f, f2, f3, f4), f5, z, z2, z3, z4);
    }

    public Path c(Rect rect, float f) {
        return d(new RectF(rect), f);
    }

    public Path d(RectF rectF, float f) {
        return NearShapePath.getRoundRectPath(this.a, rectF, f);
    }
}

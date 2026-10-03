package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.heytap.health.watchface.business.creation.category.classic.bean.ClassicStyleBean;

/* JADX INFO: loaded from: classes19.dex */
public class ge3 {
    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    public static Bitmap a(i11 i11Var, ClassicStyleBean classicStyleBean) {
        Bitmap bitmapU;
        if (TextUtils.isEmpty(classicStyleBean.getBackground())) {
            bitmapU = null;
        } else {
            bitmapU = kd3.a(i11Var, "bg_" + classicStyleBean.getSeriesId() + "_" + classicStyleBean.getBackground());
            if (bitmapU == null) {
                bitmapU = null;
            }
        }
        if (!TextUtils.isEmpty(classicStyleBean.getScale())) {
            Bitmap bitmapA = kd3.a(i11Var, "scale_" + classicStyleBean.getSeriesId() + "_" + classicStyleBean.getScale());
            if (bitmapA != null) {
                bitmapU = cg1.u(bitmapU, bitmapA);
            }
            cg1.A(bitmapA);
        }
        if (!TextUtils.isEmpty(classicStyleBean.getWidgetId())) {
            Bitmap bitmapA2 = kd3.a(i11Var, "widget_" + classicStyleBean.getSeriesId() + "_" + classicStyleBean.getWidgetId());
            if (bitmapA2 != null) {
                bitmapU = cg1.u(bitmapU, bitmapA2);
            }
            cg1.A(bitmapA2);
        }
        if (!TextUtils.isEmpty(classicStyleBean.getPointer())) {
            Bitmap bitmapA3 = kd3.a(i11Var, "pointer_" + classicStyleBean.getSeriesId() + "_" + classicStyleBean.getPointer());
            if (bitmapA3 != null) {
                bitmapU = cg1.u(bitmapU, bitmapA3);
            }
            cg1.A(bitmapA3);
        }
        return bitmapU;
    }
}

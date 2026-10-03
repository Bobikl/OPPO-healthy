package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.TextOptions;

/* JADX INFO: loaded from: classes12.dex */
public final class kom {
    public static Paint a = new Paint();
    public static Rect b = new Rect();

    public static float a(int i, boolean z) {
        if (z) {
            if (i != 1) {
                return i != 2 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }
        if (i != 8) {
            return i != 16 ? 0.5f : 1.0f;
        }
        return 0.0f;
    }

    public static MarkerOptions b(TextOptions textOptions) {
        if (textOptions == null) {
            return null;
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(textOptions.getPosition());
        markerOptions.visible(textOptions.isVisible());
        markerOptions.zIndex(textOptions.getZIndex());
        markerOptions.rotateAngle(textOptions.getRotate());
        markerOptions.icon(c(textOptions));
        markerOptions.anchor(a(textOptions.getAlignX(), true), a(textOptions.getAlignY(), false));
        return markerOptions;
    }

    public static BitmapDescriptor c(TextOptions textOptions) {
        if (textOptions == null) {
            return null;
        }
        a.setTypeface(textOptions.getTypeface());
        a.setSubpixelText(true);
        a.setAntiAlias(true);
        a.setStrokeWidth(5.0f);
        a.setStrokeCap(Paint.Cap.ROUND);
        a.setTextSize(textOptions.getFontSize());
        a.setTextAlign(Paint.Align.CENTER);
        a.setColor(textOptions.getFontColor());
        Paint.FontMetrics fontMetrics = a.getFontMetrics();
        int i = (int) (fontMetrics.descent - fontMetrics.ascent);
        int i2 = (int) (((i - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
        if (textOptions.getText() != null) {
            a.getTextBounds(textOptions.getText(), 0, textOptions.getText().length(), b);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(b.width() + 6, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(textOptions.getBackgroundColor());
        if (textOptions.getText() != null) {
            canvas.drawText(textOptions.getText(), b.centerX() + 3, i2, a);
        }
        return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
    }
}

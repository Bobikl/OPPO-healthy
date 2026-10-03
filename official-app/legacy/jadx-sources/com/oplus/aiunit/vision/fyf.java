package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes15.dex */
public class fyf implements hz9 {
    public float a;
    public float b;

    public fyf(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // com.oplus.aiunit.vision.hz9
    public Bitmap a(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Path path = new Path();
        path.lineTo(0.0f, this.b);
        path.lineTo(this.a, 0.0f);
        path.moveTo(0.0f, this.b);
        path.addArc(new RectF(0.0f, 0.0f, this.a * 2.0f, this.b * 2.0f), 180.0f, 90.0f);
        canvas.drawPath(path, paint);
        path.reset();
        path.moveTo(bitmap.getWidth(), 0.0f);
        path.lineTo(bitmap.getWidth() - this.a, 0.0f);
        path.lineTo(bitmap.getWidth(), this.b);
        path.addArc(new RectF(bitmap.getWidth() - (this.a * 2.0f), 0.0f, bitmap.getWidth(), this.b * 2.0f), 270.0f, 90.0f);
        canvas.drawPath(path, paint);
        path.reset();
        path.moveTo(0.0f, bitmap.getHeight());
        path.lineTo(this.a, bitmap.getHeight());
        path.lineTo(0.0f, bitmap.getHeight() - this.b);
        path.addArc(new RectF(0.0f, bitmap.getHeight() - (this.b * 2.0f), this.a * 2.0f, bitmap.getHeight()), 90.0f, 90.0f);
        canvas.drawPath(path, paint);
        path.reset();
        path.moveTo(bitmap.getWidth(), bitmap.getHeight());
        path.lineTo(bitmap.getWidth(), bitmap.getHeight() - this.b);
        path.lineTo(bitmap.getWidth() - this.a, bitmap.getHeight());
        path.addArc(new RectF(bitmap.getWidth() - (this.a * 2.0f), bitmap.getHeight() - (this.b * 2.0f), bitmap.getWidth(), bitmap.getHeight()), 0.0f, 90.0f);
        canvas.drawPath(path, paint);
        return bitmap;
    }
}

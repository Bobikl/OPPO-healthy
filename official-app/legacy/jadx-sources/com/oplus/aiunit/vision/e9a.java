package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e9a {
    public List<Paint> a = new ArrayList();
    public List<Path> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10824c;
    public int d;

    public e9a(int i, int i2) {
        this.f10824c = i;
        this.d = i2;
    }

    public void a(float f, float f2, float f3, int i, int i2, float f4, Path path) {
        Paint paint = new Paint();
        paint.setColor(i2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f4);
        paint.setShadowLayer(f, f2, f3, i);
        this.a.add(paint);
        this.b.add(path);
    }

    public Bitmap b() {
        int i;
        int i2 = this.f10824c;
        if (i2 <= 0 || (i = this.d) <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            if (this.b.get(i3) != null && this.a.get(i3) != null) {
                canvas.clipPath(this.b.get(i3));
                canvas.drawPath(this.b.get(i3), this.a.get(i3));
            }
        }
        canvas.restoreToCount(iSaveLayer);
        return bitmapCreateBitmap;
    }

    public void c() {
        List<Paint> list = this.a;
        if (list != null) {
            list.clear();
        }
        List<Path> list2 = this.b;
        if (list2 != null) {
            list2.clear();
        }
    }
}

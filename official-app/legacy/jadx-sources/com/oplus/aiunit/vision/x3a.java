package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes18.dex */
public class x3a {
    public static volatile x3a f;
    public Paint a;
    public Bitmap b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Canvas f18488c;
    public SparseArray<Bitmap> d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<Canvas> f18489e = new SparseArray<>();

    public static x3a a() {
        if (f == null) {
            synchronized (x3a.class) {
                if (f == null) {
                    f = new x3a();
                }
            }
        }
        return f;
    }

    public final Paint b(float f2) {
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f2);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.postConcat(colorMatrix);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        return paint;
    }

    public Bitmap c(Bitmap bitmap, float f2) {
        if (this.d == null) {
            this.d = new SparseArray<>();
        }
        if (this.f18489e == null) {
            this.f18489e = new SparseArray<>();
        }
        if (this.a == null) {
            this.a = b(f2);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmap2 = this.d.get(height);
        if (bitmap2 != null && bitmap2.getWidth() == width && bitmap2.getHeight() == height) {
            this.b = bitmap2;
            this.f18488c = this.f18489e.get(height);
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.b = bitmapCreateBitmap;
            this.d.put(height, bitmapCreateBitmap);
            Canvas canvas = new Canvas(this.b);
            this.f18489e.put(height, canvas);
            this.f18488c = canvas;
        }
        if (this.f18488c == null && this.b != null) {
            this.f18488c = new Canvas(this.b);
        }
        this.f18488c.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
        return this.b;
    }

    public void d() {
        Bitmap bitmap = this.b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.b.recycle();
            this.b = null;
        }
        SparseArray<Bitmap> sparseArray = this.d;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                Bitmap bitmapValueAt = this.d.valueAt(i);
                if (bitmapValueAt != null && !bitmapValueAt.isRecycled()) {
                    bitmapValueAt.recycle();
                }
            }
        }
        SparseArray<Bitmap> sparseArray2 = this.d;
        if (sparseArray2 != null) {
            sparseArray2.clear();
            this.d = null;
        }
        if (f != null) {
            f = null;
        }
    }
}

package com.coui.appcompat.lockview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
class InnerShadowHelper {
    List<Paint> mShadowLayerPaints = new ArrayList();
    List<Path> mShadowLayerPaths = new ArrayList();
    int mViewHeight;
    int mViewWidth;

    public InnerShadowHelper(int i, int i2) {
        this.mViewWidth = i;
        this.mViewHeight = i2;
    }

    public void addInnerShadowLayer(float f, float f2, float f3, int i, int i2, float f4, Path path) {
        Paint paint = new Paint();
        paint.setColor(i2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f4);
        paint.setShadowLayer(f, f2, f3, i);
        this.mShadowLayerPaints.add(paint);
        this.mShadowLayerPaths.add(path);
    }

    public Bitmap createInnerShadowBitmap() {
        int i;
        int i2 = this.mViewWidth;
        if (i2 <= 0 || (i = this.mViewHeight) <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        for (int i3 = 0; i3 < this.mShadowLayerPaths.size(); i3++) {
            if (this.mShadowLayerPaths.get(i3) != null && this.mShadowLayerPaints.get(i3) != null) {
                canvas.clipPath(this.mShadowLayerPaths.get(i3));
                canvas.drawPath(this.mShadowLayerPaths.get(i3), this.mShadowLayerPaints.get(i3));
            }
        }
        canvas.restoreToCount(iSaveLayer);
        return bitmapCreateBitmap;
    }

    public void reset() {
        List<Paint> list = this.mShadowLayerPaints;
        if (list != null) {
            list.clear();
        }
        List<Path> list2 = this.mShadowLayerPaths;
        if (list2 != null) {
            list2.clear();
        }
    }

    public void setInnerShadowBitmapSize(int i, int i2) {
        this.mViewWidth = i;
        this.mViewHeight = i2;
    }
}

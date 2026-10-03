package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class bjf implements mo9 {
    public Rect a;

    public bjf(Rect rect) {
        this.a = rect;
        StringBuilder sb = new StringBuilder();
        sb.append("mRect: ");
        sb.append(this.a.toString());
    }

    @Override // com.oplus.aiunit.vision.mo9
    public void a(View view, mo9.a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("view.getMeasuredHeight(): ");
        sb.append(view.getMeasuredHeight());
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("view.getMeasuredHeight(): ");
        sb2.append(view.getMeasuredHeight());
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getHeight() + view.getTop());
        Rect rect = this.a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.right, rect.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.draw(canvas);
        Rect rect2 = this.a;
        Rect rect3 = new Rect(0, 0, rect2.right - rect2.left, rect2.bottom - rect2.top);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(rect3.width(), rect3.height(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmapCreateBitmap2);
        canvas.drawBitmap(bitmapCreateBitmap, this.a, rect3, new Paint());
        aVar.a(bitmapCreateBitmap2);
    }
}

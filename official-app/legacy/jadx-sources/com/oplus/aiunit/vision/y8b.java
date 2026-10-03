package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class y8b implements mo9 {
    @Override // com.oplus.aiunit.vision.mo9
    public void a(View view, mo9.a aVar) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, view.getMeasuredHeight(), new Paint());
        view.draw(canvas);
        view.requestLayout();
        aVar.a(bitmapCreateBitmap);
    }
}

package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class nvl implements mo9 {
    public int a;

    public nvl(int i) {
        this.a = i;
    }

    @Override // com.oplus.aiunit.vision.mo9
    public void a(View view, mo9.a aVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(this.a);
        view.draw(canvas);
        aVar.a(bitmapCreateBitmap);
    }
}

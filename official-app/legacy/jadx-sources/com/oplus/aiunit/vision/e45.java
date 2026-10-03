package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class e45 implements mo9 {
    @Override // com.oplus.aiunit.vision.mo9
    public void a(View view, mo9.a aVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        aVar.a(bitmapCreateBitmap);
    }
}

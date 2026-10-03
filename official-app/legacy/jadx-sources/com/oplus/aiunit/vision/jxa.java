package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class jxa implements mo9 {
    public int a;
    public int b;

    public jxa(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.oplus.aiunit.vision.mo9
    public void a(View view, mo9.a aVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        LinearGradient linearGradient = new LinearGradient(view.getWidth() / 2.0f, 0.0f, view.getWidth() / 2.0f, view.getHeight(), this.a, this.b, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
        view.draw(canvas);
        aVar.a(bitmapCreateBitmap);
    }
}

package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public final class ei extends View {
    public static final int a = Color.argb(255, 235, 235, 235);
    public static final int b = Color.argb(255, 21, 21, 21);
    public Paint i;

    public ei(Context context) {
        super(context);
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(true);
        this.i.setColor(a);
    }

    public final void a() {
        setVisibility(8);
    }

    public final void b(int i) {
        Paint paint = this.i;
        if (paint != null) {
            paint.setColor(i);
            try {
                postInvalidate();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.i);
    }
}

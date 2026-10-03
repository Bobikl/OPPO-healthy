package com.heytap.health.watchface.business.creation.category.paint.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintColorInView extends View {
    public Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6811j;
    public int k;

    public HandPaintColorInView(Context context) {
        this(context, null);
    }

    public final void a() {
        this.i.setAntiAlias(true);
        this.i.setStyle(Paint.Style.FILL);
        this.i.setStrokeWidth(0.0f);
    }

    public void b(int i, int i2) {
        this.f6811j = i;
        this.k = i2;
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = measuredWidth;
        float f2 = measuredHeight;
        this.i.setShader(new LinearGradient(f, f2, 0.0f, 0.0f, this.f6811j, this.k, Shader.TileMode.CLAMP));
        canvas.drawCircle(f / 2.0f, f2 / 2.0f, Math.min(measuredWidth, measuredHeight) / 2.0f, this.i);
    }

    public HandPaintColorInView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public HandPaintColorInView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Paint();
        this.f6811j = Color.parseColor("#F3B37B");
        this.k = Color.parseColor("#FFEDDB");
        a();
    }
}

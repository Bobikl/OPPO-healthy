package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.autonavi.amap.mapcore.tools.GlMapUtil;

/* JADX INFO: loaded from: classes10.dex */
public class b extends View {
    public Rect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f20282j;

    public b(Context context) {
        super(context);
        b();
    }

    public Rect a() {
        if (this.i == null) {
            this.i = new Rect();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int iMin = Math.min(Math.min((measuredHeight - 60) - 80, measuredWidth), GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH);
            int i = (measuredWidth - iMin) / 2;
            int i2 = (measuredHeight - iMin) / 2;
            this.i.set(i, i2, i + iMin, iMin + i2);
        }
        return this.i;
    }

    public final void b() {
        this.f20282j = new Paint();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rectA = a();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f20282j.setStyle(Paint.Style.FILL);
        this.f20282j.setColor(Color.argb(100, 0, 0, 0));
        float f = measuredWidth;
        canvas.drawRect(0.0f, 0.0f, f, rectA.top, this.f20282j);
        canvas.drawRect(0.0f, rectA.bottom, f, measuredHeight, this.f20282j);
        canvas.drawRect(0.0f, rectA.top, rectA.left, rectA.bottom, this.f20282j);
        canvas.drawRect(rectA.right, rectA.top, f, rectA.bottom, this.f20282j);
        canvas.drawColor(Color.argb(100, 0, 0, 0));
        this.f20282j.setStyle(Paint.Style.STROKE);
        this.f20282j.setColor(-1);
        canvas.drawRect(rectA.left, rectA.top, rectA.right - 1, rectA.bottom, this.f20282j);
    }
}

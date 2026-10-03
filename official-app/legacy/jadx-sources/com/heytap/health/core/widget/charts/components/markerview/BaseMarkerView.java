package com.heytap.health.core.widget.charts.components.markerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.utils.MPPointF;
import com.oplus.aiunit.vision.hfk;

/* JADX INFO: loaded from: classes16.dex */
public class BaseMarkerView extends MarkerView {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3785j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3786l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3787n;
    public Paint o;
    public float p;

    public BaseMarkerView(Context context, int i) {
        super(context, i);
        this.i = true;
        this.f3785j = -16711936;
        this.f3786l = 0.0f;
        this.m = 0.0f;
        this.f3787n = 0.0f;
        this.o = new Paint();
        this.p = 1.0f;
        this.k = hfk.a(context, 0.7f);
    }

    public void a(Canvas canvas, float f, float f2, float f3) {
        StringBuilder sb = new StringBuilder();
        sb.append("animateAlpha alpha:");
        sb.append(f);
        this.p = f;
        this.f3787n = f3;
        this.m = f2;
        if (getChildCount() < 1) {
            return;
        }
        getBackground().setAlpha(c(f));
        getChildAt(0).setAlpha(c(f));
        draw(canvas, f2, f3);
    }

    public void b(Canvas canvas, float f, float f2) {
        int iSave = canvas.save();
        this.o.setFlags(1);
        this.o.setColor(this.f3785j);
        this.o.setAlpha(c(this.p));
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeWidth(this.k);
        Path path = new Path();
        path.moveTo(f, f2);
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        if (offsetForDrawingAtPoint != null) {
            path.lineTo(f, f2 + offsetForDrawingAtPoint.y + getHeight());
        }
        canvas.drawPath(path, this.o);
        canvas.restoreToCount(iSave);
    }

    public int c(float f) {
        if (f > 1.0f || f < 0.0f) {
            return 255;
        }
        return (int) (f * 255.0f);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f, float f2) {
        this.m = f;
        this.f3787n = f2;
        if (this.i) {
            b(canvas, f, f2);
        }
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        int iSave = canvas.save();
        if (offsetForDrawingAtPoint != null) {
            if (getChartView() == null) {
                canvas.translate(f + offsetForDrawingAtPoint.x, f2 + offsetForDrawingAtPoint.y);
            } else {
                float f3 = offsetForDrawingAtPoint.x;
                float f4 = f + f3;
                float f5 = this.f3786l;
                if (f4 < f5) {
                    canvas.translate(f5, f2 + offsetForDrawingAtPoint.y);
                } else if (f3 + f > (getChartView().getWidth() - this.f3786l) - getWidth()) {
                    canvas.translate((getChartView().getWidth() - this.f3786l) - getWidth(), f2 + offsetForDrawingAtPoint.y);
                } else {
                    canvas.translate(f + offsetForDrawingAtPoint.x, f2 + offsetForDrawingAtPoint.y);
                }
            }
        }
        draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public int getIndicatorLineColor() {
        return this.f3785j;
    }

    public float getIndicatorLineWidth() {
        return this.k;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void setIndicatorLineColor(int i) {
        this.f3785j = i;
    }

    public void setIndicatorLineWidth(float f) {
        this.k = f;
    }

    public void setShowIndicatorLine(boolean z) {
        this.i = z;
    }

    public void setValueMarkerOffset(float f) {
        this.f3786l = f;
    }
}

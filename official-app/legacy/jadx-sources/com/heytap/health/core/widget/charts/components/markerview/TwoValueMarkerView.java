package com.heytap.health.core.widget.charts.components.markerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.heytap.health.base.R$color;
import com.heytap.health.lib_chart.R$drawable;
import com.heytap.health.lib_chart.R$id;
import com.heytap.health.lib_chart.R$layout;
import com.oplus.aiunit.vision.hfk;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.yfb;

/* JADX INFO: loaded from: classes16.dex */
public class TwoValueMarkerView extends BaseMarkerView {
    public int A;
    public float q;
    public yfb r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public int x;
    public int y;
    public int z;

    public TwoValueMarkerView(@NonNull Context context, @NonNull yfb yfbVar) {
        super(context, R$layout.lib_core_charts_top_2_value_marker_view);
        Context context2 = getContext();
        int i = R$color.lib_base_white_85alpha;
        this.x = ContextCompat.getColor(context2, i);
        this.y = ContextCompat.getColor(getContext(), i);
        Context context3 = getContext();
        int i2 = com.heytap.health.lib_chart.R$color.lib_chart_heart_rate_day_line_circle_color;
        this.z = ContextCompat.getColor(context3, i2);
        this.A = ContextCompat.getColor(getContext(), i2);
        this.q = hfk.a(context, 2.0f);
        this.r = yfbVar;
        this.s = (TextView) findViewById(R$id.title);
        this.t = (TextView) findViewById(R$id.left_title);
        this.v = (TextView) findViewById(R$id.left_value);
        this.u = (TextView) findViewById(R$id.right_title);
        this.w = (TextView) findViewById(R$id.right_value);
        if (qe0.y(getContext())) {
            this.s.setTextColor(this.z);
            this.t.setTextColor(this.A);
            this.v.setTextColor(this.A);
            this.u.setTextColor(this.A);
            this.w.setTextColor(this.A);
            setBackgroundResource(R$drawable.lib_core_charts_commom_marker_view_bg_night);
            setIndicatorLineColor(ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_chart_common_marker_view_night_line));
        } else {
            this.s.setTextColor(this.x);
            this.t.setTextColor(this.y);
            this.v.setTextColor(this.y);
            this.u.setTextColor(this.y);
            this.w.setTextColor(this.y);
            setBackgroundResource(R$drawable.lib_core_charts_commom_marker_view_bg);
            setIndicatorLineColor(ContextCompat.getColor(getContext(), R$color.lib_base_black_85alpha));
        }
        setValueMarkerOffset(Utils.convertDpToPixel(6.0f));
    }

    @Override // com.heytap.health.core.widget.charts.components.markerview.BaseMarkerView
    public void b(Canvas canvas, float f, float f2) {
        int iSave = canvas.save();
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setColor(this.f3785j);
        paint.setAlpha(c(this.p));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.k);
        Path path = new Path();
        path.moveTo(f, f2);
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        if (offsetForDrawingAtPoint != null) {
            path.lineTo(f, f2 + offsetForDrawingAtPoint.y + getHeight());
        }
        canvas.drawPath(path, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        return new MPPointF(-(getWidth() / 2.0f), -getHeight());
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF offsetForDrawingAtPoint = super.getOffsetForDrawingAtPoint(f, f2);
        if (offsetForDrawingAtPoint != null) {
            offsetForDrawingAtPoint.y = (-f2) + this.q;
        }
        return offsetForDrawingAtPoint;
    }

    public float getOffsetTop() {
        return this.q;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        this.s.setText(this.r.e(entry));
        this.t.setText(this.r.a(entry));
        this.v.setText(this.r.b(entry));
        this.u.setText(this.r.c(entry));
        this.w.setText(this.r.d(entry));
        super.refreshContent(entry, highlight);
    }

    public void setOffsetTop(float f) {
        this.q = f;
    }
}

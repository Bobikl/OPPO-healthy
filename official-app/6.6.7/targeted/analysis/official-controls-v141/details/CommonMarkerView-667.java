package com.heytap.health.core.widget.charts.components.markerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.heytap.health.base.R$color;
import com.heytap.health.lib_chart.R$drawable;
import com.heytap.health.lib_chart.R$id;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.ohb;

/* JADX INFO: loaded from: classes16.dex */
public class CommonMarkerView extends TopMarkerView {
    public Paint A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float v;
    public float w;
    public ohb x;
    public TextView y;
    public TextView z;

    public CommonMarkerView(@NonNull Context context, @NonNull ohb ohbVar, float f) {
        this(context, ohbVar);
        this.w = f;
    }

    @Override // com.heytap.health.core.widget.charts.components.markerview.BaseMarkerView
    public void b(Canvas canvas, float f, float f2) {
        int iSave = canvas.save();
        this.A.setColor(this.f4825j);
        this.A.setAlpha(c(this.p));
        this.A.setStrokeWidth(this.k);
        Path path = new Path();
        path.moveTo(f, f2 - this.w);
        MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
        if (offsetForDrawingAtPoint != null) {
            path.lineTo(f, f2 + offsetForDrawingAtPoint.y + getHeight());
        }
        canvas.drawPath(path, this.A);
        canvas.restoreToCount(iSave);
    }

    public void d(Boolean bool) {
        if (bool.booleanValue()) {
            this.y.setVisibility(0);
        } else {
            this.y.setVisibility(8);
        }
    }

    public void setContentColor(int i) {
        this.C = i;
        this.z.setTextColor(i);
    }

    public void setContentSingleLine(boolean z) {
        this.z.setSingleLine(z);
    }

    public void setTitleColor(int i) {
        this.B = i;
        this.y.setTextColor(i);
    }

    public CommonMarkerView(@NonNull Context context, @NonNull ohb ohbVar) {
        super(context, ohbVar);
        this.B = ContextCompat.getColor(getContext(), R$color.lib_base_white_85alpha);
        this.C = ContextCompat.getColor(getContext(), R$color.lib_base_white);
        Context context2 = getContext();
        int i = com.heytap.health.lib_chart.R$color.lib_chart_heart_rate_day_line_circle_color;
        this.D = ContextCompat.getColor(context2, i);
        this.E = ContextCompat.getColor(getContext(), i);
        this.v = jjk.a(context, 4.0f);
        this.x = ohbVar;
        this.y = (TextView) findViewById(R$id.title);
        this.z = (TextView) findViewById(R$id.content);
        if (if0.y(getContext())) {
            this.y.setTextColor(this.D);
            this.z.setTextColor(this.E);
            setBackgroundResource(R$drawable.lib_core_charts_commom_marker_view_bg_night);
            setIndicatorLineColor(ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_chart_common_marker_view_night_line));
        } else {
            this.y.setTextColor(this.B);
            this.z.setTextColor(this.C);
            setBackgroundResource(R$drawable.lib_core_charts_commom_marker_view_bg);
            setIndicatorLineColor(ContextCompat.getColor(getContext(), R$color.lib_base_black_85alpha));
        }
        setValueMarkerOffset(Utils.convertDpToPixel(2.0f));
        Paint paint = new Paint();
        this.A = paint;
        paint.setFlags(1);
        this.A.setStyle(Paint.Style.STROKE);
    }
}
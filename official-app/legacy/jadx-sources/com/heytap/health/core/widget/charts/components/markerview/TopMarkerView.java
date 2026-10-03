package com.heytap.health.core.widget.charts.components.markerview;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.heytap.health.lib_chart.R$drawable;
import com.heytap.health.lib_chart.R$id;
import com.heytap.health.lib_chart.R$layout;
import com.oplus.aiunit.vision.hfk;
import com.oplus.aiunit.vision.zfb;

/* JADX INFO: loaded from: classes16.dex */
public class TopMarkerView extends BaseMarkerView {
    public float q;
    public zfb r;
    public TextView s;
    public TextView t;
    public Entry u;

    public TopMarkerView(@NonNull Context context, @NonNull zfb zfbVar) {
        super(context, R$layout.lib_core_charts_top_marker_view);
        this.q = hfk.a(context, 2.0f);
        this.r = zfbVar;
        setBackgroundResource(R$drawable.lib_core_charts_top_marker_view_bg);
        this.s = (TextView) findViewById(R$id.title);
        this.t = (TextView) findViewById(R$id.content);
    }

    public Entry getCurrentEntry() {
        return this.u;
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
        if (entry == null || entry == this.u) {
            return;
        }
        this.s.setText(this.r.b(entry));
        this.t.setText(this.r.a(entry));
        super.refreshContent(entry, highlight);
        this.u = entry;
    }

    public void setCurrentEntry(Entry entry) {
        this.u = entry;
    }

    public void setOffsetTop(float f) {
        this.q = f;
    }
}

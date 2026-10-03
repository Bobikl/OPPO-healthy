package com.heytap.health.core.widget.charts.components.markerview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.heytap.health.lib_chart.R$drawable;
import com.heytap.health.lib_chart.R$id;
import com.heytap.health.lib_chart.R$layout;
import com.oplus.aiunit.vision.dj8;
import com.oplus.aiunit.vision.euk;

/* JADX INFO: loaded from: classes16.dex */
public class ValueMarkerView extends BaseMarkerView {
    public TextView q;
    public int r;
    public float s;
    public euk<Entry> t;
    public int u;
    public int v;

    public ValueMarkerView(Context context, euk<Entry> eukVar) {
        super(context, R$layout.lib_core_charts_value_marker_view);
        this.r = Color.parseColor("#FF2FE872");
        this.s = 0.0f;
        this.u = 0;
        this.v = 0;
        setShowIndicatorLine(false);
        this.t = eukVar;
        TextView textView = (TextView) findViewById(R$id.content);
        this.q = textView;
        int iCalcTextWidth = Utils.calcTextWidth(textView.getPaint(), dj8.PRODUCT_ID);
        this.u = iCalcTextWidth;
        this.q.setMinWidth(iCalcTextWidth + ((int) Utils.convertDpToPixel(6.0f)));
        d();
    }

    private void setTextCenter(String str) {
        this.q.setText(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.length() == 1) {
            this.v = Utils.calcTextWidth(this.q.getPaint(), "0") + ((int) Utils.convertDpToPixel(3.0f));
        } else if (str.length() == 2) {
            this.v = (Utils.calcTextWidth(this.q.getPaint(), "0") / 2) + ((int) Utils.convertDpToPixel(3.0f));
        }
        int i = this.v;
        if (i > 0) {
            this.q.setPadding(i, (int) Utils.convertDpToPixel(1.0f), (int) Utils.convertDpToPixel(3.0f), (int) Utils.convertDpToPixel(4.5f));
        }
    }

    public final void d() {
        LayerDrawable layerDrawable = (LayerDrawable) ContextCompat.getDrawable(getContext(), R$drawable.lib_core_charts_value_marker_view_bg);
        if (layerDrawable != null) {
            ((GradientDrawable) ((RotateDrawable) layerDrawable.getDrawable(0)).getDrawable()).setColor(this.r);
            ((GradientDrawable) layerDrawable.getDrawable(1)).setColor(this.r);
        }
        setBackground(layerDrawable);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        return new MPPointF(-(getWidth() / 2.0f), (-getHeight()) + this.s);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        euk<Entry> eukVar = this.t;
        if (eukVar != null) {
            setTextCenter(eukVar.a(entry));
        } else {
            setTextCenter(String.valueOf(entry.getY()));
        }
        super.refreshContent(entry, highlight);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.r = i;
        d();
    }

    public void setOffsetY(float f) {
        this.s = f;
    }
}

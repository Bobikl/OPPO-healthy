package com.heytap.health.core.widget.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.Utils;
import com.heytap.health.lib_chart.R$color;
import com.heytap.health.lib_chart.R$drawable;
import com.oplus.aiunit.vision.gp0;
import com.oplus.aiunit.vision.hfk;
import com.oplus.aiunit.vision.kd6;
import com.oplus.aiunit.vision.ld6;
import com.oplus.aiunit.vision.md6;
import com.oplus.aiunit.vision.ue6;
import com.oplus.aiunit.vision.wq7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class EcgLineChart extends LineChart {
    public GradientColor A;
    public float B;
    public float C;
    public md6 D;
    public float E;
    public float F;
    public float G;
    public int H;
    public Drawable I;
    public ArrayList<Entry> J;
    public float[] K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final Path O;
    public boolean P;
    public boolean Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public boolean a0;
    public RectF b0;
    public Paint c0;
    public wq7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public XAxis f3760j;
    public YAxis k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public gp0 f3761l;
    public ld6 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3762n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public float t;
    public int u;
    public int v;
    public float w;
    public float x;
    public int y;
    public int z;

    public class a extends ValueFormatter {
        public a() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public String getAxisLabel(float f, AxisBase axisBase) {
            int i = 0;
            while (true) {
                float[] fArr = axisBase.mEntries;
                if (i >= fArr.length) {
                    i = -1;
                    break;
                }
                float f2 = fArr[i];
                if (f == f2 && f2 % EcgLineChart.this.E == 0.0f) {
                    break;
                }
                i++;
            }
            return EcgLineChart.this.f3761l != null ? EcgLineChart.this.f3761l.a(i, f / EcgLineChart.this.E) : super.getAxisLabel(f / EcgLineChart.this.E, axisBase);
        }
    }

    public class b implements IFillFormatter {
        public b() {
        }

        @Override // com.github.mikephil.charting.formatter.IFillFormatter
        public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
            return EcgLineChart.this.D.getYMin();
        }
    }

    public EcgLineChart(Context context) {
        super(context);
        this.f3762n = hfk.a(getContext(), 0.3f);
        this.o = ContextCompat.getColor(getContext(), R$color.lib_chart_ecg_grid_line);
        this.p = hfk.a(getContext(), 0.7f);
        Context context2 = getContext();
        int i = R$color.lib_chart_ecg_axis_middle_line;
        this.q = ContextCompat.getColor(context2, i);
        this.r = hfk.a(getContext(), 0.3f);
        this.s = ContextCompat.getColor(getContext(), i);
        this.t = hfk.a(getContext(), 1.5f);
        this.u = ContextCompat.getColor(getContext(), R$color.lib_core_charts_ecg_data_start);
        this.v = ContextCompat.getColor(getContext(), R$color.lib_core_charts_ecg_data_stop);
        this.w = hfk.a(getContext(), 1.0f);
        this.x = hfk.a(getContext(), 1.3f);
        this.y = ContextCompat.getColor(getContext(), R$color.lib_core_charts_ecg_reference_line_color);
        this.B = 0.0f;
        this.C = 0.0f;
        this.E = 25.0f;
        this.F = 10.0f;
        this.G = 8.6f;
        this.H = 0;
        this.I = ContextCompat.getDrawable(getContext(), R$drawable.lib_core_charts_ecg_line_chart_fill);
        this.J = new ArrayList<>();
        this.L = true;
        this.M = false;
        this.N = false;
        this.O = new Path();
        this.P = true;
        this.Q = false;
        this.R = 0.1f;
        this.S = 0.1f;
        this.T = 0.1f;
        this.U = 0.1f;
        this.V = 0.0f;
        this.W = 0.0f;
        this.a0 = false;
        this.b0 = new RectF();
        this.c0 = new Paint();
        e();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        super.calculateOffsets();
        if (!this.a0) {
            calculateLegendOffsets(this.b0);
            RectF rectF = this.b0;
            float requiredWidthSpace = rectF.left + 0.0f;
            float f = rectF.top + 0.0f;
            float requiredWidthSpace2 = rectF.right + 0.0f;
            float f2 = rectF.bottom + 0.0f;
            if (this.mAxisLeft.needsOffset()) {
                requiredWidthSpace += this.mAxisLeft.getRequiredWidthSpace(this.mAxisRendererLeft.getPaintAxisLabels());
            }
            if (this.mAxisRight.needsOffset()) {
                requiredWidthSpace2 += this.mAxisRight.getRequiredWidthSpace(this.mAxisRendererRight.getPaintAxisLabels());
            }
            if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
                XAxis xAxis = this.mXAxis;
                float yOffset = xAxis.mLabelRotatedHeight + xAxis.getYOffset();
                if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                    f2 += yOffset;
                } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                    f += yOffset;
                } else if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                    f2 += yOffset;
                    f += yOffset;
                }
            }
            float extraTopOffset = f + getExtraTopOffset();
            float extraRightOffset = requiredWidthSpace2 + getExtraRightOffset();
            float extraBottomOffset = f2 + getExtraBottomOffset();
            float extraLeftOffset = requiredWidthSpace + getExtraLeftOffset();
            float fConvertDpToPixel = Utils.convertDpToPixel(this.mMinOffset);
            if (this.L) {
                this.mViewPortHandler.restrainViewPort(Math.max(fConvertDpToPixel, extraLeftOffset), Math.max(fConvertDpToPixel, extraTopOffset), Math.max(fConvertDpToPixel, extraRightOffset), Math.max(fConvertDpToPixel, extraBottomOffset));
            } else {
                this.mViewPortHandler.restrainViewPort(Math.max(this.R, extraLeftOffset), Math.max(this.T, extraTopOffset), Math.max(this.S, extraRightOffset), Math.max(this.U, extraBottomOffset));
            }
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    public void d(boolean z) {
        this.L = z;
    }

    public void e() {
        setDrawGridBackground(false);
        setDragEnabled(true);
        setScaleEnabled(false);
        getAxisRight().setEnabled(false);
        getAxisLeft().setEnabled(false);
        getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        getLegend().setEnabled(false);
        getDescription().setEnabled(false);
        setHighlightPerTapEnabled(false);
        setHighlightPerDragEnabled(false);
        XAxis xAxis = getXAxis();
        this.f3760j = xAxis;
        xAxis.setDrawGridLines(false);
        this.f3760j.setDrawAxisLine(false);
        setXAxisMaximum(30.0f);
        setXAxisMinimum(1.0f);
        XAxis xAxis2 = this.f3760j;
        xAxis2.setLabelCount((int) xAxis2.getAxisMaximum());
        this.f3760j.setGranularity(1.0f);
        this.f3760j.setDrawLabels(true);
        this.f3760j.setAvoidFirstLastClipping(true);
        this.f3760j.setValueFormatter(new a());
        this.k = getAxisLeft();
        setYAxisMaximum(3.0f);
        setYAxisMinimum(0.0f);
        this.G = this.i.c();
        setSpeed(25.0f);
        this.K = new float[]{this.f3760j.getAxisMinimum(), this.k.getAxisMinimum(), this.f3760j.getAxisMaximum(), this.k.getAxisMaximum()};
        setTransparentEnabled(false);
    }

    public void f(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        float fC;
        float fAbs = (!this.Q || Math.abs(f6 - this.mViewPortHandler.contentTop()) <= this.i.a(f3, f4, false)) ? 0.0f : (Math.abs(f6 - this.mViewPortHandler.contentTop()) / this.i.c()) + f3;
        if (f4 <= fAbs) {
            f4 = fAbs;
        }
        int i = i(f3);
        while (true) {
            float f7 = i;
            if (f7 >= f4) {
                return;
            }
            if (f7 == f3) {
                fC = this.i.c();
            } else {
                if (i % 5 == 0) {
                    this.c0.setColor(this.s);
                    Paint paint = this.c0;
                    float f8 = this.r;
                    paint.setStrokeWidth(f8 >= 1.0f ? f8 : 1.0f);
                    canvas.drawLine(f5, f6, this.mViewPortHandler.contentRight(), f6, this.c0);
                } else {
                    this.c0.setColor(this.o);
                    Paint paint2 = this.c0;
                    float f9 = this.f3762n;
                    paint2.setStrokeWidth(f9 >= 1.0f ? f9 : 1.0f);
                    canvas.drawLine(f5, f6, this.mViewPortHandler.contentRight(), f6, this.c0);
                }
                fC = this.i.c();
            }
            f6 -= fC;
            i++;
        }
    }

    public void g(Canvas canvas) {
        Paint paint = new Paint();
        Path path = new Path();
        float fContentLeft = this.mViewPortHandler.contentLeft();
        float axisMaximum = (this.k.getAxisMaximum() - this.k.getAxisMinimum()) / 2.0f;
        float fContentBottom = this.mViewPortHandler.contentBottom() - (this.i.c() * axisMaximum);
        paint.setColor(this.y);
        paint.setStrokeWidth(this.x);
        paint.setStyle(Paint.Style.STROKE);
        if (this.F > axisMaximum) {
            fContentBottom = this.mViewPortHandler.contentBottom() - (this.i.c() * ((this.k.getAxisMaximum() - this.k.getAxisMinimum()) - this.F));
        }
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f};
        this.mLeftAxisTransformer.pointValuesToPixel(fArr);
        float f = fArr[2] - fArr[0];
        path.moveTo(fContentLeft, fContentBottom);
        float f2 = (2.0f * f) + fContentLeft;
        path.lineTo(f2, fContentBottom);
        path.lineTo(f2, fContentBottom - (this.i.c() * this.F));
        float f3 = (7.0f * f) + fContentLeft;
        path.lineTo(f3, fContentBottom - (this.i.c() * this.F));
        path.lineTo(f3, fContentBottom);
        path.lineTo(fContentLeft + (f * 9.0f), fContentBottom);
        canvas.drawPath(path, paint);
    }

    public int getAxisLineColor() {
        return this.q;
    }

    public float getAxisLineWidth() {
        return this.p;
    }

    public md6 getDataSet() {
        return this.D;
    }

    public float getEcgGain() {
        return this.F;
    }

    public float getExOffset() {
        return this.G;
    }

    public int getGridLineColor() {
        return this.o;
    }

    public float getGridLineWidth() {
        return this.f3762n;
    }

    public boolean getIsFullBackgroundEnabled() {
        return this.Q;
    }

    public int getLabelCount() {
        return this.H;
    }

    public float getLineWidth() {
        return this.t;
    }

    public int getMiddleLineColor() {
        return this.s;
    }

    public float getMiddleLineWidth() {
        return this.r;
    }

    public float getSpeed() {
        return this.E;
    }

    public GradientColor getTransparentColor() {
        return this.A;
    }

    public boolean getTransparentEnabled() {
        return this.P;
    }

    public float getTransparentHeight() {
        return this.C;
    }

    public float getTransparentWidth() {
        return this.B;
    }

    public float getXAxisMaximum() {
        return this.f3760j.getAxisMaximum();
    }

    public float getXAxisMinimum() {
        return this.f3760j.getAxisMinimum();
    }

    public void h(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, i(f2), 0.0f};
        this.mLeftAxisTransformer.pointValuesToPixel(fArr);
        float fA = this.i.a(f3, f4, false);
        float fContentWidth = fArr[4] < this.mViewPortHandler.contentRight() ? (this.mViewPortHandler.contentWidth() / (fArr[2] - fArr[0])) + i(f) : 0.0f;
        float f7 = f2 > fContentWidth ? f2 : fContentWidth;
        float[] fArr2 = new float[(i(f7) * 2) + 2];
        for (int i = 0; i <= 2.0f * f7; i += 2) {
            fArr2[i] = i / 2;
        }
        this.mLeftAxisTransformer.pointValuesToPixel(fArr2);
        for (int i2 = i(f); i2 <= i(f7); i2++) {
            if (i2 % this.E == 0.0f) {
                this.c0.setColor(this.q);
                Paint paint = this.c0;
                float f8 = this.p;
                if (f8 < 1.0f) {
                    f8 = 1.0f;
                }
                paint.setStrokeWidth(f8);
                if (this.Q) {
                    float f9 = fArr2[i2 * 2];
                    canvas.drawLine(f9, f6 + this.G, f9, this.mViewPortHandler.contentTop(), this.c0);
                } else {
                    float f10 = fArr2[i2 * 2];
                    canvas.drawLine(f10, f6 + this.G, f10, f6 - fA, this.c0);
                }
            } else {
                if (i2 % 5 == 0) {
                    this.c0.setColor(this.s);
                    Paint paint2 = this.c0;
                    float f11 = this.r;
                    if (f11 < 1.0f) {
                        f11 = 1.0f;
                    }
                    paint2.setStrokeWidth(f11);
                } else {
                    this.c0.setColor(this.o);
                    Paint paint3 = this.c0;
                    float f12 = this.f3762n;
                    if (f12 < 1.0f) {
                        f12 = 1.0f;
                    }
                    paint3.setStrokeWidth(f12);
                }
                if (this.Q) {
                    float f13 = fArr2[i2 * 2];
                    canvas.drawLine(f13, f6, f13, this.mViewPortHandler.contentTop(), this.c0);
                } else {
                    float f14 = fArr2[i2 * 2];
                    canvas.drawLine(f14, f6, f14, f6 - fA, this.c0);
                }
            }
        }
    }

    public int i(float f) {
        int i = (int) f;
        return Math.abs(f - ((float) i)) > 0.0f ? i + 1 : i;
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        wq7 wq7Var = new wq7(getContext());
        this.i = wq7Var;
        this.mRenderer = new kd6(wq7Var, this, this.mAnimator, this.mViewPortHandler);
        this.mXAxisRenderer = new ue6(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
    }

    public void j(boolean z) {
        this.N = z;
    }

    public void k(float f, float f2, float f3, float f4) {
        if (f > 0.1d) {
            this.R = f;
        }
        if (f2 > 0.1d) {
            this.S = f2;
        }
        if (f3 > 0.1d) {
            this.U = f3;
        }
        if (f4 > 0.1d) {
            this.T = f4;
        }
    }

    public List<Entry> l(ArrayList<Entry> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.size();
            arrayList2.add(new Entry(arrayList.get(i).getX() > this.f3760j.getAxisMaximum() / this.E ? this.f3760j.getAxisMaximum() : arrayList.get(i).getX() * this.E, arrayList.get(i).getY() > this.k.getAxisMaximum() / this.F ? this.k.getAxisMaximum() + 0.2f : arrayList.get(i).getY() < this.k.getAxisMinimum() / this.F ? this.k.getAxisMinimum() - 0.2f : arrayList.get(i).getY() * this.F));
        }
        return arrayList2;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        this.O.reset();
        this.mLeftAxisTransformer.pointValuesToPixel(this.K);
        float fA = this.i.a(this.k.getAxisMinimum(), this.k.getAxisMaximum(), false);
        if (this.Q) {
            this.O.addRect(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom() + this.G, Path.Direction.CW);
        } else {
            this.O.addRect(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom() - fA, this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom() + this.G, Path.Direction.CW);
        }
        canvas.clipPath(this.O);
        h(canvas, this.f3760j.getAxisMinimum(), this.f3760j.getAxisMaximum(), this.k.getAxisMinimum(), this.k.getAxisMaximum(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
        f(canvas, this.f3760j.getAxisMinimum(), this.f3760j.getAxisMaximum(), this.k.getAxisMinimum(), this.k.getAxisMaximum(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
        if (this.N) {
            g(canvas);
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float fContentWidth = this.mViewPortHandler.contentWidth();
        float f = this.i.b;
        this.H = (int) (fContentWidth / f);
        if (!this.M) {
            int i5 = (int) (fContentWidth / f);
            this.H = i5;
            ld6 ld6Var = this.m;
            if (ld6Var != null) {
                ld6Var.a(i5);
            }
            setVisibleXRangeMaximum(this.H);
            setVisibleXRangeMinimum(this.H);
        }
        if (this.mViewPortHandler.contentHeight() > this.i.a(this.k.getAxisMinimum(), this.k.getAxisMaximum(), false) + this.i.c()) {
            setTransparentEnabled(false);
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        float f = this.U;
        if (f > 0.1f && f < this.mXAxis.getTextSize() + this.mXAxis.getYOffset()) {
            this.U = this.mXAxis.getTextSize() + this.mXAxis.getYOffset();
        }
        float fI = i(this.i.a(this.k.getAxisMinimum(), this.k.getAxisMaximum(), false) + this.U + this.T);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), i(fI));
        }
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void resetViewPortOffsets() {
        this.a0 = false;
        super.resetViewPortOffsets();
    }

    public void setAxisLineColor(int i) {
        this.q = i;
    }

    public void setAxisLineWidth(float f) {
        this.p = hfk.a(getContext(), f);
    }

    public void setData(ArrayList<Entry> arrayList) {
        ArrayList<Entry> arrayList2 = (ArrayList) l(arrayList);
        this.J = arrayList2;
        md6 md6Var = new md6(arrayList2, "");
        this.D = md6Var;
        int i = this.z;
        if (i != 0) {
            md6Var.setColor(i);
        }
        this.D.setGradientColor(this.u, this.v);
        this.D.setLineWidth(this.t);
        this.D.setDrawCircles(false);
        this.D.setDrawValues(false);
        this.D.setCubicIntensity(1.0f);
        this.D.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        if (this.M) {
            this.D.setDrawFilled(false);
            this.D.setLineWidth(this.w);
        } else {
            this.D.setDrawFilled(true);
            this.D.setFillFormatter(new b());
            this.D.setFillDrawable(this.I);
        }
        super.setData(new LineData(this.D));
        invalidate();
    }

    public void setEcgGain(float f) {
        this.F = f;
    }

    public void setEcgLineChartVisibleXRangeListener(ld6 ld6Var) {
        this.m = ld6Var;
    }

    public void setExOffset(float f) {
        this.G = f;
    }

    public void setFillDrawable(Drawable drawable) {
        md6 md6Var = this.D;
        if (md6Var != null) {
            md6Var.setFillDrawable(drawable);
        } else {
            this.I = drawable;
        }
    }

    public void setGridLineColor(int i) {
        this.o = i;
    }

    public void setGridLineWidth(float f) {
        this.f3762n = hfk.a(getContext(), f);
    }

    public void setIsFullBackgroundEnabled(boolean z) {
        this.Q = z;
    }

    public void setLabelCount(int i) {
        this.H = i;
    }

    public void setLineColor(int i) {
        md6 md6Var = this.D;
        if (md6Var != null) {
            md6Var.setColor(i);
        } else {
            this.z = i;
        }
    }

    public void setLineWidth(float f) {
        md6 md6Var = this.D;
        if (md6Var != null) {
            md6Var.setLineWidth(hfk.a(getContext(), f));
        } else {
            this.t = hfk.a(getContext(), f);
        }
    }

    public void setMiddleLineColor(int i) {
        this.s = i;
    }

    public void setMiddleLineWidth(float f) {
        this.r = hfk.a(getContext(), f);
    }

    public void setReferenceLineColor(int i) {
        this.y = i;
    }

    public void setReferenceLineWidth(float f) {
        this.x = f;
    }

    public void setShareLineWidth(float f) {
        if (this.M) {
            md6 md6Var = this.D;
            if (md6Var != null) {
                md6Var.setLineWidth(hfk.a(getContext(), f));
            } else {
                this.w = hfk.a(getContext(), f);
            }
        }
    }

    public void setSpeed(float f) {
        this.E = f;
        ((ue6) this.mXAxisRenderer).b(f);
        setXAxisMinimum(this.V);
        setXAxisMaximum(this.W);
        invalidate();
    }

    public void setStyle(boolean z) {
        this.M = z;
        if (!z) {
            setDragEnabled(true);
            return;
        }
        setDragEnabled(false);
        Context context = getContext();
        int i = R$color.lib_core_charts_ecg_share_axis_middle_line;
        setAxisLineColor(ContextCompat.getColor(context, i));
        setGridLineColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_ecg_share_grid_line));
        setMiddleLineColor(ContextCompat.getColor(getContext(), i));
    }

    public void setTransparentEnabled(boolean z) {
        this.P = z;
        invalidate();
    }

    public void setTransparentHeight(float f) {
        this.C = f;
    }

    public void setTransparentWidth(float f) {
        this.B = f;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setViewPortOffsets(float f, float f2, float f3, float f4) {
        this.a0 = true;
        super.setViewPortOffsets(f, f2, f3, f4);
    }

    public void setXAxisMaximum(float f) {
        this.f3760j.setAxisMaximum(this.E * f);
        this.W = f;
    }

    public void setXAxisMinimum(float f) {
        this.f3760j.setAxisMinimum(this.E * f);
        this.V = f;
    }

    public void setXAxisValueFormatter(gp0 gp0Var) {
        this.f3761l = gp0Var;
    }

    public void setYAxisMaximum(float f) {
        this.k.setAxisMaximum(f * this.F);
    }

    public void setYAxisMinimum(float f) {
        this.k.setAxisMinimum(f * this.F);
    }

    public EcgLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3762n = hfk.a(getContext(), 0.3f);
        this.o = ContextCompat.getColor(getContext(), R$color.lib_chart_ecg_grid_line);
        this.p = hfk.a(getContext(), 0.7f);
        Context context2 = getContext();
        int i = R$color.lib_chart_ecg_axis_middle_line;
        this.q = ContextCompat.getColor(context2, i);
        this.r = hfk.a(getContext(), 0.3f);
        this.s = ContextCompat.getColor(getContext(), i);
        this.t = hfk.a(getContext(), 1.5f);
        this.u = ContextCompat.getColor(getContext(), R$color.lib_core_charts_ecg_data_start);
        this.v = ContextCompat.getColor(getContext(), R$color.lib_core_charts_ecg_data_stop);
        this.w = hfk.a(getContext(), 1.0f);
        this.x = hfk.a(getContext(), 1.3f);
        this.y = ContextCompat.getColor(getContext(), R$color.lib_core_charts_ecg_reference_line_color);
        this.B = 0.0f;
        this.C = 0.0f;
        this.E = 25.0f;
        this.F = 10.0f;
        this.G = 8.6f;
        this.H = 0;
        this.I = ContextCompat.getDrawable(getContext(), R$drawable.lib_core_charts_ecg_line_chart_fill);
        this.J = new ArrayList<>();
        this.L = true;
        this.M = false;
        this.N = false;
        this.O = new Path();
        this.P = true;
        this.Q = false;
        this.R = 0.1f;
        this.S = 0.1f;
        this.T = 0.1f;
        this.U = 0.1f;
        this.V = 0.0f;
        this.W = 0.0f;
        this.a0 = false;
        this.b0 = new RectF();
        this.c0 = new Paint();
        e();
    }

    public EcgLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3762n = hfk.a(getContext(), 0.3f);
        this.o = ContextCompat.getColor(getContext(), R$color.lib_chart_ecg_grid_line);
        this.p = hfk.a(getContext(), 0.7f);
        Context context2 = getContext();
        int i2 = R$color.lib_chart_ecg_axis_middle_line;
        this.q = ContextCompat.getColor(context2, i2);
        this.r = hfk.a(getContext(), 0.3f);
        this.s = ContextCompat.getColor(getContext(), i2);
        this.t = hfk.a(getContext(), 1.5f);
        this.u = ContextCompat.getColor(getContext(), R$color.lib_core_charts_ecg_data_start);
        this.v = ContextCompat.getColor(getContext(), R$color.lib_core_charts_ecg_data_stop);
        this.w = hfk.a(getContext(), 1.0f);
        this.x = hfk.a(getContext(), 1.3f);
        this.y = ContextCompat.getColor(getContext(), R$color.lib_core_charts_ecg_reference_line_color);
        this.B = 0.0f;
        this.C = 0.0f;
        this.E = 25.0f;
        this.F = 10.0f;
        this.G = 8.6f;
        this.H = 0;
        this.I = ContextCompat.getDrawable(getContext(), R$drawable.lib_core_charts_ecg_line_chart_fill);
        this.J = new ArrayList<>();
        this.L = true;
        this.M = false;
        this.N = false;
        this.O = new Path();
        this.P = true;
        this.Q = false;
        this.R = 0.1f;
        this.S = 0.1f;
        this.T = 0.1f;
        this.U = 0.1f;
        this.V = 0.0f;
        this.W = 0.0f;
        this.a0 = false;
        this.b0 = new RectF();
        this.c0 = new Paint();
        e();
    }
}

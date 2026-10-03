package com.heytap.health.core.widget.charts.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.oplus.aiunit.vision.o50;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class BaseYAxisRenderer extends YAxisRenderer {
    public WeakReference<BarLineChartBase> a;
    public float[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f3824c;
    public float[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Float> f3825e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3826j;
    public LinePosition k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinePosition f3827l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3828n;
    public float o;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public Paint t;
    public Paint u;
    public boolean v;

    public enum LinePosition {
        DEFAULT,
        END,
        WITH_X,
        CUSTOM_DP,
        CUSTOM_PERCENT
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LinePosition.values().length];
            a = iArr;
            try {
                iArr[LinePosition.END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LinePosition.WITH_X.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[LinePosition.CUSTOM_DP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[LinePosition.CUSTOM_PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[LinePosition.DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public BaseYAxisRenderer(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        this.f3825e = new ArrayList<>();
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.f3826j = false;
        LinePosition linePosition = LinePosition.DEFAULT;
        this.k = linePosition;
        this.f3827l = linePosition;
        this.m = 0.0f;
        this.f3828n = 0.0f;
        this.o = -1.0f;
        this.p = -1.0f;
        this.q = -1.0f;
        this.r = false;
        this.s = false;
        this.t = new Paint();
        this.u = new Paint();
        this.v = false;
    }

    public void A() {
        int i = a.a[this.k.ordinal()];
        if (i == 1) {
            this.o = this.mViewPortHandler.contentLeft() - this.mViewPortHandler.offsetLeft();
            return;
        }
        if (i == 2) {
            float[] fArr = {this.m, 0.0f};
            this.mTrans.pointValuesToPixel(fArr);
            this.o = fArr[0];
        } else {
            if (i == 3) {
                this.o = Utils.convertDpToPixel(this.m);
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.o = this.mViewPortHandler.contentLeft();
            } else {
                float f = this.m;
                if (f <= 0.0f || f > 1.0f) {
                    this.o = this.mViewPortHandler.contentLeft();
                } else {
                    this.o = this.mViewPortHandler.getChartWidth() * this.m;
                }
            }
        }
    }

    public void B(LinePosition linePosition, float f) {
        this.k = linePosition;
        this.m = f;
    }

    public void C() {
        A();
        y();
        if (this.o > this.p) {
            LinePosition linePosition = LinePosition.DEFAULT;
            B(linePosition, 0.0f);
            z(linePosition, 0.0f);
        }
    }

    public void D(boolean z) {
        this.i = z;
    }

    public void E(float[] fArr) {
        this.b = fArr;
    }

    public void F(float[] fArr, boolean z) {
        WeakReference<BarLineChartBase> weakReference;
        WeakReference<BarLineChartBase> weakReference2;
        this.b = fArr;
        StringBuilder sb = new StringBuilder();
        sb.append("setYAxisValues  startAnimated is ");
        sb.append(z);
        if (!z || fArr.length <= 1 || (weakReference2 = this.a) == null || weakReference2.get() == null) {
            if (fArr.length <= 1 || (weakReference = this.a) == null || weakReference.get() == null) {
                return;
            }
            this.a.get().getAxisRight().setAxisMinimum(fArr[0]);
            this.a.get().getAxisRight().setAxisMaximum(fArr[fArr.length - 1]);
            this.a.get().notifyDataSetChanged();
            return;
        }
        float f = this.a.get().getAxisRight().mAxisMaximum;
        float f2 = fArr[fArr.length - 1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setYAxisValues curAxisMaximum is ");
        sb2.append(f);
        sb2.append(" yAxisMaxValues is ");
        sb2.append(f2);
        if (f == f2) {
            return;
        }
        this.a.get().addViewportJob(new o50(this.a.get(), f, f2, fArr, AnimatorUtil.e()));
    }

    public float a(Paint paint) {
        float fMax;
        float chartWidth;
        YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
        float fC = c(paint);
        if (fC == -1.0f) {
            return b();
        }
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float fContentLeft = this.mViewPortHandler.contentLeft() - this.mViewPortHandler.offsetLeft();
            fMax = fContentLeft >= 0.0f ? Math.min(fContentLeft, this.o) : 0.0f;
            chartWidth = this.mViewPortHandler.contentLeft() - fMax;
            if (chartWidth <= fC) {
                return fMax;
            }
        } else {
            fMax = Math.max(this.p, this.mViewPortHandler.contentRight());
            chartWidth = this.mViewPortHandler.getChartWidth() - fMax;
            if (chartWidth <= fC) {
                return fMax;
            }
        }
        return fMax + ((chartWidth - fC) / 2.0f);
    }

    public float b() {
        float fContentRight;
        float fContentRight2;
        float xOffset = this.mYAxis.getXOffset();
        YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
        YAxis.YAxisLabelPosition labelPosition = this.mYAxis.getLabelPosition();
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            if (labelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                this.mAxisLabelPaint.setTextAlign(Paint.Align.RIGHT);
                fContentRight = this.mViewPortHandler.offsetLeft();
                return fContentRight - xOffset;
            }
            this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
            fContentRight2 = this.mViewPortHandler.offsetLeft();
            return fContentRight2 + xOffset;
        }
        if (labelPosition == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
            this.mAxisLabelPaint.setTextAlign(Paint.Align.LEFT);
            fContentRight2 = this.mViewPortHandler.contentRight();
            return fContentRight2 + xOffset;
        }
        this.mAxisLabelPaint.setTextAlign(Paint.Align.RIGHT);
        fContentRight = this.mViewPortHandler.contentRight();
        return fContentRight - xOffset;
    }

    public float c(Paint paint) {
        YAxis yAxis;
        float f = 0.0f;
        int i = 0;
        while (true) {
            yAxis = this.mYAxis;
            if (i >= yAxis.mEntryCount) {
                break;
            }
            String formattedLabel = yAxis.getFormattedLabel(i);
            if (formattedLabel == null || formattedLabel.equals("")) {
                f = -1.0f;
            } else {
                float fMeasureText = paint.measureText(formattedLabel);
                if (fMeasureText > f) {
                    f = fMeasureText;
                }
            }
            i++;
        }
        Iterator<LimitLine> it = yAxis.getLimitLines().iterator();
        while (it.hasNext()) {
            String label = it.next().getLabel();
            if (label == null || label.equals("")) {
                f = -1.0f;
            } else {
                float fMeasureText2 = paint.measureText(label);
                if (fMeasureText2 > f) {
                    f = fMeasureText2;
                }
            }
        }
        return f;
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxisValues(float f, float f2) {
        int labelCount = this.mAxis.getLabelCount();
        double dAbs = Math.abs(f2 - f);
        float[] fArr = this.b;
        if (fArr != null && fArr.length > 0) {
            p(f, f2);
        } else if (this.r) {
            m(labelCount, f, dAbs);
        } else {
            n(labelCount, f, f2, dAbs);
        }
        x();
    }

    public List<Float> d(float f, float f2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            float[] fArr = this.b;
            if (i >= fArr.length) {
                return arrayList;
            }
            float f3 = fArr[i];
            if (f3 >= f && f3 <= f2) {
                arrayList.add(Float.valueOf(f3));
            }
            i++;
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        int i = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0;
        int i2 = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        f(i2 - i, f2);
        while (i < i2) {
            if (!g(this.mYAxis.mEntries[i])) {
                canvas.drawText(this.mYAxis.getFormattedLabel(i), f, fArr[(i * 2) + 1] + this.f3824c[i], this.mAxisLabelPaint);
            }
            i++;
        }
    }

    public double e(double d, int i) {
        double dRoundToNextSignificant = Utils.roundToNextSignificant(d / ((double) i));
        if (this.mAxis.isGranularityEnabled() && dRoundToNextSignificant < this.mAxis.getGranularity()) {
            dRoundToNextSignificant = this.mAxis.getGranularity();
        }
        double dRoundToNextSignificant2 = Utils.roundToNextSignificant(Math.pow(10.0d, (int) Math.log10(dRoundToNextSignificant)));
        return ((int) (dRoundToNextSignificant / dRoundToNextSignificant2)) > 5 ? Math.floor(dRoundToNextSignificant2 * 10.0d) : dRoundToNextSignificant;
    }

    public void f(int i, float f) {
        float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, "A") / 2.5f;
        float[] fArr = this.f3824c;
        int i2 = 0;
        if (fArr == null) {
            this.f3824c = new float[i];
            while (i2 < i) {
                this.f3824c[i2] = f;
                i2++;
            }
            return;
        }
        if (fArr[0] != -1.0f || fArr.length != 3) {
            if (fArr.length < i) {
                float[] fArr2 = new float[i];
                while (i2 < i) {
                    float[] fArr3 = this.f3824c;
                    if (i2 < fArr3.length) {
                        fArr2[i2] = fArr3[i2] + fCalcTextHeight;
                    } else {
                        fArr2[i2] = fCalcTextHeight;
                    }
                    i2++;
                }
                this.f3824c = fArr2;
                return;
            }
            return;
        }
        float[] fArr4 = new float[i];
        float f2 = fArr[1];
        float f3 = fArr[2];
        while (i2 < i) {
            if (i2 == 0) {
                fArr4[i2] = f2 + fCalcTextHeight;
            } else if (i2 == i - 1) {
                fArr4[i2] = f3 + fCalcTextHeight;
            } else {
                fArr4[i2] = fCalcTextHeight;
            }
            i2++;
        }
        this.f3824c = fArr4;
    }

    public boolean g(float f) {
        float[] fArr = this.d;
        if (fArr != null && fArr.length > 0) {
            int i = 0;
            while (true) {
                float[] fArr2 = this.d;
                if (i >= fArr2.length) {
                    break;
                }
                if (f == fArr2[i]) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.o, this.mViewPortHandler.contentTop(), this.p, this.mViewPortHandler.contentBottom());
        this.mGridClippingRect.inset(0.0f, -this.mAxis.getGridLineWidth());
        return this.mGridClippingRect;
    }

    public boolean h(float f, float f2) {
        if (this.f3825e.isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f3825e.size(); i += 2) {
            float fFloatValue = this.f3825e.get(i).floatValue();
            float fFloatValue2 = this.f3825e.get(i + 1).floatValue();
            if (f > fFloatValue && f < fFloatValue2) {
                return true;
            }
            if (f2 > fFloatValue && f2 < fFloatValue2) {
                return true;
            }
        }
        return false;
    }

    public void i(Canvas canvas, LimitLine limitLine, float[] fArr) {
        float fContentLeft;
        float f;
        float f2;
        float f3;
        float f4;
        String label = limitLine.getLabel();
        if (label == null || label.equals("")) {
            return;
        }
        Paint paintV = v(limitLine);
        this.u = paintV;
        float fCalcTextHeight = Utils.calcTextHeight(paintV, label);
        float fConvertDpToPixel = Utils.convertDpToPixel(4.0f) + limitLine.getXOffset();
        float lineWidth = limitLine.getLineWidth() + fCalcTextHeight + limitLine.getYOffset();
        LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
        if (this.f3826j) {
            if (labelPosition == LimitLine.LimitLabelPosition.LEFT_TOP || labelPosition == LimitLine.LimitLabelPosition.LEFT_BOTTOM) {
                fContentLeft = fConvertDpToPixel + this.mViewPortHandler.contentLeft();
                if (labelPosition == LimitLine.LimitLabelPosition.LEFT_BOTTOM) {
                    f2 = fArr[1];
                    f3 = f2 + lineWidth;
                } else {
                    f = fArr[1];
                    f3 = (f - lineWidth) + fCalcTextHeight;
                }
            } else {
                fContentLeft = this.mViewPortHandler.contentRight() - fConvertDpToPixel;
                if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                    f2 = fArr[1];
                    f3 = f2 + lineWidth;
                } else {
                    f = fArr[1];
                    f3 = (f - lineWidth) + fCalcTextHeight;
                }
            }
            f4 = f3;
        } else {
            float fCalcTextHeight2 = (Utils.calcTextHeight(this.u, "A") / 2.5f) + this.mYAxis.getYOffset();
            fContentLeft = this.i ? b() : a(this.u);
            f4 = fArr[1] + fCalcTextHeight2;
        }
        float f5 = f4 - fCalcTextHeight;
        fArr[0] = f5;
        fArr[1] = f4;
        this.f3825e.add(Float.valueOf(f5));
        this.f3825e.add(Float.valueOf(f4));
        canvas.drawText(label, fContentLeft, f4, this.u);
        this.u.reset();
    }

    public void j(Canvas canvas, Path path, LimitLine limitLine, float[] fArr) {
        path.moveTo(this.o, fArr[1]);
        path.lineTo(this.p, fArr[1]);
        Paint paintW = w(limitLine);
        this.t = paintW;
        canvas.drawPath(path, paintW);
    }

    public void k() {
        this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
        this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
    }

    public void l(double d, double d2, int i) {
        YAxis yAxis = this.mYAxis;
        yAxis.mEntryCount = i;
        if (yAxis.mEntries.length < i) {
            yAxis.mEntries = new float[i];
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.mYAxis.mEntries[i2] = (float) d;
            d += d2;
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public Path linePath(Path path, int i, float[] fArr) {
        int i2 = i + 1;
        path.moveTo(this.o, fArr[i2]);
        path.lineTo(this.p, fArr[i2]);
        return path;
    }

    public void m(int i, float f, double d) {
        if (i == 0 || d <= 0.0d) {
            return;
        }
        if (this.s) {
            l(f, this.q, i);
            return;
        }
        float f2 = this.q;
        l(f, f2, ((int) (d / ((double) f2))) + 1);
    }

    public void n(int i, float f, float f2, double d) {
        double dO;
        if (i == 0 || d <= 0.0d || Double.isInfinite(d)) {
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = new float[0];
            axisBase.mCenteredEntries = new float[0];
            axisBase.mEntryCount = 0;
            return;
        }
        double dE = e(d, i);
        boolean zIsCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            dO = ((float) d) / (i - 1);
            l(f, dO, i);
        } else {
            dO = o(dE, f, f2, zIsCenterAxisLabelsEnabled ? 1 : 0);
            i = zIsCenterAxisLabelsEnabled ? 1 : 0;
        }
        if (dO < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(dO));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            AxisBase axisBase2 = this.mAxis;
            if (axisBase2.mCenteredEntries.length < i) {
                axisBase2.mCenteredEntries = new float[i];
            }
            float f3 = ((float) dO) / 2.0f;
            for (int i2 = 0; i2 < i; i2++) {
                AxisBase axisBase3 = this.mAxis;
                axisBase3.mCenteredEntries[i2] = axisBase3.mEntries[i2] + f3;
            }
        }
    }

    public double o(double d, float f, float f2, int i) {
        int i2;
        double dCeil = d == 0.0d ? 0.0d : Math.ceil(((double) f) / d) * d;
        if (this.mYAxis.isCenterAxisLabelsEnabled()) {
            dCeil -= d;
        }
        double dNextUp = d != 0.0d ? Utils.nextUp(Math.floor(((double) f2) / d) * d) : 0.0d;
        if (d != 0.0d) {
            int i3 = i;
            double d2 = dCeil;
            while (d2 <= dNextUp) {
                i3++;
                d2 += d;
            }
            i2 = i3;
        } else {
            i2 = i;
        }
        l(dCeil, d, i2);
        return d;
    }

    public void p(float f, float f2) {
        List<Float> listD = d(f, f2);
        this.mYAxis.mEntryCount = listD.size();
        YAxis yAxis = this.mYAxis;
        yAxis.mEntries = new float[yAxis.mEntryCount];
        int i = 0;
        while (true) {
            YAxis yAxis2 = this.mYAxis;
            if (i >= yAxis2.mEntryCount) {
                return;
            }
            yAxis2.mEntries[i] = listD.get(i).floatValue();
            i++;
        }
    }

    public void q(float f, float f2) {
        float[] fArr = new float[3];
        this.f3824c = fArr;
        fArr[0] = -1.0f;
        fArr[1] = Utils.convertDpToPixel(Math.abs(f)) * (f < 0.0f ? -1 : 1);
        this.f3824c[2] = Utils.convertDpToPixel(Math.abs(f2)) * (f2 >= 0.0f ? 1 : -1);
    }

    public void r() {
        this.mGridPaint.setColor(this.mYAxis.getGridColor());
        this.mGridPaint.setStrokeWidth(this.mYAxis.getGridLineWidth());
        this.mGridPaint.setPathEffect(this.mYAxis.getGridDashPathEffect());
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            float[] transformedPositions = getTransformedPositions();
            k();
            drawYLabels(canvas, this.i ? b() : a(this.mAxisLabelPaint), transformedPositions, (Utils.calcTextHeight(this.mAxisLabelPaint, "A") / 2.5f) + this.mYAxis.getYOffset());
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            this.mAxisLinePaint.setPathEffect(this.mYAxis.getAxisLineDashPathEffect());
            if (this.mYAxis.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            } else {
                canvas.drawLine(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        C();
        if (this.mYAxis.isEnabled()) {
            if (this.mYAxis.isDrawGridLinesEnabled()) {
                int iSave = canvas.save();
                canvas.clipRect(getGridClippingRect());
                float[] transformedPositions = getTransformedPositions();
                r();
                Path path = this.mRenderGridLinesPath;
                path.reset();
                for (int i = 0; i < transformedPositions.length; i += 2) {
                    if (!g(this.mYAxis.mEntries[i / 2])) {
                        canvas.drawPath(linePath(path, i, transformedPositions), this.mGridPaint);
                        path.reset();
                    }
                }
                canvas.restoreToCount(iSave);
            }
            if (this.mYAxis.isDrawZeroLineEnabled()) {
                drawZeroLine(canvas);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        boolean z;
        boolean z2;
        boolean z3;
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        this.f3825e.clear();
        if (limitLines == null || limitLines.isEmpty()) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        boolean z4 = false;
        boolean z5 = false;
        fArr[0] = 0.0f;
        boolean z6 = true;
        fArr[1] = 0.0f;
        Path path = this.mRenderLimitLines;
        path.reset();
        float fCalcTextHeight = Utils.calcTextHeight(this.u, "A");
        int i = 0;
        float f = 0.0f;
        float limit = 0.0f;
        float f2 = 0.0f;
        while (i < limitLines.size()) {
            LimitLine limitLine = limitLines.get(i);
            if (limitLine.isEnabled()) {
                int iSave = canvas.save();
                this.mLimitLineClippingRect.set(this.o, this.mViewPortHandler.contentTop(), this.p, this.mViewPortHandler.contentBottom());
                this.mLimitLineClippingRect.inset(0.0f, -limitLine.getLineWidth());
                canvas.clipRect(this.mLimitLineClippingRect);
                z3 = true;
                fArr[1] = limitLine.getLimit();
                this.mTrans.pointValuesToPixel(fArr);
                j(canvas, path, limitLine, fArr);
                canvas.restoreToCount(iSave);
                path.reset();
                if (f == 0.0f || limit <= limitLine.getLimit() || fArr[1] - fCalcTextHeight >= f) {
                    z = false;
                    if (f2 != 0.0f && limit < limitLine.getLimit() && fArr[1] + fCalcTextHeight > f2) {
                        fArr[1] = f2 - fCalcTextHeight;
                    }
                } else {
                    fArr[1] = f + fCalcTextHeight;
                    z = false;
                }
                i(canvas, limitLine, fArr);
                z2 = false;
                f2 = fArr[0];
                f = fArr[1];
                limit = limitLine.getLimit();
            } else {
                z = z5;
                z2 = z4;
                z3 = z6;
            }
            i++;
            z6 = z3;
            z4 = z2;
            z5 = z;
            limitLines = limitLines;
        }
    }

    public void s(float f) {
        if (f > 0.0f) {
            this.q = f;
            this.r = true;
        }
    }

    public void t(float f, boolean z) {
        s(f);
        this.s = z;
    }

    public void u(boolean z) {
        this.g = z;
        if (this.f && z) {
            this.h = true;
        }
    }

    public Paint v(LimitLine limitLine) {
        if (this.g) {
            return this.mAxisLabelPaint;
        }
        this.u.setStyle(Paint.Style.FILL);
        this.u.setStyle(limitLine.getTextStyle());
        this.u.setPathEffect(null);
        this.u.setColor(limitLine.getTextColor());
        this.u.setTypeface(limitLine.getTypeface());
        this.u.setAntiAlias(true);
        this.u.setStrokeWidth(0.5f);
        this.u.setTextSize(limitLine.getTextSize());
        return this.u;
    }

    public Paint w(LimitLine limitLine) {
        if (this.f) {
            return this.mGridPaint;
        }
        this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
        this.mLimitLinePaint.setColor(limitLine.getLineColor());
        this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
        this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
        return this.mLimitLinePaint;
    }

    public void x() {
        if (this.mYAxis.getLimitLines() == null || this.mYAxis.getLimitLines().isEmpty()) {
            this.d = null;
            return;
        }
        this.d = new float[this.mYAxis.getLimitLines().size()];
        int i = 0;
        while (true) {
            float[] fArr = this.d;
            if (i >= fArr.length) {
                return;
            }
            fArr[i] = this.mYAxis.getLimitLines().get(i).getLimit();
            i++;
        }
    }

    public void y() {
        int i = a.a[this.f3827l.ordinal()];
        if (i == 1) {
            this.p = this.mViewPortHandler.contentRight() + this.mViewPortHandler.offsetRight();
            return;
        }
        if (i == 2) {
            float[] fArr = {this.f3828n, 0.0f};
            this.mTrans.pointValuesToPixel(fArr);
            this.p = fArr[0];
        } else {
            if (i == 3) {
                this.p = this.mViewPortHandler.getChartWidth() - Utils.convertDpToPixel(this.f3828n);
                return;
            }
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.p = this.mViewPortHandler.contentRight();
            } else {
                float f = this.f3828n;
                if (f <= 0.0f || f > 1.0f) {
                    this.p = this.mViewPortHandler.contentRight();
                } else {
                    this.p = this.mViewPortHandler.getChartWidth() * this.f3828n;
                }
            }
        }
    }

    public void z(LinePosition linePosition, float f) {
        this.f3827l = linePosition;
        this.f3828n = f;
    }

    public BaseYAxisRenderer(BarLineChartBase barLineChartBase, ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        this.f3825e = new ArrayList<>();
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.f3826j = false;
        LinePosition linePosition = LinePosition.DEFAULT;
        this.k = linePosition;
        this.f3827l = linePosition;
        this.m = 0.0f;
        this.f3828n = 0.0f;
        this.o = -1.0f;
        this.p = -1.0f;
        this.q = -1.0f;
        this.r = false;
        this.s = false;
        this.t = new Paint();
        this.u = new Paint();
        this.v = false;
        this.a = new WeakReference<>(barLineChartBase);
    }
}

package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public class gw8 extends XAxisRenderer {
    public boolean a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f11919c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f11920e;
    public float[] f;

    public gw8(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        this.a = false;
        this.b = false;
        this.d = false;
    }

    public void a() {
        this.a = true;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public void c(float[] fArr) {
        this.f11919c = fArr;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float f, float f2, boolean z) {
        float axisMinimum;
        double d;
        if (this.mViewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutX()) {
            MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop());
            if (z) {
                axisMinimum = (float) valuesByTouchPoint2.x;
                d = valuesByTouchPoint.x;
            } else {
                axisMinimum = (float) valuesByTouchPoint.x;
                d = valuesByTouchPoint2.x;
            }
            float axisMaximum = (float) d;
            if (axisMinimum < this.mXAxis.getAxisMinimum()) {
                axisMinimum = this.mXAxis.getAxisMinimum();
            }
            if (axisMaximum > this.mXAxis.getAxisMaximum()) {
                axisMaximum = this.mXAxis.getAxisMaximum();
            }
            MPPointD.recycleInstance(valuesByTouchPoint);
            MPPointD.recycleInstance(valuesByTouchPoint2);
            f = axisMinimum;
            f2 = axisMaximum;
        }
        computeAxisValues(f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxisValues(float f, float f2) {
        float granularity;
        float f3 = f;
        int labelCount = this.mAxis.getLabelCount();
        double dAbs = Math.abs(f2 - f3);
        if (labelCount == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = new float[0];
            axisBase.mCenteredEntries = new float[0];
            axisBase.mEntryCount = 0;
            return;
        }
        int i = labelCount - 1;
        double dFloor = dAbs / ((double) i);
        if (dFloor % 1.0d != 0.0d) {
            dFloor = Math.round(dFloor);
        }
        if (this.mAxis.isGranularityEnabled()) {
            if (this.b) {
                if (this.mAxis.getGranularity() != 0.0f) {
                    granularity = this.mAxis.getGranularity();
                    dFloor = granularity;
                }
            } else if (dFloor < this.mAxis.getGranularity()) {
                granularity = this.mAxis.getGranularity();
                dFloor = granularity;
            }
        }
        if (dFloor % 1.0d != 0.0d) {
            double dRoundToNextSignificant = Utils.roundToNextSignificant(Math.pow(10.0d, (int) Math.log10(dFloor)));
            if (((int) (dFloor / dRoundToNextSignificant)) > 5) {
                dFloor = Math.floor(dRoundToNextSignificant * 10.0d);
            }
        }
        int iIsCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            dFloor = ((float) dAbs) / i;
            AxisBase axisBase2 = this.mAxis;
            axisBase2.mEntryCount = labelCount;
            float[] fArr = axisBase2.mEntries;
            if (fArr.length < labelCount || fArr.length > labelCount * 3) {
                axisBase2.mEntries = new float[labelCount];
            }
            for (int i2 = 0; i2 < labelCount; i2++) {
                this.mAxis.mEntries[i2] = f3;
                f3 = (float) (((double) f3) + dFloor);
            }
        } else {
            double dCeil = dFloor == 0.0d ? 0.0d : Math.ceil(((double) f3) / dFloor) * dFloor;
            if (this.a) {
                int i3 = (int) f3;
                if (i3 != 0) {
                    i3++;
                }
                dCeil = i3;
            }
            if (f3 < this.mXAxis.getAxisMinimum()) {
                dCeil = f3;
            }
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                dCeil -= dFloor;
            }
            double dNextUp = dFloor == 0.0d ? 0.0d : Utils.nextUp(Math.floor(((double) f2) / dFloor) * dFloor);
            if (this.a) {
                dNextUp = (int) f2;
            }
            if (f2 > this.mXAxis.getAxisMaximum()) {
                dNextUp = this.mXAxis.getAxisMaximum();
            }
            if (dFloor != 0.0d) {
                double d = dCeil;
                iIsCenterAxisLabelsEnabled = iIsCenterAxisLabelsEnabled;
                while (d <= dNextUp) {
                    d += dFloor;
                    iIsCenterAxisLabelsEnabled++;
                }
            }
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = iIsCenterAxisLabelsEnabled;
            float[] fArr2 = axisBase3.mEntries;
            if (fArr2.length < iIsCenterAxisLabelsEnabled || fArr2.length > iIsCenterAxisLabelsEnabled * 3) {
                axisBase3.mEntries = new float[iIsCenterAxisLabelsEnabled];
            }
            for (int i4 = 0; i4 < iIsCenterAxisLabelsEnabled; i4++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.mAxis.mEntries[i4] = (float) dCeil;
                dCeil += dFloor;
            }
            labelCount = iIsCenterAxisLabelsEnabled;
        }
        if (dFloor < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(dFloor));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            AxisBase axisBase4 = this.mAxis;
            if (axisBase4.mCenteredEntries.length < labelCount) {
                axisBase4.mCenteredEntries = new float[labelCount];
            }
            float f4 = ((float) dFloor) / 2.0f;
            for (int i5 = 0; i5 < labelCount; i5++) {
                AxisBase axisBase5 = this.mAxis;
                axisBase5.mCenteredEntries[i5] = axisBase5.mEntries[i5] + f4;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mXAxis entries length:");
        sb.append(this.mAxis.mEntries.length);
        sb.append(",axis min:");
        sb.append(this.mAxis.mAxisMinimum);
        sb.append(",max:");
        sb.append(this.mAxis.mAxisMaximum);
        computeSize();
    }

    public void d(boolean z) {
        this.b = z;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabels(Canvas canvas, float f, MPPointF mPPointF) {
        float fCalcTextWidth;
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean zIsCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (zIsCenterAxisLabelsEnabled) {
                fArr[i2] = this.mXAxis.mCenteredEntries[i2 / 2];
            } else {
                fArr[i2] = this.mXAxis.mEntries[i2 / 2];
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float chartWidth = fArr[i3];
            if (this.mViewPortHandler.isInBoundsX(chartWidth)) {
                ValueFormatter valueFormatter = this.mXAxis.getValueFormatter();
                XAxis xAxis = this.mXAxis;
                int i4 = i3 / 2;
                String axisLabel = valueFormatter.getAxisLabel(xAxis.mEntries[i4], xAxis);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    int i5 = this.mXAxis.mEntryCount;
                    if (i4 == i5 - 1 && i5 > 1) {
                        float fCalcTextWidth2 = Utils.calcTextWidth(this.mAxisLabelPaint, axisLabel);
                        if (this.d || (fCalcTextWidth2 > this.mViewPortHandler.offsetRight() * 2.0f && chartWidth + fCalcTextWidth2 > this.mViewPortHandler.getChartWidth())) {
                            chartWidth -= fCalcTextWidth2 / 2.0f;
                        }
                    } else if (i3 == 0) {
                        fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, axisLabel) / 2.0f;
                        chartWidth += fCalcTextWidth;
                    }
                } else {
                    int i6 = this.mXAxis.mEntryCount;
                    if (i4 == i6 - 1 && i6 > 1) {
                        float fCalcTextWidth3 = Utils.calcTextWidth(this.mAxisLabelPaint, axisLabel);
                        if (((1.0f - mPPointF.x) * fCalcTextWidth3) + chartWidth > this.mViewPortHandler.getChartWidth()) {
                            chartWidth -= (((1.0f - mPPointF.x) * fCalcTextWidth3) + chartWidth) - this.mViewPortHandler.getChartWidth();
                        }
                    } else if (i3 == 0) {
                        float fCalcTextWidth4 = Utils.calcTextWidth(this.mAxisLabelPaint, axisLabel);
                        float f2 = mPPointF.x;
                        if (chartWidth - (fCalcTextWidth4 * f2) < 0.0f) {
                            fCalcTextWidth = (fCalcTextWidth4 * f2) - chartWidth;
                            chartWidth += fCalcTextWidth;
                        }
                    }
                }
                drawLabel(canvas, axisLabel, chartWidth, f, mPPointF, labelRotationAngle);
            }
        }
    }

    public void e(float[] fArr) {
        this.f11920e = Arrays.copyOf(fArr, fArr.length * 2);
        for (int i = 0; i < fArr.length; i++) {
            this.f11920e[i * 2] = fArr[i];
        }
    }

    public void f(float[] fArr) {
        this.f = fArr;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(Canvas canvas) {
        float[] fArr = this.f11919c;
        if (fArr == null || fArr.length != 2) {
            super.renderAxisLine(canvas);
            return;
        }
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            this.mAxisLinePaint.setPathEffect(this.mXAxis.getAxisLineDashPathEffect());
            canvas.drawLine(this.f11919c[0], this.mViewPortHandler.contentBottom(), this.f11919c[1], this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (!this.mXAxis.isDrawGridLinesEnabled() || !this.mXAxis.isEnabled()) {
            return;
        }
        if (this.f11920e == null) {
            super.renderGridLines(canvas);
            return;
        }
        Path path = this.mRenderGridLinesPath;
        path.reset();
        setupGridPaint();
        int i = 0;
        while (true) {
            float[] fArr = this.f11920e;
            if (i >= fArr.length) {
                return;
            }
            float f = fArr[i];
            drawGridLine(canvas, f, f, path);
            i += 2;
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void setupGridPaint() {
        this.mGridPaint.setColor(this.mXAxis.getGridColor());
        this.mGridPaint.setStrokeWidth(Math.max(Math.round(this.mXAxis.getGridLineWidth()), 1));
        this.mGridPaint.setPathEffect(this.mXAxis.getGridDashPathEffect());
    }
}

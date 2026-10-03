package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes16.dex */
public class sbh extends XAxisRenderer {
    public boolean a;

    public sbh(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        this.a = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxisValues(float f, float f2) {
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
        double dRoundToNextSignificant = Utils.roundToNextSignificant(dAbs / ((double) labelCount));
        if (this.mAxis.isGranularityEnabled() && dRoundToNextSignificant < this.mAxis.getGranularity()) {
            dRoundToNextSignificant = this.mAxis.getGranularity();
        }
        if (this.a) {
            dRoundToNextSignificant = this.mAxis.getGranularity();
        }
        double dRoundToNextSignificant2 = Utils.roundToNextSignificant(Math.pow(10.0d, (int) Math.log10(dRoundToNextSignificant)));
        if (((int) (dRoundToNextSignificant / dRoundToNextSignificant2)) > 5) {
            dRoundToNextSignificant = Math.floor(dRoundToNextSignificant2 * 10.0d);
        }
        int iIsCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            dRoundToNextSignificant = ((float) dAbs) / (labelCount - 1);
            AxisBase axisBase2 = this.mAxis;
            axisBase2.mEntryCount = labelCount;
            if (axisBase2.mEntries.length < labelCount) {
                axisBase2.mEntries = new float[labelCount];
            }
            for (int i = 0; i < labelCount; i++) {
                this.mAxis.mEntries[i] = f3;
                f3 = (float) (((double) f3) + dRoundToNextSignificant);
            }
        } else {
            double dCeil = dRoundToNextSignificant == 0.0d ? 0.0d : Math.ceil(((double) f3) / dRoundToNextSignificant) * dRoundToNextSignificant;
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                dCeil -= dRoundToNextSignificant;
            }
            double dNextUp = dRoundToNextSignificant == 0.0d ? 0.0d : Utils.nextUp(Math.floor(((double) f2) / dRoundToNextSignificant) * dRoundToNextSignificant);
            if (dRoundToNextSignificant != 0.0d) {
                double d = dCeil;
                iIsCenterAxisLabelsEnabled = iIsCenterAxisLabelsEnabled;
                while (d <= dNextUp) {
                    d += dRoundToNextSignificant;
                    iIsCenterAxisLabelsEnabled++;
                }
            }
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = iIsCenterAxisLabelsEnabled;
            if (axisBase3.mEntries.length < iIsCenterAxisLabelsEnabled) {
                axisBase3.mEntries = new float[iIsCenterAxisLabelsEnabled];
            }
            for (int i2 = 0; i2 < iIsCenterAxisLabelsEnabled; i2++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.mAxis.mEntries[i2] = (float) dCeil;
                dCeil += dRoundToNextSignificant;
            }
            labelCount = iIsCenterAxisLabelsEnabled;
        }
        if (dRoundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(dRoundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (this.mAxis.isCenterAxisLabelsEnabled()) {
            AxisBase axisBase4 = this.mAxis;
            if (axisBase4.mCenteredEntries.length < labelCount) {
                axisBase4.mCenteredEntries = new float[labelCount];
            }
            float f4 = ((float) dRoundToNextSignificant) / 2.0f;
            for (int i3 = 0; i3 < labelCount; i3++) {
                AxisBase axisBase5 = this.mAxis;
                axisBase5.mCenteredEntries[i3] = axisBase5.mEntries[i3] + f4;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabels(Canvas canvas, float f, MPPointF mPPointF) {
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
            if (this.mXAxis.isForceLabelsEnabled() || this.mViewPortHandler.isInBoundsX(chartWidth)) {
                ValueFormatter valueFormatter = this.mXAxis.getValueFormatter();
                XAxis xAxis = this.mXAxis;
                int i4 = i3 / 2;
                String axisLabel = valueFormatter.getAxisLabel(xAxis.mEntries[i4], xAxis);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    int i5 = this.mXAxis.mEntryCount;
                    if (i4 == i5 - 1 && i5 > 1) {
                        float fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, axisLabel);
                        if (((1.0f - mPPointF.x) * fCalcTextWidth) + chartWidth > this.mViewPortHandler.getChartWidth()) {
                            chartWidth -= (((1.0f - mPPointF.x) * fCalcTextWidth) + chartWidth) - this.mViewPortHandler.getChartWidth();
                        }
                    } else if (i3 == 0) {
                        float fCalcTextWidth2 = Utils.calcTextWidth(this.mAxisLabelPaint, axisLabel);
                        float f2 = mPPointF.x;
                        if (chartWidth - (fCalcTextWidth2 * f2) < 0.0f) {
                            chartWidth += (fCalcTextWidth2 * f2) - chartWidth;
                        }
                    }
                }
                drawLabel(canvas, axisLabel, chartWidth, f, mPPointF, labelRotationAngle);
            }
        }
    }
}

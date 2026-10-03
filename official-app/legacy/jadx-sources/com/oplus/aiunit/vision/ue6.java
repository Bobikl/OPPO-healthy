package com.oplus.aiunit.vision;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes16.dex */
public class ue6 extends XAxisRenderer {
    public float a;

    public ue6(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
    }

    public float a() {
        return this.a;
    }

    public void b(float f) {
        this.a = f;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutX()) {
            MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop());
            if (z) {
                f3 = (float) valuesByTouchPoint2.x;
                d = valuesByTouchPoint.x;
            } else {
                f3 = (float) valuesByTouchPoint.x;
                d = valuesByTouchPoint2.x;
            }
            MPPointD.recycleInstance(valuesByTouchPoint);
            MPPointD.recycleInstance(valuesByTouchPoint2);
            f = f3;
            f2 = (float) d;
        }
        computeAxisValues(f, f2);
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
        } else {
            double dRoundToNextSignificant = Utils.roundToNextSignificant(dAbs / ((double) labelCount));
            if (this.mAxis.isGranularityEnabled()) {
                dRoundToNextSignificant = a() != 0.0f ? a() : this.mAxis.getGranularity();
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
                double dRound = dRoundToNextSignificant == 0.0d ? 0.0d : Math.round(((double) f3) / dRoundToNextSignificant) * dRoundToNextSignificant;
                if (this.mAxis.isCenterAxisLabelsEnabled()) {
                    dRound -= dRoundToNextSignificant;
                }
                double dNextUp = dRoundToNextSignificant == 0.0d ? 0.0d : Utils.nextUp(Math.round(((double) f2) / dRoundToNextSignificant) * dRoundToNextSignificant);
                if (dRoundToNextSignificant != 0.0d) {
                    double d = dRound;
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
                    if (dRound == 0.0d) {
                        dRound = 0.0d;
                    }
                    this.mAxis.mEntries[i2] = (float) dRound;
                    dRound += dRoundToNextSignificant;
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
        computeSize();
    }
}

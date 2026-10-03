package com.heytap.health.core.widget.charts.renderer;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b01;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.w9e;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class BaseBarChartRenderer extends BarChartRenderer {
    public float a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3819c;
    public LinkedList<Float> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3820e;
    public boolean f;
    public int g;
    public Path h;
    public Path i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3821j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BarStyle f3822l;
    public RectF m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3823n;

    public enum BarStyle {
        RECT,
        ROUND
    }

    public BaseBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.a = 0.0f;
        this.b = true;
        this.f3819c = false;
        this.d = new LinkedList<>();
        this.f3820e = false;
        this.f = false;
        this.g = 1;
        this.h = new Path();
        this.i = new Path();
        this.f3821j = 0;
        this.k = 1;
        this.f3822l = BarStyle.ROUND;
        this.m = new RectF();
    }

    public void A(float f) {
        this.a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(IBarDataSet iBarDataSet, int i) {
        float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
        if (this.f) {
            RectF rectF = this.m;
            float f = i;
            rectF.left = f - barWidth;
            rectF.right = f + barWidth;
            return;
        }
        float x = ((BarEntry) iBarDataSet.getEntryForIndex(i)).getX();
        RectF rectF2 = this.m;
        rectF2.left = x - barWidth;
        rectF2.right = x + barWidth;
    }

    public void C(boolean z) {
        this.f3819c = z;
    }

    public void D(boolean z) {
        this.b = z;
    }

    public final void a() {
        BarData barData = this.mChart.getBarData();
        boolean z = this.mBarBuffers == null || barData.getDataSetCount() != this.mBarBuffers.length;
        if (!z) {
            for (int i = 0; i < barData.getDataSetCount(); i++) {
                IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
                int entryCount = iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1);
                BarBuffer barBuffer = this.mBarBuffers[i];
                if (barBuffer == null || barBuffer.size() < entryCount) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("barBuffers.size:");
                    BarBuffer barBuffer2 = this.mBarBuffers[i];
                    sb.append(barBuffer2 == null ? 0 : barBuffer2.size());
                    sb.append(",dataSize:");
                    sb.append(entryCount);
                    a7b.b("BaseBarChartRenderer", sb.toString());
                    z = true;
                }
            }
        }
        if (z) {
            a7b.b("BaseBarChartRenderer", "checkIfBufferError initBuffers");
            initBuffers();
        }
    }

    public void b(Canvas canvas, IBarDataSet iBarDataSet, BarBuffer barBuffer) {
        boolean z = iBarDataSet.getBarBorderWidth() > 0.0f;
        int stackSize = iBarDataSet.getStackSize();
        int stackSize2 = this.mXBounds.min * 4 * stackSize;
        while (true) {
            float f = stackSize2;
            float phaseX = this.mAnimator.getPhaseX();
            BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
            if (f > AnimatorUtil.a(phaseX, xBounds.min, xBounds.max) * 4.0f * stackSize) {
                return;
            }
            int i = stackSize2 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[stackSize2])) {
                    return;
                }
                u(iBarDataSet, barBuffer, stackSize2);
                if (this.f3822l == BarStyle.ROUND) {
                    f(canvas, iBarDataSet, barBuffer, stackSize2, this.mAnimator.getPhaseY());
                    stackSize2 += (iBarDataSet.getStackSize() - 1) * 4;
                } else {
                    float phaseY = this.mAnimator.getPhaseY();
                    float[] fArr = barBuffer.buffer;
                    float f2 = fArr[stackSize2];
                    int i2 = stackSize2 + 3;
                    float fMin = Math.min(fArr[i2] - n(), barBuffer.buffer[stackSize2 + 1]);
                    float[] fArr2 = barBuffer.buffer;
                    canvas.drawRect(AnimatorUtil.c(phaseY, f2, fMin, fArr2[i], fArr2[i2]), this.mRenderPaint);
                }
                if (z) {
                    float phaseY2 = this.mAnimator.getPhaseY();
                    float[] fArr3 = barBuffer.buffer;
                    float f3 = fArr3[stackSize2];
                    int i3 = stackSize2 + 3;
                    float fMin2 = Math.min(fArr3[i3] - n(), barBuffer.buffer[stackSize2 + 1]);
                    float[] fArr4 = barBuffer.buffer;
                    canvas.drawRect(AnimatorUtil.c(phaseY2, f3, fMin2, fArr4[stackSize2 + 2], fArr4[i3]), this.mBarBorderPaint);
                }
            }
            stackSize2 += 4;
        }
    }

    public void c(Canvas canvas, IBarDataSet iBarDataSet, Transformer transformer) {
        float phaseX = this.mAnimator.getPhaseX();
        this.mAnimator.getPhaseY();
        this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
        int xChartMax = this.f ? (int) this.mChart.getXChartMax() : Math.min((int) Math.ceil(iBarDataSet.getEntryCount() * phaseX), iBarDataSet.getEntryCount());
        for (int xChartMin = this.f ? (int) this.mChart.getXChartMin() : 0; xChartMin < xChartMax; xChartMin++) {
            B(iBarDataSet, xChartMin);
            transformer.rectValueToPixel(this.m);
            if (this.mViewPortHandler.isInBoundsLeft(this.m.right)) {
                if (!this.mViewPortHandler.isInBoundsRight(this.m.left)) {
                    return;
                }
                this.m.top = this.mViewPortHandler.contentTop();
                this.m.bottom = this.mViewPortHandler.contentBottom();
                if (this.b || this.f3819c) {
                    float fWidth = (this.m.width() < this.m.height() ? this.m.width() : this.m.height()) / 2.0f;
                    float f = this.a;
                    float f2 = (f <= 0.0f || f >= fWidth) ? fWidth : f;
                    RectF rectF = this.m;
                    float f3 = rectF.left;
                    float f4 = rectF.top;
                    float f5 = rectF.right;
                    float f6 = rectF.bottom;
                    boolean z = this.b;
                    boolean z2 = this.f3819c;
                    canvas.drawPath(w9e.a(f3, f4, f5, f6, f2, f2, z, z, z2, z2), this.mShadowPaint);
                } else {
                    canvas.drawRect(this.m, this.mShadowPaint);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(Canvas canvas, IBarDataSet iBarDataSet, BarBuffer barBuffer, float f, float f2, MPPointF mPPointF) {
        ValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
        for (int i = 0; i < barBuffer.buffer.length * this.mAnimator.getPhaseX(); i += 4) {
            float[] fArr = barBuffer.buffer;
            float f3 = (fArr[i] + fArr[i + 2]) / 2.0f;
            if (!this.mViewPortHandler.isInBoundsRight(f3)) {
                return;
            }
            int i2 = i + 1;
            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i2]) && this.mViewPortHandler.isInBoundsLeft(f3)) {
                int i3 = i / 4;
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i3);
                float y = barEntry.getY();
                if (iBarDataSet.isDrawValuesEnabled()) {
                    drawValue(canvas, valueFormatter.getBarLabel(barEntry), f3, y >= 0.0f ? barBuffer.buffer[i2] + f : barBuffer.buffer[i + 3] + f2, iBarDataSet.getValueTextColor(i3));
                }
                if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                    Drawable icon = barEntry.getIcon();
                    Utils.drawImage(canvas, icon, (int) (f3 + mPPointF.x), (int) ((y >= 0.0f ? barBuffer.buffer[i2] + f : barBuffer.buffer[i + 3] + f2) + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.f3823n = 0;
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        this.mXBounds.set(this.mChart, iBarDataSet);
        this.g = iBarDataSet.getStackSize();
        if (this.mChart.isDrawBarShadowEnabled()) {
            c(canvas, iBarDataSet, transformer);
        }
        a();
        BarBuffer barBuffer = this.mBarBuffers[i];
        s(iBarDataSet, barBuffer, transformer, i);
        int iSave = canvas.save();
        b(canvas, iBarDataSet, barBuffer);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float y;
        float f;
        float f2;
        float f3;
        if (highlightArr != null) {
            BarData barData = this.mChart.getBarData();
            for (Highlight highlight : highlightArr) {
                IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
                if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                    BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                    if (isInBoundsX(barEntry, iBarDataSet)) {
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                        this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                        if (!(highlight.getStackIndex() >= 0 && barEntry.isStacked())) {
                            y = barEntry.getY();
                            f = 0.0f;
                        } else if (this.mChart.isHighlightFullBarEnabled()) {
                            y = barEntry.getPositiveSum();
                            f = -barEntry.getNegativeSum();
                        } else if (barEntry.getRanges() != null) {
                            Range range = barEntry.getRanges()[highlight.getStackIndex()];
                            f3 = range.from;
                            f2 = range.to;
                            prepareBarHighlight(barEntry.getX(), f3, f2, barData.getBarWidth() / 2.0f, transformer);
                            setHighlightDrawPos(highlight, this.mBarRect);
                            canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                        } else {
                            a7b.b("BaseBarChartRenderer", "BarEntry Range is null");
                        }
                        f2 = f;
                        f3 = y;
                        prepareBarHighlight(barEntry.getX(), f3, f2, barData.getBarWidth() / 2.0f, transformer);
                        setHighlightDrawPos(highlight, this.mBarRect);
                        canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                    }
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        float f;
        float f2;
        if (isDrawingValuesAllowed(this.mChart)) {
            List<T> dataSets = this.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            for (int i = 0; i < this.mChart.getBarData().getDataSetCount(); i++) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i);
                if (shouldDrawValues(iBarDataSet)) {
                    applyValueTextStyle(iBarDataSet);
                    boolean zIsInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, s04.VIA_SHARE_TYPE_PUBLISHVIDEO);
                    float f3 = zIsDrawValueAboveBarEnabled ? -fConvertDpToPixel : fCalcTextHeight + fConvertDpToPixel;
                    float f4 = zIsDrawValueAboveBarEnabled ? fCalcTextHeight + fConvertDpToPixel : -fConvertDpToPixel;
                    if (zIsInverted) {
                        f = (-f3) - fCalcTextHeight;
                        f2 = (-f4) - fCalcTextHeight;
                    } else {
                        f = f3;
                        f2 = f4;
                    }
                    BarBuffer barBuffer = this.mBarBuffers[i];
                    MPPointF mPPointF = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF.x = Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = Utils.convertDpToPixel(mPPointF.y);
                    if (iBarDataSet.isStacked()) {
                        g(canvas, iBarDataSet, barBuffer, f, f2, mPPointF);
                    } else {
                        d(canvas, iBarDataSet, barBuffer, f, f2, mPPointF);
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(Canvas canvas, IBarDataSet iBarDataSet, BarBuffer barBuffer, int i, int i2, float f, float f2, MPPointF mPPointF) {
        BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i);
        int valueTextColor = iBarDataSet.getValueTextColor(i);
        ValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
        float[] fArr = barBuffer.buffer;
        float f3 = (fArr[i2] + fArr[i2 + 2]) / 2.0f;
        if (iBarDataSet.isDrawValuesEnabled()) {
            drawValue(canvas, valueFormatter.getBarLabel(barEntry), f3, barBuffer.buffer[i2 + 1] + (barEntry.getY() >= 0.0f ? f : f2), valueTextColor);
        }
        if (barEntry.getIcon() == null || !iBarDataSet.isDrawIconsEnabled()) {
            return;
        }
        Drawable icon = barEntry.getIcon();
        Utils.drawImage(canvas, icon, (int) (f3 + mPPointF.x), (int) (barBuffer.buffer[i2 + 1] + (barEntry.getY() >= 0.0f ? f : f2) + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
    }

    public void f(Canvas canvas, IBarDataSet iBarDataSet, BarBuffer barBuffer, int i, float f) {
        float f2;
        this.h.reset();
        float fAbs = this.a;
        boolean z = this.b;
        if (z && !this.f3819c) {
            f2 = 0.0f;
        } else if (z || !this.f3819c) {
            f2 = fAbs;
        } else {
            f2 = fAbs;
            fAbs = 0.0f;
        }
        MPPointF mPPointFK = k(barBuffer, this.g, i);
        u(iBarDataSet, barBuffer, i);
        if (this.f3820e) {
            if (this.b) {
                float[] fArr = barBuffer.buffer;
                fAbs = Math.abs(fArr[i + 2] - fArr[i]) / 2.0f;
            } else {
                fAbs = 0.0f;
            }
            f2 = this.f3819c ? fAbs : 0.0f;
        }
        Path path = this.h;
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr2 = barBuffer.buffer;
        path.addRoundRect(AnimatorUtil.c(phaseY, fArr2[i], mPPointFK.y, fArr2[i + 2], mPPointFK.x), new float[]{fAbs, fAbs, fAbs, fAbs, f2, f2, f2, f2}, Path.Direction.CW);
        MPPointF.recycleInstance(mPPointFK);
        canvas.drawPath(this.h, this.mRenderPaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(Canvas canvas, IBarDataSet iBarDataSet, BarBuffer barBuffer, float f, float f2, MPPointF mPPointF) {
        float[] fArr;
        int i;
        float f3;
        float phaseY = this.mAnimator.getPhaseY();
        ValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        int i2 = 0;
        int length = 0;
        while (i2 < iBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i2);
            float[] yVals = barEntry.getYVals();
            float[] fArr2 = barBuffer.buffer;
            float f4 = (fArr2[length] + fArr2[length + 2]) / 2.0f;
            if (yVals != null) {
                fArr = yVals;
                i = i2;
                int length2 = fArr.length * 2;
                float[] fArr3 = new float[length2];
                float f5 = -barEntry.getNegativeSum();
                float f6 = 0.0f;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2) {
                    float f7 = fArr[i4];
                    if (f7 == 0.0f && (f6 == 0.0f || f5 == 0.0f)) {
                        float f8 = f5;
                        f5 = f7;
                        f3 = f8;
                    } else if (f7 >= 0.0f) {
                        f6 += f7;
                        f3 = f5;
                        f5 = f6;
                    } else {
                        f3 = f5 - f7;
                    }
                    fArr3[i3 + 1] = f5 * phaseY;
                    i3 += 2;
                    i4++;
                    f5 = f3;
                }
                transformer.pointValuesToPixel(fArr3);
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = i5 / 2;
                    float f9 = fArr[i6];
                    int i7 = i5;
                    float fMin = Math.min(fArr3[i5 + 1], this.mViewPortHandler.contentBottom() - n()) + (((f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1)) == 0 && (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)) == 0 && (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1)) > 0) || (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1)) < 0 ? f2 : f);
                    if (!this.mViewPortHandler.isInBoundsRight(f4)) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(f4)) {
                        int iP = p(iBarDataSet, i, i6);
                        if (iBarDataSet.isDrawValuesEnabled()) {
                            drawValue(canvas, valueFormatter.getBarStackedLabel(f9, barEntry), f4, fMin, iP);
                        }
                        h(canvas, iBarDataSet, i, f4, fMin, mPPointF);
                    } else {
                        f4 = f4;
                    }
                    i5 = i7 + 2;
                    fArr3 = fArr3;
                    f4 = f4;
                }
            } else {
                if (!this.mViewPortHandler.isInBoundsRight(f4)) {
                    return;
                }
                if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[length + 1]) && this.mViewPortHandler.isInBoundsLeft(f4)) {
                    fArr = yVals;
                    i = i2;
                    e(canvas, iBarDataSet, barBuffer, i2, length, f, f2, mPPointF);
                } else {
                    i2 = i2;
                }
            }
            length = fArr == null ? length + 4 : length + (fArr.length * 4);
            i2 = i + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(Canvas canvas, IBarDataSet iBarDataSet, int i, float f, float f2, MPPointF mPPointF) {
        BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i);
        if (barEntry.getIcon() == null || !iBarDataSet.isDrawIconsEnabled()) {
            return;
        }
        Drawable icon = barEntry.getIcon();
        Utils.drawImage(canvas, icon, (int) (f + mPPointF.x), (int) (f2 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
    }

    public int[] i(IBarDataSet iBarDataSet) {
        int size = iBarDataSet.getColors().size() == 1 ? 1 : (iBarDataSet.getColors().size() * 3) - 2;
        if (size == 1) {
            return new int[]{iBarDataSet.getColor()};
        }
        int[] iArr = new int[size];
        int i = 0;
        while (i < iBarDataSet.getColors().size()) {
            int i2 = i * 3;
            int i3 = i2 + 1;
            if (i3 > size - 1) {
                iArr[i2] = iBarDataSet.getColor(i);
                break;
            }
            iArr[i2] = iBarDataSet.getColor(i);
            iArr[i3] = iBarDataSet.getColor(i);
            i++;
            iArr[i2 + 2] = iBarDataSet.getColor(i);
        }
        return iArr;
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new b01(r(), iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    public float[] j(IBarDataSet iBarDataSet, BarBuffer barBuffer, int i) {
        int stackSize = iBarDataSet.getStackSize() == 1 ? 1 : (iBarDataSet.getStackSize() * 3) - 2;
        if (stackSize == 1) {
            return new float[]{1.0f};
        }
        float[] fArr = new float[stackSize];
        MPPointF mPPointFK = k(barBuffer, iBarDataSet.getStackSize(), i);
        float fAbs = Math.abs(mPPointFK.x - mPPointFK.y);
        for (int i2 = 0; i2 < iBarDataSet.getStackSize(); i2++) {
            int i3 = i2 * 3;
            int i4 = i2 * 4;
            int i5 = i3 + 1;
            if (i5 > stackSize - 1) {
                fArr[i3] = 1.0f;
                break;
            }
            float fAbs2 = Math.abs(barBuffer.buffer[(i4 + i) + 1] - mPPointFK.x) / fAbs;
            if (this.f3822l == BarStyle.ROUND && iBarDataSet.isDrawValuesEnabled()) {
                fAbs2 = Math.max(fAbs2, n() / fAbs);
            }
            fArr[i3] = fAbs2;
            fArr[i5] = fAbs2;
            fArr[i3 + 2] = fAbs2;
        }
        return fArr;
    }

    public MPPointF k(BarBuffer barBuffer, int i, int i2) {
        MPPointF mPPointF = MPPointF.getInstance();
        float f = barBuffer.buffer[q(barBuffer, i2 + 1)];
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = (i3 * 4) + i2 + 1;
            if (f > barBuffer.buffer[q(barBuffer, i4)]) {
                f = barBuffer.buffer[q(barBuffer, i4)];
            }
        }
        float f2 = barBuffer.buffer[q(barBuffer, i2 + 3)];
        mPPointF.x = f2;
        mPPointF.y = f;
        if (f2 > f && f2 - f < n()) {
            mPPointF.y = mPPointF.x - n();
        }
        return mPPointF;
    }

    public RectF l() {
        return this.mBarRect;
    }

    public MPPointF m(BarBuffer barBuffer, int i) {
        MPPointF mPPointF = MPPointF.getInstance();
        mPPointF.x = barBuffer.buffer[q(barBuffer, i)];
        mPPointF.y = barBuffer.buffer[q(barBuffer, i + 2)];
        return mPPointF;
    }

    public float n() {
        IBarDataSet iBarDataSet = (IBarDataSet) this.mChart.getBarData().getDataSetByIndex(0);
        float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, s04.VIA_SHARE_TYPE_PUBLISHVIDEO);
        float fConvertDpToPixel = Utils.convertDpToPixel(4.5f) * 2.0f;
        if (iBarDataSet.isDrawValuesEnabled()) {
            return fCalcTextHeight + fConvertDpToPixel;
        }
        return 0.0f;
    }

    public float o() {
        return this.a;
    }

    public int p(IBarDataSet iBarDataSet, int i, int i2) {
        return iBarDataSet.getValueTextColor(i);
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.mBarRect.set(f - f4, f2, f + f4, f3);
        transformer.rectToPixelPhase(this.mBarRect, Math.min(this.mAnimator.getPhaseY(), 1.0f));
    }

    public final int q(BarBuffer barBuffer, int i) {
        if (i < 0) {
            return i;
        }
        float[] fArr = barBuffer.buffer;
        return i >= fArr.length ? fArr.length - 1 : i;
    }

    public final float r() {
        BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider = this.mChart;
        if (!(barLineScatterCandleBubbleDataProvider instanceof BarLineChartBase)) {
            return 0.0f;
        }
        BarLineChartBase barLineChartBase = (BarLineChartBase) barLineScatterCandleBubbleDataProvider;
        return Math.min(barLineChartBase.getAxisLeft().isEnabled() ? barLineChartBase.getAxisLeft().mAxisMinimum : 0.0f, barLineChartBase.getAxisRight().isEnabled() ? barLineChartBase.getAxisRight().mAxisMinimum : 0.0f);
    }

    public void s(IBarDataSet iBarDataSet, BarBuffer barBuffer, Transformer transformer, int i) {
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        super.setHighlightDrawPos(highlight, rectF);
        if (rectF.top < 0.0f) {
            highlight.setDraw(rectF.centerX(), this.mViewPortHandler.getContentRect().top);
        }
    }

    public final void t(IBarDataSet iBarDataSet, BarBuffer barBuffer, int i) {
        if (iBarDataSet.getGradientColor() != null) {
            GradientColor gradientColor = iBarDataSet.getGradientColor();
            Paint paint = this.mRenderPaint;
            float[] fArr = barBuffer.buffer;
            float f = fArr[i];
            paint.setShader(new LinearGradient(f, fArr[i + 3], f, fArr[i + 1], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
            return;
        }
        if (iBarDataSet.getGradientColors() != null) {
            Paint paint2 = this.mRenderPaint;
            float[] fArr2 = barBuffer.buffer;
            float f2 = fArr2[i];
            float f3 = fArr2[i + 3];
            float f4 = fArr2[i + 1];
            int i2 = i / 4;
            paint2.setShader(new LinearGradient(f2, f3, f2, f4, iBarDataSet.getGradientColor(i2).getStartColor(), iBarDataSet.getGradientColor(i2).getEndColor(), Shader.TileMode.MIRROR));
        }
    }

    public void u(IBarDataSet iBarDataSet, BarBuffer barBuffer, int i) {
        if (iBarDataSet.getStackSize() > 1 && iBarDataSet.getColors().size() > 1) {
            w(iBarDataSet, barBuffer, i);
        } else if (iBarDataSet.getGradientColor() == null && iBarDataSet.getGradientColors() == null) {
            v(iBarDataSet, i);
        } else {
            t(iBarDataSet, barBuffer, i);
        }
    }

    public final void v(IBarDataSet iBarDataSet, int i) {
        if (iBarDataSet.getColors().size() == 1) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        } else {
            this.mRenderPaint.setColor(iBarDataSet.getColor(i / 4));
        }
    }

    public final void w(IBarDataSet iBarDataSet, BarBuffer barBuffer, int i) {
        MPPointF mPPointFK = k(barBuffer, this.g, i);
        float f = m(barBuffer, i).x;
        this.mRenderPaint.setShader(new LinearGradient(f, mPPointFK.x, f, mPPointFK.y, i(iBarDataSet), j(iBarDataSet, barBuffer, i), Shader.TileMode.CLAMP));
    }

    public void x(BarStyle barStyle) {
        this.f3822l = barStyle;
    }

    public void y(boolean z) {
        this.f = z;
    }

    public void z(boolean z) {
        this.f3820e = z;
    }
}

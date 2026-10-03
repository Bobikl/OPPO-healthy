package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.ColorInt;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.heytap.health.core.widget.charts.data.HealthRect;
import com.heytap.health.core.widget.charts.data.SleepDailyEntry;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class okh extends BarChartRenderer {
    public final String a;
    public final Paint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16449c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f16450e;
    public final Path f;
    public Map<Integer, Integer> g;
    public float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f16451j;

    @ColorInt
    public int k;

    public okh(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.a = "SleepDetailsChartRenderer";
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(2.0f);
        this.d = 2;
        this.f16450e = new Path();
        this.f = new Path();
        this.h = Utils.convertDpToPixel(4.0f);
        this.i = Utils.convertDpToPixel(2.0f);
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(IBarDataSet iBarDataSet, HealthRect healthRect) {
        if (healthRect.getData() != null) {
            Object data = healthRect.getData();
            if (data instanceof SleepUnitData) {
                GradientColor gradientColorE = e(((SleepUnitData) data).getType(), iBarDataSet);
                this.mRenderPaint.setShader(new LinearGradient(healthRect.getX(), healthRect.getY1(), healthRect.getX(), healthRect.getY(), gradientColorE.getStartColor(), gradientColorE.getEndColor(), Shader.TileMode.MIRROR));
            }
        }
        RectF rectFC = AnimatorUtil.c(this.mAnimator.getPhaseY(), healthRect.getX(), healthRect.getY(), healthRect.getX1(), healthRect.getY1());
        this.f16450e.reset();
        this.f16450e.addRoundRect(rectFC, new float[]{healthRect.getLeftTopRadius(), healthRect.getLeftTopRadius(), healthRect.getRightTopRadius(), healthRect.getRightTopRadius(), healthRect.getRightBottomRadius(), healthRect.getRightBottomRadius(), healthRect.getLeftBottomRadius(), healthRect.getLeftBottomRadius()}, Path.Direction.CW);
    }

    public void b() {
        if (this.mAnimator.getPhaseY() <= 0.0f || this.mAnimator.getPhaseY() >= 1.0f) {
            this.mAnimator.setPhaseY(0.0f);
            this.mAnimator.animateY(500);
        }
    }

    public final void c(Canvas canvas, Transformer transformer) {
        if (this.f16451j != null) {
            Paint paint = new Paint(1);
            int length = this.f16451j.length * 2;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i += 2) {
                fArr[i] = 0.0f;
                fArr[i + 1] = this.f16451j[i / 2];
            }
            transformer.pointValuesToPixel(fArr);
            paint.setColor(this.k);
            for (int i2 = 0; i2 < length; i2 += 4) {
                RectF rectF = new RectF(this.mViewPortHandler.contentLeft(), fArr[i2 + 1], this.mViewPortHandler.contentRight(), fArr[i2 + 3]);
                this.f.reset();
                Path path = this.f;
                float f = this.i;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.drawPath(this.f, paint);
            }
        }
    }

    public final GradientColor d(int i, IBarDataSet iBarDataSet) {
        if (i == 1) {
            return iBarDataSet.getGradientColors().get(0);
        }
        if (i != 2) {
            return i != 3 ? iBarDataSet.getGradientColors().get(3) : iBarDataSet.getGradientColors().get(2);
        }
        return iBarDataSet.getGradientColors().get(1);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        HealthRect healthRect;
        HealthRect healthRect2;
        int i2;
        int startColor;
        float x1;
        float y1;
        float x;
        float y;
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        BarBuffer barBuffer = this.mBarBuffers[i];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        c(canvas, transformer);
        transformer.pointValuesToPixel(barBuffer.buffer);
        boolean z = iBarDataSet.getColors().size() == 1;
        if (z) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        this.mRenderPaint.setAntiAlias(true);
        m8b.f("SleepDetailsChartRenderer", "buffer.size:" + barBuffer.size());
        if (barBuffer.size() < 4) {
            return;
        }
        float f = this.d / 2.0f;
        BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(0);
        float[] fArr = barBuffer.buffer;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = this.h;
        HealthRect healthRect3 = new HealthRect(f2, f3, f4, f5, f6, f6, 0.0f, 0.0f, barEntry.getData());
        int i3 = 4;
        while (i3 < barBuffer.size()) {
            int i4 = i3 + 2;
            if (!this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i4]) || !this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i3])) {
                return;
            }
            if (!z) {
                this.mRenderPaint.setColor(iBarDataSet.getColor(i3 / 4));
            }
            BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i3 / 4);
            float[] fArr2 = barBuffer.buffer;
            HealthRect healthRect4 = new HealthRect(fArr2[i3], fArr2[i3 + 1], fArr2[i4], fArr2[i3 + 3], 0.0f, 0.0f, 0.0f, 0.0f, barEntry2.getData());
            if (healthRect3.getX1() == healthRect4.getX()) {
                int i5 = this.f16449c;
                if (healthRect3.getData() != null) {
                    Object data = healthRect3.getData();
                    if (data instanceof SleepUnitData) {
                        SleepUnitData sleepUnitData = (SleepUnitData) healthRect4.getData();
                        GradientColor gradientColorE = e(((SleepUnitData) data).getType(), iBarDataSet);
                        GradientColor gradientColorE2 = e(sleepUnitData.getType(), iBarDataSet);
                        int endColor = gradientColorE.getEndColor();
                        startColor = gradientColorE2.getStartColor();
                        i2 = endColor;
                    } else {
                        i2 = i5;
                        startColor = i2;
                    }
                } else {
                    i2 = i5;
                    startColor = i2;
                }
                if (healthRect3.getY() > healthRect4.getY()) {
                    x1 = healthRect3.getX1() - f;
                    y1 = healthRect3.getY() + 5.0f;
                    x = healthRect4.getX() + f;
                    y = healthRect4.getY1() - 5.0f;
                    healthRect3.setRightBottomRadius(this.h);
                    healthRect4.setLeftTopRadius(this.h);
                } else {
                    x1 = healthRect3.getX1() - f;
                    y1 = healthRect3.getY1() - 5.0f;
                    x = healthRect4.getX() + f;
                    y = healthRect4.getY() + 5.0f;
                    healthRect3.setRightTopRadius(this.h);
                    healthRect4.setLeftBottomRadius(this.h);
                }
                float f7 = x1;
                this.b.setShader(new LinearGradient(f7, y1, f7, y, i2, startColor, Shader.TileMode.MIRROR));
                canvas.drawRect(f7, y - ((y - y1) * this.mAnimator.getPhaseY()), x, y, this.b);
                float x2 = healthRect3.getX1() + f;
                float x3 = healthRect4.getX() - f;
                if (x3 < this.mViewPortHandler.contentLeft()) {
                    x3 = this.mViewPortHandler.contentLeft();
                }
                if (x2 > this.mViewPortHandler.contentRight()) {
                    x2 = this.mViewPortHandler.contentRight();
                }
                healthRect3.setX1(x2);
                healthRect2 = healthRect4;
                healthRect2.setX(x3);
            } else {
                healthRect2 = healthRect4;
                healthRect3.setRightTopRadius(this.h);
                healthRect3.setRightBottomRadius(this.h);
                healthRect2.setLeftTopRadius(this.h);
                healthRect2.setLeftBottomRadius(this.h);
            }
            a(iBarDataSet, healthRect3);
            canvas.drawPath(this.f16450e, this.mRenderPaint);
            i3 += 4;
            if (i3 >= barBuffer.size()) {
                healthRect2.setRightTopRadius(this.h);
                healthRect2.setRightBottomRadius(this.h);
                a(iBarDataSet, healthRect2);
                canvas.drawPath(this.f16450e, this.mRenderPaint);
            }
            healthRect = healthRect3;
            healthRect3 = healthRect2;
        }
        if (barBuffer.size() == 4) {
            healthRect.setRightTopRadius(this.h);
            healthRect.setRightBottomRadius(this.h);
            a(iBarDataSet, healthRect);
            canvas.drawPath(this.f16450e, this.mRenderPaint);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float y;
        float f;
        float f2;
        float f3;
        BarData barData = this.mChart.getBarData();
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                SleepDailyEntry sleepDailyEntry = (SleepDailyEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(sleepDailyEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (highlight.getStackIndex() >= 0 && sleepDailyEntry.isStacked()) {
                        if (this.mChart.isHighlightFullBarEnabled()) {
                            y = sleepDailyEntry.getPositiveSum();
                            f = -sleepDailyEntry.getNegativeSum();
                        } else {
                            Range range = sleepDailyEntry.getRanges()[highlight.getStackIndex()];
                            f3 = range.from;
                            f2 = range.to;
                        }
                        prepareBarHighlight((sleepDailyEntry.getDuration() / 2.0f) + sleepDailyEntry.getX(), f3, f2, sleepDailyEntry.getDuration() / 2.0f, transformer);
                        setHighlightDrawPos(highlight, this.mBarRect);
                        canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                    } else {
                        y = sleepDailyEntry.getY();
                        f = 0.0f;
                    }
                    f2 = f;
                    f3 = y;
                    prepareBarHighlight((sleepDailyEntry.getDuration() / 2.0f) + sleepDailyEntry.getX(), f3, f2, sleepDailyEntry.getDuration() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    public final GradientColor e(int i, IBarDataSet iBarDataSet) {
        Integer num;
        Map<Integer, Integer> map = this.g;
        return (map == null || !map.containsKey(Integer.valueOf(i)) || (num = this.g.get(Integer.valueOf(i))) == null || num.intValue() == 1) ? d(i, iBarDataSet) : iBarDataSet.getGradientColors().get(4);
    }

    public void f(float[] fArr) {
        this.f16451j = fArr;
    }

    public void g(@ColorInt int i) {
        this.k = i;
    }

    public void h(int i) {
        this.f16449c = i;
    }

    public void i(float f) {
        this.h = Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new gfh(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    public void j(Map<Integer, Integer> map) {
        this.g = map;
    }
}
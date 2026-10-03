package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.heytap.health.core.widget.charts.HeartRateBarChart;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes16.dex */
public class al1 extends e11 {
    public float[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10672e;
    public int f;
    public float g;
    public float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10673j;
    public GradientColor k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GradientColor f10674l;
    public GradientColor m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10675n;
    public float o;
    public rjd p;
    public jll q;

    public al1(CandleDataProvider candleDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(candleDataProvider, chartAnimator, viewPortHandler);
        this.d = new float[4];
        this.f10672e = -1;
        this.f = -1;
        this.g = -2.0f;
        this.h = 95.0f;
        this.i = 70.0f;
        this.f10673j = -16711936;
        this.f10675n = true;
        this.o = Utils.convertDpToPixel(33.3f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.CandleStickChartRenderer
    public void drawDataSet(Canvas canvas, ICandleDataSet iCandleDataSet) {
        char c2;
        ICandleDataSet iCandleDataSet2 = iCandleDataSet;
        ChartAnimator chartAnimator = this.mAnimator;
        if (chartAnimator instanceof CustomChartAnimator) {
            this.q = ((CustomChartAnimator) chartAnimator).getWaveAnimatorHelper();
        }
        Transformer transformer = this.mChart.getTransformer(iCandleDataSet.getAxisDependency());
        this.mAnimator.getPhaseY();
        float barSpace = iCandleDataSet.getBarSpace();
        this.mXBounds.set(this.mChart, iCandleDataSet2);
        float yChartMin = this.mChart.getYChartMin();
        Path path = new Path();
        jll jllVar = this.q;
        if (jllVar != null) {
            ChartAnimator chartAnimator2 = this.mAnimator;
            BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
            jllVar.j(iCandleDataSet2, chartAnimator2, xBounds.min, xBounds.max);
        }
        int i = this.mXBounds.min;
        float f = 0.0f;
        char c3 = 0;
        float f2 = 100.0f;
        float f3 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            BarLineScatterCandleBubbleRenderer.XBounds xBounds2 = this.mXBounds;
            if (i > xBounds2.range + xBounds2.min) {
                break;
            }
            CandleEntry candleEntry = (CandleEntry) iCandleDataSet2.getEntryForIndex(i);
            if (candleEntry != null) {
                float x = candleEntry.getX();
                float high = candleEntry.getHigh();
                float low = candleEntry.getLow();
                if (x >= this.mChart.getLowestVisibleX() && x <= this.mChart.getHighestVisibleX()) {
                    if (high >= f3) {
                        i2 = i;
                        f3 = high;
                    }
                    if (low <= f2 && low > f) {
                        i3 = i;
                        f2 = low;
                    }
                }
                float[] fArr = this.d;
                float f4 = (1.0f - barSpace) / 2.0f;
                fArr[c3] = x - f4;
                fArr[1] = high;
                fArr[2] = x + f4;
                fArr[3] = low;
                transformer.pointValuesToPixel(fArr);
                float[] fArr2 = this.d;
                float f5 = fArr2[1];
                float f6 = fArr2[3];
                if (f5 == f6 && high > f) {
                    fArr2[1] = f5 + 1.0f;
                }
                float f7 = fArr2[2] - fArr2[c3];
                float f8 = fArr2[1];
                float f9 = f6 - f8;
                if (f9 < f7) {
                    float f10 = (f7 - f9) / 2.0f;
                    fArr2[1] = f8 - f10;
                    fArr2[3] = f6 + f10;
                }
                float fG = g(i);
                float[] fArr3 = this.d;
                RectF rectFB = AnimatorUtil.b(fG, fArr3[c3], fArr3[1], fArr3[2], fArr3[3]);
                float f11 = this.o;
                path.addRoundRect(rectFB, new float[]{f11, f11, f11, f11, f11, f11, f11, f11}, Path.Direction.CW);
            }
            i++;
            iCandleDataSet2 = iCandleDataSet;
            f = 0.0f;
            c3 = 0;
        }
        float fContentRight = this.mViewPortHandler.contentRight();
        float[] fArr4 = {0.0f, this.h, 0.0f, this.i};
        if (this.f12139c) {
            CandleDataProvider candleDataProvider = this.mChart;
            if (candleDataProvider instanceof HeartRateBarChart) {
                LocalDateTime lowestVisibleDate = ((HeartRateBarChart) candleDataProvider).getLowestVisibleDate();
                if (lowestVisibleDate.getDayOfMonth() == 1) {
                    int iLengthOfMonth = lowestVisibleDate.toLocalDate().lengthOfMonth();
                    if (31 - iLengthOfMonth > 0) {
                        fContentRight = this.mViewPortHandler.contentLeft() + ((iLengthOfMonth * (this.mViewPortHandler.contentRight() - this.mViewPortHandler.contentLeft())) / 31.0f);
                    }
                }
            }
        }
        transformer.pointValuesToPixel(fArr4);
        fArr4[2] = fContentRight;
        GradientColor gradientColor = this.k;
        if (gradientColor != null) {
            c2 = 1;
            f(canvas, path, gradientColor, new float[]{this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), fArr4[2], fArr4[1]});
        } else {
            c2 = 1;
        }
        GradientColor gradientColor2 = this.f10674l;
        if (gradientColor2 != null) {
            float[] fArr5 = new float[4];
            fArr5[0] = this.mViewPortHandler.contentLeft();
            fArr5[c2] = fArr4[c2];
            fArr5[2] = fArr4[2];
            fArr5[3] = fArr4[3];
            f(canvas, path, gradientColor2, fArr5);
        }
        GradientColor gradientColor3 = this.m;
        if (gradientColor3 != null && yChartMin < this.i) {
            f(canvas, path, gradientColor3, new float[]{this.mViewPortHandler.contentLeft(), fArr4[3], fArr4[2], this.mViewPortHandler.contentBottom()});
        }
        if (this.f12139c && fContentRight < this.mViewPortHandler.contentRight()) {
            int i4 = this.b;
            f(canvas, path, new GradientColor(i4, i4), new float[]{fArr4[2], this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom()});
        }
        rjd rjdVar = this.p;
        if (rjdVar != null && i3 != this.f) {
            rjdVar.a(f2);
        }
        this.g = f2;
        this.f = i3;
        this.f10672e = i2;
    }

    public final void f(Canvas canvas, Path path, GradientColor gradientColor, float[] fArr) {
        if (fArr == null || fArr.length != 4) {
            return;
        }
        canvas.save();
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        canvas.clipRect(fArr[0], fArr[1], fArr[2], fArr[3]);
        j(this.mRenderPaint, gradientColor, fArr);
        canvas.drawPath(path, this.mRenderPaint);
        canvas.restore();
    }

    public final float g(int i) {
        jll jllVar = this.q;
        return jllVar != null ? jllVar.d(this.mAnimator, i) : this.mAnimator.getPhaseY();
    }

    public void h(boolean z) {
        this.f10675n = z;
    }

    public void i(GradientColor gradientColor) {
        this.k = gradientColor;
    }

    public final void j(Paint paint, GradientColor gradientColor, float[] fArr) {
        if (gradientColor == null || fArr == null || fArr.length != 4) {
            return;
        }
        float f = fArr[0];
        paint.setShader(new LinearGradient(f, fArr[1], fArr[2], f, gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
    }

    public void k(float f) {
        this.o = f;
    }

    public void l(GradientColor gradientColor) {
        this.m = gradientColor;
    }

    public void m(GradientColor gradientColor) {
        this.f10674l = gradientColor;
    }

    public void n(float f) {
        this.h = f;
    }

    public void setOnHighestVisibleIndexChangeListener(cjd cjdVar) {
    }

    public void setOnLowestVisibleIndexChangeListener(rjd rjdVar) {
        this.p = rjdVar;
    }
}
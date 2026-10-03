package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextUtils;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes16.dex */
public class qsh extends gw8 {
    public static final String STR = "&";
    public static Rect m = new Rect();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Rect f15919n = new Rect();
    public static Paint.FontMetrics o = new Paint.FontMetrics();
    public float g;
    public final float h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15920j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15921l;

    public qsh(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        this.g = this.mXAxis.getYOffset();
        this.h = Utils.convertDpToPixel(26.0f);
        this.i = false;
        this.f15921l = true;
        this.f15920j = Utils.convertDpToPixel(3.0f);
        this.k = Utils.convertDpToPixel(2.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    @Override // com.oplus.aiunit.vision.gw8, com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
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
            if (axisBase2.mEntries.length < labelCount) {
                axisBase2.mEntries = new float[labelCount];
            }
            for (int i2 = 0; i2 < labelCount; i2++) {
                this.mAxis.mEntries[i2] = f3;
                f3 = (float) (((double) f3) + dFloor);
            }
        } else {
            double dRound = dFloor == 0.0d ? 0.0d : Math.round(((double) f3) / dFloor) * dFloor;
            if (this.a) {
                int i3 = (int) f3;
                if (i3 != 0) {
                    i3++;
                }
                dRound = i3;
            }
            if (f3 < this.mXAxis.getAxisMinimum()) {
                dRound = f3;
            }
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                dRound -= dFloor;
            }
            double dRound2 = dFloor == 0.0d ? 0.0d : Math.round(((double) f2) / dFloor) * dFloor;
            if (this.a) {
                dRound2 = (int) f2;
            }
            if (f2 > this.mXAxis.getAxisMaximum() || dRound2 > this.mXAxis.getAxisMaximum()) {
                dRound2 = this.mXAxis.getAxisMaximum();
            }
            if (dFloor != 0.0d) {
                double d = dRound;
                iIsCenterAxisLabelsEnabled = iIsCenterAxisLabelsEnabled;
                while (d <= dRound2) {
                    d += dFloor;
                    iIsCenterAxisLabelsEnabled++;
                }
            }
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = iIsCenterAxisLabelsEnabled;
            if (axisBase3.mEntries.length < iIsCenterAxisLabelsEnabled) {
                axisBase3.mEntries = new float[iIsCenterAxisLabelsEnabled];
            }
            for (int i4 = 0; i4 < iIsCenterAxisLabelsEnabled; i4++) {
                if (dRound == 0.0d) {
                    dRound = 0.0d;
                }
                this.mAxis.mEntries[i4] = (float) dRound;
                dRound += dFloor;
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
        computeSize();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabel(Canvas canvas, String str, float f, float f2, MPPointF mPPointF, float f3) {
        String[] strArrSplit = str.contains("&") ? str.split("&") : null;
        float f4 = f2 - this.h;
        Paint paint = this.mAxisLabelPaint;
        paint.setTextSize(Utils.convertDpToPixel(10.0f));
        float fontMetrics = paint.getFontMetrics(o);
        paint.getTextBounds(str, 0, str.length(), m);
        float f5 = (-o.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f3 != 0.0f) {
            float fWidth = 0.0f - (m.width() * 0.5f);
            float f6 = f5 - (fontMetrics * 0.5f);
            if (mPPointF.x != 0.5f || mPPointF.y != 0.5f) {
                FSize sizeOfRotatedRectangleByDegrees = Utils.getSizeOfRotatedRectangleByDegrees(m.width(), fontMetrics, f3);
                f -= sizeOfRotatedRectangleByDegrees.width * (mPPointF.x - 0.5f);
                f4 = f2 - (sizeOfRotatedRectangleByDegrees.height * (mPPointF.y - 0.5f));
                FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
            }
            canvas.save();
            canvas.translate(f, f4);
            canvas.rotate(f3);
            canvas.drawText(str, fWidth, f6, paint);
            canvas.restore();
        } else {
            float f7 = f + 0.0f;
            float f8 = f5 + f4 + this.f15920j;
            if (strArrSplit == null || strArrSplit.length <= 0) {
                canvas.drawText(str, f7 - (m.width() / 2.0f), f8, paint);
            } else {
                for (int i = 0; i < strArrSplit.length; i++) {
                    String str2 = strArrSplit[i];
                    if (TextUtils.isEmpty(str2)) {
                        a7b.b("SmartXAxisRenderer", "drawLabel str is null");
                        return;
                    }
                    paint.getTextBounds(str2, 0, str2.length(), f15919n);
                    canvas.drawText(strArrSplit[i], f7 - (f15919n.width() / 2.0f), f8, paint);
                    f8 += this.k + fontMetrics;
                }
            }
        }
        paint.setTextAlign(textAlign);
    }

    public void g() {
    }

    public void h(boolean z) {
        this.f15921l = z;
    }

    public void i(boolean z) {
        this.i = z;
        g();
    }

    @Override // com.oplus.aiunit.vision.gw8, com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            int iSave = canvas.save();
            canvas.clipRect(getGridClippingRect());
            if (this.mRenderGridLinesBuffer.length != this.mAxis.mEntryCount * 2) {
                this.mRenderGridLinesBuffer = new float[this.mXAxis.mEntryCount * 2];
            }
            float[] fArr = this.mRenderGridLinesBuffer;
            int i = 0;
            for (int i2 = 0; i2 < fArr.length; i2 += 2) {
                float[] fArr2 = this.mXAxis.mEntries;
                int i3 = i2 / 2;
                fArr[i2] = fArr2[i3];
                fArr[i2 + 1] = fArr2[i3];
            }
            this.mTrans.pointValuesToPixel(fArr);
            setupGridPaint();
            Path path = this.mRenderGridLinesPath;
            path.reset();
            if (this.f15921l) {
                int i4 = this.mXAxis.mEntryCount;
                int i5 = i4 % 2 == 1 ? (i4 / 2) * 2 : -1;
                while (i < fArr.length) {
                    if (i == i5) {
                        this.mGridPaint.setStrokeWidth(Utils.convertDpToPixel(2.0f));
                        this.mGridPaint.setPathEffect(null);
                    } else {
                        this.mGridPaint.setStrokeWidth(Math.max(Math.round(this.mXAxis.getGridLineWidth()), 1));
                        this.mGridPaint.setPathEffect(this.mXAxis.getGridDashPathEffect());
                    }
                    drawGridLine(canvas, fArr[i], fArr[i + 1], path);
                    i += 2;
                }
            } else {
                while (i < fArr.length) {
                    this.mGridPaint.setStrokeWidth(Math.max(Math.round(this.mXAxis.getGridLineWidth()), 1));
                    this.mGridPaint.setPathEffect(this.mXAxis.getGridDashPathEffect());
                    drawGridLine(canvas, fArr[i], fArr[i + 1], path);
                    i += 2;
                }
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // com.oplus.aiunit.vision.gw8, com.github.mikephil.charting.renderer.XAxisRenderer
    public void setupGridPaint() {
        this.mGridPaint.setColor(this.mXAxis.getGridColor());
        this.mGridPaint.setStrokeWidth(Math.max(Math.round(this.mXAxis.getGridLineWidth()), 1));
        this.mGridPaint.setPathEffect(this.mXAxis.getGridDashPathEffect());
    }
}

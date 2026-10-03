package com.heytap.health.healthbase.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.health.health_base.R$color;
import com.heytap.health.health_base.R$drawable;
import com.heytap.health.health_base.R$styleable;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.hfk;
import com.oplus.aiunit.vision.rye;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class HealthProgressBarView extends View {
    private final String TAG;
    private float bgBottom;
    private float bgHeight;
    private float bgMarginTop;
    private Paint bgPaint;
    private CurSorType curSorType;
    private int cursorColor;
    private int cursorColor2;
    private float cursorMarginTop;
    private Paint cursorPaint;
    private float cursorRadius;
    private float cursorValue;
    private float cursorValue2;
    private float cursorX;
    private float cursorX2;
    private DescribeTextType describeType;
    private float intervalPx;
    private boolean isDrawCursor;
    private float maxRangeValue;
    private float minRangeValue;
    private float phaseY;
    private List<rye> progressSegmentList;
    private float radius;
    private float shadeViewHeight;
    private int textColor;
    private float textLineY;
    private float textMarginTop;
    private Paint textPaint;
    private float textSize;
    private int width;

    public enum CurSorType {
        CENTER,
        TRULY
    }

    public enum DescribeTextType {
        CENTER,
        INTERVAL,
        PADDING
    }

    public HealthProgressBarView(Context context) {
        super(context);
        this.TAG = "HealthProgressBarView";
        this.progressSegmentList = new ArrayList();
        this.describeType = DescribeTextType.INTERVAL;
        this.curSorType = CurSorType.CENTER;
        this.isDrawCursor = true;
        this.cursorValue = -1.0f;
        this.cursorValue2 = -1.0f;
        this.cursorX = -1.0f;
        this.cursorX2 = -1.0f;
        this.radius = 0.0f;
        this.phaseY = 1.0f;
        initView(null);
    }

    public static int calcTextWidth(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    private void drawBackground(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.progressSegmentList.size() <= 0) {
            a7b.b("HealthProgressBarView", "no data");
            return;
        }
        this.bgPaint.setStyle(Paint.Style.FILL);
        int i = 1;
        this.bgPaint.setAntiAlias(true);
        this.bgPaint.setColor(SupportMenu.CATEGORY_MASK);
        float fH = this.progressSegmentList.get(0).h();
        List<rye> list = this.progressSegmentList;
        float fC = list.get(list.size() - 1).c();
        float fAbs = this.width / Math.abs(fC - fH);
        StringBuilder sb = new StringBuilder();
        sb.append("drawBackground width:");
        sb.append(this.width);
        sb.append("/minValue:");
        sb.append(fH);
        sb.append("/maxValue:");
        sb.append(fC);
        sb.append("/unit:");
        sb.append(fAbs);
        this.cursorX = -1.0f;
        this.cursorX2 = -1.0f;
        float f5 = 0.0f;
        int i2 = 0;
        float fH2 = 0.0f;
        while (i2 < this.progressSegmentList.size()) {
            rye ryeVar = this.progressSegmentList.get(i2);
            if (fH2 <= f5) {
                fH2 = (ryeVar.h() - fH) * fAbs;
            }
            float fC2 = (ryeVar.c() - fH) * fAbs;
            if (i2 != 0) {
                fH2 += this.intervalPx / 2.0f;
            }
            if (i2 != this.progressSegmentList.size() - i) {
                fC2 -= this.intervalPx / 2.0f;
            }
            ryeVar.k(fH2);
            ryeVar.j(fC2);
            float f6 = fC2 - fH2;
            float fC3 = f6 / (ryeVar.c() - ryeVar.h());
            if (this.isDrawCursor && this.cursorValue >= ryeVar.h() && this.cursorValue <= ryeVar.c()) {
                if (this.curSorType == CurSorType.CENTER) {
                    this.cursorX = (f6 / 2.0f) + fH2;
                } else {
                    float fH3 = ((int) ((this.cursorValue - ryeVar.h()) * fC3)) + fH2;
                    this.cursorX = fH3;
                    float f7 = this.cursorRadius;
                    if (fH3 < f7) {
                        this.cursorX = (int) Math.ceil(f7);
                    } else {
                        int i3 = this.width;
                        if (fH3 > i3 - f7) {
                            this.cursorX = (int) Math.ceil(i3 - f7);
                        }
                    }
                }
            }
            if (this.isDrawCursor && this.cursorValue2 >= ryeVar.h() && this.cursorValue2 <= ryeVar.c()) {
                if (this.curSorType == CurSorType.CENTER) {
                    this.cursorX2 = (f6 / 2.0f) + fH2;
                } else {
                    float f8 = (int) ((this.cursorValue2 - fH) * fAbs);
                    this.cursorX2 = f8;
                    float f9 = this.cursorRadius;
                    if (f8 < f9) {
                        this.cursorX2 = (int) Math.ceil(f9);
                    } else {
                        int i4 = this.width;
                        if (f8 > i4 - f9) {
                            this.cursorX2 = (int) Math.ceil(i4 - f9);
                        }
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("startX:");
            sb2.append(fH2);
            sb2.append("/endX:");
            sb2.append(fC2);
            this.bgPaint.reset();
            this.bgPaint.setColor(ryeVar.a());
            RectF rectFC = AnimatorUtil.c(this.phaseY, fH2 * 1.0f, this.bgMarginTop, fC2 * 1.0f, this.bgBottom);
            Path path = new Path();
            if (i2 == 0) {
                f = this.radius;
                if (this.progressSegmentList.size() == i) {
                    f3 = this.radius;
                    f4 = f3;
                    f2 = f;
                } else {
                    f2 = f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                }
            } else if (i2 == this.progressSegmentList.size() - i) {
                f3 = this.radius;
                f4 = f3;
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 0.0f;
            }
            path.addRoundRect(rectFC, new float[]{f, f, f3, f3, f4, f4, f2, f2}, Path.Direction.CCW);
            canvas.drawPath(path, this.bgPaint);
            float f10 = this.maxRangeValue;
            float f11 = this.minRangeValue;
            if (f10 > f11 && f11 <= ryeVar.c() && this.maxRangeValue >= ryeVar.h()) {
                float fH4 = this.minRangeValue;
                if (fH4 < ryeVar.h()) {
                    fH4 = ryeVar.h();
                }
                float fC4 = this.maxRangeValue;
                if (fC4 > ryeVar.c()) {
                    fC4 = ryeVar.c();
                }
                float fC5 = f6 / (ryeVar.c() - ryeVar.h());
                float fH5 = ((fH4 - ryeVar.h()) * fC5) + fH2;
                float fH6 = ((fC4 - ryeVar.h()) * fC5) + fH2;
                if (fH6 > fH5) {
                    int i5 = (int) (this.cursorMarginTop + this.shadeViewHeight);
                    this.bgPaint.reset();
                    this.bgPaint.setColor(ryeVar.f());
                    float f12 = i5;
                    canvas.drawRect(AnimatorUtil.c(this.phaseY, fH5 * 1.0f, this.cursorMarginTop, 1.0f * fH6, f12), this.bgPaint);
                    this.bgPaint.reset();
                    this.bgPaint.setColor(ryeVar.e());
                    canvas.drawRect(AnimatorUtil.c(this.phaseY, fH5, f12, fH6, this.bgBottom), this.bgPaint);
                }
            }
            i2++;
            fH2 = fC2;
            i = 1;
            f5 = 0.0f;
        }
        drawDescribeText(canvas);
        drawProgressImg(canvas);
        if (this.cursorX2 > 0.0f) {
            drawProgressImg2(canvas);
        }
    }

    private void drawDescribeText(Canvas canvas) {
        this.textPaint.setStyle(Paint.Style.FILL);
        this.textPaint.setAntiAlias(true);
        this.textPaint.setStrokeWidth(0.0f);
        this.textPaint.setTextAlign(Paint.Align.LEFT);
        this.textPaint.setTextSize(this.textSize);
        this.textPaint.setColor(this.textColor);
        this.textPaint.setTypeface(Typeface.DEFAULT);
        Rect rect = new Rect();
        this.textPaint.getTextBounds("0", 0, 1, rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        StringBuilder sb = new StringBuilder();
        sb.append("text w=");
        sb.append(iWidth);
        sb.append("  h=");
        sb.append(iHeight);
        this.textLineY = this.bgBottom + this.textMarginTop + iHeight;
        for (int i = 0; i < this.progressSegmentList.size(); i++) {
            rye ryeVar = this.progressSegmentList.get(i);
            String strG = ryeVar.g();
            DescribeTextType describeTextType = this.describeType;
            if (describeTextType == DescribeTextType.INTERVAL) {
                if (i == this.progressSegmentList.size() - 1) {
                    this.textPaint.setTextAlign(Paint.Align.RIGHT);
                    drawItemText(canvas, ryeVar.b(), ryeVar.d(), this.textLineY);
                } else {
                    this.textPaint.setTextAlign(Paint.Align.LEFT);
                    float fI = ryeVar.i();
                    if (i != 0) {
                        fI = (fI - (calcTextWidth(this.textPaint, strG) / 2.0f)) - (this.intervalPx / 2.0f);
                    }
                    drawItemText(canvas, strG, fI, this.textLineY);
                }
            } else if (describeTextType == DescribeTextType.CENTER) {
                this.textPaint.setTextAlign(Paint.Align.CENTER);
                drawItemText(canvas, strG, ryeVar.i() + ((ryeVar.d() - ryeVar.i()) / 2.0f), this.textLineY);
            } else {
                drawItemText(canvas, strG, ryeVar.i(), this.textLineY);
                String strB = ryeVar.b();
                drawItemText(canvas, strB, ryeVar.d() - calcTextWidth(this.textPaint, strB), this.textLineY);
            }
        }
    }

    private void drawItemText(Canvas canvas, String str, float f, float f2) {
        StringBuilder sb = new StringBuilder();
        sb.append("drawText x:");
        sb.append(f);
        sb.append("/y:");
        sb.append(f2);
        sb.append("/textStr:");
        sb.append(str);
        canvas.drawText(str, f, f2, this.textPaint);
    }

    private void drawProgressImg(Canvas canvas) {
        if (this.cursorX < 0.0f) {
            return;
        }
        this.cursorPaint.setStyle(Paint.Style.FILL);
        this.cursorPaint.setAntiAlias(true);
        this.cursorPaint.setStrokeWidth(0.0f);
        this.cursorPaint.setColor(this.cursorColor);
        Bitmap bitmapDrawableToBitmap = drawableToBitmap(ContextCompat.getDrawable(b78.a(), R$drawable.health_icon_chart_cursor));
        canvas.drawBitmap(bitmapDrawableToBitmap, (Rect) null, AnimatorUtil.c(this.phaseY, this.cursorX - (bitmapDrawableToBitmap.getWidth() / 2.0f), this.bgBottom - bitmapDrawableToBitmap.getHeight(), this.cursorX + (bitmapDrawableToBitmap.getWidth() / 2.0f), this.bgBottom), this.cursorPaint);
    }

    private void drawProgressImg2(Canvas canvas) {
        if (this.cursorX2 < 0.0f) {
            return;
        }
        this.cursorPaint.setStyle(Paint.Style.FILL);
        this.cursorPaint.setAntiAlias(true);
        this.cursorPaint.setStrokeWidth(0.0f);
        this.cursorPaint.setColor(this.cursorColor2);
        Bitmap bitmapDrawableToBitmap = drawableToBitmap(ContextCompat.getDrawable(b78.a(), R$drawable.health_icon_chart_cursor));
        canvas.drawBitmap(bitmapDrawableToBitmap, (Rect) null, AnimatorUtil.c(this.phaseY, this.cursorX2 - (bitmapDrawableToBitmap.getWidth() / 2.0f), this.bgBottom - bitmapDrawableToBitmap.getHeight(), this.cursorX2 + (bitmapDrawableToBitmap.getWidth() / 2.0f), this.bgBottom), this.cursorPaint);
    }

    private void initView(AttributeSet attributeSet) {
        this.bgPaint = new Paint();
        this.textPaint = new Paint();
        this.cursorPaint = new Paint();
        this.bgHeight = hfk.a(getContext(), 18.0f);
        this.bgMarginTop = hfk.a(getContext(), 9.0f);
        this.intervalPx = hfk.a(getContext(), 4.0f);
        this.textSize = hfk.a(getContext(), 10.0f);
        this.textColor = ContextCompat.getColor(getContext(), R$color.health_FF4D4D4D);
        this.textMarginTop = hfk.a(getContext(), 3.0f);
        this.radius = ejg.l(getContext(), 2);
        this.isDrawCursor = true;
        Context context = getContext();
        int i = R$color.health_FFEC3E50;
        this.cursorColor = ContextCompat.getColor(context, i);
        this.cursorColor2 = ContextCompat.getColor(getContext(), i);
        this.cursorMarginTop = hfk.a(getContext(), 0.0f);
        this.cursorRadius = hfk.a(getContext(), 2.5f);
        this.shadeViewHeight = hfk.a(getContext(), 3.33f);
        TypedArray typedArrayObtainStyledAttributes = attributeSet == null ? null : getContext().obtainStyledAttributes(attributeSet, R$styleable.HealthProgressBarAttrs);
        if (typedArrayObtainStyledAttributes != null) {
            this.bgHeight = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_bgHeight, this.bgHeight);
            this.bgMarginTop = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_bgMarginTop, this.bgMarginTop);
            this.intervalPx = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_intervalPx, this.intervalPx);
            this.textSize = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_textSize, this.textSize);
            this.textColor = typedArrayObtainStyledAttributes.getColor(R$styleable.HealthProgressBarAttrs_textColor, this.textColor);
            this.textMarginTop = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_textMarginTop, this.textMarginTop);
            this.isDrawCursor = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HealthProgressBarAttrs_isDrawCursor, this.isDrawCursor);
            this.cursorColor = typedArrayObtainStyledAttributes.getColor(R$styleable.HealthProgressBarAttrs_cursorColor, this.cursorColor);
            this.cursorMarginTop = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_cursorMarginTop, this.cursorMarginTop);
            this.cursorRadius = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_cursorRadius, this.cursorRadius);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.bgBottom = this.bgMarginTop + this.bgHeight;
    }

    public void animateY() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(466L);
        objectAnimatorOfFloat.start();
    }

    public Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public float getPhaseY() {
        return this.phaseY;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.width = getMeasuredWidth();
        StringBuilder sb = new StringBuilder();
        sb.append("width:");
        sb.append(this.width);
        sb.append("/height:");
        sb.append(getMeasuredHeight());
        drawBackground(canvas);
    }

    public void setCurSorType(CurSorType curSorType) {
        this.curSorType = curSorType;
    }

    public void setCursorColor(int i) {
        this.cursorColor = i;
    }

    public void setCursorColor2(int i) {
        this.cursorColor2 = i;
    }

    public void setData(List<rye> list) {
        this.progressSegmentList = list;
        requestLayout();
        animateY();
    }

    public void setDescribeType(DescribeTextType describeTextType) {
        this.describeType = describeTextType;
    }

    public void setDrawCursor(boolean z) {
        this.isDrawCursor = z;
        if (z) {
            return;
        }
        this.cursorRadius = 0.0f;
    }

    public void setIntervalPx(int i) {
        this.intervalPx = i;
    }

    public void setPhaseY(float f) {
        this.phaseY = Math.max(0.2f, f);
        invalidate();
    }

    public void setRadius(int i) {
        this.radius = ejg.l(getContext(), i);
        invalidate();
    }

    public void setRange(float f, float f2) {
        this.minRangeValue = f;
        this.maxRangeValue = f2;
    }

    public void setData(List<rye> list, boolean z) {
        this.progressSegmentList = list;
        requestLayout();
        if (z) {
            animateY();
        }
    }

    public void setData(List<rye> list, float f) {
        this.progressSegmentList = list;
        this.cursorValue = f;
        requestLayout();
    }

    public void setData(List<rye> list, float f, float f2) {
        this.progressSegmentList = list;
        this.cursorValue = f;
        this.cursorValue2 = f2;
        requestLayout();
    }

    public HealthProgressBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "HealthProgressBarView";
        this.progressSegmentList = new ArrayList();
        this.describeType = DescribeTextType.INTERVAL;
        this.curSorType = CurSorType.CENTER;
        this.isDrawCursor = true;
        this.cursorValue = -1.0f;
        this.cursorValue2 = -1.0f;
        this.cursorX = -1.0f;
        this.cursorX2 = -1.0f;
        this.radius = 0.0f;
        this.phaseY = 1.0f;
        initView(attributeSet);
    }

    public HealthProgressBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "HealthProgressBarView";
        this.progressSegmentList = new ArrayList();
        this.describeType = DescribeTextType.INTERVAL;
        this.curSorType = CurSorType.CENTER;
        this.isDrawCursor = true;
        this.cursorValue = -1.0f;
        this.cursorValue2 = -1.0f;
        this.cursorX = -1.0f;
        this.cursorX2 = -1.0f;
        this.radius = 0.0f;
        this.phaseY = 1.0f;
        initView(attributeSet);
    }
}

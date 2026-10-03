package com.heytap.msp.sdk.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.msp.sdk.R$styleable;

/* JADX INFO: loaded from: classes19.dex */
public class RingTypeProgressBar extends View {
    private int mCircleColor;
    private Paint mCirclePaint;
    private int mProgress;
    private float mRadius;
    private int mRingBgColor;
    private int mRingColor;
    private Paint mRingPaint;
    private Paint mRingPaintBg;
    private float mRingRadius;
    private float mStrokeWidth;
    private int mTotalProgress;
    private int mxCenter;
    private int myCenter;

    public RingTypeProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTotalProgress = 100;
        initAttrs(context, attributeSet);
        initVariable();
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.RingTypeProgressBar, 0, 0);
        this.mRadius = typedArrayObtainStyledAttributes.getDimension(R$styleable.RingTypeProgressBar_radius, 20.0f);
        this.mStrokeWidth = typedArrayObtainStyledAttributes.getDimension(R$styleable.RingTypeProgressBar_strokeWidth, 10.0f);
        this.mCircleColor = typedArrayObtainStyledAttributes.getColor(R$styleable.RingTypeProgressBar_circleColor, 16777215);
        this.mRingColor = typedArrayObtainStyledAttributes.getColor(R$styleable.RingTypeProgressBar_ringColor, 16777215);
        this.mRingBgColor = typedArrayObtainStyledAttributes.getColor(R$styleable.RingTypeProgressBar_ringBgColor, 16777215);
        this.mRingRadius = this.mRadius + (this.mStrokeWidth / 2.0f);
    }

    private void initVariable() {
        Paint paint = new Paint();
        this.mCirclePaint = paint;
        paint.setAntiAlias(true);
        this.mCirclePaint.setColor(this.mCircleColor);
        this.mCirclePaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.mRingPaintBg = paint2;
        paint2.setAntiAlias(true);
        this.mRingPaintBg.setColor(this.mRingBgColor);
        this.mRingPaintBg.setStyle(Paint.Style.STROKE);
        this.mRingPaintBg.setStrokeWidth(this.mStrokeWidth);
        Paint paint3 = new Paint();
        this.mRingPaint = paint3;
        paint3.setAntiAlias(true);
        this.mRingPaint.setColor(this.mRingColor);
        this.mRingPaint.setStyle(Paint.Style.STROKE);
        this.mRingPaint.setStrokeWidth(this.mStrokeWidth);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.mxCenter = getWidth() / 2;
        int height = getHeight() / 2;
        this.myCenter = height;
        canvas.drawCircle(this.mxCenter, height, this.mRadius, this.mCirclePaint);
        RectF rectF = new RectF();
        float f = this.mxCenter;
        float f2 = this.mRingRadius;
        float f3 = f - f2;
        rectF.left = f3;
        float f4 = this.myCenter - f2;
        rectF.top = f4;
        float f5 = f2 * 2.0f;
        rectF.right = f3 + f5;
        rectF.bottom = f5 + f4;
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.mRingPaintBg);
        if (this.mProgress > 0) {
            RectF rectF2 = new RectF();
            float f6 = this.mxCenter;
            float f7 = this.mRingRadius;
            float f8 = f6 - f7;
            rectF2.left = f8;
            float f9 = this.myCenter - f7;
            rectF2.top = f9;
            float f10 = f7 * 2.0f;
            rectF2.right = f8 + f10;
            rectF2.bottom = f10 + f9;
            canvas.drawArc(rectF2, -90.0f, (this.mProgress / this.mTotalProgress) * 360.0f, false, this.mRingPaint);
        }
    }

    public void setProgress(int i) {
        this.mProgress = i;
        postInvalidate();
    }
}

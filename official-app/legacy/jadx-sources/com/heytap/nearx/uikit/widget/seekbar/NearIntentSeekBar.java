package com.heytap.nearx.uikit.widget.seekbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.oplus.aiunit.vision.d01;

/* JADX INFO: loaded from: classes18.dex */
public class NearIntentSeekBar extends NearSeekBar {
    protected int mOldProgress;
    protected int mProgressShadowColor;
    protected Paint mShadowPaint;
    private float mThumbOutShadeRadius;

    public NearIntentSeekBar(Context context) {
        this(context, null);
    }

    private int getColor(View view, ColorStateList colorStateList, int i) {
        return colorStateList == null ? i : colorStateList.getColorForState(view.getDrawableState(), i);
    }

    private void initView() {
        this.mThumbOutShadeRadius = getResources().getDimensionPixelSize(R$dimen.nx_seekbar_intent_thumb_out_shade_radius);
        this.mProgressShadowColor = getResources().getColor(R$color.nx_seekbar_shadow_progress_color);
        Paint paint = new Paint();
        this.mShadowPaint = paint;
        paint.setAntiAlias(true);
        this.mShadowPaint.setStyle(Paint.Style.FILL);
        this.mShadowPaint.setDither(true);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00de  */
    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void drawActiveTrack(Canvas canvas, float f) {
        float start;
        float f2;
        float f3;
        float f4;
        RectF rectF;
        int i;
        float f5;
        getStart();
        int seekBarCenterY = getSeekBarCenterY();
        getWidth();
        getEnd();
        if (!this.mIsStartFromMiddle) {
            if (isLayoutRtl()) {
                float start2 = getStart() + this.mCurProgressPaddingHorizontal + f;
                float f6 = start2 - (this.mScale * f);
                float f7 = start2 - ((this.mSecondaryProgress * f) / this.mMax);
                f3 = start2;
                f4 = f6;
                start = f7;
                f2 = f3;
            } else {
                start = getStart() + this.mCurProgressPaddingHorizontal;
                float f8 = (this.mScale * f) + start;
                f2 = ((this.mSecondaryProgress * f) / this.mMax) + start;
                f3 = f8;
            }
            this.mPaint.setColor(getColor(this, this.mSecondaryProgressColor, NearSeekBar.DEFAULT_SECONDARYPROGRESS_COLOR));
            float f9 = this.mCurProgressRadius;
            float f10 = seekBarCenterY;
            this.mSecondaryProgressRect.set(start - f9, f10 - f9, f2 + f9, f9 + f10);
            RectF rectF2 = this.mSecondaryProgressRect;
            float f11 = this.mCurProgressRadius;
            canvas.drawRoundRect(rectF2, f11, f11, this.mPaint);
            RectF rectF3 = this.mProgressRect;
            float f12 = this.mCurProgressRadius;
            rectF3.set(f4, f10 - f12, f3, f10 + f12);
            this.mPaint.setColor(this.mProgressColor);
            float f13 = (this.mOldProgress * f) / 100.0f;
            RectF rectF4 = this.mProgressRect;
            float f14 = rectF4.left;
            float f15 = this.mCurProgressRadius;
            rectF4.set(f14 - f15, rectF4.top, f13 + f14 + f15, rectF4.bottom);
            rectF = new RectF();
            i = this.mOldProgress;
            if (i < 100 || i <= 0) {
                RectF rectF5 = this.mProgressRect;
                float f16 = rectF5.left;
                float f17 = this.mCurProgressRadius;
                rectF.set(f16 + f17, rectF5.top, rectF5.right - f17, rectF5.bottom);
            } else {
                RectF rectF6 = this.mProgressRect;
                rectF.set(rectF6.left + this.mCurProgressRadius, rectF6.top, rectF6.right, rectF6.bottom);
            }
            canvas.drawRect(rectF, this.mPaint);
            RectF rectF7 = this.mProgressRect;
            float f18 = this.mCurProgressRadius;
            canvas.drawRoundRect(rectF7, f18, f18, this.mPaint);
        }
        if (isLayoutRtl()) {
            start = getWidth() / 2.0f;
            f5 = start - ((this.mScale - 0.5f) * f);
        } else {
            float width = getWidth() / 2.0f;
            f5 = width;
            start = width + ((this.mScale - 0.5f) * f);
        }
        f2 = f5;
        f3 = f2;
        f4 = start;
        this.mPaint.setColor(getColor(this, this.mSecondaryProgressColor, NearSeekBar.DEFAULT_SECONDARYPROGRESS_COLOR));
        float f19 = this.mCurProgressRadius;
        float f110 = seekBarCenterY;
        this.mSecondaryProgressRect.set(start - f19, f110 - f19, f2 + f19, f19 + f110);
        RectF rectF8 = this.mSecondaryProgressRect;
        float f111 = this.mCurProgressRadius;
        canvas.drawRoundRect(rectF8, f111, f111, this.mPaint);
        RectF rectF9 = this.mProgressRect;
        float f112 = this.mCurProgressRadius;
        rectF9.set(f4, f110 - f112, f3, f110 + f112);
        this.mPaint.setColor(this.mProgressColor);
        float f113 = (this.mOldProgress * f) / 100.0f;
        RectF rectF10 = this.mProgressRect;
        float f114 = rectF10.left;
        float f115 = this.mCurProgressRadius;
        rectF10.set(f114 - f115, rectF10.top, f113 + f114 + f115, rectF10.bottom);
        rectF = new RectF();
        i = this.mOldProgress;
        if (i < 100) {
            RectF rectF11 = this.mProgressRect;
            float f116 = rectF11.left;
            float f117 = this.mCurProgressRadius;
            rectF.set(f116 + f117, rectF11.top, rectF11.right - f117, rectF11.bottom);
        } else {
            RectF rectF12 = this.mProgressRect;
            float f118 = rectF12.left;
            float f119 = this.mCurProgressRadius;
            rectF.set(f118 + f119, rectF12.top, rectF12.right - f119, rectF12.bottom);
        }
        canvas.drawRect(rectF, this.mPaint);
        RectF rectF13 = this.mProgressRect;
        float f120 = this.mCurProgressRadius;
        canvas.drawRoundRect(rectF13, f120, f120, this.mPaint);
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void drawThumbs(Canvas canvas) {
        float start;
        float seekBarWidth = getSeekBarWidth();
        int seekBarCenterY = getSeekBarCenterY();
        if (this.mIsStartFromMiddle) {
            start = isLayoutRtl() ? (getWidth() / 2.0f) - ((this.mScale - 0.5f) * seekBarWidth) : (getWidth() / 2.0f) + ((this.mScale - 0.5f) * seekBarWidth);
        } else {
            start = isLayoutRtl() ? ((getStart() + this.mCurProgressPaddingHorizontal) + seekBarWidth) - (this.mScale * seekBarWidth) : getStart() + this.mCurProgressPaddingHorizontal + (this.mScale * seekBarWidth);
        }
        float f = this.mCurThumbOutRadius;
        float f2 = start - f;
        float f3 = start + f;
        this.mShadowPaint.setColor(this.mProgressColor);
        this.mShadowPaint.setShadowLayer(this.mCurThumbOutRadius + this.mThumbOutShadeRadius, 0.0f, 0.0f, this.mProgressShadowColor);
        if (this.mIsDragging || this.mStartDragging) {
            float f4 = this.mThumbOutShadeRadius;
            float f5 = seekBarCenterY;
            float f6 = this.mCurThumbOutRadius;
            canvas.drawRoundRect(f2 - f4, (f5 - f6) - f4, f3 + f4, f5 + f6 + f4, f6 + f4, f6 + f4, this.mShadowPaint);
        } else {
            float f7 = seekBarCenterY;
            float f8 = this.mCurThumbOutRadius;
            canvas.drawRoundRect(f2, f7 - f8, f3, f7 + f8, f8, f8, this.mShadowPaint);
        }
        this.mDrawX = f2 + ((f3 - f2) / 2.0f);
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void handleMotionEventUp(MotionEvent motionEvent) {
        this.mFastMoveSpring.o(0.0d);
        if (this.mIsDragging) {
            onStopTrackingTouch();
            setPressed(false);
            releaseAnim();
        } else if (touchInSeekBar(motionEvent, this)) {
            animForClick(motionEvent.getX());
        }
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar, com.oplus.aiunit.vision.s50
    public /* bridge */ /* synthetic */ void onAnimationStart(d01 d01Var) {
        super.onAnimationStart(d01Var);
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar, android.view.View
    public void onDraw(Canvas canvas) {
        drawInactiveTrack(canvas);
        drawActiveTrack(canvas, getSeekBarWidth());
        drawThumbs(canvas);
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void onStopTrackingTouch() {
        this.mOldProgress = this.mProgress;
        super.onStopTrackingTouch();
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void setProgress(int i, boolean z, boolean z2) {
        this.mOldProgress = this.mProgress;
        int iMax = Math.max(0, Math.min(i, this.mMax));
        if (this.mOldProgress != iMax) {
            if (z) {
                animForClick(iMax);
            } else {
                this.mProgress = iMax;
                this.mOldProgress = iMax;
                this.mScale = iMax / this.mMax;
                NearSeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onProgressChanged(this, iMax, z2);
                }
                invalidate();
            }
            performFeedback();
        }
    }

    public NearIntentSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxSeekBarStyle);
    }

    public NearIntentSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOldProgress = 0;
        setMoveType(1);
        initView();
    }
}

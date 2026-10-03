package com.heytap.nearx.uikit.widget.seekbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.d01;
import com.oplus.aiunit.vision.vhc;
import com.oplus.aiunit.vision.xvk;
import com.oplus.os.LinearmotorVibrator;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes18.dex */
public class NearSectionSeekBar extends NearSeekBar {
    private static final float MARK_RADIUS_SCALE = 1.5f;
    private static final float MOVE_RATIO = 0.4f;
    private boolean isRunning;
    private boolean isStartDragging;
    private int mActionMoveDirection;
    private int mCurActiveMarkColor;
    private int mCurInactiveMarkColor;
    private float mCurMarkRadius;
    private float mCurrentOffset;
    private boolean mIsFastMoving;
    private float mMarkRadius;
    private float mMoveAnimationEndThumbX;
    private float mMoveAnimationStartThumbX;
    private float mMoveAnimationValue;
    private ValueAnimator mMoveAnimator;
    private boolean mOnStopTrackingMask;
    private float mOverstep;
    private final PorterDuffXfermode mPorterDuffXfermode;
    private float mThumbX;
    private int mTouchDownPos;
    private float mTouchDownThumbX;

    public NearSectionSeekBar(Context context) {
        this(context, null);
    }

    private void calculateThumbPositionByIndex() {
        int seekBarWidth = getSeekBarWidth();
        this.mThumbX = (this.mProgress * seekBarWidth) / this.mMax;
        if (isLayoutRtl()) {
            this.mThumbX = seekBarWidth - this.mThumbX;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getMoveSectionWidth() {
        return getSeekBarMoveWidth() / this.mMax;
    }

    private float getMoveThumbXByIndex(int i) {
        int seekBarMoveWidth = getSeekBarMoveWidth();
        float f = (i * seekBarMoveWidth) / this.mMax;
        float f2 = seekBarMoveWidth;
        float fMax = Math.max(0.0f, Math.min(f, f2));
        return isLayoutRtl() ? f2 - fMax : fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getSectionWidth() {
        return getSeekBarNormalWidth() / this.mMax;
    }

    private int getSeekBarMoveWidth() {
        return ((getWidth() - getStart()) - getEnd()) - (((int) (this.mProgressPaddingHorizontal * this.mHorizontalPaddingScale)) << 1);
    }

    private int getSeekBarNormalWidth() {
        return ((getWidth() - getStart()) - getEnd()) - (this.mProgressPaddingHorizontal << 1);
    }

    private int getThumbPosByX(float f) {
        int seekBarWidth = getSeekBarWidth();
        if (isLayoutRtl()) {
            f = seekBarWidth - f;
        }
        return Math.max(0, Math.min(Math.round((f * this.mMax) / seekBarWidth), this.mMax));
    }

    private float getThumbXByIndex(int i) {
        int seekBarNormalWidth = getSeekBarNormalWidth();
        float f = (i * seekBarNormalWidth) / this.mMax;
        float f2 = seekBarNormalWidth;
        float fMax = Math.max(0.0f, Math.min(f, f2));
        return isLayoutRtl() ? f2 - fMax : fMax;
    }

    private float getTouchXOfDrawArea(MotionEvent motionEvent) {
        return Math.min(Math.max(0.0f, (motionEvent.getX() - getPaddingLeft()) - this.mCurProgressPaddingHorizontal), getSeekBarWidth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateProgress(float f, boolean z) {
        float thumbXByIndex = getThumbXByIndex(this.mProgress);
        float fSubtract = subtract(f, thumbXByIndex);
        float sectionWidth = getSectionWidth();
        int iRound = this.isStartDragging ? (int) (fSubtract / sectionWidth) : Math.round(fSubtract / sectionWidth);
        if (this.mMoveAnimator != null && this.isRunning && this.mMoveAnimationEndThumbX == (iRound * sectionWidth) + thumbXByIndex) {
            return;
        }
        float f2 = iRound * sectionWidth;
        this.mCurrentOffset = f2;
        this.mOverstep = thumbXByIndex;
        this.mMoveAnimationEndThumbX = thumbXByIndex;
        float f3 = this.mThumbX - thumbXByIndex;
        this.mOnStopTrackingMask = true;
        startMoveAnimation(thumbXByIndex, f2 + thumbXByIndex, f3, z ? 100 : 0);
    }

    private void startMoveAnimation(float f, float f2, float f3, int i) {
        ValueAnimator valueAnimator;
        if (this.mThumbX == f2 || ((valueAnimator = this.mMoveAnimator) != null && this.isRunning && this.mMoveAnimationEndThumbX == f2)) {
            if (this.mOnStopTrackingMask) {
                onStopTrackingTouch();
                this.mOnStopTrackingMask = false;
                return;
            }
            return;
        }
        this.mMoveAnimationEndThumbX = f2;
        this.mMoveAnimationStartThumbX = f;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.mMoveAnimator = valueAnimator2;
            valueAnimator2.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 0.25f, 1.0f));
            this.mMoveAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSectionSeekBar.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    NearSectionSeekBar.this.mMoveAnimationValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    NearSectionSeekBar nearSectionSeekBar = NearSectionSeekBar.this;
                    nearSectionSeekBar.mThumbX = nearSectionSeekBar.mMoveAnimationStartThumbX + (NearSectionSeekBar.this.mMoveAnimationValue * 0.4f) + (NearSectionSeekBar.this.mCurrentOffset * 0.6f);
                    NearSectionSeekBar nearSectionSeekBar2 = NearSectionSeekBar.this;
                    nearSectionSeekBar2.mOverstep = nearSectionSeekBar2.mThumbX;
                    NearSectionSeekBar.this.invalidate();
                    NearSectionSeekBar nearSectionSeekBar3 = NearSectionSeekBar.this;
                    int iCeil = nearSectionSeekBar3.mProgress;
                    boolean z = true;
                    if (nearSectionSeekBar3.mMoveAnimationEndThumbX - NearSectionSeekBar.this.mMoveAnimationStartThumbX > 0.0f) {
                        iCeil = (int) (NearSectionSeekBar.this.mThumbX / (NearSectionSeekBar.this.isStartDragging ? NearSectionSeekBar.this.getMoveSectionWidth() : NearSectionSeekBar.this.getSectionWidth()));
                    } else if (NearSectionSeekBar.this.mMoveAnimationEndThumbX - NearSectionSeekBar.this.mMoveAnimationStartThumbX < 0.0f) {
                        iCeil = (int) Math.ceil(((int) NearSectionSeekBar.this.mThumbX) / (NearSectionSeekBar.this.isStartDragging ? NearSectionSeekBar.this.getMoveSectionWidth() : NearSectionSeekBar.this.getSectionWidth()));
                    } else {
                        z = false;
                    }
                    if (NearSectionSeekBar.this.isLayoutRtl() && z) {
                        iCeil = NearSectionSeekBar.this.mMax - iCeil;
                    }
                    NearSectionSeekBar.this.checkThumbPosChange(Math.min(Math.max(0, iCeil), NearSectionSeekBar.this.mMax));
                }
            });
            this.mMoveAnimator.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSectionSeekBar.4
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (NearSectionSeekBar.this.mOnStopTrackingMask) {
                        NearSectionSeekBar.this.onStopTrackingTouch();
                        NearSectionSeekBar.this.mOnStopTrackingMask = false;
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    NearSectionSeekBar.this.isRunning = false;
                    if (NearSectionSeekBar.this.mOnStopTrackingMask) {
                        NearSectionSeekBar.this.onStopTrackingTouch();
                        NearSectionSeekBar.this.mOnStopTrackingMask = false;
                    }
                    if (NearSectionSeekBar.this.mIsFastMoving) {
                        NearSectionSeekBar.this.mIsFastMoving = false;
                        NearSectionSeekBar nearSectionSeekBar = NearSectionSeekBar.this;
                        nearSectionSeekBar.invalidateProgress(nearSectionSeekBar.mLastX, true);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    NearSectionSeekBar.this.isRunning = true;
                }
            });
        }
        this.mMoveAnimator.cancel();
        if (this.isRunning) {
            return;
        }
        this.mMoveAnimator.setDuration(i);
        this.mMoveAnimator.setFloatValues(f3, f2 - f);
        this.mMoveAnimator.start();
    }

    private void trackTouchEvent(float f) {
        float fSubtract = subtract(f, this.mTouchDownThumbX);
        float f2 = fSubtract < 0.0f ? fSubtract - 0.1f : fSubtract + 0.1f;
        float moveSectionWidth = getMoveSectionWidth();
        int iFloatValue = (int) new BigDecimal(Float.toString(f2)).divide(new BigDecimal(Float.toString(moveSectionWidth)), RoundingMode.FLOOR).floatValue();
        float f3 = iFloatValue * moveSectionWidth;
        if (isLayoutRtl()) {
            iFloatValue = -iFloatValue;
        }
        this.mCurrentOffset = f2;
        if (Math.abs((this.mTouchDownPos + iFloatValue) - this.mProgress) > 0) {
            float f4 = this.mTouchDownThumbX;
            startMoveAnimation(f4, f3 + f4, this.mMoveAnimationValue, 100);
        } else {
            this.mThumbX = this.mTouchDownThumbX + f3 + ((this.mCurrentOffset - f3) * 0.6f);
            invalidate();
        }
        this.mLastX = f;
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void animForClick(int i) {
        AnimatorSet animatorSet = this.mClickAnimatorSet;
        if (animatorSet == null) {
            this.mClickAnimatorSet = new AnimatorSet();
        } else {
            animatorSet.cancel();
        }
        int i2 = (int) this.mDrawX;
        int i3 = (int) this.mThumbX;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSectionSeekBar.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearSectionSeekBar.this.mThumbX = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                NearSectionSeekBar.this.invalidate();
            }
        });
        float fAbs = Math.abs(i3 - i2) / getSeekBarWidth();
        valueAnimatorOfInt.setInterpolator(this.mThumbAnimateInterpolator);
        long j2 = (long) (fAbs * 483.0f);
        if (j2 < 150) {
            j2 = 150;
        }
        this.mClickAnimatorSet.setDuration(j2);
        this.mClickAnimatorSet.play(valueAnimatorOfInt);
        this.mClickAnimatorSet.start();
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void drawActiveTrack(Canvas canvas, float f) {
        float start;
        float start2;
        float width = (getWidth() - getEnd()) - this.mCurProgressPaddingHorizontal;
        int seekBarCenterY = getSeekBarCenterY();
        if (isLayoutRtl()) {
            start2 = getStart() + this.mCurProgressPaddingHorizontal + f;
            start = getStart() + this.mCurProgressPaddingHorizontal + this.mThumbX;
        } else {
            start = getStart() + this.mCurProgressPaddingHorizontal;
            start2 = this.mThumbX + start;
        }
        if (this.mShowProgress) {
            this.mPaint.setColor(this.mProgressColor);
            RectF rectF = this.mProgressRect;
            float f2 = seekBarCenterY;
            float f3 = this.mCurProgressRadius;
            rectF.set(start, f2 - f3, start2, f2 + f3);
            canvas.drawRect(this.mProgressRect, this.mPaint);
            if (isLayoutRtl()) {
                RectF rectF2 = this.mTempRect;
                float f4 = this.mCurProgressRadius;
                RectF rectF3 = this.mProgressRect;
                rectF2.set(width - f4, rectF3.top, f4 + width, rectF3.bottom);
                canvas.drawArc(this.mTempRect, -90.0f, 180.0f, true, this.mPaint);
            } else {
                RectF rectF4 = this.mTempRect;
                float f5 = this.mCurProgressRadius;
                RectF rectF5 = this.mProgressRect;
                rectF4.set(start - f5, rectF5.top, start + f5, rectF5.bottom);
                canvas.drawArc(this.mTempRect, 90.0f, 180.0f, true, this.mPaint);
            }
        }
        int iSaveLayer = canvas.saveLayer(null, null, 31);
        this.mPaint.setXfermode(this.mPorterDuffXfermode);
        int i = (!this.mShowProgress || isLayoutRtl()) ? this.mCurInactiveMarkColor : this.mCurActiveMarkColor;
        this.mPaint.setColor(i);
        float start3 = getStart() + this.mCurProgressPaddingHorizontal;
        float f6 = width - start3;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int i3 = this.mMax;
            if (i2 > i3) {
                this.mPaint.setXfermode(null);
                canvas.restoreToCount(iSaveLayer);
                return;
            }
            if (this.mShowProgress && !z && ((i2 * f6) / i3) + start3 > getStart() + this.mCurProgressPaddingHorizontal + this.mThumbX) {
                this.mPaint.setColor(isLayoutRtl() ? this.mCurActiveMarkColor : this.mCurInactiveMarkColor);
                z = true;
            }
            canvas.drawCircle(((i2 * f6) / this.mMax) + start3, seekBarCenterY, this.mCurMarkRadius, this.mPaint);
            i2++;
        }
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void drawInactiveTrack(Canvas canvas) {
        if (this.mThumbX == -1.0f) {
            calculateThumbPositionByIndex();
        }
        int seekBarCenterY = getSeekBarCenterY();
        int iSaveLayer = canvas.saveLayer(null, null, 31);
        super.drawInactiveTrack(canvas);
        this.mPaint.setXfermode(this.mPorterDuffXfermode);
        float start = getStart() + this.mCurProgressPaddingHorizontal;
        float width = ((getWidth() - getEnd()) - this.mCurProgressPaddingHorizontal) - start;
        int i = (!this.mShowProgress || isLayoutRtl()) ? this.mBackgroundColor : this.mProgressColor;
        this.mPaint.setColor(i);
        int i2 = 0;
        boolean z = false;
        while (true) {
            int i3 = this.mMax;
            if (i2 > i3) {
                this.mPaint.setXfermode(null);
                canvas.restoreToCount(iSaveLayer);
                return;
            }
            if (this.mShowProgress && !z && ((i2 * width) / i3) + start > getStart() + this.mThumbX) {
                this.mPaint.setColor(isLayoutRtl() ? this.mProgressColor : this.mBackgroundColor);
                z = true;
            }
            canvas.drawCircle(((i2 * width) / this.mMax) + start, seekBarCenterY, this.mMarkRadius, this.mPaint);
            i2++;
        }
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void drawThumbs(Canvas canvas) {
        int seekBarCenterY = getSeekBarCenterY();
        int start = getStart() + this.mCurProgressPaddingHorizontal;
        this.mPaint.setColor(this.mThumbColor);
        canvas.drawCircle(start + Math.min(this.mThumbX, getSeekBarWidth()), seekBarCenterY, this.mCurThumbOutRadius, this.mPaint);
        this.mDrawX = this.mThumbX;
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void handleMotionEventDown(MotionEvent motionEvent) {
        float touchXOfDrawArea = getTouchXOfDrawArea(motionEvent);
        this.mTouchDownX = touchXOfDrawArea;
        this.mLastX = touchXOfDrawArea;
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void handleMotionEventMove(MotionEvent motionEvent) {
        float touchXOfDrawArea = getTouchXOfDrawArea(motionEvent);
        int i = -1;
        if (this.isStartDragging) {
            float f = this.mLastX;
            if (touchXOfDrawArea - f > 0.0f) {
                i = 1;
            } else if (touchXOfDrawArea - f >= 0.0f) {
                i = 0;
            }
            if (i == (-this.mActionMoveDirection)) {
                this.mActionMoveDirection = i;
                int i2 = this.mTouchDownPos;
                int i3 = this.mProgress;
                if (i2 != i3) {
                    this.mTouchDownPos = i3;
                    this.mTouchDownThumbX = getMoveThumbXByIndex(i3);
                    this.mMoveAnimationValue = 0.0f;
                }
                ValueAnimator valueAnimator = this.mMoveAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            trackTouchEvent(touchXOfDrawArea);
        } else {
            if (!touchInSeekBar(motionEvent, this)) {
                return;
            }
            if (Math.abs(touchXOfDrawArea - this.mTouchDownX) > this.mTouchSlop) {
                startDrag();
                touchAnim();
                int thumbPosByX = getThumbPosByX(this.mTouchDownX);
                this.mTouchDownPos = thumbPosByX;
                checkThumbPosChange(thumbPosByX);
                float moveThumbXByIndex = getMoveThumbXByIndex(this.mTouchDownPos);
                this.mTouchDownThumbX = moveThumbXByIndex;
                this.mMoveAnimationValue = 0.0f;
                this.mThumbX = moveThumbXByIndex;
                invalidate();
                trackTouchEvent(touchXOfDrawArea);
                this.mActionMoveDirection = touchXOfDrawArea - this.mTouchDownX > 0.0f ? 1 : -1;
            }
        }
        this.mLastX = touchXOfDrawArea;
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void handleMotionEventUp(MotionEvent motionEvent) {
        float touchXOfDrawArea = getTouchXOfDrawArea(motionEvent);
        if (!this.isStartDragging) {
            if (touchInSeekBar(motionEvent, this)) {
                invalidateProgress(touchXOfDrawArea, false);
            }
            animForClick(touchXOfDrawArea);
            return;
        }
        this.isStartDragging = false;
        if (this.mMoveAnimator != null && this.isRunning) {
            this.mIsFastMoving = true;
        }
        if (!this.mIsFastMoving) {
            invalidateProgress(touchXOfDrawArea, true);
        }
        onStopTrackingTouch(false);
        setPressed(false);
        releaseAnim();
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar, com.oplus.aiunit.vision.s50
    public /* bridge */ /* synthetic */ void onAnimationStart(d01 d01Var) {
        super.onAnimationStart(d01Var);
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void onEnlargeAnimationUpdate(ValueAnimator valueAnimator) {
        super.onEnlargeAnimationUpdate(valueAnimator);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = this.mMarkRadius;
        this.mCurMarkRadius = f + (animatedFraction * ((1.5f * f) - f));
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mThumbX = -1.0f;
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public boolean performAdaptiveFeedback() {
        if (this.mLinearMotorVibrator == null) {
            LinearmotorVibrator linearmotorVibratorA = xvk.a(getContext());
            this.mLinearMotorVibrator = linearmotorVibratorA;
            this.mHasMotorVibrator = linearmotorVibratorA != null;
        }
        Object obj = this.mLinearMotorVibrator;
        if (obj == null) {
            return false;
        }
        xvk.d((LinearmotorVibrator) obj, 0, this.mProgress, this.mMax, 200, 2400);
        return true;
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void performFeedback() {
        if ((this.mHasMotorVibrator && this.mEnableAdaptiveVibrator && performAdaptiveFeedback()) || !this.mVibrate || performHapticFeedback(308)) {
            return;
        }
        performHapticFeedback(302);
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void releaseAnim() {
        super.releaseAnim();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(PropertyValuesHolder.ofFloat("markRadius", this.mCurMarkRadius, this.mMarkRadius), PropertyValuesHolder.ofInt("activeAlpha", Color.alpha(this.mCurActiveMarkColor), 0), PropertyValuesHolder.ofInt("inactiveAlpha", Color.alpha(this.mCurInactiveMarkColor), 0));
        valueAnimator.setDuration(183L);
        valueAnimator.setInterpolator(this.mProgressScaleInterpolator);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSectionSeekBar.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NearSectionSeekBar.this.mCurMarkRadius = ((Float) valueAnimator2.getAnimatedValue("markRadius")).floatValue();
                int iIntValue = ((Integer) valueAnimator2.getAnimatedValue("activeAlpha")).intValue();
                int iIntValue2 = ((Integer) valueAnimator2.getAnimatedValue("inactiveAlpha")).intValue();
                NearSectionSeekBar.this.mCurActiveMarkColor = Color.argb(iIntValue, 0, 0, 0);
                NearSectionSeekBar.this.mCurInactiveMarkColor = Color.argb(iIntValue2, 255, 255, 255);
                NearSectionSeekBar.this.invalidate();
            }
        });
        valueAnimator.cancel();
        valueAnimator.start();
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void setProgress(int i, boolean z, boolean z2) {
        if (this.mProgress != Math.max(0, Math.min(i, this.mMax))) {
            if (z) {
                checkThumbPosChange(i);
                calculateThumbPositionByIndex();
                animForClick(i);
                return;
            }
            checkThumbPosChange(i);
            if (getWidth() != 0) {
                calculateThumbPositionByIndex();
                float f = this.mThumbX;
                this.mOverstep = f;
                this.mMoveAnimationEndThumbX = f;
                invalidate();
            }
        }
    }

    @Override // com.heytap.nearx.uikit.widget.seekbar.NearSeekBar
    public void startDrag() {
        super.startDrag();
        this.isStartDragging = true;
    }

    public NearSectionSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxSectionSeekBarStyle);
    }

    public NearSectionSeekBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, R$attr.nxSectionSeekBarStyle, vhc.a(context) ? R$style.NearSectionSeekBar_Dark : R$style.NearSectionSeekBar);
    }

    public NearSectionSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mPorterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        this.mOnStopTrackingMask = false;
        this.mThumbX = -1.0f;
        this.mIsFastMoving = false;
        this.mTouchDownPos = -1;
        this.mTouchDownThumbX = 0.0f;
        this.mMarkRadius = 0.0f;
        this.mCurMarkRadius = 0.0f;
        this.isStartDragging = false;
        this.isRunning = false;
        context.obtainStyledAttributes(attributeSet, R$styleable.NearSectionSeekBar, i, i2);
        float dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.nx_section_seekbar_tick_mark_radius);
        this.mMarkRadius = dimensionPixelSize;
        this.mCurMarkRadius = dimensionPixelSize;
        this.mCurActiveMarkColor = 0;
        this.mCurInactiveMarkColor = 0;
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("activeAlpha", 0, Color.alpha(getContext().getResources().getColor(R$color.nx_seekbar_mark_active_anim_end)));
        PropertyValuesHolder propertyValuesHolderOfInt2 = PropertyValuesHolder.ofInt("inactiveAlpha", 0, Color.alpha(getContext().getResources().getColor(R$color.nx_seekbar_mark_inactive_anim_end)));
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(propertyValuesHolderOfInt, propertyValuesHolderOfInt2);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSectionSeekBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int iIntValue = ((Integer) valueAnimator2.getAnimatedValue("activeAlpha")).intValue();
                int iIntValue2 = ((Integer) valueAnimator2.getAnimatedValue("inactiveAlpha")).intValue();
                NearSectionSeekBar.this.mCurActiveMarkColor = Color.argb(iIntValue, 0, 0, 0);
                NearSectionSeekBar.this.mCurInactiveMarkColor = Color.argb(iIntValue2, 255, 255, 255);
                NearSectionSeekBar.this.invalidate();
            }
        });
        this.mTouchAnimator.play(valueAnimator);
    }
}

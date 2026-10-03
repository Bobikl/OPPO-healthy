package com.heytap.nearx.uikit.widget.seekbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.d01;
import com.oplus.aiunit.vision.ft7;
import com.oplus.aiunit.vision.kki;
import com.oplus.aiunit.vision.mki;
import com.oplus.aiunit.vision.pki;
import com.oplus.aiunit.vision.pt7;
import com.oplus.aiunit.vision.s50;
import com.oplus.aiunit.vision.ski;
import com.oplus.aiunit.vision.u50;
import com.oplus.aiunit.vision.vhc;
import com.oplus.aiunit.vision.vie;
import com.oplus.aiunit.vision.xvk;
import com.oplus.os.LinearmotorVibrator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes18.dex */
public class NearSeekBar extends View implements s50, u50 {
    private static final float BACKGROUND_RADIUS_SCALE = 5.0f;
    private static final int DAMPING_DISTANCE = 20;
    protected static final int DEFAULT_SECONDARYPROGRESS_COLOR = Color.argb(76, 255, 255, 255);
    protected static final int DIRECTION_180 = 180;
    private static final int DIRECTION_360 = 360;
    protected static final int DIRECTION_90 = 90;
    private static final int DURATION_150 = 150;
    private static final int DURATION_483 = 483;
    private static final int FAST_MOVE_VELOCITY = 95;
    private static final float MAX_FAST_MOVE_PERCENT = 0.95f;
    private static final int MAX_VELOCITY = 8000;
    private static final float MIN_FAST_MOVE_PERCENT = 0.05f;
    public static final int MOVE_BY_DEFAULT = 0;
    public static final int MOVE_BY_FINGER = 1;
    private static final int ONE_SECOND_UNITS = 1000;
    private static final float PROGRESS_RADIUS_SCALE = 3.0f;
    protected static final int RELEASE_ANIM_DURATION = 183;
    protected static final float SCALE_MAX = 1.0f;
    protected static final float SCALE_MIN = 0.0f;
    private static final int TOUCH_ANIMATION_ENLARGE_DURATION = 183;
    private static final int VELOCITY_COMPUTE_TIME = 100;
    protected int mBackgroundColor;
    ColorStateList mBackgroundColorStateList;
    protected float mBackgroundRadius;
    private RectF mBackgroundRect;
    protected AnimatorSet mClickAnimatorSet;
    private float mCurBackgroundRadius;
    protected int mCurProgressPaddingHorizontal;
    protected float mCurProgressRadius;
    protected float mCurThumbOutRadius;
    protected float mDrawX;
    protected boolean mEnableAdaptiveVibrator;
    private PatternExploreByTouchHelper mExploreByTouchHelper;
    private float mFastMoveScaleOffsetX;
    protected kki mFastMoveSpring;
    private mki mFastMoveSpringConfig;
    private ft7 mFlingBehavior;
    private float mFlingDampingRatio;
    private float mFlingFrequency;
    private float mFlingLinearDamping;
    private pt7 mFlingValueHolder;
    private float mFlingVelocity;
    protected boolean mHasMotorVibrator;
    protected float mHorizontalPaddingScale;
    private int mIncrement;
    private Interpolator mInterpolator;
    protected boolean mIsDragging;
    protected boolean mIsPhysicsEnable;
    protected boolean mIsStartFromMiddle;
    protected float mLastX;
    protected Object mLinearMotorVibrator;
    protected int mMax;
    private float mMaxDamping;
    private int mMaxWidth;
    private int mMoveType;
    protected OnSeekBarChangeListener mOnSeekBarChangeListener;
    protected Paint mPaint;
    private vie mPhysicalAnimator;
    protected int mProgress;
    protected int mProgressColor;
    ColorStateList mProgressColorStateList;
    private String mProgressContentDescription;
    protected int mProgressPaddingHorizontal;
    private float mProgressRadius;
    protected RectF mProgressRect;
    protected Interpolator mProgressScaleInterpolator;
    protected float mProgressScaleRadius;
    private int mRefreshStyle;
    protected float mScale;
    protected int mSecondaryProgress;
    ColorStateList mSecondaryProgressColor;
    protected RectF mSecondaryProgressRect;
    private int mSeekbarMinHeight;
    private int mShadowColor;
    private int mShadowRadiusSize;
    protected boolean mShowProgress;
    protected boolean mStartDragging;
    protected RectF mTempRect;
    private TextDrawable mTextDrawable;
    protected Interpolator mThumbAnimateInterpolator;
    protected int mThumbColor;
    ColorStateList mThumbColorStateList;
    protected AnimatorSet mTouchAnimator;
    protected float mTouchDownX;
    protected int mTouchSlop;
    protected boolean mVariableSeekbar;
    private VelocityTracker mVelocityTracker;
    protected boolean mVibrate;
    private ExecutorService mVibratorExecutor;

    public interface OnSeekBarChangeListener {
        void onProgressChanged(NearSeekBar nearSeekBar, int i, boolean z);

        void onStartTrackingTouch(NearSeekBar nearSeekBar);

        void onStopTrackingTouch(NearSeekBar nearSeekBar);
    }

    public final class PatternExploreByTouchHelper extends ExploreByTouchHelper {
        private Rect mTempRect;

        public PatternExploreByTouchHelper(View view) {
            super(view);
            this.mTempRect = new Rect();
        }

        private Rect getBoundsForVirtualView(int i) {
            Rect rect = this.mTempRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = NearSeekBar.this.getWidth();
            rect.bottom = NearSeekBar.this.getHeight();
            return rect;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f, float f2) {
            return (f < 0.0f || f > ((float) NearSeekBar.this.getWidth()) || f2 < 0.0f || f2 > ((float) NearSeekBar.this.getHeight())) ? -1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            list.add(0);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, 0.0f, NearSeekBar.this.getMax(), NearSeekBar.this.mProgress));
            if (NearSeekBar.this.isEnabled()) {
                int progress = NearSeekBar.this.getProgress();
                if (progress > 0) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (progress < NearSeekBar.this.getMax()) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            sendEventForVirtualView(i, 4);
            return false;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.getText().add(PatternExploreByTouchHelper.class.getSimpleName());
            accessibilityEvent.setItemCount(NearSeekBar.this.mMax);
            accessibilityEvent.setCurrentItemIndex(NearSeekBar.this.mProgress);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.setContentDescription("");
            accessibilityNodeInfoCompat.setClassName(NearSeekBar.class.getName());
            accessibilityNodeInfoCompat.setBoundsInParent(getBoundsForVirtualView(i));
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (!NearSeekBar.this.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                NearSeekBar nearSeekBar = NearSeekBar.this;
                nearSeekBar.setProgress(nearSeekBar.getProgress() + NearSeekBar.this.mIncrement, false, true);
                NearSeekBar nearSeekBar2 = NearSeekBar.this;
                nearSeekBar2.announceForAccessibility(nearSeekBar2.mProgressContentDescription);
                return true;
            }
            if (i != 8192) {
                return false;
            }
            NearSeekBar nearSeekBar3 = NearSeekBar.this;
            nearSeekBar3.setProgress(nearSeekBar3.getProgress() - NearSeekBar.this.mIncrement, false, true);
            NearSeekBar nearSeekBar4 = NearSeekBar.this;
            nearSeekBar4.announceForAccessibility(nearSeekBar4.mProgressContentDescription);
            return true;
        }
    }

    public NearSeekBar(Context context) {
        this(context, null);
    }

    private void attemptClaimDrag() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        }
    }

    private void ensureThumb() {
        float f = this.mProgressRadius;
        this.mCurProgressRadius = f;
        this.mCurThumbOutRadius = f * 3.0f;
        this.mCurBackgroundRadius = this.mBackgroundRadius;
        this.mCurProgressPaddingHorizontal = this.mProgressPaddingHorizontal;
    }

    private void flingBehaviorAfterEndDrag(float f) {
        float seekBarWidth = getSeekBarWidth() / this.mMax;
        if (isLayoutRtl()) {
            this.mFlingValueHolder.c((this.mMax - this.mProgress) * seekBarWidth);
        } else {
            this.mFlingValueHolder.c(this.mProgress * seekBarWidth);
        }
        this.mFlingBehavior.l0(f);
    }

    private int getColor(View view, ColorStateList colorStateList, int i) {
        return colorStateList == null ? i : colorStateList.getColorForState(view.getDrawableState(), i);
    }

    private void initAnimation() {
        this.mFastMoveSpring.p(this.mFastMoveSpringConfig);
        this.mFastMoveSpring.a(new pki() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSeekBar.1
            @Override // com.oplus.aiunit.vision.pki
            public void onSpringActivate(kki kkiVar) {
            }

            @Override // com.oplus.aiunit.vision.pki
            public void onSpringAtRest(kki kkiVar) {
            }

            @Override // com.oplus.aiunit.vision.pki
            public void onSpringEndStateChange(kki kkiVar) {
            }

            @Override // com.oplus.aiunit.vision.pki
            public void onSpringUpdate(kki kkiVar) {
                if (NearSeekBar.this.mFastMoveScaleOffsetX != kkiVar.e()) {
                    if (NearSeekBar.this.isEnabled()) {
                        NearSeekBar.this.mFastMoveScaleOffsetX = (float) kkiVar.c();
                    } else {
                        NearSeekBar.this.mFastMoveScaleOffsetX = 0.0f;
                    }
                    NearSeekBar.this.invalidate();
                }
            }
        });
        this.mTouchAnimator.setInterpolator(this.mProgressScaleInterpolator);
        float f = this.mBackgroundRadius;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f * 5.0f);
        valueAnimatorOfFloat.setDuration(183L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSeekBar.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearSeekBar.this.onEnlargeAnimationUpdate(valueAnimator);
                NearSeekBar.this.invalidate();
            }
        });
        this.mTouchAnimator.play(valueAnimatorOfFloat);
    }

    private void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initPhysicsEngine() {
        if (this.mIsPhysicsEnable) {
            ft7 ft7Var = (ft7) ((ft7) new ft7(0.0f, getSeekBarWidth()).J(this.mFlingValueHolder)).A(this.mFlingFrequency, this.mFlingDampingRatio).b(this);
            this.mFlingBehavior = ft7Var;
            ft7Var.j0(this.mFlingLinearDamping);
            this.mPhysicalAnimator.c(this.mFlingBehavior);
            this.mPhysicalAnimator.a(this.mFlingBehavior, this);
            this.mPhysicalAnimator.b(this.mFlingBehavior, this);
        }
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void initView() {
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        PatternExploreByTouchHelper patternExploreByTouchHelper = new PatternExploreByTouchHelper(this);
        this.mExploreByTouchHelper = patternExploreByTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, patternExploreByTouchHelper);
        ViewCompat.setImportantForAccessibility(this, 1);
        this.mExploreByTouchHelper.invalidateRoot();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setDither(true);
    }

    private void invalidateProgress(MotionEvent motionEvent) {
        int i = this.mProgress;
        float seekBarWidth = getSeekBarWidth();
        if (isLayoutRtl()) {
            int i2 = this.mMax;
            this.mProgress = i2 - Math.round((i2 * ((motionEvent.getX() - getStart()) - this.mProgressScaleRadius)) / seekBarWidth);
        } else {
            this.mProgress = Math.round((this.mMax * ((motionEvent.getX() - getStart()) - this.mProgressScaleRadius)) / seekBarWidth);
        }
        int progressLimit = getProgressLimit(this.mProgress);
        this.mProgress = progressLimit;
        if (i != progressLimit) {
            OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(this, progressLimit, true);
            }
            performFeedback();
        }
        invalidate();
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setValueForLabel(TextDrawable textDrawable, String str) {
        textDrawable.setText(str);
        int intrinsicWidth = ((int) this.mDrawX) - (textDrawable.getIntrinsicWidth() / 2);
        textDrawable.setBounds(intrinsicWidth, 0 - textDrawable.getIntrinsicHeight(), textDrawable.getIntrinsicWidth() + intrinsicWidth, 0);
        Rect rect = new Rect(textDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        textDrawable.setBounds(rect);
        ViewUtils.getContentViewOverlay(this).add(textDrawable);
    }

    private void startFastMoveAnimation(float f) {
        if (this.mFastMoveSpring.c() == this.mFastMoveSpring.e()) {
            if (f >= 95.0f) {
                int i = this.mProgress;
                float f2 = i;
                int i2 = this.mMax;
                if (f2 > i2 * 0.95f || i < i2 * MIN_FAST_MOVE_PERCENT) {
                    return;
                }
                this.mFastMoveSpring.o(1.0d);
                return;
            }
            if (f > -95.0f) {
                this.mFastMoveSpring.o(0.0d);
                return;
            }
            int i3 = this.mProgress;
            float f3 = i3;
            int i4 = this.mMax;
            if (f3 > i4 * 0.95f || i3 < i4 * MIN_FAST_MOVE_PERCENT) {
                return;
            }
            this.mFastMoveSpring.o(-1.0d);
        }
    }

    public void animForClick(float f) {
        int iRound;
        float seekBarWidth = getSeekBarWidth();
        if (isLayoutRtl()) {
            int i = this.mMax;
            iRound = i - Math.round((i * ((f - getStart()) - this.mProgressScaleRadius)) / seekBarWidth);
        } else {
            iRound = Math.round((this.mMax * ((f - getStart()) - this.mProgressScaleRadius)) / seekBarWidth);
        }
        animForClick(getProgressLimit(iRound));
    }

    public float calculateDamping(float f) {
        float seekBarWidth = getSeekBarWidth();
        float f2 = seekBarWidth / 2.0f;
        float interpolation = 1.0f - this.mInterpolator.getInterpolation(Math.abs(f - f2) / f2);
        return (f > seekBarWidth - ((float) getPaddingRight()) || f < ((float) getPaddingLeft()) || interpolation < this.mMaxDamping) ? this.mMaxDamping : interpolation;
    }

    public void checkThumbPosChange(int i) {
        if (this.mProgress != i) {
            this.mProgress = i;
            OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(this, i, true);
            }
            performFeedback();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:29:0x011f  */
    /* JADX WARN: Code duplicated, block: B:30:0x013c  */
    /* JADX WARN: Code duplicated, block: B:32:0x015f  */
    /* JADX WARN: Code duplicated, block: B:33:0x017c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0182  */
    /* JADX WARN: Code duplicated, block: B:36:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public void drawActiveTrack(Canvas canvas, float f) {
        float start;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (this.mShowProgress) {
            float start2 = (getStart() + this.mProgressPaddingHorizontal) - this.mBackgroundRadius;
            int seekBarCenterY = getSeekBarCenterY();
            float width = ((getWidth() - getEnd()) - this.mCurProgressPaddingHorizontal) + this.mBackgroundRadius;
            if (!this.mIsStartFromMiddle) {
                if (isLayoutRtl()) {
                    float start3 = getStart() + this.mCurProgressPaddingHorizontal + f;
                    float f7 = start3 - (this.mScale * f);
                    float f8 = start3 - ((this.mSecondaryProgress * f) / this.mMax);
                    f3 = start3;
                    f4 = f7;
                    start = f8;
                    f2 = f3;
                } else {
                    start = getStart() + this.mCurProgressPaddingHorizontal;
                    float f9 = (this.mScale * f) + start;
                    f2 = ((this.mSecondaryProgress * f) / this.mMax) + start;
                    f3 = f9;
                }
                this.mPaint.setColor(getColor(this, this.mSecondaryProgressColor, DEFAULT_SECONDARYPROGRESS_COLOR));
                float f10 = this.mCurProgressRadius;
                f5 = seekBarCenterY;
                this.mSecondaryProgressRect.set(start - f10, f5 - f10, f2 + f10, f10 + f5);
                RectF rectF = this.mSecondaryProgressRect;
                float f11 = this.mCurProgressRadius;
                canvas.drawRoundRect(rectF, f11, f11, this.mPaint);
                RectF rectF2 = this.mProgressRect;
                float f12 = this.mCurProgressRadius;
                rectF2.set(f4, f5 - f12, f3, f12 + f5);
                this.mPaint.setColor(this.mProgressColor);
                if (this.mIsStartFromMiddle || f4 <= f3) {
                    RectF rectF3 = this.mProgressRect;
                    float f13 = this.mCurProgressRadius;
                    rectF3.set(f4, f5 - f13, f3, f13 + f5);
                } else {
                    RectF rectF4 = this.mProgressRect;
                    float f14 = this.mCurProgressRadius;
                    rectF4.set(f3, f5 - f14, f4, f14 + f5);
                }
                canvas.drawRect(this.mProgressRect, this.mPaint);
                if (!this.mIsStartFromMiddle) {
                    if (isLayoutRtl()) {
                        RectF rectF5 = this.mTempRect;
                        float f15 = this.mCurProgressRadius;
                        RectF rectF6 = this.mProgressRect;
                        rectF5.set(f4 - f15, rectF6.top, f4 + f15, rectF6.bottom);
                        canvas.drawArc(this.mTempRect, -90.0f, 360.0f, true, this.mPaint);
                        return;
                    }
                    RectF rectF7 = this.mTempRect;
                    float f16 = this.mCurProgressRadius;
                    RectF rectF8 = this.mProgressRect;
                    rectF7.set(f3 - f16, rectF8.top, f3 + f16, rectF8.bottom);
                    canvas.drawArc(this.mTempRect, 90.0f, 360.0f, true, this.mPaint);
                    return;
                }
                if (isLayoutRtl()) {
                    RectF rectF9 = this.mTempRect;
                    float f17 = this.mBackgroundRadius;
                    float f18 = this.mCurProgressRadius;
                    RectF rectF10 = this.mProgressRect;
                    rectF9.set((width - f17) - f18, rectF10.top, (width - f17) + f18, rectF10.bottom);
                    canvas.drawArc(this.mTempRect, -90.0f, 180.0f, true, this.mPaint);
                    if (this.mSecondaryProgress == this.mMax) {
                        RectF rectF11 = this.mTempRect;
                        float f19 = this.mCurProgressRadius;
                        rectF11.set(start2, f5 - f19, (this.mBackgroundRadius * 2.0f) + start2, f5 + f19);
                        canvas.drawArc(this.mTempRect, 90.0f, 180.0f, true, this.mPaint);
                        return;
                    }
                    return;
                }
                RectF rectF12 = this.mTempRect;
                float f20 = this.mCurProgressRadius;
                RectF rectF13 = this.mProgressRect;
                rectF12.set(f4 - f20, rectF13.top, f4 + f20, rectF13.bottom);
                canvas.drawArc(this.mTempRect, 90.0f, 180.0f, true, this.mPaint);
                if (this.mSecondaryProgress == this.mMax) {
                    RectF rectF14 = this.mTempRect;
                    float f21 = width - (this.mBackgroundRadius * 2.0f);
                    float f22 = this.mCurProgressRadius;
                    rectF14.set(f21, f5 + f22, width, f5 + f22);
                    canvas.drawArc(this.mTempRect, -90.0f, 180.0f, true, this.mPaint);
                }
            }
            if (isLayoutRtl()) {
                start = getWidth() / 2.0f;
                f6 = start - ((this.mScale - 0.5f) * f);
            } else {
                float width2 = getWidth() / 2.0f;
                f6 = width2;
                start = width2 + ((this.mScale - 0.5f) * f);
            }
            f2 = f6;
            f3 = f2;
            f4 = start;
            this.mPaint.setColor(getColor(this, this.mSecondaryProgressColor, DEFAULT_SECONDARYPROGRESS_COLOR));
            float f110 = this.mCurProgressRadius;
            f5 = seekBarCenterY;
            this.mSecondaryProgressRect.set(start - f110, f5 - f110, f2 + f110, f110 + f5);
            RectF rectF15 = this.mSecondaryProgressRect;
            float f111 = this.mCurProgressRadius;
            canvas.drawRoundRect(rectF15, f111, f111, this.mPaint);
            RectF rectF16 = this.mProgressRect;
            float f112 = this.mCurProgressRadius;
            rectF16.set(f4, f5 - f112, f3, f112 + f5);
            this.mPaint.setColor(this.mProgressColor);
            if (this.mIsStartFromMiddle) {
                RectF rectF17 = this.mProgressRect;
                float f113 = this.mCurProgressRadius;
                rectF17.set(f4, f5 - f113, f3, f113 + f5);
            } else {
                RectF rectF18 = this.mProgressRect;
                float f114 = this.mCurProgressRadius;
                rectF18.set(f4, f5 - f114, f3, f114 + f5);
            }
            canvas.drawRect(this.mProgressRect, this.mPaint);
            if (!this.mIsStartFromMiddle) {
                if (isLayoutRtl()) {
                    RectF rectF19 = this.mTempRect;
                    float f115 = this.mCurProgressRadius;
                    RectF rectF20 = this.mProgressRect;
                    rectF19.set(f4 - f115, rectF20.top, f4 + f115, rectF20.bottom);
                    canvas.drawArc(this.mTempRect, -90.0f, 360.0f, true, this.mPaint);
                    return;
                }
                RectF rectF21 = this.mTempRect;
                float f116 = this.mCurProgressRadius;
                RectF rectF22 = this.mProgressRect;
                rectF21.set(f3 - f116, rectF22.top, f3 + f116, rectF22.bottom);
                canvas.drawArc(this.mTempRect, 90.0f, 360.0f, true, this.mPaint);
                return;
            }
            if (isLayoutRtl()) {
                RectF rectF23 = this.mTempRect;
                float f117 = this.mBackgroundRadius;
                float f118 = this.mCurProgressRadius;
                RectF rectF110 = this.mProgressRect;
                rectF23.set((width - f117) - f118, rectF110.top, (width - f117) + f118, rectF110.bottom);
                canvas.drawArc(this.mTempRect, -90.0f, 180.0f, true, this.mPaint);
                if (this.mSecondaryProgress == this.mMax) {
                    RectF rectF111 = this.mTempRect;
                    float f119 = this.mCurProgressRadius;
                    rectF111.set(start2, f5 - f119, (this.mBackgroundRadius * 2.0f) + start2, f5 + f119);
                    canvas.drawArc(this.mTempRect, 90.0f, 180.0f, true, this.mPaint);
                    return;
                }
                return;
            }
            RectF rectF112 = this.mTempRect;
            float f23 = this.mCurProgressRadius;
            RectF rectF113 = this.mProgressRect;
            rectF112.set(f4 - f23, rectF113.top, f4 + f23, rectF113.bottom);
            canvas.drawArc(this.mTempRect, 90.0f, 180.0f, true, this.mPaint);
            if (this.mSecondaryProgress == this.mMax) {
                RectF rectF114 = this.mTempRect;
                float f24 = width - (this.mBackgroundRadius * 2.0f);
                float f25 = this.mCurProgressRadius;
                rectF114.set(f24, f5 + f25, width, f5 + f25);
                canvas.drawArc(this.mTempRect, -90.0f, 180.0f, true, this.mPaint);
            }
        }
    }

    public void drawInactiveTrack(Canvas canvas) {
        float start = (getStart() + this.mCurProgressPaddingHorizontal) - this.mCurBackgroundRadius;
        float width = ((getWidth() - getEnd()) - this.mCurProgressPaddingHorizontal) + this.mCurBackgroundRadius;
        int seekBarCenterY = getSeekBarCenterY();
        if (this.mShadowRadiusSize > 0) {
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setStrokeWidth(0.0f);
            this.mPaint.setColor(0);
            this.mPaint.setShadowLayer(this.mShadowRadiusSize, 0.0f, 0.0f, this.mShadowColor);
            RectF rectF = this.mBackgroundRect;
            int i = this.mShadowRadiusSize;
            float f = seekBarCenterY;
            float f2 = this.mCurBackgroundRadius;
            rectF.set(start - (i / 2), (f - f2) - (i / 2), (i / 2) + width, f + f2 + (i / 2));
            RectF rectF2 = this.mBackgroundRect;
            float f3 = this.mCurBackgroundRadius;
            canvas.drawRoundRect(rectF2, f3, f3, this.mPaint);
            this.mPaint.clearShadowLayer();
            this.mPaint.setStyle(Paint.Style.FILL);
        }
        this.mPaint.setColor(this.mBackgroundColor);
        RectF rectF3 = this.mBackgroundRect;
        float f4 = seekBarCenterY;
        float f5 = this.mCurBackgroundRadius;
        rectF3.set(start, f4 - f5, width, f4 + f5);
        RectF rectF4 = this.mBackgroundRect;
        float f6 = this.mCurBackgroundRadius;
        canvas.drawRoundRect(rectF4, f6, f6, this.mPaint);
    }

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
        this.mPaint.setColor(this.mThumbColor);
        float f4 = seekBarCenterY;
        float f5 = this.mCurThumbOutRadius;
        canvas.drawRoundRect(f2, f4 - f5, f3, f4 + f5, f5, f5, this.mPaint);
        this.mDrawX = f2 + ((f3 - f2) / 2.0f);
    }

    public void ensureLabelsAdded(String str) {
        setValueForLabel(this.mTextDrawable, str);
    }

    public void ensureLabelsRemoved() {
        ViewUtils.getContentViewOverlay(this).remove(this.mTextDrawable);
    }

    public ColorStateList getBackgroundColorStateList() {
        return this.mBackgroundColorStateList;
    }

    public int getEnd() {
        return getPaddingRight();
    }

    public int getLabelHeight() {
        return this.mTextDrawable.getIntrinsicHeight();
    }

    public int getMax() {
        return this.mMax;
    }

    public int getProgress() {
        return this.mProgress;
    }

    public ColorStateList getProgressColorStateList() {
        return this.mProgressColorStateList;
    }

    public int getProgressLimit(int i) {
        return Math.max(0, Math.min(i, this.mMax));
    }

    public int getSecondaryProgress() {
        return this.mSecondaryProgress;
    }

    public ColorStateList getSecondaryProgressColor() {
        return this.mSecondaryProgressColor;
    }

    public int getSeekBarCenterY() {
        return getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) >> 1);
    }

    public int getSeekBarWidth() {
        return ((getWidth() - getStart()) - getEnd()) - (this.mCurProgressPaddingHorizontal << 1);
    }

    public int getStart() {
        return getPaddingLeft();
    }

    public void handleMotionEventDown(MotionEvent motionEvent) {
        this.mTouchDownX = motionEvent.getX();
        this.mLastX = motionEvent.getX();
    }

    public void handleMotionEventMove(MotionEvent motionEvent) {
        float seekBarWidth = getSeekBarWidth();
        float f = (this.mProgress * seekBarWidth) / this.mMax;
        if (this.mIsStartFromMiddle && f == seekBarWidth / 2.0f && Math.abs(motionEvent.getX() - this.mLastX) < 20.0f) {
            return;
        }
        if (this.mIsDragging && this.mStartDragging) {
            int i = this.mMoveType;
            if (i == 0) {
                trackTouchEvent(motionEvent);
                return;
            } else {
                if (i != 1) {
                    return;
                }
                trackTouchEventByFinger(motionEvent);
                return;
            }
        }
        if (touchInSeekBar(motionEvent, this)) {
            float x = motionEvent.getX();
            if (Math.abs(x - this.mTouchDownX) > this.mTouchSlop) {
                startDrag();
                touchAnim();
                this.mLastX = x;
                invalidateProgress(motionEvent);
            }
        }
    }

    public void handleMotionEventUp(MotionEvent motionEvent) {
        this.mFastMoveSpring.o(0.0d);
        if (!this.mIsDragging) {
            if (touchInSeekBar(motionEvent, this)) {
                animForClick(motionEvent.getX());
            }
        } else {
            if (this.mIsPhysicsEnable) {
                flingBehaviorAfterEndDrag(this.mFlingVelocity);
            } else {
                onStopTrackingTouch();
            }
            setPressed(false);
            releaseAnim();
        }
    }

    public boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    public boolean isVariableSeekbar() {
        return this.mVariableSeekbar;
    }

    public boolean isVibrate() {
        return this.mVibrate;
    }

    public void onAnimationCancel(d01 d01Var) {
        onStopTrackingTouch();
    }

    @Override // com.oplus.aiunit.vision.s50
    public void onAnimationEnd(d01 d01Var) {
        onStopTrackingTouch();
    }

    public /* bridge */ /* synthetic */ void onAnimationStart(d01 d01Var) {
        super.onAnimationStart(d01Var);
    }

    @Override // com.oplus.aiunit.vision.u50
    public void onAnimationUpdate(d01 d01Var) {
        float f;
        float fFloatValue = ((Float) d01Var.n()).floatValue();
        int seekBarWidth = getSeekBarWidth();
        if (isLayoutRtl()) {
            float f2 = seekBarWidth;
            f = (f2 - fFloatValue) / f2;
        } else {
            f = fFloatValue / seekBarWidth;
        }
        float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        this.mScale = fMax;
        float f3 = this.mProgress;
        this.mProgress = getProgressLimit(Math.round(this.mMax * fMax));
        invalidate();
        if (f3 != this.mProgress) {
            this.mLastX = fFloatValue + getStart();
            OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(this, this.mProgress, true);
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopPhysicsMove();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float seekBarWidth = getSeekBarWidth();
        drawInactiveTrack(canvas);
        drawActiveTrack(canvas, seekBarWidth);
        drawThumbs(canvas);
    }

    public void onEnlargeAnimationUpdate(ValueAnimator valueAnimator) {
        this.mCurBackgroundRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = this.mProgressRadius;
        this.mCurProgressRadius = f + (((3.0f * f) - f) * animatedFraction);
        int i = this.mProgressPaddingHorizontal;
        this.mCurProgressPaddingHorizontal = (int) (i + (animatedFraction * ((i * this.mHorizontalPaddingScale) - i)));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int paddingTop = this.mSeekbarMinHeight + getPaddingTop() + getPaddingBottom();
        if (1073741824 != mode || size < paddingTop) {
            size = paddingTop;
        }
        int i3 = this.mMaxWidth;
        if (i3 > 0 && size2 > i3) {
            size2 = i3;
        }
        setMeasuredDimension(size2, size);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.mVariableSeekbar) {
            this.mStartDragging = false;
        }
        stopPhysicsMove();
        initPhysicsEngine();
    }

    public void onStartTrackingTouch() {
        this.mIsDragging = true;
        this.mStartDragging = true;
        OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(this);
        }
    }

    public void onStopTrackingTouch() {
        onStopTrackingTouch(true);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.mIsPhysicsEnable) {
                this.mFlingBehavior.n0();
            }
            initOrResetVelocityTracker();
            this.mVelocityTracker.addMovement(motionEvent);
            this.mIsDragging = false;
            this.mStartDragging = false;
            handleMotionEventDown(motionEvent);
        } else if (action == 1) {
            this.mVelocityTracker.computeCurrentVelocity(1000, 8000.0f);
            this.mFlingVelocity = this.mVelocityTracker.getXVelocity();
            recycleVelocityTracker();
            handleMotionEventUp(motionEvent);
        } else if (action == 2) {
            initVelocityTrackerIfNotExists();
            this.mVelocityTracker.addMovement(motionEvent);
            handleMotionEventMove(motionEvent);
        } else if (action == 3) {
            this.mVelocityTracker.computeCurrentVelocity(1000, 8000.0f);
            this.mFlingVelocity = this.mVelocityTracker.getXVelocity();
            recycleVelocityTracker();
            handleMotionEventUp(motionEvent);
        }
        return true;
    }

    public boolean performAdaptiveFeedback() {
        if (this.mLinearMotorVibrator == null) {
            LinearmotorVibrator linearmotorVibratorA = xvk.a(getContext());
            this.mLinearMotorVibrator = linearmotorVibratorA;
            this.mHasMotorVibrator = linearmotorVibratorA != null;
        }
        if (this.mLinearMotorVibrator == null) {
            return false;
        }
        if (this.mProgress == getMax() || this.mProgress == 0) {
            xvk.d((LinearmotorVibrator) this.mLinearMotorVibrator, 154, this.mProgress, this.mMax, 800, 1200);
        } else {
            if (this.mVibratorExecutor == null) {
                this.mVibratorExecutor = Executors.newSingleThreadExecutor();
            }
            this.mVibratorExecutor.execute(new Runnable() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSeekBar.7
                @Override // java.lang.Runnable
                public void run() {
                    NearSeekBar nearSeekBar = NearSeekBar.this;
                    if (nearSeekBar.mIsDragging) {
                        xvk.d((LinearmotorVibrator) nearSeekBar.mLinearMotorVibrator, 152, nearSeekBar.mProgress, nearSeekBar.mMax, 200, 2400);
                    }
                }
            });
        }
        return true;
    }

    public void performFeedback() {
        if (!(this.mHasMotorVibrator && this.mEnableAdaptiveVibrator && performAdaptiveFeedback()) && this.mVibrate) {
            if (this.mProgress == getMax() || this.mProgress == 0) {
                performHapticFeedback(306, 0);
                return;
            }
            if (this.mVibratorExecutor == null) {
                this.mVibratorExecutor = Executors.newSingleThreadExecutor();
            }
            this.mVibratorExecutor.execute(new Runnable() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSeekBar.6
                @Override // java.lang.Runnable
                public void run() {
                    NearSeekBar nearSeekBar = NearSeekBar.this;
                    if (nearSeekBar.mIsDragging) {
                        nearSeekBar.performHapticFeedback(305, 0);
                    }
                }
            });
        }
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mRefreshStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if (TextUtils.equals(resourceTypeName, "attr")) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearSeekBar, this.mRefreshStyle, 0);
        } else if (TextUtils.equals(resourceTypeName, Const.Arguments.Open.STYLE)) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearSeekBar, 0, this.mRefreshStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            this.mProgressColor = getColor(this, MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, R$styleable.NearSeekBar_nxSeekBarProgressColor), getResources().getColor(R$color.nx_seekbar_progress_color_normal));
            this.mBackgroundColor = getColor(this, MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, R$styleable.NearSeekBar_nxSeekBarBackgroundColor), getResources().getColor(R$color.nx_seekbar_background_color_normal));
            invalidate();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void releaseAnim() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(PropertyValuesHolder.ofFloat("progress", this.mCurProgressRadius, this.mProgressRadius), PropertyValuesHolder.ofFloat("backgroundRadius", this.mCurBackgroundRadius, this.mBackgroundRadius), PropertyValuesHolder.ofInt("animatePadding", this.mCurProgressPaddingHorizontal, this.mProgressPaddingHorizontal));
        valueAnimator.setDuration(183L);
        valueAnimator.setInterpolator(this.mProgressScaleInterpolator);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSeekBar.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NearSeekBar.this.mCurProgressRadius = ((Float) valueAnimator2.getAnimatedValue("progress")).floatValue();
                NearSeekBar.this.mCurBackgroundRadius = ((Float) valueAnimator2.getAnimatedValue("backgroundRadius")).floatValue();
                NearSeekBar.this.mCurProgressPaddingHorizontal = ((Integer) valueAnimator2.getAnimatedValue("animatePadding")).intValue();
                NearSeekBar.this.invalidate();
            }
        });
        this.mTouchAnimator.cancel();
        valueAnimator.cancel();
        valueAnimator.start();
    }

    public void setBackgroundColorStateList(ColorStateList colorStateList) {
        if (this.mBackgroundColorStateList != colorStateList) {
            this.mBackgroundColorStateList = colorStateList;
            this.mBackgroundColor = getColor(this, colorStateList, getResources().getColor(R$color.nx_seekbar_background_color_normal));
            invalidate();
        }
    }

    public void setEnableAdaptiveVibrator(boolean z) {
        this.mEnableAdaptiveVibrator = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ColorStateList colorStateList = this.mProgressColorStateList;
        Resources resources = getContext().getResources();
        int i = R$color.nx_seekbar_progress_color_normal;
        this.mProgressColor = getColor(this, colorStateList, resources.getColor(i));
        this.mBackgroundColor = getColor(this, this.mBackgroundColorStateList, getContext().getResources().getColor(R$color.nx_seekbar_background_color_normal));
        this.mThumbColor = getColor(this, this.mThumbColorStateList, getContext().getResources().getColor(i));
    }

    public void setFlingLinearDamping(float f) {
        ft7 ft7Var;
        if (this.mIsPhysicsEnable) {
            this.mFlingLinearDamping = f;
            if (this.mPhysicalAnimator == null || (ft7Var = this.mFlingBehavior) == null) {
                return;
            }
            ft7Var.j0(f);
        }
    }

    public void setFlingProperty(float f, float f2) {
        ft7 ft7Var;
        if (this.mIsPhysicsEnable) {
            this.mFlingFrequency = f;
            this.mFlingDampingRatio = f2;
            if (this.mPhysicalAnimator == null || (ft7Var = this.mFlingBehavior) == null) {
                return;
            }
            ft7Var.A(f, f2);
        }
    }

    public void setIncrement(int i) {
        this.mIncrement = Math.abs(i);
    }

    public void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.mMax) {
            this.mMax = i;
            if (this.mProgress > i) {
                this.mProgress = i;
            }
        }
        invalidate();
    }

    public void setMoveType(int i) {
        this.mMoveType = i;
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.mOnSeekBarChangeListener = onSeekBarChangeListener;
    }

    public void setProgress(int i) {
        setProgress(i, false);
    }

    public void setProgressColor(@NonNull ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.mProgressColor = getColor(this, colorStateList, getResources().getColor(R$color.nx_seekbar_progress_color_normal));
            invalidate();
        }
    }

    public void setProgressColorStateList(ColorStateList colorStateList) {
        if (this.mProgressColorStateList != colorStateList) {
            this.mProgressColorStateList = colorStateList;
            this.mProgressColor = getColor(this, colorStateList, getResources().getColor(R$color.nx_seekbar_progress_color_normal));
            invalidate();
        }
    }

    public void setProgressContentDescription(String str) {
        this.mProgressContentDescription = str;
    }

    public void setSecondaryProgress(int i) {
        if (i >= 0) {
            this.mSecondaryProgress = Math.max(0, Math.min(i, this.mMax));
            invalidate();
        }
    }

    public void setSecondaryProgressColor(ColorStateList colorStateList) {
        if (this.mSecondaryProgressColor != colorStateList) {
            this.mSecondaryProgressColor = colorStateList;
            invalidate();
        }
    }

    public void setSeekBarBackgroundColor(@NonNull ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.mBackgroundColor = getColor(this, colorStateList, getResources().getColor(R$color.nx_seekbar_background_color_normal));
            invalidate();
        }
    }

    public void setStartFromMiddle(boolean z) {
        this.mIsStartFromMiddle = z;
    }

    public void setThumbColor(@NonNull ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.mThumbColor = getColor(this, colorStateList, getContext().getResources().getColor(R$color.nx_seekbar_progress_color_normal));
            invalidate();
        }
    }

    public void setVariableSeekbar(boolean z) {
        this.mVariableSeekbar = z;
    }

    public void setVibrate(boolean z) {
        this.mVibrate = z;
    }

    public void startDrag() {
        setPressed(true);
        onStartTrackingTouch();
        attemptClaimDrag();
    }

    public void stopPhysicsMove() {
        ft7 ft7Var;
        if (!this.mIsPhysicsEnable || this.mPhysicalAnimator == null || (ft7Var = this.mFlingBehavior) == null) {
            return;
        }
        ft7Var.n0();
    }

    public float subtract(float f, float f2) {
        return new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(f2))).floatValue();
    }

    public void touchAnim() {
        if (this.mTouchAnimator.isRunning()) {
            this.mTouchAnimator.cancel();
        }
        this.mTouchAnimator.start();
    }

    public boolean touchInSeekBar(MotionEvent motionEvent, View view) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= ((float) view.getPaddingLeft()) && x <= ((float) (view.getWidth() - view.getPaddingRight())) && y >= 0.0f && y <= ((float) view.getHeight());
    }

    public void trackTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = x - this.mLastX;
        if (isLayoutRtl()) {
            f = -f;
        }
        int progressLimit = getProgressLimit(this.mProgress + Math.round(((f * calculateDamping(x)) / getSeekBarWidth()) * this.mMax));
        int i = this.mProgress;
        this.mProgress = progressLimit;
        this.mScale = progressLimit / this.mMax;
        invalidate();
        int i2 = this.mProgress;
        if (i != i2) {
            this.mLastX = x;
            OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(this, i2, true);
            }
            performFeedback();
        }
        this.mVelocityTracker.computeCurrentVelocity(100);
        startFastMoveAnimation(this.mVelocityTracker.getXVelocity());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    public void trackTouchEventByFinger(MotionEvent motionEvent) {
        int paddingLeft;
        float f;
        int iRound = Math.round(((motionEvent.getX() - this.mLastX) * calculateDamping(motionEvent.getX())) + this.mLastX);
        int width = getWidth();
        int iRound2 = Math.round(getSeekBarWidth() - (this.mProgressScaleRadius * 2.0f));
        if (isLayoutRtl()) {
            if (iRound > width - getPaddingRight()) {
                f = 0.0f;
            } else if (iRound < getPaddingLeft()) {
                f = 1.0f;
            } else {
                paddingLeft = (iRound2 - iRound) + getPaddingLeft();
                f = paddingLeft / iRound2;
            }
        } else if (iRound < getPaddingLeft()) {
            f = 0.0f;
        } else if (iRound > width - getPaddingRight()) {
            f = 1.0f;
        } else {
            paddingLeft = iRound - getPaddingLeft();
            f = paddingLeft / iRound2;
        }
        this.mScale = Math.min(f, 1.0f);
        float max = 0.0f + (f * getMax());
        int i = this.mProgress;
        this.mProgress = getProgressLimit(Math.round(max));
        invalidate();
        int i2 = this.mProgress;
        if (i != i2) {
            this.mLastX = iRound;
            OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(this, i2, true);
            }
            performFeedback();
        }
    }

    public NearSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxSeekBarStyle);
    }

    public void ensureLabelsAdded() {
        setValueForLabel(this.mTextDrawable, Integer.toString(this.mProgress));
    }

    public void onStopTrackingTouch(boolean z) {
        OnSeekBarChangeListener onSeekBarChangeListener;
        this.mIsDragging = false;
        this.mStartDragging = false;
        if (!z || (onSeekBarChangeListener = this.mOnSeekBarChangeListener) == null) {
            return;
        }
        onSeekBarChangeListener.onStopTrackingTouch(this);
    }

    public void setProgress(int i, boolean z) {
        setProgress(i, z, false);
    }

    public NearSeekBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, vhc.a(context) ? R$style.NearSeekBar_Dark : R$style.NearSeekBar);
    }

    public void setProgress(int i, boolean z, boolean z2) {
        int i2 = this.mProgress;
        int iMax = Math.max(0, Math.min(i, this.mMax));
        if (i2 != iMax) {
            if (z) {
                animForClick(iMax);
            } else {
                this.mProgress = iMax;
                this.mScale = iMax / this.mMax;
                OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onProgressChanged(this, iMax, z2);
                }
                invalidate();
            }
            performFeedback();
        }
    }

    public NearSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mEnableAdaptiveVibrator = false;
        this.mHasMotorVibrator = true;
        this.mLinearMotorVibrator = null;
        this.mTouchSlop = 0;
        this.mProgress = 0;
        this.mMax = 100;
        this.mIsDragging = false;
        this.mProgressColorStateList = null;
        this.mBackgroundColorStateList = null;
        this.mThumbColorStateList = null;
        this.mProgressRect = new RectF();
        this.mTempRect = new RectF();
        this.mTouchAnimator = new AnimatorSet();
        this.mProgressScaleInterpolator = PathInterpolatorCompat.create(0.33f, 0.0f, 0.67f, 1.0f);
        this.mThumbAnimateInterpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.mShowProgress = false;
        this.mFastMoveSpring = ski.g().c();
        this.mIncrement = 1;
        this.mStartDragging = false;
        this.mBackgroundRect = new RectF();
        this.mMoveType = 1;
        this.mFastMoveSpringConfig = mki.b(500.0d, 30.0d);
        this.mIsStartFromMiddle = false;
        this.mMaxDamping = 0.4f;
        this.mInterpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.mScale = 0.0f;
        this.mIsPhysicsEnable = false;
        this.mFlingVelocity = 0.0f;
        this.mFlingFrequency = 5.5f;
        this.mFlingDampingRatio = 1.1f;
        this.mFlingLinearDamping = 15.0f;
        this.mSecondaryProgress = 0;
        this.mSecondaryProgressColor = null;
        this.mSecondaryProgressRect = new RectF();
        this.mVibrate = false;
        this.mVariableSeekbar = false;
        if (attributeSet != null) {
            this.mRefreshStyle = attributeSet.getStyleAttribute();
        }
        if (this.mRefreshStyle == 0) {
            this.mRefreshStyle = i;
        }
        vhc.b(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearSeekBar, i, i2);
        this.mProgressScaleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearSeekBar_nxSeekBarProgressScaleRadius, getResources().getDimensionPixelSize(R$dimen.nx_seekbar_progress_scale_radius));
        this.mShowProgress = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearSeekBar_nxSeekBarShowProgress, true);
        this.mProgressColorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R$styleable.NearSeekBar_nxSeekBarProgressColor);
        this.mBackgroundColorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R$styleable.NearSeekBar_nxSeekBarBackgroundColor);
        this.mThumbColorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R$styleable.NearSeekBar_nxSeekBarThumbColor);
        ColorStateList colorStateList = this.mProgressColorStateList;
        Resources resources = getContext().getResources();
        int i3 = R$color.nx_seekbar_progress_color_normal;
        this.mProgressColor = getColor(this, colorStateList, resources.getColor(i3));
        this.mProgressRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearSeekBar_nxSeekBarProgressRadius, getResources().getDimensionPixelSize(R$dimen.nx_seekbar_progress_radius));
        this.mBackgroundColor = getColor(this, this.mBackgroundColorStateList, getResources().getColor(R$color.nx_seekbar_background_color_normal));
        this.mThumbColor = getColor(this, this.mThumbColorStateList, getContext().getResources().getColor(i3));
        this.mBackgroundRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearSeekBar_nxSeekBarBackgroundRadius, getResources().getDimensionPixelSize(R$dimen.nx_seekbar_background_radius));
        this.mSecondaryProgressColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearSeekBar_nxSeekBarSecondaryProgressColor);
        this.mProgressPaddingHorizontal = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearSeekBar_nxSeekBarProgressPaddingHorizontal, getResources().getDimensionPixelSize(R$dimen.nx_seekbar_progress_padding_horizontal));
        this.mSeekbarMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearSeekBar_nxSeekBarMinHeight, getResources().getDimensionPixelSize(R$dimen.nx_seekbar_view_min_height));
        this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearSeekBar_nxSeekBarMaxWidth, 0);
        this.mIsPhysicsEnable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearSeekBar_nxSeekBarPhysicsEnable, true);
        this.mShadowRadiusSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearSeekBar_nxSeekBarShadowSize, 0);
        this.mShadowColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearSeekBar_nxSeekBarShadowColor, -16777216);
        this.mEnableAdaptiveVibrator = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearSeekBar_nxSeekBarAdaptiveVibrator, false);
        this.mHasMotorVibrator = xvk.c(context);
        typedArrayObtainStyledAttributes.recycle();
        this.mHorizontalPaddingScale = (getResources().getDimensionPixelSize(R$dimen.nx_seekbar_progress_pressed_padding_horizontal) + (this.mBackgroundRadius * 5.0f)) / this.mProgressPaddingHorizontal;
        this.mTextDrawable = new TextDrawable(getContext());
        initView();
        ensureThumb();
        initAnimation();
        if (this.mIsPhysicsEnable) {
            this.mPhysicalAnimator = vie.e(context);
            this.mFlingValueHolder = new pt7(0.0f);
        }
    }

    public void animForClick(int i) {
        AnimatorSet animatorSet = this.mClickAnimatorSet;
        if (animatorSet == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.mClickAnimatorSet = animatorSet2;
            animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSeekBar.3
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    NearSeekBar nearSeekBar = NearSeekBar.this;
                    OnSeekBarChangeListener onSeekBarChangeListener = nearSeekBar.mOnSeekBarChangeListener;
                    if (onSeekBarChangeListener != null) {
                        onSeekBarChangeListener.onProgressChanged(nearSeekBar, nearSeekBar.mProgress, true);
                    }
                    NearSeekBar.this.onStopTrackingTouch();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    NearSeekBar nearSeekBar = NearSeekBar.this;
                    OnSeekBarChangeListener onSeekBarChangeListener = nearSeekBar.mOnSeekBarChangeListener;
                    if (onSeekBarChangeListener != null) {
                        onSeekBarChangeListener.onProgressChanged(nearSeekBar, nearSeekBar.mProgress, true);
                    }
                    NearSeekBar.this.onStopTrackingTouch();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    NearSeekBar.this.onStartTrackingTouch();
                }
            });
        } else {
            if (animatorSet.isRunning()) {
                this.mClickAnimatorSet.end();
            }
            this.mClickAnimatorSet.cancel();
        }
        int i2 = this.mProgress;
        int seekBarWidth = getSeekBarWidth();
        float f = seekBarWidth / this.mMax;
        final BigDecimal bigDecimal = new BigDecimal(f);
        final BigDecimal bigDecimal2 = new BigDecimal(seekBarWidth);
        if (f > 0.0f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i2 * f, i * f);
            valueAnimatorOfFloat.setInterpolator(this.mThumbAnimateInterpolator);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.NearSeekBar.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BigDecimal bigDecimal3 = new BigDecimal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    NearSeekBar.this.mProgress = bigDecimal3.divide(bigDecimal, 2, RoundingMode.HALF_EVEN).intValue();
                    NearSeekBar.this.mScale = bigDecimal3.divide(bigDecimal2, 7, RoundingMode.HALF_EVEN).floatValue();
                    NearSeekBar.this.invalidate();
                }
            });
            long jAbs = (long) ((Math.abs(i - i2) / this.mMax) * 483.0f);
            if (jAbs < 150) {
                jAbs = 150;
            }
            this.mClickAnimatorSet.setDuration(jAbs);
            this.mClickAnimatorSet.play(valueAnimatorOfFloat);
            this.mClickAnimatorSet.start();
        }
    }
}

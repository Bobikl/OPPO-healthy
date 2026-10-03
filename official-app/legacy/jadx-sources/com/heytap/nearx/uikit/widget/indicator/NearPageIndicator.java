package com.heytap.nearx.uikit.widget.indicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.vhc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class NearPageIndicator extends FrameLayout implements NearIPagerIndicator {
    private static final float BEZIER_OFFSET_INTERCEPT = 3.0f;
    private static final float BEZIER_OFFSET_MAX_FACTOR = 1.0f;
    private static final float BEZIER_OFFSET_MIN_FACTOR = 0.0f;
    private static final float BEZIER_OFFSET_SLOPE = -1.0f;
    private static final float BEZIER_OFFSET_X_INTERCEPT;
    private static final float BEZIER_OFFSET_X_INTERCEPT_2;
    private static final float BEZIER_OFFSET_X_MAX_FACTOR = 1.5f;
    private static final float BEZIER_OFFSET_X_MAX_FACTOR_2;
    private static final float BEZIER_OFFSET_X_MIN_FACTOR;
    private static final float BEZIER_OFFSET_X_MIN_FACTOR_2 = 0.0f;
    private static final float BEZIER_OFFSET_X_SLOPE;
    private static final float BEZIER_OFFSET_X_SLOPE_2;
    private static final boolean DEBUG = false;
    private static final int DELAY_TRACE_ANIMATION = 0;
    private static final float DISTANCE_TURN_POINT = 2.8f;
    private static final int DURATION_TRACE_ANIMATION = 300;
    private static final float FLOAT_HALF = 0.5f;
    private static final float FLOAT_ONE = 1.0f;
    private static final float FLOAT_SQRT_2;
    private static final float FLOAT_ZERO = 0.0f;
    private static final int MAX_ALPHA = 255;
    private static final int MIN_ALPHA = 0;
    private static final int MIS_POSITION = -1;
    private static final int MSG_START_TRACE_ANIMATION = 17;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final float STICKY_DISTANCE_FACTOR = 2.95f;
    private static final String TAG = "COUIPageIndicator";
    private static final float TRACE_ANIMATION_CONTROL_X1 = 0.33f;
    private static final float TRACE_ANIMATION_CONTROL_X2 = 0.67f;
    private Context mContext;
    private int mCurrentPosition;
    private float mDepartControlX;
    private float mDepartEndX;
    private int mDepartPosition;
    private RectF mDepartRect;
    private Path mDepartStickyPath;
    private int mDotColor;
    private int mDotCornerRadius;
    private int mDotSize;
    private int mDotSpacing;
    private int mDotStepDistance;
    private int mDotStrokeWidth;
    private int mDotsCount;
    private float mFinalLeft;
    private float mFinalRight;
    private Handler mHandler;
    private List<View> mIndicatorDots;
    private LinearLayout mIndicatorDotsParent;
    private boolean mIsAnimated;
    private boolean mIsAnimatorCanceled;
    private boolean mIsClickable;
    private boolean mIsPageSelected;
    private boolean mIsPaused;
    private boolean mIsStrokeStyle;
    private int mLastPosition;
    private boolean mNeedSettlePositionTemp;
    private float mOffset;
    private float mOffsetX;
    private float mOffsetY;
    private OnIndicatorDotClickListener mOnDotClickListener;
    private float mPortControlX;
    private float mPortEndX;
    private int mPortPosition;
    private RectF mPortRect;
    private Path mPortStickyPath;
    private int mStyle;
    private ValueAnimator mTraceAnimator;
    private boolean mTraceCutTailRight;
    private int mTraceDotColor;
    private float mTraceLeft;
    private Paint mTracePaint;
    private RectF mTraceRect;
    private float mTraceRight;
    private int mWidth;

    public interface OnIndicatorDotClickListener {
        void onClick(int i);
    }

    static {
        float fSqrt = (float) Math.sqrt(2.0d);
        FLOAT_SQRT_2 = fSqrt;
        BEZIER_OFFSET_X_SLOPE = 7.5f - (2.5f * fSqrt);
        BEZIER_OFFSET_X_INTERCEPT = (7.5f * fSqrt) - 21.0f;
        BEZIER_OFFSET_X_MIN_FACTOR = fSqrt * 0.5f;
        BEZIER_OFFSET_X_SLOPE_2 = 0.625f * fSqrt;
        BEZIER_OFFSET_X_INTERCEPT_2 = (-1.25f) * fSqrt;
        BEZIER_OFFSET_X_MAX_FACTOR_2 = fSqrt * 0.5f;
    }

    public NearPageIndicator(Context context) {
        this(context, null);
    }

    private void addIndicatorDots(int i) {
        for (final int i2 = 0; i2 < i; i2++) {
            View viewBuildDot = buildDot(this.mIsStrokeStyle, this.mDotColor);
            if (this.mIsClickable) {
                viewBuildDot.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.indicator.NearPageIndicator.4
                    @Override // android.view.View.OnClickListener
                    @SensorsDataInstrumented
                    public void onClick(View view) {
                        if (NearPageIndicator.this.mOnDotClickListener != null && NearPageIndicator.this.mLastPosition != i2) {
                            NearPageIndicator.this.mNeedSettlePositionTemp = true;
                            NearPageIndicator.this.mIsAnimated = false;
                            NearPageIndicator nearPageIndicator = NearPageIndicator.this;
                            nearPageIndicator.mCurrentPosition = nearPageIndicator.mLastPosition;
                            NearPageIndicator.this.stopTraceAnimator();
                            NearPageIndicator.this.mOnDotClickListener.onClick(i2);
                        }
                        SensorsDataAutoTrackHelper.trackViewOnClick(view);
                    }
                });
            }
            this.mIndicatorDots.add(viewBuildDot.findViewById(R$id.nx_color_page_indicator_dot));
            this.mIndicatorDotsParent.addView(viewBuildDot);
        }
    }

    @TargetApi(21)
    private View buildDot(boolean z, int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.nx_color_page_indicator_dot_layout, (ViewGroup) this, false);
        View viewFindViewById = viewInflate.findViewById(R$id.nx_color_page_indicator_dot);
        viewFindViewById.setBackground(getContext().getResources().getDrawable(z ? R$drawable.nx_page_indicator_dot_stroke : R$drawable.nx_page_indicator_dot));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
        int i2 = this.mDotSize;
        layoutParams.width = i2;
        layoutParams.height = i2;
        viewFindViewById.setLayoutParams(layoutParams);
        int i3 = this.mDotSpacing;
        layoutParams.setMargins(i3, 0, i3, 0);
        setupDotView(z, viewFindViewById, i);
        return viewInflate;
    }

    private void calculateControlPointOffset(float f, float f2) {
        this.mOffset = Math.max(Math.min(((-1.0f) * f) + (3.0f * f2), 1.0f * f2), f2 * 0.0f);
        float f3 = 1.5f * f2;
        this.mOffsetX = f3;
        this.mOffsetY = 0.0f;
        if (f < DISTANCE_TURN_POINT * f2) {
            this.mOffsetX = Math.max(Math.min((BEZIER_OFFSET_X_SLOPE_2 * f) + (BEZIER_OFFSET_X_INTERCEPT_2 * f2), BEZIER_OFFSET_X_MAX_FACTOR_2 * f2), 0.0f);
            this.mOffsetY = (float) Math.sqrt(Math.pow(f2, 2.0d) - Math.pow(this.mOffsetX, 2.0d));
        } else {
            float fMax = Math.max(Math.min((BEZIER_OFFSET_X_SLOPE * f) + (BEZIER_OFFSET_X_INTERCEPT * f2), f3), BEZIER_OFFSET_X_MIN_FACTOR * f2);
            this.mOffsetX = fMax;
            this.mOffsetY = ((f - (fMax * 2.0f)) * f2) / ((FLOAT_SQRT_2 * f) - (f2 * 2.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Path calculateTangentBezierPath(int i, float f, float f2, float f3, boolean z) {
        Path path = z ? this.mPortStickyPath : this.mDepartStickyPath;
        path.reset();
        float fAbs = Math.abs(f - f2);
        if (fAbs >= STICKY_DISTANCE_FACTOR * f3 || i == -1) {
            clearStickyPath(z);
            return path;
        }
        calculateControlPointOffset(fAbs, f3);
        float f4 = FLOAT_SQRT_2;
        float f5 = f4 * 0.5f * f3;
        float f6 = f4 * 0.5f * f3;
        if (f > f2) {
            this.mOffsetX = -this.mOffsetX;
            f5 = -f5;
        }
        if (fAbs >= DISTANCE_TURN_POINT * f3) {
            float f7 = f + f5;
            float f8 = f3 + f6;
            path.moveTo(f7, f8);
            path.lineTo(this.mOffsetX + f, this.mOffsetY + f3);
            float f9 = (f + f2) * 0.5f;
            path.quadTo(f9, this.mOffset + f3, f2 - this.mOffsetX, this.mOffsetY + f3);
            float f10 = f2 - f5;
            path.lineTo(f10, f8);
            float f11 = f3 - f6;
            path.lineTo(f10, f11);
            path.lineTo(f2 - this.mOffsetX, f3 - this.mOffsetY);
            path.quadTo(f9, f3 - this.mOffset, f + this.mOffsetX, f3 - this.mOffsetY);
            path.lineTo(f7, f11);
            path.lineTo(f7, f8);
        } else {
            path.moveTo(this.mOffsetX + f, this.mOffsetY + f3);
            float f12 = (f + f2) * 0.5f;
            path.quadTo(f12, this.mOffset + f3, f2 - this.mOffsetX, this.mOffsetY + f3);
            path.lineTo(f2 - this.mOffsetX, f3 - this.mOffsetY);
            path.quadTo(f12, f3 - this.mOffset, this.mOffsetX + f, f3 - this.mOffsetY);
            path.lineTo(f + this.mOffsetX, f3 + this.mOffsetY);
        }
        return path;
    }

    private void clearStickyPath() {
        clearStickyPath(true);
        clearStickyPath(false);
    }

    private void pauseTrace() {
        this.mIsPaused = true;
    }

    private void removeIndicatorDots(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            LinearLayout linearLayout = this.mIndicatorDotsParent;
            linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
            List<View> list = this.mIndicatorDots;
            list.remove(list.size() - 1);
        }
    }

    private void resumeTrace() {
        this.mIsPaused = false;
    }

    private void setupDotView(boolean z, View view, int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
        if (z) {
            gradientDrawable.setStroke(this.mDotStrokeWidth, i);
        } else {
            gradientDrawable.setColor(i);
        }
        gradientDrawable.setCornerRadius(this.mDotCornerRadius);
    }

    private void snapToPosition(int i) {
        verifyFinalPosition(this.mCurrentPosition);
        RectF rectF = this.mTraceRect;
        rectF.left = this.mFinalLeft;
        rectF.right = this.mFinalRight;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTraceAnimator() {
        if (this.mTraceAnimator == null) {
            return;
        }
        stopTraceAnimator();
        this.mTraceAnimator.start();
    }

    private void verifyFinalPosition(int i) {
        if (isLayoutRtl()) {
            this.mFinalRight = this.mWidth - (this.mDotSpacing + (i * this.mDotStepDistance));
        } else {
            this.mFinalRight = this.mDotSpacing + this.mDotSize + (i * this.mDotStepDistance);
        }
        this.mFinalLeft = this.mFinalRight - this.mDotSize;
    }

    private void verifyLayoutWidth() {
        int i = this.mDotsCount;
        if (i < 1) {
            return;
        }
        this.mWidth = this.mDotStepDistance * i;
        requestLayout();
    }

    private void verifyStickyPosition(int i, boolean z) {
        if (z) {
            RectF rectF = this.mPortRect;
            rectF.top = 0.0f;
            rectF.bottom = this.mDotSize;
            if (isLayoutRtl()) {
                this.mPortRect.right = this.mWidth - (this.mDotSpacing + (i * this.mDotStepDistance));
            } else {
                this.mPortRect.right = this.mDotSpacing + this.mDotSize + (i * this.mDotStepDistance);
            }
            RectF rectF2 = this.mPortRect;
            rectF2.left = rectF2.right - this.mDotSize;
            return;
        }
        RectF rectF3 = this.mDepartRect;
        rectF3.top = 0.0f;
        rectF3.bottom = this.mDotSize;
        if (isLayoutRtl()) {
            this.mDepartRect.right = this.mWidth - (this.mDotSpacing + (i * this.mDotStepDistance));
        } else {
            this.mDepartRect.right = this.mDotSpacing + this.mDotSize + (i * this.mDotStepDistance);
        }
        RectF rectF4 = this.mDepartRect;
        rectF4.left = rectF4.right - this.mDotSize;
    }

    public void addDot() {
        this.mDotsCount++;
        verifyLayoutWidth();
        addIndicatorDots(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        RectF rectF = this.mTraceRect;
        int i = this.mDotCornerRadius;
        canvas.drawRoundRect(rectF, i, i, this.mTracePaint);
        RectF rectF2 = this.mPortRect;
        int i2 = this.mDotCornerRadius;
        canvas.drawRoundRect(rectF2, i2, i2, this.mTracePaint);
        canvas.drawPath(this.mPortStickyPath, this.mTracePaint);
        RectF rectF3 = this.mDepartRect;
        int i3 = this.mDotCornerRadius;
        canvas.drawRoundRect(rectF3, i3, i3, this.mTracePaint);
        canvas.drawPath(this.mDepartStickyPath, this.mTracePaint);
    }

    public int getDotsCount() {
        return this.mDotsCount;
    }

    public boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(this.mWidth, this.mDotSize);
    }

    @Override // com.heytap.nearx.uikit.widget.indicator.NearIPagerIndicator
    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            pauseTrace();
            clearStickyPath(false);
            this.mTraceAnimator.pause();
            if (this.mIsAnimated) {
                this.mIsAnimated = false;
            }
        } else if (i == 2) {
            resumeTrace();
            this.mTraceAnimator.resume();
        } else if (i == 0 && (this.mIsPaused || !this.mIsPageSelected)) {
            if (this.mHandler.hasMessages(17)) {
                this.mHandler.removeMessages(17);
            }
            stopTraceAnimator();
            this.mHandler.sendEmptyMessageDelayed(17, 0L);
        }
        this.mIsPageSelected = false;
    }

    @Override // com.heytap.nearx.uikit.widget.indicator.NearIPagerIndicator
    public void onPageScrolled(int i, float f, int i2) {
        float f2;
        float f3;
        boolean zIsLayoutRtl = isLayoutRtl();
        boolean z = false;
        int i3 = this.mCurrentPosition;
        if (!zIsLayoutRtl ? i3 <= i : i3 > i) {
            z = true;
        }
        if (z) {
            if (zIsLayoutRtl) {
                this.mPortPosition = i;
                float f4 = this.mWidth;
                int i4 = this.mDotSpacing;
                int i5 = this.mDotStepDistance;
                f3 = f4 - ((i4 + (i * i5)) + (i5 * f));
            } else {
                this.mPortPosition = i + 1;
                int i6 = this.mDotSpacing + this.mDotSize;
                int i7 = this.mDotStepDistance;
                f3 = i6 + (i * i7) + (i7 * f);
            }
            RectF rectF = this.mTraceRect;
            rectF.right = f3;
            if (this.mIsPaused) {
                if (this.mTraceAnimator.isRunning() || !this.mIsAnimated) {
                    RectF rectF2 = this.mTraceRect;
                    float f5 = rectF2.right;
                    float f6 = f5 - rectF2.left;
                    int i8 = this.mDotSize;
                    if (f6 < i8) {
                        rectF2.left = f5 - i8;
                    }
                } else {
                    RectF rectF3 = this.mTraceRect;
                    rectF3.left = rectF3.right - this.mDotSize;
                }
            } else if (this.mIsAnimated) {
                rectF.left = f3 - this.mDotSize;
            } else {
                float f7 = f3 - rectF.left;
                int i9 = this.mDotSize;
                if (f7 < i9) {
                    rectF.left = f3 - i9;
                }
            }
        } else {
            if (zIsLayoutRtl) {
                this.mPortPosition = i + 1;
                f2 = ((this.mWidth - (this.mDotStepDistance * (i + f))) - this.mDotSpacing) - this.mDotSize;
            } else {
                this.mPortPosition = i;
                f2 = this.mDotSpacing + (this.mDotStepDistance * (i + f));
            }
            RectF rectF4 = this.mTraceRect;
            rectF4.left = f2;
            if (this.mIsPaused) {
                if (this.mTraceAnimator.isRunning() || !this.mIsAnimated) {
                    RectF rectF5 = this.mTraceRect;
                    float f8 = rectF5.right;
                    float f9 = rectF5.left;
                    float f10 = f8 - f9;
                    int i10 = this.mDotSize;
                    if (f10 < i10) {
                        rectF5.right = f9 + i10;
                    }
                } else {
                    RectF rectF6 = this.mTraceRect;
                    rectF6.right = rectF6.left + this.mDotSize;
                }
            } else if (this.mIsAnimated) {
                rectF4.right = f2 + this.mDotSize;
            } else {
                float f11 = rectF4.right - f2;
                int i11 = this.mDotSize;
                if (f11 < i11) {
                    rectF4.right = f2 + i11;
                }
            }
        }
        RectF rectF7 = this.mTraceRect;
        float f12 = rectF7.left;
        this.mTraceLeft = f12;
        float f13 = rectF7.right;
        this.mTraceRight = f13;
        if (z) {
            this.mPortControlX = f13 - (this.mDotSize * 0.5f);
        } else {
            this.mPortControlX = f12 + (this.mDotSize * 0.5f);
        }
        verifyStickyPosition(this.mPortPosition, true);
        float f14 = this.mPortRect.left;
        int i12 = this.mDotSize;
        float f15 = f14 + (i12 * 0.5f);
        this.mPortEndX = f15;
        this.mPortStickyPath = calculateTangentBezierPath(this.mPortPosition, this.mPortControlX, f15, i12 * 0.5f, true);
        if (f == 0.0f) {
            this.mCurrentPosition = i;
            clearStickyPath(true);
        }
        invalidate();
    }

    @Override // com.heytap.nearx.uikit.widget.indicator.NearIPagerIndicator
    public void onPageSelected(int i) {
        this.mIsPageSelected = true;
        if (this.mLastPosition != i && this.mIsAnimated) {
            this.mIsAnimated = false;
        }
        this.mTraceCutTailRight = !isLayoutRtl() ? this.mLastPosition <= i : this.mLastPosition > i;
        int iAbs = Math.abs(this.mLastPosition - i);
        this.mTraceAnimator.setDuration((iAbs >= 1 ? iAbs : 1) * 300);
        verifyFinalPosition(i);
        int i2 = this.mLastPosition;
        this.mDepartPosition = i2;
        verifyStickyPosition(i2, false);
        if (this.mLastPosition != i) {
            if (this.mHandler.hasMessages(17)) {
                this.mHandler.removeMessages(17);
            }
            stopTraceAnimator();
            this.mHandler.sendEmptyMessageDelayed(17, 0L);
        } else if (this.mHandler.hasMessages(17)) {
            this.mHandler.removeMessages(17);
        }
        this.mLastPosition = i;
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if ("attr".equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.NearPageIndicator, this.mStyle, 0);
        } else if (Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R$styleable.NearPageIndicator, 0, this.mStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            this.mTraceDotColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearPageIndicator_nxTraceDotColor, 0);
            this.mDotColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearPageIndicator_nxDotColor, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        setTraceDotColor(this.mTraceDotColor);
        setPageIndicatorDotsColor(this.mDotColor);
    }

    public void removeDot() throws IndexOutOfBoundsException {
        int i = this.mDotsCount;
        if (i < 1) {
            throw new IndexOutOfBoundsException("Can't remove dot because the count of dots is 0.");
        }
        this.mDotsCount = i - 1;
        verifyLayoutWidth();
        removeIndicatorDots(1);
        clearStickyPath();
    }

    public void setCurrentPosition(int i) {
        this.mLastPosition = i;
        this.mCurrentPosition = i;
        snapToPosition(i);
    }

    public void setDotCornerRadius(int i) {
        this.mDotCornerRadius = i;
    }

    public void setDotSize(int i) {
        this.mDotSize = i;
    }

    public void setDotSpacing(int i) {
        this.mDotSpacing = i;
    }

    public void setDotStrokeWidth(int i) {
        this.mDotStrokeWidth = i;
    }

    public void setDotsCount(int i) {
        removeIndicatorDots(this.mDotsCount);
        this.mDotsCount = i;
        verifyLayoutWidth();
        addIndicatorDots(i);
    }

    public void setIsClickable(boolean z) {
        this.mIsClickable = z;
    }

    public void setOnDotClickListener(OnIndicatorDotClickListener onIndicatorDotClickListener) {
        this.mOnDotClickListener = onIndicatorDotClickListener;
    }

    public void setPageIndicatorDotsColor(int i) {
        this.mDotColor = i;
        List<View> list = this.mIndicatorDots;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<View> it = this.mIndicatorDots.iterator();
        while (it.hasNext()) {
            setupDotView(this.mIsStrokeStyle, it.next(), i);
        }
    }

    public void setTraceDotColor(int i) {
        this.mTraceDotColor = i;
        this.mTracePaint.setColor(i);
    }

    public void stopTraceAnimator() {
        if (!this.mIsAnimatorCanceled) {
            this.mIsAnimatorCanceled = true;
        }
        ValueAnimator valueAnimator = this.mTraceAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.mTraceAnimator.cancel();
    }

    public NearPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nearPageIndicatorStyle);
    }

    @TargetApi(21)
    public NearPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDotStepDistance = 0;
        this.mTraceLeft = 0.0f;
        this.mTraceRight = 0.0f;
        this.mFinalLeft = 0.0f;
        this.mFinalRight = 0.0f;
        this.mPortControlX = 0.0f;
        this.mPortEndX = 0.0f;
        this.mDepartControlX = 0.0f;
        this.mDepartEndX = 0.0f;
        this.mOffset = 0.0f;
        this.mOffsetX = 0.0f;
        this.mOffsetY = 0.0f;
        this.mTraceCutTailRight = false;
        this.mIsAnimated = false;
        this.mIsAnimatorCanceled = false;
        this.mIsPaused = false;
        this.mNeedSettlePositionTemp = false;
        this.mIsPageSelected = false;
        this.mPortStickyPath = new Path();
        this.mDepartStickyPath = new Path();
        this.mTraceRect = new RectF();
        this.mPortRect = new RectF();
        this.mDepartRect = new RectF();
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.mStyle = attributeSet.getStyleAttribute();
        } else {
            this.mStyle = i;
        }
        this.mContext = context;
        vhc.b(this, false);
        this.mIndicatorDots = new ArrayList();
        this.mIsStrokeStyle = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPageIndicator, i, 0);
            this.mTraceDotColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearPageIndicator_nxTraceDotColor, 0);
            this.mDotColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearPageIndicator_nxDotColor, 0);
            this.mDotSize = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NearPageIndicator_nxDotSize, 0.0f);
            this.mDotSpacing = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NearPageIndicator_nxDotSpacing, 0.0f);
            this.mDotCornerRadius = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NearPageIndicator_nxDotCornerRadius, this.mDotSize * 0.5f);
            this.mIsClickable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPageIndicator_nxDotClickable, true);
            this.mDotStrokeWidth = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NearPageIndicator_nxDotStrokeWidth, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        RectF rectF = this.mTraceRect;
        rectF.top = 0.0f;
        rectF.bottom = this.mDotSize;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mTraceAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.mTraceAnimator.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f));
        this.mTraceAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.indicator.NearPageIndicator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (NearPageIndicator.this.mIsAnimatorCanceled) {
                    return;
                }
                float f = NearPageIndicator.this.mTraceLeft - NearPageIndicator.this.mFinalLeft;
                float f2 = NearPageIndicator.this.mTraceRight - NearPageIndicator.this.mFinalRight;
                float f3 = NearPageIndicator.this.mTraceLeft - (f * fFloatValue);
                if (f3 > NearPageIndicator.this.mTraceRect.right - NearPageIndicator.this.mDotSize) {
                    f3 = NearPageIndicator.this.mTraceRect.right - NearPageIndicator.this.mDotSize;
                }
                float f4 = NearPageIndicator.this.mTraceRight - (f2 * fFloatValue);
                if (f4 < NearPageIndicator.this.mTraceRect.left + NearPageIndicator.this.mDotSize) {
                    f4 = NearPageIndicator.this.mDotSize + NearPageIndicator.this.mTraceRect.left;
                }
                if (NearPageIndicator.this.mNeedSettlePositionTemp) {
                    NearPageIndicator.this.mTraceRect.left = f3;
                    NearPageIndicator.this.mTraceRect.right = f4;
                } else if (NearPageIndicator.this.mTraceCutTailRight) {
                    NearPageIndicator.this.mTraceRect.right = f4;
                } else {
                    NearPageIndicator.this.mTraceRect.left = f3;
                }
                if (NearPageIndicator.this.mTraceCutTailRight) {
                    NearPageIndicator nearPageIndicator = NearPageIndicator.this;
                    nearPageIndicator.mDepartControlX = nearPageIndicator.mTraceRect.right - (NearPageIndicator.this.mDotSize * 0.5f);
                } else {
                    NearPageIndicator nearPageIndicator2 = NearPageIndicator.this;
                    nearPageIndicator2.mDepartControlX = nearPageIndicator2.mTraceRect.left + (NearPageIndicator.this.mDotSize * 0.5f);
                }
                NearPageIndicator nearPageIndicator3 = NearPageIndicator.this;
                nearPageIndicator3.mDepartEndX = nearPageIndicator3.mDepartRect.left + (NearPageIndicator.this.mDotSize * 0.5f);
                NearPageIndicator nearPageIndicator4 = NearPageIndicator.this;
                nearPageIndicator4.mDepartStickyPath = nearPageIndicator4.calculateTangentBezierPath(nearPageIndicator4.mDepartPosition, NearPageIndicator.this.mDepartControlX, NearPageIndicator.this.mDepartEndX, NearPageIndicator.this.mDotSize * 0.5f, false);
                NearPageIndicator.this.invalidate();
            }
        });
        this.mTraceAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.indicator.NearPageIndicator.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                NearPageIndicator.this.clearStickyPath(false);
                if (NearPageIndicator.this.mIsAnimatorCanceled) {
                    return;
                }
                NearPageIndicator.this.mTraceRect.right = NearPageIndicator.this.mTraceRect.left + NearPageIndicator.this.mDotSize;
                NearPageIndicator.this.mNeedSettlePositionTemp = false;
                NearPageIndicator.this.mIsAnimated = true;
                NearPageIndicator.this.invalidate();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                NearPageIndicator.this.mIsAnimatorCanceled = false;
                NearPageIndicator nearPageIndicator = NearPageIndicator.this;
                nearPageIndicator.mTraceLeft = nearPageIndicator.mTraceRect.left;
                NearPageIndicator nearPageIndicator2 = NearPageIndicator.this;
                nearPageIndicator2.mTraceRight = nearPageIndicator2.mTraceRect.right;
            }
        });
        Paint paint = new Paint(1);
        this.mTracePaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mTracePaint.setColor(this.mTraceDotColor);
        this.mDotStepDistance = this.mDotSize + (this.mDotSpacing * 2);
        this.mHandler = new Handler() { // from class: com.heytap.nearx.uikit.widget.indicator.NearPageIndicator.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 17) {
                    NearPageIndicator.this.startTraceAnimator();
                }
                super.handleMessage(message);
            }
        };
        this.mIndicatorDotsParent = new LinearLayout(context);
        this.mIndicatorDotsParent.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.mIndicatorDotsParent.setOrientation(0);
        addView(this.mIndicatorDotsParent);
        snapToPosition(this.mCurrentPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStickyPath(boolean z) {
        if (z) {
            this.mPortPosition = -1;
            this.mPortRect.setEmpty();
            this.mPortStickyPath.reset();
        } else {
            this.mDepartPosition = -1;
            this.mDepartRect.setEmpty();
            this.mDepartStickyPath.reset();
        }
    }
}

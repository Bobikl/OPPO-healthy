package com.heytap.nearx.uikit.widget.seekbar.icon;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.vhc;

/* JADX INFO: loaded from: classes18.dex */
public class NearIconSeekBar extends View {
    private static final float BACKGROUND_HEIGHT = 96.0f;
    private static final float BACKGROUND_MIDDLE_WIDTH = 204.0f;
    public static final int BRIGHTNESS_TYPE = 0;
    private static final int DAMPING_DISTANCE = 20;
    private static final int DEF_BACKGROUND_COLOR = 1308622848;
    private static final float DEF_HEIGHT = 96.0f;
    private static final int DEF_PROGRESS_COLOR = -654311425;
    private static final int DEF_TRACK_COLOR = 452984831;
    private static final float DEF_WIDTH = 408.0f;
    private static final int DURATION_150 = 150;
    private static final int DURATION_483 = 483;
    private static final float ICON_HEIGHT = 72.0f;
    private static final float ICON_WIDTH = 72.0f;
    private static final float IMAGE_RADIUS = 90.0f;
    private static final float PADDING_RIGHT = 24.0f;
    private static final float PADDING_START_END = 36.0f;
    private static final float PADDING_TOP = 12.0f;
    private static final float SCALE_MAX = 1.0f;
    private static final float SCALE_MIN = 0.0f;
    public static final int VOLUME_TYPE = 1;
    protected float mBackgroundRadius;
    private RectF mBackgroundRect;
    private Bitmap mBitmap;
    protected AnimatorSet mClickAnimatorSet;
    private float mCurBackgroundRadius;
    protected float mCurProgressRadius;
    private PatternExploreByTouchHelper mExploreByTouchHelper;
    private int mIncrement;
    private final Interpolator mInterpolator;
    protected boolean mIsDragging;
    private boolean mIsVibratorEnable;
    protected float mLastX;
    protected int mMax;
    private float mMaxDamping;
    private OnSeekBarChangeListener mOnSeekBarChangeListener;
    protected Paint mPaint;
    protected int mProgress;
    private String mProgressContentDescription;
    private float mProgressRadius;
    protected RectF mProgressRect;
    private RectF mProgressRect1;
    private float mProgressScaleRadius;
    private int mRefreshStyle;
    private float mScale;
    private boolean mStartDragging;
    protected Interpolator mThumbAnimateInterpolator;
    protected float mTouchDownX;
    protected int mTouchSlop;
    private int mType;

    public NearIconSeekBar(Context context) {
        this(context, null);
    }

    private void attemptClaimDrag() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).requestDisallowInterceptTouchEvent(true);
        }
    }

    private float calculateDamping(float f) {
        float seekBarWidth = getSeekBarWidth();
        float f2 = seekBarWidth / 2.0f;
        float interpolation = 1.0f - this.mInterpolator.getInterpolation(Math.abs(f - f2) / f2);
        return (f > seekBarWidth - ((float) getPaddingRight()) || f < ((float) getPaddingLeft()) || interpolation < this.mMaxDamping) ? this.mMaxDamping : interpolation;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    private int computeProgress(float f) {
        float progressLeftX;
        float f2;
        float f3;
        int progressRightX = getProgressRightX() - getProgressLeftX();
        if (isLayoutRtl()) {
            if (f > getProgressRightX()) {
                f3 = 0.0f;
            } else if (f < getProgressLeftX()) {
                f3 = 1.0f;
            } else {
                f2 = progressRightX;
                progressLeftX = (f2 - f) + getProgressLeftX();
                f3 = progressLeftX / f2;
            }
        } else if (f < getProgressLeftX()) {
            f3 = 0.0f;
        } else if (f > getProgressRightX()) {
            f3 = 1.0f;
        } else {
            progressLeftX = f - getProgressLeftX();
            f2 = progressRightX;
            f3 = progressLeftX / f2;
        }
        this.mScale = Math.min(f3, 1.0f);
        float max = 0.0f + (f3 * getMax());
        int i = this.mProgress;
        this.mProgress = getProgressLimit(Math.round(max));
        invalidate();
        return i;
    }

    private void drawBrightnessIcon(Canvas canvas) {
        this.mPaint.setColor(-1);
        int i = (int) (this.mBackgroundRect.left + PADDING_START_END + PADDING_START_END);
        float width = 72.0f / this.mBitmap.getWidth();
        float height = 72.0f / this.mBitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(width, height);
        float f = i;
        matrix.postRotate(this.mProgress * 2, f, this.mBackgroundRect.height() / 2.0f);
        Bitmap bitmap = this.mBitmap;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.mBitmap.getHeight(), matrix, true);
        Rect rect = new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        RectF rectF = new RectF();
        float width2 = bitmapCreateBitmap.getWidth() >> 1;
        float f2 = f - width2;
        float f3 = f + width2;
        float fHeight = ((this.mBackgroundRect.height() - bitmapCreateBitmap.getHeight()) / 2.0f) + getPaddingTop();
        rectF.set(f2, fHeight, f3, bitmapCreateBitmap.getHeight() + fHeight);
        canvas.drawBitmap(bitmapCreateBitmap, rect, rectF, this.mPaint);
    }

    private void drawVolumeIcon(Canvas canvas) {
        Bitmap bitmap;
        this.mPaint.setColor(-1);
        int i = this.mProgress;
        if (i == 0) {
            bitmap = ((BitmapDrawable) getResources().getDrawable(R$drawable.ic_volume_seekbar_close)).getBitmap();
        } else {
            bitmap = (i <= 0 || i > (this.mMax >> 1)) ? ((BitmapDrawable) getResources().getDrawable(R$drawable.ic_volume_seekbar_open)).getBitmap() : ((BitmapDrawable) getResources().getDrawable(R$drawable.ic_volume_seekbar_middle)).getBitmap();
        }
        Bitmap bitmap2 = bitmap;
        float width = 72.0f / this.mBitmap.getWidth();
        float height = 72.0f / this.mBitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
        Rect rect = new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        RectF rectF = new RectF();
        float f = this.mBackgroundRect.left + PADDING_START_END;
        float width2 = bitmapCreateBitmap.getWidth() + f;
        float fHeight = ((this.mBackgroundRect.height() - bitmapCreateBitmap.getHeight()) / 2.0f) + getPaddingTop();
        rectF.set(f, fHeight, width2, bitmapCreateBitmap.getHeight() + fHeight);
        canvas.drawBitmap(bitmapCreateBitmap, rect, rectF, this.mPaint);
    }

    private void ensureThumb() {
        this.mCurProgressRadius = this.mProgressRadius;
        this.mCurBackgroundRadius = this.mBackgroundRadius;
    }

    private int getProgressLeftX() {
        return Math.round(this.mBackgroundRect.left + 72.0f + PADDING_START_END + 24.0f);
    }

    private int getProgressLimit(int i) {
        return Math.max(0, Math.min(i, this.mMax));
    }

    private int getProgressRightX() {
        return Math.round(this.mBackgroundRect.right - PADDING_START_END);
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
        this.mBitmap = ((BitmapDrawable) getResources().getDrawable(R$drawable.ic_brightness_seekbar)).getBitmap();
    }

    private void invalidateProgress(MotionEvent motionEvent) {
        int i = this.mProgress;
        float seekBarWidth = getSeekBarWidth();
        if (isLayoutRtl()) {
            int i2 = this.mMax;
            this.mProgress = i2 - Math.round((i2 * ((motionEvent.getX() - getProgressLeftX()) - this.mProgressScaleRadius)) / seekBarWidth);
        } else {
            this.mProgress = Math.round((this.mMax * ((motionEvent.getX() - getProgressLeftX()) - this.mProgressScaleRadius)) / seekBarWidth);
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

    private int measureSpec(int i, int i2) {
        return View.MeasureSpec.getMode(i) != 1073741824 ? i2 : View.MeasureSpec.getSize(i);
    }

    private void trackTouchEventByFinger(MotionEvent motionEvent) {
        float fRound = Math.round(((motionEvent.getX() - this.mLastX) * calculateDamping(motionEvent.getX())) + this.mLastX);
        int iComputeProgress = computeProgress(fRound);
        int i = this.mProgress;
        if (iComputeProgress != i) {
            this.mLastX = fRound;
            OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(this, i, true);
            }
            performFeedback();
        }
    }

    public void animForClick(float f) {
        int iRound;
        float seekBarWidth = getSeekBarWidth();
        if (isLayoutRtl()) {
            int i = this.mMax;
            iRound = i - Math.round((i * (((f - this.mProgressRect1.left) - getPaddingLeft()) - this.mProgressScaleRadius)) / seekBarWidth);
        } else {
            iRound = Math.round((this.mMax * (((f - this.mProgressRect1.left) - getPaddingLeft()) - this.mProgressScaleRadius)) / seekBarWidth);
        }
        animForClick(getProgressLimit(iRound));
    }

    public void drawActiveTrack(Canvas canvas, float f) {
        float progressRightX;
        float f2;
        float fHeight = (this.mBackgroundRect.height() / 2.0f) + getPaddingTop();
        if (isLayoutRtl()) {
            progressRightX = getProgressRightX();
            f2 = progressRightX - (this.mScale * f);
        } else {
            float progressLeftX = getProgressLeftX();
            progressRightX = progressLeftX + (this.mScale * f);
            f2 = progressLeftX;
        }
        if (f2 <= progressRightX) {
            RectF rectF = this.mProgressRect;
            float f3 = this.mCurProgressRadius;
            rectF.set(f2, fHeight - f3, progressRightX, fHeight + f3);
        } else {
            RectF rectF2 = this.mProgressRect;
            float f4 = this.mCurProgressRadius;
            rectF2.set(progressRightX, fHeight - f4, f2, fHeight + f4);
        }
        this.mPaint.setColor(DEF_PROGRESS_COLOR);
        RectF rectF3 = this.mProgressRect;
        float f5 = this.mCurBackgroundRadius;
        canvas.drawRoundRect(rectF3, f5, f5, this.mPaint);
        int i = this.mProgress;
        if (i == this.mMax || i <= this.mCurBackgroundRadius) {
            return;
        }
        if (isLayoutRtl()) {
            RectF rectF4 = this.mProgressRect;
            canvas.drawRect(rectF4.left, rectF4.top, rectF4.right - this.mCurBackgroundRadius, rectF4.bottom, this.mPaint);
        } else {
            RectF rectF5 = this.mProgressRect;
            canvas.drawRect(rectF5.left + this.mCurBackgroundRadius, rectF5.top, rectF5.right, rectF5.bottom, this.mPaint);
        }
    }

    public void drawBackground(Canvas canvas) {
        this.mPaint.setColor(DEF_BACKGROUND_COLOR);
        this.mBackgroundRect.set((getWidth() >> 1) - BACKGROUND_MIDDLE_WIDTH, getPaddingTop(), (getWidth() >> 1) + BACKGROUND_MIDDLE_WIDTH, getPaddingTop() + 96.0f);
        canvas.drawRoundRect(this.mBackgroundRect, IMAGE_RADIUS, IMAGE_RADIUS, this.mPaint);
        if (getType() == 0) {
            drawBrightnessIcon(canvas);
        } else {
            drawVolumeIcon(canvas);
        }
        this.mPaint.setColor(DEF_TRACK_COLOR);
        float fHeight = (this.mBackgroundRect.height() / 2.0f) + getPaddingTop();
        float progressLeftX = getProgressLeftX();
        float progressRightX = getProgressRightX();
        RectF rectF = this.mProgressRect1;
        float f = this.mCurBackgroundRadius;
        rectF.set(progressLeftX, fHeight - f, progressRightX, fHeight + f);
        RectF rectF2 = this.mProgressRect1;
        float f2 = this.mCurBackgroundRadius;
        canvas.drawRoundRect(rectF2, f2, f2, this.mPaint);
        drawActiveTrack(canvas, this.mProgressRect1.width());
    }

    public int getIncrement() {
        return this.mIncrement;
    }

    public int getMax() {
        return this.mMax;
    }

    public int getProgress() {
        return this.mProgress;
    }

    public String getProgressContentDescription() {
        return this.mProgressContentDescription;
    }

    public int getSeekBarWidth() {
        return (int) this.mProgressRect1.width();
    }

    public int getType() {
        return this.mType;
    }

    public void handleMotionEventDown(MotionEvent motionEvent) {
        this.mTouchDownX = motionEvent.getX();
        this.mLastX = motionEvent.getX();
    }

    public void handleMotionEventMove(MotionEvent motionEvent) {
        float seekBarWidth = getSeekBarWidth();
        if ((this.mProgress * seekBarWidth) / this.mMax != seekBarWidth / 2.0f || Math.abs(motionEvent.getX() - this.mLastX) >= 20.0f) {
            if (this.mIsDragging && this.mStartDragging) {
                trackTouchEventByFinger(motionEvent);
                return;
            }
            if (touchInSeekBar(motionEvent)) {
                float x = motionEvent.getX();
                if (Math.abs(x - this.mTouchDownX) > this.mTouchSlop) {
                    startDrag();
                    this.mLastX = x;
                    invalidateProgress(motionEvent);
                }
            }
        }
    }

    public void handleMotionEventUp(MotionEvent motionEvent) {
        if (this.mIsDragging) {
            onStopTrackingTouch();
            setPressed(false);
        } else if (touchInSeekBar(motionEvent)) {
            animForClick(motionEvent.getX());
        }
    }

    public boolean isIsVibratorEnable() {
        return this.mIsVibratorEnable;
    }

    public boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        drawBackground(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(measureSpec(i, Math.round(DEF_WIDTH)), measureSpec(i2, Math.round(96.0f)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mStartDragging = false;
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
        this.mIsDragging = false;
        this.mStartDragging = false;
        OnSeekBarChangeListener onSeekBarChangeListener = this.mOnSeekBarChangeListener;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mIsDragging = false;
            this.mStartDragging = false;
            handleMotionEventDown(motionEvent);
        } else if (action == 1) {
            handleMotionEventUp(motionEvent);
        } else if (action == 2) {
            handleMotionEventMove(motionEvent);
        } else if (action == 3) {
            handleMotionEventUp(motionEvent);
        }
        return true;
    }

    public void performFeedback() {
        if (this.mIsVibratorEnable) {
            if (this.mProgress == getMax() || this.mProgress == 0) {
                performHapticFeedback(306, 0);
            } else {
                performHapticFeedback(305, 0);
            }
        }
    }

    public void release() {
        this.mExploreByTouchHelper.release();
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.mBitmap.recycle();
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

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.mOnSeekBarChangeListener = onSeekBarChangeListener;
    }

    public void setProgress(int i) {
        setProgress(i, false);
    }

    public void setProgressContentDescription(String str) {
        this.mProgressContentDescription = str;
    }

    public void setType(int i) {
        this.mType = i;
        invalidate();
    }

    public void setVibratorEnable(boolean z) {
        this.mIsVibratorEnable = z;
    }

    public void startDrag() {
        setPressed(true);
        onStartTrackingTouch();
        attemptClaimDrag();
    }

    public boolean touchInSeekBar(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.mBackgroundRect;
        return x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom;
    }

    public NearIconSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.nxIconSeekBarStyle);
    }

    public void setProgress(int i, boolean z) {
        setProgress(i, z, false);
    }

    public NearIconSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTouchSlop = 0;
        this.mProgress = 0;
        this.mMax = 100;
        this.mIsDragging = false;
        this.mProgressRect = new RectF();
        this.mThumbAnimateInterpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.mIncrement = 1;
        this.mStartDragging = false;
        this.mBackgroundRect = new RectF();
        this.mMaxDamping = 0.4f;
        this.mInterpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
        this.mScale = 0.0f;
        this.mIsVibratorEnable = false;
        this.mProgressRect1 = new RectF();
        if (attributeSet != null) {
            this.mRefreshStyle = attributeSet.getStyleAttribute();
        }
        if (this.mRefreshStyle == 0) {
            this.mRefreshStyle = i;
        }
        vhc.b(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearIconSeekBar, i, 0);
        this.mProgressScaleRadius = getResources().getDimensionPixelSize(R$dimen.nx_icon_seekbar_progress_scale_radius);
        this.mProgressRadius = getResources().getDimensionPixelSize(R$dimen.nx_icon_seekbar_progress_radius);
        this.mBackgroundRadius = getResources().getDimensionPixelSize(R$dimen.nx_icon_seekbar_intent_background_radius);
        this.mType = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearIconSeekBar_nxIconSeekBarType, 0);
        this.mMax = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearIconSeekBar_nxIconSeekBarMax, 100);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearIconSeekBar_nxIconSeekBarProgress, 0);
        this.mProgress = integer;
        this.mScale = integer / this.mMax;
        typedArrayObtainStyledAttributes.recycle();
        initView();
        ensureThumb();
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

    public void animForClick(int i) {
        AnimatorSet animatorSet = this.mClickAnimatorSet;
        if (animatorSet == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.mClickAnimatorSet = animatorSet2;
            animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.icon.NearIconSeekBar.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    if (NearIconSeekBar.this.mOnSeekBarChangeListener != null) {
                        OnSeekBarChangeListener onSeekBarChangeListener = NearIconSeekBar.this.mOnSeekBarChangeListener;
                        NearIconSeekBar nearIconSeekBar = NearIconSeekBar.this;
                        onSeekBarChangeListener.onProgressChanged(nearIconSeekBar, nearIconSeekBar.mProgress, true);
                    }
                    NearIconSeekBar.this.onStopTrackingTouch();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (NearIconSeekBar.this.mOnSeekBarChangeListener != null) {
                        OnSeekBarChangeListener onSeekBarChangeListener = NearIconSeekBar.this.mOnSeekBarChangeListener;
                        NearIconSeekBar nearIconSeekBar = NearIconSeekBar.this;
                        onSeekBarChangeListener.onProgressChanged(nearIconSeekBar, nearIconSeekBar.mProgress, true);
                    }
                    NearIconSeekBar.this.onStopTrackingTouch();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    NearIconSeekBar.this.onStartTrackingTouch();
                }
            });
        } else {
            animatorSet.cancel();
        }
        int i2 = this.mProgress;
        final int seekBarWidth = getSeekBarWidth();
        final float f = seekBarWidth / this.mMax;
        if (f > 0.0f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i2 * f, i * f);
            valueAnimatorOfFloat.setInterpolator(this.mThumbAnimateInterpolator);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.seekbar.icon.NearIconSeekBar.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    NearIconSeekBar nearIconSeekBar = NearIconSeekBar.this;
                    nearIconSeekBar.mProgress = (int) (fFloatValue / f);
                    nearIconSeekBar.mScale = fFloatValue / seekBarWidth;
                    NearIconSeekBar.this.invalidate();
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

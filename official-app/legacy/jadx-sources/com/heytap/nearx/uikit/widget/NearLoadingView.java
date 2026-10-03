package com.heytap.nearx.uikit.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper;
import com.oplus.aiunit.vision.vhc;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class NearLoadingView extends View {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_TYPE = 1;
    private static final float LARGE_POINT_END_ALPHA = 1.0f;
    private static final float LARGE_POINT_START_ALPHA = 0.215f;
    public static final int LARGE_TYPE = 2;
    private static final float MEDIUM_POINT_END_ALPHA = 0.4f;
    private static final float MEDIUM_POINT_START_ALPHA = 0.1f;
    public static final int MEDIUM_TYPE = 1;
    private static final int ONE_CIRCLE_DEGREE = 360;
    private static final int ONE_CYCLE_DURATION = 480;
    public static final int ORIGINAL_ANGLE = -90;
    private static final int PROGRESS_POINT_COUNT = 6;
    public static final int SMALL_TYPE = 0;
    public static final int SWIPT_ANGEL = 60;
    private static final String TAG = "NearLoadingView";
    private String mAccessDescription;
    private ValueAnimator.AnimatorUpdateListener mAnimListener;
    private float mArcRadius;
    private RectF mArcRect;
    private Paint mBackGroundPaint;
    private float mCenterX;
    private float mCenterY;
    private ViewExplorerByTouchHelper.a mColorViewTalkBalkInteraction;
    private Context mContext;
    private float mCurrentDegree;
    private float mCurrentStepProgress;
    private float mEndAlpha;
    private float mHalfHeight;
    private float mHalfStrokeWidth;
    private float mHalfWidth;
    private int mHeight;
    private boolean mIsAnimationCreated;
    private boolean mIsAnimationStarted;
    private int mLoadingType;
    private int mLoadingViewBgCircleColor;
    private int mLoadingViewColor;
    private float[] mPointsAlpha;
    private ValueAnimator mProgressAnimator;
    private Paint mProgressPaint;
    private float mStartAlpha;
    private float mStepDegree;
    private int mStrokeDefaultWidth;
    private int mStrokeLargeWidth;
    private int mStrokeMediumWidth;
    private float mStrokeWidth;
    private ViewExplorerByTouchHelper mTouchHelper;
    private int mWidth;

    public static class LoadingAnimUpdateListener implements ValueAnimator.AnimatorUpdateListener {
        WeakReference<NearLoadingView> weakRef;

        public LoadingAnimUpdateListener(NearLoadingView nearLoadingView) {
            this.weakRef = new WeakReference<>(nearLoadingView);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            valueAnimator.getAnimatedFraction();
            NearLoadingView nearLoadingView = this.weakRef.get();
            if (nearLoadingView != null) {
                nearLoadingView.invalidate();
            }
        }
    }

    public NearLoadingView(Context context) {
        this(context, null);
    }

    private void cancelAnimations() {
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    private void createAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mProgressAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(480L);
        this.mProgressAnimator.setInterpolator(new LinearInterpolator());
        this.mProgressAnimator.addUpdateListener(new LoadingAnimUpdateListener(this));
        this.mProgressAnimator.setRepeatMode(1);
        this.mProgressAnimator.setRepeatCount(-1);
        this.mProgressAnimator.setInterpolator(new LinearInterpolator());
    }

    private void destroyAnimator() {
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mProgressAnimator.removeAllListeners();
            this.mProgressAnimator.removeAllUpdateListeners();
            this.mProgressAnimator = null;
        }
    }

    private void drawBackgroundCircle(Canvas canvas) {
        float f = this.mHalfWidth;
        canvas.drawCircle(f, f, this.mArcRadius, this.mBackGroundPaint);
    }

    private void initArcRect() {
        this.mHalfStrokeWidth = this.mStrokeWidth / 2.0f;
        this.mHalfWidth = getWidth() / 2;
        this.mHalfHeight = getHeight() / 2;
        this.mArcRadius = this.mHalfWidth - this.mHalfStrokeWidth;
        float f = this.mHalfWidth;
        float f2 = this.mArcRadius;
        this.mArcRect = new RectF(f - f2, f - f2, f + f2, f + f2);
    }

    private void initBackgroundPaint() {
        Paint paint = new Paint(1);
        this.mBackGroundPaint = paint;
        paint.setColor(this.mLoadingViewBgCircleColor);
        this.mBackGroundPaint.setStyle(Paint.Style.STROKE);
        this.mBackGroundPaint.setStrokeWidth(this.mStrokeWidth);
    }

    private void initProgressPaint() {
        Paint paint = new Paint(1);
        this.mProgressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mProgressPaint.setColor(this.mLoadingViewColor);
        this.mProgressPaint.setStrokeWidth(this.mStrokeWidth);
        this.mProgressPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    private void startAnimations() {
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                this.mProgressAnimator.cancel();
            }
            this.mProgressAnimator.start();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.mIsAnimationCreated) {
            createAnimator();
            this.mIsAnimationCreated = true;
        }
        if (this.mIsAnimationStarted) {
            return;
        }
        startAnimations();
        this.mIsAnimationStarted = true;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        destroyAnimator();
        this.mIsAnimationCreated = false;
        this.mIsAnimationStarted = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.mCurrentStepProgress = (this.mCurrentStepProgress + 6.0f) % 360.0f;
        drawBackgroundCircle(canvas);
        canvas.save();
        canvas.rotate(-90.0f, this.mHalfWidth, this.mHalfHeight);
        if (this.mArcRect == null) {
            initArcRect();
        }
        RectF rectF = this.mArcRect;
        float f = this.mCurrentStepProgress;
        canvas.drawArc(rectF, f - 30.0f, (2.0f - Math.abs((180.0f - f) / 180.0f)) * 60.0f, false, this.mProgressPaint);
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.mArcRect == null) {
            initArcRect();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.mWidth, this.mHeight);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        initArcRect();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            cancelAnimations();
            this.mIsAnimationStarted = false;
            return;
        }
        if (!this.mIsAnimationCreated) {
            createAnimator();
            this.mIsAnimationCreated = true;
        }
        if (this.mIsAnimationStarted) {
            return;
        }
        startAnimations();
        this.mIsAnimationStarted = true;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            startAnimations();
        } else {
            cancelAnimations();
        }
    }

    public NearLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.NXcolorLoadingViewStyle);
    }

    public NearLoadingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, R$attr.NXcolorLoadingViewStyle, 0);
    }

    public NearLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.mPointsAlpha = new float[6];
        this.mWidth = 0;
        this.mHeight = 0;
        this.mLoadingType = 1;
        this.mStepDegree = 60.0f;
        this.mAccessDescription = null;
        this.mStartAlpha = 0.1f;
        this.mEndAlpha = 0.4f;
        this.mIsAnimationCreated = false;
        this.mIsAnimationStarted = false;
        this.mColorViewTalkBalkInteraction = new ViewExplorerByTouchHelper.a() { // from class: com.heytap.nearx.uikit.widget.NearLoadingView.1
            private int mVirtualViewId = -1;

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public CharSequence getClassName() {
                return null;
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public int getCurrentPosition() {
                return -1;
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public int getDisablePosition() {
                return -1;
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public void getItemBounds(int i3, Rect rect) {
                if (i3 == 0) {
                    rect.set(0, 0, NearLoadingView.this.mWidth, NearLoadingView.this.mHeight);
                }
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public int getItemCounts() {
                return 1;
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public CharSequence getItemDescription(int i3) {
                return NearLoadingView.this.mAccessDescription != null ? NearLoadingView.this.mAccessDescription : getClass().getSimpleName();
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public int getVirtualViewAt(float f, float f2) {
                return (f < 0.0f || f > ((float) NearLoadingView.this.mWidth) || f2 < 0.0f || f2 > ((float) NearLoadingView.this.mHeight)) ? -1 : 0;
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public void performAction(int i3, int i4, boolean z) {
            }
        };
        vhc.b(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearLoadingView, i, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.NXcolor_loading_view_default_length);
        this.mWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearLoadingView_NXcolorLoadingViewWidth, dimensionPixelSize);
        this.mHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearLoadingView_NXcolorLoadingViewHeight, dimensionPixelSize);
        this.mLoadingType = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearLoadingView_NXcolorLoadingViewType, 1);
        int color = ContextCompat.getColor(context, R$color.nx_progress_background);
        int color2 = ContextCompat.getColor(context, R$color.nx_color_transparent);
        this.mLoadingViewColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearLoadingView_NXcolorLoadingViewColor, color);
        this.mLoadingViewBgCircleColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearLoadingView_NXcolorLoadingViewBgCircleColor, color2);
        typedArrayObtainStyledAttributes.recycle();
        this.mStrokeDefaultWidth = context.getResources().getDimensionPixelSize(R$dimen.NXcolor_circle_loading_strokewidth);
        this.mStrokeMediumWidth = context.getResources().getDimensionPixelSize(R$dimen.NXcolor_circle_loading_medium_strokewidth);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.NXcolor_circle_loading_large_strokewidth);
        this.mStrokeLargeWidth = dimensionPixelSize2;
        this.mStrokeWidth = this.mStrokeDefaultWidth;
        int i3 = this.mLoadingType;
        if (1 == i3) {
            this.mStrokeWidth = this.mStrokeMediumWidth;
            this.mStartAlpha = 0.1f;
            this.mEndAlpha = 0.4f;
        } else if (2 == i3) {
            this.mStrokeWidth = dimensionPixelSize2;
            this.mStartAlpha = LARGE_POINT_START_ALPHA;
            this.mEndAlpha = 1.0f;
        }
        this.mCenterX = this.mWidth >> 1;
        this.mCenterY = this.mHeight >> 1;
        ViewExplorerByTouchHelper viewExplorerByTouchHelper = new ViewExplorerByTouchHelper(this, this.mColorViewTalkBalkInteraction);
        this.mTouchHelper = viewExplorerByTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, viewExplorerByTouchHelper);
        ViewCompat.setImportantForAccessibility(this, 1);
        this.mAccessDescription = context.getString(R$string.NXcolor_loading_view_access_string);
        initProgressPaint();
        initBackgroundPaint();
    }
}

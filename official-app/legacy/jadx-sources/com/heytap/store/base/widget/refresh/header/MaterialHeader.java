package com.heytap.store.base.widget.refresh.header;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.heytap.store.base.widget.R;
import com.heytap.store.base.widget.refresh.header.internal.MaterialProgressDrawable;
import com.heytap.store.base.widget.refresh.header.material.CircleImageView;
import com.heytap.store.platform.tools.SizeUtils;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialHeader extends InternalAbstract implements RefreshHeader {
    protected static final int CIRCLE_BG_LIGHT = -328966;

    @VisibleForTesting
    protected static final int CIRCLE_DIAMETER = 40;

    @VisibleForTesting
    protected static final int CIRCLE_DIAMETER_LARGE = 56;
    protected static final float MAX_PROGRESS_ANGLE = 0.8f;
    public static final int SIZE_DEFAULT = 1;
    public static final int SIZE_LARGE = 0;
    protected final Paint mBezierPaint;
    protected final Path mBezierPath;
    protected int mCircleDiameter;
    protected final ImageView mCircleView;
    protected boolean mFinished;
    protected int mHeadHeight;
    protected final MaterialProgressDrawable mProgress;
    protected boolean mShowBezierWave;
    protected RefreshState mState;
    protected int mWaveHeight;

    /* JADX INFO: renamed from: com.heytap.store.base.widget.refresh.header.MaterialHeader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState;

        static {
            int[] iArr = new int[RefreshState.values().length];
            $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.ReleaseToRefresh.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.Refreshing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MaterialHeader(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.mShowBezierWave) {
            this.mBezierPath.reset();
            this.mBezierPath.lineTo(0.0f, this.mHeadHeight);
            this.mBezierPath.quadTo(getMeasuredWidth() / 2, this.mHeadHeight + (this.mWaveHeight * 1.9f), getMeasuredWidth(), this.mHeadHeight);
            this.mBezierPath.lineTo(getMeasuredWidth(), 0.0f);
            canvas.drawPath(this.mBezierPath, this.mBezierPaint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean z) {
        ImageView imageView = this.mCircleView;
        this.mProgress.stop();
        imageView.animate().scaleX(0.0f).scaleY(0.0f);
        this.mFinished = true;
        return 0;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(@NonNull RefreshKernel refreshKernel, int i, int i2) {
        if (!this.mShowBezierWave) {
            refreshKernel.requestDefaultTranslationContentFor(this, false);
        }
        if (isInEditMode()) {
            int i3 = i / 2;
            this.mHeadHeight = i3;
            this.mWaveHeight = i3;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (getChildCount() == 0) {
            return;
        }
        ImageView imageView = this.mCircleView;
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        if (!isInEditMode() || (i5 = this.mHeadHeight) <= 0) {
            int i6 = measuredWidth / 2;
            int i7 = measuredWidth2 / 2;
            int i8 = this.mCircleDiameter;
            imageView.layout(i6 - i7, -i8, i6 + i7, measuredHeight - i8);
            return;
        }
        int i9 = i5 - (measuredHeight / 2);
        int i10 = measuredWidth / 2;
        int i11 = measuredWidth2 / 2;
        imageView.layout(i10 - i11, i9, i10 + i11, measuredHeight + i9);
        this.mProgress.showArrow(true);
        this.mProgress.setStartEndTrim(0.0f, 0.8f);
        this.mProgress.setArrowScale(1.0f);
        imageView.setAlpha(1.0f);
        imageView.setVisibility(0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onMoving(boolean z, float f, int i, int i2, int i3) {
        if (this.mShowBezierWave) {
            this.mHeadHeight = Math.min(i, i2);
            this.mWaveHeight = Math.max(0, i - i2);
            postInvalidate();
        }
        if (z || !(this.mProgress.isRunning() || this.mFinished)) {
            ImageView imageView = this.mCircleView;
            if (this.mState != RefreshState.Refreshing) {
                float f2 = i2;
                float f3 = (i * 1.0f) / f2;
                float fMax = (((float) Math.max(((double) Math.min(1.0f, Math.abs(f3))) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
                double dMax = Math.max(0.0f, Math.min(Math.abs(i) - i2, f2 * 2.0f) / f2) / 4.0f;
                float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
                this.mProgress.showArrow(true);
                this.mProgress.setStartEndTrim(0.0f, Math.min(0.8f, fMax * 0.8f));
                this.mProgress.setArrowScale(Math.min(1.0f, fMax));
                this.mProgress.setProgressRotation((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
                imageView.setAlpha(Math.min(1.0f, f3 * 2.0f));
            }
            imageView.setTranslationY(Math.min(i, (i / 2) + (this.mCircleDiameter / 2)));
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onReleased(@NonNull RefreshLayout refreshLayout, int i, int i2) {
        this.mProgress.start();
        ImageView imageView = this.mCircleView;
        int i3 = i / 2;
        if (((int) imageView.getTranslationY()) != (this.mCircleDiameter / 2) + i3) {
            imageView.animate().translationY(i3 + (this.mCircleDiameter / 2));
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        ImageView imageView = this.mCircleView;
        this.mState = refreshState2;
        if (AnonymousClass1.$SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[refreshState2.ordinal()] != 2) {
            return;
        }
        this.mFinished = false;
        imageView.setVisibility(0);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

    public MaterialHeader setColorSchemeColors(int... iArr) {
        this.mProgress.setColorSchemeColors(iArr);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 0) {
            this.mBezierPaint.setColor(iArr[0]);
        }
    }

    public MaterialHeader setShowBezierWave(boolean z) {
        this.mShowBezierWave = z;
        return this;
    }

    public MaterialHeader setSize(int i) {
        if (i != 0 && i != 1) {
            return this;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
        } else {
            this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        }
        this.mCircleView.setImageDrawable(null);
        this.mProgress.updateSizes(i);
        this.mCircleView.setImageDrawable(this.mProgress);
        return this;
    }

    public MaterialHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mShowBezierWave = false;
        this.mSpinnerStyle = SpinnerStyle.MatchLayout;
        setMinimumHeight(SizeUtils.INSTANCE.dp2px(100.0f));
        MaterialProgressDrawable materialProgressDrawable = new MaterialProgressDrawable(this);
        this.mProgress = materialProgressDrawable;
        materialProgressDrawable.setBackgroundColor(-328966);
        materialProgressDrawable.setAlpha(255);
        materialProgressDrawable.setColorSchemeColors(Color.parseColor("#ffff7a59"));
        CircleImageView circleImageView = new CircleImageView(context, -328966);
        this.mCircleView = circleImageView;
        circleImageView.setImageDrawable(materialProgressDrawable);
        addView(circleImageView);
        this.mCircleDiameter = (int) (getResources().getDisplayMetrics().density * 40.0f);
        this.mBezierPath = new Path();
        Paint paint = new Paint();
        this.mBezierPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialHeader);
        this.mShowBezierWave = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialHeader_mhShowBezierWave, this.mShowBezierWave);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.MaterialHeader_mhPrimaryColor, -15614977));
        int i2 = R.styleable.MaterialHeader_mhShadowRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            paint.setShadowLayer(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i2, 0), 0.0f, 0.0f, typedArrayObtainStyledAttributes.getColor(R.styleable.MaterialHeader_mhShadowColor, -16777216));
            setLayerType(1, null);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

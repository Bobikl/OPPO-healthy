package com.heytap.health.sleep.day.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.sleep.R$color;
import com.heytap.health.sleep.R$dimen;
import com.heytap.health.sleep.day.view.SleepScoreProgressView;
import com.oplus.aiunit.vision.lo9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001MB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bE\u0010FB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bE\u0010IB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010H\u001a\u0004\u0018\u00010G\u0012\u0006\u0010J\u001a\u00020\u0010¢\u0006\u0004\bE\u0010KJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0015J&\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aR\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010$R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010,R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010,R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00103R\u0016\u0010:\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010,R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u0010,R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010,R\"\u0010=\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00101R\u0016\u0010D\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00101¨\u0006N"}, d2 = {"Lcom/heytap/health/sleep/day/view/SleepScoreProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "", "initView", "", "circleNum", "", "getAniDuration", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "", "str", "Landroid/graphics/Rect;", "rect", "", "getTextHeight", "Landroid/graphics/Canvas;", "canvas", "onDraw", "maxProgress", "progress", "subTitleStr", "noCurDataTip", "setData", "", "startAni", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "medium", "Landroid/graphics/Typeface;", "Landroid/view/animation/PathInterpolator;", "pathInterpolator", "Landroid/view/animation/PathInterpolator;", "mPaintBg", "Landroid/graphics/Paint;", "mProgressPaint", "mShadowProgressPaint", "mTextPaint", "mTextSubPaint", "textRect", "Landroid/graphics/Rect;", "strokeWidth", UserInfo.SEX_FEMALE, "mTextSize", "mTextNoDataSize", "mSubTextSize", "mMaxProgress", "I", "mProgress", "Ljava/lang/String;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "textYOffset", "textTop", "textSubPadding", "sweepAngle", "shadowPaddingAngle", "shadowOffsetRadius", "fill", "Z", "getFill", "()Z", "setFill", "(Z)V", "gradientTopColor", "gradientBottomColor", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepScoreProgressView extends View {
    private static final float CIRCLE_DEGREE = 360.0f;

    @NotNull
    private static final String TAG = "StepProgressView";
    private boolean fill;
    private int gradientBottomColor;
    private int gradientTopColor;
    private int mMaxProgress;

    @NotNull
    private Paint mPaintBg;
    private int mProgress;

    @NotNull
    private Paint mProgressPaint;

    @NotNull
    private Paint mShadowProgressPaint;
    private float mSubTextSize;
    private float mTextNoDataSize;

    @NotNull
    private Paint mTextPaint;
    private float mTextSize;

    @NotNull
    private Paint mTextSubPaint;
    private final Typeface medium;

    @NotNull
    private String noCurDataTip;

    @NotNull
    private final PathInterpolator pathInterpolator;

    @NotNull
    private final RectF rectF;
    private float shadowOffsetRadius;
    private final float shadowPaddingAngle;
    private float strokeWidth;

    @NotNull
    private String subTitleStr;
    private float sweepAngle;

    @NotNull
    private Rect textRect;
    private float textSubPadding;
    private float textTop;
    private float textYOffset;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepScoreProgressView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.medium = Typeface.create("sans-serif-medium", 0);
        this.pathInterpolator = new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        this.mPaintBg = new Paint();
        this.mProgressPaint = new Paint();
        this.mShadowProgressPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mTextSubPaint = new Paint();
        this.textRect = new Rect();
        this.mMaxProgress = 100;
        this.noCurDataTip = "";
        this.rectF = new RectF();
        this.subTitleStr = "";
        this.shadowPaddingAngle = 3.0f;
        this.shadowOffsetRadius = 2.0f;
        this.fill = true;
        initView(context);
    }

    private final long getAniDuration(float circleNum) {
        long j2;
        double d = circleNum;
        boolean z = false;
        if (0.0d <= d && d <= 1.0d) {
            z = true;
        }
        if (z) {
            j2 = 600;
        } else {
            j2 = d > 1.0d ? (long) (600.0f * circleNum) : 0L;
        }
        if (j2 > 3000) {
            j2 = 3000;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getTimeDuration duration is ");
        sb.append(j2);
        sb.append(" ,circleNum:");
        sb.append(circleNum);
        return j2;
    }

    private final int getTextHeight(Paint paint, String str, Rect rect) {
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    private final void initView(Context context) {
        this.strokeWidth = getResources().getDimension(R$dimen.health_sleep_progress_circle_stroke_width);
        this.shadowOffsetRadius = getResources().getDimension(R$dimen.health_sleep_progress_shadow_offset_radius);
        this.mTextSize = getResources().getDimension(R$dimen.health_sleep_progress_text_size);
        this.mTextNoDataSize = getResources().getDimension(R$dimen.health_sleep_progress_no_data_text_size);
        this.mSubTextSize = getResources().getDimension(R$dimen.health_sleep_progress_sub_text_size);
        this.textYOffset = getResources().getDimension(R$dimen.health_sleep_progress_text_y_offset);
        this.textTop = getResources().getDimension(R$dimen.health_sleep_progress_sub_text_top);
        this.textSubPadding = getResources().getDimension(R$dimen.health_sleep_progress_sub_text_padding);
        this.mPaintBg.setAntiAlias(true);
        this.mPaintBg.setStrokeCap(Paint.Cap.ROUND);
        this.mPaintBg.setColor(ContextCompat.getColor(context, R$color.health_sleep_progress_circle_bg));
        this.mPaintBg.setStrokeWidth(this.strokeWidth);
        this.mPaintBg.setTextAlign(Paint.Align.CENTER);
        this.mPaintBg.setStyle(Paint.Style.STROKE);
        this.mProgressPaint.setAntiAlias(true);
        this.mProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mProgressPaint.setColor(ContextCompat.getColor(context, R$color.health_sleep_7366FF));
        this.mProgressPaint.setStrokeWidth(this.strokeWidth);
        this.mProgressPaint.setStyle(Paint.Style.STROKE);
        this.mShadowProgressPaint.setAntiAlias(true);
        this.mShadowProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mShadowProgressPaint.setColor(ContextCompat.getColor(context, com.heytap.health.base.R$color.lib_base_card_white_bg_3));
        this.mShadowProgressPaint.setStrokeWidth(this.strokeWidth);
        this.mShadowProgressPaint.setStyle(Paint.Style.STROKE);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setColor(ContextCompat.getColor(context, com.heytap.health.health_base.R$color.health_base_black));
        this.mTextPaint.setStrokeWidth(2.0f);
        this.mTextPaint.setTextSize(this.mTextSize);
        this.mTextPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setTypeface(this.medium);
        this.mTextSubPaint.setAntiAlias(true);
        this.mTextSubPaint.setColor(ContextCompat.getColor(context, com.heytap.health.health_base.R$color.health_base_black_55alpha));
        this.mTextSubPaint.setStrokeWidth(2.0f);
        this.mTextSubPaint.setTextSize(this.mSubTextSize);
        this.mTextSubPaint.setStyle(Paint.Style.FILL);
        this.mTextSubPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextSubPaint.setTypeface(Typeface.DEFAULT);
        this.gradientTopColor = ContextCompat.getColor(context, R$color.health_sleep_color_b462f4);
        this.gradientBottomColor = ContextCompat.getColor(context, R$color.health_sleep_color_7366ff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAni$lambda$0(SleepScoreProgressView this$0, ValueAnimator valueAnimator, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.sweepAngle = (((Float) animatedValue).floatValue() * 360.0f) / this$0.mMaxProgress;
        this$0.invalidate();
    }

    public final boolean getFill() {
        return this.fill;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = 2;
        float width = (getWidth() / 2.0f) - (this.strokeWidth / f);
        float width2 = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawCircle(width2, height, width, this.mPaintBg);
        if (this.mProgress <= 0 || this.mMaxProgress <= 0) {
            String str = this.noCurDataTip;
            this.mTextPaint.setTextSize(this.mTextNoDataSize);
            canvas.drawText(str, width2, height + (getTextHeight(this.mTextPaint, str, this.textRect) / 2), this.mTextPaint);
            return;
        }
        SweepGradient sweepGradient = new SweepGradient(width2, height, new int[]{this.gradientTopColor, this.gradientBottomColor}, (float[]) null);
        Matrix matrix = new Matrix();
        matrix.setRotate(-95.0f, width2, height);
        sweepGradient.setLocalMatrix(matrix);
        this.mProgressPaint.setShader(sweepGradient);
        RectF rectF = this.rectF;
        float f2 = this.strokeWidth;
        rectF.set(f2 / 2.0f, f2 / 2.0f, getWidth() - (this.strokeWidth / 2.0f), getWidth() - (this.strokeWidth / 2.0f));
        float f3 = this.sweepAngle;
        if (f3 <= 348.0f) {
            RectF rectF2 = this.rectF;
            float f4 = this.shadowPaddingAngle;
            canvas.drawArc(rectF2, (-90.0f) - f4, (f4 * f) + f3, false, this.mShadowProgressPaint);
            canvas.drawArc(this.rectF, -90.0f, this.sweepAngle, false, this.mProgressPaint);
        } else if (f3 < 360.0f) {
            RectF rectF3 = this.rectF;
            float f5 = this.shadowPaddingAngle;
            canvas.drawArc(rectF3, (-90.0f) - f5, f5, false, this.mShadowProgressPaint);
            canvas.drawArc(this.rectF, -90.0f, 90.0f, false, this.mProgressPaint);
            canvas.drawArc(this.rectF, this.sweepAngle - 90.0f, this.shadowPaddingAngle, false, this.mShadowProgressPaint);
            canvas.drawArc(this.rectF, 0.0f, this.sweepAngle - 90.0f, false, this.mProgressPaint);
        } else {
            float f6 = f3 - (((int) (f3 / 360)) * 360);
            canvas.drawArc(this.rectF, -90.0f, 360.0f, false, this.mProgressPaint);
            if (!this.fill) {
                float f7 = f6 - 90.0f;
                canvas.drawArc(this.rectF, f7, this.shadowPaddingAngle, false, this.mShadowProgressPaint);
                RectF rectF4 = this.rectF;
                float f8 = this.shadowPaddingAngle;
                float f9 = this.shadowOffsetRadius;
                canvas.drawArc(rectF4, (f7 - f8) - f9, f8 + f9, false, this.mProgressPaint);
            }
        }
        String strValueOf = String.valueOf(this.mProgress);
        this.mTextPaint.setTextSize(this.mTextSize);
        int textHeight = getTextHeight(this.mTextPaint, strValueOf, this.textRect);
        int iWidth = this.textRect.width() / 2;
        float f10 = (height + (textHeight / 2)) - this.textYOffset;
        Rect rect = this.textRect;
        float f11 = iWidth;
        this.mTextPaint.setShader(new LinearGradient(width2 - f11, f10 + rect.bottom, width2 + f11, f10 + rect.top, this.gradientTopColor, this.gradientBottomColor, Shader.TileMode.CLAMP));
        canvas.drawText(strValueOf, width2, f10, this.mTextPaint);
        canvas.drawText(this.subTitleStr, width2, f10 + getTextHeight(this.mTextSubPaint, this.subTitleStr, this.textRect) + this.textTop, this.mTextSubPaint);
    }

    public final void setData(int maxProgress, int progress, @NotNull String subTitleStr, @NotNull String noCurDataTip) {
        Intrinsics.checkNotNullParameter(subTitleStr, "subTitleStr");
        Intrinsics.checkNotNullParameter(noCurDataTip, "noCurDataTip");
        this.mMaxProgress = maxProgress;
        this.mProgress = progress;
        this.subTitleStr = subTitleStr;
        this.noCurDataTip = noCurDataTip;
        this.sweepAngle = (progress * 360.0f) / maxProgress;
        invalidate();
    }

    public final void setFill(boolean z) {
        this.fill = z;
    }

    public final void startAni(boolean startAni) {
        int i;
        int i2 = this.mProgress;
        if (i2 <= 0 || (i = this.mMaxProgress) <= 0) {
            invalidate();
            return;
        }
        if (!startAni) {
            this.sweepAngle = (i2 * 360.0f) / i;
            invalidate();
            return;
        }
        float f = i2 / i;
        if (f > 3.0f) {
            f = (f % 1) + 2.0f;
        }
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, i2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.enh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SleepScoreProgressView.startAni$lambda$0(this.i, valueAnimatorOfFloat, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(getAniDuration(f));
        valueAnimatorOfFloat.setInterpolator(this.pathInterpolator);
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepScoreProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.medium = Typeface.create("sans-serif-medium", 0);
        this.pathInterpolator = new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        this.mPaintBg = new Paint();
        this.mProgressPaint = new Paint();
        this.mShadowProgressPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mTextSubPaint = new Paint();
        this.textRect = new Rect();
        this.mMaxProgress = 100;
        this.noCurDataTip = "";
        this.rectF = new RectF();
        this.subTitleStr = "";
        this.shadowPaddingAngle = 3.0f;
        this.shadowOffsetRadius = 2.0f;
        this.fill = true;
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepScoreProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.medium = Typeface.create("sans-serif-medium", 0);
        this.pathInterpolator = new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        this.mPaintBg = new Paint();
        this.mProgressPaint = new Paint();
        this.mShadowProgressPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mTextSubPaint = new Paint();
        this.textRect = new Rect();
        this.mMaxProgress = 100;
        this.noCurDataTip = "";
        this.rectF = new RectF();
        this.subTitleStr = "";
        this.shadowPaddingAngle = 3.0f;
        this.shadowOffsetRadius = 2.0f;
        this.fill = true;
        initView(context);
    }
}

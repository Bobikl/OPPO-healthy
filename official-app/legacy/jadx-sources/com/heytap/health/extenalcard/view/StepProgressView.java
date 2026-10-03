package com.heytap.health.extenalcard.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.Keep;
import androidx.core.content.ContextCompat;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.extenalcard.R$color;
import com.heytap.health.extenalcard.R$dimen;
import com.heytap.health.extenalcard.view.StepProgressView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001HB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b@\u0010AB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\b@\u0010DB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\u0006\u0010E\u001a\u00020\r¢\u0006\u0004\b@\u0010FJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0014J.\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015R\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010$\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\"\u0010-\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010)R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010)R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010)R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00106R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00106R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010)R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010)R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010)¨\u0006I"}, d2 = {"Lcom/heytap/health/extenalcard/view/StepProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "", "initView", "", "circleNum", "", "getAniDuration", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "maxProgress", "progress", "", "consumeKcalStr", "distanceStr", "noCurDataTip", "setData", "", "startAni", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "medium", "Landroid/graphics/Typeface;", "Landroid/view/animation/PathInterpolator;", "pathInterpolator", "Landroid/view/animation/PathInterpolator;", "Landroid/graphics/Paint;", "mPaintBg", "Landroid/graphics/Paint;", "mProgressPaint", "mShadowProgressPaint", "mTextPaint", "mTextSubPaint", "Landroid/graphics/Rect;", "textRect", "Landroid/graphics/Rect;", "strokeWidth", UserInfo.SEX_FEMALE, "mTextSize", "mTextNoDataSize", "mSubTextSize", "mMaxProgress", "I", "getMMaxProgress", "()I", "setMMaxProgress", "(I)V", "mProgress", "getMProgress", "setMProgress", "Ljava/lang/String;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "textYOffset", "textTop", "textSubPadding", "sweepAngle", "shadowPaddingAngle", "shadowOffsetRadius", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "extenalcard_release"}, k = 1, mv = {1, 8, 0})
public final class StepProgressView extends View {
    private static final float CIRCLE_DEGREE = 360.0f;

    @NotNull
    private static final String TAG = "StepProgressView";

    @NotNull
    private String consumeKcalStr;

    @NotNull
    private String distanceStr;
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
    private float sweepAngle;

    @NotNull
    private Rect textRect;
    private float textSubPadding;
    private float textTop;
    private float textYOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepProgressView(@NotNull Context context) {
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
        this.mMaxProgress = 10000;
        this.noCurDataTip = "";
        this.rectF = new RectF();
        this.consumeKcalStr = "";
        this.distanceStr = "";
        this.shadowPaddingAngle = 1.0f;
        this.shadowOffsetRadius = 2.0f;
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

    private final void initView(Context context) {
        this.strokeWidth = getResources().getDimension(R$dimen.health_qt_step_progress_circle_stroke_width);
        this.shadowOffsetRadius = getResources().getDimension(R$dimen.health_qt_step_progress_shadow_offset_radius);
        this.mTextSize = getResources().getDimension(R$dimen.health_qt_step_progress_text_size);
        this.mTextNoDataSize = getResources().getDimension(R$dimen.health_qt_step_progress_no_data_text_size);
        this.mSubTextSize = getResources().getDimension(R$dimen.health_qt_step_progress_sub_text_size);
        this.textYOffset = getResources().getDimension(R$dimen.health_qt_step_progress_text_y_offset);
        this.textTop = getResources().getDimension(R$dimen.health_qt_step_progress_sub_text_top);
        this.textSubPadding = getResources().getDimension(R$dimen.health_qt_step_progress_sub_text_padding);
        this.mPaintBg.setAntiAlias(true);
        this.mPaintBg.setStrokeCap(Paint.Cap.ROUND);
        this.mPaintBg.setColor(ContextCompat.getColor(context, R$color.health_qt_step_progress_circle_bg));
        this.mPaintBg.setStrokeWidth(this.strokeWidth);
        this.mPaintBg.setTextAlign(Paint.Align.CENTER);
        this.mPaintBg.setStyle(Paint.Style.STROKE);
        this.mProgressPaint.setAntiAlias(true);
        this.mProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mProgressPaint.setColor(ContextCompat.getColor(context, R$color.health_qt_step_progress_circle_progress));
        this.mProgressPaint.setStrokeWidth(this.strokeWidth);
        this.mProgressPaint.setStyle(Paint.Style.STROKE);
        this.mShadowProgressPaint.setAntiAlias(true);
        this.mShadowProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mShadowProgressPaint.setColor(ContextCompat.getColor(context, R$color.health_qt_view_bg));
        this.mShadowProgressPaint.setStrokeWidth(this.strokeWidth + this.shadowOffsetRadius);
        this.mShadowProgressPaint.setStyle(Paint.Style.STROKE);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setColor(ContextCompat.getColor(context, R$color.health_qt_black));
        this.mTextPaint.setStrokeWidth(2.0f);
        this.mTextPaint.setTextSize(this.mTextSize);
        this.mTextPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setTypeface(this.medium);
        this.mTextSubPaint.setAntiAlias(true);
        this.mTextSubPaint.setColor(ContextCompat.getColor(context, R$color.health_qt_black_55alpha));
        this.mTextSubPaint.setStrokeWidth(2.0f);
        this.mTextSubPaint.setTextSize(this.mSubTextSize);
        this.mTextSubPaint.setStyle(Paint.Style.FILL);
        this.mTextSubPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextSubPaint.setTypeface(Typeface.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAni$lambda$0(StepProgressView this$0, ValueAnimator valueAnimator, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.sweepAngle = (((Float) animatedValue).floatValue() * 360.0f) / this$0.mMaxProgress;
        this$0.invalidate();
    }

    public final int getMMaxProgress() {
        return this.mMaxProgress;
    }

    public final int getMProgress() {
        return this.mProgress;
    }

    @Override // android.view.View
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
            canvas.drawText(str, width2, height + (ViewExtendKt.getTextHeight(this.mTextPaint, str, this.textRect) / 2), this.mTextPaint);
            return;
        }
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
            canvas.drawArc(this.rectF, -90.0f, 360.0f, false, this.mProgressPaint);
            float f6 = (f3 - (((int) (f3 / 360)) * 360)) - 90.0f;
            canvas.drawArc(this.rectF, f6, this.shadowPaddingAngle, false, this.mShadowProgressPaint);
            RectF rectF4 = this.rectF;
            float f7 = this.shadowPaddingAngle;
            float f8 = this.shadowOffsetRadius;
            canvas.drawArc(rectF4, (f6 - f7) - f8, f7 + f8, false, this.mProgressPaint);
        }
        String strValueOf = String.valueOf(this.mProgress);
        this.mTextPaint.setTextSize(this.mTextSize);
        float textHeight = (height + (ViewExtendKt.getTextHeight(this.mTextPaint, strValueOf, this.textRect) / 2)) - this.textYOffset;
        canvas.drawText(strValueOf, width2, textHeight, this.mTextPaint);
        float textHeight2 = textHeight + ViewExtendKt.getTextHeight(this.mTextSubPaint, this.consumeKcalStr, this.textRect) + this.textTop;
        canvas.drawText(this.consumeKcalStr, width2, textHeight2, this.mTextSubPaint);
        canvas.drawText(this.distanceStr, width2, textHeight2 + ViewExtendKt.getTextHeight(this.mTextSubPaint, this.distanceStr, this.textRect) + this.textSubPadding, this.mTextSubPaint);
    }

    public final void setData(int maxProgress, int progress, @NotNull String consumeKcalStr, @NotNull String distanceStr, @NotNull String noCurDataTip) {
        Intrinsics.checkNotNullParameter(consumeKcalStr, "consumeKcalStr");
        Intrinsics.checkNotNullParameter(distanceStr, "distanceStr");
        Intrinsics.checkNotNullParameter(noCurDataTip, "noCurDataTip");
        this.mMaxProgress = maxProgress;
        this.mProgress = progress;
        this.consumeKcalStr = consumeKcalStr;
        this.distanceStr = distanceStr;
        this.noCurDataTip = noCurDataTip;
        this.sweepAngle = (progress * 360.0f) / maxProgress;
        invalidate();
    }

    public final void setMMaxProgress(int i) {
        this.mMaxProgress = i;
    }

    public final void setMProgress(int i) {
        this.mProgress = i;
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
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.lsi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StepProgressView.startAni$lambda$0(this.i, valueAnimatorOfFloat, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(getAniDuration(f));
        valueAnimatorOfFloat.setInterpolator(this.pathInterpolator);
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        this.mMaxProgress = 10000;
        this.noCurDataTip = "";
        this.rectF = new RectF();
        this.consumeKcalStr = "";
        this.distanceStr = "";
        this.shadowPaddingAngle = 1.0f;
        this.shadowOffsetRadius = 2.0f;
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
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
        this.mMaxProgress = 10000;
        this.noCurDataTip = "";
        this.rectF = new RectF();
        this.consumeKcalStr = "";
        this.distanceStr = "";
        this.shadowPaddingAngle = 1.0f;
        this.shadowOffsetRadius = 2.0f;
        initView(context);
    }
}

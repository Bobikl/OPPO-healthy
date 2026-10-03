package com.heytap.health.extenalcard.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.Keep;
import androidx.core.content.ContextCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.extenalcard.R$color;
import com.heytap.health.extenalcard.R$dimen;
import com.heytap.health.extenalcard.view.ActProgressView;
import com.oplus.aiunit.vision.a7b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001=B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b5\u00109B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\b5\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J&\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015R\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010%R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010%R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010%R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006>"}, d2 = {"Lcom/heytap/health/extenalcard/view/ActProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "", "initView", "Landroid/graphics/Canvas;", "canvas", "", "strokeWidthHalf", "generateShadow", "circleNum", "", "getAniDuration", "onDraw", "", "maxProgress", "curProgress", "bgColor", "progressColor", "setData", "", "startAni", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "medium", "Landroid/graphics/Typeface;", "Landroid/view/animation/PathInterpolator;", "pathInterpolator", "Landroid/view/animation/PathInterpolator;", "Landroid/graphics/Paint;", "mPaintBg", "Landroid/graphics/Paint;", "mProgressPaint", "mTextPaint", "mShadowProgressPaint", "strokeWidth", UserInfo.SEX_FEMALE, "I", "mMaxProgress", "mCurProgress", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "Landroid/graphics/Rect;", "textRect", "Landroid/graphics/Rect;", "textYOffset", "sweepAngle", "shadowCircleRadius", "Landroid/graphics/Path;", "shadowCirclePath", "Landroid/graphics/Path;", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "extenalcard_release"}, k = 1, mv = {1, 8, 0})
public final class ActProgressView extends View {
    private static final float CIRCLE_DEGREE = 360.0f;
    private int bgColor;
    private int mCurProgress;
    private int mMaxProgress;

    @NotNull
    private Paint mPaintBg;

    @NotNull
    private Paint mProgressPaint;

    @NotNull
    private Paint mShadowProgressPaint;

    @NotNull
    private Paint mTextPaint;
    private final Typeface medium;

    @NotNull
    private final PathInterpolator pathInterpolator;
    private int progressColor;

    @NotNull
    private final RectF rectF;

    @NotNull
    private final Path shadowCirclePath;
    private float shadowCircleRadius;
    private float strokeWidth;
    private float sweepAngle;

    @NotNull
    private Rect textRect;
    private float textYOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActProgressView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.medium = Typeface.create("sans-serif-medium", 0);
        this.pathInterpolator = new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        this.mPaintBg = new Paint();
        this.mProgressPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mShadowProgressPaint = new Paint();
        this.mMaxProgress = 10000;
        this.rectF = new RectF();
        this.textRect = new Rect();
        this.shadowCircleRadius = 20.0f;
        this.shadowCirclePath = new Path();
        initView(context);
    }

    private final void generateShadow(Canvas canvas, float strokeWidthHalf) {
        float f = this.sweepAngle - 90.0f;
        double d = (((double) f) * 3.141592653589793d) / ((double) 180.0f);
        float f2 = 2;
        float fCenterY = this.rectF.centerY() + ((this.rectF.height() * ((float) Math.sin(d))) / f2);
        float fCenterX = this.rectF.centerX() + ((this.rectF.width() * ((float) Math.cos(d))) / f2);
        if (canvas != null) {
            canvas.save();
        }
        RectF rectF = new RectF();
        if (canvas != null) {
            canvas.drawArc(rectF, -90.0f, this.sweepAngle, false, this.mShadowProgressPaint);
        }
        this.shadowCirclePath.reset();
        this.shadowCirclePath.addCircle(this.rectF.centerX(), this.rectF.centerY(), (this.rectF.height() / f2) - strokeWidthHalf, Path.Direction.CW);
        if (canvas != null) {
            canvas.clipPath(this.shadowCirclePath, Region.Op.DIFFERENCE);
        }
        this.shadowCirclePath.reset();
        this.shadowCirclePath.addCircle(this.rectF.centerX(), this.rectF.centerY(), (this.rectF.height() / f2) + strokeWidthHalf, Path.Direction.CW);
        if (canvas != null) {
            canvas.clipPath(this.shadowCirclePath, Region.Op.INTERSECT);
        }
        this.shadowCirclePath.reset();
        float f3 = f2 * strokeWidthHalf;
        rectF.top = fCenterY - f3;
        rectF.left = fCenterX - f3;
        rectF.bottom = fCenterY + f3;
        rectF.right = f3 + fCenterX;
        this.shadowCirclePath.reset();
        this.shadowCirclePath.addArc(rectF, f - 180, 180.0f);
        if (canvas != null) {
            canvas.clipPath(this.shadowCirclePath, Region.Op.DIFFERENCE);
        }
        if (canvas != null) {
            canvas.drawCircle(fCenterX, fCenterY, strokeWidthHalf, this.mShadowProgressPaint);
        }
        if (canvas != null) {
            canvas.restore();
        }
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
        float dimension = getResources().getDimension(R$dimen.health_qt_act_progress_circle_stroke_width);
        this.strokeWidth = dimension;
        this.shadowCircleRadius = dimension / 2;
        this.bgColor = ContextCompat.getColor(context, R$color.health_qt_step_circle_bg);
        this.progressColor = ContextCompat.getColor(context, R$color.health_qt_step_circle_progress);
        this.textYOffset = getResources().getDimension(R$dimen.health_qt_act_progress_text_y_offset);
        this.mPaintBg.setAntiAlias(true);
        this.mPaintBg.setStrokeCap(Paint.Cap.ROUND);
        this.mPaintBg.setColor(this.bgColor);
        this.mPaintBg.setStrokeWidth(this.strokeWidth);
        this.mPaintBg.setTextAlign(Paint.Align.CENTER);
        this.mPaintBg.setStyle(Paint.Style.STROKE);
        this.mProgressPaint.setAntiAlias(true);
        this.mProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mProgressPaint.setColor(this.progressColor);
        this.mProgressPaint.setStrokeWidth(this.strokeWidth);
        this.mProgressPaint.setStyle(Paint.Style.STROKE);
        this.mShadowProgressPaint.setAntiAlias(true);
        this.mShadowProgressPaint.setColor(ContextCompat.getColor(context, R$color.health_qt_black_50alpha));
        this.mShadowProgressPaint.setStrokeWidth(this.strokeWidth);
        this.mShadowProgressPaint.setStyle(Paint.Style.FILL);
        this.mShadowProgressPaint.setFlags(1);
        this.mShadowProgressPaint.setMaskFilter(new BlurMaskFilter(this.shadowCircleRadius, BlurMaskFilter.Blur.OUTER));
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setColor(ContextCompat.getColor(context, R$color.health_qt_black));
        this.mTextPaint.setTextSize(getResources().getDimension(R$dimen.health_qt_act_progress_text_size));
        this.mTextPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setTypeface(this.medium);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAni$lambda$0(ActProgressView this$0, ValueAnimator valueAnimator, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.sweepAngle = (((Float) animatedValue).floatValue() * 360.0f) / this$0.mMaxProgress;
        this$0.invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.mPaintBg.setColor(this.bgColor);
        this.mProgressPaint.setColor(this.progressColor);
        float f = this.strokeWidth / 2;
        float width = (getWidth() / 2.0f) - f;
        float width2 = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawCircle(width2, height, width, this.mPaintBg);
        if (this.mCurProgress > 0 && this.mMaxProgress > 0) {
            RectF rectF = this.rectF;
            float f2 = this.strokeWidth;
            rectF.set(f2 / 2.0f, f2 / 2.0f, getWidth() - (this.strokeWidth / 2.0f), getWidth() - (this.strokeWidth / 2.0f));
            canvas.drawArc(this.rectF, -90.0f, this.sweepAngle, false, this.mProgressPaint);
            if (this.sweepAngle >= 342.0f) {
                generateShadow(canvas, f);
                float f3 = this.sweepAngle;
                if (f3 > 360.0f) {
                    canvas.drawArc(this.rectF, AMapEngineUtils.MIN_LONGITUDE_DEGREE + (f3 - (((int) (f3 / 360)) * 360)), 90.0f, false, this.mProgressPaint);
                } else {
                    canvas.drawArc(this.rectF, -180.0f, 70.0f + (f3 - (((int) (f3 / 340)) * 340)), false, this.mProgressPaint);
                }
            }
        }
        canvas.drawText(String.valueOf(this.mCurProgress), width2, height + (ViewExtendKt.getTextHeight(this.mTextPaint, String.valueOf(this.mCurProgress), this.textRect) / 2) + this.textYOffset, this.mTextPaint);
    }

    public final void setData(int maxProgress, int curProgress, int bgColor, int progressColor) {
        this.mMaxProgress = maxProgress;
        this.mCurProgress = curProgress;
        this.bgColor = bgColor;
        this.progressColor = progressColor;
        float f = (curProgress * 360.0f) / maxProgress;
        this.sweepAngle = f;
        a7b.f("ActProgressView", "onDraw maxProgress:" + maxProgress + " ,progress:" + curProgress + " ,sweepAngle:" + f);
        invalidate();
    }

    public final void startAni(boolean startAni) {
        int i;
        int i2 = this.mCurProgress;
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
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.bo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ActProgressView.startAni$lambda$0(this.i, valueAnimatorOfFloat, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(getAniDuration(f));
        valueAnimatorOfFloat.setInterpolator(this.pathInterpolator);
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.medium = Typeface.create("sans-serif-medium", 0);
        this.pathInterpolator = new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        this.mPaintBg = new Paint();
        this.mProgressPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mShadowProgressPaint = new Paint();
        this.mMaxProgress = 10000;
        this.rectF = new RectF();
        this.textRect = new Rect();
        this.shadowCircleRadius = 20.0f;
        this.shadowCirclePath = new Path();
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.medium = Typeface.create("sans-serif-medium", 0);
        this.pathInterpolator = new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        this.mPaintBg = new Paint();
        this.mProgressPaint = new Paint();
        this.mTextPaint = new Paint();
        this.mShadowProgressPaint = new Paint();
        this.mMaxProgress = 10000;
        this.rectF = new RectF();
        this.textRect = new Rect();
        this.shadowCircleRadius = 20.0f;
        this.shadowCirclePath = new Path();
        initView(context);
    }
}

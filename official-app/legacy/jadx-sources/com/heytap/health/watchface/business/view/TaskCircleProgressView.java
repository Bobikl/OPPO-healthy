package com.heytap.health.watchface.business.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.watchface.R$styleable;
import com.heytap.health.watchface.business.view.TaskCircleProgressView;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.widget.banner.config.BannerConfig;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 N2\u00020\u0001:\u0001OB\u001b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bL\u0010MJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\fJ\u001c\u0010\u0016\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0002J\u0012\u0010\u0019\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010'R\u0018\u00102\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010-R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010-R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010-R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010-R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006P"}, d2 = {"Lcom/heytap/health/watchface/business/view/TaskCircleProgressView;", "Landroid/view/View;", "", "w", b2n.g, "oldw", "oldh", "", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "getValue", "value", "setValue", "targetProgress", "setProgressWithAnimation", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/Context;", "context", "c", "d", "f", "b", "Landroid/graphics/Point;", "i", "Landroid/graphics/Point;", "centerPosition", "j", "Ljava/lang/Float;", "raduis", "Landroid/graphics/RectF;", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/RectF;", "mRectF", "Landroid/graphics/Paint;", LogFieldKey.LEVEL_KEY, "Landroid/graphics/Paint;", "mBgCirPaint", LogFieldKey.MESSAGE_KEY, "Ljava/lang/Integer;", "mBgCirColor", "n", UserInfo.SEX_FEMALE, "mBgCirWidth", "o", "mCirPaint", LogFieldKey.PROCESS_NAME_KEY, "mCirColor", "q", "mCirWidth", "r", "mStartAngle", "s", "mSweepAngle", "t", "mValue", "u", "mMaxValue", "", "v", "Z", "isGradient", "", "[I", "mGradientColors", "Landroid/graphics/LinearGradient;", "x", "Landroid/graphics/LinearGradient;", "mLinearGradient", "Landroid/animation/ValueAnimator;", "y", "Landroid/animation/ValueAnimator;", "lastAnimator", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TaskCircleProgressView extends View {
    public static final long ANIMATE_DURATION = 500;

    @NotNull
    public static final String TAG = "TaskCircleProgress";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Point centerPosition;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Float raduis;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public RectF mRectF;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Paint mBgCirPaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Integer mBgCirColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float mBgCirWidth;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public Paint mCirPaint;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Integer mCirColor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float mCirWidth;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float mStartAngle;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public float mSweepAngle;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float mValue;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float mMaxValue;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isGradient;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public int[] mGradientColors;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public LinearGradient mLinearGradient;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator lastAnimator;

    public TaskCircleProgressView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBgCirWidth = 15.0f;
        this.mCirWidth = 15.0f;
        this.mStartAngle = 270.0f;
        this.mSweepAngle = 360.0f;
        this.mMaxValue = 100.0f;
        this.mGradientColors = new int[]{Color.parseColor("#08D73E"), Color.parseColor("#1BD7F1")};
        setLayerType(1, null);
        this.centerPosition = new Point();
        this.mRectF = new RectF();
        c(attributeSet, context);
        d();
    }

    public static final void e(TaskCircleProgressView this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.setValue(((Float) animatedValue).floatValue());
    }

    public final void b(Canvas canvas) {
        Paint paint;
        Paint paint2;
        if (canvas != null) {
            canvas.save();
        }
        if (canvas != null) {
            RectF rectF = this.mRectF;
            Intrinsics.checkNotNull(rectF);
            float f = this.mStartAngle;
            float f2 = this.mSweepAngle;
            Paint paint3 = this.mBgCirPaint;
            if (paint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBgCirPaint");
                paint2 = null;
            } else {
                paint2 = paint3;
            }
            canvas.drawArc(rectF, f, f2, false, paint2);
        }
        if (canvas != null) {
            RectF rectF2 = this.mRectF;
            Intrinsics.checkNotNull(rectF2);
            float f3 = this.mStartAngle;
            float f4 = this.mSweepAngle * (this.mValue / this.mMaxValue);
            Paint paint4 = this.mCirPaint;
            if (paint4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCirPaint");
                paint = null;
            } else {
                paint = paint4;
            }
            canvas.drawArc(rectF2, f3, f4, false, paint);
        }
        if (canvas != null) {
            canvas.restore();
        }
    }

    public final void c(AttributeSet attrs, Context context) {
        Intrinsics.checkNotNull(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.TaskCircleProgressView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context!!.obtainStyledAt…e.TaskCircleProgressView)");
        this.mBgCirColor = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.TaskCircleProgressView_bgCirColor, BannerConfig.INDICATOR_SELECTED_COLOR));
        this.mBgCirWidth = typedArrayObtainStyledAttributes.getDimension(R$styleable.TaskCircleProgressView_bgCirWidth, 15.0f);
        this.mCirColor = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.TaskCircleProgressView_cirColor, -256));
        this.mCirWidth = typedArrayObtainStyledAttributes.getDimension(R$styleable.TaskCircleProgressView_cirWidth, 15.0f);
        this.mStartAngle = typedArrayObtainStyledAttributes.getFloat(R$styleable.TaskCircleProgressView_startAngle, 270.0f);
        this.mSweepAngle = typedArrayObtainStyledAttributes.getFloat(R$styleable.TaskCircleProgressView_sweepAngle, 360.0f);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TaskCircleProgressView_isGradient, false);
        this.isGradient = z;
        if (z) {
            this.mGradientColors = new int[]{typedArrayObtainStyledAttributes.getColor(R$styleable.TaskCircleProgressView_startColor, -256), typedArrayObtainStyledAttributes.getColor(R$styleable.TaskCircleProgressView_endColor, -16711936)};
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d() {
        Paint paint = new Paint();
        this.mCirPaint = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.mCirPaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCirPaint");
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.mCirPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCirPaint");
            paint4 = null;
        }
        paint4.setStrokeWidth(this.mCirWidth);
        Paint paint5 = this.mCirPaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCirPaint");
            paint5 = null;
        }
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = this.mCirPaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCirPaint");
            paint6 = null;
        }
        Integer num = this.mCirColor;
        Intrinsics.checkNotNull(num);
        paint6.setColor(num.intValue());
        Paint paint7 = new Paint();
        this.mBgCirPaint = paint7;
        paint7.setAntiAlias(true);
        Paint paint8 = this.mBgCirPaint;
        if (paint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgCirPaint");
            paint8 = null;
        }
        paint8.setStyle(Paint.Style.STROKE);
        Paint paint9 = this.mBgCirPaint;
        if (paint9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgCirPaint");
            paint9 = null;
        }
        paint9.setStrokeWidth(this.mBgCirWidth);
        Paint paint10 = this.mBgCirPaint;
        if (paint10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgCirPaint");
            paint10 = null;
        }
        paint10.setStrokeCap(Paint.Cap.ROUND);
        Paint paint11 = this.mBgCirPaint;
        if (paint11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBgCirPaint");
        } else {
            paint3 = paint11;
        }
        Integer num2 = this.mBgCirColor;
        Intrinsics.checkNotNull(num2);
        paint3.setColor(num2.intValue());
    }

    public final void f() {
        float f = 2;
        this.mLinearGradient = new LinearGradient(0.0f, getHeight() / f, getWidth(), getHeight() / f, this.mGradientColors, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = this.mCirPaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCirPaint");
            paint = null;
        }
        paint.setShader(this.mLinearGradient);
    }

    /* JADX INFO: renamed from: getValue, reason: from getter */
    public final float getMValue() {
        return this.mValue;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        b(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Point point = this.centerPosition;
        point.x = w / 2;
        point.y = h / 2;
        float fMax = Math.max(this.mCirWidth, this.mBgCirWidth);
        float f = 2;
        float f2 = f * fMax;
        this.raduis = Float.valueOf(Math.min(((w - getPaddingLeft()) - getPaddingRight()) - f2, ((h - getPaddingBottom()) - getPaddingTop()) - f2) / f);
        RectF rectF = this.mRectF;
        Intrinsics.checkNotNull(rectF);
        float f3 = this.centerPosition.x;
        Float f4 = this.raduis;
        Intrinsics.checkNotNull(f4);
        float f5 = fMax / f;
        rectF.left = (f3 - f4.floatValue()) - f5;
        RectF rectF2 = this.mRectF;
        Intrinsics.checkNotNull(rectF2);
        float f6 = this.centerPosition.y;
        Float f7 = this.raduis;
        Intrinsics.checkNotNull(f7);
        rectF2.top = (f6 - f7.floatValue()) - f5;
        RectF rectF3 = this.mRectF;
        Intrinsics.checkNotNull(rectF3);
        float f8 = this.centerPosition.x;
        Float f9 = this.raduis;
        Intrinsics.checkNotNull(f9);
        rectF3.right = f8 + f9.floatValue() + f5;
        RectF rectF4 = this.mRectF;
        Intrinsics.checkNotNull(rectF4);
        float f10 = this.centerPosition.y;
        Float f11 = this.raduis;
        Intrinsics.checkNotNull(f11);
        rectF4.bottom = f10 + f11.floatValue() + f5;
        f();
    }

    public final void setProgressWithAnimation(float targetProgress) {
        ValueAnimator valueAnimator = this.lastAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float f = this.mValue;
        if (f == targetProgress) {
            return;
        }
        if (targetProgress <= f) {
            this.mValue = targetProgress;
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, targetProgress);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.ooj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TaskCircleProgressView.e(this.i, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.lastAnimator = valueAnimatorOfFloat;
    }

    public final void setValue(float value) {
        this.mValue = value;
        invalidate();
    }
}

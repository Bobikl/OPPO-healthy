package com.oplus.aiunit.vision;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.core.internal.view.SupportMenu;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.channel.client.data.Action;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bB\u0019\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0012\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0004H\u0014J\b\u0010\u001b\u001a\u00020\u0006H\u0002R\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(¨\u00061"}, d2 = {"Lcom/oplus/aiunit/vision/ob3;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Lcom/oplus/aiunit/vision/mb3;", "", "color", "", "a", "b", "", "strokeWidth", "setStrokeWidth", "start", Action.LIFE_CIRCLE_VALUE_STOP, "", "isRunning", "Landroid/graphics/Canvas;", "canvas", ParserTag.TAG_DRAW, "alpha", ClickApiEntity.SET_ALPHA, "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "level", "onLevelChange", "d", "i", "Z", "mIsIndeterminate", "Lcom/oplus/aiunit/vision/ob3$b;", "j", "Lcom/oplus/aiunit/vision/ob3$b;", "ring", "Landroid/animation/ValueAnimator;", MapSchema.FIELD_NAME_KEY, "Landroid/animation/ValueAnimator;", "progressAnimator", LogFieldKey.LEVEL_KEY, UserInfo.SEX_FEMALE, "currentStepProgress", LogFieldKey.MESSAGE_KEY, "sweepAngle", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Z)V", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class ob3 extends Drawable implements Animatable, mb3 {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean mIsIndeterminate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b ring = new b();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator progressAnimator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float currentStepProgress;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float sweepAngle;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0016\u0010 \u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/ob3$b;", "", "", Fields.WIDTH_FIELD, "", b2n.f, "(F)V", "", "color", MapSchema.FIELD_NAME_ENTRY, "(I)V", "d", "alpha", "c", "Landroid/graphics/ColorFilter;", "colorFilter", "f", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Canvas;", "canvas", "mHalfWidth", "mHalfHeight", "mCurrentStepProgress", "a", "(Landroid/graphics/Canvas;IIF)V", "mCurrentAngle", "b", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "progressPaint", "backgroundPaint", "I", "progressBarBgColor", "progressBarColor", UserInfo.SEX_FEMALE, "mStrokeWidth", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public Paint progressPaint = new Paint(1);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Paint backgroundPaint = new Paint(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int progressBarBgColor = -3355444;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int progressBarColor = SupportMenu.CATEGORY_MASK;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public float mStrokeWidth = 10.0f;

        public b() {
            this.progressPaint.setStyle(Paint.Style.STROKE);
            this.progressPaint.setColor(this.progressBarColor);
            this.progressPaint.setStrokeWidth(this.mStrokeWidth);
            this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
            this.backgroundPaint.setColor(this.progressBarBgColor);
            this.backgroundPaint.setStyle(Paint.Style.STROKE);
            this.backgroundPaint.setStrokeWidth(this.mStrokeWidth);
        }

        public final void a(@NotNull Canvas canvas, int mHalfWidth, int mHalfHeight, float mCurrentStepProgress) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            float f = mHalfWidth;
            float f2 = f - this.mStrokeWidth;
            float f3 = f - f2;
            float f4 = f + f2;
            RectF rectF = new RectF(f3, f3, f4, f4);
            canvas.drawCircle(f, f, f2, this.backgroundPaint);
            canvas.save();
            canvas.rotate(-90.0f, f, mHalfHeight);
            float f5 = 180;
            canvas.drawArc(rectF, mCurrentStepProgress - 30, 60 * (2 - Math.abs((f5 - mCurrentStepProgress) / f5)), false, this.progressPaint);
            canvas.restore();
        }

        public final void b(@NotNull Canvas canvas, int mHalfWidth, int mHalfHeight, float mCurrentAngle) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            float f = mHalfWidth;
            float f2 = f - this.mStrokeWidth;
            float f3 = f - f2;
            float f4 = f + f2;
            RectF rectF = new RectF(f3, f3, f4, f4);
            canvas.drawCircle(f, f, f2, this.backgroundPaint);
            canvas.save();
            canvas.rotate(-90.0f, f, mHalfHeight);
            canvas.drawArc(rectF, 0.0f, mCurrentAngle, false, this.progressPaint);
            canvas.restore();
        }

        public final void c(int alpha) {
            this.progressPaint.setAlpha(alpha);
        }

        public final void d(int color) {
            this.progressBarBgColor = color;
            this.backgroundPaint.setColor(color);
        }

        public final void e(int color) {
            this.progressBarColor = color;
            this.progressPaint.setColor(color);
        }

        public final void f(@Nullable ColorFilter colorFilter) {
            this.progressPaint.setColorFilter(colorFilter);
        }

        public final void g(float width) {
            this.mStrokeWidth = width;
            this.progressPaint.setStrokeWidth(width);
            this.backgroundPaint.setStrokeWidth(this.mStrokeWidth);
        }
    }

    public ob3(@Nullable Context context, boolean z) {
        this.mIsIndeterminate = z;
        context.getClass();
        if (z) {
            d();
        }
    }

    public static final void e(ob3 this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.currentStepProgress = (this$0.currentStepProgress + 6) % 360;
        this$0.invalidateSelf();
    }

    @Override // com.oplus.aiunit.vision.mb3
    public void a(int color) {
        this.ring.d(color);
        invalidateSelf();
    }

    @Override // com.oplus.aiunit.vision.mb3
    public void b(int color) {
        this.ring.e(color);
        invalidateSelf();
    }

    public final void d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.progressAnimator = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(480L);
        }
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator2 = this.progressAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.setRepeatCount(-1);
        }
        ValueAnimator valueAnimator3 = this.progressAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.setRepeatMode(1);
        }
        ValueAnimator valueAnimator4 = this.progressAnimator;
        if (valueAnimator4 == null) {
            return;
        }
        valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.nb3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                ob3.e(this.i, valueAnimator5);
            }
        });
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iWidth = getBounds().width() / 2;
        int iHeight = getBounds().height() / 2;
        if (this.mIsIndeterminate) {
            this.ring.a(canvas, iWidth, iHeight, this.currentStepProgress);
        } else {
            this.ring.b(canvas, iWidth, iHeight, this.sweepAngle);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator == null) {
            return false;
        }
        return valueAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        if (this.mIsIndeterminate) {
            return super.onLevelChange(level);
        }
        this.sweepAngle = (level * 360.0f) / 10000.0f;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.ring.c(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.ring.f(colorFilter);
        invalidateSelf();
    }

    @Override // com.oplus.aiunit.vision.mb3
    public void setStrokeWidth(float strokeWidth) {
        this.ring.g(strokeWidth);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.progressAnimator;
        if (valueAnimator2 == null) {
            return;
        }
        valueAnimator2.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
    }
}

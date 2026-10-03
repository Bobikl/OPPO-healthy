package com.heytap.sports.track.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.track.widget.RoundHProgressBar;
import com.oplus.aiunit.vision.at5;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.h27;
import com.oplus.aiunit.vision.lh2;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.support.appcompat.R$attr;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001GB'\b\u0007\u0012\u0006\u0010@\u001a\u00020?\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A\u0012\b\b\u0002\u0010C\u001a\u00020\u0002¢\u0006\u0004\bD\u0010EJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\n\u001a\u00020\u0005H\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0014J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR*\u0010%\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010)\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R*\u00108\u001a\u0002012\u0006\u0010\u001e\u001a\u0002018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010;\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$R$\u0010>\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010$¨\u0006H"}, d2 = {"Lcom/heytap/sports/track/widget/RoundHProgressBar;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "onAttachedToWindow", "onDetachedFromWindow", "", "radius", "b", "c", MapSchema.FIELD_NAME_ENTRY, b2n.f, "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", "trackPaint", "j", "progressPaint", "Landroid/graphics/RectF;", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/RectF;", "trackRect", LogFieldKey.LEVEL_KEY, "fillRect", "value", LogFieldKey.MESSAGE_KEY, "I", "getMax", "()I", "setMax", "(I)V", "max", "n", "getProgress", ClickApiEntity.SET_PROGRESS, "progress", "Landroid/animation/ValueAnimator;", "o", "Landroid/animation/ValueAnimator;", "indeterminateAnimator", LogFieldKey.PROCESS_NAME_KEY, UserInfo.SEX_FEMALE, "indeterminateFraction", "", "q", "Z", "d", "()Z", "setIndeterminate", "(Z)V", "isIndeterminate", "getTrackColor", "setTrackColor", "trackColor", "getProgressColor", "setProgressColor", "progressColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RoundHProgressBar extends View {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Paint trackPaint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint progressPaint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final RectF trackRect;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RectF fillRect;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int max;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int progress;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator indeterminateAnimator;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public float indeterminateFraction;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean isIndeterminate;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundHProgressBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void f(RoundHProgressBar this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.indeterminateFraction = ((Float) animatedValue).floatValue();
        this$0.invalidate();
    }

    public final void b(Canvas canvas, float radius) {
        int i;
        int i2 = this.progress;
        if (i2 <= 0 || (i = this.max) <= 0) {
            return;
        }
        float fWidth = this.trackRect.width() * (i2 / i);
        if (fWidth <= 0.0f) {
            return;
        }
        RectF rectF = this.fillRect;
        RectF rectF2 = this.trackRect;
        float f = rectF2.left;
        rectF.set(f, rectF2.top, fWidth + f, rectF2.bottom);
        canvas.drawRoundRect(this.fillRect, radius, radius, this.progressPaint);
    }

    public final void c(Canvas canvas, float radius) {
        float fWidth = this.trackRect.width();
        float f = 0.35f * fWidth;
        float f2 = this.trackRect.left;
        float f3 = (f2 - f) + ((fWidth + f) * this.indeterminateFraction);
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(f3, f2);
        float fCoerceAtMost = RangesKt___RangesKt.coerceAtMost(f + f3, this.trackRect.right);
        if (fCoerceAtMost <= fCoerceAtLeast) {
            return;
        }
        RectF rectF = this.fillRect;
        RectF rectF2 = this.trackRect;
        rectF.set(fCoerceAtLeast, rectF2.top, fCoerceAtMost, rectF2.bottom);
        canvas.drawRoundRect(this.fillRect, radius, radius, this.progressPaint);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsIndeterminate() {
        return this.isIndeterminate;
    }

    public final void e() {
        g();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(h27.FAMILY_PULL_REFRESH_DELAY);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.cyf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RoundHProgressBar.f(this.i, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.indeterminateAnimator = valueAnimatorOfFloat;
    }

    public final void g() {
        ValueAnimator valueAnimator = this.indeterminateAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.indeterminateAnimator = null;
        this.indeterminateFraction = 0.0f;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getProgressColor() {
        return this.progressPaint.getColor();
    }

    public final int getTrackColor() {
        return this.trackPaint.getColor();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isIndeterminate) {
            e();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float width = getWidth() - getPaddingRight();
        float height = getHeight() - getPaddingBottom();
        if (width <= paddingLeft || height <= paddingTop) {
            return;
        }
        this.trackRect.set(paddingLeft, paddingTop, width, height);
        float f = (height - paddingTop) / 2.0f;
        canvas.drawRoundRect(this.trackRect, f, f, this.trackPaint);
        if (this.isIndeterminate) {
            c(canvas, f);
        } else {
            b(canvas, f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824 ? View.MeasureSpec.getSize(heightMeasureSpec) : at5.a(4.0f) + getPaddingTop() + getPaddingBottom());
    }

    public final void setIndeterminate(boolean z) {
        if (this.isIndeterminate == z) {
            return;
        }
        this.isIndeterminate = z;
        if (isAttachedToWindow()) {
            if (z) {
                e();
            } else {
                g();
            }
        }
        invalidate();
    }

    public final void setMax(int i) {
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, 1);
        this.max = iCoerceAtLeast;
        if (this.progress > iCoerceAtLeast) {
            setProgress(iCoerceAtLeast);
        }
        invalidate();
    }

    public final void setProgress(int i) {
        int iCoerceIn = RangesKt___RangesKt.coerceIn(i, 0, this.max);
        if (this.progress != iCoerceIn) {
            this.progress = iCoerceIn;
            invalidate();
        }
    }

    public final void setProgressColor(int i) {
        this.progressPaint.setColor(i);
        invalidate();
    }

    public final void setTrackColor(int i) {
        this.trackPaint.setColor(i);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundHProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoundHProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoundHProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(436207616);
        paint.setStyle(Paint.Style.FILL);
        this.trackPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(lh2.a(context, R$attr.couiColorPrimary));
        paint2.setStyle(Paint.Style.FILL);
        this.progressPaint = paint2;
        this.trackRect = new RectF();
        this.fillRect = new RectF();
        this.max = 100;
    }
}

package com.heytap.health.health_archives.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.health_archives.R$color;
import com.heytap.health.health_archives.R$styleable;
import com.heytap.health.health_archives.view.DotLoadingView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.vi2;
import com.oplus.aiunit.vision.xu5;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.TextEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Triple;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\u00020\u0001:\u00013B\u0019\u0012\u0006\u0010-\u001a\u00020,\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J \u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002R\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u00064"}, d2 = {"Lcom/heytap/health/health_archives/view/DotLoadingView;", "Landroid/view/View;", "", MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "Landroid/graphics/Canvas;", "canvas", "onDraw", "onAttachedToWindow", "onDetachedFromWindow", b2n.f, "", "progress", "phaseOffset", "", MapSchema.FIELD_NAME_ENTRY, "start", TextEntity.ELLIPSIZE_END, "t", "j", "f", "", "i", "I", "firstDotAlpha", "secondDotAlpha", "thirdDotAlpha", UserInfo.SEX_FEMALE, "dotRadius", LogFieldKey.MESSAGE_KEY, "dotSpacing", "n", "totalWidth", "Landroid/animation/ValueAnimator;", "o", "Landroid/animation/ValueAnimator;", "loadingAnimator", LogFieldKey.PROCESS_NAME_KEY, "Z", "isWaiting", "Landroid/graphics/Paint;", "q", "Landroid/graphics/Paint;", "dotPaint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDotLoadingView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DotLoadingView.kt\ncom/heytap/health/health_archives/view/DotLoadingView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1#2:228\n*E\n"})
public final class DotLoadingView extends View {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int firstDotAlpha;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int secondDotAlpha;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int thirdDotAlpha;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final float dotRadius;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final float dotSpacing;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final float totalWidth;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator loadingAnimator;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isWaiting;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Paint dotPaint;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/health_archives/view/DotLoadingView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", ParserTag.TAG_ON_ANIMATION_CANCEL, "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            DotLoadingView.this.firstDotAlpha = 0;
            DotLoadingView.this.secondDotAlpha = 0;
            DotLoadingView.this.thirdDotAlpha = 0;
            DotLoadingView.this.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotLoadingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.dotPaint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DotLoadingView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.DotLoadingView)");
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.DotLoadingView_dotRadius, xu5.a(context, 2.0f));
        this.dotRadius = dimension;
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.DotLoadingView_dotPadding, xu5.a(context, 2.0f));
        this.dotSpacing = dimension2;
        paint.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.DotLoadingView_dotColor, context.getColor(R$color.health_archives_white)));
        typedArrayObtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.FILL);
        this.totalWidth = (dimension * 6.0f) + (dimension2 * 2.0f);
    }

    public static final void h(DotLoadingView this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this$0.firstDotAlpha = this$0.e(fFloatValue, 0.5f);
        this$0.secondDotAlpha = this$0.e(fFloatValue, 0.25f);
        this$0.thirdDotAlpha = this$0.e(fFloatValue, 0.0f);
        this$0.invalidate();
    }

    public final int e(float progress, float phaseOffset) {
        float f = (progress + phaseOffset) % 1.0f;
        if (f <= 0.09984985f) {
            return j(51.0f, 127.5f, f / 0.09984985f);
        }
        if (f <= 0.15015015f) {
            return j(127.5f, 255.0f, (f - 0.09984985f) / 0.0503003f);
        }
        if (f < 0.3506006f) {
            return 255;
        }
        if (f <= 0.40015015f) {
            return j(255.0f, 127.5f, (f - 0.3506006f) / 0.04954955f);
        }
        if (f <= 0.3003003f) {
            return j(127.5f, 51.0f, (f - 0.40015015f) / (-0.09984985f));
        }
        return 51;
    }

    public final void f(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float measuredWidth = ((getMeasuredWidth() - this.totalWidth) / 2.0f) + this.dotRadius;
        Triple triple = i() ? new Triple(Integer.valueOf(this.thirdDotAlpha), Integer.valueOf(this.secondDotAlpha), Integer.valueOf(this.firstDotAlpha)) : new Triple(Integer.valueOf(this.firstDotAlpha), Integer.valueOf(this.secondDotAlpha), Integer.valueOf(this.thirdDotAlpha));
        int iIntValue = ((Number) triple.component1()).intValue();
        int iIntValue2 = ((Number) triple.component2()).intValue();
        int iIntValue3 = ((Number) triple.component3()).intValue();
        this.dotPaint.setAlpha(iIntValue);
        canvas.drawCircle(measuredWidth, measuredHeight, this.dotRadius, this.dotPaint);
        float f = measuredWidth + (this.dotRadius * 2.0f) + this.dotSpacing;
        this.dotPaint.setAlpha(iIntValue2);
        canvas.drawCircle(f, measuredHeight, this.dotRadius, this.dotPaint);
        float f2 = f + (this.dotRadius * 2.0f) + this.dotSpacing;
        this.dotPaint.setAlpha(iIntValue3);
        canvas.drawCircle(f2, measuredHeight, this.dotRadius, this.dotPaint);
    }

    public final void g() {
        ValueAnimator valueAnimator = this.loadingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1332L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new vi2());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.l06
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DotLoadingView.h(this.i, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.addListener(new b());
        this.loadingAnimator = valueAnimatorOfFloat;
    }

    public final boolean i() {
        return getLayoutDirection() == 1;
    }

    public final int j(float start, float end, float t) {
        return RangesKt___RangesKt.coerceIn((int) (start + ((end - start) * t)), 51, 255);
    }

    public final void k() {
        this.isWaiting = true;
        g();
        ValueAnimator valueAnimator = this.loadingAnimator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public final void l() {
        this.isWaiting = false;
        ValueAnimator valueAnimator = this.loadingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.loadingAnimator = null;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.loadingAnimator;
        if (valueAnimator != null) {
            if (!(this.isWaiting && !valueAnimator.isRunning())) {
                valueAnimator = null;
            }
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        f(canvas);
        canvas.restoreToCount(iSave);
    }
}

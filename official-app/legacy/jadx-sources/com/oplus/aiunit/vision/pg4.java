package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RequiresApi;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 30)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/pg4;", "Landroid/view/WindowInsetsAnimationControlListener;", "Landroid/view/WindowInsetsAnimationController;", "controller", "", "types", "", "onReady", "onFinished", "onCancelled", "", CardAction.LIFE_CIRCLE_VALUE_SHOW, "Landroid/animation/ValueAnimator;", b2n.f, "i", "Z", "mShow", "j", "I", "mDuration", "Landroid/view/animation/Interpolator;", MapSchema.FIELD_NAME_KEY, "Landroid/view/animation/Interpolator;", "mInsetsInterpolator", "Landroid/animation/Animator;", LogFieldKey.LEVEL_KEY, "Landroid/animation/Animator;", "mAnimator", "f", "()Landroid/view/animation/Interpolator;", "alphaInterpolator", "<init>", "(ZILandroid/view/animation/Interpolator;)V", "Companion", "a", "coui-support-toolbar_release"}, k = 1, mv = {1, 8, 0})
public final class pg4 implements WindowInsetsAnimationControlListener {

    @NotNull
    public static final Interpolator m = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final TypeEvaluator<Insets> f15353n = new TypeEvaluator() { // from class: com.oplus.aiunit.vision.ng4
        @Override // android.animation.TypeEvaluator
        public final Object evaluate(float f, Object obj, Object obj2) {
            return pg4.d(f, (Insets) obj, (Insets) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean mShow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int mDuration;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Interpolator mInsetsInterpolator;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Animator mAnimator;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/pg4$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", ParserTag.TAG_ON_ANIMATION_END, "coui-support-toolbar_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends AnimatorListenerAdapter {
        public final /* synthetic */ WindowInsetsAnimationController i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f15356j;

        public b(WindowInsetsAnimationController windowInsetsAnimationController, boolean z) {
            this.i = windowInsetsAnimationController;
            this.f15356j = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.i.isCancelled()) {
                return;
            }
            this.i.finish(this.f15356j);
        }
    }

    public pg4(boolean z, int i, @NotNull Interpolator mInsetsInterpolator) {
        Intrinsics.checkNotNullParameter(mInsetsInterpolator, "mInsetsInterpolator");
        this.mShow = z;
        this.mDuration = i;
        this.mInsetsInterpolator = mInsetsInterpolator;
    }

    public static final Insets d(float f, Insets startValue, Insets endValue) {
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        int i = startValue.left;
        int i2 = (int) (i + ((endValue.left - i) * f));
        int i3 = startValue.top;
        int i4 = (int) (i3 + ((endValue.top - i3) * f));
        int i5 = startValue.right;
        int i6 = (int) (i5 + ((endValue.right - i5) * f));
        int i7 = startValue.bottom;
        return Insets.of(i2, i4, i6, (int) (i7 + (f * (endValue.bottom - i7))));
    }

    public static final float e(float f) {
        return Math.min(1.0f, 2 * f);
    }

    public static final void h(WindowInsetsAnimationController controller, ValueAnimator valueAnimator, pg4 this$0, Interpolator insetsInterpolator, Insets start, Insets end, Interpolator alphaInterpolator, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(controller, "$controller");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(insetsInterpolator, "$insetsInterpolator");
        Intrinsics.checkNotNullParameter(start, "$start");
        Intrinsics.checkNotNullParameter(end, "$end");
        Intrinsics.checkNotNullParameter(alphaInterpolator, "$alphaInterpolator");
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (!controller.isReady()) {
            valueAnimator.cancel();
            return;
        }
        float animatedFraction = animation.getAnimatedFraction();
        controller.setInsetsAndAlpha(f15353n.evaluate(insetsInterpolator.getInterpolation(animatedFraction), start, end), alphaInterpolator.getInterpolation(this$0.mShow ? animatedFraction : 1 - animatedFraction), animatedFraction);
    }

    public final Interpolator f() {
        return this.mShow ? new Interpolator() { // from class: com.oplus.aiunit.vision.og4
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return pg4.e(f);
            }
        } : m;
    }

    public final ValueAnimator g(final WindowInsetsAnimationController controller, boolean show) {
        final ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f);
        animator.setDuration(this.mDuration);
        animator.setInterpolator(new LinearInterpolator());
        final Interpolator interpolator = this.mInsetsInterpolator;
        final Interpolator interpolatorF = f();
        final Insets hiddenStateInsets = show ? controller.getHiddenStateInsets() : controller.getShownStateInsets();
        Intrinsics.checkNotNullExpressionValue(hiddenStateInsets, "if (show) controller.hid…ntroller.shownStateInsets");
        final Insets shownStateInsets = show ? controller.getShownStateInsets() : controller.getHiddenStateInsets();
        Intrinsics.checkNotNullExpressionValue(shownStateInsets, "if (show) controller.sho…troller.hiddenStateInsets");
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.mg4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                pg4.h(controller, animator, this, interpolator, hiddenStateInsets, shownStateInsets, interpolatorF, valueAnimator);
            }
        });
        animator.addListener(new b(controller, show));
        animator.start();
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        return animator;
    }

    public void onCancelled(@Nullable WindowInsetsAnimationController controller) {
        Animator animator = this.mAnimator;
        if (animator != null) {
            Intrinsics.checkNotNull(animator);
            animator.cancel();
        }
    }

    public void onFinished(@NotNull WindowInsetsAnimationController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
    }

    public void onReady(@NotNull WindowInsetsAnimationController controller, int types) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.mAnimator = g(controller, this.mShow);
    }
}

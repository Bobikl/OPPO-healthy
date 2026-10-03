package com.heytap.store.business.component.utils.viewpager2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.store.business.component.utils.viewpager2.Viewpager2KtsKt;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"setCurrentItem", "", "Landroidx/viewpager2/widget/ViewPager2;", "item", "", "duration", "", ParserTag.TAG_INTERPOLATOR, "Landroid/animation/TimeInterpolator;", "pagePxWidth", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class Viewpager2KtsKt {
    public static final void setCurrentItem(@NotNull final ViewPager2 viewPager2, int i, long j2, @NotNull TimeInterpolator interpolator, int i2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i2 * (i - viewPager2.getCurrentItem()));
        final Ref.IntRef intRef = new Ref.IntRef();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.n1l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Viewpager2KtsKt.m4844setCurrentItem$lambda0(intRef, viewPager2, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.heytap.store.business.component.utils.viewpager2.Viewpager2KtsKt.setCurrentItem.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                viewPager2.endFakeDrag();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
                viewPager2.beginFakeDrag();
            }
        });
        valueAnimatorOfInt.setInterpolator(interpolator);
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.start();
    }

    public static /* synthetic */ void setCurrentItem$default(ViewPager2 viewPager2, int i, long j2, TimeInterpolator timeInterpolator, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            timeInterpolator = new AccelerateDecelerateInterpolator();
        }
        TimeInterpolator timeInterpolator2 = timeInterpolator;
        if ((i3 & 8) != 0) {
            i2 = viewPager2.getWidth();
        }
        setCurrentItem(viewPager2, i, j2, timeInterpolator2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setCurrentItem$lambda-0, reason: not valid java name */
    public static final void m4844setCurrentItem$lambda0(Ref.IntRef previousValue, ViewPager2 this_setCurrentItem, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(previousValue, "$previousValue");
        Intrinsics.checkNotNullParameter(this_setCurrentItem, "$this_setCurrentItem");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int iIntValue = ((Integer) animatedValue).intValue();
        this_setCurrentItem.fakeDragBy(-(iIntValue - previousValue.element));
        previousValue.element = iIntValue;
    }
}

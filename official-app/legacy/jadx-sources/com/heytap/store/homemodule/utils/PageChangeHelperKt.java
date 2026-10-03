package com.heytap.store.homemodule.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.store.homemodule.utils.PageChangeHelperKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"startChangeAnimation", "", "pager", "Landroidx/viewpager2/widget/ViewPager2;", "animationDuration", "", "com.heytap.store.business.home-impl"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PageChangeHelperKt {
    public static final void startChangeAnimation(@NotNull final ViewPager2 pager, long j2) {
        Intrinsics.checkNotNullParameter(pager, "pager");
        RecyclerView.Adapter adapter = pager.getAdapter();
        final int itemCount = adapter == null ? 0 : adapter.getItemCount();
        if (itemCount < 2) {
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        int currentItem = pager.getCurrentItem();
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = currentItem;
        if (currentItem >= itemCount - 1) {
            intRef2.element = 0;
        } else {
            intRef2.element = currentItem + 1;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, pager.getOrientation() == 0 ? pager.getWidth() : pager.getHeight());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.z3e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PageChangeHelperKt.m4978startChangeAnimation$lambda0(intRef, pager, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.heytap.store.homemodule.utils.PageChangeHelperKt.startChangeAnimation.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                pager.endFakeDrag();
                if (intRef2.element == itemCount - 1) {
                    pager.setCurrentItem(0, false);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                intRef.element = 0;
                pager.beginFakeDrag();
            }
        });
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.start();
    }

    public static /* synthetic */ void startChangeAnimation$default(ViewPager2 viewPager2, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 250;
        }
        startChangeAnimation(viewPager2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startChangeAnimation$lambda-0, reason: not valid java name */
    public static final void m4978startChangeAnimation$lambda0(Ref.IntRef lastPxToDrag, ViewPager2 pager, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(lastPxToDrag, "$lastPxToDrag");
        Intrinsics.checkNotNullParameter(pager, "$pager");
        Object animatedValue = valueAnimator == null ? null : valueAnimator.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        int iIntValue = num == null ? 0 : num.intValue();
        pager.fakeDragBy(-(iIntValue - lastPxToDrag.element));
        lastPxToDrag.element = iIntValue;
    }
}

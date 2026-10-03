package com.heytap.health.bandface.watchface.worldclock.cities.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.bandface.R$dimen;
import com.heytap.health.bandface.R$id;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes15.dex */
public class HeaderScrollingBehavior extends CoordinatorLayout.Behavior<RecyclerView> {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference<View> f3151j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3152l;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HeaderScrollingBehavior.this.k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            HeaderScrollingBehavior.this.k = true;
        }
    }

    public HeaderScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = false;
        this.f3152l = context.getResources().getDimension(R$dimen.band_dp10);
    }

    public final View b() {
        return this.f3151j.get();
    }

    public final float c() {
        return b().getResources().getDimension(R$dimen.band_dp1);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view) {
        if (view == null || view.getId() != R$id.img_searchBg) {
            return false;
        }
        this.f3151j = new WeakReference<>(view);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view) {
        recyclerView.setTranslationY(view.getHeight() + view.getTranslationY());
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, int i) {
        if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) recyclerView.getLayoutParams())).height != -1) {
            return super.onLayoutChild(coordinatorLayout, recyclerView, i);
        }
        recyclerView.layout(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view, float f, float f2) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i2 <= 0) {
            return;
        }
        View viewB = b();
        float translationY = viewB.getTranslationY() - i2;
        float fC = (-viewB.getHeight()) + c();
        if (i3 == 1) {
            viewB.setTranslationY(fC);
            iArr[1] = (int) fC;
        }
        if (translationY > fC) {
            viewB.setTranslationY(translationY);
            iArr[1] = i2;
        } else {
            viewB.setTranslationY(fC);
            iArr[1] = (int) fC;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (i4 >= 0) {
            return;
        }
        if (i5 == 1) {
            b().setTranslationY(0.0f);
            return;
        }
        float translationY = b().getTranslationY() - i4;
        if (translationY < 0.0f) {
            b().setTranslationY(translationY);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull View view2, int i, int i2) {
        super.onNestedScrollAccepted(coordinatorLayout, recyclerView, view, view2, i, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull View view, int i) {
        super.onStopNestedScroll(coordinatorLayout, recyclerView, view, i);
        if (i == 0) {
            m();
        }
    }

    public void m() {
        ObjectAnimator duration;
        if (this.k) {
            return;
        }
        View view = this.f3151j.get();
        float height = (view.getHeight() - c()) + view.getTranslationY();
        if (height <= 0.0f) {
            return;
        }
        float height2 = 100.0f / view.getHeight();
        if (height > this.f3152l) {
            duration = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f).setDuration((long) Math.abs(height2 * view.getTranslationY()));
        } else {
            float fC = (-view.getHeight()) + c();
            duration = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), fC).setDuration((long) Math.abs((height2 * fC) - view.getTranslationY()));
        }
        duration.addListener(new a());
        duration.start();
    }
}

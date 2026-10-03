package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class hn2 {
    public final WeakReference<ViewPager2> a;
    public long b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f12205c = new LinearInterpolator();
    public int d = 0;

    public class a extends bf2 {
        public final /* synthetic */ ViewPager2 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float[] f12206j;

        public a(ViewPager2 viewPager2, float[] fArr) {
            this.i = viewPager2;
            this.f12206j = fArr;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.i.endFakeDrag();
            this.f12206j[0] = 0.0f;
        }
    }

    public hn2(ViewPager2 viewPager2) {
        this.a = new WeakReference<>(viewPager2);
    }

    public static /* synthetic */ void d(int i, ViewPager2 viewPager2, boolean z, float[] fArr, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * i;
        viewPager2.fakeDragBy(z ? (-fFloatValue) + fArr[0] : fFloatValue - fArr[0]);
        fArr[0] = fFloatValue;
    }

    public final void b(final ViewPager2 viewPager2, final boolean z, final int i) {
        if (viewPager2.isFakeDragging()) {
            return;
        }
        viewPager2.beginFakeDrag();
        final float[] fArr = {0.0f};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.b);
        valueAnimatorOfFloat.setInterpolator(this.f12205c);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.gn2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                hn2.d(i, viewPager2, z, fArr, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a(viewPager2, fArr));
        valueAnimatorOfFloat.start();
    }

    public final int c() {
        ViewPager2 viewPager2 = this.a.get();
        return (viewPager2.getOrientation() == 0 ? viewPager2.getWidth() : viewPager2.getHeight()) + this.d;
    }

    public void e() {
        if (this.a.get() == null) {
            return;
        }
        b(this.a.get(), true, c());
    }

    public void f(long j2) {
        this.b = j2;
    }

    public void g(Interpolator interpolator) {
        this.f12205c = interpolator;
    }

    public void h(int i) {
        this.d = i;
    }
}

package com.heytap.nearx.uikit.widget.viewPager;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.nearx.uikit.widget.viewPager.NearViewPager2SlideHelper;
import com.oplus.aiunit.vision.yfc;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class NearViewPager2SlideHelper {
    private long mDuration = 200;
    private Interpolator mInterpolator = new LinearInterpolator();
    private int mOffset = 0;
    private final WeakReference<ViewPager2> mViewPager2WeakReference;

    public NearViewPager2SlideHelper(ViewPager2 viewPager2) {
        this.mViewPager2WeakReference = new WeakReference<>(viewPager2);
    }

    private void doAnimator(final ViewPager2 viewPager2, final boolean z, final int i) {
        if (viewPager2.isFakeDragging()) {
            return;
        }
        viewPager2.beginFakeDrag();
        final float[] fArr = {0.0f};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.mDuration);
        valueAnimatorOfFloat.setInterpolator(this.mInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.emc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearViewPager2SlideHelper.lambda$doAnimator$0(i, viewPager2, z, fArr, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new yfc() { // from class: com.heytap.nearx.uikit.widget.viewPager.NearViewPager2SlideHelper.1
            @Override // com.oplus.aiunit.vision.yfc, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                viewPager2.endFakeDrag();
                fArr[0] = 0.0f;
            }
        });
        valueAnimatorOfFloat.start();
    }

    private int getScrollDistance() {
        ViewPager2 viewPager2 = this.mViewPager2WeakReference.get();
        return (viewPager2.getOrientation() == 0 ? viewPager2.getWidth() : viewPager2.getHeight()) + this.mOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$doAnimator$0(int i, ViewPager2 viewPager2, boolean z, float[] fArr, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * i;
        viewPager2.fakeDragBy(z ? (-fFloatValue) + fArr[0] : fFloatValue - fArr[0]);
        fArr[0] = fFloatValue;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Interpolator getInterpolator() {
        return this.mInterpolator;
    }

    public int getOffset() {
        return this.mOffset;
    }

    public void nextItem() {
        if (this.mViewPager2WeakReference.get() == null) {
            return;
        }
        doAnimator(this.mViewPager2WeakReference.get(), true, getScrollDistance());
    }

    public void previousItem() {
        if (this.mViewPager2WeakReference.get() == null) {
            return;
        }
        doAnimator(this.mViewPager2WeakReference.get(), false, getScrollDistance());
    }

    public void setDuration(long j2) {
        this.mDuration = j2;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public void setOffset(int i) {
        this.mOffset = i;
    }
}

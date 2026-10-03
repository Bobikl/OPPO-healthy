package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes12.dex */
public abstract class k61 extends ValueAnimator {
    public final Set<ValueAnimator.AnimatorUpdateListener> i = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set<Animator.AnimatorListener> f13164j = new CopyOnWriteArraySet();
    public final Set<Animator.AnimatorPauseListener> k = new CopyOnWriteArraySet();

    void a() {
        Iterator<Animator.AnimatorListener> it = this.f13164j.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f13164j.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.k.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.i.add(animatorUpdateListener);
    }

    void b(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.f13164j.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z);
        }
    }

    void c() {
        Iterator<Animator.AnimatorPauseListener> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void d() {
        Iterator<Animator.AnimatorListener> it = this.f13164j.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void e() {
        Iterator<Animator.AnimatorPauseListener> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    void f(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.f13164j.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    void i() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f13164j.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.i.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f13164j.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.k.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.i.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}

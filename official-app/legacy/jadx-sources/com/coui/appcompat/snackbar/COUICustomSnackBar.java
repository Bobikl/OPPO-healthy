package com.coui.appcompat.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.oplus.aiunit.vision.bm2;
import com.oplus.aiunit.vision.cm2;
import com.oplus.aiunit.vision.dk2;
import com.oplus.aiunit.vision.dm2;
import com.oplus.aiunit.vision.em2;
import com.oplus.aiunit.vision.mh2;

/* JADX INFO: loaded from: classes13.dex */
public class COUICustomSnackBar extends FrameLayout {
    public final Runnable A;
    public ViewGroup i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f2078j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2079l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2080n;
    public View o;
    public AnimatorSet p;
    public AnimatorSet q;
    public boolean r;
    public long s;
    public boolean t;
    public boolean u;
    public float v;
    public boolean w;
    public int x;
    public int y;
    public final dk2 z;

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUICustomSnackBar.a(COUICustomSnackBar.this);
            COUICustomSnackBar.this.setVisibility(8);
            if (COUICustomSnackBar.this.i != null) {
                COUICustomSnackBar.this.i.removeView(COUICustomSnackBar.this);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            COUICustomSnackBar.a(COUICustomSnackBar.this);
        }
    }

    public static /* synthetic */ bm2 a(COUICustomSnackBar cOUICustomSnackBar) {
        cOUICustomSnackBar.getClass();
        return null;
    }

    public final void c() {
        if (this.q == null) {
            this.q = mh2.a(this);
        }
        this.q.addListener(new a());
        this.q.start();
    }

    public void d() {
        if (this.k) {
            c();
            return;
        }
        this.f2078j.setVisibility(8);
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.x = getTop();
            this.y = getBottom();
            this.v = motionEvent.getY();
            if (f()) {
                this.z.e(true);
            }
        } else if (action == 1) {
            if (f()) {
                this.z.e(false);
            }
            if (this.w) {
                d();
            }
        } else if (action != 2) {
            if (action == 3) {
                if (f()) {
                    this.z.e(false);
                }
                if (this.w) {
                    d();
                }
            }
        } else if (this.u) {
            float y = motionEvent.getY() - this.v;
            int top = (int) (getTop() + y);
            int bottom = (int) (getBottom() + y);
            if (top < this.x || bottom < this.y) {
                layout(getLeft(), this.x, getRight(), this.y);
                this.w = false;
            } else {
                layout(getLeft(), top, getRight(), bottom);
                this.w = true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean e() {
        return this.r;
    }

    public boolean f() {
        return this.t;
    }

    public void g() {
        removeCallbacks(this.A);
        if (e()) {
            postDelayed(this.A, getAutoDismissTime());
        }
    }

    public long getAutoDismissTime() {
        return this.s;
    }

    public View getCustomView() {
        return this.f2078j;
    }

    public AnimatorSet getDismissAnimSet() {
        return this.q;
    }

    public AnimatorSet getShowAnimSet() {
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = null;
        removeCallbacks(this.A);
    }

    public void setAutoDismiss(boolean z) {
        this.r = z;
    }

    public void setAutoDismissTime(long j2) {
        this.s = j2;
    }

    public void setDismissAnimSet(AnimatorSet animatorSet) {
        this.q = animatorSet;
    }

    public void setDismissWithAnim(boolean z) {
        this.k = z;
    }

    public void setHeight(int i) {
        this.f2080n = i;
    }

    public void setOnDismissAnimListener(bm2 bm2Var) {
    }

    public void setOnDismissListener(cm2 cm2Var) {
    }

    public void setOnShowAnimListener(dm2 dm2Var) {
    }

    public void setOnShowListener(em2 em2Var) {
    }

    public void setParent(ViewGroup viewGroup) {
        this.i = viewGroup;
    }

    public void setPressFeedBack(boolean z) {
        this.t = z;
    }

    public void setShowAnimSet(AnimatorSet animatorSet) {
        this.p = animatorSet;
    }

    public void setShowWithAnim(boolean z) {
        this.f2079l = z;
    }

    public void setTouchSlidable(boolean z) {
        this.u = z;
    }

    public void setView(View view) {
        this.o = view;
    }

    public void setWidth(int i) {
        this.m = i;
    }
}

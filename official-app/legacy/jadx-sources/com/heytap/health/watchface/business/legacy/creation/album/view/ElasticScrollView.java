package com.heytap.health.watchface.business.legacy.creation.album.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes19.dex */
public class ElasticScrollView extends ScrollView {
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f6884j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6885l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6886n;
    public float o;
    public int p;
    public int q;
    public a r;
    public ValueAnimator s;
    public final int t;
    public float u;
    public float v;

    public interface a {
        void p5(float f);
    }

    public ElasticScrollView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.o = fFloatValue;
        setZoom(fFloatValue);
    }

    private void setZoom(float f) {
        setZoomOffset(f);
        a aVar = this.r;
        if (aVar != null) {
            aVar.p5(f);
        }
    }

    private void setZoomOffset(float f) {
        View view = this.f6884j;
        if (view != null && this.p > 0 && this.q > 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = this.p;
            layoutParams.height = (int) (this.q + f);
            this.f6884j.setLayoutParams(layoutParams);
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final boolean c() {
        return getScrollY() == 0 || this.i.getHeight() < getHeight() + getScrollY();
    }

    public final boolean d() {
        return this.i.getHeight() <= getHeight() + getScrollY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.i == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        View view = this.f6884j;
        if (view != null && (this.p <= 0 || this.q <= 0)) {
            this.p = view.getMeasuredWidth();
            this.q = this.f6884j.getMeasuredHeight();
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z2 = false;
            if (action != 1) {
                if (action == 2) {
                    if (this.k || this.f6885l) {
                        int y = (int) (motionEvent.getY() - this.f6886n);
                        boolean z3 = this.k;
                        if ((z3 && y > 0) || (((z = this.f6885l) && y < 0) || (z && z3))) {
                            z2 = true;
                        }
                        if (z2) {
                            b();
                            float f = y * 0.15f;
                            this.o = f;
                            setZoom(f);
                            this.m = true;
                        }
                    } else {
                        this.f6886n = motionEvent.getY();
                        this.k = c();
                        this.f6885l = d();
                    }
                }
            } else if (this.m) {
                f();
                this.k = false;
                this.f6885l = false;
                this.m = false;
            }
        } else {
            this.k = c();
            this.f6885l = d();
            this.f6886n = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f() {
        ValueAnimator duration = ValueAnimator.ofFloat(this.o, 0.0f).setDuration(300L);
        this.s = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.vi6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.e(valueAnimator);
            }
        });
        this.s.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 0) {
            this.i = getChildAt(0);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.u = motionEvent.getX();
            this.v = motionEvent.getY();
            super.onInterceptTouchEvent(motionEvent);
            return false;
        }
        if (action == 1 || action != 2) {
            return false;
        }
        float x = this.u - motionEvent.getX();
        float y = this.v - motionEvent.getY();
        return Math.abs(y) > ((float) this.t) && Math.abs(x) < Math.abs(y);
    }

    public void setOnLayoutChangeListener(a aVar) {
        this.r = aVar;
    }

    public void setZoomView(View view) {
        this.f6884j = view;
    }

    public ElasticScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}

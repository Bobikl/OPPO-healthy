package com.heytap.health.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import com.heytap.health.base.R$styleable;

/* JADX INFO: loaded from: classes15.dex */
public class BounceNestedScrollView extends NestedScrollView {
    public boolean A;
    public boolean B;
    public boolean C;
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f3269j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TranslateAnimation f3270l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3271n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public int t;
    public OverScroller u;
    public int v;
    public int w;
    public int x;
    public int y;
    public float z;

    public class a implements Animation.AnimationListener {
        public final /* synthetic */ float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f3272j;
        public final /* synthetic */ int k;

        public a(float f, float f2, int i) {
            this.i = f;
            this.f3272j = f2;
            this.k = i;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.i, this.f3272j);
            translateAnimation.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f));
            translateAnimation.setDuration((long) (((double) this.k) * 2.5d));
            BounceNestedScrollView.this.i.startAnimation(translateAnimation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BounceNestedScrollView(Context context) {
        this(context, null);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (getChildCount() > 0) {
            this.i = getChildAt(0);
        }
    }

    public final int b(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public boolean c() {
        int measuredHeight = this.i.getMeasuredHeight() - getHeight();
        int scrollY = getScrollY();
        return scrollY <= 0 || scrollY >= measuredHeight;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        if (this.C) {
            return super.canScrollVertically(i);
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.u.computeScrollOffset()) {
            this.z = this.u.getCurrVelocity();
        }
    }

    public final void d(boolean z, float f) {
        double d = f;
        int iB = b(getContext(), (float) ((((double) 80) * Math.sqrt(d)) / 178.0d));
        float top = this.i.getTop() - getPaddingTop();
        float f2 = top - (z ? -iB : iB);
        StringBuilder sb = new StringBuilder();
        sb.append("startEdgeEffect distance is ");
        sb.append(iB);
        sb.append(" ,sqrt is ");
        sb.append(Math.sqrt(d));
        sb.append(" ,fromYDelta is ");
        sb.append(top);
        sb.append(" ,toYDelta is ");
        sb.append(f2);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, top, f2);
        translateAnimation.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f));
        translateAnimation.setDuration(160);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new a(f2, top, 80));
        this.i.startAnimation(translateAnimation);
        this.B = false;
    }

    public final void e(float f) {
        d(false, f);
    }

    public final void f(float f) {
        d(true, f);
    }

    @Override // androidx.core.widget.NestedScrollView
    public void fling(int i) {
        super.fling(i);
        if (!this.f3269j.isEmpty()) {
            this.A = Math.abs(this.f3269j.top - this.i.getTop()) < this.t;
        }
        int height = getHeight();
        int measuredHeight = this.i.getMeasuredHeight();
        float scrollY = getScrollY();
        if (this.C) {
            this.A = (i > 0 && scrollY < ((float) (measuredHeight - height))) || (i < 0 && scrollY > 0.0f);
        }
        this.u.fling(this.x, this.y, 0, i, 0, 0, 0, Math.max(0, measuredHeight - height), 0, height / 2);
        StringBuilder sb = new StringBuilder();
        sb.append("fling velocityY is ");
        sb.append(i);
        sb.append(" ,mTouchSlop is ");
        sb.append(this.t);
        sb.append(" ,mAnimFlag is ");
        sb.append(this.A);
        sb.append(" ,mScrollY is ");
        sb.append(this.y);
        this.s = i;
        this.B = true;
    }

    public void g() {
        if (this.f3269j.isEmpty()) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.i.getTop(), this.f3269j.top);
        this.f3270l = translateAnimation;
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        this.f3270l.setDuration(300L);
        this.i.startAnimation(this.f3270l);
        View view = this.i;
        Rect rect = this.f3269j;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        this.f3269j.setEmpty();
        this.m = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        if (getChildCount() > 0) {
            this.i = getChildAt(0);
        }
        super.onFinishInflate();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.r = pointerId;
            this.k = motionEvent.getY(motionEvent.findPointerIndex(pointerId));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            size = Math.min(size, this.f3271n);
        }
        if (mode == 0) {
            size = Math.min(size, this.f3271n);
        }
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, this.f3271n);
        }
        int i3 = this.p;
        if (i3 > 0 && (size = size - (size % i3)) < i3) {
            size = i3;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            size2 = Math.min(size2, this.o);
        }
        if (mode2 == 0) {
            size2 = Math.min(size2, this.o);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, this.o);
        }
        int i4 = this.q;
        if (i4 > 0 && (size2 = size2 - (size2 % i4)) < i4) {
            size2 = i4;
        }
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        this.x = i;
        this.y = i2;
        float fMin = Math.min(Math.max(1000.0f, Math.abs(this.z)), 32000.0f);
        int measuredHeight = this.i.getMeasuredHeight() - getHeight();
        int iB = b(getContext(), ((float) Math.sqrt(fMin)) * 1.1f);
        float f = this.s;
        if (((f < 0.0f && i2 < iB) || (f > 0.0f && measuredHeight - i2 < iB)) && this.A && this.B) {
            if (f < 0.0f) {
                f(fMin);
            } else if (f > 0.0f) {
                e(fMin);
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.C) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        this.s = 0.0f;
        int i = 0;
        if (actionMasked == 0) {
            this.r = motionEvent.getPointerId(0);
            this.k = motionEvent.getY(actionIndex);
        }
        if (actionMasked == 5) {
            this.r = motionEvent.getPointerId(actionIndex);
            this.k = motionEvent.getY(actionIndex);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            post(new Runnable() { // from class: com.oplus.aiunit.vision.o22
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.g();
                }
            });
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.r);
            if (iFindPointerIndex < 0) {
                return super.onTouchEvent(motionEvent);
            }
            float f = this.k;
            float y = motionEvent.getY(iFindPointerIndex);
            int i2 = (int) (f - y);
            this.k = y;
            if (this.m) {
                i = i2;
            } else {
                this.m = true;
            }
            if (c()) {
                if (this.f3269j.isEmpty()) {
                    this.f3269j.set(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
                }
                View view = this.i;
                int i3 = i / 3;
                view.layout(view.getLeft(), this.i.getTop() - i3, this.i.getRight(), this.i.getBottom() - i3);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMaxHeight(int i) {
        this.o = i;
        requestLayout();
    }

    public BounceNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3269j = new Rect();
        this.m = true;
        this.f3271n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.p = 0;
        this.q = 0;
        this.r = -1;
        this.s = 0.0f;
        this.A = true;
        this.B = true;
        this.C = false;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.t = viewConfiguration.getScaledTouchSlop() * 2;
        this.u = new OverScroller(getContext());
        this.v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_base_BounceScrollView);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_BounceScrollView_flingAnimationOnly, false);
        typedArrayObtainStyledAttributes.recycle();
        setOverScrollMode(2);
        StringBuilder sb = new StringBuilder();
        sb.append("BounceNestedScrollView mFlingAnimationOnly is ");
        sb.append(this.C);
    }

    public BounceNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3269j = new Rect();
        this.m = true;
        this.f3271n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.p = 0;
        this.q = 0;
        this.r = -1;
        this.s = 0.0f;
        this.A = true;
        this.B = true;
        this.C = false;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.t = viewConfiguration.getScaledTouchSlop() * 2;
        this.u = new OverScroller(getContext());
        this.v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_base_BounceScrollView);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_BounceScrollView_flingAnimationOnly, false);
        typedArrayObtainStyledAttributes.recycle();
        setOverScrollMode(2);
        StringBuilder sb = new StringBuilder();
        sb.append("BounceNestedScrollView mFlingAnimationOnly is ");
        sb.append(this.C);
    }
}

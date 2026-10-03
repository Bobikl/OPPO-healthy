package com.heytap.health.base.view.refreshlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ScrollingView;
import com.heytap.health.base.view.refreshlayout.header.BaseRefreshHeaderView;
import com.heytap.health.base.view.refreshlayout.header.RefreshHeaderView;
import com.oplus.aiunit.vision.ix7;
import com.oplus.aiunit.vision.m3f;
import com.oplus.aiunit.vision.uv9;
import p010kotlin.Deprecated;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated(message = "请使用SmartRefreshLayout")
public class PullRefreshLayout extends FrameLayout {
    public boolean A;
    public boolean B;
    public ix7 C;
    public m3f D;
    public boolean E;
    public Scroller i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3342j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3343l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3344n;
    public float o;
    public int p;
    public float q;
    public boolean r;
    public boolean s;
    public float t;
    public float u;
    public uv9 v;
    public View w;
    public BaseRefreshHeaderView x;
    public boolean y;
    public boolean z;

    public PullRefreshLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.i.startScroll(0, getScrollY(), 0, -getScrollY(), 300);
        invalidate();
    }

    public void b(boolean z) {
        BaseRefreshHeaderView baseRefreshHeaderView = this.x;
        if (baseRefreshHeaderView == null) {
            return;
        }
        baseRefreshHeaderView.a();
        if (!this.A) {
            this.E = z;
            this.x.f();
            this.i.startScroll(0, 0, 0, -this.x.getHeaderHeight(), 1);
            invalidate();
            return;
        }
        if (this.z) {
            return;
        }
        this.D.C3();
        this.s = true;
        this.z = true;
    }

    public boolean c(float f) {
        boolean z = this.q < f;
        if (getScrollY() < 0) {
            return false;
        }
        if (z && this.v.b(this.w)) {
            return false;
        }
        if ((z || !this.v.a(this.w)) && this.q != f) {
            return !this.A || this.o == 0.0f;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.s && this.i.computeScrollOffset()) {
            this.o = -this.i.getCurrY();
            scrollTo(0, this.i.getCurrY());
            invalidate();
            BaseRefreshHeaderView baseRefreshHeaderView = this.x;
            if (baseRefreshHeaderView != null) {
                baseRefreshHeaderView.d(this.o);
                if (this.x.c() && !this.z && this.E) {
                    this.D.C3();
                    this.s = true;
                    this.z = true;
                }
            }
        }
    }

    public final View d(View view) {
        if (f(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View viewD = d(viewGroup.getChildAt(i));
            if (viewD != null) {
                return viewD;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        BaseRefreshHeaderView baseRefreshHeaderView;
        if (this.C == null || this.v == null || this.w == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.y = false;
            this.p = 0;
            this.k = motionEvent.getY();
            this.m = motionEvent.getX();
            this.f3343l = motionEvent.getY();
            this.q = this.k;
        } else if (actionMasked == 1) {
            this.s = false;
            this.y = false;
            baseRefreshHeaderView = this.x;
            if (baseRefreshHeaderView != null || !baseRefreshHeaderView.b()) {
                this.i.startScroll(0, getScrollY(), 0, -getScrollY(), 500);
                invalidate();
            } else if (!this.A) {
                this.x.f();
                this.i.startScroll(0, getScrollY(), 0, -(getScrollY() + this.x.getHeaderHeight()), 500);
                invalidate();
            } else if (!this.z) {
                this.D.C3();
                this.z = true;
            }
        } else {
            if (actionMasked == 2) {
                float y = motionEvent.getY(this.p);
                this.f3344n = y;
                if (this.r) {
                    this.q = y;
                }
                if ((!this.C.a(this.m, this.k, motionEvent.getX(), motionEvent.getY()) || this.y) && !this.s) {
                    this.y = this.B;
                    this.q = this.f3344n;
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (c(motionEvent.getY(this.p))) {
                    this.q = this.f3344n;
                    return super.dispatchTouchEvent(motionEvent);
                }
                h();
                this.q = this.f3344n;
                return super.dispatchTouchEvent(motionEvent);
            }
            if (actionMasked == 3) {
                this.s = false;
                this.y = false;
                baseRefreshHeaderView = this.x;
                if (baseRefreshHeaderView != null) {
                    this.i.startScroll(0, getScrollY(), 0, -getScrollY(), 500);
                    invalidate();
                } else {
                    this.i.startScroll(0, getScrollY(), 0, -getScrollY(), 500);
                    invalidate();
                }
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.p = actionIndex;
                this.q = motionEvent.getY(actionIndex);
                this.r = true;
            } else if (actionMasked == 6) {
                this.r = true;
                if (motionEvent.getPointerCount() == 2 || this.p == motionEvent.getActionIndex()) {
                    this.p = 0;
                    this.q = this.f3343l;
                } else {
                    this.p = (motionEvent.getPointerCount() - 1) - 1;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(Context context, AttributeSet attributeSet, int i) {
        this.i = new Scroller(context);
        this.f3342j = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    public final boolean f(View view) {
        return (view instanceof ScrollView) || (view instanceof NestedScrollingChild) || (view instanceof ListView) || (view instanceof ScrollingView);
    }

    public int getRefreshStatus() {
        BaseRefreshHeaderView baseRefreshHeaderView = this.x;
        if (baseRefreshHeaderView instanceof RefreshHeaderView) {
            return ((RefreshHeaderView) baseRefreshHeaderView).getStatus();
        }
        return 1;
    }

    public final void h() {
        this.s = true;
        float f = this.f3344n - this.q;
        float fAbs = Math.abs(this.o / this.t);
        if (fAbs == 1.0f) {
            fAbs = -2.14748365E9f;
        }
        float f2 = f / (this.u * (1.0f / (1.0f - fAbs)));
        float f3 = this.o;
        float f4 = f2 + f3;
        if (f3 * f4 < 0.0f) {
            this.o = 0.0f;
        } else {
            this.o = f4;
        }
        if (!this.A) {
            scrollTo(0, (int) (-this.o));
        }
        this.r = false;
        BaseRefreshHeaderView baseRefreshHeaderView = this.x;
        if (baseRefreshHeaderView != null) {
            baseRefreshHeaderView.d(this.o);
        }
    }

    public void i() {
        BaseRefreshHeaderView baseRefreshHeaderView = this.x;
        if (baseRefreshHeaderView != null) {
            baseRefreshHeaderView.g();
        }
    }

    public void j(BaseRefreshHeaderView baseRefreshHeaderView, ViewGroup viewGroup) {
        this.x = baseRefreshHeaderView;
        if (baseRefreshHeaderView != null) {
            baseRefreshHeaderView.setParent(viewGroup);
            if (this.A) {
                baseRefreshHeaderView.setCanTranslation(false);
            }
        }
    }

    public void k(uv9 uv9Var, View view) {
        this.v = uv9Var;
        if (f(view)) {
            this.w = view;
            return;
        }
        View viewD = d(view);
        this.w = viewD;
        if (viewD == null) {
            this.w = view;
        }
    }

    public void l() {
        BaseRefreshHeaderView baseRefreshHeaderView = this.x;
        if (baseRefreshHeaderView == null) {
            return;
        }
        this.E = true;
        baseRefreshHeaderView.e();
        this.z = false;
        this.s = false;
        if (!this.A) {
            this.x.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.o3f
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.g();
                }
            }, 800L);
        } else {
            this.o = 0.0f;
            this.x.d(0.0f);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && Math.abs(this.o) > 5.0f) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setClickable(true);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (!getChildAt(i5).isClickable()) {
                getChildAt(i5).setClickable(true);
            }
        }
        this.t = i2;
    }

    public void setBounceCallBack(m3f m3fVar) {
        this.D = m3fVar;
    }

    public void setEventForwardingHelper(ix7 ix7Var) {
        this.C = ix7Var;
    }

    public void setmDampingCoefficient(float f) {
        this.u = f;
    }

    public void setmDisallowBounce(boolean z) {
        this.A = z;
    }

    public PullRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PullRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = 3.5f;
        this.B = true;
        this.E = true;
        e(context, attributeSet, i);
    }
}

package com.coui.appcompat.scrollview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.bn2;
import com.oplus.aiunit.vision.m0l;
import com.oplus.aiunit.vision.ri2;
import com.oplus.aiunit.vision.rki;
import com.oplus.aiunit.vision.uj2;
import com.support.scrollview.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class COUIScrollView extends ScrollView {
    public int A;
    public float B;
    public int C;
    public final int[] D;
    public final int[] E;
    public int F;
    public boolean G;
    public boolean H;
    public COUISavedState I;
    public long J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public Paint R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public float W;
    public float a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public Boolean e0;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2013j;
    public final Rect k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ri2 f2014l;
    public rki m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2015n;
    public boolean o;
    public View p;
    public boolean q;
    public VelocityTracker r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public float z;

    public static class COUISavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<COUISavedState> CREATOR = new a();
        public int scrollPosition;

        public class a implements Parcelable.Creator<COUISavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public COUISavedState createFromParcel(Parcel parcel) {
                return new COUISavedState(parcel, COUISavedState.class.getClassLoader());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public COUISavedState[] newArray(int i) {
                return new COUISavedState[i];
            }
        }

        public COUISavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "ScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.scrollPosition + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.scrollPosition);
        }

        public COUISavedState(Parcel parcel) {
            super(parcel);
            this.scrollPosition = parcel.readInt();
        }

        @RequiresApi(api = 24)
        public COUISavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.scrollPosition = parcel.readInt();
        }
    }

    public COUIScrollView(Context context) {
        super(context);
        this.i = 0;
        this.k = new Rect();
        this.f2014l = null;
        this.m = null;
        this.o = true;
        this.p = null;
        this.q = false;
        this.t = true;
        this.B = 1.0f;
        this.C = -1;
        this.D = new int[2];
        this.E = new int[2];
        this.G = false;
        this.H = false;
        this.O = true;
        this.P = true;
        this.R = new Paint();
        this.S = false;
        this.T = false;
        this.U = 2500;
        this.V = 20.0f;
        this.W = 1500.0f;
        this.b0 = true;
        this.c0 = true;
        this.d0 = true;
        this.e0 = null;
        k(context);
    }

    public static int b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    private float getVelocityAlongScrollableDirection() {
        if (this.f2014l == null || (getNestedScrollAxes() & 2) != 0) {
            return 0.0f;
        }
        return this.f2014l.getCurrVelocityY();
    }

    public static boolean t(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && t((View) parent, view2);
    }

    public final void A(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int iB = b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int iB2 = b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (iB == getScrollX() && iB2 == getScrollY()) {
                return;
            }
            scrollTo(iB, iB2);
        }
    }

    public final void B(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2013j > 250) {
            int iMax = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            int scrollY = getScrollY();
            int iMax2 = Math.max(0, Math.min(i2 + scrollY, iMax)) - scrollY;
            ri2 ri2Var = this.f2014l;
            if (ri2Var != null) {
                ri2Var.startScroll(getScrollX(), scrollY, 0, iMax2);
            }
            postInvalidateOnAnimation();
        } else {
            ri2 ri2Var2 = this.f2014l;
            if (ri2Var2 != null && !ri2Var2.e()) {
                this.a0 = this.f2014l.getCurrVelocityY() != 0.0f ? this.Q : 0.0f;
                this.f2014l.abortAnimation();
                if (this.H) {
                    this.H = false;
                }
            }
            scrollBy(i, i2);
        }
        this.f2013j = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean a() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public boolean arrowScroll(int i) {
        int bottom;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !u(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0 && (bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom())) < maxScrollAmount) {
                maxScrollAmount = bottom;
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            d(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.k);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.k);
            d(computeScrollDeltaToGetChildRectOnScreen(this.k));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !r(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final boolean c(@NonNull View view, @NonNull MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = true;
        int[] iArr = {0, 1};
        for (int i = 0; i < 2; i++) {
            motionEvent.setAction(iArr[i]);
            zDispatchTouchEvent &= view.dispatchTouchEvent(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void computeScroll() {
        ri2 ri2Var = this.f2014l;
        if (ri2Var == null || !ri2Var.computeScrollOffset()) {
            if (this.H) {
                this.H = false;
                return;
            }
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int iA = this.f2014l.a();
        int iD = this.f2014l.d();
        if (scrollX != iA || scrollY != iD) {
            overScrollBy(iA - scrollX, iD - scrollY, scrollX, scrollY, 0, getScrollRange(), 0, this.y, false);
        }
        if (awakenScrollBars()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i) {
        if (i != 0) {
            if (this.t) {
                B(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ri2 ri2Var;
        if (this.S || (this.T && s())) {
            float velocityAlongScrollableDirection = getVelocityAlongScrollableDirection();
            if (motionEvent.getActionMasked() == 0 && this.U >= Math.abs(velocityAlongScrollableDirection)) {
                ri2 ri2Var2 = this.f2014l;
                float f = 0.0f;
                if (ri2Var2 != null && ri2Var2.getCurrVelocityY() != 0.0f) {
                    f = this.Q;
                }
                this.a0 = f;
                ri2 ri2Var3 = this.f2014l;
                if (ri2Var3 != null) {
                    ri2Var3.abortAnimation();
                }
                stopNestedScroll();
            }
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (ri2Var = this.f2014l) != null && ri2Var.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        this.q = false;
        x();
        if (this.G) {
            this.G = false;
        }
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        this.k.setEmpty();
        if (!a()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? arrowScroll(33) : fullScroll(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? arrowScroll(130) : fullScroll(130);
        }
        if (keyCode != 62) {
            return false;
        }
        pageScroll(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    public final View f(boolean z, int i, int i2) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3 && z4) {
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (z4) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        this.Q = i;
        if (getChildCount() > 0) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            int height2 = getChildAt(0).getHeight();
            ri2 ri2Var = this.f2014l;
            if (ri2Var != null) {
                ri2Var.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, height2 - height), 0, height / 2);
            }
            if (!this.H) {
                this.H = true;
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.ScrollView
    public boolean fullScroll(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.k;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.k.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            Rect rect2 = this.k;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.k;
        return y(i, rect3.top, rect3.bottom);
    }

    public final View g(MotionEvent motionEvent) {
        View view = null;
        if (!o(motionEvent)) {
            return null;
        }
        Rect rect = new Rect();
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0 || childAt.getAnimation() != null) {
                childAt.getHitRect(rect);
                boolean zContains = rect.contains(((int) motionEvent.getX()) + getScrollX(), ((int) motionEvent.getY()) + getScrollY());
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(getScrollX() - childAt.getLeft(), getScrollY() - childAt.getTop());
                if (zContains && c(childAt, motionEventObtain)) {
                    view = childAt;
                }
                motionEventObtain.recycle();
            }
        }
        Log.d("COUIScrollView", "findViewToDispatchClickEvent: target: " + view);
        return view;
    }

    public int getScrollableRange() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final void h(int i) {
        boolean z = (getScrollY() > 0 || i > 0) && (getScrollY() < getScrollRange() || i < 0);
        float f = i;
        if (dispatchNestedPreFling(0.0f, f)) {
            return;
        }
        dispatchNestedFling(0.0f, f, z);
        if (z) {
            fling(i);
        }
    }

    public final boolean i(float f, float f2) {
        return !(this.S || (this.T && s())) || f == 0.0f || ((double) Math.abs(f2 / f)) > Math.tan(((double) this.V) * 0.017453292519943295d);
    }

    @Override // android.widget.ScrollView
    public boolean isFillViewport() {
        return this.s;
    }

    @Override // android.widget.ScrollView
    public boolean isSmoothScrollingEnabled() {
        return this.t;
    }

    public final boolean j(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    public final void k(Context context) {
        if (this.f2014l == null) {
            rki rkiVar = new rki(context);
            this.m = rkiVar;
            rkiVar.B(2.15f);
            this.m.y(true);
            this.f2014l = this.m;
            setEnableFlingSpeedIncrease(true);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.w = viewConfiguration.getScaledMaximumFlingVelocity();
        int i = displayMetrics.heightPixels;
        this.A = i;
        this.x = i;
        this.y = i;
        this.z = viewConfiguration.getScaledVerticalScrollFactor();
        this.i = displayMetrics.heightPixels;
    }

    public final void l() {
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker == null) {
            this.r = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void m() {
        if (this.r == null) {
            this.r = VelocityTracker.obtain();
        }
    }

    public void n() {
        if (isHardwareAccelerated() && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        int y = (int) (motionEvent.getY() - this.L);
        return System.currentTimeMillis() - this.J < 100 && ((int) Math.sqrt((double) (y * y))) < 10;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.G) {
            this.G = false;
        }
        if (this.H) {
            this.H = false;
        }
        rki rkiVar = this.m;
        if (rkiVar != null) {
            rkiVar.o();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        if (motionEvent.getAction() == 8) {
            if (motionEvent.isFromSource(2)) {
                axisValue = motionEvent.getAxisValue(9);
            } else {
                axisValue = motionEvent.isFromSource(4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            }
            int iRound = Math.round(axisValue * this.z);
            if (iRound != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - iRound;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ri2 ri2Var;
        int action = motionEvent.getAction();
        if (action == 2 && this.q) {
            return true;
        }
        if (super.onInterceptTouchEvent(motionEvent) && this.q) {
            return true;
        }
        int i = action & 255;
        boolean z = false;
        if (i == 0) {
            ri2 ri2Var2 = this.f2014l;
            float currVelocityY = ri2Var2 != null ? ri2Var2.getCurrVelocityY() : 0.0f;
            this.M = Math.abs(currVelocityY) > 0.0f && Math.abs(currVelocityY) < 250.0f && q(this.Q, this.a0);
            this.N = s();
            this.J = System.currentTimeMillis();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (j((int) motionEvent.getX(), y)) {
                this.K = x;
                this.f2015n = y;
                this.L = y;
                this.C = motionEvent.getPointerId(0);
                l();
                this.r.addMovement(motionEvent);
                ri2 ri2Var3 = this.f2014l;
                if (ri2Var3 != null) {
                    ri2Var3.computeScrollOffset();
                }
                ri2 ri2Var4 = this.f2014l;
                if (ri2Var4 != null && !ri2Var4.e()) {
                    z = true;
                }
                this.q = z;
                if (z && !this.G) {
                    this.G = true;
                }
                startNestedScroll(2);
            } else {
                this.q = false;
                x();
            }
        } else if (i == 1) {
            this.q = false;
            this.C = -1;
            x();
            ri2Var = this.f2014l;
            if (ri2Var != null && ri2Var.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll();
        } else if (i == 2) {
            int i2 = this.C;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("COUIScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int x2 = (int) motionEvent.getX(iFindPointerIndex);
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int iAbs = Math.abs(x2 - this.K);
                    int iAbs2 = Math.abs(y2 - this.L);
                    if (iAbs2 > this.u && (2 & getNestedScrollAxes()) == 0 && i(iAbs, iAbs2)) {
                        this.q = true;
                        this.f2015n = y2;
                        m();
                        this.r.addMovement(motionEvent);
                        this.F = 0;
                        if (!this.G) {
                            this.G = true;
                        }
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.q = false;
            this.C = -1;
            x();
            ri2Var = this.f2014l;
            if (ri2Var != null) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll();
        } else if (i == 5) {
            this.K = (int) motionEvent.getX(0);
            this.L = (int) motionEvent.getY(0);
        } else if (i == 6) {
            v(motionEvent);
        }
        return this.q;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.o = false;
        View view = this.p;
        if (view != null && t(view, this)) {
            scrollToDescendant(this.p);
        }
        this.p = null;
        if (!isLaidOut()) {
            COUISavedState cOUISavedState = this.I;
            if (cOUISavedState != null) {
                m0l.c(this, cOUISavedState.scrollPosition);
                this.I = null;
            }
            int iMax = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > iMax) {
                m0l.c(this, iMax);
            } else if (getScrollY() < 0) {
                m0l.c(this, 0);
            }
        }
        A(getScrollX(), getScrollY());
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.s && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int paddingLeft = getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin;
            int measuredHeight = getMeasuredHeight() - (((getPaddingTop() + getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin);
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, paddingLeft, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        h((int) f2);
        return true;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (getScrollY() == i2 && getScrollX() == i) {
            return;
        }
        if ((i2 < 0 || i2 > getScrollRange()) && this.H) {
            int scrollRange = i2 >= getScrollRange() ? getScrollRange() : 0;
            i2 = uj2.a(scrollRange, i2 - scrollRange, this.i);
        }
        if (getOverScrollMode() == 2 || (getOverScrollMode() == 1 && getChildAt(0).getHeight() <= getScrollableRange())) {
            i2 = Math.min(Math.max(i2, 0), getScrollRange());
        }
        if (getScrollY() >= 0 && i2 < 0 && this.H) {
            w();
            rki rkiVar = this.m;
            if (rkiVar != null) {
                rkiVar.notifyVerticalEdgeReached(i2, 0, this.y);
            }
        }
        if (getScrollY() <= getScrollRange() && i2 > getScrollRange() && this.H) {
            w();
            rki rkiVar2 = this.m;
            if (rkiVar2 != null) {
                rkiVar2.notifyVerticalEdgeReached(i2, getScrollRange(), this.y);
            }
        }
        scrollTo(i, i2);
        n();
        awakenScrollBars();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || r(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        COUISavedState cOUISavedState = (COUISavedState) parcelable;
        super.onRestoreInstanceState(cOUISavedState.getSuperState());
        this.I = cOUISavedState;
        requestLayout();
    }

    @Override // android.widget.ScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        COUISavedState cOUISavedState = new COUISavedState(super.onSaveInstanceState());
        cOUISavedState.scrollPosition = getScrollY();
        return cOUISavedState;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.i = getContext().getResources().getDisplayMetrics().heightPixels;
        ri2 ri2Var = this.f2014l;
        if (ri2Var != null) {
            ri2Var.abortAnimation();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !u(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.k);
        offsetDescendantRectToMyCoords(viewFindFocus, this.k);
        d(computeScrollDeltaToGetChildRectOnScreen(this.k));
    }

    /* JADX WARN: Code duplicated, block: B:72:0x019f  */
    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int i;
        int iB;
        int scrollY;
        m();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.F = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.F);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                boolean zS = s();
                boolean z2 = this.O && this.M;
                if (this.P && this.N && zS) {
                    z = true;
                }
                if (z2 || z) {
                    g(motionEvent);
                }
                if (this.q) {
                    m();
                    VelocityTracker velocityTracker = this.r;
                    velocityTracker.computeCurrentVelocity(1000, this.w);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.C);
                    if (Math.abs(yVelocity) <= this.v) {
                        ri2 ri2Var = this.f2014l;
                        if (ri2Var != null && ri2Var.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                    } else if (getScrollY() < 0) {
                        if (yVelocity > -1500) {
                            ri2 ri2Var2 = this.f2014l;
                            if (ri2Var2 != null) {
                                ri2Var2.setCurrVelocityY(-yVelocity);
                            }
                            ri2 ri2Var3 = this.f2014l;
                            if (ri2Var3 != null && ri2Var3.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                                postInvalidateOnAnimation();
                            }
                        } else {
                            h(-yVelocity);
                        }
                    } else if (getScrollY() <= getScrollRange() || yVelocity >= 1500) {
                        h(-yVelocity);
                    } else {
                        ri2 ri2Var4 = this.f2014l;
                        if (ri2Var4 != null) {
                            ri2Var4.setCurrVelocityY(-yVelocity);
                        }
                        ri2 ri2Var5 = this.f2014l;
                        if (ri2Var5 != null && ri2Var5.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                    }
                    if (getScrollY() < 0 || getScrollY() > getScrollRange()) {
                        w();
                    }
                    this.C = -1;
                    e();
                } else {
                    ri2 ri2Var6 = this.f2014l;
                    if (ri2Var6 != null && ri2Var6.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (actionMasked == 2) {
                ri2 ri2Var7 = this.f2014l;
                if ((ri2Var7 instanceof rki) && this.c0) {
                    ((rki) ri2Var7).D();
                }
                int iFindPointerIndex = motionEvent.findPointerIndex(this.C);
                if (iFindPointerIndex == -1) {
                    Log.e("COUIScrollView", "Invalid pointerId=" + this.C + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.f2015n - y;
                    if (dispatchNestedPreScroll(0, i2, this.E, this.D)) {
                        i2 -= this.E[1];
                        motionEventObtain.offsetLocation(0.0f, this.D[1]);
                        this.F += this.D[1];
                    }
                    if (!this.q && Math.abs(i2) > this.u) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.q = true;
                        i2 = i2 > 0 ? i2 - this.u : i2 + this.u;
                    }
                    int i3 = i2;
                    if (this.q) {
                        this.f2015n = y - this.D[1];
                        int scrollY2 = getScrollY();
                        int scrollRange = getScrollRange();
                        getOverScrollMode();
                        if (getScrollY() < 0) {
                            iB = uj2.b(i3, getScrollY(), this.x);
                        } else {
                            if (getScrollY() > getScrollRange()) {
                                iB = uj2.b(i3, getScrollY() - getScrollRange(), this.x);
                            } else {
                                i = i3;
                            }
                            if (overScrollBy(0, i, 0, getScrollY(), 0, scrollRange, 0, this.x, true) && !hasNestedScrollingParent()) {
                                this.r.clear();
                            }
                            scrollY = getScrollY() - scrollY2;
                            if (dispatchNestedScroll(0, scrollY, 0, i3 - scrollY, this.D)) {
                                int i4 = this.f2015n;
                                int i5 = this.D[1];
                                this.f2015n = i4 - i5;
                                motionEventObtain.offsetLocation(0.0f, i5);
                                this.F += this.D[1];
                            }
                        }
                        i = iB;
                        if (overScrollBy(0, i, 0, getScrollY(), 0, scrollRange, 0, this.x, true)) {
                            this.r.clear();
                        }
                        scrollY = getScrollY() - scrollY2;
                        if (dispatchNestedScroll(0, scrollY, 0, i3 - scrollY, this.D)) {
                            int i6 = this.f2015n;
                            int i7 = this.D[1];
                            this.f2015n = i6 - i7;
                            motionEventObtain.offsetLocation(0.0f, i7);
                            this.F += this.D[1];
                        }
                    }
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.K = (int) motionEvent.getX(actionIndex);
                    int y2 = (int) motionEvent.getY(actionIndex);
                    this.f2015n = y2;
                    this.L = y2;
                    this.C = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    v(motionEvent);
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(this.C);
                    if (iFindPointerIndex2 == -1) {
                        Log.e("COUIScrollView", "Invalid pointerId=" + this.C + " in onTouchEvent ACTION_POINTER_UP");
                    } else {
                        this.f2015n = (int) motionEvent.getY(iFindPointerIndex2);
                    }
                }
            } else if (this.q && getChildCount() > 0) {
                ri2 ri2Var8 = this.f2014l;
                if (ri2Var8 != null && ri2Var8.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.C = -1;
                e();
            }
        } else {
            if (getChildCount() == 0) {
                motionEventObtain.recycle();
                return false;
            }
            ri2 ri2Var9 = this.f2014l;
            if (ri2Var9 != null && !ri2Var9.e() && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            ri2 ri2Var10 = this.f2014l;
            if (ri2Var10 != null && !ri2Var10.e()) {
                this.a0 = this.f2014l.getCurrVelocityY() != 0.0f ? this.Q : 0.0f;
                this.f2014l.abortAnimation();
                if (this.H) {
                    this.H = false;
                }
            }
            this.K = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            this.f2015n = y3;
            this.L = y3;
            this.C = motionEvent.getPointerId(0);
            startNestedScroll(2);
        }
        VelocityTracker velocityTracker2 = this.r;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        rki rkiVar = this.m;
        if (rkiVar == null || i == 0) {
            return;
        }
        rkiVar.abortAnimation();
        this.m.o();
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        onOverScrolled(i3 + i, i4 + i2, false, false);
        return false;
    }

    public final Boolean p() {
        if (this.e0 == null) {
            this.e0 = Boolean.valueOf(bn2.e());
        }
        return this.e0;
    }

    @Override // android.widget.ScrollView
    public boolean pageScroll(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.k.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.k.top + height > childAt.getBottom()) {
                    this.k.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.k.top = getScrollY() - height;
            Rect rect = this.k;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        Rect rect2 = this.k;
        int i2 = rect2.top;
        int i3 = height + i2;
        rect2.bottom = i3;
        return y(i, i2, i3);
    }

    public final boolean q(float f, float f2) {
        return !this.b0 || Math.abs(f) > this.W || Math.abs(f2) > this.W;
    }

    public final boolean r(View view) {
        return !u(view, 0, getHeight());
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && view2.getRevealOnFocusHint()) {
            if (this.o) {
                this.p = view2;
            } else {
                scrollToDescendant(view2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return z(rect, z);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.widget.ScrollView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.o = true;
        super.requestLayout();
    }

    public final boolean s() {
        return getScrollY() < 0 || getScrollY() > getScrollRange();
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            if (getScrollX() == i && getScrollY() == i2) {
                return;
            }
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            if (p().booleanValue()) {
                m0l.b(this, i);
                m0l.c(this, i2);
                onScrollChanged(i, i2, scrollX, scrollY);
            } else {
                super.scrollTo(i, i2);
            }
            if (awakenScrollBars()) {
                return;
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.ScrollView
    public void scrollToDescendant(View view) {
        if (this.o) {
            this.p = view;
            return;
        }
        view.getDrawingRect(this.k);
        offsetDescendantRectToMyCoords(view, this.k);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.k);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    public void setAvoidAccidentalTouch(boolean z) {
        this.b0 = z;
    }

    public void setCustomOverScrollDistFactor(float f) {
        int i = (int) (this.A * f);
        this.x = i;
        this.y = i;
    }

    public void setDispatchEventWhileOverScrolling(boolean z) {
        this.T = z;
    }

    public void setDispatchEventWhileScrolling(boolean z) {
        this.S = z;
    }

    public void setDispatchEventWhileScrollingThreshold(int i) {
        this.U = i;
    }

    public void setEnableFlingSpeedIncrease(boolean z) {
        rki rkiVar = this.m;
        if (rkiVar != null) {
            rkiVar.x(z);
        }
    }

    public void setEnableVibrator(boolean z) {
        this.d0 = z;
    }

    public void setEventFilterTangent(float f) {
        this.V = f;
    }

    public void setFastFlingThreshold(float f) {
        this.W = Math.max(f, 0.0f);
    }

    @Override // android.widget.ScrollView
    public void setFillViewport(boolean z) {
        if (z != this.s) {
            this.s = z;
            requestLayout();
        }
    }

    public void setIsUseOptimizedScroll(boolean z) {
        this.c0 = z;
    }

    public void setItemClickableWhileOverScrolling(boolean z) {
        this.P = z;
    }

    public void setItemClickableWhileSlowScrolling(boolean z) {
        this.O = z;
    }

    @Override // android.widget.ScrollView
    public void setSmoothScrollingEnabled(boolean z) {
        this.t = z;
    }

    public void setSpringOverScrollerDebug(boolean z) {
        rki rkiVar = this.m;
        if (rkiVar != null) {
            rkiVar.w(z);
        }
    }

    public final boolean u(View view, int i, int i2) {
        view.getDrawingRect(this.k);
        offsetDescendantRectToMyCoords(view, this.k);
        return this.k.bottom + i >= getScrollY() && this.k.top - i <= getScrollY() + i2;
    }

    public final void v(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.C) {
            int i = action == 0 ? 1 : 0;
            this.K = (int) motionEvent.getX(i);
            int y = (int) motionEvent.getY(i);
            this.f2015n = y;
            this.L = y;
            this.C = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void w() {
        if (this.d0) {
            performHapticFeedback(307);
        }
    }

    public final void x() {
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.r = null;
        }
    }

    public final boolean y(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View viewF = f(z2, i2, i3);
        if (viewF == null) {
            viewF = this;
        }
        if (i2 < scrollY || i3 > i4) {
            d(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (viewF != findFocus()) {
            viewF.requestFocus(i);
        }
        return z;
    }

    public final boolean z(Rect rect, boolean z) {
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z2 = iComputeScrollDeltaToGetChildRectOnScreen != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            } else {
                B(0, iComputeScrollDeltaToGetChildRectOnScreen);
            }
        }
        return z2;
    }

    public COUIScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIScrollView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUIScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = 0;
        this.k = new Rect();
        this.f2014l = null;
        this.m = null;
        this.o = true;
        this.p = null;
        this.q = false;
        this.t = true;
        this.B = 1.0f;
        this.C = -1;
        this.D = new int[2];
        this.E = new int[2];
        this.G = false;
        this.H = false;
        this.O = true;
        this.P = true;
        this.R = new Paint();
        this.S = false;
        this.T = false;
        this.U = 2500;
        this.V = 20.0f;
        this.W = 1500.0f;
        this.b0 = true;
        this.c0 = true;
        this.d0 = true;
        this.e0 = null;
        k(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIScrollView, i, 0);
        this.d0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIScrollView_couiScrollViewEnableVibrator, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}

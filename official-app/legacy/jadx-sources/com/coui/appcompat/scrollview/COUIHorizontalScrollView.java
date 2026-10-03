package com.coui.appcompat.scrollview;

import android.content.Context;
import android.content.res.TypedArray;
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
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.bn2;
import com.oplus.aiunit.vision.m0l;
import com.oplus.aiunit.vision.ri2;
import com.oplus.aiunit.vision.rki;
import com.oplus.aiunit.vision.uj2;
import com.support.scrollview.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class COUIHorizontalScrollView extends HorizontalScrollView {
    public int A;
    public long B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public boolean J;
    public boolean K;
    public int L;
    public float M;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Boolean U;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2007j;
    public final Rect k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ri2 f2008l;
    public rki m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2009n;
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
        public int scrollOffsetFromStart;

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
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.scrollOffsetFromStart + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.scrollOffsetFromStart);
        }

        public COUISavedState(Parcel parcel) {
            super(parcel);
            this.scrollOffsetFromStart = parcel.readInt();
        }

        public COUISavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.scrollOffsetFromStart = parcel.readInt();
        }
    }

    public COUIHorizontalScrollView(Context context) {
        this(context, null);
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingLeft()) - getPaddingRight()));
        }
        return 0;
    }

    private float getVelocityAlongScrollableDirection() {
        if (this.f2008l == null || (getNestedScrollAxes() & 2) != 0) {
            return 0.0f;
        }
        return this.f2008l.getCurrVelocityX();
    }

    public final boolean a() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getWidth() < (childAt.getWidth() + getPaddingLeft()) + getPaddingRight();
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i) {
        int right;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !q(viewFindNextFocus, maxScrollAmount)) {
            if (i == 17 && getScrollX() < maxScrollAmount) {
                maxScrollAmount = getScrollX();
            } else if (i == 66 && getChildCount() > 0 && (right = getChildAt(0).getRight() - (getScrollX() + getWidth())) < maxScrollAmount) {
                maxScrollAmount = right;
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 66) {
                maxScrollAmount = -maxScrollAmount;
            }
            c(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.k);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.k);
            c(computeScrollDeltaToGetChildRectOnScreen(this.k));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !o(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final boolean b(@NonNull View view, @NonNull MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = true;
        int[] iArr = {0, 1};
        for (int i = 0; i < 2; i++) {
            motionEvent.setAction(iArr[i]);
            zDispatchTouchEvent &= view.dispatchTouchEvent(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    public final void c(int i) {
        if (i != 0) {
            if (this.t) {
                x(i, 0);
            } else {
                scrollBy(i, 0);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void computeScroll() {
        ri2 ri2Var = this.f2008l;
        if (ri2Var == null || !ri2Var.computeScrollOffset()) {
            if (this.R) {
                this.R = false;
                return;
            }
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int iA = this.f2008l.a();
        int iD = this.f2008l.d();
        if (scrollX != iA || scrollY != iD) {
            overScrollBy(iA - scrollX, iD - scrollY, scrollX, scrollY, getScrollRange(), 0, this.y, 0, false);
            onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
        }
        if (awakenScrollBars()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    public final View d(boolean z, int i, int i2) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int left = view2.getLeft();
            int right = view2.getRight();
            if (i < right && left < i2) {
                boolean z3 = i < left && right < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && left < view.getLeft()) || (!z && right > view.getRight());
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

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ri2 ri2Var;
        if (this.J || (this.K && p())) {
            float velocityAlongScrollableDirection = getVelocityAlongScrollableDirection();
            if (motionEvent.getActionMasked() == 0 && this.L >= Math.abs(velocityAlongScrollableDirection)) {
                ri2 ri2Var2 = this.f2008l;
                float f = 0.0f;
                if (ri2Var2 != null && ri2Var2.getCurrVelocityX() != 0.0f) {
                    f = this.I;
                }
                this.O = f;
                ri2 ri2Var3 = this.f2008l;
                if (ri2Var3 != null) {
                    ri2Var3.abortAnimation();
                }
                stopNestedScroll();
            }
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (ri2Var = this.f2008l) != null && ri2Var.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                postInvalidateOnAnimation();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final View e(boolean z, int i, View view) {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength() / 2;
        int i2 = i + horizontalFadingEdgeLength;
        int width = (i + getWidth()) - horizontalFadingEdgeLength;
        return (view == null || view.getLeft() >= width || view.getRight() <= i2) ? d(z, i2, width) : view;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        this.k.setEmpty();
        if (!a()) {
            if (!isFocused()) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 66);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(66)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return !keyEvent.isAltPressed() ? arrowScroll(17) : fullScroll(17);
        }
        if (keyCode == 22) {
            return !keyEvent.isAltPressed() ? arrowScroll(66) : fullScroll(66);
        }
        if (keyCode != 62) {
            return false;
        }
        pageScroll(keyEvent.isShiftPressed() ? 17 : 66);
        return false;
    }

    public final View f(MotionEvent motionEvent) {
        View view = null;
        if (!m(motionEvent)) {
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
                if (zContains && b(childAt, motionEventObtain)) {
                    view = childAt;
                }
                motionEventObtain.recycle();
            }
        }
        return view;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        this.I = i;
        if (getChildCount() > 0) {
            int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
            int iMax = Math.max(0, (getChildAt(0).getRight() - getPaddingLeft()) - width);
            ri2 ri2Var = this.f2008l;
            if (ri2Var != null) {
                ri2Var.fling(getScrollX(), getScrollY(), i, 0, 0, iMax, 0, 0, width / 2, 0);
            }
            if (!this.R) {
                this.R = true;
            }
            boolean z = i > 0;
            View viewFindFocus = findFocus();
            ri2 ri2Var2 = this.f2008l;
            View viewE = e(z, ri2Var2 != null ? ri2Var2.c() : 0, viewFindFocus);
            if (viewE == null) {
                viewE = this;
            }
            if (viewE != viewFindFocus) {
                viewE.requestFocus(z ? 66 : 17);
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean fullScroll(int i) {
        boolean z = i == 66;
        int width = getWidth();
        Rect rect = this.k;
        rect.left = 0;
        rect.right = width;
        if (z && getChildCount() > 0) {
            this.k.right = getChildAt(0).getRight();
            Rect rect2 = this.k;
            rect2.left = rect2.right - width;
        }
        Rect rect3 = this.k;
        return u(i, rect3.left, rect3.right);
    }

    public final boolean g(float f, float f2) {
        return !(this.J || (this.K && p())) || f2 == 0.0f || ((double) Math.abs(f / f2)) > Math.tan(((double) this.M) * 0.017453292519943295d);
    }

    public int getScrollableRange() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final boolean h(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollX = getScrollX();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() && i2 < childAt.getBottom() && i >= childAt.getLeft() - scrollX && i < childAt.getRight() - scrollX;
    }

    public final void i(Context context) {
        if (this.f2008l == null) {
            rki rkiVar = new rki(context);
            this.m = rkiVar;
            rkiVar.B(3.2f);
            this.m.y(true);
            this.f2008l = this.m;
            setEnableFlingSpeedIncrease(true);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.w = viewConfiguration.getScaledMaximumFlingVelocity();
        int i = displayMetrics.widthPixels;
        this.x = i;
        this.y = i;
        this.i = i;
        this.z = viewConfiguration.getScaledHorizontalScrollFactor();
        setOverScrollMode(0);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean isFillViewport() {
        return this.s;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean isSmoothScrollingEnabled() {
        return this.t;
    }

    public final void j() {
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker == null) {
            this.r = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void k() {
        if (this.r == null) {
            this.r = VelocityTracker.obtain();
        }
    }

    public void l() {
        if (isHardwareAccelerated() && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() - this.C);
        return System.currentTimeMillis() - this.B < 100 && ((int) Math.sqrt((double) (x * x))) < 10;
    }

    public final Boolean n() {
        if (this.U == null) {
            this.U = Boolean.valueOf(bn2.e());
        }
        return this.U;
    }

    public final boolean o(View view) {
        return !q(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.Q) {
            this.Q = false;
        }
        if (this.R) {
            this.R = false;
        }
        rki rkiVar = this.m;
        if (rkiVar != null) {
            rkiVar.o();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.q) {
            if (motionEvent.isFromSource(2)) {
                axisValue = (motionEvent.getMetaState() & 1) != 0 ? -motionEvent.getAxisValue(9) : motionEvent.getAxisValue(10);
            } else {
                axisValue = motionEvent.isFromSource(4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            }
            int iRound = Math.round(axisValue * this.z);
            if (iRound != 0) {
                int scrollRange = getScrollRange();
                int scrollX = getScrollX();
                int i = iRound + scrollX;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollX) {
                    super.scrollTo(scrollRange, getScrollY());
                    return true;
                }
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ri2 ri2Var;
        int action = motionEvent.getAction();
        if (action == 2 && this.q) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            ri2 ri2Var2 = this.f2008l;
            float currVelocityX = ri2Var2 != null ? ri2Var2.getCurrVelocityX() : 0.0f;
            this.E = Math.abs(currVelocityX) > 0.0f && Math.abs(currVelocityX) < 250.0f && ((Math.abs(this.I) > 1500.0f ? 1 : (Math.abs(this.I) == 1500.0f ? 0 : -1)) > 0);
            this.F = p();
            this.B = System.currentTimeMillis();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (h(x, (int) motionEvent.getY())) {
                this.f2009n = x;
                this.C = x;
                this.D = y;
                this.A = motionEvent.getPointerId(0);
                j();
                this.r.addMovement(motionEvent);
                ri2 ri2Var3 = this.f2008l;
                this.q = (ri2Var3 == null || ri2Var3.e()) ? false : true;
            } else {
                this.q = false;
                t();
            }
        } else if (i == 1) {
            this.q = false;
            this.A = -1;
            ri2Var = this.f2008l;
            if (ri2Var != null && ri2Var.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                postInvalidateOnAnimation();
            }
        } else if (i == 2) {
            int i2 = this.A;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("COUIHorScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int x2 = (int) motionEvent.getX(iFindPointerIndex);
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int iAbs = Math.abs(x2 - this.C);
                    int iAbs2 = Math.abs(y2 - this.D);
                    if (iAbs > this.u && (getNestedScrollAxes() & 1) == 0 && g(iAbs, iAbs2)) {
                        this.q = true;
                        this.f2009n = x2;
                        k();
                        this.r.addMovement(motionEvent);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.q = false;
            this.A = -1;
            ri2Var = this.f2008l;
            if (ri2Var != null) {
                postInvalidateOnAnimation();
            }
        } else if (i == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int x3 = (int) motionEvent.getX(actionIndex);
            this.f2009n = x3;
            this.C = x3;
            this.D = (int) motionEvent.getY(actionIndex);
            this.A = motionEvent.getPointerId(actionIndex);
        } else if (i == 6) {
            r(motionEvent);
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.A);
            if (iFindPointerIndex2 == -1) {
                Log.e("COUIHorScrollView", "Invalid pointerId=" + this.A + " in onInterceptTouchEvent ACTION_POINTER_UP");
            } else {
                int x4 = (int) motionEvent.getX(iFindPointerIndex2);
                this.f2009n = x4;
                this.C = x4;
                this.D = (int) motionEvent.getY(iFindPointerIndex2);
            }
        }
        return this.q;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.s && View.MeasureSpec.getMode(i) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int paddingLeft = getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin;
            int paddingTop = getPaddingTop() + getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin;
            int measuredWidth = getMeasuredWidth() - paddingLeft;
            if (childAt.getMeasuredWidth() < measuredWidth) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), ViewGroup.getChildMeasureSpec(i2, paddingTop, layoutParams.height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (getScrollY() == i2 && getScrollX() == i) {
            return;
        }
        if ((i < 0 || i > getScrollRange()) && this.R) {
            int scrollRange = i >= getScrollRange() ? getScrollRange() : 0;
            i = uj2.a(scrollRange, i - scrollRange, this.i);
        }
        if (getOverScrollMode() == 2 || (getOverScrollMode() == 1 && getChildAt(0).getWidth() <= getScrollableRange())) {
            i = Math.min(Math.max(i, 0), getScrollRange());
        }
        if (getScrollX() >= 0 && i < 0 && this.R) {
            s();
            rki rkiVar = this.m;
            if (rkiVar != null) {
                rkiVar.notifyHorizontalEdgeReached(i, 0, this.y);
            }
        }
        if (getScrollX() <= getScrollRange() && i > getScrollRange() && this.R) {
            s();
            rki rkiVar2 = this.m;
            if (rkiVar2 != null) {
                rkiVar2.notifyHorizontalEdgeReached(i, getScrollRange(), this.y);
            }
        }
        if (n().booleanValue()) {
            m0l.b(this, i);
            m0l.c(this, i2);
        } else {
            super.scrollTo(i, i2);
        }
        l();
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 66;
        } else if (i == 1) {
            i = 17;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || o(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = getContext().getResources().getDisplayMetrics().widthPixels;
        this.x = i5;
        this.y = i5;
        this.i = i5;
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !q(viewFindFocus, getRight() - getLeft())) {
            return;
        }
        viewFindFocus.getDrawingRect(this.k);
        offsetDescendantRectToMyCoords(viewFindFocus, this.k);
        c(computeScrollDeltaToGetChildRectOnScreen(this.k));
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        k();
        this.r.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                boolean zP = p();
                boolean z = this.G && this.E;
                boolean z2 = this.H && this.F && zP;
                if (z || z2) {
                    f(motionEvent);
                }
                if (this.q) {
                    k();
                    VelocityTracker velocityTracker = this.r;
                    velocityTracker.computeCurrentVelocity(1000, this.w);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.A);
                    if (Math.abs(xVelocity) <= this.v) {
                        ri2 ri2Var = this.f2008l;
                        if (ri2Var != null && ri2Var.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                            postInvalidateOnAnimation();
                        }
                    } else if (getScrollX() < 0) {
                        if (xVelocity > -1500) {
                            ri2 ri2Var2 = this.f2008l;
                            if (ri2Var2 != null) {
                                ri2Var2.setCurrVelocityX(-xVelocity);
                            }
                            ri2 ri2Var3 = this.f2008l;
                            if (ri2Var3 != null && ri2Var3.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                                postInvalidateOnAnimation();
                            }
                        } else {
                            fling(-xVelocity);
                        }
                    } else if (getScrollX() <= getScrollRange()) {
                        if (getScrollX() > 0 && getScrollX() < getScrollRange()) {
                            fling(-xVelocity);
                        }
                    } else if (xVelocity < 1500) {
                        ri2 ri2Var4 = this.f2008l;
                        if (ri2Var4 != null) {
                            ri2Var4.setCurrVelocityX(-xVelocity);
                        }
                        ri2 ri2Var5 = this.f2008l;
                        if (ri2Var5 != null && ri2Var5.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                            postInvalidateOnAnimation();
                        }
                    } else {
                        fling(-xVelocity);
                    }
                    if (getScrollX() < 0 || getScrollX() > getScrollRange()) {
                        s();
                    }
                    this.A = -1;
                    this.q = false;
                    t();
                } else {
                    ri2 ri2Var6 = this.f2008l;
                    if (ri2Var6 != null && ri2Var6.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 2) {
                ri2 ri2Var7 = this.f2008l;
                if ((ri2Var7 instanceof rki) && this.S) {
                    ((rki) ri2Var7).D();
                }
                int iFindPointerIndex = motionEvent.findPointerIndex(this.A);
                if (iFindPointerIndex == -1) {
                    Log.e("COUIHorScrollView", "Invalid pointerId=" + this.A + " in onTouchEvent");
                } else {
                    int x = (int) motionEvent.getX(iFindPointerIndex);
                    int iB = this.f2009n - x;
                    if (!this.q && Math.abs(iB) > this.u) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.q = true;
                        iB = iB > 0 ? iB - this.u : iB + this.u;
                    }
                    if (this.q) {
                        this.f2009n = x;
                        int scrollRange = getScrollRange();
                        if (getScrollX() < 0) {
                            iB = uj2.b(iB, getScrollX(), this.x);
                        } else if (getScrollX() > getScrollRange()) {
                            iB = uj2.b(iB, getScrollX() - getScrollRange(), this.x);
                        }
                        if (overScrollBy(iB, 0, getScrollX(), 0, scrollRange, 0, this.x, 0, true) && !hasNestedScrollingParent()) {
                            this.r.clear();
                        }
                    }
                }
            } else if (action != 3) {
                if (action == 6) {
                    r(motionEvent);
                }
            } else if (this.q && getChildCount() > 0) {
                ri2 ri2Var8 = this.f2008l;
                if (ri2Var8 != null && ri2Var8.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                    postInvalidateOnAnimation();
                }
                this.A = -1;
                this.q = false;
                t();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            ri2 ri2Var9 = this.f2008l;
            if (ri2Var9 != null && !ri2Var9.e() && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            ri2 ri2Var10 = this.f2008l;
            if (ri2Var10 != null && !ri2Var10.e()) {
                this.O = this.f2008l.getCurrVelocityX() != 0.0f ? this.I : 0.0f;
                this.f2008l.abortAnimation();
                if (this.R) {
                    this.R = false;
                }
            }
            int x2 = (int) motionEvent.getX();
            this.f2009n = x2;
            this.C = x2;
            this.D = (int) motionEvent.getY();
            this.A = motionEvent.getPointerId(0);
        }
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        rki rkiVar;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (rkiVar = this.m) == null) {
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

    public final boolean p() {
        return getScrollX() < 0 || getScrollX() > getScrollRange();
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i) {
        boolean z = i == 66;
        int width = getWidth();
        if (z) {
            this.k.left = getScrollX() + width;
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (this.k.left + width > childAt.getRight()) {
                    this.k.left = childAt.getRight() - width;
                }
            }
        } else {
            this.k.left = getScrollX() - width;
            Rect rect = this.k;
            if (rect.left < 0) {
                rect.left = 0;
            }
        }
        Rect rect2 = this.k;
        int i2 = rect2.left;
        int i3 = width + i2;
        rect2.right = i3;
        return u(i, i2, i3);
    }

    public final boolean q(View view, int i) {
        view.getDrawingRect(this.k);
        offsetDescendantRectToMyCoords(view, this.k);
        return this.k.right + i >= getScrollX() && this.k.left - i <= getScrollX() + getWidth();
    }

    public final void r(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.A) {
            int i = action == 0 ? 1 : 0;
            int x = (int) motionEvent.getX(i);
            this.f2009n = x;
            this.C = x;
            this.D = (int) motionEvent.getY(i);
            this.A = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && view2.getRevealOnFocusHint()) {
            if (this.o) {
                this.p = view2;
            } else {
                v(view2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return w(rect, z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            t();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.o = true;
        super.requestLayout();
    }

    public final void s() {
        if (this.T) {
            performHapticFeedback(307);
        }
    }

    public void setAvoidAccidentalTouch(boolean z) {
        this.P = z;
    }

    public void setDispatchEventWhileOverScrolling(boolean z) {
        this.K = z;
    }

    public void setDispatchEventWhileScrolling(boolean z) {
        this.J = z;
    }

    public void setDispatchEventWhileScrollingThreshold(int i) {
        this.L = i;
    }

    public void setEnableFlingSpeedIncrease(boolean z) {
        rki rkiVar = this.m;
        if (rkiVar != null) {
            rkiVar.x(z);
        }
    }

    public void setEnableVibrator(boolean z) {
        this.T = z;
    }

    public void setEventFilterTangent(float f) {
        this.M = f;
    }

    public void setFastFlingThreshold(float f) {
        this.N = Math.max(f, 0.0f);
    }

    @Override // android.widget.HorizontalScrollView
    public void setFillViewport(boolean z) {
        if (z != this.s) {
            this.s = z;
            requestLayout();
        }
    }

    public void setIsUseOptimizedScroll(boolean z) {
        this.S = z;
    }

    public void setItemClickableWhileOverScrolling(boolean z) {
        this.H = z;
    }

    public void setItemClickableWhileSlowScrolling(boolean z) {
        this.G = z;
    }

    @Override // android.widget.HorizontalScrollView
    public void setSmoothScrollingEnabled(boolean z) {
        this.t = z;
    }

    public void setSpringOverScrollerDebug(boolean z) {
        rki rkiVar = this.m;
        if (rkiVar != null) {
            rkiVar.w(z);
        }
    }

    public final void t() {
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.r = null;
        }
    }

    public final boolean u(int i, int i2, int i3) {
        int width = getWidth();
        int scrollX = getScrollX();
        int i4 = width + scrollX;
        boolean z = false;
        boolean z2 = i == 17;
        View viewD = d(z2, i2, i3);
        if (viewD == null) {
            viewD = this;
        }
        if (i2 < scrollX || i3 > i4) {
            c(z2 ? i2 - scrollX : i3 - i4);
            z = true;
        }
        if (viewD != findFocus()) {
            viewD.requestFocus(i);
        }
        return z;
    }

    public final void v(View view) {
        view.getDrawingRect(this.k);
        offsetDescendantRectToMyCoords(view, this.k);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.k);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(iComputeScrollDeltaToGetChildRectOnScreen, 0);
        }
    }

    public final boolean w(Rect rect, boolean z) {
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z2 = iComputeScrollDeltaToGetChildRectOnScreen != 0;
        if (z2) {
            if (z) {
                scrollBy(iComputeScrollDeltaToGetChildRectOnScreen, 0);
            } else {
                x(iComputeScrollDeltaToGetChildRectOnScreen, 0);
            }
        }
        return z2;
    }

    public final void x(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2007j > 250) {
            int iMax = Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingRight()) - getPaddingLeft()));
            int scrollX = getScrollX();
            int iMax2 = Math.max(0, Math.min(i + scrollX, iMax)) - scrollX;
            ri2 ri2Var = this.f2008l;
            if (ri2Var != null) {
                ri2Var.startScroll(scrollX, getScrollY(), iMax2, 0);
            }
            postInvalidateOnAnimation();
        } else {
            ri2 ri2Var2 = this.f2008l;
            if (ri2Var2 != null && !ri2Var2.e()) {
                this.O = this.f2008l.getCurrVelocityX() != 0.0f ? this.I : 0.0f;
                this.f2008l.abortAnimation();
                if (this.R) {
                    this.R = false;
                }
            }
            scrollBy(i, i2);
        }
        this.f2007j = AnimationUtils.currentAnimationTimeMillis();
    }

    public COUIHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        this.k = new Rect();
        this.f2008l = null;
        this.m = null;
        this.o = true;
        this.p = null;
        this.q = false;
        this.t = true;
        this.A = -1;
        this.G = true;
        this.H = true;
        this.J = false;
        this.K = false;
        this.L = 2500;
        this.M = 20.0f;
        this.N = 1500.0f;
        this.P = true;
        this.Q = false;
        this.R = false;
        this.S = true;
        this.T = true;
        this.U = null;
        i(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIHorizontalScrollView, i, 0);
        this.T = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIHorizontalScrollView_couiScrollViewEnableVibrator, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public COUIHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = 0;
        this.k = new Rect();
        this.f2008l = null;
        this.m = null;
        this.o = true;
        this.p = null;
        this.q = false;
        this.t = true;
        this.A = -1;
        this.G = true;
        this.H = true;
        this.J = false;
        this.K = false;
        this.L = 2500;
        this.M = 20.0f;
        this.N = 1500.0f;
        this.P = true;
        this.Q = false;
        this.R = false;
        this.S = true;
        this.T = true;
        this.U = null;
        i(context);
    }
}

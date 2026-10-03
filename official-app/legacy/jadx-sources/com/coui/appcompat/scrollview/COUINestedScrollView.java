package com.coui.appcompat.scrollview;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.oplus.aiunit.vision.bn2;
import com.oplus.aiunit.vision.m0l;
import com.oplus.aiunit.vision.ri2;
import com.oplus.aiunit.vision.rki;
import com.oplus.aiunit.vision.uj2;
import com.support.scrollview.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class COUINestedScrollView extends NestedScrollView {
    public ArrayList<a> A;
    public boolean B;
    public final Rect C;
    public ri2 D;
    public rki E;
    public int F;
    public boolean G;
    public boolean H;
    public View I;
    public boolean J;
    public VelocityTracker K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final int[] Q;
    public final int[] R;
    public int S;
    public int T;
    public int U;
    public int V;
    public COUISavedState W;
    public float a0;
    public boolean b0;
    public Boolean c0;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f2010j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2011l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2012n;
    public boolean o;
    public boolean p;
    public float q;
    public Paint r;
    public boolean s;
    public boolean t;
    public int u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

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

        @NonNull
        public String toString() {
            return "NestedScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.scrollPosition + "}";
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

        public COUISavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.scrollPosition = parcel.readInt();
        }
    }

    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    public interface b {
    }

    public COUINestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    public static int clamp(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVelocityAlongScrollableDirection() {
        if (this.D == null || (getNestedScrollAxes() & 2) != 0) {
            return 0.0f;
        }
        return this.D.getCurrVelocityY();
    }

    private float getVerticalScrollFactorCompat() {
        if (this.a0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.a0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.a0;
    }

    public static boolean isViewDescendantOf(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && isViewDescendantOf((View) parent, view2);
    }

    public final boolean a(float f, float f2) {
        return !(this.s || (this.t && isOverScrolling())) || f == 0.0f || ((double) Math.abs(f2 / f)) > Math.tan(((double) this.v) * 0.017453292519943295d);
    }

    public final void abortAnimatedScroll() {
        ri2 ri2Var = this.D;
        if (ri2Var != null) {
            ri2Var.abortAnimation();
        }
        stopNestedScroll(1);
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean arrowScroll(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !isWithinDeltaOfScreen(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            doScrollY(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.C);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.C);
            doScrollY(computeScrollDeltaToGetChildRectOnScreen(this.C));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !isOffScreen(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final Boolean b() {
        if (this.c0 == null) {
            this.c0 = Boolean.valueOf(bn2.e());
        }
        return this.c0;
    }

    public final boolean c(float f, float f2) {
        return !this.y || Math.abs(f) > this.w || Math.abs(f2) > this.w;
    }

    public final boolean canScroll() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void computeScroll() {
        ri2 ri2Var = this.D;
        if (ri2Var == null || !ri2Var.computeScrollOffset()) {
            if (this.b0) {
                this.b0 = false;
                return;
            }
            return;
        }
        int iD = this.D.d();
        if (!canScroll() && getOverScrollMode() != 0 && (iD < 0 || iD > getScrollRange())) {
            abortAnimatedScroll();
            this.D.abortAnimation();
            return;
        }
        int i = iD - this.T;
        this.T = iD;
        int[] iArr = this.R;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, i, iArr, null, 1);
        int i2 = i - this.R[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            overScrollByCompat(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, this.V, false);
            int scrollY2 = getScrollY() - scrollY;
            int[] iArr2 = this.R;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i2 - scrollY2, this.Q, 1, iArr2);
            int i3 = this.R[1];
        }
        if (this.D.e()) {
            stopNestedScroll(1);
        } else {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public final void d() {
        if (this.B) {
            performHapticFeedback(307);
        }
    }

    public final boolean dispatchClickEvent(@NonNull View view, @NonNull MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = true;
        int[] iArr = {0, 1};
        for (int i = 0; i < 2; i++) {
            motionEvent.setAction(iArr[i]);
            zDispatchTouchEvent &= view.dispatchTouchEvent(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ri2 ri2Var;
        if (this.s || (this.t && isOverScrolling())) {
            float velocityAlongScrollableDirection = getVelocityAlongScrollableDirection();
            Log.d("COUINestedScrollView", "dispatchTouchEvent: current velocity " + velocityAlongScrollableDirection + " threshold " + this.u);
            if (motionEvent.getActionMasked() == 0 && this.u >= Math.abs(velocityAlongScrollableDirection)) {
                ri2 ri2Var2 = this.D;
                float f = 0.0f;
                if (ri2Var2 != null && ri2Var2.getCurrVelocityY() != 0.0f) {
                    f = this.q;
                }
                this.x = f;
                ri2 ri2Var3 = this.D;
                if (ri2Var3 != null) {
                    ri2Var3.abortAnimation();
                }
                stopNestedScroll();
            }
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (ri2Var = this.D) != null && ri2Var.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void doScrollY(int i) {
        if (i != 0) {
            if (this.L) {
                smoothScrollBy(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    public final void e(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int iClamp = clamp(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int iClamp2 = clamp(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (iClamp == getScrollX() && iClamp2 == getScrollY()) {
                return;
            }
            scrollTo(iClamp, iClamp2);
        }
    }

    public final void endDrag() {
        this.J = false;
        recycleVelocityTracker();
        stopNestedScroll(0);
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        this.C.setEmpty();
        if (!canScroll()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
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
    public final View findFocusableViewInBounds(boolean z, int i, int i2) {
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

    public final View findViewToDispatchClickEvent(MotionEvent motionEvent) {
        View view = null;
        if (!isClickEvent(motionEvent)) {
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
                if (zContains && dispatchClickEvent(childAt, motionEventObtain)) {
                    view = childAt;
                }
                motionEventObtain.recycle();
            }
        }
        Log.d("COUINestedScrollView", "findViewToDispatchClickEvent: target: " + view);
        return view;
    }

    @Override // androidx.core.widget.NestedScrollView
    public void fling(int i) {
        this.q = i;
        if (getChildCount() > 0) {
            ri2 ri2Var = this.D;
            if (ri2Var != null) {
                ri2Var.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            }
            runAnimatedScroll(true);
            if (this.b0) {
                return;
            }
            this.b0 = true;
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean fullScroll(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.C;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.C.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.C;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.C;
        return scrollAndFocus(i, rect3.top, rect3.bottom);
    }

    public int getCOUIScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public int getScrollableRange() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final boolean inChild(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    public final void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker == null) {
            this.K = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void initScrollView(Context context) {
        if (this.D == null) {
            rki rkiVar = new rki(context);
            this.E = rkiVar;
            rkiVar.B(2.15f);
            this.E.y(true);
            this.D = this.E;
            setEnableFlingSpeedIncrease(true);
        }
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.M = viewConfiguration.getScaledTouchSlop();
        this.N = viewConfiguration.getScaledMinimumFlingVelocity();
        this.O = viewConfiguration.getScaledMaximumFlingVelocity();
        int i = displayMetrics.heightPixels;
        this.U = i;
        this.V = i;
        this.i = i;
    }

    public final void initVelocityTrackerIfNotExists() {
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
    }

    public void invalidateParentIfNeeded() {
        if (isHardwareAccelerated() && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean isClickEvent(MotionEvent motionEvent) {
        int y = (int) (motionEvent.getY() - this.f2011l);
        return System.currentTimeMillis() - this.f2010j < 100 && ((int) Math.sqrt((double) (y * y))) < 10;
    }

    public final boolean isOffScreen(View view) {
        return !isWithinDeltaOfScreen(view, 0, getHeight());
    }

    public final boolean isOverScrolling() {
        return getScrollY() < 0 || getScrollY() > getScrollRange();
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean isSmoothScrollingEnabled() {
        return this.L;
    }

    public final boolean isWithinDeltaOfScreen(View view, int i, int i2) {
        view.getDrawingRect(this.C);
        offsetDescendantRectToMyCoords(view, this.C);
        return this.C.bottom + i >= getScrollY() && this.C.top - i <= getScrollY() + i2;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rki rkiVar = this.E;
        if (rkiVar != null) {
            rkiVar.o();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.J) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ri2 ri2Var;
        int action = motionEvent.getAction();
        if (action == 2 && this.J) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            ri2 ri2Var2 = this.D;
            float currVelocityY = ri2Var2 != null ? ri2Var2.getCurrVelocityY() : 0.0f;
            boolean zC = c(this.q, this.x);
            this.m = Math.abs(currVelocityY) > 0.0f && Math.abs(currVelocityY) < 250.0f && zC;
            this.f2012n = isOverScrolling();
            this.f2010j = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("onInterceptTouchEvent: ACTION_DOWN, isFastFlingY = ");
            sb.append(zC);
            sb.append(", isSlowScrolling = ");
            sb.append(this.m);
            sb.append(", \nMath.abs(scrollVelocityY) > 0 = ");
            sb.append(Math.abs(currVelocityY) > 0.0f);
            sb.append(", \nscrollVelocityY = ");
            sb.append(currVelocityY);
            sb.append(", \nMath.abs(scrollVelocityY) < SLOW_SCROLL_THRESHOLD = ");
            sb.append(Math.abs(currVelocityY) < 250.0f);
            sb.append(", \nisOverScrolling = ");
            sb.append(this.f2012n);
            sb.append(", scrollVelocityY = ");
            sb.append(Math.abs(currVelocityY));
            sb.append(", mFlingVelocityY = ");
            sb.append(this.q);
            Log.d("COUINestedScrollView", sb.toString());
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (inChild((int) motionEvent.getX(), y)) {
                this.k = x;
                this.F = y;
                this.f2011l = y;
                this.P = motionEvent.getPointerId(0);
                initOrResetVelocityTracker();
                this.K.addMovement(motionEvent);
                ri2 ri2Var3 = this.D;
                if (ri2Var3 != null) {
                    ri2Var3.computeScrollOffset();
                }
                ri2 ri2Var4 = this.D;
                this.J = (ri2Var4 == null || ri2Var4.e()) ? false : true;
                startNestedScroll(2, 0);
            } else {
                this.J = false;
                recycleVelocityTracker();
            }
        } else if (i == 1) {
            this.J = false;
            this.P = -1;
            recycleVelocityTracker();
            ri2Var = this.D;
            if (ri2Var != null && ri2Var.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            stopNestedScroll(0);
        } else if (i == 2) {
            int i2 = this.P;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("COUINestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int x2 = (int) motionEvent.getX(iFindPointerIndex);
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int iAbs = Math.abs(x2 - this.k);
                    int iAbs2 = Math.abs(y2 - this.f2011l);
                    if (iAbs2 > this.M && (2 & getNestedScrollAxes()) == 0 && a(iAbs, iAbs2)) {
                        this.J = true;
                        this.F = y2;
                        initVelocityTrackerIfNotExists();
                        this.K.addMovement(motionEvent);
                        this.S = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.J = false;
            this.P = -1;
            recycleVelocityTracker();
            ri2Var = this.D;
            if (ri2Var != null) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            stopNestedScroll(0);
        } else if (i == 5) {
            this.k = (int) motionEvent.getX(0);
            this.f2011l = (int) motionEvent.getY(0);
        } else if (i == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        return this.J;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        super.onLayout(z, i, i2, i3, i4);
        this.G = false;
        View view = this.I;
        if (view != null && isViewDescendantOf(view, this)) {
            scrollToChild(this.I);
        }
        this.I = null;
        if (!this.H) {
            if (this.W != null) {
                scrollTo(getScrollX(), this.W.scrollPosition);
                this.W = null;
            }
            m0l.c(this, scrollY);
        }
        m0l.c(this, scrollY);
        e(getScrollX(), getScrollY());
        this.H = true;
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        onNestedScrollInternal(i4, i5, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    public final void onNestedScrollInternal(int i, int i2, @Nullable int[] iArr) {
        int scrollRange;
        int scrollY = getScrollY();
        if (getOverScrollMode() != 2 && (getOverScrollMode() != 1 || getChildAt(0).getHeight() > getHeight())) {
            scrollRange = i;
        } else if (getScrollY() + i < 0) {
            scrollRange = -getScrollY();
        } else if (getScrollY() + i > getScrollRange()) {
            scrollRange = getScrollRange() - getScrollY();
        } else {
            scrollRange = i;
        }
        scrollBy(0, scrollRange);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        dispatchNestedScroll(0, scrollY2, 0, scrollRange - scrollY2, null, i2, iArr);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (getScrollY() == i2 && getScrollX() == i) {
            return;
        }
        if ((i2 < 0 || i2 > getScrollRange()) && this.b0) {
            int scrollRange = i2 >= getScrollRange() ? getScrollRange() : 0;
            i2 = uj2.a(scrollRange, i2 - scrollRange, this.i);
        }
        if (getOverScrollMode() == 2 || (getOverScrollMode() == 1 && getChildAt(0).getHeight() <= getScrollableRange())) {
            i2 = Math.min(Math.max(i2, 0), getScrollRange());
        }
        if (getScrollY() >= 0 && i2 < 0 && this.b0) {
            d();
            rki rkiVar = this.E;
            if (rkiVar != null) {
                rkiVar.notifyVerticalEdgeReached(i2, 0, this.V);
            }
        }
        if (getScrollY() <= getScrollRange() && i2 > getScrollRange() && this.b0) {
            d();
            rki rkiVar2 = this.E;
            if (rkiVar2 != null) {
                rkiVar2.notifyVerticalEdgeReached(i2, getScrollRange(), this.V);
            }
        }
        this.T = i2;
        scrollTo(i, i2);
        invalidateParentIfNeeded();
        awakenScrollBars();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || isOffScreen(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof COUISavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        COUISavedState cOUISavedState = (COUISavedState) parcelable;
        super.onRestoreInstanceState(cOUISavedState.getSuperState());
        this.W = cOUISavedState;
        requestLayout();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        COUISavedState cOUISavedState = new COUISavedState(super.onSaveInstanceState());
        cOUISavedState.scrollPosition = getScrollY();
        return cOUISavedState;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        for (int i5 = 0; i5 < this.A.size(); i5++) {
            this.A.get(i5).a(i, i2, i3, i4);
        }
    }

    public final void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i = actionIndex == 0 ? 1 : 0;
            this.k = (int) motionEvent.getX(i);
            int y = (int) motionEvent.getY(i);
            this.F = y;
            this.f2011l = y;
            this.P = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.i = getContext().getResources().getDisplayMetrics().heightPixels;
        if (getScrollY() > getScrollRange()) {
            m0l.c(this, getScrollRange());
            scrollTo(getScrollX(), getScrollY());
        }
        ri2 ri2Var = this.D;
        if (ri2Var != null) {
            ri2Var.abortAnimation();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !isWithinDeltaOfScreen(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.C);
        offsetDescendantRectToMyCoords(viewFindFocus, this.C);
        doScrollY(computeScrollDeltaToGetChildRectOnScreen(this.C));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        ri2 ri2Var;
        initVelocityTrackerIfNotExists();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.S = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.S);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                boolean zIsOverScrolling = isOverScrolling();
                boolean z2 = this.o && this.m;
                if (this.p && this.f2012n && zIsOverScrolling) {
                    z = true;
                }
                if (z2 || z) {
                    findViewToDispatchClickEvent(motionEvent);
                }
                if (this.J) {
                    initVelocityTrackerIfNotExists();
                    VelocityTracker velocityTracker = this.K;
                    velocityTracker.computeCurrentVelocity(1000, this.O);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.P);
                    if (Math.abs(yVelocity) <= this.N) {
                        ri2 ri2Var2 = this.D;
                        if (ri2Var2 != null && ri2Var2.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            ViewCompat.postInvalidateOnAnimation(this);
                        }
                    } else if (getScrollY() < 0) {
                        if (yVelocity > -1500) {
                            ri2 ri2Var3 = this.D;
                            if (ri2Var3 != null) {
                                ri2Var3.setCurrVelocityY(-yVelocity);
                            }
                            ri2 ri2Var4 = this.D;
                            if (ri2Var4 != null && ri2Var4.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                                ViewCompat.postInvalidateOnAnimation(this);
                            }
                        } else {
                            int i = -yVelocity;
                            float f = i;
                            if (!dispatchNestedPreFling(0.0f, f)) {
                                dispatchNestedFling(0.0f, f, true);
                                fling(i);
                            }
                        }
                    } else if (getScrollY() <= getScrollRange()) {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            fling(i2);
                        }
                    } else if (yVelocity < 1500) {
                        ri2 ri2Var5 = this.D;
                        if (ri2Var5 != null) {
                            ri2Var5.setCurrVelocityY(-yVelocity);
                        }
                        ri2 ri2Var6 = this.D;
                        if (ri2Var6 != null && ri2Var6.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            ViewCompat.postInvalidateOnAnimation(this);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f3 = i3;
                        if (!dispatchNestedPreFling(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            fling(i3);
                        }
                    }
                    if (getScrollY() < 0 || getScrollY() > getScrollRange()) {
                        d();
                    }
                    this.P = -1;
                    endDrag();
                }
            } else if (actionMasked == 2) {
                ri2 ri2Var7 = this.D;
                if ((ri2Var7 instanceof rki) && this.z) {
                    ((rki) ri2Var7).D();
                }
                int iFindPointerIndex = motionEvent.findPointerIndex(this.P);
                if (iFindPointerIndex == -1) {
                    Log.e("COUINestedScrollView", "Invalid pointerId=" + this.P + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.F - y;
                    if (!this.J && Math.abs(i4) > this.M) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.J = true;
                        i4 = i4 > 0 ? i4 - this.M : i4 + this.M;
                    }
                    int iB = i4;
                    if (this.J) {
                        if (dispatchNestedPreScroll(0, iB, this.R, this.Q, 0)) {
                            iB -= this.R[1];
                            this.S += this.Q[1];
                        }
                        this.F = y - this.Q[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        if (getScrollY() < 0) {
                            iB = uj2.b(iB, getScrollY(), this.U);
                        } else if (getScrollY() > getScrollRange()) {
                            iB = uj2.b(iB, getScrollY() - getScrollRange(), this.U);
                        }
                        int i5 = iB;
                        if (overScrollByCompat(0, i5, 0, getScrollY(), 0, scrollRange, 0, this.V, true) && !hasNestedScrollingParent(0)) {
                            this.K.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.R;
                        iArr[1] = 0;
                        dispatchNestedScroll(0, scrollY2, 0, i5 - scrollY2, this.Q, 0, iArr);
                        int i6 = this.F;
                        int i7 = this.Q[1];
                        this.F = i6 - i7;
                        this.S += i7;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.J && getChildCount() > 0 && (ri2Var = this.D) != null && ri2Var.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                this.P = -1;
                endDrag();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.k = (int) motionEvent.getX(actionIndex);
                int y2 = (int) motionEvent.getY(actionIndex);
                this.F = y2;
                this.f2011l = y2;
                this.P = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                onSecondaryPointerUp(motionEvent);
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.P);
                if (iFindPointerIndex2 == -1) {
                    Log.e("COUINestedScrollView", "Invalid pointerId=" + this.P + " in onTouchEvent ACTION_POINTER_UP");
                } else {
                    this.F = (int) motionEvent.getY(iFindPointerIndex2);
                }
            }
        } else {
            if (getChildCount() == 0) {
                motionEventObtain.recycle();
                return false;
            }
            ri2 ri2Var8 = this.D;
            boolean z3 = (ri2Var8 == null || ri2Var8.e()) ? false : true;
            this.J = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            ri2 ri2Var9 = this.D;
            if (ri2Var9 != null && !ri2Var9.e()) {
                this.x = this.D.getCurrVelocityY() != 0.0f ? this.q : 0.0f;
                this.D.abortAnimation();
                if (this.b0) {
                    this.b0 = false;
                }
            }
            this.k = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            this.F = y3;
            this.f2011l = y3;
            this.P = motionEvent.getPointerId(0);
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker2 = this.K;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        rki rkiVar;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (rkiVar = this.E) == null) {
            return;
        }
        rkiVar.abortAnimation();
        this.E.o();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    public boolean overScrollByCompat(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > (computeHorizontalScrollExtent() - getPaddingLeft()) - getPaddingRight();
        boolean z5 = computeVerticalScrollRange() > (computeVerticalScrollExtent() - getPaddingTop()) - getPaddingBottom();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (z6) {
            z2 = false;
        } else if (i9 > i14) {
            z2 = true;
            i9 = i14;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (z7) {
            z3 = false;
        } else if (i11 > i16) {
            z3 = true;
            i11 = i16;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (this.D != null && z3 && !hasNestedScrollingParent(1)) {
            this.D.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean pageScroll(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.C.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.C;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.C.top = getScrollY() - height;
            Rect rect2 = this.C;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.C;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return scrollAndFocus(i, i2, i3);
    }

    public final void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.G) {
            this.I = view2;
        } else {
            scrollToChild(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            recycleVelocityTracker();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.G = true;
        super.requestLayout();
    }

    public final void runAnimatedScroll(boolean z) {
        if (z) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.T = getScrollY();
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final boolean scrollAndFocus(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View viewFindFocusableViewInBounds = findFocusableViewInBounds(z2, i2, i3);
        if (viewFindFocusableViewInBounds == null) {
            viewFindFocusableViewInBounds = this;
        }
        if (i2 < scrollY || i3 > i4) {
            doScrollY(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (viewFindFocusableViewInBounds != findFocus()) {
            viewFindFocusableViewInBounds.requestFocus(i);
        }
        return z;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            if (getScrollX() == i && getScrollY() == i2) {
                return;
            }
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            if (b().booleanValue()) {
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

    public final void scrollToChild(View view) {
        view.getDrawingRect(this.C);
        offsetDescendantRectToMyCoords(view, this.C);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.C);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    public void setAvoidAccidentalTouch(boolean z) {
        this.y = z;
    }

    public void setDispatchEventWhileOverScrolling(boolean z) {
        this.t = z;
    }

    public void setDispatchEventWhileScrolling(boolean z) {
        this.s = z;
    }

    public void setDispatchEventWhileScrollingThreshold(int i) {
        this.u = i;
    }

    public void setEnableFlingSpeedIncrease(boolean z) {
        rki rkiVar = this.E;
        if (rkiVar != null) {
            rkiVar.x(z);
        }
    }

    public void setEnableVibrator(boolean z) {
        this.B = z;
    }

    public void setEventFilterTangent(float f) {
        this.v = f;
    }

    public void setFastFlingThreshold(float f) {
        this.w = Math.max(f, 0.0f);
    }

    public void setIsUseOptimizedScroll(boolean z) {
        this.z = z;
    }

    public void setItemClickableWhileOverScrolling(boolean z) {
        this.p = z;
    }

    public void setItemClickableWhileSlowScrolling(boolean z) {
        this.o = z;
    }

    public void setOnScrollChangeListener(@Nullable b bVar) {
    }

    @Override // androidx.core.widget.NestedScrollView
    public void setSmoothScrollingEnabled(boolean z) {
        this.L = z;
    }

    public void setSpringOverScrollerDebug(boolean z) {
        rki rkiVar = this.E;
        if (rkiVar != null) {
            rkiVar.w(z);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        super.stopNestedScroll(i);
    }

    public COUINestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScrollInternal(i4, i5, null);
    }

    public COUINestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        this.o = true;
        this.p = true;
        this.r = new Paint();
        this.s = false;
        this.t = false;
        this.u = 2500;
        this.v = 20.0f;
        this.w = 1500.0f;
        this.y = true;
        this.z = true;
        this.A = new ArrayList<>();
        this.B = true;
        this.C = new Rect();
        this.D = null;
        this.E = null;
        this.G = true;
        this.H = false;
        this.I = null;
        this.J = false;
        this.L = true;
        this.P = -1;
        this.Q = new int[2];
        this.R = new int[2];
        this.b0 = false;
        this.c0 = null;
        initScrollView(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUINestedScrollView, i, 0);
        this.B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUINestedScrollView_couiScrollViewEnableVibrator, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        onNestedScrollInternal(i4, 0, null);
        this.T += i4;
    }
}

package com.coui.appcompat.sidepane;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.PathInterpolator;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.oplus.aiunit.vision.hj2;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.zl2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$color;
import com.support.sidenavigationbar.R$dimen;
import com.support.sidenavigationbar.R$layout;
import com.support.sidenavigationbar.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUISidePaneLayout extends RelativeLayout {
    public static final int CLOSE_STATE = 1;
    public static final int CONTENT_INDEX = 1;
    public static final PathInterpolator G = new hj2();
    public static final int OPEN_STATE = 0;
    public static final int SIDE_ICON_INDEX = 2;
    public static final int SIDE_PANE_INDEX = 0;
    public ImageButton A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final Paint E;
    public boolean F;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2072j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2073l;
    public View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2074n;
    public int o;
    public boolean p;
    public final ViewDragHelper q;
    public float r;
    public final float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public ValueAnimator y;
    public int z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean isDefalutOpen;
        boolean isOpen;
        int state;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.isOpen ? 1 : 0);
            parcel.writeInt(this.isDefalutOpen ? 1 : 0);
            parcel.writeInt(this.state);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isOpen = parcel.readInt() != 0;
            this.isDefalutOpen = parcel.readInt() != 0;
            this.state = parcel.readInt();
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (COUISidePaneLayout.this.q()) {
                COUISidePaneLayout.this.g();
            } else {
                COUISidePaneLayout.this.t();
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (COUISidePaneLayout.this.getChildAt(0) != null) {
                if (COUISidePaneLayout.this.z == 1) {
                    View childAt = COUISidePaneLayout.this.getChildAt(0);
                    boolean zP = COUISidePaneLayout.this.p();
                    float f = COUISidePaneLayout.this.t;
                    if (!zP) {
                        f = -f;
                    }
                    childAt.setTranslationX(f * ((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                if (COUISidePaneLayout.this.z == 0) {
                    View childAt2 = COUISidePaneLayout.this.getChildAt(0);
                    boolean zP2 = COUISidePaneLayout.this.p();
                    float f2 = COUISidePaneLayout.this.t;
                    if (!zP2) {
                        f2 = -f2;
                    }
                    childAt2.setTranslationX(f2 * (1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                }
            }
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            COUISidePaneLayout.this.D = false;
            COUISidePaneLayout.d(COUISidePaneLayout.this);
            COUISidePaneLayout.e(COUISidePaneLayout.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUISidePaneLayout.d(COUISidePaneLayout.this);
            COUISidePaneLayout.e(COUISidePaneLayout.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            COUISidePaneLayout.this.D = true;
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float i;

        public d(float f) {
            this.i = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i = (int) (this.i == 1.0f ? COUISidePaneLayout.this.r * animatedFraction : COUISidePaneLayout.this.r * (1.0f - animatedFraction));
            int unused = COUISidePaneLayout.this.z;
            valueAnimator.getAnimatedFraction();
            COUISidePaneLayout cOUISidePaneLayout = COUISidePaneLayout.this;
            if (cOUISidePaneLayout.m != null) {
                COUISidePaneLayout.d(cOUISidePaneLayout);
                COUISidePaneLayout.e(COUISidePaneLayout.this);
            }
            COUISidePaneLayout.this.s(i);
        }
    }

    public class e extends AccessibilityDelegateCompat {
        public final Rect i = new Rect();

        public e() {
        }

        public final void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.i;
            accessibilityNodeInfoCompat2.getBoundsInParent(rect);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat2.getMovementGranularities());
        }

        public boolean filter(View view) {
            return COUISidePaneLayout.this.o(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(COUISidePaneLayout.class.getName());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
            copyNodeInfoNoChildren(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatObtain);
            accessibilityNodeInfoCompatObtain.recycle();
            accessibilityNodeInfoCompat.setClassName(COUISidePaneLayout.class.getName());
            accessibilityNodeInfoCompat.setSource(view);
            Object parentForAccessibility = ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
            int childCount = COUISidePaneLayout.this.getChildCount();
            for (int i = 1; i < childCount; i++) {
                View childAt = COUISidePaneLayout.this.getChildAt(i);
                if (!filter(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (filter(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class f extends ViewDragHelper.Callback {
        public f() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            g gVar = (g) COUISidePaneLayout.this.m.getLayoutParams();
            if (COUISidePaneLayout.this.p()) {
                int width = COUISidePaneLayout.this.getWidth() - ((COUISidePaneLayout.this.getPaddingRight() + ((RelativeLayout.LayoutParams) gVar).rightMargin) + COUISidePaneLayout.this.m.getWidth());
                return Math.max(Math.min(i, width), width - COUISidePaneLayout.this.o);
            }
            int paddingLeft = COUISidePaneLayout.this.getPaddingLeft() + ((RelativeLayout.LayoutParams) gVar).leftMargin;
            return Math.min(Math.max(i, paddingLeft), COUISidePaneLayout.this.o + paddingLeft);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return COUISidePaneLayout.this.o;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            COUISidePaneLayout cOUISidePaneLayout = COUISidePaneLayout.this;
            cOUISidePaneLayout.q.captureChildView(cOUISidePaneLayout.m, i2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            COUISidePaneLayout.this.w();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (COUISidePaneLayout.this.q.getViewDragState() == 0) {
                COUISidePaneLayout cOUISidePaneLayout = COUISidePaneLayout.this;
                if (cOUISidePaneLayout.f2074n != 0.0f) {
                    cOUISidePaneLayout.k(cOUISidePaneLayout.m);
                    COUISidePaneLayout.this.u = true;
                } else {
                    cOUISidePaneLayout.y(cOUISidePaneLayout.m);
                    COUISidePaneLayout cOUISidePaneLayout2 = COUISidePaneLayout.this;
                    cOUISidePaneLayout2.j(cOUISidePaneLayout2.m);
                    COUISidePaneLayout.this.u = false;
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            COUISidePaneLayout cOUISidePaneLayout = COUISidePaneLayout.this;
            if (cOUISidePaneLayout.m == null) {
                cOUISidePaneLayout.f2074n = 0.0f;
                return;
            }
            if (cOUISidePaneLayout.p()) {
                i = (COUISidePaneLayout.this.getWidth() - i) - COUISidePaneLayout.this.m.getWidth();
            }
            COUISidePaneLayout.this.s(i);
            COUISidePaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            g gVar = (g) view.getLayoutParams();
            if (COUISidePaneLayout.this.p()) {
                int paddingRight = COUISidePaneLayout.this.getPaddingRight() + ((RelativeLayout.LayoutParams) gVar).rightMargin;
                if (f < 0.0f || (f == 0.0f && COUISidePaneLayout.this.f2074n > 0.5f)) {
                    paddingRight += COUISidePaneLayout.this.o;
                }
                paddingLeft = (COUISidePaneLayout.this.getWidth() - paddingRight) - COUISidePaneLayout.this.m.getWidth();
            } else {
                paddingLeft = ((RelativeLayout.LayoutParams) gVar).leftMargin + COUISidePaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && COUISidePaneLayout.this.f2074n > 0.5f)) {
                    paddingLeft += COUISidePaneLayout.this.o;
                }
            }
            COUISidePaneLayout.this.q.settleCapturedViewAt(paddingLeft, view.getTop());
            COUISidePaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            if (COUISidePaneLayout.this.p) {
                return false;
            }
            return ((g) view.getLayoutParams()).b;
        }
    }

    public interface h {
    }

    public interface i {
    }

    public COUISidePaneLayout(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ i d(COUISidePaneLayout cOUISidePaneLayout) {
        cOUISidePaneLayout.getClass();
        return null;
    }

    public static /* synthetic */ i e(COUISidePaneLayout cOUISidePaneLayout) {
        cOUISidePaneLayout.getClass();
        return null;
    }

    public static boolean z(View view) {
        return view.isOpaque();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.q.continueSettling(true)) {
            if (this.f2072j) {
                ViewCompat.postInvalidateOnAnimation(this);
            } else {
                this.q.abort();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int iE = ifk.e(motionEvent, motionEvent.getActionIndex());
        boolean z = false;
        if (!p() ? getChildAt(0).getRight() <= motionEvent.getX(iE) : getChildAt(0).getLeft() > motionEvent.getX(iE)) {
            z = true;
        }
        if (q() && z && this.C && (motionEvent.getAction() & 15) == 5) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean zDrawChild = super.drawChild(canvas, view, j2);
        if (this.B || this.C) {
            boolean zN = n(view);
            int right = getChildAt(1).getRight();
            int right2 = (int) (getChildAt(0).getRight() * this.f2074n);
            int width = getWidth();
            int color = getContext().getResources().getColor(R$color.coui_color_mask);
            float f2 = this.f2074n;
            int i2 = (int) (right + ((width - right) * (1.0f - f2)));
            if (f2 > 0.0f && zN) {
                this.E.setColor((((int) ((((-16777216) & color) >>> 24) * f2)) << 24) | (color & 16777215));
                if (p()) {
                    canvas.drawRect(getPaddingEnd(), 0.0f, i2, getHeight(), this.E);
                } else {
                    canvas.drawRect(right2, 0.0f, width, getHeight(), this.E);
                }
            }
        }
        return zDrawChild;
    }

    public boolean g() {
        this.y.cancel();
        this.z = 1;
        this.w = false;
        this.y.setCurrentFraction(1.0f - this.f2074n);
        this.y.start();
        return h(this.m, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        return (i2 < 3 || i3 >= 2 || !this.B) ? super.getChildDrawingOrder(i2, i3) : (i2 - i3) - 2;
    }

    public ImageButton getIconView() {
        return this.A;
    }

    public final boolean h(View view, int i2) {
        if (!this.v && !x(0.0f, i2)) {
            return false;
        }
        this.u = false;
        return true;
    }

    public final void i() {
        this.A = (ImageButton) LayoutInflater.from(getContext()).inflate(R$layout.coui_sliding_icon_layout, (ViewGroup) null);
        g gVar = new g(-2, -2);
        ((RelativeLayout.LayoutParams) gVar).topMargin = getResources().getDimensionPixelOffset(R$dimen.coui_side_pane_layout_icon_margin_top);
        gVar.setMarginStart(getResources().getDimensionPixelOffset(R$dimen.coui_side_pane_layout_icon_margin_start));
        this.A.setOnClickListener(new a());
        addViewInLayout(this.A, 2, gVar);
    }

    @Override // android.view.ViewGroup
    public boolean isChildrenDrawingOrderEnabled() {
        return this.B || super.isChildrenDrawingOrderEnabled();
    }

    public void j(View view) {
        sendAccessibilityEvent(32);
    }

    public void k(View view) {
        sendAccessibilityEvent(32);
    }

    public void l(View view) {
        v();
    }

    public final void m() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.y = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(483L);
        ValueAnimator valueAnimator = this.y;
        PathInterpolator pathInterpolator = G;
        valueAnimator.setInterpolator(pathInterpolator);
        this.y.addUpdateListener(new b());
        this.y.addListener(new c());
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.x = valueAnimator2;
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        this.x.setDuration(483L);
        this.x.setInterpolator(pathInterpolator);
    }

    public boolean n(View view) {
        return view == getChildAt(1);
    }

    public boolean o(View view) {
        if (view == null) {
            return false;
        }
        return this.f2072j && ((g) view.getLayoutParams()).f2077c && this.f2074n > 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = true;
        if (this.k && this.z == 0) {
            this.w = true;
            u(this.m, 0);
        } else {
            g();
        }
        if (this.f2073l && this.A == null) {
            i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (getChildAt(0) == null || !(this.C || this.B)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (!p() ? getChildAt(0).getRight() <= motionEvent.getX() : getChildAt(0).getLeft() > motionEvent.getX()) {
            z = true;
        }
        if (q() && z && this.C && motionEvent.getAction() == 0) {
            return true;
        }
        if (!z || !q() || !this.F || !this.B) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        g();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0181  */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c2;
        boolean zP = p();
        int i12 = 1;
        if (zP) {
            this.q.setEdgeTrackingEnabled(2);
        } else {
            this.q.setEdgeTrackingEnabled(1);
        }
        int i13 = i4 - i2;
        int paddingRight = zP ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zP ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (this.v) {
            this.f2074n = this.u ? 1.0f : 0.0f;
        }
        int i14 = 0;
        int width = paddingRight;
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                i11 = i12;
                c2 = 2;
            } else {
                g gVar = (g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (i15 == i12) {
                    if (this.B) {
                        measuredWidth = Math.min(getWidth(), childAt.getMeasuredWidth());
                    } else {
                        float f4 = this.f2074n;
                        if (f4 == f2) {
                            float f5 = this.r;
                            Resources resources = getResources();
                            int i16 = R$dimen.coui_sliding_pane_width;
                            measuredWidth = f5 == ((float) resources.getDimensionPixelOffset(i16)) ? Math.max(getWidth(), childAt.getMeasuredWidth()) : (int) Math.max((getWidth() - this.r) + getResources().getDimensionPixelOffset(i16), childAt.getMeasuredWidth());
                        } else if (f4 == f3) {
                            measuredWidth = Math.max(getWidth() - getChildAt(i14).getMeasuredWidth(), childAt.getMeasuredWidth());
                        }
                    }
                    measuredWidth = Math.min(getWidth(), measuredWidth);
                }
                if (gVar.b) {
                    int i17 = i13 - paddingLeft;
                    int iMin = (Math.min(width, i17 - this.i) - paddingRight) - (((RelativeLayout.LayoutParams) gVar).leftMargin + ((RelativeLayout.LayoutParams) gVar).rightMargin);
                    this.o = iMin;
                    int i18 = zP ? ((RelativeLayout.LayoutParams) gVar).rightMargin : ((RelativeLayout.LayoutParams) gVar).leftMargin;
                    gVar.f2077c = ((paddingRight + i18) + iMin) + (measuredWidth / 2) > i17;
                    int i19 = (int) (iMin * this.f2074n);
                    paddingRight += i18 + i19;
                    this.f2074n = i19 / iMin;
                } else {
                    paddingRight = width;
                }
                if (zP) {
                    if (gVar.b) {
                        i10 = (this.B && i15 == 1) ? i13 : i13 - ((int) (paddingRight + ((this.r - this.t) * (1.0f - this.f2074n))));
                    } else {
                        i10 = i13 - paddingRight;
                    }
                    i9 = i10 - measuredWidth;
                } else {
                    if (gVar.b) {
                        if (this.B && i15 == 1) {
                            i6 = (int) (((paddingRight + measuredWidth) + this.r) - this.t);
                            i7 = 0;
                            i8 = 1;
                        } else {
                            i7 = (int) (paddingRight + ((this.r - this.t) * (1.0f - this.f2074n)));
                            i6 = i7 + measuredWidth;
                        }
                        if (i15 == i8 || zl2.c((Activity) getContext())) {
                            int i20 = i6;
                            i9 = i7;
                            i10 = i20;
                        } else {
                            i9 = i7;
                            i10 = i13;
                        }
                    } else {
                        i6 = paddingRight + measuredWidth;
                        i7 = paddingRight;
                    }
                    i8 = 1;
                    if (i15 == i8) {
                        int i21 = i6;
                        i9 = i7;
                        i10 = i21;
                    } else {
                        int i22 = i6;
                        i9 = i7;
                        i10 = i22;
                    }
                }
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                if (i15 == 2) {
                    if (zP) {
                        childAt.layout((i13 - gVar.getMarginStart()) - measuredWidth, ((RelativeLayout.LayoutParams) gVar).topMargin, i13 - gVar.getMarginStart(), ((RelativeLayout.LayoutParams) gVar).topMargin + measuredWidth);
                    } else {
                        childAt.layout(gVar.getMarginStart(), ((RelativeLayout.LayoutParams) gVar).topMargin, gVar.getMarginStart() + measuredWidth, ((RelativeLayout.LayoutParams) gVar).topMargin + measuredWidth);
                    }
                    i11 = 1;
                } else {
                    i11 = 1;
                    if (i15 == 1 && zP) {
                        childAt.layout(0, paddingTop, i10, measuredHeight);
                    } else {
                        childAt.layout(i9, paddingTop, i10, measuredHeight);
                    }
                }
                c2 = 2;
                if (i15 < 2) {
                    width += childAt.getWidth();
                }
            }
            i15++;
            i14 = 0;
            f2 = 0.0f;
            f3 = 1.0f;
            i12 = i11;
        }
        if (this.v) {
            y(this.m);
        }
        this.v = false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:101:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:125:0x0215  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab A[PHI: r14
  0x00ab: PHI (r14v2 float) = (r14v1 float), (r14v22 float) binds: [B:36:0x00a2, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0126  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:74:0x014c  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    /* JADX WARN: Code duplicated, block: B:81:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x0176  */
    /* JADX WARN: Code duplicated, block: B:87:0x017e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188  */
    /* JADX WARN: Code duplicated, block: B:93:0x0193  */
    /* JADX WARN: Code duplicated, block: B:94:0x019f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9  */
    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int paddingTop;
        int iMin;
        int iMakeMeasureSpec;
        int i4;
        int i5;
        int iMakeMeasureSpec2;
        int i6;
        int iMax;
        float f2;
        float f3;
        int i7;
        int iMax2;
        int i8;
        int iMakeMeasureSpec3;
        int i9;
        int i10;
        int iMakeMeasureSpec4;
        int i11;
        int iMakeMeasureSpec5;
        int measuredHeight;
        boolean z;
        int measuredWidth;
        float f4;
        float f5;
        Resources resources;
        int i12;
        float fMax;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                size2 = 300;
                mode2 = Integer.MIN_VALUE;
            }
        }
        boolean z2 = false;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 3) {
            Log.e("COUISidePaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.m = null;
        int i13 = 0;
        boolean z3 = false;
        int i14 = paddingLeft;
        float f6 = 0.0f;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            g gVar = (g) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                gVar.f2077c = z2;
            } else {
                float f7 = gVar.a;
                if (f7 > 0.0f) {
                    f6 += f7;
                    if (((RelativeLayout.LayoutParams) gVar).width != 0) {
                        i6 = ((RelativeLayout.LayoutParams) gVar).leftMargin + ((RelativeLayout.LayoutParams) gVar).rightMargin;
                        iMax = ((RelativeLayout.LayoutParams) gVar).width;
                        if (iMax != -2 || iMax == -1) {
                            iMax = paddingLeft - i6;
                        }
                        if (i13 == 1 || !this.w || this.B) {
                            f2 = 0.0f;
                        } else {
                            iMax = (int) (iMax - this.r);
                            f2 = this.t;
                        }
                        if (i13 == 1) {
                            if (this.B) {
                                iMax = paddingLeft;
                                f3 = f6;
                            } else {
                                f4 = this.f2074n;
                                if (f4 == 0.0f) {
                                    f5 = this.r;
                                    resources = getResources();
                                    f3 = f6;
                                    i12 = R$dimen.coui_sliding_pane_width;
                                    if (f5 == resources.getDimensionPixelOffset(i12)) {
                                        fMax = Math.max(paddingLeft - (this.r - this.t), childAt.getMeasuredWidth());
                                    } else {
                                        fMax = Math.max((paddingLeft - this.t) + getResources().getDimensionPixelOffset(i12), childAt.getMeasuredWidth());
                                    }
                                    iMax = (int) fMax;
                                } else {
                                    f3 = f6;
                                    if (f4 == 1.0f) {
                                        iMax = Math.max(paddingLeft - getChildAt(0).getMeasuredWidth(), iMax);
                                    }
                                }
                            }
                            if (!this.B) {
                                iMax = Math.min(paddingLeft, iMax);
                            }
                            if (zl2.c((Activity) getContext())) {
                                iMax2 = iMax;
                            } else {
                                iMax2 = paddingLeft;
                            }
                            i7 = 1;
                        } else {
                            f3 = f6;
                            int i15 = iMax;
                            i7 = 1;
                            iMax2 = i15;
                        }
                        if (i13 == i7 && iMax2 <= 0) {
                            if (this.z == 0) {
                                measuredWidth = getChildAt(0).getMeasuredWidth();
                            } else {
                                measuredWidth = 0;
                            }
                            iMax2 = Math.max(paddingLeft - measuredWidth, ((RelativeLayout.LayoutParams) gVar).width);
                        }
                        i8 = ((RelativeLayout.LayoutParams) gVar).width;
                        if (i8 == -2) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, Integer.MIN_VALUE);
                        } else if (i8 == -1) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                        } else {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                        }
                        i9 = ((RelativeLayout.LayoutParams) gVar).height;
                        if (i9 == -2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                            i11 = 3;
                            i10 = 1073741824;
                        } else {
                            if (i9 == -1) {
                                i10 = 1073741824;
                                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                            } else {
                                i10 = 1073741824;
                                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                            }
                            i11 = 3;
                        }
                        if (i13 == i11) {
                            iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R$dimen.coui_side_pane_layout_icon_size), i10);
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, i10);
                        } else {
                            iMakeMeasureSpec5 = iMakeMeasureSpec3;
                        }
                        childAt.measure(iMakeMeasureSpec5, iMakeMeasureSpec4);
                        if (i13 < 2) {
                            int measuredWidth2 = (int) (childAt.getMeasuredWidth() + f2);
                            measuredHeight = childAt.getMeasuredHeight();
                            if (mode2 == Integer.MIN_VALUE && measuredHeight > iMin) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            }
                            i14 -= measuredWidth2;
                            if (i14 <= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            gVar.b = z;
                            z3 |= z;
                            if (z) {
                                this.m = childAt;
                            }
                        }
                        f6 = f3;
                    }
                } else {
                    i6 = ((RelativeLayout.LayoutParams) gVar).leftMargin + ((RelativeLayout.LayoutParams) gVar).rightMargin;
                    iMax = ((RelativeLayout.LayoutParams) gVar).width;
                    if (iMax != -2) {
                        iMax = paddingLeft - i6;
                    } else {
                        iMax = paddingLeft - i6;
                    }
                    if (i13 == 1) {
                        f2 = 0.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (i13 == 1) {
                        if (this.B) {
                            iMax = paddingLeft;
                            f3 = f6;
                        } else {
                            f4 = this.f2074n;
                            if (f4 == 0.0f) {
                                f5 = this.r;
                                resources = getResources();
                                f3 = f6;
                                i12 = R$dimen.coui_sliding_pane_width;
                                if (f5 == resources.getDimensionPixelOffset(i12)) {
                                    fMax = Math.max(paddingLeft - (this.r - this.t), childAt.getMeasuredWidth());
                                } else {
                                    fMax = Math.max((paddingLeft - this.t) + getResources().getDimensionPixelOffset(i12), childAt.getMeasuredWidth());
                                }
                                iMax = (int) fMax;
                            } else {
                                f3 = f6;
                                if (f4 == 1.0f) {
                                    iMax = Math.max(paddingLeft - getChildAt(0).getMeasuredWidth(), iMax);
                                }
                            }
                        }
                        if (!this.B) {
                            iMax = Math.min(paddingLeft, iMax);
                        }
                        if (zl2.c((Activity) getContext())) {
                            iMax2 = paddingLeft;
                        } else {
                            iMax2 = iMax;
                        }
                        i7 = 1;
                    } else {
                        f3 = f6;
                        int i16 = iMax;
                        i7 = 1;
                        iMax2 = i16;
                    }
                    if (i13 == i7) {
                        if (this.z == 0) {
                            measuredWidth = getChildAt(0).getMeasuredWidth();
                        } else {
                            measuredWidth = 0;
                        }
                        iMax2 = Math.max(paddingLeft - measuredWidth, ((RelativeLayout.LayoutParams) gVar).width);
                    }
                    i8 = ((RelativeLayout.LayoutParams) gVar).width;
                    if (i8 == -2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, Integer.MIN_VALUE);
                    } else if (i8 == -1) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    i9 = ((RelativeLayout.LayoutParams) gVar).height;
                    if (i9 == -2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                        i11 = 3;
                        i10 = 1073741824;
                    } else {
                        if (i9 == -1) {
                            i10 = 1073741824;
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                        } else {
                            i10 = 1073741824;
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                        }
                        i11 = 3;
                    }
                    if (i13 == i11) {
                        iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R$dimen.coui_side_pane_layout_icon_size), i10);
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, i10);
                    } else {
                        iMakeMeasureSpec5 = iMakeMeasureSpec3;
                    }
                    childAt.measure(iMakeMeasureSpec5, iMakeMeasureSpec4);
                    if (i13 < 2) {
                        int measuredWidth3 = (int) (childAt.getMeasuredWidth() + f2);
                        measuredHeight = childAt.getMeasuredHeight();
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        }
                        i14 -= measuredWidth3;
                        if (i14 <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        gVar.b = z;
                        z3 |= z;
                        if (z) {
                            this.m = childAt;
                        }
                    }
                    f6 = f3;
                }
            }
            i13++;
            z2 = false;
        }
        int i17 = 8;
        if (z3 || f6 > 0.0f) {
            int i18 = paddingLeft - this.i;
            int i19 = 0;
            while (i19 < childCount) {
                View childAt2 = getChildAt(i19);
                if (childAt2.getVisibility() == i17) {
                    i4 = i18;
                } else {
                    g gVar2 = (g) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i17) {
                        boolean z4 = ((RelativeLayout.LayoutParams) gVar2).width == 0 && gVar2.a > 0.0f;
                        int measuredWidth4 = z4 ? 0 : childAt2.getMeasuredWidth();
                        if (!z3 || childAt2 == this.m) {
                            if (gVar2.a > 0.0f) {
                                if (((RelativeLayout.LayoutParams) gVar2).width == 0) {
                                    int i20 = ((RelativeLayout.LayoutParams) gVar2).height;
                                    if (i20 == -2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    } else {
                                        iMakeMeasureSpec = i20 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                                    }
                                } else {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z3) {
                                    int i21 = paddingLeft - (((RelativeLayout.LayoutParams) gVar2).leftMargin + ((RelativeLayout.LayoutParams) gVar2).rightMargin);
                                    i4 = i18;
                                    int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                                    if (measuredWidth4 != i21) {
                                        childAt2.measure(iMakeMeasureSpec6, iMakeMeasureSpec);
                                    }
                                } else {
                                    i4 = i18;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4 + ((int) ((gVar2.a * Math.max(0, i14)) / f6)), 1073741824), iMakeMeasureSpec);
                                }
                            }
                        } else if (((RelativeLayout.LayoutParams) gVar2).width < 0 && (measuredWidth4 > i18 || gVar2.a > 0.0f)) {
                            if (z4) {
                                int i22 = ((RelativeLayout.LayoutParams) gVar2).height;
                                if (i22 == -2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    i5 = 1073741824;
                                } else if (i22 == -1) {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i22, 1073741824);
                                }
                            } else {
                                i5 = 1073741824;
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i18, i5), iMakeMeasureSpec2);
                        }
                        i4 = i18;
                    } else {
                        i4 = i18;
                    }
                }
                i19++;
                i18 = i4;
                i17 = 8;
            }
        }
        setMeasuredDimension(size, iMin + getPaddingTop() + getPaddingBottom());
        this.f2072j = z3;
        if (this.q.getViewDragState() == 0 || z3) {
            return;
        }
        this.q.abort();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        boolean z = this.k;
        boolean z2 = savedState.isDefalutOpen;
        if (z != z2) {
            if (z2) {
                return;
            }
            this.w = true;
            t();
            this.u = true;
            this.z = 0;
            return;
        }
        if (savedState.isOpen) {
            this.w = true;
            t();
        } else {
            g();
        }
        this.u = savedState.isOpen;
        this.z = savedState.state;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.isOpen = r() ? q() : this.u;
        savedState.isDefalutOpen = this.k;
        savedState.state = this.z;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.v = true;
        }
    }

    public boolean p() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public boolean q() {
        return this.z == 0;
    }

    public boolean r() {
        return this.f2072j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f2072j) {
            return;
        }
        this.u = view == this.m;
    }

    public void s(int i2) {
        boolean zP = p();
        View view = this.m;
        if (view == null) {
            return;
        }
        g gVar = (g) view.getLayoutParams();
        this.f2074n = (i2 - ((zP ? getPaddingRight() : getPaddingLeft()) + (zP ? ((RelativeLayout.LayoutParams) gVar).rightMargin : ((RelativeLayout.LayoutParams) gVar).leftMargin))) / this.o;
        l(this.m);
    }

    public void setAlwaysShowMask(boolean z) {
        this.C = z;
        invalidate();
    }

    public void setCoverStyle(boolean z) {
        this.B = z;
    }

    public void setCreateIcon(boolean z) {
        this.f2073l = z;
    }

    public void setDefaultShowPane(Boolean bool) {
        this.k = bool.booleanValue();
        if (!bool.booleanValue()) {
            if (getChildCount() > 0) {
                getChildAt(0).setVisibility(8);
                ViewGroup.LayoutParams layoutParams = getChildAt(1).getLayoutParams();
                if (this.B) {
                    layoutParams.width = getWidth();
                } else {
                    layoutParams.width = (int) ((getWidth() - this.r) - (this.t * (this.f2074n - 1.0f)));
                }
            }
            setIconViewVisible(8);
            return;
        }
        if (getChildCount() > 0) {
            getChildAt(0).setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = getChildAt(1).getLayoutParams();
            if (this.B) {
                layoutParams2.width = getWidth();
            } else {
                layoutParams2.width = (int) ((getWidth() - this.r) - (this.t * (this.f2074n - 1.0f)));
            }
            if (this.A == null) {
                i();
            } else {
                setIconViewVisible(0);
            }
        }
    }

    public void setFirstViewWidth(int i2) {
        this.r = i2;
    }

    public void setIconViewVisible(int i2) {
        ImageButton imageButton = this.A;
        if (imageButton != null) {
            imageButton.setVisibility(i2);
        }
    }

    public void setLifeCycleObserverListener(@Nullable i iVar) {
    }

    public void setOnMaskClickListener(h hVar) {
    }

    public void setPanelSlideListener(@Nullable i iVar) {
    }

    public void setSlideDistance(float f2) {
        this.t = f2;
    }

    public void setTouchContentEnable(boolean z) {
        this.F = z;
    }

    public boolean t() {
        this.y.cancel();
        this.z = 0;
        this.y.setCurrentFraction(this.f2074n);
        this.y.start();
        return u(this.m, 0);
    }

    public final boolean u(View view, int i2) {
        if (!this.v && !x(1.0f, i2)) {
            return false;
        }
        this.u = true;
        return true;
    }

    public void v() {
        if (getChildAt(1) != null) {
            ViewGroup.LayoutParams layoutParams = getChildAt(1).getLayoutParams();
            if (this.B) {
                layoutParams.width = getWidth();
            } else {
                layoutParams.width = (int) ((getWidth() - this.r) - (this.t * (this.f2074n - 1.0f)));
            }
            getChildAt(1).setLayoutParams(layoutParams);
            getChildAt(1).requestLayout();
        }
    }

    public void w() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @SuppressLint({"Recycle"})
    public boolean x(float f2, int i2) {
        if (!this.f2072j) {
            return false;
        }
        this.x.cancel();
        this.x.removeAllUpdateListeners();
        if (f2 == 0.0f) {
            this.x.setCurrentFraction(1.0f - this.f2074n);
        } else {
            this.x.setCurrentFraction(this.f2074n);
        }
        this.x.addUpdateListener(new d(f2));
        this.x.start();
        w();
        ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    public void y(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View view2 = view;
        boolean zP = p();
        int width = zP ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zP ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !z(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt == view2) {
                return;
            }
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zP ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zP ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i2++;
            view2 = view;
            zP = zP;
        }
    }

    public static class g extends RelativeLayout.LayoutParams {
        public static final int[] d = {R.attr.layout_weight};
        public float a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2077c;

        public g() {
            super(-1, -1);
            this.a = 0.0f;
        }

        public g(int i, int i2) {
            super(i, i2);
            this.a = 0.0f;
        }

        public g(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0.0f;
        }

        public g(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0.0f;
        }

        public g(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d);
            this.a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public COUISidePaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public COUISidePaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = true;
        this.f2073l = true;
        this.v = true;
        this.w = false;
        this.C = false;
        this.F = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUISidePaneLayout, i2, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.i = (int) ((32.0f * f2) + 0.5f);
        int i3 = R$styleable.COUISidePaneLayout_firstPaneWidth;
        Resources resources = getResources();
        int i4 = R$dimen.coui_sliding_pane_width;
        this.r = typedArrayObtainStyledAttributes.getDimension(i3, resources.getDimensionPixelOffset(i4));
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUISidePaneLayout_expandPaneWidth, getResources().getDimensionPixelOffset(i4));
        this.s = dimension;
        this.B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUISidePaneLayout_coverStyle, false);
        this.t = dimension;
        this.E = new Paint();
        this.z = 0;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new e());
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, 0.5f, new f());
        this.q = viewDragHelperCreate;
        viewDragHelperCreate.setMinVelocity(f2 * 400.0f);
        m();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }
}

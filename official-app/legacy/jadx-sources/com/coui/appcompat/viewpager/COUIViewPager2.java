package com.coui.appcompat.viewpager;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.COUILinearSmoothScroller;
import androidx.recyclerview.widget.COUIRecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.StatefulAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.kn2;
import com.oplus.aiunit.vision.xh2;

/* JADX INFO: loaded from: classes13.dex */
public class COUIViewPager2 extends ViewGroup {
    public static boolean I = true;
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public boolean A;
    public int B;
    public Interpolator C;
    public int D;
    public kn2 E;
    public f F;
    public float G;
    public float H;
    public final Rect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f2164j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2165l;
    public RecyclerViewImpl m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public COUIScrollEventAdapter f2166n;
    public e o;
    public COUICompositeOnPageChangeCallback p;
    public RecyclerView.AdapterDataObserver q;
    public int r;
    public LinearLayoutManager s;
    public Parcelable t;
    public PagerSnapHelper u;
    public COUICompositeOnPageChangeCallback v;
    public xh2 w;
    public COUIPageTransformerAdapter x;
    public RecyclerView.ItemAnimator y;
    public boolean z;

    public class RecyclerViewImpl extends COUIRecyclerView {
        public RecyclerViewImpl(Context context) {
            super(context);
            super.setDispatchEventWhileOverScrolling(true);
            setDispatchEventWhileScrollingThreshold(500);
        }

        @Override // androidx.recyclerview.widget.COUIRecyclerView, androidx.recyclerview.widget.RecyclerView
        public boolean fling(int i, int i2) {
            if (COUIViewPager2.this.F.c()) {
                COUIViewPager2.this.G = i;
                COUIViewPager2.this.H = i2;
            }
            return super.fling(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @RequiresApi(23)
        public CharSequence getAccessibilityClassName() {
            return COUIViewPager2.this.o.d() ? COUIViewPager2.this.o.n() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(COUIViewPager2.this.k);
            accessibilityEvent.setToIndex(COUIViewPager2.this.k);
            COUIViewPager2.this.o.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.COUIRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return COUIViewPager2.this.n() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.COUIRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return COUIViewPager2.this.n() && super.onTouchEvent(motionEvent);
        }
    }

    public class a extends i {
        public a() {
            super(null);
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.i, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            COUIViewPager2 cOUIViewPager2 = COUIViewPager2.this;
            cOUIViewPager2.f2165l = true;
            cOUIViewPager2.f2166n.notifyDataSetChangeHappened();
        }
    }

    public class b extends ViewPager2.OnPageChangeCallback {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                COUIViewPager2.this.y();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            COUIViewPager2 cOUIViewPager2 = COUIViewPager2.this;
            if (cOUIViewPager2.k != i) {
                cOUIViewPager2.k = i;
                cOUIViewPager2.o.q();
            }
        }
    }

    public class c extends ViewPager2.OnPageChangeCallback {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            COUIViewPager2.this.clearFocus();
            if (COUIViewPager2.this.hasFocus()) {
                COUIViewPager2.this.m.requestFocus(2);
            }
        }
    }

    public class d implements RecyclerView.OnChildAttachStateChangeListener {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(@NonNull View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(@NonNull View view) {
        }
    }

    public abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int i) {
            return false;
        }

        public boolean c(int i, Bundle bundle) {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void e(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        public void f(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        public void h(@NonNull COUICompositeOnPageChangeCallback cOUICompositeOnPageChangeCallback, @NonNull RecyclerView recyclerView) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void j(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public boolean k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void m() {
        }

        public CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        public void o(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        public void p() {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }

        public /* synthetic */ e(COUIViewPager2 cOUIViewPager2, a aVar) {
            this();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2167c = false;
        public b a = null;
        public a b = null;

        public class a {
            public int a;
            public int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Interpolator f2168c;
            public float d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f2169e;
            public float f;

            public a(int i, int i2, Interpolator interpolator, float f, int i3, float f2) {
                this.a = i;
                this.b = i2;
                this.f2168c = interpolator;
                this.d = f;
                this.f2169e = i3;
                this.f = f2;
            }
        }

        public class b {
            public int a;
            public Interpolator b;

            public b(int i, Interpolator interpolator) {
                this.a = i;
                this.b = interpolator;
            }
        }

        public a a() {
            return this.b;
        }

        public b b() {
            return this.a;
        }

        public boolean c() {
            return this.f2167c;
        }

        public f d(a aVar) {
            this.b = aVar;
            this.f2167c = aVar != null;
            return this;
        }

        public f e(b bVar) {
            this.a = bVar;
            return this;
        }
    }

    public class g extends e {
        public g() {
            super(COUIViewPager2.this, null);
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public boolean b(int i) {
            return (i == 8192 || i == 4096) && !COUIViewPager2.this.n();
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void j(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (COUIViewPager2.this.n()) {
                return;
            }
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
            accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfoCompat.setScrollable(false);
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public boolean k(int i) {
            if (b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    public class h extends COUILinearSmoothScroller {
        public h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.COUILinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
            int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
            int iSqrt = (int) Math.sqrt((iCalculateDxToMakeVisible * iCalculateDxToMakeVisible) + (iCalculateDyToMakeVisible * iCalculateDyToMakeVisible));
            f.b bVarB = COUIViewPager2.this.F.b();
            if (bVarB != null) {
                if (action instanceof COUILinearSmoothScroller.COUIAction) {
                    ((COUILinearSmoothScroller.COUIAction) action).update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, bVarB.a, bVarB.b);
                    return;
                } else {
                    action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, bVarB.a, bVarB.b);
                    return;
                }
            }
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(iSqrt);
            if (iCalculateTimeForDeceleration > 0) {
                if (!(action instanceof COUILinearSmoothScroller.COUIAction)) {
                    action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, COUIViewPager2.this.D, COUIViewPager2.this.C);
                } else if (COUIViewPager2.this.D == Integer.MIN_VALUE) {
                    ((COUILinearSmoothScroller.COUIAction) action).update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                } else {
                    ((COUILinearSmoothScroller.COUIAction) action).update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, COUIViewPager2.this.D, COUIViewPager2.this.C);
                }
            }
        }
    }

    public static abstract class i extends RecyclerView.AdapterDataObserver {
        public i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onChanged();
        }
    }

    public class j extends LinearLayoutManager {
        public j(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
            int offscreenPageLimit = COUIViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            int pageSize = COUIViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            COUIViewPager2.this.o.j(accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onScrollStateChanged(int i) {
            super.onScrollStateChanged(i);
            if (i == 0) {
                COUIViewPager2.this.E.b(false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, int i, @Nullable Bundle bundle) {
            return COUIViewPager2.this.o.b(i) ? COUIViewPager2.this.o.k(i) : super.performAccessibilityAction(recycler, state, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            h hVar = COUIViewPager2.this.new h(recyclerView.getContext());
            hVar.setTargetPosition(i);
            startSmoothScroll(hVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void startSmoothScroll(RecyclerView.SmoothScroller smoothScroller) {
            super.startSmoothScroll(smoothScroller);
            COUIViewPager2.this.E.b(true);
        }
    }

    public class k extends e {
        public final AccessibilityViewCommand b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AccessibilityViewCommand f2171c;
        public RecyclerView.AdapterDataObserver d;

        public class a implements AccessibilityViewCommand {
            public a() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                k.this.v(((COUIViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        public class b implements AccessibilityViewCommand {
            public b() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                k.this.v(((COUIViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        public class c extends i {
            public c() {
                super(null);
            }

            @Override // com.coui.appcompat.viewpager.COUIViewPager2.i, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                k.this.w();
            }
        }

        public k() {
            super(COUIViewPager2.this, null);
            this.b = new a();
            this.f2171c = new b();
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public boolean c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void e(@Nullable RecyclerView.Adapter<?> adapter) {
            w();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.d);
            }
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void f(@Nullable RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.d);
            }
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void h(@NonNull COUICompositeOnPageChangeCallback cOUICompositeOnPageChangeCallback, @NonNull RecyclerView recyclerView) {
            ViewCompat.setImportantForAccessibility(recyclerView, 2);
            this.d = new c();
            if (ViewCompat.getImportantForAccessibility(COUIViewPager2.this) == 0) {
                ViewCompat.setImportantForAccessibility(COUIViewPager2.this, 1);
            }
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public boolean l(int i, Bundle bundle) {
            if (!c(i, bundle)) {
                throw new IllegalStateException();
            }
            v(i == 8192 ? COUIViewPager2.this.getCurrentItem() - 1 : COUIViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void m() {
            w();
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void o(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(COUIViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void p() {
            w();
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void q() {
            w();
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void r() {
            w();
        }

        @Override // com.coui.appcompat.viewpager.COUIViewPager2.e
        public void s() {
            w();
        }

        public final void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            int itemCount2;
            if (COUIViewPager2.this.getAdapter() == null) {
                itemCount = 0;
                itemCount2 = 0;
            } else if (COUIViewPager2.this.getOrientation() == 1) {
                itemCount = COUIViewPager2.this.getAdapter().getItemCount();
                itemCount2 = 0;
            } else {
                itemCount2 = COUIViewPager2.this.getAdapter().getItemCount();
                itemCount = 0;
            }
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(itemCount, itemCount2, false, 0));
        }

        public final void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.Adapter adapter = COUIViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !COUIViewPager2.this.n()) {
                return;
            }
            if (COUIViewPager2.this.k > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (COUIViewPager2.this.k < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        public void v(int i) {
            if (COUIViewPager2.this.n()) {
                COUIViewPager2.this.t(i, true);
            }
        }

        public void w() {
            int itemCount;
            COUIViewPager2 cOUIViewPager2 = COUIViewPager2.this;
            int i = R.id.accessibilityActionPageLeft;
            ViewCompat.removeAccessibilityAction(cOUIViewPager2, R.id.accessibilityActionPageLeft);
            ViewCompat.removeAccessibilityAction(cOUIViewPager2, R.id.accessibilityActionPageRight);
            ViewCompat.removeAccessibilityAction(cOUIViewPager2, R.id.accessibilityActionPageUp);
            ViewCompat.removeAccessibilityAction(cOUIViewPager2, R.id.accessibilityActionPageDown);
            if (COUIViewPager2.this.getAdapter() == null || (itemCount = COUIViewPager2.this.getAdapter().getItemCount()) == 0 || !COUIViewPager2.this.n()) {
                return;
            }
            if (COUIViewPager2.this.getOrientation() != 0) {
                if (COUIViewPager2.this.k < itemCount - 1) {
                    ViewCompat.replaceAccessibilityAction(cOUIViewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, null), null, this.b);
                }
                if (COUIViewPager2.this.k > 0) {
                    ViewCompat.replaceAccessibilityAction(cOUIViewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, null), null, this.f2171c);
                    return;
                }
                return;
            }
            boolean zM = COUIViewPager2.this.m();
            int i2 = zM ? 16908360 : 16908361;
            if (zM) {
                i = 16908361;
            }
            if (COUIViewPager2.this.k < itemCount - 1) {
                ViewCompat.replaceAccessibilityAction(cOUIViewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, null), null, this.b);
            }
            if (COUIViewPager2.this.k > 0) {
                ViewCompat.replaceAccessibilityAction(cOUIViewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i, null), null, this.f2171c);
            }
        }
    }

    public class l extends PagerSnapHelper {

        public class a extends h {
            public final /* synthetic */ f.a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, f.a aVar) {
                super(context);
                this.b = aVar;
            }

            public final int a(int i, float f) {
                if (f == 0.0f) {
                    return calculateTimeForDeceleration(Math.abs(i));
                }
                float fAbs = Math.abs(i);
                float fAbs2 = Math.abs(f);
                float f2 = this.b.d;
                if (fAbs2 > f2) {
                    fAbs2 = Math.min(fAbs2, f2 + ((float) Math.sqrt(Math.min(this.b.f2169e, fAbs2 - f2) * 1000.0f)));
                }
                if (fAbs2 != 0.0f) {
                    return (int) Math.ceil(((this.b.f * fAbs) / fAbs2) * 1000.0f);
                }
                return 500;
            }

            @Override // androidx.recyclerview.widget.COUILinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // androidx.recyclerview.widget.COUILinearSmoothScroller
            public int calculateTimeForScrolling(int i) {
                return Math.min(100, super.calculateTimeForScrolling(i));
            }

            @Override // com.coui.appcompat.viewpager.COUIViewPager2.h, androidx.recyclerview.widget.COUILinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                RecyclerViewImpl recyclerViewImpl;
                RecyclerView.LayoutManager layoutManager;
                int i;
                if (view == null || (recyclerViewImpl = COUIViewPager2.this.m) == null || (layoutManager = recyclerViewImpl.getLayoutManager()) == null) {
                    return;
                }
                int[] iArrCalculateDistanceToFinalSnap = l.this.calculateDistanceToFinalSnap(layoutManager, view);
                int i2 = iArrCalculateDistanceToFinalSnap[0];
                int i3 = iArrCalculateDistanceToFinalSnap[1];
                float f = COUIViewPager2.this.G;
                float f2 = COUIViewPager2.this.H;
                if (Math.abs(i2) > Math.abs(i3)) {
                    i = i2;
                } else {
                    f = f2;
                    i = i3;
                }
                int iMax = Math.max(Math.min(a(i, f), this.b.b), this.b.a);
                if (iMax > 0) {
                    action.update(i2, i3, iMax, this.b.f2168c);
                }
            }
        }

        public class b extends h {
            public b(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.COUILinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // androidx.recyclerview.widget.COUILinearSmoothScroller
            public int calculateTimeForScrolling(int i) {
                return Math.min(100, super.calculateTimeForScrolling(i));
            }

            @Override // com.coui.appcompat.viewpager.COUIViewPager2.h, androidx.recyclerview.widget.COUILinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                l lVar = l.this;
                int[] iArrCalculateDistanceToFinalSnap = lVar.calculateDistanceToFinalSnap(COUIViewPager2.this.m.getLayoutManager(), view);
                int i = iArrCalculateDistanceToFinalSnap[0];
                int i2 = iArrCalculateDistanceToFinalSnap[1];
                int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (iCalculateTimeForDeceleration > 0) {
                    action.update(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }
        }

        public l() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        @Nullable
        public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
            if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
                return null;
            }
            f.a aVarA = COUIViewPager2.this.F.a();
            return aVarA != null ? new a(COUIViewPager2.this.m.getContext(), aVarA) : new b(COUIViewPager2.this.m.getContext());
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        @Nullable
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            if (COUIViewPager2.this.l()) {
                return null;
            }
            return super.findSnapView(layoutManager);
        }
    }

    public static class m implements Runnable {
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final RecyclerView f2174j;

        public m(int i, RecyclerView recyclerView) {
            this.i = i;
            this.f2174j = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2174j.smoothScrollToPosition(this.i);
        }
    }

    public COUIViewPager2(@NonNull Context context) {
        super(context);
        this.i = new Rect();
        this.f2164j = new Rect();
        this.f2165l = false;
        this.p = new COUICompositeOnPageChangeCallback(3);
        this.q = new a();
        this.r = -1;
        this.y = null;
        this.z = false;
        this.A = true;
        this.B = -1;
        this.C = new LinearInterpolator();
        this.D = 500;
        this.F = new f();
        this.G = 0.0f;
        this.H = 0.0f;
        k(context, null);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.m.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.m.canScrollVertically(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).mRecyclerViewId;
            sparseArray.put(this.m.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        r();
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        return this.o.a() ? this.o.g() : super.getAccessibilityClassName();
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.m.getAdapter();
    }

    public f getAnimationConfig() {
        return this.F;
    }

    public int getCurrentItem() {
        return this.k;
    }

    public int getDuration() {
        return this.D;
    }

    public Interpolator getInterpolator() {
        return this.C;
    }

    public int getItemDecorationCount() {
        return this.m.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.B;
    }

    @SuppressLint({"WrongConstant"})
    public int getOrientation() {
        return this.s.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerViewImpl recyclerViewImpl = this.m;
        if (getOrientation() == 0) {
            height = recyclerViewImpl.getWidth() - recyclerViewImpl.getPaddingLeft();
            paddingBottom = recyclerViewImpl.getPaddingRight();
        } else {
            height = recyclerViewImpl.getHeight() - recyclerViewImpl.getPaddingTop();
            paddingBottom = recyclerViewImpl.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f2166n.getScrollState();
    }

    public boolean i() {
        return this.w.b();
    }

    public final RecyclerView.OnChildAttachStateChangeListener j() {
        return new d();
    }

    public final void k(Context context, AttributeSet attributeSet) {
        this.o = I ? new k() : new g();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.m = recyclerViewImpl;
        recyclerViewImpl.setId(ViewCompat.generateViewId());
        this.m.setDescendantFocusability(131072);
        j jVar = new j(context);
        this.s = jVar;
        this.m.setLayoutManager(jVar);
        this.m.setScrollingTouchSlop(1);
        u(context, attributeSet);
        this.m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.m.addOnChildAttachStateChangeListener(j());
        COUIScrollEventAdapter cOUIScrollEventAdapter = new COUIScrollEventAdapter(this);
        this.f2166n = cOUIScrollEventAdapter;
        this.w = new xh2(this, cOUIScrollEventAdapter, this.m);
        l lVar = new l();
        this.u = lVar;
        lVar.attachToRecyclerView(this.m);
        this.m.addOnScrollListener(this.f2166n);
        COUICompositeOnPageChangeCallback cOUICompositeOnPageChangeCallback = new COUICompositeOnPageChangeCallback(3);
        this.v = cOUICompositeOnPageChangeCallback;
        this.f2166n.setOnPageChangeCallback(cOUICompositeOnPageChangeCallback);
        b bVar = new b();
        c cVar = new c();
        this.v.addOnPageChangeCallback(bVar);
        this.v.addOnPageChangeCallback(cVar);
        this.o.h(this.v, this.m);
        this.v.addOnPageChangeCallback(this.p);
        COUIPageTransformerAdapter cOUIPageTransformerAdapter = new COUIPageTransformerAdapter(this.s);
        this.x = cOUIPageTransformerAdapter;
        this.v.addOnPageChangeCallback(cOUIPageTransformerAdapter);
        RecyclerViewImpl recyclerViewImpl2 = this.m;
        attachViewToParent(recyclerViewImpl2, 0, recyclerViewImpl2.getLayoutParams());
        this.E = new kn2(true);
    }

    public boolean l() {
        return this.w.d();
    }

    public boolean m() {
        LinearLayoutManager linearLayoutManager = this.s;
        return linearLayoutManager != null && linearLayoutManager.getLayoutDirection() == 1;
    }

    public boolean n() {
        return this.A;
    }

    public final void o(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.q);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.o.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.m.getMeasuredWidth();
        int measuredHeight = this.m.getMeasuredHeight();
        this.i.left = getPaddingLeft();
        this.i.right = (i4 - i2) - getPaddingRight();
        this.i.top = getPaddingTop();
        this.i.bottom = (i5 - i3) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.i, this.f2164j);
        RecyclerViewImpl recyclerViewImpl = this.m;
        Rect rect = this.f2164j;
        recyclerViewImpl.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f2165l) {
            y();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        measureChild(this.m, i2, i3);
        int measuredWidth = this.m.getMeasuredWidth();
        int measuredHeight = this.m.getMeasuredHeight();
        int measuredState = this.m.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.r = savedState.mCurrentItem;
        this.t = savedState.mAdapterState;
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mRecyclerViewId = this.m.getId();
        int i2 = this.r;
        if (i2 == -1) {
            i2 = this.k;
        }
        savedState.mCurrentItem = i2;
        Parcelable parcelable = this.t;
        if (parcelable != null) {
            savedState.mAdapterState = parcelable;
        } else {
            Object adapter = this.m.getAdapter();
            if (adapter instanceof StatefulAdapter) {
                savedState.mAdapterState = ((StatefulAdapter) adapter).saveState();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(getClass().getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            v();
        }
    }

    public void p(@NonNull ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.p.addOnPageChangeCallback(onPageChangeCallback);
    }

    @Override // android.view.View
    @RequiresApi(16)
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        return this.o.c(i2, bundle) ? this.o.l(i2, bundle) : super.performAccessibilityAction(i2, bundle);
    }

    public void q() {
        if (this.x.getPageTransformer() == null) {
            return;
        }
        double relativeScrollPosition = this.f2166n.getRelativeScrollPosition();
        int i2 = (int) relativeScrollPosition;
        float f2 = (float) (relativeScrollPosition - ((double) i2));
        this.x.onPageScrolled(i2, f2, Math.round(getPageSize() * f2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        RecyclerView.Adapter adapter;
        if (this.r == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.t;
        if (parcelable != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).restoreState(parcelable);
            }
            this.t = null;
        }
        int iMax = Math.max(0, Math.min(this.r, adapter.getItemCount() - 1));
        this.k = iMax;
        this.r = -1;
        this.m.scrollToPosition(iMax);
        this.o.m();
    }

    public void s(int i2, boolean z) {
        if (l()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        t(i2, z);
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.m.getAdapter();
        this.o.f(adapter2);
        w(adapter2);
        this.m.setAdapter(adapter);
        this.k = 0;
        r();
        this.o.e(adapter);
        o(adapter);
    }

    public void setAnimationConfig(@Nullable f fVar) {
        if (fVar == null) {
            fVar = new f();
        }
        this.F = fVar;
    }

    public void setCurrentItem(int i2) {
        s(i2, true);
    }

    @Deprecated
    public void setCurrentItemWithoutAnimation(int i2) {
        bj2.d("COUIViewPager2", "call setCurrentItemWithoutAnimation item=" + i2);
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.r != -1) {
                this.r = Math.max(i2, 0);
            }
        } else {
            if (adapter.getItemCount() <= 0) {
                return;
            }
            this.k = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
        }
    }

    public void setDispatchEventWhileOverScrolling(boolean z) {
        this.m.setDispatchEventWhileOverScrolling(z);
    }

    public void setDispatchEventWhileScrolling(boolean z) {
        RecyclerViewImpl recyclerViewImpl = this.m;
        if (recyclerViewImpl != null) {
            recyclerViewImpl.setDispatchEventWhileScrolling(z);
        }
    }

    public void setDuration(int i2) {
        this.D = i2;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.C = interpolator;
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.o.p();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.B = i2;
        this.m.requestLayout();
    }

    public void setOrientation(int i2) {
        this.s.setOrientation(i2);
        this.o.r();
    }

    public void setOverScrollEnable(boolean z) {
        this.m.setOverScrollEnable(z);
    }

    public void setPageTransformer(@Nullable ViewPager2.PageTransformer pageTransformer) {
        if (pageTransformer != null) {
            if (!this.z) {
                this.y = this.m.getItemAnimator();
                this.z = true;
            }
            this.m.setItemAnimator(null);
        } else if (this.z) {
            this.m.setItemAnimator(this.y);
            this.y = null;
            this.z = false;
        }
        if (pageTransformer == this.x.getPageTransformer()) {
            return;
        }
        this.x.setPageTransformer(pageTransformer);
        q();
    }

    public void setUserInputEnabled(boolean z) {
        this.A = z;
        this.o.s();
    }

    public void t(int i2, boolean z) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.r != -1) {
                this.r = Math.max(i2, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
        if (iMin == this.k && this.f2166n.isIdle()) {
            return;
        }
        int i3 = this.k;
        if (iMin == i3 && z) {
            return;
        }
        double relativeScrollPosition = i3;
        this.k = iMin;
        this.o.q();
        if (!this.f2166n.isIdle()) {
            relativeScrollPosition = this.f2166n.getRelativeScrollPosition();
        }
        this.f2166n.notifyProgrammaticScroll(iMin, z);
        if (!z) {
            this.m.scrollToPosition(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - relativeScrollPosition) <= 3.0d) {
            this.m.smoothScrollToPosition(iMin);
            return;
        }
        this.m.scrollToPosition(d2 > relativeScrollPosition ? iMin - 3 : iMin + 3);
        RecyclerViewImpl recyclerViewImpl = this.m;
        recyclerViewImpl.post(new m(iMin, recyclerViewImpl));
    }

    public final void u(Context context, AttributeSet attributeSet) {
        int[] iArr = androidx.viewpager2.R.styleable.ViewPager2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(androidx.viewpager2.R.styleable.ViewPager2_android_orientation, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void v() {
        View viewFindSnapView = this.u.findSnapView(this.s);
        if (viewFindSnapView == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = this.u.calculateDistanceToFinalSnap(this.s, viewFindSnapView);
        int i2 = iArrCalculateDistanceToFinalSnap[0];
        if (i2 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.m.smoothScrollBy(i2, iArrCalculateDistanceToFinalSnap[1]);
    }

    public final void w(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.q);
        }
    }

    public void x(@NonNull ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.p.removeOnPageChangeCallback(onPageChangeCallback);
    }

    public void y() {
        PagerSnapHelper pagerSnapHelper = this.u;
        if (pagerSnapHelper == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = pagerSnapHelper.findSnapView(this.s);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.s.getPosition(viewFindSnapView);
        if (position != this.k && getScrollState() == 0) {
            this.v.onPageSelected(position);
        }
        this.f2165l = false;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        Parcelable mAdapterState;
        int mCurrentItem;
        int mRecyclerViewId;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @RequiresApi(24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readValues(parcel, classLoader);
        }

        private void readValues(Parcel parcel, ClassLoader classLoader) {
            this.mRecyclerViewId = parcel.readInt();
            this.mCurrentItem = parcel.readInt();
            this.mAdapterState = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mRecyclerViewId);
            parcel.writeInt(this.mCurrentItem);
            parcel.writeParcelable(this.mAdapterState, i);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            readValues(parcel, null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public COUIViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Rect();
        this.f2164j = new Rect();
        this.f2165l = false;
        this.p = new COUICompositeOnPageChangeCallback(3);
        this.q = new a();
        this.r = -1;
        this.y = null;
        this.z = false;
        this.A = true;
        this.B = -1;
        this.C = new LinearInterpolator();
        this.D = 500;
        this.F = new f();
        this.G = 0.0f;
        this.H = 0.0f;
        k(context, attributeSet);
    }

    public COUIViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new Rect();
        this.f2164j = new Rect();
        this.f2165l = false;
        this.p = new COUICompositeOnPageChangeCallback(3);
        this.q = new a();
        this.r = -1;
        this.y = null;
        this.z = false;
        this.A = true;
        this.B = -1;
        this.C = new LinearInterpolator();
        this.D = 500;
        this.F = new f();
        this.G = 0.0f;
        this.H = 0.0f;
        k(context, attributeSet);
    }
}

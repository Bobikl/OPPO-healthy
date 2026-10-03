package com.coui.appcompat.tablayout;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.coui.appcompat.scrollview.COUIHorizontalScrollView;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.om2;
import com.oplus.aiunit.vision.sh2;
import com.support.appcompat.R$attr;
import com.support.tablayout.R$color;
import com.support.tablayout.R$dimen;
import com.support.tablayout.R$style;
import com.support.tablayout.R$styleable;
import io.protostuff.runtime.RuntimeSchema;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class COUITabLayout extends COUIHorizontalScrollView {
    public static final int DEFAULT_MIN_INDICATOR = 32;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int INVALID_WIDTH = -1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    public static final int MOTION_NON_ADJACENT_OFFSET = 24;
    public static final float ONE = 1.0f;
    public static final int PRESS_RIPPLE_CORNER_RADIUS = 8;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final float ZERO = 0.0f;
    public static final Pools.Pool<om2> g1 = new Pools.SynchronizedPool(16);
    public int A0;
    public float B0;

    @Deprecated
    public int C0;
    public int D0;
    public c E0;
    public c F0;
    public ValueAnimator G0;
    public ArgbEvaluator H0;
    public ViewPager I0;
    public PagerAdapter J0;
    public DataSetObserver K0;
    public TabLayoutOnPageChangeListener L0;
    public b M0;
    public boolean N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public float U0;
    public final int V;
    public float V0;
    public final COUISlidingTabStrip W;
    public int W0;
    public boolean X0;
    public int Y0;
    public int Z0;
    public final ArrayList<om2> a0;
    public boolean a1;
    public final ArrayList<c> b0;
    public int b1;
    public final Pools.Pool<COUITabView> c0;
    public int c1;
    public int d0;
    public int d1;
    public int e0;
    public int e1;
    public om2 f0;
    public ArrayList<e> f1;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public ColorStateList k0;
    public Typeface l0;
    public Typeface m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public float z0;

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        public final WeakReference<COUITabLayout> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2115j;
        public int k;

        public TabLayoutOnPageChangeListener(COUITabLayout cOUITabLayout) {
            this.i = new WeakReference<>(cOUITabLayout);
        }

        public void a() {
            this.f2115j = 0;
            this.k = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f2115j = this.k;
            this.k = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            COUITabLayout cOUITabLayout = this.i.get();
            if (cOUITabLayout != null) {
                int i3 = this.k;
                cOUITabLayout.h0(i, f, i3 != 2 || this.f2115j == 1, (i3 == 2 && this.f2115j == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            COUITabLayout cOUITabLayout = this.i.get();
            if (cOUITabLayout == null || cOUITabLayout.getSelectedTabPosition() == i || i >= cOUITabLayout.getTabCount()) {
                return;
            }
            int i2 = this.k;
            cOUITabLayout.d0(cOUITabLayout.V(i), i2 == 0 || (i2 == 2 && this.f2115j == 0));
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUITabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.OnAdapterChangeListener {
        public boolean i;

        public b() {
        }

        public void a(boolean z) {
            this.i = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            if (COUITabLayout.this.I0 == viewPager) {
                COUITabLayout.this.f0(pagerAdapter2, this.i);
            }
        }
    }

    public interface c {
        void a(om2 om2Var);

        void b(om2 om2Var);

        void c(om2 om2Var);
    }

    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            COUITabLayout.this.Y();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            COUITabLayout.this.Y();
        }
    }

    public class e {
        public Drawable a;
        public View.OnClickListener b;
    }

    public static class f implements c {
        public final ViewPager a;

        public f(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.coui.appcompat.tablayout.COUITabLayout.c
        public void a(om2 om2Var) {
        }

        @Override // com.coui.appcompat.tablayout.COUITabLayout.c
        public void b(om2 om2Var) {
            this.a.setCurrentItem(om2Var.d());
        }

        @Override // com.coui.appcompat.tablayout.COUITabLayout.c
        public void c(om2 om2Var) {
        }
    }

    public COUITabLayout(Context context) {
        this(context, null);
    }

    public static ColorStateList K(int i, int i2, int i3) {
        return new ColorStateList(new int[][]{new int[]{16842913, 16842910}, new int[]{-16842913, -16842910}, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2, i});
    }

    private int getDefaultHeight() {
        int size = this.a0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            om2 om2Var = this.a0.get(i);
            if (om2Var != null && om2Var.c() != null && !TextUtils.isEmpty(om2Var.f())) {
                z = true;
                break;
            }
        }
        return z ? 72 : 48;
    }

    private float getScrollPosition() {
        return this.W.getIndicatorPosition();
    }

    private int getTabMinWidth() {
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.W.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.W.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.W.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    public void A(@NonNull om2 om2Var, int i, boolean z) {
        if (om2Var.a != this) {
            throw new IllegalArgumentException("COUITab belongs to a different TabLayout.");
        }
        J(om2Var, i);
        D(om2Var);
        if (z) {
            om2Var.j();
        }
    }

    public void B(@NonNull om2 om2Var, boolean z) {
        A(om2Var, this.a0.size(), z);
    }

    public final void C(@NonNull COUITabItem cOUITabItem) {
        om2 om2VarX = X();
        CharSequence charSequence = cOUITabItem.i;
        if (charSequence != null) {
            om2VarX.r(charSequence);
        }
        Drawable drawable = cOUITabItem.f2114j;
        if (drawable != null) {
            om2VarX.o(drawable);
        }
        int i = cOUITabItem.k;
        if (i != 0) {
            om2VarX.m(i);
        }
        if (!TextUtils.isEmpty(cOUITabItem.getContentDescription())) {
            om2VarX.l(cOUITabItem.getContentDescription());
        }
        z(om2VarX);
    }

    public final void D(om2 om2Var) {
        this.W.addView(om2Var.b, om2Var.d(), L());
    }

    public final void E(View view) {
        if (!(view instanceof COUITabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        C((COUITabItem) view);
    }

    public final void F(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.W.c()) {
            g0(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iH = H(i, 0.0f);
        if (scrollX != iH) {
            T();
            this.G0.setIntValues(scrollX, iH);
            this.G0.start();
        }
        this.W.b(i, 300);
    }

    public final void G() {
        n0(true);
    }

    public final int H(int i, float f2) {
        int width;
        int width2 = 0;
        if (getWidth() == 0) {
            return 0;
        }
        View childAt = this.W.getChildAt(i);
        int i2 = i + 1;
        View childAt2 = i2 < this.W.getChildCount() ? this.W.getChildAt(i2) : null;
        if (childAt != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        } else {
            width = 0;
        }
        if (childAt2 != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            width2 = layoutParams2.rightMargin + childAt2.getWidth() + layoutParams2.leftMargin;
        }
        int width3 = (width / 2) - (getWidth() / 2);
        if (childAt != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            width3 += ViewCompat.getLayoutDirection(this) == 0 ? (childAt.getLeft() - layoutParams3.leftMargin) + (getPaddingLeft() / 2) + (getPaddingRight() / 2) : ((childAt.getRight() + layoutParams3.rightMargin) - (getPaddingLeft() / 2)) - (getPaddingRight() / 2);
        }
        int i3 = (int) ((width + width2) * 0.5f * f2);
        return ViewCompat.getLayoutDirection(this) == 0 ? width3 + i3 : width3 - i3;
    }

    public void I() {
        this.b0.clear();
    }

    public final void J(om2 om2Var, int i) {
        om2Var.q(i);
        this.a0.add(i, om2Var);
        int size = this.a0.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.a0.get(i).q(i);
            }
        }
    }

    public final LinearLayout.LayoutParams L() {
        return new LinearLayout.LayoutParams(1, -1);
    }

    public final COUITabView M(@NonNull om2 om2Var) {
        Pools.Pool<COUITabView> pool = this.c0;
        COUITabView cOUITabViewAcquire = pool != null ? pool.acquire() : null;
        if (cOUITabViewAcquire == null) {
            cOUITabViewAcquire = new COUITabView(getContext(), this);
        }
        cOUITabViewAcquire.setTab(om2Var);
        cOUITabViewAcquire.setFocusable(true);
        cOUITabViewAcquire.setMinimumWidth(getTabMinWidth());
        cOUITabViewAcquire.setEnabled(isEnabled());
        return cOUITabViewAcquire;
    }

    public final void N(@NonNull om2 om2Var) {
        for (int size = this.b0.size() - 1; size >= 0; size--) {
            this.b0.get(size).a(om2Var);
        }
    }

    public final void O(@NonNull om2 om2Var) {
        for (int size = this.b0.size() - 1; size >= 0; size--) {
            this.b0.get(size).b(om2Var);
        }
    }

    public final void P(@NonNull om2 om2Var) {
        for (int size = this.b0.size() - 1; size >= 0; size--) {
            this.b0.get(size).c(om2Var);
        }
    }

    public int Q(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final void R(Canvas canvas) {
        int width;
        int scrollX;
        int width2;
        int width3;
        int scrollX2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_tab_layout_button_width);
        if (this.f1.size() == 1) {
            Drawable drawable = this.f1.get(0).a;
            int dimensionPixelSize2 = this.b1;
            if (dimensionPixelSize2 == -1) {
                dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.coui_tab_layout_button_default_horizontal_margin);
            }
            if (ViewCompat.getLayoutDirection(this) == 1) {
                width2 = getScrollX() + dimensionPixelSize2;
                width3 = dimensionPixelSize + dimensionPixelSize2;
                scrollX2 = getScrollX();
            } else {
                width2 = (getWidth() - (dimensionPixelSize + dimensionPixelSize2)) + getScrollX();
                width3 = getWidth() - dimensionPixelSize2;
                scrollX2 = getScrollX();
            }
            int i = width3 + scrollX2;
            int height = getHeight() / 2;
            Resources resources = getResources();
            int i2 = R$dimen.coui_tab_layout_button_default_vertical_margin;
            drawable.setBounds(width2, height - resources.getDimensionPixelSize(i2), i, (getHeight() / 2) + getResources().getDimensionPixelSize(i2));
            drawable.draw(canvas);
            return;
        }
        if (this.f1.size() >= 2) {
            for (int i3 = 0; i3 < this.f1.size(); i3++) {
                int dimensionPixelSize3 = this.b1;
                if (dimensionPixelSize3 == -1) {
                    dimensionPixelSize3 = getResources().getDimensionPixelSize(R$dimen.coui_tab_layout_multi_button_default_horizontal_margin);
                }
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    scrollX = dimensionPixelSize3 + (getResources().getDimensionPixelSize(R$dimen.coui_tab_layout_multi_button_default_padding) * i3);
                    width = getScrollX();
                } else {
                    width = getWidth() - ((dimensionPixelSize3 + dimensionPixelSize) + (getResources().getDimensionPixelSize(R$dimen.coui_tab_layout_multi_button_default_padding) * i3));
                    scrollX = getScrollX();
                }
                int i4 = scrollX + width;
                Drawable drawable2 = this.f1.get(i3).a;
                int height2 = getHeight() / 2;
                Resources resources2 = getResources();
                int i5 = R$dimen.coui_tab_layout_button_default_vertical_margin;
                drawable2.setBounds(i4, height2 - resources2.getDimensionPixelSize(i5), i4 + dimensionPixelSize, (getHeight() / 2) + getResources().getDimensionPixelSize(i5));
                drawable2.draw(canvas);
            }
        }
    }

    public boolean S(int i, boolean z) {
        COUITabView cOUITabView;
        om2 om2VarV = V(i);
        if (om2VarV == null || (cOUITabView = om2VarV.b) == null) {
            return false;
        }
        cOUITabView.setEnabled(z);
        return true;
    }

    public final void T() {
        if (this.G0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.G0 = valueAnimator;
            valueAnimator.setInterpolator(new sh2());
            this.G0.setDuration(300L);
            this.G0.addUpdateListener(new a());
        }
    }

    public int U(int i, int i2) {
        return Math.min(300, (Math.abs(i - i2) * 50) + 150);
    }

    @Nullable
    public om2 V(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.a0.get(i);
    }

    public boolean W() {
        return this.a1;
    }

    @NonNull
    public om2 X() {
        om2 om2VarAcquire = g1.acquire();
        if (om2VarAcquire == null) {
            om2VarAcquire = new om2();
        }
        om2VarAcquire.a = this;
        om2VarAcquire.b = M(om2VarAcquire);
        return om2VarAcquire;
    }

    public void Y() {
        int currentItem;
        Z();
        PagerAdapter pagerAdapter = this.J0;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            PagerAdapter pagerAdapter2 = this.J0;
            if (pagerAdapter2 instanceof COUIFragmentStatePagerAdapter) {
                COUIFragmentStatePagerAdapter cOUIFragmentStatePagerAdapter = (COUIFragmentStatePagerAdapter) pagerAdapter2;
                for (int i = 0; i < count; i++) {
                    if (cOUIFragmentStatePagerAdapter.getPageIcon(i) > 0) {
                        B(X().n(cOUIFragmentStatePagerAdapter.getPageIcon(i)), false);
                    } else {
                        B(X().r(cOUIFragmentStatePagerAdapter.getPageTitle(i)), false);
                    }
                }
            } else {
                for (int i2 = 0; i2 < count; i2++) {
                    B(X().r(this.J0.getPageTitle(i2)), false);
                }
            }
            ViewPager viewPager = this.I0;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            c0(V(currentItem));
        }
    }

    public void Z() {
        for (int childCount = this.W.getChildCount() - 1; childCount >= 0; childCount--) {
            a0(childCount);
        }
        Iterator<om2> it = this.a0.iterator();
        while (it.hasNext()) {
            om2 next = it.next();
            it.remove();
            next.i();
            g1.release(next);
        }
        this.f0 = null;
        this.o0 = false;
    }

    public final void a0(int i) {
        COUITabView cOUITabView = (COUITabView) this.W.getChildAt(i);
        this.W.removeViewAt(i);
        if (cOUITabView != null) {
            cOUITabView.e();
            this.c0.release(cOUITabView);
        }
        requestLayout();
    }

    public void addOnTabSelectedListener(@NonNull c cVar) {
        if (this.b0.contains(cVar)) {
            return;
        }
        this.b0.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        E(view);
    }

    public void b0() {
        int childCount = this.W.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.W.getChildAt(i);
            if (childAt instanceof COUITabView) {
                ((COUITabView) childAt).getTextView().setTextColor(this.k0);
            }
        }
    }

    public void c0(om2 om2Var) {
        d0(om2Var, true);
    }

    public void d0(om2 om2Var, boolean z) {
        om2 om2Var2 = this.f0;
        if (om2Var2 == om2Var) {
            if (om2Var2 != null) {
                N(om2Var);
                return;
            }
            return;
        }
        int iD = om2Var != null ? om2Var.d() : -1;
        if (z) {
            if ((om2Var2 == null || om2Var2.d() == -1) && iD != -1) {
                g0(iD, 0.0f, true);
            } else {
                F(iD);
            }
            if (iD != -1) {
                setSelectedTabView(iD);
            }
            this.y0 = iD;
        } else if (isEnabled() && this.t0) {
            performHapticFeedback(302);
        }
        if (om2Var2 != null) {
            P(om2Var2);
        }
        this.f0 = om2Var;
        if (om2Var != null) {
            O(om2Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip != null) {
            if (cOUISlidingTabStrip.getIndicatorBackgroundPaint() != null) {
                canvas.drawRect(this.W.getIndicatorBackgroundPaddingLeft() + getScrollX(), getHeight() - this.W.getIndicatorBackgroundHeight(), (getWidth() + getScrollX()) - this.W.getIndicatorBackgroundPaddingRight(), getHeight(), this.W.getIndicatorBackgroundPaint());
            }
            if (this.W.getSelectedIndicatorPaint() != null) {
                canvas.drawText(" ", 0.0f, 0.0f, this.W.getSelectedIndicatorPaint());
                if (this.W.getIndicatorRight() > this.W.getIndicatorLeft()) {
                    int paddingLeft = getPaddingLeft() + this.W.getIndicatorLeft();
                    int paddingLeft2 = getPaddingLeft() + this.W.getIndicatorRight();
                    int scrollX = (getScrollX() + getPaddingLeft()) - this.T0;
                    int scrollX2 = ((getScrollX() + getWidth()) - getPaddingRight()) + this.T0;
                    boolean z = false;
                    if (paddingLeft2 > scrollX && paddingLeft < scrollX2) {
                        z = true;
                    }
                    if (z) {
                        if (paddingLeft < scrollX) {
                            paddingLeft = scrollX;
                        }
                        if (paddingLeft2 > scrollX2) {
                            paddingLeft2 = scrollX2;
                        }
                        canvas.drawRect(paddingLeft, getHeight() - this.W.v, paddingLeft2, getHeight(), this.W.getSelectedIndicatorPaint());
                    }
                }
                if (this.X0) {
                    canvas.drawRect(getLeft(), getHeight() - 1, getScrollX() + getWidth() + this.T0, getHeight(), this.W.getBottomDividerPaint());
                }
            }
        }
        R(canvas);
    }

    public void e0(int i, int i2) {
        ViewCompat.setPaddingRelative(this, i, 0, i2, 0);
    }

    public void f0(@Nullable PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.J0;
        if (pagerAdapter2 != null && (dataSetObserver = this.K0) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.J0 = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.K0 == null) {
                this.K0 = new d();
            }
            pagerAdapter.registerDataSetObserver(this.K0);
        }
        Y();
    }

    public void g0(int i, float f2, boolean z) {
        h0(i, f2, z, true);
    }

    public float getDefaultIndicatoRatio() {
        return this.U0;
    }

    public int getIndicatorBackgroundHeight() {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip == null) {
            return -1;
        }
        return cOUISlidingTabStrip.getIndicatorBackgroundHeight();
    }

    public int getIndicatorBackgroundPaddingLeft() {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip == null) {
            return -1;
        }
        return cOUISlidingTabStrip.getIndicatorBackgroundPaddingLeft();
    }

    public int getIndicatorBackgroundPaddingRight() {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip == null) {
            return -1;
        }
        return cOUISlidingTabStrip.getIndicatorBackgroundPaddingRight();
    }

    public int getIndicatorBackgroundPaintColor() {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip == null) {
            return -1;
        }
        return cOUISlidingTabStrip.getIndicatorBackgroundPaint().getColor();
    }

    public int getIndicatorPadding() {
        return this.T0;
    }

    public float getIndicatorWidthRatio() {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip == null) {
            return -1.0f;
        }
        return cOUISlidingTabStrip.getIndicatorWidthRatio();
    }

    public int getRequestedTabMaxWidth() {
        return this.n0;
    }

    public int getRequestedTabMinWidth() {
        return this.u0;
    }

    @ColorInt
    public int getSelectedIndicatorColor() {
        return this.P0;
    }

    public int getSelectedTabPosition() {
        om2 om2Var = this.f0;
        if (om2Var != null) {
            return om2Var.d();
        }
        return -1;
    }

    public int getTabCount() {
        return this.a0.size();
    }

    public int getTabGravity() {
        return this.C0;
    }

    public int getTabMinDivider() {
        return this.R0;
    }

    public int getTabMinMargin() {
        return this.S0;
    }

    public int getTabMode() {
        return this.D0;
    }

    public int getTabPaddingBottom() {
        return this.j0;
    }

    public int getTabPaddingEnd() {
        return this.i0;
    }

    public int getTabPaddingStart() {
        return this.g0;
    }

    public int getTabPaddingTop() {
        return this.h0;
    }

    public COUISlidingTabStrip getTabStrip() {
        return this.W;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.k0;
    }

    public float getTabTextSize() {
        return this.B0;
    }

    public void h0(int i, float f2, boolean z, boolean z2) {
        int iRound = Math.round(i + f2);
        if (iRound < 0 || iRound >= this.W.getChildCount()) {
            return;
        }
        if (z2) {
            this.W.n(i, f2);
        } else if (this.W.r != getSelectedTabPosition()) {
            this.W.r = getSelectedTabPosition();
            this.W.r();
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.G0.cancel();
        }
        scrollTo(H(i, f2), 0);
        if (z) {
            i0(iRound, f2);
        }
    }

    public final void i0(int i, float f2) {
        COUITabView cOUITabView;
        float f3;
        if (Math.abs(f2 - this.z0) > 0.5f || f2 == 0.0f) {
            this.y0 = i;
        }
        this.z0 = f2;
        if (i != this.y0 && isEnabled()) {
            COUITabView cOUITabView2 = (COUITabView) this.W.getChildAt(i);
            if (f2 >= 0.5f) {
                cOUITabView = (COUITabView) this.W.getChildAt(i - 1);
                f3 = f2 - 0.5f;
            } else {
                cOUITabView = (COUITabView) this.W.getChildAt(i + 1);
                f3 = 0.5f - f2;
            }
            float f4 = f3 / 0.5f;
            if (cOUITabView.getTextView() != null) {
                cOUITabView.getTextView().setTextColor(((Integer) this.H0.evaluate(f4, Integer.valueOf(this.e0), Integer.valueOf(this.d0))).intValue());
            }
            if (cOUITabView2.getTextView() != null) {
                cOUITabView2.getTextView().setTextColor(((Integer) this.H0.evaluate(f4, Integer.valueOf(this.d0), Integer.valueOf(this.e0))).intValue());
            }
        }
        if (f2 != 0.0f || i >= getTabCount()) {
            return;
        }
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= getTabCount()) {
                this.p0 = true;
                return;
            }
            View childAt = this.W.getChildAt(i2);
            COUITabView cOUITabView3 = (COUITabView) childAt;
            if (cOUITabView3.getTextView() != null) {
                cOUITabView3.getTextView().setTextColor(this.k0);
            }
            if (i2 != i) {
                z = false;
            }
            childAt.setSelected(z);
            i2++;
        }
    }

    public void j0(int i, int i2) {
        setTabTextColors(K(i, this.Q0, i2));
    }

    public void k0(@Nullable ViewPager viewPager, boolean z) {
        l0(viewPager, z, false);
    }

    public final void l0(@Nullable ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.I0;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.L0;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            b bVar = this.M0;
            if (bVar != null) {
                this.I0.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.F0;
        if (cVar != null) {
            removeOnTabSelectedListener(cVar);
            this.F0 = null;
        }
        if (viewPager != null) {
            this.I0 = viewPager;
            if (this.L0 == null) {
                this.L0 = new TabLayoutOnPageChangeListener(this);
            }
            this.L0.a();
            viewPager.addOnPageChangeListener(this.L0);
            f fVar = new f(viewPager);
            this.F0 = fVar;
            addOnTabSelectedListener(fVar);
            if (viewPager.getAdapter() != null) {
                f0(viewPager.getAdapter(), z);
            }
            if (this.M0 == null) {
                this.M0 = new b();
            }
            this.M0.a(z);
            viewPager.addOnAdapterChangeListener(this.M0);
            g0(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.I0 = null;
            f0(null, false);
        }
        this.N0 = z2;
    }

    public final void m0() {
        int size = this.a0.size();
        for (int i = 0; i < size; i++) {
            this.a0.get(i).t();
        }
    }

    public void n0(boolean z) {
        for (int i = 0; i < this.W.getChildCount(); i++) {
            COUITabView cOUITabView = (COUITabView) this.W.getChildAt(i);
            cOUITabView.setMinimumWidth(getTabMinWidth());
            if (cOUITabView.getTextView() != null) {
                ViewCompat.setPaddingRelative(cOUITabView.getTextView(), this.g0, this.h0, this.i0, this.j0);
            }
            if (z) {
                cOUITabView.requestLayout();
            }
        }
    }

    public final void o0() {
        this.d0 = this.k0.getDefaultColor();
        int colorForState = this.k0.getColorForState(new int[]{16842910, 16842913}, lh2.b(getContext(), R$attr.couiColorPrimaryText, 0));
        this.e0 = colorForState;
        this.v0 = Math.abs(Color.red(colorForState) - Color.red(this.d0));
        this.w0 = Math.abs(Color.green(this.e0) - Color.green(this.d0));
        this.x0 = Math.abs(Color.blue(this.e0) - Color.blue(this.d0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                l0((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o0 = false;
    }

    @Override // com.coui.appcompat.scrollview.COUIHorizontalScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.N0) {
            setupWithViewPager(null);
            this.N0 = false;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 0));
    }

    @Override // com.coui.appcompat.scrollview.COUIHorizontalScrollView, android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            for (int i = 0; i < this.f1.size(); i++) {
                if (this.f1.get(i).b != null && this.f1.get(i).a.getBounds().contains(((int) motionEvent.getX()) + getScrollX(), (int) motionEvent.getY())) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.p0 || (i5 = this.y0) < 0 || i5 >= this.W.getChildCount()) {
            return;
        }
        this.p0 = false;
        scrollTo(H(this.y0, 0.0f), 0);
    }

    @Override // com.coui.appcompat.scrollview.COUIHorizontalScrollView, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iQ = Q(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(iQ, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(iQ, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.e1 == -1) {
            this.n0 = (int) (size * 0.7f);
        }
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            setMeasuredDimension(0, 0);
            return;
        }
        int i3 = this.D0;
        if (i3 == 0) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(RuntimeSchema.MAX_TAG_VALUE, Integer.MIN_VALUE), i2);
        } else if (i3 == 1) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        setMeasuredDimension(size, getChildAt(0).getMeasuredHeight());
    }

    @Override // com.coui.appcompat.scrollview.COUIHorizontalScrollView, android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            for (int i = 0; i < this.f1.size(); i++) {
                if (this.f1.get(i).b != null && this.f1.get(i).a.getBounds().contains(((int) motionEvent.getX()) + getScrollX(), (int) motionEvent.getY())) {
                    this.f1.get(i).b.onClick(this);
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnTabSelectedListener(@NonNull c cVar) {
        this.b0.remove(cVar);
    }

    @Override // com.coui.appcompat.scrollview.COUIHorizontalScrollView
    public void setEnableVibrator(boolean z) {
        this.t0 = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.W.setSelectedIndicatorColor(z ? this.P0 : this.c1);
        for (int i = 0; i < getTabCount(); i++) {
            S(i, z);
        }
    }

    public void setIndicatorAnimTime(int i) {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip != null) {
            cOUISlidingTabStrip.setIndicatorAnimTime(i);
        }
    }

    public void setIndicatorBackgroundColor(int i) {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip == null) {
            return;
        }
        cOUISlidingTabStrip.getIndicatorBackgroundPaint().setColor(i);
    }

    public void setIndicatorBackgroundHeight(int i) {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip == null) {
            return;
        }
        cOUISlidingTabStrip.setIndicatorBackgroundHeight(i);
    }

    public void setIndicatorBackgroundPaddingLeft(int i) {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip == null) {
            return;
        }
        cOUISlidingTabStrip.setIndicatorBackgroundPaddingLeft(i);
    }

    public void setIndicatorBackgroundPaddingRight(int i) {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip == null) {
            return;
        }
        cOUISlidingTabStrip.setIndicatorBackgroundPaddingRight(i);
    }

    public void setIndicatorPadding(int i) {
        this.T0 = i;
        requestLayout();
    }

    public void setIndicatorWidthRatio(float f2) {
        COUISlidingTabStrip cOUISlidingTabStrip = this.W;
        if (cOUISlidingTabStrip == null) {
            return;
        }
        this.U0 = f2;
        cOUISlidingTabStrip.setIndicatorWidthRatio(f2);
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable c cVar) {
        c cVar2 = this.E0;
        if (cVar2 != null) {
            removeOnTabSelectedListener(cVar2);
        }
        this.E0 = cVar;
        if (cVar != null) {
            addOnTabSelectedListener(cVar);
        }
    }

    public void setRequestedTabMaxWidth(int i) {
        this.n0 = i;
        this.e1 = i;
    }

    public void setRequestedTabMinWidth(int i) {
        this.u0 = i;
        this.d1 = i;
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        T();
        this.G0.addListener(animatorListener);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i) {
        this.W.setSelectedIndicatorColor(i);
        this.P0 = i;
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.W.setSelectedIndicatorHeight(i);
    }

    public void setTabGravity(int i) {
    }

    public void setTabMinDivider(int i) {
        this.R0 = i;
        requestLayout();
    }

    public void setTabMinMargin(int i) {
        this.S0 = i;
        ViewCompat.setPaddingRelative(this, i, 0, i, 0);
        requestLayout();
    }

    public void setTabMode(int i) {
        if (i != this.D0) {
            this.D0 = i;
            G();
        }
    }

    public void setTabPaddingBottom(int i) {
        this.j0 = i;
        requestLayout();
    }

    public void setTabPaddingEnd(int i) {
        this.i0 = i;
        requestLayout();
    }

    public void setTabPaddingStart(int i) {
        this.g0 = i;
        requestLayout();
    }

    public void setTabPaddingTop(int i) {
        this.h0 = i;
        requestLayout();
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            this.k0 = colorStateList;
            o0();
            m0();
        }
    }

    public void setTabTextSize(float f2) {
        if (this.W != null) {
            this.V0 = f2;
            this.B0 = f2;
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        f0(pagerAdapter, false);
    }

    public void setUpdateindicatorposition(boolean z) {
        this.a1 = z;
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        k0(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void z(@NonNull om2 om2Var) {
        B(om2Var, this.a0.isEmpty());
    }

    public COUITabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.support.tablayout.R$attr.couiTabLayoutStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        E(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public COUITabLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.COUITabLayoutBaseStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        E(view);
    }

    public COUITabLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a0 = new ArrayList<>();
        this.b0 = new ArrayList<>();
        this.c0 = new Pools.SimplePool(12);
        this.n0 = -1;
        this.y0 = 0;
        this.z0 = 0.0f;
        this.H0 = new ArgbEvaluator();
        this.a1 = false;
        this.f1 = new ArrayList<>();
        if (attributeSet != null) {
            int styleAttribute = attributeSet.getStyleAttribute();
            this.Z0 = styleAttribute;
            if (styleAttribute == 0) {
                this.Z0 = i;
            }
        } else {
            this.Z0 = i;
        }
        this.l0 = Typeface.create("sans-serif-medium", 0);
        this.m0 = Typeface.create("sans-serif", 0);
        setHorizontalScrollBarEnabled(false);
        COUISlidingTabStrip cOUISlidingTabStrip = new COUISlidingTabStrip(context, this);
        this.W = cOUISlidingTabStrip;
        super.addView(cOUISlidingTabStrip, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUITabLayout, i, i2);
        cOUISlidingTabStrip.setSelectedIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITabLayout_couiTabIndicatorHeight, 0));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.COUITabLayout_couiTabIndicatorColor, 0);
        this.P0 = color;
        cOUISlidingTabStrip.setSelectedIndicatorColor(color);
        this.W0 = typedArrayObtainStyledAttributes.getColor(R$styleable.COUITabLayout_couiTabBottomDividerColor, 0);
        this.X0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUITabLayout_couiTabBottomDividerEnabled, false);
        cOUISlidingTabStrip.setBottomDividerColor(this.W0);
        setIndicatorBackgroundHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITabLayout_couiTabIndicatorBackgroundHeight, 0));
        setIndicatorBackgroundColor(typedArrayObtainStyledAttributes.getColor(R$styleable.COUITabLayout_couiTabIndicatorBackgroundColor, 0));
        setIndicatorBackgroundPaddingLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITabLayout_couiTabIndicatorBackgroundPaddingLeft, 0));
        setIndicatorBackgroundPaddingRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITabLayout_couiTabIndicatorBackgroundPaddingRight, 0));
        setIndicatorWidthRatio(typedArrayObtainStyledAttributes.getFloat(R$styleable.COUITabLayout_couiTabIndicatorWidthRatio, 0.0f));
        this.O0 = getResources().getDimensionPixelOffset(R$dimen.coui_tablayout_default_resize_height);
        this.Y0 = getResources().getDimensionPixelOffset(R$dimen.tablayout_long_text_view_height);
        this.R0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUITabLayout_couiTabMinDivider, -1);
        this.S0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUITabLayout_couiTabMinMargin, -1);
        this.T0 = getResources().getDimensionPixelOffset(R$dimen.coui_tablayout_indicator_padding);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITabLayout_couiTabPadding, -1);
        this.g0 = dimensionPixelSize;
        this.h0 = dimensionPixelSize;
        this.i0 = dimensionPixelSize;
        this.j0 = dimensionPixelSize;
        this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITabLayout_couiTabPaddingStart, dimensionPixelSize);
        this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITabLayout_couiTabPaddingTop, this.h0);
        this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITabLayout_couiTabPaddingEnd, this.i0);
        this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITabLayout_couiTabPaddingBottom, this.j0);
        this.g0 = Math.max(0, this.g0);
        this.h0 = Math.max(0, this.h0);
        this.i0 = Math.max(0, this.i0);
        this.j0 = Math.max(0, this.j0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUITabLayout_couiTabTextAppearance, R$style.TextAppearance_Design_COUITab);
        this.A0 = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, R.styleable.TextAppearance);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
            this.B0 = dimensionPixelSize2;
            this.V0 = dimensionPixelSize2;
            this.k0 = typedArrayObtainStyledAttributes2.getColorStateList(R.styleable.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes2.recycle();
            int i3 = R$styleable.COUITabLayout_couiTabTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i3)) {
                this.k0 = typedArrayObtainStyledAttributes.getColorStateList(i3);
            }
            this.Q0 = lh2.b(getContext(), R$attr.couiColorDisabledNeutral, 0);
            int i4 = R$styleable.COUITabLayout_couiTabSelectedTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                this.k0 = K(this.k0.getDefaultColor(), this.Q0, typedArrayObtainStyledAttributes.getColor(i4, 0));
            }
            this.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITabLayout_couiTabMinWidth, -1);
            this.V = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUITabLayout_couiTabBackground, 0);
            this.D0 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUITabLayout_couiTabMode, 1);
            this.C0 = typedArrayObtainStyledAttributes.getInt(R$styleable.COUITabLayout_couiTabGravity, 0);
            this.t0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUITabLayout_couiTabEnableVibrator, true);
            this.c1 = typedArrayObtainStyledAttributes.getColor(R$styleable.COUITabLayout_couiTabIndicatorDisableColor, getResources().getColor(R$color.couiTabIndicatorDisableColor));
            int i5 = R$styleable.COUITabLayout_couiTabTextSize;
            if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                float dimension = typedArrayObtainStyledAttributes.getDimension(i5, 0.0f);
                this.B0 = dimension;
                this.V0 = dimension;
            }
            this.d1 = this.u0;
            this.e1 = this.n0;
            this.b1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUITabLayout_couiTabButtonMarginEnd, -1);
            typedArrayObtainStyledAttributes.recycle();
            this.q0 = context.getResources().getDimensionPixelSize(com.support.reddot.R$dimen.coui_dot_horizontal_offset);
            this.r0 = context.getResources().getDimensionPixelSize(com.support.reddot.R$dimen.coui_dot_vertical_offset_only_red);
            this.s0 = context.getResources().getDimensionPixelSize(com.support.reddot.R$dimen.coui_dot_vertical_offset_number_red);
            G();
            o0();
            setOverScrollMode(1);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        E(view);
    }
}

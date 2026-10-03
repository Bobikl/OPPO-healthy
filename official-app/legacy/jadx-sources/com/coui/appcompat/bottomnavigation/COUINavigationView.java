package com.coui.appcompat.bottomnavigation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.coui.appcompat.material.bottomnavigation.BottomNavigationView;
import com.coui.appcompat.material.navigation.NavigationBarMenuView;
import com.coui.appcompat.material.navigation.NavigationBarView;
import com.google.android.material.internal.ViewUtils;
import com.oplus.aiunit.vision.gg2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.nj2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.rne;
import com.oplus.aiunit.vision.ti2;
import com.oplus.aiunit.vision.vi2;
import com.support.appcompat.R$attr;
import com.support.bottomnavigation.R$color;
import com.support.bottomnavigation.R$dimen;
import com.support.bottomnavigation.R$style;
import com.support.bottomnavigation.R$styleable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class COUINavigationView extends BottomNavigationView implements rne {
    public static final int DEFAULT_ITEM_LAYOUT_TYPE = 0;
    public static final int ENTER_ANIMATION_TYPE = 1;
    public static final int EXIT_ANIMATION_TYPE = 2;
    public static final int NAVIGATION_TYPE_ENLARGE = 2;
    public static final int NAVIGATION_TYPE_TAB = 1;
    public static final int NAVIGATION_TYPE_TOOL = 0;
    public static final int VERTICAL_ITEM_LAYOUT_TYPE = 1;
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public Rect E;
    public Rect F;
    public Rect G;
    public Animator o;
    public Animator p;
    public ValueAnimator q;
    public ValueAnimator r;
    public ValueAnimator s;
    public int t;
    public COUINavigationMenuView u;
    public FrameLayout v;
    public int w;
    public int x;
    public View y;
    public int z;

    public class a implements ViewUtils.OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
            boolean z = ViewCompat.getLayoutDirection(view) == 1;
            int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).left;
            int i2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).right;
            relativePadding.start += z ? i2 : i;
            int i3 = relativePadding.end;
            if (!z) {
                i = i2;
            }
            relativePadding.end = i3 + i;
            relativePadding.applyToView(view);
            return windowInsetsCompat;
        }
    }

    public class b implements NavigationBarView.c {
        public b() {
        }

        @Override // com.coui.appcompat.material.navigation.NavigationBarView.c
        public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem menuItem) {
            COUINavigationView cOUINavigationView = COUINavigationView.this;
            cOUINavigationView.C = cOUINavigationView.u.getEnlargeId() == menuItem.getItemId();
            COUINavigationView.m(COUINavigationView.this);
            boolean unused = COUINavigationView.this.C;
            throw null;
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUINavigationView.p(COUINavigationView.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (COUINavigationView.this.x != 0) {
                COUINavigationView cOUINavigationView = COUINavigationView.this;
                cOUINavigationView.f(cOUINavigationView.x);
                COUINavigationView.this.x = 0;
            }
        }
    }

    public class d implements Animator.AnimatorListener {
        public final /* synthetic */ AnimatorSet i;

        public d(AnimatorSet animatorSet) {
            this.i = animatorSet;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (COUINavigationView.this.x != 0) {
                COUINavigationView.this.u.setTranslationY(-COUINavigationView.this.getHeight());
                this.i.start();
            }
            COUINavigationView.p(COUINavigationView.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            COUINavigationView.this.u.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * COUINavigationView.this.getMeasuredHeight());
        }
    }

    public class f implements Animator.AnimatorListener {
        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUINavigationView.q(COUINavigationView.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            COUINavigationView.q(COUINavigationView.this);
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {
        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) COUINavigationView.this.getLayoutParams();
            marginLayoutParams.bottomMargin = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * COUINavigationView.this.getMeasuredHeight() * (-1.0f));
            COUINavigationView.this.setLayoutParams(marginLayoutParams);
            COUINavigationView.q(COUINavigationView.this);
        }
    }

    public class h implements Animator.AnimatorListener {
        public h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUINavigationView.q(COUINavigationView.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            COUINavigationView.q(COUINavigationView.this);
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) COUINavigationView.this.getLayoutParams();
            marginLayoutParams.bottomMargin = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * COUINavigationView.this.getMeasuredHeight() * (-1.0f));
            COUINavigationView.this.setLayoutParams(marginLayoutParams);
            COUINavigationView.q(COUINavigationView.this);
        }
    }

    public interface j {
    }

    public interface k {
    }

    public interface l {
    }

    public interface m {
    }

    public COUINavigationView(Context context) {
        this(context, null);
    }

    private void g(Context context) {
        View view = new View(context);
        this.y = view;
        ph2.c(view, false);
        this.y.setBackgroundColor(lh2.a(context, R$attr.couiColorDivider));
        this.y.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R$dimen.coui_navigation_shadow_height)));
        if (this.B) {
            addView(this.y, 0);
        } else {
            addView(this.y);
            this.u.setTop(0);
        }
    }

    public static /* synthetic */ k m(COUINavigationView cOUINavigationView) {
        cOUINavigationView.getClass();
        return null;
    }

    public static /* synthetic */ l p(COUINavigationView cOUINavigationView) {
        cOUINavigationView.getClass();
        return null;
    }

    public static /* synthetic */ m q(COUINavigationView cOUINavigationView) {
        cOUINavigationView.getClass();
        return null;
    }

    public static boolean v(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // com.coui.appcompat.material.bottomnavigation.BottomNavigationView, com.coui.appcompat.material.navigation.NavigationBarView
    @NonNull
    @NotNull
    public NavigationBarMenuView e(@NonNull @NotNull Context context) {
        return new COUINavigationMenuView(new ContextThemeWrapper(context, lh2.f(context, com.support.bottomnavigation.R$attr.COUINavigationViewItemStyle, R$style.COUINavigationView_NoAnimation)));
    }

    @Override // com.coui.appcompat.material.navigation.NavigationBarView
    public void f(int i2) {
        if (getMenu().size() > 0) {
            getMenu().clear();
        }
        super.f(i2);
        if (this.t == 0) {
            this.u.setShowPressShadow(true);
        }
    }

    @Override // com.oplus.aiunit.vision.rne
    public int getBarrierDirection() {
        if (this.F == null) {
            this.F = new Rect();
        }
        getRootView().getGlobalVisibleRect(this.F);
        return this.F.height() <= getContext().getResources().getDimensionPixelSize(com.support.poplist.R$dimen.coui_popup_list_window_min_window_height_to_apply_vertical_barrier) ? -1 : 3;
    }

    public COUINavigationMenuView getCOUINavigationMenuView() {
        return this.u;
    }

    @Override // com.oplus.aiunit.vision.rne
    @NonNull
    public Rect getDisplayFrame() {
        if (this.E == null) {
            this.E = new Rect();
        }
        getGlobalVisibleRect(this.E);
        return this.E;
    }

    public View getDividerView() {
        return this.y;
    }

    public FrameLayout getEnlargeBgView() {
        return this.v;
    }

    @Override // com.coui.appcompat.material.bottomnavigation.BottomNavigationView, com.coui.appcompat.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 10;
    }

    @Override // com.oplus.aiunit.vision.rne
    @NonNull
    public Rect getOutsets() {
        if (this.G == null) {
            this.G = new Rect(0, getContext().getResources().getDimensionPixelOffset(R$dimen.coui_popup_list_window_gap_to_navigation_view), 0, 0);
        }
        return this.G;
    }

    @Override // com.oplus.aiunit.vision.rne
    public boolean getPopupMenuRuleEnabled() {
        return this.D;
    }

    @Override // com.oplus.aiunit.vision.rne
    public int getType() {
        return 2;
    }

    @Override // com.coui.appcompat.material.navigation.NavigationBarView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B) {
            r();
        }
        s(getContext());
        this.u.setItemLayoutType(this.w);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        s(getContext().createConfigurationContext(configuration));
    }

    @Override // com.coui.appcompat.material.bottomnavigation.BottomNavigationView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_tool_navigation_item_height);
        if (mode == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        } else if (mode == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void r() {
        this.v = new FrameLayout(getContext());
        this.v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.v, 0);
        ViewCompat.setBackground(this.v, new ColorDrawable(ContextCompat.getColor(getContext(), R$color.coui_navigation_enlarge_default_bg)));
    }

    public final void s(Context context) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.coui_navigation_item_text_size);
        if (this.z != 0) {
            dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(this.z);
        } else if (this.w == 1) {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.coui_navigation_item_small_text_size);
        }
        this.u.setTextSize(dimensionPixelOffset);
    }

    public void setAnimationType(int i2) {
        if (i2 == 1) {
            this.o.start();
        } else if (i2 == 2) {
            this.p.start();
        }
    }

    public void setEnlargeIndex(int i2) {
        this.u.r(this.B, i2);
    }

    public void setItemLayoutType(int i2) {
        this.w = i2;
        s(getContext());
        this.u.setItemLayoutType(this.w);
    }

    @Deprecated
    public void setNeedTextAnim(boolean z) {
    }

    public void setOnAnimatorListener(l lVar) {
    }

    public void setOnAnimatorShowHideListener(m mVar) {
    }

    public void setOnConfigChangedListener(j jVar) {
    }

    public void setOnEnlargeSelectListener(k kVar) {
        setOnItemSelectedListener(new b());
    }

    public void setPopupMenuRuleEnabled(boolean z) {
        this.D = z;
    }

    @SuppressLint({"RestrictedApi"})
    public final void t() {
        ViewUtils.doOnApplyWindowInsets(this, new a());
    }

    public final void u() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.u, (Property<COUINavigationMenuView, Float>) View.ALPHA, 0.0f, 1.0f);
        this.o = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new ti2());
        this.o.setDuration(100L);
        this.o.addListener(new c());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.u, (Property<COUINavigationMenuView, Float>) View.ALPHA, 1.0f, 0.0f);
        this.p = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new vi2());
        this.p.setDuration(100L);
        this.p.addListener(new d(animatorSet));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new ti2());
        this.q.setDuration(350L);
        this.q.addUpdateListener(new e());
        animatorSet.playTogether(this.o, this.q);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setInterpolator(new nj2());
        this.s.setDuration(200L);
        this.s.addListener(new f());
        this.s.addUpdateListener(new g());
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.r = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setInterpolator(new ti2());
        this.r.setDuration(250L);
        this.r.addListener(new h());
        this.r.addUpdateListener(new i());
    }

    @SuppressLint({"RestrictedApi"})
    public void w(int i2, int i3, int i4) {
        if (i2 >= this.u.getVisibleItems().size()) {
            return;
        }
        x(i2, String.valueOf(i3), i4);
    }

    public void x(int i2, String str, int i3) {
        if (i2 >= this.u.getVisibleItems().size()) {
            return;
        }
        y((COUINavigationItemView) this.u.g(getCOUINavigationMenuView().p(i2).getItemId()), str, i3);
    }

    public final void y(COUINavigationItemView cOUINavigationItemView, String str, int i2) {
        if (cOUINavigationItemView != null) {
            if (i2 == 1) {
                cOUINavigationItemView.getCOUIHintRedDot().setVisibility(0);
                cOUINavigationItemView.getCOUIHintRedDot().setPointMode(1);
            } else {
                if (i2 != 2) {
                    cOUINavigationItemView.getCOUIHintRedDot().setVisibility(4);
                    return;
                }
                cOUINavigationItemView.getCOUIHintRedDot().setVisibility(0);
                if (v(str)) {
                    cOUINavigationItemView.getCOUIHintRedDot().setPointMode(2);
                    cOUINavigationItemView.getCOUIHintRedDot().setPointNumber(Integer.parseInt(str));
                } else {
                    cOUINavigationItemView.getCOUIHintRedDot().setPointMode(3);
                    cOUINavigationItemView.getCOUIHintRedDot().setPointText(str);
                }
            }
        }
    }

    public COUINavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.support.bottomnavigation.R$attr.couiNavigationViewStyle);
    }

    public COUINavigationView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, R$style.Widget_COUI_COUINavigationView);
    }

    @SuppressLint({"RestrictedApi"})
    public COUINavigationView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.x = 0;
        this.z = 0;
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = null;
        this.F = null;
        this.G = null;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.COUINavigationMenuView, i2, i3);
        this.u = (COUINavigationMenuView) getMenuView();
        int i4 = R$styleable.COUINavigationMenuView_couiNaviTextColor;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i4)) {
            setItemTextColor(tintTypedArrayObtainStyledAttributes.getColorStateList(i4));
        } else {
            setItemTextColor(getResources().getColorStateList(R$color.coui_bottom_tool_navigation_item_selector));
        }
        this.u.setIconTintList(tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.COUINavigationMenuView_couiNaviIconTint));
        this.t = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.COUINavigationMenuView_navigationType, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_navigation_item_text_size);
        int i5 = R$styleable.COUINavigationMenuView_couiNaviTextSize;
        int dimensionPixelSize2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(i5, dimensionPixelSize);
        this.z = tintTypedArrayObtainStyledAttributes.getResourceId(i5, 0);
        this.u.setTextSize((int) gg2.g(dimensionPixelSize2, getResources().getConfiguration().fontScale, 2));
        int integer = tintTypedArrayObtainStyledAttributes.getInteger(R$styleable.COUINavigationMenuView_couiNaviTipsType, -1);
        int integer2 = tintTypedArrayObtainStyledAttributes.getInteger(R$styleable.COUINavigationMenuView_couiNaviTipsNumber, 0);
        int i6 = R$styleable.COUINavigationMenuView_couiNaviMenu;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i6)) {
            f(tintTypedArrayObtainStyledAttributes.getResourceId(i6, 0));
            w(0, integer2, integer);
        }
        int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(R$styleable.COUINavigationMenuView_couiToolNavigationViewBg, 0);
        int resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(R$styleable.COUINavigationMenuView_couiTabNavigationViewBg, 0);
        this.A = tintTypedArrayObtainStyledAttributes.getResourceId(R$styleable.COUINavigationMenuView_couiEnlargeNavigationViewBg, 0);
        int i7 = this.t;
        if (i7 == 2) {
            this.B = true;
            setBackgroundColor(0);
            this.u.q();
        } else if (i7 == 0) {
            setBackgroundResource(resourceId);
        } else {
            setBackgroundResource(resourceId2);
        }
        this.u.setItemNavigationType(this.t);
        int i8 = R$styleable.COUINavigationMenuView_couiItemLayoutType;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i8)) {
            setItemLayoutType(tintTypedArrayObtainStyledAttributes.getInteger(i8, 0));
        }
        setLabelVisibilityMode(1);
        setClipChildren(false);
        setClipToPadding(false);
        g(context);
        setElevation(0.0f);
        tintTypedArrayObtainStyledAttributes.recycle();
        u();
        t();
        ph2.c(this, false);
    }
}

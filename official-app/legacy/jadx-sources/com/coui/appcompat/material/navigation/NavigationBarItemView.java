package com.coui.appcompat.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes13.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {
    public static final int[] K = {R.attr.state_checked};
    public static final d L;
    public static final d M;

    @Nullable
    public Drawable A;
    public ValueAnimator B;
    public d C;
    public float D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;

    @Nullable
    public BadgeDrawable J;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1827j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1828l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f1829n;
    public int o;
    public boolean p;

    @Nullable
    public final FrameLayout q;

    @Nullable
    public final View r;
    public final ImageView s;
    public final ViewGroup t;
    public final TextView u;
    public final TextView v;
    public int w;

    @Nullable
    public MenuItemImpl x;

    @Nullable
    public ColorStateList y;

    @Nullable
    public Drawable z;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (NavigationBarItemView.this.s.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.s(navigationBarItemView.s);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int i;

        public b(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            NavigationBarItemView.this.t(this.i);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float i;

        public c(float f) {
            this.i = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.i);
        }
    }

    public static class d {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        public float a(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
            return AnimationUtils.lerp(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f);
        }

        public float b(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
            return AnimationUtils.lerp(0.4f, 1.0f, f);
        }

        public float c(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
            return 1.0f;
        }

        public void d(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2, @NonNull View view) {
            view.setScaleX(b(f, f2));
            view.setScaleY(c(f, f2));
            view.setAlpha(a(f, f2));
        }
    }

    public static class e extends d {
        public e() {
            super(null);
        }

        @Override // com.coui.appcompat.material.navigation.NavigationBarItemView.d
        public float c(float f, float f2) {
            return b(f, f2);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        L = new d(aVar);
        M = new e(aVar);
    }

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        this.i = false;
        this.w = -1;
        this.C = L;
        this.D = 0.0f;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = false;
        this.I = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.q = (FrameLayout) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_container);
        this.r = findViewById(com.google.android.material.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view);
        this.s = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.google.android.material.R.id.navigation_bar_item_labels_group);
        this.t = viewGroup;
        TextView textView = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_small_label_view);
        this.u = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.material.R.id.navigation_bar_item_large_label_view);
        this.v = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f1827j = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.k = viewGroup.getPaddingBottom();
        ViewCompat.setImportantForAccessibility(textView, 2);
        ViewCompat.setImportantForAccessibility(textView2, 2);
        setFocusable(true);
        e(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.q;
        return frameLayout != null ? frameLayout : this.s;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        BadgeDrawable badgeDrawable = this.J;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.s.getMeasuredWidth() + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable = this.J;
        int minimumWidth = badgeDrawable == null ? 0 : badgeDrawable.getMinimumWidth() - this.J.getHorizontalOffset();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.s.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    public static void n(TextView textView, @StyleRes int i) {
        TextViewCompat.setTextAppearance(textView, i);
        int unscaledTextSize = MaterialResources.getUnscaledTextSize(textView.getContext(), i, 0);
        if (unscaledTextSize != 0) {
            textView.setTextSize(0, unscaledTextSize);
        }
    }

    public static void o(@NonNull View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    public static void p(@NonNull View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void v(@NonNull View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void e(float f, float f2) {
        this.f1828l = f - f2;
        this.m = (f2 * 1.0f) / f;
        this.f1829n = (f * 1.0f) / f2;
    }

    public void f() {
        l();
        this.x = null;
        this.D = 0.0f;
        this.i = false;
    }

    @Nullable
    public final FrameLayout g(View view) {
        ImageView imageView = this.s;
        if (view == imageView && BadgeUtils.USE_COMPAT_PARENT) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    @Nullable
    public Drawable getActiveIndicatorDrawable() {
        View view = this.r;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.J;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return com.google.android.material.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    @Nullable
    /* JADX INFO: renamed from: getItemData */
    public MenuItemImpl getMItemData() {
        return this.x;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return com.google.android.material.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.w;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.t.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.t.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.t.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.t.getMeasuredWidth() + layoutParams.rightMargin);
    }

    public final boolean h() {
        return this.J != null;
    }

    public final boolean i() {
        return this.H && this.o == 2;
    }

    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i) {
        this.x = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        TooltipCompat.setTooltipText(this, !TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        this.i = true;
    }

    public final void j(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (!this.E || !this.i || !ViewCompat.isAttachedToWindow(this)) {
            m(f, f);
            return;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.D, f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new c(f));
        this.B.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingStandard, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        this.B.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationLong1, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
        this.B.start();
    }

    public final void k() {
        MenuItemImpl menuItemImpl = this.x;
        if (menuItemImpl != null) {
            setChecked(menuItemImpl.isChecked());
        }
    }

    public void l() {
        r(this.s);
    }

    public final void m(@FloatRange(from = 0.0d, to = 1.0d) float f, float f2) {
        View view = this.r;
        if (view != null) {
            this.C.d(f, f2, view);
        }
        this.D = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.x;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.x.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.J;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.x.getTitle();
            if (!TextUtils.isEmpty(this.x.getContentDescription())) {
                title = this.x.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.J.getContentDescription()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(com.google.android.material.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new b(i));
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public final void q(@Nullable View view) {
        if (h() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.J, view, g(view));
        }
    }

    public final void r(@Nullable View view) {
        if (h()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.J, view);
            }
            this.J = null;
        }
    }

    public final void s(View view) {
        if (h()) {
            BadgeUtils.setBadgeDrawableBounds(this.J, view, g(view));
        }
    }

    public void setActiveIndicatorDrawable(@Nullable Drawable drawable) {
        View view = this.r;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.E = z;
        View view = this.r;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.G = i;
        t(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@Px int i) {
        this.I = i;
        t(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.H = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.F = i;
        t(getWidth());
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable) {
        if (this.J == badgeDrawable) {
            return;
        }
        if (h() && this.s != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            r(this.s);
        }
        this.J = badgeDrawable;
        ImageView imageView = this.s;
        if (imageView != null) {
            q(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.v;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.v;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.u;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.u;
        textView4.setPivotY(textView4.getBaseline());
        j(z ? 1.0f : 0.0f);
        int i = this.o;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    p(getIconOrContainer(), this.f1827j, 49);
                    v(this.t, this.k);
                    this.v.setVisibility(0);
                } else {
                    p(getIconOrContainer(), this.f1827j, 17);
                    v(this.t, 0);
                    this.v.setVisibility(4);
                }
                this.u.setVisibility(4);
            } else if (i == 1) {
                v(this.t, this.k);
                if (z) {
                    p(getIconOrContainer(), (int) (this.f1827j + this.f1828l), 49);
                    o(this.v, 1.0f, 1.0f, 0);
                    TextView textView5 = this.u;
                    float f = this.m;
                    o(textView5, f, f, 4);
                } else {
                    p(getIconOrContainer(), this.f1827j, 49);
                    TextView textView6 = this.v;
                    float f2 = this.f1829n;
                    o(textView6, f2, f2, 4);
                    o(this.u, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                p(getIconOrContainer(), this.f1827j, 17);
                this.v.setVisibility(8);
                this.u.setVisibility(8);
            }
        } else if (this.p) {
            if (z) {
                p(getIconOrContainer(), this.f1827j, 49);
                v(this.t, this.k);
                this.v.setVisibility(0);
            } else {
                p(getIconOrContainer(), this.f1827j, 17);
                v(this.t, 0);
                this.v.setVisibility(4);
            }
            this.u.setVisibility(4);
        } else {
            v(this.t, this.k);
            if (z) {
                p(getIconOrContainer(), (int) (this.f1827j + this.f1828l), 49);
                o(this.v, 1.0f, 1.0f, 0);
                TextView textView7 = this.u;
                float f3 = this.m;
                o(textView7, f3, f3, 4);
            } else {
                p(getIconOrContainer(), this.f1827j, 49);
                TextView textView8 = this.v;
                float f4 = this.f1829n;
                o(textView8, f4, f4, 4);
                o(this.u, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.u.setEnabled(z);
        this.v.setEnabled(z);
        this.s.setEnabled(z);
        if (z) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        } else {
            ViewCompat.setPointerIcon(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable == this.z) {
            return;
        }
        this.z = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            this.A = drawable;
            ColorStateList colorStateList = this.y;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }
        this.s.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.s.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.y = colorStateList;
        if (this.x == null || (drawable = this.A) == null) {
            return;
        }
        DrawableCompat.setTintList(drawable, colorStateList);
        this.A.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.k != i) {
            this.k = i;
            k();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f1827j != i) {
            this.f1827j = i;
            k();
        }
    }

    public void setItemPosition(int i) {
        this.w = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.o != i) {
            this.o = i;
            u();
            t(getWidth());
            k();
        }
    }

    public void setShifting(boolean z) {
        if (this.p != z) {
            this.p = z;
            k();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c2) {
    }

    public void setTextAppearanceActive(@StyleRes int i) {
        n(this.v, i);
        e(this.u.getTextSize(), this.v.getTextSize());
    }

    public void setTextAppearanceInactive(@StyleRes int i) {
        n(this.u, i);
        e(this.u.getTextSize(), this.v.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.u.setTextColor(colorStateList);
            this.v.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(@Nullable CharSequence charSequence) {
        this.u.setText(charSequence);
        this.v.setText(charSequence);
        MenuItemImpl menuItemImpl = this.x;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.x;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.x.getTooltipText();
        }
        TooltipCompat.setTooltipText(this, charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public final void t(int i) {
        if (this.r == null) {
            return;
        }
        int iMin = Math.min(this.F, i - (this.I * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        layoutParams.height = i() ? iMin : this.G;
        layoutParams.width = iMin;
        this.r.setLayoutParams(layoutParams);
    }

    public final void u() {
        if (i()) {
            this.C = M;
        } else {
            this.C = L;
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        ViewCompat.setBackground(this, drawable);
    }
}

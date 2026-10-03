package com.coui.appcompat.toolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.coui.appcompat.grid.COUIResponsiveUtils;
import com.coui.appcompat.poplist.b;
import com.oplus.aiunit.vision.fj2;
import com.oplus.aiunit.vision.gg2;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.nm2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.qne;
import com.oplus.aiunit.vision.rne;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$drawable;
import com.support.toolbar.R$attr;
import com.support.toolbar.R$dimen;
import com.support.toolbar.R$id;
import com.support.toolbar.R$style;
import com.support.toolbar.R$styleable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class COUIToolbar extends Toolbar implements rne {
    private static final int DEFAULT_TEXT_MAX = 24;
    private static final int DEFAULT_TEXT_MIN = 16;
    private static final String TAG = "Toolbar";
    public static final int TITLE_TYPE_HEAD = 0;
    public static final int TITLE_TYPE_SECONDARY = 1;
    private static final Rect TOOLBAR_OUTSETS = new Rect();
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private int mButtonGravity;
    private ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private final COUIRtlSpacingHelper mContentInsets;
    private Rect mDisplayFrame;
    private View mDummyView;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    private View mExpandedActionView;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private final int mGapBeforeMenuView;
    private int mGapBetweenNavigationAndTitle;
    private int mGapBetweenSearchViewAndMenu;
    private int mGravity;
    private boolean mHasCustomViewBeforeTitle;
    private boolean mHasSearchViewFlag;
    boolean mIsInsidePanel;
    private boolean mIsInsideSideNavigationBar;
    private boolean mIsTiny;
    private boolean mIsTitleCenterStyle;
    private ImageView mLogoView;
    private fj2 mMaskRippleDrawable;
    private int mMaxButtonHeight;
    private MenuBuilder.Callback mMenuBuilderCallback;
    private COUIActionMenuView mMenuView;
    private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private int mMinHeight;
    private ImageButton mNavButtonView;
    private Toolbar.OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private boolean mPopupRuleEnable;
    private int mPopupTheme;
    private int mResId;
    private final int[] mSearchCollapsingMargins;
    private int mSectionGap;
    private final int mSectionGapMediumLarge;
    private final int mSectionGapSmall;
    private View mSegmentButton;
    private final int mSegmentButtonHeight;
    private final int mSegmentButtonMaxWidth;
    private final int mSegmentButtonMinWidth;
    private final Runnable mShowOverflowMenuRunnable;
    private int mStyle;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private View mTextButton;
    private float mTextMaxSize;
    private float mTextMinSize;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private int mTitleMinWidth;
    private int mTitlePaddingBottom;
    private int mTitlePaddingTop;
    private int[] mTitlePosition;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private final int mTitleTextMinWidth;
    private float mTitleTextSize;
    private TextView mTitleTextView;
    private int mTitleType;
    private int mToolbarCenterTitlePaddingLeft;
    private int mToolbarCenterTitlePaddingRight;
    private int mToolbarHeight;
    private int mToolbarNormalPaddingLeft;
    private int mToolbarNormalPaddingRight;
    private int mToolbarOverFlowPadding;
    private boolean mUseResponsivePadding;
    private Rect mWindowFrame;
    private ToolbarWidgetWrapper mWrapper;

    public class ExpandedActionViewMenuPresenter implements MenuPresenter {
        MenuItemImpl mCurrentExpandedItem;
        MenuBuilder mMenu;

        private ExpandedActionViewMenuPresenter() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            if (COUIToolbar.this.mExpandedActionView instanceof CollapsibleActionView) {
                ((CollapsibleActionView) COUIToolbar.this.mExpandedActionView).onActionViewCollapsed();
            }
            COUIToolbar cOUIToolbar = COUIToolbar.this;
            cOUIToolbar.removeView(cOUIToolbar.mExpandedActionView);
            COUIToolbar cOUIToolbar2 = COUIToolbar.this;
            cOUIToolbar2.removeView(cOUIToolbar2.mCollapseButtonView);
            COUIToolbar.this.mExpandedActionView = null;
            COUIToolbar.this.setChildVisibilityForExpandedActionView(false);
            this.mCurrentExpandedItem = null;
            COUIToolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            COUIToolbar.this.ensureCollapseButtonView();
            ViewParent parent = COUIToolbar.this.mCollapseButtonView.getParent();
            COUIToolbar cOUIToolbar = COUIToolbar.this;
            if (parent != cOUIToolbar) {
                cOUIToolbar.addView(cOUIToolbar.mCollapseButtonView);
            }
            COUIToolbar.this.mExpandedActionView = menuItemImpl.getActionView();
            this.mCurrentExpandedItem = menuItemImpl;
            ViewParent parent2 = COUIToolbar.this.mExpandedActionView.getParent();
            COUIToolbar cOUIToolbar2 = COUIToolbar.this;
            if (parent2 != cOUIToolbar2) {
                LayoutParams layoutParamsGenerateDefaultLayoutParams = cOUIToolbar2.generateDefaultLayoutParams();
                layoutParamsGenerateDefaultLayoutParams.gravity = (COUIToolbar.this.mButtonGravity & 112) | GravityCompat.START;
                layoutParamsGenerateDefaultLayoutParams.mViewType = 2;
                COUIToolbar.this.mExpandedActionView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                COUIToolbar cOUIToolbar3 = COUIToolbar.this;
                cOUIToolbar3.addView(cOUIToolbar3.mExpandedActionView);
            }
            COUIToolbar.this.setChildVisibilityForExpandedActionView(true);
            COUIToolbar.this.requestLayout();
            menuItemImpl.setActionViewExpanded(true);
            if (COUIToolbar.this.mExpandedActionView instanceof CollapsibleActionView) {
                ((CollapsibleActionView) COUIToolbar.this.mExpandedActionView).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        /* JADX INFO: renamed from: getId */
        public int getMId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public MenuView getMenuView(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void initForMenu(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.mMenu;
            if (menuBuilder2 != null && (menuItemImpl = this.mCurrentExpandedItem) != null) {
                menuBuilder2.collapseItemActionView(menuItemImpl);
            }
            this.mMenu = menuBuilder;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
            return subMenuBuilder != null && subMenuBuilder.size() > 0;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void setCallback(MenuPresenter.Callback callback) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void updateMenuView(boolean z) {
            if (this.mCurrentExpandedItem != null) {
                MenuBuilder menuBuilder = this.mMenu;
                boolean z2 = false;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mMenu.getItem(i) == this.mCurrentExpandedItem) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                collapseItemActionView(this.mMenu, this.mCurrentExpandedItem);
            }
        }
    }

    public COUIToolbar(Context context) {
        this(context, null);
    }

    private void addCustomCenterViews(List<View> list) {
        int childCount = getChildCount();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(1, ViewCompat.getLayoutDirection(this));
        list.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mViewType == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams.gravity) == absoluteGravity) {
                list.add(childAt);
            }
        }
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
        boolean z = ViewCompat.getLayoutDirection(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mViewType == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams.gravity) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.mViewType == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(layoutParams2.gravity) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view) {
        LayoutParams layoutParamsGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        }
        layoutParamsGenerateLayoutParams.mViewType = 1;
        addView(view, layoutParamsGenerateLayoutParams);
    }

    private void calculateTitlePosition(int[] iArr) {
        int measuredWidth;
        int measuredWidth2;
        boolean z = ViewCompat.getLayoutDirection(this) == 1;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_actionbar_menuitemview_item_spacing);
        iArr[0] = Math.max(this.mContentInsets.getLeft(), getPaddingLeft());
        iArr[1] = getMeasuredWidth() - Math.max(this.mContentInsets.getRight(), getPaddingRight());
        if (!shouldLayout(this.mMenuView) || this.mMenuView.getChildCount() == 0) {
            return;
        }
        if (this.mMenuView.getChildCount() == 1) {
            measuredWidth2 = this.mMenuView.getChildAt(0).getMeasuredWidth() + dimensionPixelSize + 0;
            measuredWidth = 0;
        } else {
            measuredWidth = this.mMenuView.getChildAt(0).getMeasuredWidth() + dimensionPixelSize + 0;
            measuredWidth2 = 0;
            for (int i = 1; i < this.mMenuView.getChildCount(); i++) {
                measuredWidth2 += this.mMenuView.getChildAt(i).getMeasuredWidth() + dimensionPixelSize;
            }
        }
        if (z) {
            iArr[0] = iArr[0] + measuredWidth2;
            iArr[1] = iArr[1] - measuredWidth;
        } else {
            iArr[0] = iArr[0] + measuredWidth;
            iArr[1] = iArr[1] - measuredWidth2;
        }
        int iMax = Math.max(iArr[0], getMeasuredWidth() - iArr[1]) + getResources().getDimensionPixelSize(R$dimen.coui_toolbar_action_menu_inner_padding);
        if (this.mIsInsidePanel || gg2.h(this.mTitleTextView, getMeasuredWidth(), iMax * 2) > 1) {
            return;
        }
        iArr[0] = iMax;
        iArr[1] = getMeasuredWidth() - iMax;
    }

    private void calculateToolbarPadding(MenuBuilder menuBuilder, int i, boolean z) {
        boolean z2 = true;
        boolean z3 = this.mHasCustomViewBeforeTitle || shouldLayout(this.mNavButtonView);
        if ((menuBuilder == null || (menuBuilder.getNonActionItems().isEmpty() && menuBuilder.getActionItems().isEmpty())) && !z) {
            z2 = false;
        }
        if (COUIResponsiveUtils.isSmallScreen(getContext(), View.MeasureSpec.getSize(i))) {
            this.mToolbarNormalPaddingLeft = getContext().getResources().getDimensionPixelOffset(z3 ? R$dimen.toolbar_normal_menu_padding_left_compat : R$dimen.toolbar_normal_padding_left_compat);
            this.mToolbarNormalPaddingRight = z2 ? getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_menu_padding_right_compat) : getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_padding_right_compat);
            this.mToolbarCenterTitlePaddingLeft = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_center_menu_padding_horizontal_compat);
        } else if (COUIResponsiveUtils.isMediumScreen(getContext(), View.MeasureSpec.getSize(i), ifk.j(getContext()))) {
            this.mToolbarNormalPaddingLeft = getContext().getResources().getDimensionPixelOffset(z3 ? R$dimen.toolbar_normal_menu_padding_left_medium : R$dimen.toolbar_normal_padding_left_medium);
            this.mToolbarNormalPaddingRight = z2 ? getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_menu_padding_right_medium) : getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_padding_right_medium);
            this.mToolbarCenterTitlePaddingLeft = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_center_menu_padding_horizontal_medium);
        } else if (COUIResponsiveUtils.isLargeScreen(getContext(), View.MeasureSpec.getSize(i), ifk.j(getContext()))) {
            this.mToolbarNormalPaddingLeft = getContext().getResources().getDimensionPixelOffset(z3 ? R$dimen.toolbar_normal_menu_padding_left_expanded : R$dimen.toolbar_normal_padding_left_expanded);
            this.mToolbarNormalPaddingRight = z2 ? getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_menu_padding_right_expanded) : getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_padding_right_expanded);
            this.mToolbarCenterTitlePaddingLeft = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_center_menu_padding_horizontal_expanded);
        }
        if (this.mIsInsideSideNavigationBar) {
            this.mToolbarCenterTitlePaddingLeft = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_center_menu_padding_horizontal_medium);
        }
        this.mToolbarCenterTitlePaddingRight = this.mToolbarCenterTitlePaddingLeft;
        if (this.mIsTiny) {
            this.mToolbarNormalPaddingLeft = z3 ? 0 : getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_menu_padding_tiny_left);
            this.mToolbarNormalPaddingRight = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_menu_padding_tiny_right);
        }
    }

    private void changeBackViewParams() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton == null || !this.mIsTiny) {
            return;
        }
        LayoutParams layoutParams = (LayoutParams) imageButton.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_toolbar_back_view_tiny_width);
        this.mNavButtonView.setLayoutParams(layoutParams);
        this.mNavButtonView.setPadding(0, 0, 0, 0);
    }

    private void changeToolbarPadding(MenuBuilder menuBuilder, ImageButton imageButton, boolean z, int i, boolean z2) {
        if (menuBuilder == null && imageButton == null && !z2) {
            return;
        }
        calculateToolbarPadding(menuBuilder, i, z2);
        if ((menuBuilder == null || (menuBuilder.getNonActionItems().isEmpty() && menuBuilder.getActionItems().isEmpty())) && !z2) {
            if (this.mUseResponsivePadding) {
                int i2 = this.mIsTitleCenterStyle ? this.mToolbarCenterTitlePaddingLeft : this.mToolbarNormalPaddingLeft;
                int i3 = useTextMenuItemPaddingEnd() ? this.mToolbarCenterTitlePaddingRight : this.mToolbarNormalPaddingRight;
                if (z) {
                    setPadding(i3, getPaddingTop(), i2, getPaddingBottom());
                    return;
                } else {
                    setPadding(i2, getPaddingTop(), i3, getPaddingBottom());
                    return;
                }
            }
            return;
        }
        if (this.mUseResponsivePadding) {
            boolean z3 = this.mIsTitleCenterStyle;
            int i4 = z3 ? this.mToolbarCenterTitlePaddingLeft : this.mToolbarNormalPaddingLeft;
            int i5 = z3 ? this.mToolbarCenterTitlePaddingRight : this.mToolbarNormalPaddingRight;
            if (z) {
                setPadding(i5, getPaddingTop(), i4, getPaddingBottom());
            } else {
                setPadding(i4, getPaddingTop(), i5, getPaddingBottom());
            }
        }
    }

    private void configNavigationButtonBackground() {
        fj2 fj2Var = new fj2(getContext());
        this.mMaskRippleDrawable = fj2Var;
        fj2Var.u(fj2.t(getContext(), 0));
        this.mNavButtonView.setBackground(this.mMaskRippleDrawable);
        ph2.c(this.mNavButtonView, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            ImageButton imageButton = new ImageButton(getContext(), null, R$attr.couiToolbarNavigationButtonStyle, R$style.Widget_COUI_Toolbar_Button_Navigation);
            this.mCollapseButtonView = imageButton;
            imageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | GravityCompat.START;
            layoutParamsGenerateDefaultLayoutParams.mViewType = 2;
            this.mCollapseButtonView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new View.OnClickListener() { // from class: com.coui.appcompat.toolbar.COUIToolbar.3
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    COUIToolbar.this.collapseActionView();
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new ImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.peekMenu() == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            COUIActionMenuView cOUIActionMenuView = new COUIActionMenuView(getContext());
            this.mMenuView = cOUIActionMenuView;
            cOUIActionMenuView.setId(R$id.coui_toolbar_more_view);
            this.mMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            if (this.mIsTitleCenterStyle) {
                ((ViewGroup.MarginLayoutParams) layoutParamsGenerateDefaultLayoutParams).width = -1;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParamsGenerateDefaultLayoutParams).width = -2;
            }
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | GravityCompat.END;
            this.mMenuView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            addSystemView(this.mMenuView);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            ImageButton imageButton = new ImageButton(getContext(), null, R$attr.couiToolbarNavigationButtonStyle, R$style.Widget_COUI_Toolbar_Button_Navigation);
            this.mNavButtonView = imageButton;
            imageButton.setId(R$id.coui_toolbar_back_view);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | GravityCompat.START;
            this.mNavButtonView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            configNavigationButtonBackground();
            changeBackViewParams();
        }
    }

    private void ensureTitleTextView() {
        if (this.mTitleTextView == null) {
            Context context = getContext();
            TextView textView = new TextView(context);
            this.mTitleTextView = textView;
            textView.setPaddingRelative(0, this.mTitlePaddingTop, 0, this.mTitlePaddingBottom);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.mTypeTitle = true;
            ((ViewGroup.MarginLayoutParams) layoutParamsGenerateDefaultLayoutParams).bottomMargin = this.mIsTiny ? 0 : this.mTitleMarginBottom;
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.mButtonGravity & 112) | GravityCompat.END;
            this.mTitleTextView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.mTitleTextView.setSingleLine();
            this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
            int i = this.mTitleTextAppearance;
            if (i != 0) {
                setTitleTextAppearance(context, i);
            }
            int i2 = this.mTitleTextColor;
            if (i2 != 0) {
                this.mTitleTextView.setTextColor(i2);
            }
            this.mTitleTextView.setTextAlignment(this.mIsTitleCenterStyle ? 4 : 5);
            if (this.mTitleType == 1) {
                this.mTitleTextView.setTextSize(0, gg2.g(this.mTitleTextView.getTextSize(), getContext().getResources().getConfiguration().fontScale, 2));
            }
        }
    }

    private int getChildHorizontalGravity(int i) {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(layoutParams.gravity);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i2;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    private int getChildVerticalGravity(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & 112;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
    }

    private int getMinimumHeightCompat() {
        return ViewCompat.getMinimumHeight(this);
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    private boolean isDummyView(View view, LayoutParams layoutParams) {
        if (view == null || view.getClass() != View.class) {
            return false;
        }
        this.mDummyView = view;
        return true;
    }

    private int layoutChildLeft(View view, int i, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = i + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int childTop = getChildTop(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, childTop, Math.min(i2, iMax + measuredWidth), view.getMeasuredHeight() + childTop);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int layoutChildRight(View view, int i, int i2, int[] iArr, int i3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int childTop = getChildTop(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(Math.max(i, iMax - measuredWidth), childTop, iMax, view.getMeasuredHeight() + childTop);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return measureChildCollapseMargins(view, i, i2, Integer.MAX_VALUE, i3, i4, iArr);
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void measureChildMaxWidthConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
        if (i3 <= 0 || view.getMeasuredWidth() <= i3) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), childMeasureSpec2);
    }

    private void refreshWidthLimits(int i) {
        if (COUIResponsiveUtils.isSmallScreen(getContext(), i)) {
            this.mSectionGap = this.mSectionGapSmall;
        } else {
            this.mSectionGap = this.mSectionGapMediumLarge;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildVisibilityForExpandedActionView(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((LayoutParams) childAt.getLayoutParams()).mViewType != 2 && childAt != this.mMenuView) {
                childAt.setVisibility(z ? 8 : 0);
            }
        }
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void updateChildVisibilityForExpandedActionView(View view) {
        if (((LayoutParams) view.getLayoutParams()).mViewType == 2 || view == this.mMenuView) {
            return;
        }
        view.setVisibility(this.mExpandedActionView != null ? 8 : 0);
    }

    private boolean useTextMenuItemPaddingEnd() {
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        return this.mIsTitleCenterStyle || ((cOUIActionMenuView == null || cOUIActionMenuView.getChildCount() != 1 || !(this.mMenuView.getChildAt(0) instanceof COUIActionMenuItemView)) ? false : ((COUIActionMenuItemView) this.mMenuView.getChildAt(0)).isTextMenuItem());
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void clearMenu() {
        this.mResId = 0;
        getMenu().clear();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void collapseActionView() {
        ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.mExpandedMenuPresenter;
        MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.mCurrentExpandedItem;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void dismissPopupMenus() {
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        if (cOUIActionMenuView != null) {
            cOUIActionMenuView.dismissPopupMenus();
        }
    }

    @Override // com.oplus.aiunit.vision.rne
    public int getBarrierDirection() {
        if (this.mWindowFrame == null) {
            this.mWindowFrame = new Rect();
        }
        getRootView().getGlobalVisibleRect(this.mWindowFrame);
        return this.mWindowFrame.height() <= getContext().getResources().getDimensionPixelSize(com.support.poplist.R$dimen.coui_popup_list_window_min_window_height_to_apply_vertical_barrier) ? -1 : 1;
    }

    public TextView getCOUITitleTextView() {
        ensureTitleTextView();
        return this.mTitleTextView;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public int getContentInsetEnd() {
        return this.mContentInsets.getEnd();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public int getContentInsetLeft() {
        return this.mContentInsets.getLeft();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public int getContentInsetRight() {
        return this.mContentInsets.getRight();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public int getContentInsetStart() {
        return this.mContentInsets.getStart();
    }

    @Override // com.oplus.aiunit.vision.rne
    @NonNull
    public Rect getDisplayFrame() {
        if (this.mDisplayFrame == null) {
            this.mDisplayFrame = new Rect();
        }
        getGlobalVisibleRect(this.mDisplayFrame);
        return this.mDisplayFrame;
    }

    public boolean getIsTitleCenterStyle() {
        return this.mIsTitleCenterStyle;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public COUIActionMenuView getMenuView() {
        ensureMenuView();
        return this.mMenuView;
    }

    @Override // androidx.appcompat.widget.Toolbar
    @Nullable
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    @Nullable
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.rne
    @NonNull
    public Rect getOutsets() {
        return TOOLBAR_OUTSETS;
    }

    public View getOverFlowMenuButton() {
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        if (cOUIActionMenuView != null) {
            return cOUIActionMenuView.getOverFlowMenuButton();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    @Nullable
    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    @Override // com.oplus.aiunit.vision.rne
    public boolean getPopupMenuRuleEnabled() {
        return this.mPopupRuleEnable;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public View getTitleView() {
        return this.mTitleTextView;
    }

    @Override // com.oplus.aiunit.vision.rne
    public int getType() {
        return 2;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i) {
        super.inflateMenu(i);
        this.mResId = i;
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        if (cOUIActionMenuView instanceof COUIActionMenuView) {
            cOUIActionMenuView.clearRedDotInfo();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:107:0x0300  */
    /* JADX WARN: Code duplicated, block: B:110:0x031e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0320  */
    /* JADX WARN: Code duplicated, block: B:116:0x033f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0355 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0357  */
    /* JADX WARN: Code duplicated, block: B:121:0x035c  */
    /* JADX WARN: Code duplicated, block: B:123:0x036f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0383  */
    /* JADX WARN: Code duplicated, block: B:130:0x0387  */
    /* JADX WARN: Code duplicated, block: B:132:0x039a  */
    /* JADX WARN: Code duplicated, block: B:139:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:141:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:144:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:154:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:158:0x0426  */
    /* JADX WARN: Code duplicated, block: B:159:0x043d  */
    /* JADX WARN: Code duplicated, block: B:15:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x0440  */
    /* JADX WARN: Code duplicated, block: B:163:0x0457 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x0460 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x0462  */
    /* JADX WARN: Code duplicated, block: B:168:0x0465  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0469  */
    /* JADX WARN: Code duplicated, block: B:171:0x046c  */
    /* JADX WARN: Code duplicated, block: B:174:0x047c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:17:0x007f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0499  */
    /* JADX WARN: Code duplicated, block: B:185:0x049d  */
    /* JADX WARN: Code duplicated, block: B:187:0x04af  */
    /* JADX WARN: Code duplicated, block: B:188:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:190:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:192:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:193:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:196:0x04ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:197:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:198:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:200:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:201:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:204:0x0525  */
    /* JADX WARN: Code duplicated, block: B:206:0x0545 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x0547  */
    /* JADX WARN: Code duplicated, block: B:208:0x0552  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x056a  */
    /* JADX WARN: Code duplicated, block: B:213:0x058d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x058f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0598  */
    /* JADX WARN: Code duplicated, block: B:218:0x05ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x05b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:220:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:221:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:224:0x05be  */
    /* JADX WARN: Code duplicated, block: B:228:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:231:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:232:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:235:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:236:0x060f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0614  */
    /* JADX WARN: Code duplicated, block: B:239:0x0638  */
    /* JADX WARN: Code duplicated, block: B:241:0x063b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0643  */
    /* JADX WARN: Code duplicated, block: B:245:0x0647  */
    /* JADX WARN: Code duplicated, block: B:246:0x064a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0653  */
    /* JADX WARN: Code duplicated, block: B:253:0x065e  */
    /* JADX WARN: Code duplicated, block: B:256:0x0665  */
    /* JADX WARN: Code duplicated, block: B:257:0x066c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:260:0x0677  */
    /* JADX WARN: Code duplicated, block: B:261:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:263:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:264:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:266:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:267:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:270:0x06d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:271:0x06da  */
    /* JADX WARN: Code duplicated, block: B:272:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:284:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:290:0x0380 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x03ab A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x02e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fd A[PHI: r12
  0x00fd: PHI (r12v5 int) = (r12v4 int), (r12v40 int), (r12v41 int) binds: [B:24:0x00cd, B:27:0x00e0, B:28:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x015b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0168  */
    /* JADX WARN: Code duplicated, block: B:54:0x017d  */
    /* JADX WARN: Code duplicated, block: B:55:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0181  */
    /* JADX WARN: Code duplicated, block: B:59:0x018d  */
    /* JADX WARN: Code duplicated, block: B:61:0x019b  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x020c  */
    /* JADX WARN: Code duplicated, block: B:73:0x021b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0231 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0233  */
    /* JADX WARN: Code duplicated, block: B:78:0x0241  */
    /* JADX WARN: Code duplicated, block: B:81:0x025e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0262  */
    /* JADX WARN: Code duplicated, block: B:85:0x027f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0281  */
    /* JADX WARN: Code duplicated, block: B:87:0x0283  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:94:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d7  */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int[] iArr;
        int iLayoutChildRight;
        boolean zIsSmallScreen;
        int i5;
        int iLayoutChildLeft;
        int i6;
        int iLayoutChildLeft2;
        int[] iArr2;
        int iMax;
        int iMin;
        int size;
        int iLayoutChildLeft3;
        int i7;
        LayoutParams layoutParams;
        int i8;
        int size2;
        int iLayoutChildRight2;
        int i9;
        LayoutParams layoutParams2;
        int i10;
        LayoutParams layoutParams3;
        int i11;
        boolean zShouldLayout;
        boolean zShouldLayout2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        LayoutParams layoutParams4;
        LayoutParams layoutParams5;
        boolean z2;
        int i12;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16;
        int iMax2;
        int i17;
        int i18;
        int i19;
        int iMax3;
        int i20;
        int i21;
        int i22;
        int i23;
        int iMin2;
        int i24;
        int i25;
        int i26;
        int measuredWidth;
        int measuredWidth2;
        int iMax4;
        int width;
        int i27;
        int measuredWidth3;
        int width2;
        int i28;
        int measuredWidth4;
        int width3;
        int i29;
        int iMax5;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int size3;
        int iLayoutChildLeft4;
        int i38;
        ViewGroup.LayoutParams layoutParams6;
        int i39;
        ViewGroup.LayoutParams layoutParams7;
        int i40;
        ViewGroup.LayoutParams layoutParams8;
        int[] iArr3;
        int i41;
        int i42;
        int size4;
        int iLayoutChildLeft5;
        int i43;
        ViewGroup.LayoutParams layoutParams9;
        int i44;
        int iLayoutChildRight3;
        boolean z3 = ViewCompat.getLayoutDirection(this) == 1;
        int width4 = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i45 = width4 - paddingRight;
        int[] iArr4 = this.mTempMargins;
        iArr4[0] = 0;
        iArr4[1] = 0;
        int minimumHeightCompat = getMinimumHeightCompat();
        if (shouldLayout(this.mNavButtonView)) {
            if (z3) {
                iArr = iArr4;
                iLayoutChildRight = layoutChildRight(this.mNavButtonView, paddingLeft, i45, iArr4, minimumHeightCompat);
            } else {
                iArr = iArr4;
                paddingLeft = layoutChildLeft(this.mNavButtonView, paddingLeft, i45, iArr, minimumHeightCompat);
            }
            if (shouldLayout(this.mCollapseButtonView)) {
                if (z3) {
                    iLayoutChildRight = layoutChildRight(this.mCollapseButtonView, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
                } else {
                    paddingLeft = layoutChildLeft(this.mCollapseButtonView, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
                }
            }
            if (shouldLayout(this.mTextButton)) {
                if (z3) {
                    paddingLeft = layoutChildLeft(this.mTextButton, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
                } else {
                    iLayoutChildRight = layoutChildRight(this.mTextButton, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
                }
            }
            zIsSmallScreen = COUIResponsiveUtils.isSmallScreen(getContext(), getMeasuredWidth());
            if (!shouldLayout(this.mMenuView)) {
                i5 = paddingLeft;
                iLayoutChildLeft = iLayoutChildRight;
            } else if (z3) {
                paddingLeft = layoutChildLeft(this.mMenuView, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
                if (!zIsSmallScreen) {
                    paddingLeft += this.mGapBeforeMenuView;
                }
                i5 = paddingLeft;
                iLayoutChildLeft = iLayoutChildRight;
            } else {
                iLayoutChildRight3 = layoutChildRight(this.mMenuView, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
                if (!zIsSmallScreen) {
                    iLayoutChildRight3 -= this.mGapBeforeMenuView;
                }
                i5 = paddingLeft;
                iLayoutChildLeft = iLayoutChildRight3;
            }
            if (shouldLayout(this.mSegmentButton) && !this.mIsTitleCenterStyle) {
                int measuredWidth5 = this.mSegmentButton.getMeasuredWidth();
                int i46 = (width4 / 2) - (measuredWidth5 / 2);
                int i47 = measuredWidth5 + i46;
                if (i46 < i5) {
                    i44 = i5;
                } else {
                    if (i47 > iLayoutChildLeft) {
                        i46 -= i47 - iLayoutChildLeft;
                    }
                    i44 = i46;
                }
                LayoutParams layoutParams10 = (LayoutParams) this.mSegmentButton.getLayoutParams();
                if (z3) {
                    int i48 = iLayoutChildLeft;
                    iLayoutChildLeft2 = layoutChildLeft(this.mSegmentButton, i44, iLayoutChildLeft, iArr, minimumHeightCompat);
                    i6 = i48;
                } else {
                    iLayoutChildLeft = layoutChildLeft(this.mSegmentButton, i44, iLayoutChildLeft, iArr, minimumHeightCompat) - (this.mSegmentButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams10).rightMargin);
                }
                if (shouldLayout(this.mTitleTextView)) {
                    addCustomViewsWithGravity(this.mTempViews, 1);
                    iArr3 = iArr;
                    int viewListMeasuredWidth = getViewListMeasuredWidth(this.mTempViews, iArr3);
                    i41 = (width4 / 2) - (viewListMeasuredWidth / 2);
                    i42 = viewListMeasuredWidth + i41;
                    if (i41 < iLayoutChildLeft2) {
                        i41 = iLayoutChildLeft2;
                    } else if (i42 > i6) {
                        i41 -= i42 - i6;
                    }
                    size4 = this.mTempViews.size();
                    iLayoutChildLeft5 = i41;
                    i43 = 0;
                    while (i43 < size4) {
                        layoutParams9 = this.mTempViews.get(i43).getLayoutParams();
                        if (layoutParams9 != null || !(layoutParams9 instanceof LayoutParams) || !((LayoutParams) layoutParams9).mTypeSegmentButton) {
                            iLayoutChildLeft5 = layoutChildLeft(this.mTempViews.get(i43), iLayoutChildLeft5, i6, iArr3, minimumHeightCompat);
                        }
                        i43++;
                        iArr3 = iArr3;
                        size4 = size4;
                        i6 = i6;
                    }
                    iArr = iArr3;
                }
                int i49 = i6;
                iArr2 = iArr;
                iArr2[0] = Math.max(0, getContentInsetLeft() - iLayoutChildLeft2);
                iArr2[1] = Math.max(0, getContentInsetRight() - (i45 - i49));
                iMax = Math.max(iLayoutChildLeft2, getContentInsetLeft());
                iMin = Math.min(i49, width4 - getContentInsetRight());
                if (shouldLayout(this.mExpandedActionView)) {
                    if (z3) {
                        iMin = layoutChildRight(this.mExpandedActionView, iMax, iMin, iArr2, minimumHeightCompat);
                    } else {
                        iMax = layoutChildLeft(this.mExpandedActionView, iMax, iMin, iArr2, minimumHeightCompat);
                    }
                }
                if (shouldLayout(this.mLogoView)) {
                    if (z3) {
                        iMin = layoutChildRight(this.mLogoView, iMax, iMin, iArr2, minimumHeightCompat);
                    } else {
                        iMax = layoutChildLeft(this.mLogoView, iMax, iMin, iArr2, minimumHeightCompat);
                    }
                }
                addCustomViewsWithGravity(this.mTempViews, 3);
                size = this.mTempViews.size();
                if (this.mHasSearchViewFlag) {
                    iLayoutChildLeft3 = iMax;
                    i40 = 0;
                    while (i40 < size) {
                        layoutParams8 = this.mTempViews.get(i40).getLayoutParams();
                        if (!isDummyView(this.mTempViews.get(i40), (LayoutParams) layoutParams8)) {
                            if (layoutParams8 == null && (layoutParams8 instanceof LayoutParams) && ((LayoutParams) layoutParams8).mTypeSearch) {
                                iLayoutChildLeft3 = layoutChildLeft(this.mTempViews.get(i40), 0, width4, this.mSearchCollapsingMargins, 0);
                            } else {
                                iLayoutChildLeft3 = layoutChildLeft(this.mTempViews.get(i40), iLayoutChildLeft3, iMin, iArr2, minimumHeightCompat);
                            }
                        }
                        i40++;
                        size = size;
                    }
                } else {
                    iLayoutChildLeft3 = iMax;
                    for (i7 = 0; i7 < size; i7++) {
                        View view = this.mTempViews.get(i7);
                        layoutParams = (LayoutParams) view.getLayoutParams();
                        if (layoutParams.mTypeTextButton && !isDummyView(view, layoutParams)) {
                            iLayoutChildLeft3 = layoutChildLeft(view, iLayoutChildLeft3, iMin, iArr2, minimumHeightCompat);
                        }
                    }
                }
                i8 = iLayoutChildLeft3;
                addCustomViewsWithGravity(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                if (this.mHasSearchViewFlag) {
                    iLayoutChildRight2 = iMin;
                    for (i39 = 0; i39 < size2; i39++) {
                        layoutParams7 = this.mTempViews.get(i39).getLayoutParams();
                        if (!isDummyView(this.mTempViews.get(i39), (LayoutParams) layoutParams7)) {
                            if (layoutParams7 == null && (layoutParams7 instanceof LayoutParams) && ((LayoutParams) layoutParams7).mTypeSearch) {
                                iLayoutChildRight2 = layoutChildRight(this.mTempViews.get(i39), 0, width4, this.mSearchCollapsingMargins, 0);
                            } else {
                                iLayoutChildRight2 = layoutChildRight(this.mTempViews.get(i39), i8, iLayoutChildRight2, iArr2, minimumHeightCompat);
                            }
                        }
                    }
                } else if (z3) {
                    iLayoutChildRight2 = iMin;
                    for (i10 = size2 - 1; i10 >= 0; i10--) {
                        View view2 = this.mTempViews.get(i10);
                        layoutParams3 = (LayoutParams) view2.getLayoutParams();
                        if (layoutParams3.mTypeTextButton && !isDummyView(view2, layoutParams3)) {
                            iLayoutChildRight2 = layoutChildRight(view2, i8, iLayoutChildRight2, iArr2, minimumHeightCompat);
                        }
                    }
                } else {
                    iLayoutChildRight2 = iMin;
                    for (i9 = 0; i9 < size2; i9++) {
                        View view3 = this.mTempViews.get(i9);
                        layoutParams2 = (LayoutParams) view3.getLayoutParams();
                        if (layoutParams2.mTypeTextButton && !isDummyView(view3, layoutParams2)) {
                            iLayoutChildRight2 = layoutChildRight(view3, i8, iLayoutChildRight2, iArr2, minimumHeightCompat);
                        }
                    }
                }
                i11 = iLayoutChildRight2;
                if (!shouldLayout(this.mTitleTextView)) {
                    addCustomViewsWithGravity(this.mTempViews, 1);
                    int viewListMeasuredWidth2 = getViewListMeasuredWidth(this.mTempViews, iArr2);
                    i35 = (width4 / 2) - (viewListMeasuredWidth2 / 2);
                    i36 = viewListMeasuredWidth2 + i35;
                    i37 = this.mSectionGap;
                    if (i35 < i8 + i37) {
                        i35 = i8 + i37;
                    } else if (i36 > i11 - i37) {
                        i35 -= i36 - (i11 - i37);
                    }
                    size3 = this.mTempViews.size();
                    iLayoutChildLeft4 = i35;
                    for (i38 = 0; i38 < size3; i38++) {
                        layoutParams6 = this.mTempViews.get(i38).getLayoutParams();
                        if (layoutParams6 != null || !(layoutParams6 instanceof LayoutParams) || !((LayoutParams) layoutParams6).mTypeSegmentButton) {
                            iLayoutChildLeft4 = layoutChildLeft(this.mTempViews.get(i38), iLayoutChildLeft4, i11, iArr2, minimumHeightCompat);
                        }
                    }
                }
                this.mTempViews.clear();
                zShouldLayout = shouldLayout(this.mTitleTextView);
                zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
                if (zShouldLayout) {
                    LayoutParams layoutParams11 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams11).topMargin + this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin + 0;
                } else {
                    measuredHeight = 0;
                }
                if (zShouldLayout2) {
                    LayoutParams layoutParams12 = (LayoutParams) this.mSubtitleTextView.getLayoutParams();
                    measuredHeight += ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin + this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin;
                }
                if (!zShouldLayout || zShouldLayout2) {
                    if (zShouldLayout) {
                        textView = this.mTitleTextView;
                    } else {
                        textView = this.mSubtitleTextView;
                    }
                    if (zShouldLayout2) {
                        textView2 = this.mSubtitleTextView;
                    } else {
                        textView2 = this.mTitleTextView;
                    }
                    layoutParams4 = (LayoutParams) textView.getLayoutParams();
                    layoutParams5 = (LayoutParams) textView2.getLayoutParams();
                    z2 = (!zShouldLayout && this.mTitleTextView.getMeasuredWidth() > 0) || (zShouldLayout2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                    i12 = this.mGravity & 112;
                    if (i12 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + this.mTitleMarginTop;
                    } else if (i12 != 80) {
                        iMax5 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                        i30 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                        i31 = this.mTitleMarginTop;
                        if (iMax5 < i30 + i31) {
                            iMax5 = i30 + i31;
                        } else {
                            i32 = (((height - paddingBottom) - measuredHeight) - iMax5) - paddingTop2;
                            i33 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                            i34 = this.mTitleMarginBottom;
                            if (i32 < i33 + i34) {
                                iMax5 = Math.max(0, iMax5 - ((((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin + i34) - i32));
                            }
                        }
                        paddingTop = paddingTop2 + iMax5;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
                    }
                    if (this.mIsTitleCenterStyle) {
                        if (zShouldLayout) {
                            measuredWidth = this.mTitleTextView.getMeasuredWidth();
                        } else {
                            measuredWidth = 0;
                        }
                        if (zShouldLayout2) {
                            measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth();
                        } else {
                            measuredWidth2 = 0;
                        }
                        iMax4 = Math.max(measuredWidth, measuredWidth2);
                        width = getWidth() - (Math.max(this.mTitlePosition[0], getWidth() - this.mTitlePosition[1]) * 2);
                        int[] iArr5 = this.mTitlePosition;
                        i27 = iArr5[1] - iArr5[0];
                        if (zShouldLayout) {
                            LayoutParams layoutParams13 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                            measuredWidth4 = this.mTitleTextView.getMeasuredWidth();
                            width3 = (getWidth() - measuredWidth4) / 2;
                            i29 = width3 + measuredWidth4;
                            int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            if (width < iMax4) {
                                if (measuredWidth4 >= i27) {
                                    int[] iArr6 = this.mTitlePosition;
                                    width3 = iArr6[0];
                                    i29 = iArr6[1];
                                } else {
                                    width3 = this.mTitlePosition[0] + ((i27 - measuredWidth4) / 2);
                                    i29 = width3 + measuredWidth4;
                                }
                            }
                            this.mTitleTextView.layout(width3, paddingTop, i29, measuredHeight2);
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin;
                        }
                        if (zShouldLayout2) {
                            int i50 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth();
                            width2 = (getWidth() - measuredWidth3) / 2;
                            i28 = width2 + measuredWidth3;
                            int measuredHeight3 = this.mSubtitleTextView.getMeasuredHeight() + i50;
                            if (width < iMax4) {
                                if (measuredWidth3 >= i27) {
                                    int[] iArr7 = this.mTitlePosition;
                                    width2 = iArr7[0];
                                    i28 = iArr7[1];
                                } else {
                                    width2 = this.mTitlePosition[0] + ((i27 - measuredWidth3) / 2);
                                    i28 = width2 + measuredWidth3;
                                }
                            }
                            this.mSubtitleTextView.layout(width2, i50, i28, measuredHeight3);
                        }
                    } else if (z3) {
                        if (z2) {
                            i20 = this.mTitleMarginStart;
                        } else {
                            i20 = 0;
                        }
                        int i51 = i20 - iArr2[1];
                        if (!this.mHasCustomViewBeforeTitle || shouldLayout(this.mNavButtonView)) {
                            i21 = this.mGapBetweenNavigationAndTitle;
                        } else {
                            i21 = 0;
                        }
                        i22 = i51 + i21;
                        if (this.mIsTiny) {
                            i23 = 0;
                            iMin2 = i11;
                        } else {
                            i23 = 0;
                            iMin2 = i11 - Math.max(0, i22);
                        }
                        iArr2[1] = Math.max(i23, -i22);
                        if (zShouldLayout) {
                            LayoutParams layoutParams14 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                            i24 = i8;
                            int iMax6 = Math.max(i24, iMin2 - this.mTitleTextView.getMeasuredWidth());
                            int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(iMax6, paddingTop, iMin2, measuredHeight4);
                            i25 = iMax6 - this.mTitleMarginEnd;
                            paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) layoutParams14).bottomMargin;
                        } else {
                            i24 = i8;
                            i25 = iMin2;
                        }
                        if (zShouldLayout2) {
                            int i52 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            this.mSubtitleTextView.layout(iMin2 - this.mSubtitleTextView.getMeasuredWidth(), i52, iMin2, this.mSubtitleTextView.getMeasuredHeight() + i52);
                            i26 = iMin2 - this.mTitleMarginEnd;
                        } else {
                            i26 = iMin2;
                        }
                        if (z2) {
                            iMin2 = Math.min(i25, i26);
                        }
                        iMax3 = i24;
                        i17 = iMin2;
                    } else {
                        if (z2) {
                            i13 = this.mTitleMarginStart;
                        } else {
                            i13 = 0;
                        }
                        int i53 = i13 - iArr2[0];
                        if (!this.mHasCustomViewBeforeTitle || shouldLayout(this.mNavButtonView)) {
                            i14 = this.mGapBetweenNavigationAndTitle;
                        } else {
                            i14 = 0;
                        }
                        i15 = i53 + i14;
                        if (this.mIsTiny) {
                            i16 = 0;
                            iMax2 = i8;
                        } else {
                            i16 = 0;
                            iMax2 = Math.max(0, i15) + i8;
                        }
                        iArr2[i16] = Math.max(i16, -i15);
                        if (zShouldLayout) {
                            LayoutParams layoutParams15 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                            i17 = i11;
                            int iMin3 = Math.min(this.mTitleTextView.getMeasuredWidth() + iMax2, i17);
                            int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(iMax2, paddingTop, iMin3, measuredHeight5);
                            i18 = iMin3 + this.mTitleMarginEnd;
                            paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) layoutParams15).bottomMargin;
                        } else {
                            i17 = i11;
                            i18 = iMax2;
                        }
                        if (zShouldLayout2) {
                            int i54 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            int measuredWidth6 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                            this.mSubtitleTextView.layout(iMax2, i54, measuredWidth6, this.mSubtitleTextView.getMeasuredHeight() + i54);
                            i19 = measuredWidth6 + this.mTitleMarginEnd;
                        } else {
                            i19 = iMax2;
                        }
                        if (z2) {
                            iMax3 = Math.max(i18, i19);
                        } else {
                            iMax3 = iMax2;
                        }
                    }
                    if (shouldLayout(this.mDummyView)) {
                        if (z3) {
                            layoutChildRight(this.mDummyView, iMax3, i17, iArr2, minimumHeightCompat);
                        } else {
                            layoutChildLeft(this.mDummyView, iMax3, i17, iArr2, minimumHeightCompat);
                        }
                    }
                }
                i8 = i8;
                i11 = i11;
                iMax3 = i8;
                i17 = i11;
                if (shouldLayout(this.mDummyView)) {
                    if (z3) {
                        layoutChildRight(this.mDummyView, iMax3, i17, iArr2, minimumHeightCompat);
                    } else {
                        layoutChildLeft(this.mDummyView, iMax3, i17, iArr2, minimumHeightCompat);
                    }
                }
            }
            i6 = iLayoutChildLeft;
            iLayoutChildLeft2 = i5;
            if (shouldLayout(this.mTitleTextView)) {
                addCustomViewsWithGravity(this.mTempViews, 1);
                iArr3 = iArr;
                int viewListMeasuredWidth3 = getViewListMeasuredWidth(this.mTempViews, iArr3);
                i41 = (width4 / 2) - (viewListMeasuredWidth3 / 2);
                i42 = viewListMeasuredWidth3 + i41;
                if (i41 < iLayoutChildLeft2) {
                    i41 = iLayoutChildLeft2;
                } else if (i42 > i6) {
                    i41 -= i42 - i6;
                }
                size4 = this.mTempViews.size();
                iLayoutChildLeft5 = i41;
                i43 = 0;
                while (i43 < size4) {
                    layoutParams9 = this.mTempViews.get(i43).getLayoutParams();
                    if (layoutParams9 != null) {
                        iLayoutChildLeft5 = layoutChildLeft(this.mTempViews.get(i43), iLayoutChildLeft5, i6, iArr3, minimumHeightCompat);
                    } else {
                        iLayoutChildLeft5 = layoutChildLeft(this.mTempViews.get(i43), iLayoutChildLeft5, i6, iArr3, minimumHeightCompat);
                    }
                    i43++;
                    iArr3 = iArr3;
                    size4 = size4;
                    i6 = i6;
                }
                iArr = iArr3;
            }
            int i410 = i6;
            iArr2 = iArr;
            iArr2[0] = Math.max(0, getContentInsetLeft() - iLayoutChildLeft2);
            iArr2[1] = Math.max(0, getContentInsetRight() - (i45 - i410));
            iMax = Math.max(iLayoutChildLeft2, getContentInsetLeft());
            iMin = Math.min(i410, width4 - getContentInsetRight());
            if (shouldLayout(this.mExpandedActionView)) {
                if (z3) {
                    iMin = layoutChildRight(this.mExpandedActionView, iMax, iMin, iArr2, minimumHeightCompat);
                } else {
                    iMax = layoutChildLeft(this.mExpandedActionView, iMax, iMin, iArr2, minimumHeightCompat);
                }
            }
            if (shouldLayout(this.mLogoView)) {
                if (z3) {
                    iMin = layoutChildRight(this.mLogoView, iMax, iMin, iArr2, minimumHeightCompat);
                } else {
                    iMax = layoutChildLeft(this.mLogoView, iMax, iMin, iArr2, minimumHeightCompat);
                }
            }
            addCustomViewsWithGravity(this.mTempViews, 3);
            size = this.mTempViews.size();
            if (this.mHasSearchViewFlag) {
                iLayoutChildLeft3 = iMax;
                i40 = 0;
                while (i40 < size) {
                    layoutParams8 = this.mTempViews.get(i40).getLayoutParams();
                    if (!isDummyView(this.mTempViews.get(i40), (LayoutParams) layoutParams8)) {
                        if (layoutParams8 == null) {
                            iLayoutChildLeft3 = layoutChildLeft(this.mTempViews.get(i40), iLayoutChildLeft3, iMin, iArr2, minimumHeightCompat);
                        } else {
                            iLayoutChildLeft3 = layoutChildLeft(this.mTempViews.get(i40), iLayoutChildLeft3, iMin, iArr2, minimumHeightCompat);
                        }
                    }
                    i40++;
                    size = size;
                }
            } else {
                iLayoutChildLeft3 = iMax;
                while (i7 < size) {
                    View view4 = this.mTempViews.get(i7);
                    layoutParams = (LayoutParams) view4.getLayoutParams();
                    if (layoutParams.mTypeTextButton) {
                    }
                }
            }
            i8 = iLayoutChildLeft3;
            addCustomViewsWithGravity(this.mTempViews, 5);
            size2 = this.mTempViews.size();
            if (this.mHasSearchViewFlag) {
                iLayoutChildRight2 = iMin;
                while (i39 < size2) {
                    layoutParams7 = this.mTempViews.get(i39).getLayoutParams();
                    if (!isDummyView(this.mTempViews.get(i39), (LayoutParams) layoutParams7)) {
                        if (layoutParams7 == null) {
                            iLayoutChildRight2 = layoutChildRight(this.mTempViews.get(i39), i8, iLayoutChildRight2, iArr2, minimumHeightCompat);
                        } else {
                            iLayoutChildRight2 = layoutChildRight(this.mTempViews.get(i39), i8, iLayoutChildRight2, iArr2, minimumHeightCompat);
                        }
                    }
                }
            } else if (z3) {
                iLayoutChildRight2 = iMin;
                while (i10 >= 0) {
                    View view5 = this.mTempViews.get(i10);
                    layoutParams3 = (LayoutParams) view5.getLayoutParams();
                    if (layoutParams3.mTypeTextButton) {
                    }
                }
            } else {
                iLayoutChildRight2 = iMin;
                while (i9 < size2) {
                    View view6 = this.mTempViews.get(i9);
                    layoutParams2 = (LayoutParams) view6.getLayoutParams();
                    if (layoutParams2.mTypeTextButton) {
                    }
                }
            }
            i11 = iLayoutChildRight2;
            if (!shouldLayout(this.mTitleTextView)) {
                addCustomViewsWithGravity(this.mTempViews, 1);
                int viewListMeasuredWidth4 = getViewListMeasuredWidth(this.mTempViews, iArr2);
                i35 = (width4 / 2) - (viewListMeasuredWidth4 / 2);
                i36 = viewListMeasuredWidth4 + i35;
                i37 = this.mSectionGap;
                if (i35 < i8 + i37) {
                    i35 = i8 + i37;
                } else if (i36 > i11 - i37) {
                    i35 -= i36 - (i11 - i37);
                }
                size3 = this.mTempViews.size();
                iLayoutChildLeft4 = i35;
                while (i38 < size3) {
                    layoutParams6 = this.mTempViews.get(i38).getLayoutParams();
                    if (layoutParams6 != null) {
                        iLayoutChildLeft4 = layoutChildLeft(this.mTempViews.get(i38), iLayoutChildLeft4, i11, iArr2, minimumHeightCompat);
                    } else {
                        iLayoutChildLeft4 = layoutChildLeft(this.mTempViews.get(i38), iLayoutChildLeft4, i11, iArr2, minimumHeightCompat);
                    }
                }
            }
            this.mTempViews.clear();
            zShouldLayout = shouldLayout(this.mTitleTextView);
            zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
            if (zShouldLayout) {
                LayoutParams layoutParams16 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams16).topMargin + this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams16).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zShouldLayout2) {
                LayoutParams layoutParams17 = (LayoutParams) this.mSubtitleTextView.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) layoutParams17).topMargin + this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams17).bottomMargin;
            }
            if (zShouldLayout) {
                if (zShouldLayout) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zShouldLayout2) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                layoutParams4 = (LayoutParams) textView.getLayoutParams();
                layoutParams5 = (LayoutParams) textView2.getLayoutParams();
                if (zShouldLayout) {
                }
                i12 = this.mGravity & 112;
                if (i12 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + this.mTitleMarginTop;
                } else if (i12 != 80) {
                    iMax5 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i30 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                    i31 = this.mTitleMarginTop;
                    if (iMax5 < i30 + i31) {
                        iMax5 = i30 + i31;
                    } else {
                        i32 = (((height - paddingBottom) - measuredHeight) - iMax5) - paddingTop2;
                        i33 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                        i34 = this.mTitleMarginBottom;
                        if (i32 < i33 + i34) {
                            iMax5 = Math.max(0, iMax5 - ((((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin + i34) - i32));
                        }
                    }
                    paddingTop = paddingTop2 + iMax5;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
                }
                if (this.mIsTitleCenterStyle) {
                    if (zShouldLayout) {
                        measuredWidth = this.mTitleTextView.getMeasuredWidth();
                    } else {
                        measuredWidth = 0;
                    }
                    if (zShouldLayout2) {
                        measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth();
                    } else {
                        measuredWidth2 = 0;
                    }
                    iMax4 = Math.max(measuredWidth, measuredWidth2);
                    width = getWidth() - (Math.max(this.mTitlePosition[0], getWidth() - this.mTitlePosition[1]) * 2);
                    int[] iArr8 = this.mTitlePosition;
                    i27 = iArr8[1] - iArr8[0];
                    if (zShouldLayout) {
                        LayoutParams layoutParams18 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                        measuredWidth4 = this.mTitleTextView.getMeasuredWidth();
                        width3 = (getWidth() - measuredWidth4) / 2;
                        i29 = width3 + measuredWidth4;
                        int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        if (width < iMax4) {
                            if (measuredWidth4 >= i27) {
                                int[] iArr9 = this.mTitlePosition;
                                width3 = iArr9[0];
                                i29 = iArr9[1];
                            } else {
                                width3 = this.mTitlePosition[0] + ((i27 - measuredWidth4) / 2);
                                i29 = width3 + measuredWidth4;
                            }
                        }
                        this.mTitleTextView.layout(width3, paddingTop, i29, measuredHeight6);
                        paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) layoutParams18).bottomMargin;
                    }
                    if (zShouldLayout2) {
                        int i55 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth();
                        width2 = (getWidth() - measuredWidth3) / 2;
                        i28 = width2 + measuredWidth3;
                        int measuredHeight7 = this.mSubtitleTextView.getMeasuredHeight() + i55;
                        if (width < iMax4) {
                            if (measuredWidth3 >= i27) {
                                int[] iArr10 = this.mTitlePosition;
                                width2 = iArr10[0];
                                i28 = iArr10[1];
                            } else {
                                width2 = this.mTitlePosition[0] + ((i27 - measuredWidth3) / 2);
                                i28 = width2 + measuredWidth3;
                            }
                        }
                        this.mSubtitleTextView.layout(width2, i55, i28, measuredHeight7);
                    }
                    iMax3 = i8;
                    i17 = i11;
                } else if (z3) {
                    if (z2) {
                        i20 = this.mTitleMarginStart;
                    } else {
                        i20 = 0;
                    }
                    int i56 = i20 - iArr2[1];
                    if (this.mHasCustomViewBeforeTitle) {
                        i21 = this.mGapBetweenNavigationAndTitle;
                    } else {
                        i21 = this.mGapBetweenNavigationAndTitle;
                    }
                    i22 = i56 + i21;
                    if (this.mIsTiny) {
                        i23 = 0;
                        iMin2 = i11 - Math.max(0, i22);
                    } else {
                        i23 = 0;
                        iMin2 = i11;
                    }
                    iArr2[1] = Math.max(i23, -i22);
                    if (zShouldLayout) {
                        LayoutParams layoutParams19 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                        i24 = i8;
                        int iMax7 = Math.max(i24, iMin2 - this.mTitleTextView.getMeasuredWidth());
                        int measuredHeight8 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax7, paddingTop, iMin2, measuredHeight8);
                        i25 = iMax7 - this.mTitleMarginEnd;
                        paddingTop = measuredHeight8 + ((ViewGroup.MarginLayoutParams) layoutParams19).bottomMargin;
                    } else {
                        i24 = i8;
                        i25 = iMin2;
                    }
                    if (zShouldLayout2) {
                        int i57 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(iMin2 - this.mSubtitleTextView.getMeasuredWidth(), i57, iMin2, this.mSubtitleTextView.getMeasuredHeight() + i57);
                        i26 = iMin2 - this.mTitleMarginEnd;
                    } else {
                        i26 = iMin2;
                    }
                    if (z2) {
                        iMin2 = Math.min(i25, i26);
                    }
                    iMax3 = i24;
                    i17 = iMin2;
                } else {
                    if (z2) {
                        i13 = this.mTitleMarginStart;
                    } else {
                        i13 = 0;
                    }
                    int i58 = i13 - iArr2[0];
                    if (this.mHasCustomViewBeforeTitle) {
                        i14 = this.mGapBetweenNavigationAndTitle;
                    } else {
                        i14 = this.mGapBetweenNavigationAndTitle;
                    }
                    i15 = i58 + i14;
                    if (this.mIsTiny) {
                        i16 = 0;
                        iMax2 = Math.max(0, i15) + i8;
                    } else {
                        i16 = 0;
                        iMax2 = i8;
                    }
                    iArr2[i16] = Math.max(i16, -i15);
                    if (zShouldLayout) {
                        LayoutParams layoutParams110 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                        i17 = i11;
                        int iMin4 = Math.min(this.mTitleTextView.getMeasuredWidth() + iMax2, i17);
                        int measuredHeight9 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax2, paddingTop, iMin4, measuredHeight9);
                        i18 = iMin4 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight9 + ((ViewGroup.MarginLayoutParams) layoutParams110).bottomMargin;
                    } else {
                        i17 = i11;
                        i18 = iMax2;
                    }
                    if (zShouldLayout2) {
                        int i59 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        int measuredWidth7 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                        this.mSubtitleTextView.layout(iMax2, i59, measuredWidth7, this.mSubtitleTextView.getMeasuredHeight() + i59);
                        i19 = measuredWidth7 + this.mTitleMarginEnd;
                    } else {
                        i19 = iMax2;
                    }
                    if (z2) {
                        iMax3 = Math.max(i18, i19);
                    } else {
                        iMax3 = iMax2;
                    }
                }
            } else {
                if (zShouldLayout) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zShouldLayout2) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                layoutParams4 = (LayoutParams) textView.getLayoutParams();
                layoutParams5 = (LayoutParams) textView2.getLayoutParams();
                if (zShouldLayout) {
                }
                i12 = this.mGravity & 112;
                if (i12 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + this.mTitleMarginTop;
                } else if (i12 != 80) {
                    iMax5 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i30 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                    i31 = this.mTitleMarginTop;
                    if (iMax5 < i30 + i31) {
                        iMax5 = i30 + i31;
                    } else {
                        i32 = (((height - paddingBottom) - measuredHeight) - iMax5) - paddingTop2;
                        i33 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                        i34 = this.mTitleMarginBottom;
                        if (i32 < i33 + i34) {
                            iMax5 = Math.max(0, iMax5 - ((((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin + i34) - i32));
                        }
                    }
                    paddingTop = paddingTop2 + iMax5;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
                }
                if (this.mIsTitleCenterStyle) {
                    if (zShouldLayout) {
                        measuredWidth = this.mTitleTextView.getMeasuredWidth();
                    } else {
                        measuredWidth = 0;
                    }
                    if (zShouldLayout2) {
                        measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth();
                    } else {
                        measuredWidth2 = 0;
                    }
                    iMax4 = Math.max(measuredWidth, measuredWidth2);
                    width = getWidth() - (Math.max(this.mTitlePosition[0], getWidth() - this.mTitlePosition[1]) * 2);
                    int[] iArr11 = this.mTitlePosition;
                    i27 = iArr11[1] - iArr11[0];
                    if (zShouldLayout) {
                        LayoutParams layoutParams111 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                        measuredWidth4 = this.mTitleTextView.getMeasuredWidth();
                        width3 = (getWidth() - measuredWidth4) / 2;
                        i29 = width3 + measuredWidth4;
                        int measuredHeight10 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        if (width < iMax4) {
                            if (measuredWidth4 >= i27) {
                                int[] iArr12 = this.mTitlePosition;
                                width3 = iArr12[0];
                                i29 = iArr12[1];
                            } else {
                                width3 = this.mTitlePosition[0] + ((i27 - measuredWidth4) / 2);
                                i29 = width3 + measuredWidth4;
                            }
                        }
                        this.mTitleTextView.layout(width3, paddingTop, i29, measuredHeight10);
                        paddingTop = measuredHeight10 + ((ViewGroup.MarginLayoutParams) layoutParams111).bottomMargin;
                    }
                    if (zShouldLayout2) {
                        int i510 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth();
                        width2 = (getWidth() - measuredWidth3) / 2;
                        i28 = width2 + measuredWidth3;
                        int measuredHeight11 = this.mSubtitleTextView.getMeasuredHeight() + i510;
                        if (width < iMax4) {
                            if (measuredWidth3 >= i27) {
                                int[] iArr13 = this.mTitlePosition;
                                width2 = iArr13[0];
                                i28 = iArr13[1];
                            } else {
                                width2 = this.mTitlePosition[0] + ((i27 - measuredWidth3) / 2);
                                i28 = width2 + measuredWidth3;
                            }
                        }
                        this.mSubtitleTextView.layout(width2, i510, i28, measuredHeight11);
                    }
                    iMax3 = i8;
                    i17 = i11;
                } else if (z3) {
                    if (z2) {
                        i20 = this.mTitleMarginStart;
                    } else {
                        i20 = 0;
                    }
                    int i511 = i20 - iArr2[1];
                    if (this.mHasCustomViewBeforeTitle) {
                        i21 = this.mGapBetweenNavigationAndTitle;
                    } else {
                        i21 = this.mGapBetweenNavigationAndTitle;
                    }
                    i22 = i511 + i21;
                    if (this.mIsTiny) {
                        i23 = 0;
                        iMin2 = i11 - Math.max(0, i22);
                    } else {
                        i23 = 0;
                        iMin2 = i11;
                    }
                    iArr2[1] = Math.max(i23, -i22);
                    if (zShouldLayout) {
                        LayoutParams layoutParams112 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                        i24 = i8;
                        int iMax8 = Math.max(i24, iMin2 - this.mTitleTextView.getMeasuredWidth());
                        int measuredHeight12 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax8, paddingTop, iMin2, measuredHeight12);
                        i25 = iMax8 - this.mTitleMarginEnd;
                        paddingTop = measuredHeight12 + ((ViewGroup.MarginLayoutParams) layoutParams112).bottomMargin;
                    } else {
                        i24 = i8;
                        i25 = iMin2;
                    }
                    if (zShouldLayout2) {
                        int i512 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(iMin2 - this.mSubtitleTextView.getMeasuredWidth(), i512, iMin2, this.mSubtitleTextView.getMeasuredHeight() + i512);
                        i26 = iMin2 - this.mTitleMarginEnd;
                    } else {
                        i26 = iMin2;
                    }
                    if (z2) {
                        iMin2 = Math.min(i25, i26);
                    }
                    iMax3 = i24;
                    i17 = iMin2;
                } else {
                    if (z2) {
                        i13 = this.mTitleMarginStart;
                    } else {
                        i13 = 0;
                    }
                    int i513 = i13 - iArr2[0];
                    if (this.mHasCustomViewBeforeTitle) {
                        i14 = this.mGapBetweenNavigationAndTitle;
                    } else {
                        i14 = this.mGapBetweenNavigationAndTitle;
                    }
                    i15 = i513 + i14;
                    if (this.mIsTiny) {
                        i16 = 0;
                        iMax2 = Math.max(0, i15) + i8;
                    } else {
                        i16 = 0;
                        iMax2 = i8;
                    }
                    iArr2[i16] = Math.max(i16, -i15);
                    if (zShouldLayout) {
                        LayoutParams layoutParams113 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                        i17 = i11;
                        int iMin5 = Math.min(this.mTitleTextView.getMeasuredWidth() + iMax2, i17);
                        int measuredHeight13 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax2, paddingTop, iMin5, measuredHeight13);
                        i18 = iMin5 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight13 + ((ViewGroup.MarginLayoutParams) layoutParams113).bottomMargin;
                    } else {
                        i17 = i11;
                        i18 = iMax2;
                    }
                    if (zShouldLayout2) {
                        int i514 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        int measuredWidth8 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                        this.mSubtitleTextView.layout(iMax2, i514, measuredWidth8, this.mSubtitleTextView.getMeasuredHeight() + i514);
                        i19 = measuredWidth8 + this.mTitleMarginEnd;
                    } else {
                        i19 = iMax2;
                    }
                    if (z2) {
                        iMax3 = Math.max(i18, i19);
                    } else {
                        iMax3 = iMax2;
                    }
                }
            }
            if (shouldLayout(this.mDummyView)) {
                if (z3) {
                    layoutChildRight(this.mDummyView, iMax3, i17, iArr2, minimumHeightCompat);
                } else {
                    layoutChildLeft(this.mDummyView, iMax3, i17, iArr2, minimumHeightCompat);
                }
            }
        }
        iArr = iArr4;
        iLayoutChildRight = i45;
        if (shouldLayout(this.mCollapseButtonView)) {
            if (z3) {
                iLayoutChildRight = layoutChildRight(this.mCollapseButtonView, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
            } else {
                paddingLeft = layoutChildLeft(this.mCollapseButtonView, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
            }
        }
        if (shouldLayout(this.mTextButton)) {
            if (z3) {
                paddingLeft = layoutChildLeft(this.mTextButton, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
            } else {
                iLayoutChildRight = layoutChildRight(this.mTextButton, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
            }
        }
        zIsSmallScreen = COUIResponsiveUtils.isSmallScreen(getContext(), getMeasuredWidth());
        if (!shouldLayout(this.mMenuView)) {
            i5 = paddingLeft;
            iLayoutChildLeft = iLayoutChildRight;
        } else if (z3) {
            paddingLeft = layoutChildLeft(this.mMenuView, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
            if (!zIsSmallScreen) {
                paddingLeft += this.mGapBeforeMenuView;
            }
            i5 = paddingLeft;
            iLayoutChildLeft = iLayoutChildRight;
        } else {
            iLayoutChildRight3 = layoutChildRight(this.mMenuView, paddingLeft, iLayoutChildRight, iArr, minimumHeightCompat);
            if (!zIsSmallScreen) {
                iLayoutChildRight3 -= this.mGapBeforeMenuView;
            }
            i5 = paddingLeft;
            iLayoutChildLeft = iLayoutChildRight3;
        }
        if (shouldLayout(this.mSegmentButton)) {
            i6 = iLayoutChildLeft;
            iLayoutChildLeft2 = i5;
        } else {
            i6 = iLayoutChildLeft;
            iLayoutChildLeft2 = i5;
        }
        if (shouldLayout(this.mTitleTextView)) {
            addCustomViewsWithGravity(this.mTempViews, 1);
            iArr3 = iArr;
            int viewListMeasuredWidth5 = getViewListMeasuredWidth(this.mTempViews, iArr3);
            i41 = (width4 / 2) - (viewListMeasuredWidth5 / 2);
            i42 = viewListMeasuredWidth5 + i41;
            if (i41 < iLayoutChildLeft2) {
                i41 = iLayoutChildLeft2;
            } else if (i42 > i6) {
                i41 -= i42 - i6;
            }
            size4 = this.mTempViews.size();
            iLayoutChildLeft5 = i41;
            i43 = 0;
            while (i43 < size4) {
                layoutParams9 = this.mTempViews.get(i43).getLayoutParams();
                if (layoutParams9 != null) {
                    iLayoutChildLeft5 = layoutChildLeft(this.mTempViews.get(i43), iLayoutChildLeft5, i6, iArr3, minimumHeightCompat);
                } else {
                    iLayoutChildLeft5 = layoutChildLeft(this.mTempViews.get(i43), iLayoutChildLeft5, i6, iArr3, minimumHeightCompat);
                }
                i43++;
                iArr3 = iArr3;
                size4 = size4;
                i6 = i6;
            }
            iArr = iArr3;
        }
        int i411 = i6;
        iArr2 = iArr;
        iArr2[0] = Math.max(0, getContentInsetLeft() - iLayoutChildLeft2);
        iArr2[1] = Math.max(0, getContentInsetRight() - (i45 - i411));
        iMax = Math.max(iLayoutChildLeft2, getContentInsetLeft());
        iMin = Math.min(i411, width4 - getContentInsetRight());
        if (shouldLayout(this.mExpandedActionView)) {
            if (z3) {
                iMin = layoutChildRight(this.mExpandedActionView, iMax, iMin, iArr2, minimumHeightCompat);
            } else {
                iMax = layoutChildLeft(this.mExpandedActionView, iMax, iMin, iArr2, minimumHeightCompat);
            }
        }
        if (shouldLayout(this.mLogoView)) {
            if (z3) {
                iMin = layoutChildRight(this.mLogoView, iMax, iMin, iArr2, minimumHeightCompat);
            } else {
                iMax = layoutChildLeft(this.mLogoView, iMax, iMin, iArr2, minimumHeightCompat);
            }
        }
        addCustomViewsWithGravity(this.mTempViews, 3);
        size = this.mTempViews.size();
        if (this.mHasSearchViewFlag) {
            iLayoutChildLeft3 = iMax;
            i40 = 0;
            while (i40 < size) {
                layoutParams8 = this.mTempViews.get(i40).getLayoutParams();
                if (!isDummyView(this.mTempViews.get(i40), (LayoutParams) layoutParams8)) {
                    if (layoutParams8 == null) {
                        iLayoutChildLeft3 = layoutChildLeft(this.mTempViews.get(i40), iLayoutChildLeft3, iMin, iArr2, minimumHeightCompat);
                    } else {
                        iLayoutChildLeft3 = layoutChildLeft(this.mTempViews.get(i40), iLayoutChildLeft3, iMin, iArr2, minimumHeightCompat);
                    }
                }
                i40++;
                size = size;
            }
        } else {
            iLayoutChildLeft3 = iMax;
            while (i7 < size) {
                View view7 = this.mTempViews.get(i7);
                layoutParams = (LayoutParams) view7.getLayoutParams();
                if (layoutParams.mTypeTextButton) {
                }
            }
        }
        i8 = iLayoutChildLeft3;
        addCustomViewsWithGravity(this.mTempViews, 5);
        size2 = this.mTempViews.size();
        if (this.mHasSearchViewFlag) {
            iLayoutChildRight2 = iMin;
            while (i39 < size2) {
                layoutParams7 = this.mTempViews.get(i39).getLayoutParams();
                if (!isDummyView(this.mTempViews.get(i39), (LayoutParams) layoutParams7)) {
                    if (layoutParams7 == null) {
                        iLayoutChildRight2 = layoutChildRight(this.mTempViews.get(i39), i8, iLayoutChildRight2, iArr2, minimumHeightCompat);
                    } else {
                        iLayoutChildRight2 = layoutChildRight(this.mTempViews.get(i39), i8, iLayoutChildRight2, iArr2, minimumHeightCompat);
                    }
                }
            }
        } else if (z3) {
            iLayoutChildRight2 = iMin;
            while (i10 >= 0) {
                View view8 = this.mTempViews.get(i10);
                layoutParams3 = (LayoutParams) view8.getLayoutParams();
                if (layoutParams3.mTypeTextButton) {
                }
            }
        } else {
            iLayoutChildRight2 = iMin;
            while (i9 < size2) {
                View view9 = this.mTempViews.get(i9);
                layoutParams2 = (LayoutParams) view9.getLayoutParams();
                if (layoutParams2.mTypeTextButton) {
                }
            }
        }
        i11 = iLayoutChildRight2;
        if (!shouldLayout(this.mTitleTextView)) {
            addCustomViewsWithGravity(this.mTempViews, 1);
            int viewListMeasuredWidth6 = getViewListMeasuredWidth(this.mTempViews, iArr2);
            i35 = (width4 / 2) - (viewListMeasuredWidth6 / 2);
            i36 = viewListMeasuredWidth6 + i35;
            i37 = this.mSectionGap;
            if (i35 < i8 + i37) {
                i35 = i8 + i37;
            } else if (i36 > i11 - i37) {
                i35 -= i36 - (i11 - i37);
            }
            size3 = this.mTempViews.size();
            iLayoutChildLeft4 = i35;
            while (i38 < size3) {
                layoutParams6 = this.mTempViews.get(i38).getLayoutParams();
                if (layoutParams6 != null) {
                    iLayoutChildLeft4 = layoutChildLeft(this.mTempViews.get(i38), iLayoutChildLeft4, i11, iArr2, minimumHeightCompat);
                } else {
                    iLayoutChildLeft4 = layoutChildLeft(this.mTempViews.get(i38), iLayoutChildLeft4, i11, iArr2, minimumHeightCompat);
                }
            }
        }
        this.mTempViews.clear();
        zShouldLayout = shouldLayout(this.mTitleTextView);
        zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
        if (zShouldLayout) {
            LayoutParams layoutParams114 = (LayoutParams) this.mTitleTextView.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams114).topMargin + this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams114).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zShouldLayout2) {
            LayoutParams layoutParams115 = (LayoutParams) this.mSubtitleTextView.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) layoutParams115).topMargin + this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams115).bottomMargin;
        }
        if (zShouldLayout) {
            if (zShouldLayout) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zShouldLayout2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            layoutParams4 = (LayoutParams) textView.getLayoutParams();
            layoutParams5 = (LayoutParams) textView2.getLayoutParams();
            if (zShouldLayout) {
            }
            i12 = this.mGravity & 112;
            if (i12 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + this.mTitleMarginTop;
            } else if (i12 != 80) {
                iMax5 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i30 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                i31 = this.mTitleMarginTop;
                if (iMax5 < i30 + i31) {
                    iMax5 = i30 + i31;
                } else {
                    i32 = (((height - paddingBottom) - measuredHeight) - iMax5) - paddingTop2;
                    i33 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                    i34 = this.mTitleMarginBottom;
                    if (i32 < i33 + i34) {
                        iMax5 = Math.max(0, iMax5 - ((((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin + i34) - i32));
                    }
                }
                paddingTop = paddingTop2 + iMax5;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
            }
            if (this.mIsTitleCenterStyle) {
                if (zShouldLayout) {
                    measuredWidth = this.mTitleTextView.getMeasuredWidth();
                } else {
                    measuredWidth = 0;
                }
                if (zShouldLayout2) {
                    measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth();
                } else {
                    measuredWidth2 = 0;
                }
                iMax4 = Math.max(measuredWidth, measuredWidth2);
                width = getWidth() - (Math.max(this.mTitlePosition[0], getWidth() - this.mTitlePosition[1]) * 2);
                int[] iArr14 = this.mTitlePosition;
                i27 = iArr14[1] - iArr14[0];
                if (zShouldLayout) {
                    LayoutParams layoutParams116 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    measuredWidth4 = this.mTitleTextView.getMeasuredWidth();
                    width3 = (getWidth() - measuredWidth4) / 2;
                    i29 = width3 + measuredWidth4;
                    int measuredHeight14 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    if (width < iMax4) {
                        if (measuredWidth4 >= i27) {
                            int[] iArr15 = this.mTitlePosition;
                            width3 = iArr15[0];
                            i29 = iArr15[1];
                        } else {
                            width3 = this.mTitlePosition[0] + ((i27 - measuredWidth4) / 2);
                            i29 = width3 + measuredWidth4;
                        }
                    }
                    this.mTitleTextView.layout(width3, paddingTop, i29, measuredHeight14);
                    paddingTop = measuredHeight14 + ((ViewGroup.MarginLayoutParams) layoutParams116).bottomMargin;
                }
                if (zShouldLayout2) {
                    int i515 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth();
                    width2 = (getWidth() - measuredWidth3) / 2;
                    i28 = width2 + measuredWidth3;
                    int measuredHeight15 = this.mSubtitleTextView.getMeasuredHeight() + i515;
                    if (width < iMax4) {
                        if (measuredWidth3 >= i27) {
                            int[] iArr16 = this.mTitlePosition;
                            width2 = iArr16[0];
                            i28 = iArr16[1];
                        } else {
                            width2 = this.mTitlePosition[0] + ((i27 - measuredWidth3) / 2);
                            i28 = width2 + measuredWidth3;
                        }
                    }
                    this.mSubtitleTextView.layout(width2, i515, i28, measuredHeight15);
                }
                iMax3 = i8;
                i17 = i11;
            } else if (z3) {
                if (z2) {
                    i20 = this.mTitleMarginStart;
                } else {
                    i20 = 0;
                }
                int i516 = i20 - iArr2[1];
                if (this.mHasCustomViewBeforeTitle) {
                    i21 = this.mGapBetweenNavigationAndTitle;
                } else {
                    i21 = this.mGapBetweenNavigationAndTitle;
                }
                i22 = i516 + i21;
                if (this.mIsTiny) {
                    i23 = 0;
                    iMin2 = i11 - Math.max(0, i22);
                } else {
                    i23 = 0;
                    iMin2 = i11;
                }
                iArr2[1] = Math.max(i23, -i22);
                if (zShouldLayout) {
                    LayoutParams layoutParams117 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    i24 = i8;
                    int iMax9 = Math.max(i24, iMin2 - this.mTitleTextView.getMeasuredWidth());
                    int measuredHeight16 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax9, paddingTop, iMin2, measuredHeight16);
                    i25 = iMax9 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight16 + ((ViewGroup.MarginLayoutParams) layoutParams117).bottomMargin;
                } else {
                    i24 = i8;
                    i25 = iMin2;
                }
                if (zShouldLayout2) {
                    int i517 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin2 - this.mSubtitleTextView.getMeasuredWidth(), i517, iMin2, this.mSubtitleTextView.getMeasuredHeight() + i517);
                    i26 = iMin2 - this.mTitleMarginEnd;
                } else {
                    i26 = iMin2;
                }
                if (z2) {
                    iMin2 = Math.min(i25, i26);
                }
                iMax3 = i24;
                i17 = iMin2;
            } else {
                if (z2) {
                    i13 = this.mTitleMarginStart;
                } else {
                    i13 = 0;
                }
                int i518 = i13 - iArr2[0];
                if (this.mHasCustomViewBeforeTitle) {
                    i14 = this.mGapBetweenNavigationAndTitle;
                } else {
                    i14 = this.mGapBetweenNavigationAndTitle;
                }
                i15 = i518 + i14;
                if (this.mIsTiny) {
                    i16 = 0;
                    iMax2 = Math.max(0, i15) + i8;
                } else {
                    i16 = 0;
                    iMax2 = i8;
                }
                iArr2[i16] = Math.max(i16, -i15);
                if (zShouldLayout) {
                    LayoutParams layoutParams118 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    i17 = i11;
                    int iMin6 = Math.min(this.mTitleTextView.getMeasuredWidth() + iMax2, i17);
                    int measuredHeight17 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax2, paddingTop, iMin6, measuredHeight17);
                    i18 = iMin6 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight17 + ((ViewGroup.MarginLayoutParams) layoutParams118).bottomMargin;
                } else {
                    i17 = i11;
                    i18 = iMax2;
                }
                if (zShouldLayout2) {
                    int i519 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                    this.mSubtitleTextView.layout(iMax2, i519, measuredWidth9, this.mSubtitleTextView.getMeasuredHeight() + i519);
                    i19 = measuredWidth9 + this.mTitleMarginEnd;
                } else {
                    i19 = iMax2;
                }
                if (z2) {
                    iMax3 = Math.max(i18, i19);
                } else {
                    iMax3 = iMax2;
                }
            }
        } else {
            if (zShouldLayout) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zShouldLayout2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            layoutParams4 = (LayoutParams) textView.getLayoutParams();
            layoutParams5 = (LayoutParams) textView2.getLayoutParams();
            if (zShouldLayout) {
            }
            i12 = this.mGravity & 112;
            if (i12 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + this.mTitleMarginTop;
            } else if (i12 != 80) {
                iMax5 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i30 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                i31 = this.mTitleMarginTop;
                if (iMax5 < i30 + i31) {
                    iMax5 = i30 + i31;
                } else {
                    i32 = (((height - paddingBottom) - measuredHeight) - iMax5) - paddingTop2;
                    i33 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                    i34 = this.mTitleMarginBottom;
                    if (i32 < i33 + i34) {
                        iMax5 = Math.max(0, iMax5 - ((((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin + i34) - i32));
                    }
                }
                paddingTop = paddingTop2 + iMax5;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
            }
            if (this.mIsTitleCenterStyle) {
                if (zShouldLayout) {
                    measuredWidth = this.mTitleTextView.getMeasuredWidth();
                } else {
                    measuredWidth = 0;
                }
                if (zShouldLayout2) {
                    measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth();
                } else {
                    measuredWidth2 = 0;
                }
                iMax4 = Math.max(measuredWidth, measuredWidth2);
                width = getWidth() - (Math.max(this.mTitlePosition[0], getWidth() - this.mTitlePosition[1]) * 2);
                int[] iArr17 = this.mTitlePosition;
                i27 = iArr17[1] - iArr17[0];
                if (zShouldLayout) {
                    LayoutParams layoutParams119 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    measuredWidth4 = this.mTitleTextView.getMeasuredWidth();
                    width3 = (getWidth() - measuredWidth4) / 2;
                    i29 = width3 + measuredWidth4;
                    int measuredHeight18 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    if (width < iMax4) {
                        if (measuredWidth4 >= i27) {
                            int[] iArr18 = this.mTitlePosition;
                            width3 = iArr18[0];
                            i29 = iArr18[1];
                        } else {
                            width3 = this.mTitlePosition[0] + ((i27 - measuredWidth4) / 2);
                            i29 = width3 + measuredWidth4;
                        }
                    }
                    this.mTitleTextView.layout(width3, paddingTop, i29, measuredHeight18);
                    paddingTop = measuredHeight18 + ((ViewGroup.MarginLayoutParams) layoutParams119).bottomMargin;
                }
                if (zShouldLayout2) {
                    int i5110 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth();
                    width2 = (getWidth() - measuredWidth3) / 2;
                    i28 = width2 + measuredWidth3;
                    int measuredHeight19 = this.mSubtitleTextView.getMeasuredHeight() + i5110;
                    if (width < iMax4) {
                        if (measuredWidth3 >= i27) {
                            int[] iArr19 = this.mTitlePosition;
                            width2 = iArr19[0];
                            i28 = iArr19[1];
                        } else {
                            width2 = this.mTitlePosition[0] + ((i27 - measuredWidth3) / 2);
                            i28 = width2 + measuredWidth3;
                        }
                    }
                    this.mSubtitleTextView.layout(width2, i5110, i28, measuredHeight19);
                }
                iMax3 = i8;
                i17 = i11;
            } else if (z3) {
                if (z2) {
                    i20 = this.mTitleMarginStart;
                } else {
                    i20 = 0;
                }
                int i5111 = i20 - iArr2[1];
                if (this.mHasCustomViewBeforeTitle) {
                    i21 = this.mGapBetweenNavigationAndTitle;
                } else {
                    i21 = this.mGapBetweenNavigationAndTitle;
                }
                i22 = i5111 + i21;
                if (this.mIsTiny) {
                    i23 = 0;
                    iMin2 = i11 - Math.max(0, i22);
                } else {
                    i23 = 0;
                    iMin2 = i11;
                }
                iArr2[1] = Math.max(i23, -i22);
                if (zShouldLayout) {
                    LayoutParams layoutParams1110 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    i24 = i8;
                    int iMax10 = Math.max(i24, iMin2 - this.mTitleTextView.getMeasuredWidth());
                    int measuredHeight110 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax10, paddingTop, iMin2, measuredHeight110);
                    i25 = iMax10 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight110 + ((ViewGroup.MarginLayoutParams) layoutParams1110).bottomMargin;
                } else {
                    i24 = i8;
                    i25 = iMin2;
                }
                if (zShouldLayout2) {
                    int i5112 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin2 - this.mSubtitleTextView.getMeasuredWidth(), i5112, iMin2, this.mSubtitleTextView.getMeasuredHeight() + i5112);
                    i26 = iMin2 - this.mTitleMarginEnd;
                } else {
                    i26 = iMin2;
                }
                if (z2) {
                    iMin2 = Math.min(i25, i26);
                }
                iMax3 = i24;
                i17 = iMin2;
            } else {
                if (z2) {
                    i13 = this.mTitleMarginStart;
                } else {
                    i13 = 0;
                }
                int i5113 = i13 - iArr2[0];
                if (this.mHasCustomViewBeforeTitle) {
                    i14 = this.mGapBetweenNavigationAndTitle;
                } else {
                    i14 = this.mGapBetweenNavigationAndTitle;
                }
                i15 = i5113 + i14;
                if (this.mIsTiny) {
                    i16 = 0;
                    iMax2 = Math.max(0, i15) + i8;
                } else {
                    i16 = 0;
                    iMax2 = i8;
                }
                iArr2[i16] = Math.max(i16, -i15);
                if (zShouldLayout) {
                    LayoutParams layoutParams1111 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    i17 = i11;
                    int iMin7 = Math.min(this.mTitleTextView.getMeasuredWidth() + iMax2, i17);
                    int measuredHeight111 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax2, paddingTop, iMin7, measuredHeight111);
                    i18 = iMin7 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight111 + ((ViewGroup.MarginLayoutParams) layoutParams1111).bottomMargin;
                } else {
                    i17 = i11;
                    i18 = iMax2;
                }
                if (zShouldLayout2) {
                    int i5114 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.mSubtitleTextView.getMeasuredWidth() + iMax2;
                    this.mSubtitleTextView.layout(iMax2, i5114, measuredWidth10, this.mSubtitleTextView.getMeasuredHeight() + i5114);
                    i19 = measuredWidth10 + this.mTitleMarginEnd;
                } else {
                    i19 = iMax2;
                }
                if (z2) {
                    iMax3 = Math.max(i18, i19);
                } else {
                    iMax3 = iMax2;
                }
            }
        }
        if (shouldLayout(this.mDummyView)) {
            if (z3) {
                layoutChildRight(this.mDummyView, iMax3, i17, iArr2, minimumHeightCompat);
            } else {
                layoutChildLeft(this.mDummyView, iMax3, i17, iArr2, minimumHeightCompat);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0 */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int iCombineMeasuredStates;
        int iMax;
        int measuredWidth2;
        MenuBuilder menuBuilder;
        boolean z;
        int measuredWidth3;
        int i3;
        int iMax2;
        int i4;
        int iMax3;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int iMeasureText;
        int i5;
        int i6;
        int measuredWidth4;
        int iCombineMeasuredStates3;
        int iMax4;
        int measuredHeight2;
        int iCombineMeasuredStates4;
        int iMax5;
        int size = View.MeasureSpec.getSize(i);
        refreshWidthLimits(size);
        boolean z2 = ViewCompat.getLayoutDirection(this) == 1;
        if (this.mIsTitleCenterStyle) {
            int[] iArr = this.mTempMargins;
            boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
            int i7 = !zIsLayoutRtl ? 1 : 0;
            int contentInsetStart = getContentInsetStart();
            int iMax6 = Math.max(contentInsetStart, 0) + 0;
            iArr[zIsLayoutRtl ? 1 : 0] = Math.max(0, contentInsetStart - 0);
            if (shouldLayout(this.mMenuView)) {
                changeToolbarPadding((MenuBuilder) this.mMenuView.getMenu(), null, z2, i, false);
                measureChildConstrained(this.mMenuView, i, 0, i2, 0, this.mMaxButtonHeight);
                measuredWidth4 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
                iMax4 = Math.max(0, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
                iCombineMeasuredStates3 = View.combineMeasuredStates(0, ViewCompat.getMeasuredState(this.mMenuView));
            } else {
                measuredWidth4 = 0;
                iCombineMeasuredStates3 = 0;
                iMax4 = 0;
            }
            int contentInsetEnd = getContentInsetEnd();
            int iMax7 = iMax6 + Math.max(contentInsetEnd, measuredWidth4);
            iArr[i7] = Math.max(0, contentInsetEnd - measuredWidth4);
            if (shouldLayout(this.mExpandedActionView)) {
                iMax7 += measureChildCollapseMargins(this.mExpandedActionView, i, iMax7, i2, 0, iArr);
                iMax4 = Math.max(iMax4, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
                iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, ViewCompat.getMeasuredState(this.mExpandedActionView));
            }
            int childCount = getChildCount();
            int i8 = iMax4;
            int iCombineMeasuredStates5 = iCombineMeasuredStates3;
            int iMax8 = i8;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mViewType == 0 && shouldLayout(childAt) && !layoutParams.mTypeSegmentButton) {
                    iMax7 += measureChildCollapseMargins(childAt, i, iMax7, i2, 0, iArr);
                    iMax8 = Math.max(iMax8, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                    iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, ViewCompat.getMeasuredState(childAt));
                } else {
                    iMax8 = iMax8;
                }
            }
            int i10 = iMax8;
            int i11 = this.mTitleMarginTop + this.mTitleMarginBottom;
            if (shouldLayout(this.mTitleTextView)) {
                this.mTitleTextView.getLayoutParams().width = -2;
                this.mTitleTextView.setTextSize(0, this.mTitleTextSize);
                measureChildCollapseMargins(this.mTitleTextView, i, 0, i2, i11, iArr);
                int measuredWidth5 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
                measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
                iCombineMeasuredStates4 = View.combineMeasuredStates(iCombineMeasuredStates5, ViewCompat.getMeasuredState(this.mTitleTextView));
                iMax5 = measuredWidth5;
            } else {
                measuredHeight2 = 0;
                iCombineMeasuredStates4 = iCombineMeasuredStates5;
                iMax5 = 0;
            }
            if (shouldLayout(this.mSubtitleTextView)) {
                this.mSubtitleTextView.getLayoutParams().width = -2;
                iMax5 = Math.max(iMax5, measureChildCollapseMargins(this.mSubtitleTextView, i, 0, i2, measuredHeight2 + i11, iArr));
                iCombineMeasuredStates4 = View.combineMeasuredStates(iCombineMeasuredStates4, ViewCompat.getMeasuredState(this.mSubtitleTextView));
            }
            int iMax9 = Math.max(i10, measuredHeight2);
            int paddingLeft = iMax7 + iMax5 + getPaddingLeft() + getPaddingRight();
            int paddingTop = iMax9 + getPaddingTop() + getPaddingBottom();
            int iResolveSizeAndState = ViewCompat.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates4);
            int iResolveSizeAndState2 = ViewCompat.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates4 << 16);
            if (shouldCollapse()) {
                iResolveSizeAndState2 = 0;
            }
            setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
            calculateTitlePosition(this.mTitlePosition);
            int[] iArr2 = this.mTitlePosition;
            int i12 = iArr2[1] - iArr2[0];
            if (shouldLayout(this.mTitleTextView)) {
                this.mTitleTextView.setMaxWidth(i12);
                measureChildCollapseMargins(this.mTitleTextView, View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), 0, i2, i11, iArr);
            }
            if (shouldLayout(this.mSubtitleTextView)) {
                this.mSubtitleTextView.setMaxWidth(i12);
                measureChildCollapseMargins(this.mSubtitleTextView, View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), 0, i2, measuredHeight2 + i11, iArr);
                return;
            }
            return;
        }
        int[] iArr3 = this.mTempMargins;
        boolean zIsLayoutRtl2 = ViewUtils.isLayoutRtl(this);
        boolean z3 = !zIsLayoutRtl2 ? 1 : 0;
        if (shouldLayout(this.mNavButtonView)) {
            changeToolbarPadding(null, this.mNavButtonView, z2, i, false);
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, ViewCompat.getMeasuredState(this.mNavButtonView));
        } else {
            measuredWidth = 0;
            iCombineMeasuredStates = 0;
            iMax = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, ViewCompat.getMeasuredState(this.mCollapseButtonView));
        }
        int iCombineMeasuredStates6 = iCombineMeasuredStates;
        int iMax10 = iMax;
        int contentInsetStart2 = getContentInsetStart();
        int iMax11 = 0 + Math.max(contentInsetStart2, measuredWidth);
        iArr3[zIsLayoutRtl2 ? 1 : 0] = Math.max(0, contentInsetStart2 - measuredWidth);
        if (shouldLayout(this.mTextButton)) {
            measureChildCollapseMargins(this.mTextButton, i, iMax11, i2, 0, iArr3);
            int measuredWidth6 = this.mTextButton.getMeasuredWidth() + getHorizontalMargins(this.mTextButton) + 0;
            iMax10 = Math.max(iMax10, this.mTextButton.getMeasuredHeight() + getVerticalMargins(this.mTextButton));
            iCombineMeasuredStates6 = View.combineMeasuredStates(iCombineMeasuredStates6, ViewCompat.getMeasuredState(this.mTextButton));
            measuredWidth2 = measuredWidth6;
        } else {
            measuredWidth2 = 0;
        }
        boolean zIsSmallScreen = COUIResponsiveUtils.isSmallScreen(getContext(), View.MeasureSpec.getSize(i));
        if (shouldLayout(this.mMenuView)) {
            menuBuilder = (MenuBuilder) this.mMenuView.getMenu();
            changeToolbarPadding(menuBuilder, this.mNavButtonView, z2, i, false);
            measureChildConstrained(this.mMenuView, i, iMax11, i2, 0, this.mMaxButtonHeight);
            measuredWidth2 += this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            iMax10 = Math.max(iMax10, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            iCombineMeasuredStates6 = View.combineMeasuredStates(iCombineMeasuredStates6, ViewCompat.getMeasuredState(this.mMenuView));
        } else {
            menuBuilder = null;
        }
        if (measuredWidth2 > 0) {
            changeToolbarPadding(null, this.mNavButtonView, z2, i, true);
            if (!zIsSmallScreen) {
                measuredWidth2 += this.mGapBeforeMenuView;
            }
        }
        addCustomViewsWithGravity(this.mTempViews, GravityCompat.START);
        this.mHasCustomViewBeforeTitle = (this.mTempViews.isEmpty() || zIsSmallScreen) ? false : true;
        int size2 = this.mTempViews.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                z = true;
                break;
            }
            View view = this.mTempViews.get(i13);
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            if (layoutParams2.mViewType != 0 || layoutParams2.mTypeTextButton || layoutParams2.mTypeSegmentButton || isDummyView(view, layoutParams2) || !shouldLayout(view)) {
                i5 = i13;
                i6 = size2;
                if (isDummyView(view, layoutParams2)) {
                    z = true;
                    if (this.mTempViews.size() == 1) {
                        this.mHasCustomViewBeforeTitle = false;
                        break;
                    }
                }
                i13 = i5 + 1;
                size2 = i6;
            } else {
                i5 = i13;
                i6 = size2;
                iMax11 += measureChildCollapseMargins(view, i, iMax11 + measuredWidth2, i2, 0, iArr3);
                iMax10 = Math.max(iMax10, view.getMeasuredHeight() + getVerticalMargins(view));
                iCombineMeasuredStates6 = View.combineMeasuredStates(iCombineMeasuredStates6, ViewCompat.getMeasuredState(view));
            }
            i13 = i5 + 1;
            size2 = i6;
        }
        changeToolbarPadding(menuBuilder, this.mNavButtonView, z2, i, (this.mHasCustomViewBeforeTitle || measuredWidth2 > 0) ? z : false);
        int i14 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i15 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (!shouldLayout(this.mSegmentButton) || this.mIsTitleCenterStyle) {
            measuredWidth3 = 0;
        } else {
            if (shouldLayout(this.mTitleTextView)) {
                this.mTitleTextView.getLayoutParams().width = -2;
                this.mTitleTextView.setTextSize(0, this.mTitleTextSize);
                TextPaint paint = this.mTitleTextView.getPaint();
                CharSequence charSequence = this.mTitleText;
                iMeasureText = (int) paint.measureText(charSequence, 0, charSequence.length());
            } else {
                iMeasureText = 0;
            }
            int i16 = (size / 2) - iMax11;
            if (iMeasureText <= ((i16 - (this.mSegmentButtonMinWidth / 2)) - this.mSectionGap) - getPaddingStart()) {
                int paddingStart = (((i16 - iMeasureText) - this.mSectionGap) - getPaddingStart()) * 2;
                measureChildMaxWidthConstrained(this.mSegmentButton, i, iMax11, zIsSmallScreen ? Math.min(paddingStart, this.mSegmentButtonMaxWidth) : paddingStart, i2, this.mSegmentButtonHeight);
            } else {
                measureChildMaxWidthConstrained(this.mSegmentButton, i, iMax11, (((i16 - getPaddingStart()) - this.mSectionGap) / 2) * 2, i2, this.mSegmentButtonHeight);
            }
            measuredWidth3 = this.mSegmentButton.getMeasuredWidth() + getHorizontalMargins(this.mSegmentButton);
            iMax10 = Math.max(iMax10, this.mSegmentButton.getMeasuredHeight() + getVerticalMargins(this.mSegmentButton));
            iCombineMeasuredStates6 = View.combineMeasuredStates(iCombineMeasuredStates6, ViewCompat.getMeasuredState(this.mSegmentButton));
        }
        int iMax12 = iMax11 == 0 ? this.mSectionGap + measuredWidth2 : iMax11 + measuredWidth2 + (this.mSectionGap * 2);
        if (shouldLayout(this.mTitleTextView)) {
            this.mTitleTextView.getLayoutParams().width = -2;
            this.mTitleTextView.setTextSize(0, this.mTitleTextSize);
            TextPaint paint2 = this.mTitleTextView.getPaint();
            CharSequence charSequence2 = this.mTitleText;
            int iMin = Math.min((int) paint2.measureText(charSequence2, 0, charSequence2.length()), this.mTitleTextMinWidth) + ((this.mHasCustomViewBeforeTitle || shouldLayout(this.mNavButtonView)) ? this.mGapBetweenNavigationAndTitle : 0);
            int i17 = this.mSectionGap;
            i3 = iMin;
            iMax12 = Math.max((iMax11 + iMin + i17) * 2, (i17 + measuredWidth2) * 2);
        } else {
            i3 = 0;
        }
        addCustomCenterViews(this.mTempViews);
        int size3 = this.mTempViews.size();
        int iMax13 = iMax10;
        int iCombineMeasuredStates7 = iCombineMeasuredStates6;
        int i18 = 0;
        int iMeasureChildCollapseMargins = measuredWidth3;
        int i19 = iMax12;
        boolean z4 = z3;
        while (i18 < size3) {
            View view2 = this.mTempViews.get(i18);
            LayoutParams layoutParams3 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams3.mViewType != 0 || layoutParams3.mTypeSegmentButton || !shouldLayout(view2) || isDummyView(view2, layoutParams3)) {
                iCombineMeasuredStates7 = iCombineMeasuredStates7;
                iMax13 = iMax13;
            } else {
                iMeasureChildCollapseMargins += measureChildCollapseMargins(view2, i, i19, i2, 0, iArr3);
                i19 += iMeasureChildCollapseMargins;
                iMax13 = Math.max(iMax13, view2.getMeasuredHeight() + getVerticalMargins(view2));
                iCombineMeasuredStates7 = View.combineMeasuredStates(iCombineMeasuredStates7, ViewCompat.getMeasuredState(view2));
            }
            i18++;
            size3 = size3;
            z4 = z4;
        }
        int iCombineMeasuredStates8 = iCombineMeasuredStates7;
        ?? r25 = z4;
        int iMax14 = iMax13;
        int i20 = size / 2;
        int i21 = (iMeasureChildCollapseMargins / 2) + i20;
        int paddingStart2 = (this.mSectionGap + i21) - getPaddingStart();
        int paddingEnd = (i21 + this.mSectionGap) - getPaddingEnd();
        int contentInsetEnd2 = getContentInsetEnd();
        if (iMeasureChildCollapseMargins > 0) {
            if (!z2) {
                paddingStart2 = paddingEnd;
            }
            iMax2 = iMax11 + paddingStart2;
        } else {
            iMax2 = iMax11 + Math.max(contentInsetEnd2, measuredWidth2) + this.mSectionGap;
        }
        iArr3[r25] = Math.max(0, contentInsetEnd2 - measuredWidth2);
        if (shouldLayout(this.mExpandedActionView)) {
            iMax2 += measureChildCollapseMargins(this.mExpandedActionView, i, iMax2, i2, 0, iArr3);
            int iMax15 = Math.max(iMax14, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            iCombineMeasuredStates8 = View.combineMeasuredStates(iCombineMeasuredStates8, ViewCompat.getMeasuredState(this.mExpandedActionView));
            iMax14 = iMax15;
        }
        if (shouldLayout(this.mLogoView)) {
            iMax2 += measureChildCollapseMargins(this.mLogoView, i, iMax2, i2, 0, iArr3);
            iMax14 = Math.max(iMax14, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            iCombineMeasuredStates8 = View.combineMeasuredStates(iCombineMeasuredStates8, ViewCompat.getMeasuredState(this.mLogoView));
        }
        addCustomViewsWithGravity(this.mTempViews, GravityCompat.END);
        int size4 = this.mTempViews.size();
        int paddingEnd2 = iMeasureChildCollapseMargins > 0 ? ((i20 - (((this.mSectionGap * 2) + iMeasureChildCollapseMargins) / 2)) - getPaddingEnd()) - measuredWidth2 : (((size - iMax2) - i3) - getPaddingEnd()) - getPaddingStart();
        int iCombineMeasuredStates9 = iCombineMeasuredStates8;
        for (int i22 = 0; i22 < size4; i22++) {
            View view3 = this.mTempViews.get(i22);
            LayoutParams layoutParams4 = (LayoutParams) view3.getLayoutParams();
            if (layoutParams4.mViewType == 0 && !layoutParams4.mTypeSegmentButton && !layoutParams4.mTypeTextButton && shouldLayout(view3) && !isDummyView(view3, layoutParams4)) {
                int iMeasureChildCollapseMargins2 = measureChildCollapseMargins(view3, i, iMax2 + i3, paddingEnd2, i2, 0, iArr3);
                if (iMeasureChildCollapseMargins == 0) {
                    iMax2 += iMeasureChildCollapseMargins2;
                }
                iMax14 = Math.max(iMax14, view3.getMeasuredHeight() + getVerticalMargins(view3));
                iCombineMeasuredStates9 = View.combineMeasuredStates(iCombineMeasuredStates9, ViewCompat.getMeasuredState(view3));
            }
        }
        if (shouldLayout(this.mDummyView)) {
            measureChildCollapseMargins(this.mDummyView, i, iMax2, i2, i14, iArr3);
            iMax2 += this.mDummyView.getMeasuredWidth() + getHorizontalMargins(this.mDummyView);
        }
        if (shouldLayout(this.mTitleTextView)) {
            this.mTitleTextView.getLayoutParams().width = -1;
            i4 = 0;
            this.mTitleTextView.setTextSize(0, this.mTitleTextSize);
            measureChildCollapseMargins(this.mTitleTextView, i, iMax2 + i15 + ((this.mHasCustomViewBeforeTitle || shouldLayout(this.mNavButtonView)) ? this.mGapBetweenNavigationAndTitle : 0), i2, i14, iArr3);
            int measuredWidth7 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            iMax3 = measuredWidth7;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates9, ViewCompat.getMeasuredState(this.mTitleTextView));
            measuredHeight = measuredHeight3;
        } else {
            i4 = 0;
            iMax3 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates9;
            measuredHeight = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            this.mSubtitleTextView.getLayoutParams().width = -1;
            iMax3 = Math.max(iMax3, measureChildCollapseMargins(this.mSubtitleTextView, i, iMax2 + i15 + ((this.mHasCustomViewBeforeTitle || shouldLayout(this.mNavButtonView)) ? this.mGapBetweenNavigationAndTitle : i4), i2, measuredHeight + i14, iArr3));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, ViewCompat.getMeasuredState(this.mSubtitleTextView));
        }
        setMeasuredDimension(ViewCompat.resolveSizeAndState(Math.max(iMax2 + iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), shouldCollapse() ? i4 : ViewCompat.resolveSizeAndState(Math.max(Math.max(iMax14, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        COUIRtlSpacingHelper cOUIRtlSpacingHelper = this.mContentInsets;
        if (cOUIRtlSpacingHelper != null) {
            cOUIRtlSpacingHelper.setDirection(i == 1);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void refresh() {
        int i;
        int i2;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        setOverflowIcon(getResources().getDrawable(R$drawable.coui_toolbar_menu_icon_more, getContext().getTheme()));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionBar_homeAsUpIndicator);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        fj2 fj2Var = this.mMaskRippleDrawable;
        if (fj2Var != null) {
            fj2Var.h(getContext());
        }
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        if (cOUIActionMenuView instanceof COUIActionMenuView) {
            b bVar = cOUIActionMenuView.mOverflowPopup;
            if (bVar != null && bVar.isShowing()) {
                cOUIActionMenuView.mOverflowPopup.dismiss();
            }
            cOUIActionMenuView.mOverflowPopup = null;
        }
        if (this.mTitleTextView != null && this.mTitleTextAppearance != 0) {
            setTitleTextAppearance(getContext(), this.mTitleTextAppearance);
        }
        TextView textView = this.mTitleTextView;
        if (textView != null && (i2 = this.mTitleTextColor) != 0) {
            textView.setTextColor(i2);
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null && this.mSubtitleTextAppearance != 0) {
            textView2.setTextAppearance(getContext(), this.mSubtitleTextAppearance);
        }
        TextView textView3 = this.mSubtitleTextView;
        if (textView3 != null && (i = this.mSubtitleTextColor) != 0) {
            textView3.setTextColor(i);
        }
        if (this.mResId != 0) {
            getMenu().clear();
            inflateMenu(this.mResId);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setContentInsetsAbsolute(int i, int i2) {
        this.mContentInsets.setAbsolute(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setContentInsetsRelative(int i, int i2) {
        this.mContentInsets.setRelative(i, i2);
    }

    @Deprecated
    public void setEnableAddExtraWidth(boolean z) {
    }

    @Deprecated
    public void setIsFixTitleFontSize(boolean z) {
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        if (cOUIActionMenuView != null) {
            cOUIActionMenuView.setIsFixTitleFontSize(z);
        } else {
            Log.e(TAG, "setIsFixTitleFontSize when mMenuView is null");
        }
    }

    public void setIsInsideSideNavigationBar(boolean z) {
        if (this.mIsInsideSideNavigationBar != z) {
            this.mIsInsideSideNavigationBar = z;
            requestLayout();
        }
    }

    public void setIsTitleCenterStyle(boolean z) {
        ensureMenuView();
        this.mIsTitleCenterStyle = z;
        LayoutParams layoutParams = (LayoutParams) this.mMenuView.getLayoutParams();
        boolean z2 = this.mIsTitleCenterStyle;
        if (z2) {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        }
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAlignment(z2 ? 4 : 5);
        }
        this.mMenuView.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setLogo(int i) {
        setLogo(AppCompatResources.getDrawable(getContext(), i));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public void setMenuViewColor(@ColorInt int i) {
        Drawable overflowIcon;
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        if (cOUIActionMenuView == null || (overflowIcon = cOUIActionMenuView.getOverflowIcon()) == null || (overflowIcon instanceof AnimatedStateListDrawableCompat)) {
            return;
        }
        DrawableCompat.setTint(overflowIcon, i);
        this.mMenuView.setOverflowIcon(overflowIcon);
    }

    public void setMinTitleTextSize(float f) {
        float f2 = this.mTextMaxSize;
        if (f > f2) {
            f = f2;
        }
        this.mTextMinSize = f;
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mMinHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(int i) {
        setNavigationIcon(AppCompatResources.getDrawable(getContext(), i));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setOnMenuItemClickListener(Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setOverflowIcon(@Nullable Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupMenuRuleEnabled(boolean z) {
        this.mPopupRuleEnable = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPopupWindowOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        if (cOUIActionMenuView instanceof COUIActionMenuView) {
            cOUIActionMenuView.setPopupWindowOnDismissListener(onDismissListener);
        }
    }

    public void setRedDot(int i, int i2) {
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        if (cOUIActionMenuView == null) {
            Log.e(TAG, "The COUIActionMenuView is null");
        } else {
            cOUIActionMenuView.setRedDot(i, i2);
        }
    }

    public void setSearchView(View view) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams() == null ? new LayoutParams(new LayoutParams(-1, this.mToolbarHeight)) : new LayoutParams(view.getLayoutParams());
        } else {
            layoutParams = null;
        }
        setSearchView(view, layoutParams);
    }

    public void setSegmentButtons(View view) {
        View view2 = this.mSegmentButton;
        if (view2 != null) {
            removeView(view2);
        }
        if (view != null) {
            setSegmentButtons(view, view.getLayoutParams() == null ? new LayoutParams(new LayoutParams(-2, this.mSegmentButtonHeight)) : new LayoutParams(view.getLayoutParams()));
        } else {
            this.mSegmentButton = null;
        }
    }

    @Deprecated
    public void setSubMenuList(ArrayList<qne> arrayList, int i, nm2 nm2Var) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitleTextColor(int i) {
        this.mSubtitleTextColor = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTextButton(View view) {
        View view2 = this.mTextButton;
        if (view2 != null) {
            removeView(view2);
        }
        if (view != null) {
            setTextButton(view, view.getLayoutParams() == null ? new LayoutParams(new LayoutParams(-2, -2)) : new LayoutParams(view.getLayoutParams()));
        } else {
            this.mTextButton = null;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
            if (this.mTitleType == 1) {
                this.mTitleTextView.setTextSize(0, gg2.g(this.mTitleTextView.getTextSize(), getContext().getResources().getConfiguration().fontScale, 2));
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(this.mTitleTextAppearance, new int[]{android.R.attr.minHeight});
            if (typedArrayObtainStyledAttributes != null) {
                this.mTitleTextView.setMinHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
                typedArrayObtainStyledAttributes.recycle();
            }
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(this.mTitleTextAppearance, new int[]{android.R.attr.lineSpacingMultiplier});
            if (typedArrayObtainStyledAttributes2 != null) {
                float f = typedArrayObtainStyledAttributes2.getFloat(0, 1.4f);
                TextView textView2 = this.mTitleTextView;
                textView2.setLineSpacing(textView2.getLineSpacingExtra(), f);
                typedArrayObtainStyledAttributes2.recycle();
            }
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(this.mTitleTextAppearance, new int[]{android.R.attr.textAlignment});
            if (typedArrayObtainStyledAttributes3 != null) {
                int integer = typedArrayObtainStyledAttributes3.getInteger(0, 5);
                if (integer >= 0) {
                    this.mTitleTextView.setTextAlignment(integer);
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(this.mTitleTextAppearance, new int[]{android.R.attr.maxLines});
            if (typedArrayObtainStyledAttributes4 != null) {
                int integer2 = typedArrayObtainStyledAttributes4.getInteger(0, 1);
                if (integer2 >= 1) {
                    this.mTitleTextView.setSingleLine(false);
                    this.mTitleTextView.setMaxLines(integer2);
                }
                typedArrayObtainStyledAttributes4.recycle();
            }
            this.mTextMaxSize = this.mTitleTextView.getTextSize();
            this.mTitleTextSize = this.mTitleTextView.getTextSize();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(int i) {
        this.mTitleTextColor = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitleTextSize(float f) {
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextSize(f);
            this.mTitleTextSize = TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
        }
    }

    public void setTitleTextViewTypeface(Typeface typeface) {
        ensureTitleTextView();
        this.mTitleTextView.setTypeface(typeface);
    }

    public void setUseResponsivePadding(boolean z) {
        this.mUseResponsivePadding = z;
        requestLayout();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public boolean showOverflowMenu() {
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        return (!(cOUIActionMenuView instanceof COUIActionMenuView) || cOUIActionMenuView.getWindowToken() == null) ? super.showOverflowMenu() : this.mMenuView.showOverflowMenu();
    }

    public void tintNavigationIconDrawable(@ColorInt int i) {
        Drawable drawable;
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton == null || (drawable = imageButton.getDrawable()) == null || (drawable instanceof AnimatedStateListDrawableCompat)) {
            return;
        }
        DrawableCompat.setTint(drawable, i);
    }

    public COUIToolbar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        boolean z2 = true;
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        if (marginLayoutParams instanceof LayoutParams) {
            LayoutParams layoutParams = (LayoutParams) marginLayoutParams;
            z = layoutParams.mTypeSearch && this.mHasSearchViewFlag;
            if (!layoutParams.mTypeTitle || !this.mIsTitleCenterStyle) {
                z2 = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        int childMeasureSpec = (z || z2) ? ViewGroup.getChildMeasureSpec(i, iMax, marginLayoutParams.width) : ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        view.measure(childMeasureSpec, childMeasureSpec2);
        if (!z) {
            if (view.getMeasuredWidth() > i3) {
                view.measure(View.MeasureSpec.makeMeasureSpec(Math.max(i3, 0), 1073741824), childMeasureSpec2);
            }
            return view.getMeasuredWidth() + iMax;
        }
        COUIActionMenuView cOUIActionMenuView = this.mMenuView;
        if (cOUIActionMenuView != null && cOUIActionMenuView.getVisibility() != 8) {
            view.measure(ViewGroup.getChildMeasureSpec(i, iMax, ((view.getMeasuredWidth() - this.mMenuView.getMeasuredWidth()) - (this.mMenuView.getMeasuredWidth() != 0 ? getPaddingEnd() : 0)) - this.mGapBetweenSearchViewAndMenu), childMeasureSpec2);
        }
        return iMax;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (this.mLogoView.getParent() == null) {
                addSystemView(this.mLogoView);
                updateChildVisibilityForExpandedActionView(this.mLogoView);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && imageView.getParent() != null) {
                removeView(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (this.mNavButtonView.getParent() == null) {
                addSystemView(this.mNavButtonView);
                updateChildVisibilityForExpandedActionView(this.mNavButtonView);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && imageButton.getParent() != null) {
                removeView(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && textView.getParent() != null) {
                removeView(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                this.mSubtitleTextView = new TextView(context);
                LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
                layoutParamsGenerateDefaultLayoutParams.mTypeTitle = true;
                this.mSubtitleTextView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                this.mSubtitleTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                int i2 = this.mSubtitleTextColor;
                if (i2 != 0) {
                    this.mSubtitleTextView.setTextColor(i2);
                }
            }
            if (this.mSubtitleTextView.getParent() == null) {
                addSystemView(this.mSubtitleTextView);
                updateChildVisibilityForExpandedActionView(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setTextAlignment(5);
            this.mSubtitleTextView.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && textView.getParent() != null) {
                removeView(this.mTitleTextView);
            }
        } else {
            ensureTitleTextView();
            if (this.mTitleTextView.getParent() == null) {
                addSystemView(this.mTitleTextView);
                updateChildVisibilityForExpandedActionView(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
            this.mTitleTextSize = this.mTitleTextView.getTextSize();
        }
        this.mTitleText = charSequence;
    }

    public COUIToolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_COUI_Toolbar);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public COUIToolbar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        int i3;
        super(context, attributeSet, i);
        COUIRtlSpacingHelper cOUIRtlSpacingHelper = new COUIRtlSpacingHelper();
        this.mContentInsets = cOUIRtlSpacingHelper;
        this.mTempViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new ActionMenuView.OnMenuItemClickListener() { // from class: com.coui.appcompat.toolbar.COUIToolbar.1
            @Override // androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (COUIToolbar.this.mOnMenuItemClickListener != null) {
                    return COUIToolbar.this.mOnMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.mSearchCollapsingMargins = new int[2];
        this.mShowOverflowMenuRunnable = new Runnable() { // from class: com.coui.appcompat.toolbar.COUIToolbar.2
            @Override // java.lang.Runnable
            public void run() {
                COUIToolbar.this.showOverflowMenu();
            }
        };
        this.mDisplayFrame = null;
        this.mWindowFrame = null;
        this.mHasCustomViewBeforeTitle = false;
        this.mGravity = 8388627;
        this.mIsTitleCenterStyle = false;
        this.mTitlePosition = new int[2];
        this.mTitleTextSize = 0.0f;
        this.mHasSearchViewFlag = false;
        this.mIsInsideSideNavigationBar = false;
        this.mPopupRuleEnable = true;
        this.mUseResponsivePadding = true;
        this.mDummyView = null;
        setClipToPadding(false);
        setClipChildren(false);
        if (attributeSet != null) {
            int styleAttribute = attributeSet.getStyleAttribute();
            this.mStyle = styleAttribute;
            if (styleAttribute == 0) {
                this.mStyle = i;
            }
        } else {
            this.mStyle = 0;
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, R$styleable.COUIToolbar, R$attr.couiToolbarStyle, i2);
        int i4 = R$styleable.COUIToolbar_titleType;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i4)) {
            this.mTitleType = tintTypedArrayObtainStyledAttributes.getInt(i4, 0);
        }
        this.mTitleTextAppearance = tintTypedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIToolbar_supportTitleTextAppearance, 0);
        this.mSubtitleTextAppearance = tintTypedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIToolbar_supportSubtitleTextAppearance, 0);
        this.mGravity = tintTypedArrayObtainStyledAttributes.getInteger(R$styleable.COUIToolbar_android_gravity, this.mGravity);
        this.mButtonGravity = tintTypedArrayObtainStyledAttributes.getInteger(R$styleable.COUIToolbar_supportButtonGravity, 48);
        this.mTitleMarginStart = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIToolbar_supportTitleMargins, 0);
        this.mIsTiny = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIToolbar_supportIsTiny, false);
        this.mIsInsidePanel = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIToolbar_supportPanelStyle, false);
        int i5 = this.mTitleMarginStart;
        this.mTitleMarginEnd = i5;
        this.mTitleMarginTop = i5;
        this.mTitleMarginBottom = i5;
        int dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIToolbar_supportTitleMarginStart, getContext().getResources().getDimensionPixelSize(R$dimen.coui_toolbar_support_margin_start));
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset;
        }
        int dimensionPixelOffset2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIToolbar_supportTitleMarginEnd, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIToolbar_supportTitleMarginTop, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIToolbar_supportTitleMarginBottom, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset4;
        }
        this.mTitlePaddingTop = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIToolbar_supportTitlePaddingTop, 0);
        this.mTitlePaddingBottom = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIToolbar_supportTitlePaddingBottom, 0);
        this.mMaxButtonHeight = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIToolbar_supportMaxButtonHeight, -1);
        int dimensionPixelOffset5 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIToolbar_supportContentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset6 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIToolbar_supportContentInsetEnd, Integer.MIN_VALUE);
        cOUIRtlSpacingHelper.setAbsolute(tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIToolbar_supportContentInsetLeft, 0), tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIToolbar_supportContentInsetRight, 0));
        if (dimensionPixelOffset5 != Integer.MIN_VALUE || dimensionPixelOffset6 != Integer.MIN_VALUE) {
            cOUIRtlSpacingHelper.setRelative(dimensionPixelOffset5, dimensionPixelOffset6);
        }
        this.mCollapseIcon = tintTypedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIToolbar_supportCollapseIcon);
        this.mCollapseDescription = tintTypedArrayObtainStyledAttributes.getText(R$styleable.COUIToolbar_supportCollapseContentDescription);
        CharSequence text = tintTypedArrayObtainStyledAttributes.getText(R$styleable.COUIToolbar_supportTitle);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = tintTypedArrayObtainStyledAttributes.getText(R$styleable.COUIToolbar_supportSubtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(tintTypedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIToolbar_supportPopupTheme, 0));
        Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIToolbar_supportNavigationIcon);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        CharSequence text3 = tintTypedArrayObtainStyledAttributes.getText(R$styleable.COUIToolbar_supportNavigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        this.mMinHeight = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Toolbar_android_minHeight, 0);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i6 = R$styleable.COUIToolbar_minTitleTextSize;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i6)) {
            this.mTextMinSize = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(i6, (int) (displayMetrics.scaledDensity * 16.0f));
        } else {
            this.mTextMinSize = displayMetrics.scaledDensity * 16.0f;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(this.mTitleTextAppearance, new int[]{android.R.attr.textSize});
        if (typedArrayObtainStyledAttributes != null) {
            this.mTextMaxSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) (displayMetrics.scaledDensity * 24.0f));
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.mTitleType == 1) {
            this.mTextMaxSize = gg2.g(this.mTextMaxSize, getResources().getConfiguration().fontScale, 2);
            this.mTextMinSize = gg2.g(this.mTextMinSize, getResources().getConfiguration().fontScale, 2);
        }
        this.mSegmentButtonMaxWidth = getContext().getResources().getDimensionPixelSize(R$dimen.coui_toolbar_segment_button_max_width);
        this.mSegmentButtonMinWidth = getContext().getResources().getDimensionPixelSize(R$dimen.coui_toolbar_segment_button_min_width);
        this.mSectionGapMediumLarge = getContext().getResources().getDimensionPixelSize(R$dimen.coui_toolbar_section_gap);
        this.mSectionGapSmall = getContext().getResources().getDimensionPixelSize(R$dimen.coui_toolbar_section_gap_small);
        this.mTitleTextMinWidth = getContext().getResources().getDimensionPixelSize(R$dimen.coui_toolbar_title_text_min_width);
        this.mToolbarHeight = getContext().getResources().getDimensionPixelSize(R$dimen.toolbar_min_height);
        this.mSegmentButtonHeight = getContext().getResources().getDimensionPixelSize(R$dimen.segment_button_height);
        this.mToolbarNormalPaddingLeft = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_menu_padding_left);
        this.mGapBeforeMenuView = getContext().getResources().getDimensionPixelSize(R$dimen.coui_toolbar_gap_before_menu);
        if (this.mIsTiny) {
            this.mToolbarNormalPaddingRight = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_menu_padding_tiny_right);
            changeBackViewParams();
        } else {
            this.mToolbarNormalPaddingRight = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_menu_padding_right);
        }
        this.mToolbarCenterTitlePaddingLeft = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_center_title_padding_left);
        this.mToolbarCenterTitlePaddingRight = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_center_title_padding_right);
        this.mToolbarOverFlowPadding = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_overflow_menu_padding);
        this.mTitleMinWidth = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_toolbar_title_min_width);
        this.mGapBetweenSearchViewAndMenu = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_toolbar_gap_between_search_and_menu);
        this.mGapBetweenNavigationAndTitle = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_toolbar_gap_between_navigation_and_title);
        int i7 = R$styleable.COUIToolbar_titleCenter;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i7)) {
            this.mIsTitleCenterStyle = tintTypedArrayObtainStyledAttributes.getBoolean(i7, false);
        }
        TextView textView = this.mSubtitleTextView;
        if (textView != null && (i3 = this.mSubtitleTextAppearance) != 0) {
            textView.setTextAppearance(context, i3);
        }
        setWillNotDraw(false);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends Toolbar.LayoutParams {
        static final int CUSTOM = 0;
        static final int EXPANDED = 2;
        static final int SYSTEM = 1;
        boolean mTypeSearch;
        boolean mTypeSegmentButton;
        boolean mTypeTextButton;
        boolean mTypeTitle;
        int mViewType;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mViewType = 0;
            this.mTypeSearch = false;
            this.mTypeTitle = false;
            this.mTypeSegmentButton = false;
            this.mTypeTextButton = false;
        }

        public void copyMarginsFromCompat(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mViewType = 0;
            this.mTypeSearch = false;
            this.mTypeTitle = false;
            this.mTypeSegmentButton = false;
            this.mTypeTextButton = false;
            this.gravity = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.mViewType = 0;
            this.mTypeSearch = false;
            this.mTypeTitle = false;
            this.mTypeSegmentButton = false;
            this.mTypeTextButton = false;
            this.gravity = i3;
        }

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((Toolbar.LayoutParams) layoutParams);
            this.mViewType = 0;
            this.mTypeSearch = false;
            this.mTypeTitle = false;
            this.mTypeSegmentButton = false;
            this.mTypeTextButton = false;
            this.mViewType = layoutParams.mViewType;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
            this.mTypeSearch = false;
            this.mTypeTitle = false;
            this.mTypeSegmentButton = false;
            this.mTypeTextButton = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mViewType = 0;
            this.mTypeSearch = false;
            this.mTypeTitle = false;
            this.mTypeSegmentButton = false;
            this.mTypeTextButton = false;
            copyMarginsFromCompat(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
            this.mTypeSearch = false;
            this.mTypeTitle = false;
            this.mTypeSegmentButton = false;
            this.mTypeTextButton = false;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public void setSearchView(View view, LayoutParams layoutParams) {
        if (view == null) {
            this.mHasSearchViewFlag = false;
            return;
        }
        this.mHasSearchViewFlag = true;
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.mTypeSearch = true;
        layoutParams2.mViewType = 0;
        addView(view, 0, layoutParams2);
    }

    private void setSegmentButtons(View view, LayoutParams layoutParams) {
        this.mSegmentButton = view;
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.mViewType = 0;
        layoutParams2.mTypeSegmentButton = true;
        layoutParams2.gravity = 1;
        addView(view, 0, layoutParams2);
    }

    private void setTextButton(View view, LayoutParams layoutParams) {
        this.mTextButton = view;
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.mViewType = 0;
        layoutParams2.mTypeTextButton = true;
        layoutParams2.gravity = GravityCompat.END;
        addView(view, layoutParams2);
    }
}

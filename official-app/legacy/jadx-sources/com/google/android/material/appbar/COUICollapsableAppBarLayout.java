package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.COUIRecyclerView;
import com.coui.appcompat.grid.COUIResponsiveUtils;
import com.oplus.aiunit.vision.ifk;
import com.support.toolbar.R$dimen;
import com.support.toolbar.R$id;
import com.support.toolbar.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes14.dex */
public class COUICollapsableAppBarLayout extends COUIDividerAppBarLayout {
    private static boolean DEBUG = false;
    public static final int DEFAULT_SCROLL_FLAG = 19;
    public static final int MODE_COLLAPSABLE = 0;
    public static final int MODE_FIXED_COLLAPSED = 1;
    public static final int MODE_FIXED_EXPANDED = 2;
    private static final String MODE_STATE_KEY = "MODE_STATE_KEY";
    private static final String OFFSET_STATE_KEY = "OFFSET_STATE_KEY";
    private static final String SUPER_STATE_KEY = "SUPER_STATE_KEY";
    private static final String TAG = "COUICollapsableAppBarLayout";
    private static final String TITLE_FRACTION_STATE_KEY = "TITLE_FRACTION_STATE_KEY";
    private boolean mAutoExpand;
    private int mCollapsingToolbarHeight;
    private int mEndPaddingBottom;
    private int mMode;
    private boolean mNeedUpdateModeAfterOffsetChanged;
    private int mOffset;
    private int mStartPaddingBottom;
    private boolean mSubtitleHideEnable;
    private int mSubtitleViewHeight;
    private boolean mUpdateOffset;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public static class ScrollBehavior extends COUIDividerAppBarLayout.DividerBehavior {
        private int mLastStartedType;
        private boolean mShouldSnapToBottom;

        private ScrollBehavior() {
        }

        public boolean contentInScreen(View view) {
            return (view.canScrollVertically(1) || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.HeaderBehavior
        public int getTopBottomOffsetForScrollingSibling() {
            if (!this.mShouldSnapToBottom) {
                return super.getTopBottomOffsetForScrollingSibling();
            }
            this.mShouldSnapToBottom = false;
            return 0;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.HeaderBehavior
        public boolean canDragView(AppBarLayout appBarLayout) {
            return super.canDragView(appBarLayout) && (!(appBarLayout instanceof COUICollapsableAppBarLayout) || ((COUICollapsableAppBarLayout) appBarLayout).getMode() == 0);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            if ((appBarLayout instanceof COUICollapsableAppBarLayout) && ((COUICollapsableAppBarLayout) appBarLayout).getUpdateOffset()) {
                setHeaderTopBottomOffset(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                ((COUICollapsableAppBarLayout) appBarLayout).setUpdateOffset(false);
            }
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            if ((view instanceof COUIRecyclerView) && view.getScrollY() < 0) {
                i2 = 0;
            }
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.COUIDividerAppBarLayout.DividerBehavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, ((appBarLayout instanceof COUICollapsableAppBarLayout) && ((COUICollapsableAppBarLayout) appBarLayout).mMode == 1) ? 0 : i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.COUIDividerAppBarLayout.DividerBehavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i, int i2) {
            this.mLastStartedType = i2;
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.COUIDividerAppBarLayout.DividerBehavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i) {
            if (appBarLayout.getChildCount() > 0) {
                if (appBarLayout.getChildAt(0) instanceof COUICollapsingToolbarLayout) {
                    int scrollFlags = ((AppBarLayout.LayoutParams) appBarLayout.getChildAt(0).getLayoutParams()).getScrollFlags() & 17;
                    boolean z = scrollFlags == 17 && contentInScreen(view) && ((COUICollapsableAppBarLayout) appBarLayout).mCollapsable;
                    this.mShouldSnapToBottom = z;
                    this.mShouldSnapToBottom = z && ((COUICollapsableAppBarLayout) appBarLayout).mAutoExpand;
                    if (COUICollapsableAppBarLayout.DEBUG) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("((mLastStartedType == ViewCompat.TYPE_TOUCH) || (type == ViewCompat.TYPE_NON_TOUCH)) = ");
                        sb.append(this.mLastStartedType == 0 || i == 1);
                        sb.append("\n((snapFlag & LayoutParams.FLAG_SNAP) == LayoutParams.FLAG_SNAP) = ");
                        sb.append(scrollFlags == 17);
                        sb.append("\n(contentInScreen(target)) = ");
                        sb.append(contentInScreen(view));
                        sb.append("\n(((COUICollapsableAppBarLayout) abl).mCollapsable = ");
                        sb.append(((COUICollapsableAppBarLayout) appBarLayout).mCollapsable);
                        Log.d(COUICollapsableAppBarLayout.TAG, sb.toString());
                    }
                }
            }
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }
    }

    public COUICollapsableAppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void adjustPaddingBottom(int i, boolean z) {
        float totalScrollRange = getTotalScrollRange();
        if (z || !(totalScrollRange == 0.0f || this.mStartPaddingBottom == this.mEndPaddingBottom)) {
            float fAbs = Math.abs(i) / totalScrollRange;
            int i2 = this.mStartPaddingBottom;
            translateDivider(-(i2 + ((int) ((this.mEndPaddingBottom - i2) * fAbs))));
        }
    }

    private void adjustSubtitleIfNeed(int i) {
        View viewFindSubtitleContentView = findSubtitleContentView();
        int dimensionPixelOffset = 0;
        boolean z = viewFindSubtitleContentView != null && viewFindSubtitleContentView.getVisibility() == 0;
        if ((findCollapsingToolbarLayout() != null) && z) {
            float fAbs = Math.abs(i) / getTotalScrollRange();
            float f = this.mSubtitleHideEnable ? 1.0f - fAbs : 1.0f;
            ViewGroup.LayoutParams layoutParams = viewFindSubtitleContentView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (COUIResponsiveUtils.isSmallScreen(getContext(), getMeasuredWidth())) {
                    dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_padding_left_compat);
                } else if (COUIResponsiveUtils.isMediumScreen(getContext(), getMeasuredWidth(), ifk.j(getContext()))) {
                    dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_padding_left_medium);
                } else if (COUIResponsiveUtils.isLargeScreen(getContext(), getMeasuredWidth(), ifk.j(getContext()))) {
                    dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.toolbar_normal_padding_left_expanded);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.getMarginStart() != dimensionPixelOffset) {
                    marginLayoutParams.setMarginStart(dimensionPixelOffset);
                    viewFindSubtitleContentView.setLayoutParams(layoutParams);
                }
            }
            if (Float.isNaN(fAbs)) {
                return;
            }
            viewFindSubtitleContentView.setTranslationY((this.mEndPaddingBottom - this.mStartPaddingBottom) * (1.0f - fAbs));
            viewFindSubtitleContentView.setAlpha(f);
        }
    }

    private View findCollapsingToolbarLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof CollapsingToolbarLayout) {
                return childAt;
            }
        }
        return null;
    }

    private float getExpansionFraction() {
        View viewFindCollapsingToolbarLayout = findCollapsingToolbarLayout();
        if (viewFindCollapsingToolbarLayout instanceof COUICollapsingToolbarLayout) {
            return ((COUICollapsingToolbarLayout) viewFindCollapsingToolbarLayout).collapsingTextHelper.getExpansionFraction();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getUpdateOffset() {
        return this.mUpdateOffset;
    }

    private void init(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.COUICollapsableAppBarLayout);
        this.mMode = typedArrayObtainStyledAttributes.getInt(R$styleable.COUICollapsableAppBarLayout_mode, 0);
        this.mSubtitleHideEnable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICollapsableAppBarLayout_subtitleHideEnable, true);
        this.mStartPaddingBottom = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUICollapsableAppBarLayout_startPaddingBottom, getContext().getResources().getDimensionPixelOffset(R$dimen.coui_appbar_start_padding_bottom));
        this.mEndPaddingBottom = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUICollapsableAppBarLayout_endPaddingBottom, getContext().getResources().getDimensionPixelOffset(R$dimen.coui_appbar_end_padding_bottom));
        if (this.mMode == 0) {
            this.mCollapsable = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean isCollapsed() {
        View viewFindCollapsingToolbarLayout = findCollapsingToolbarLayout();
        if (viewFindCollapsingToolbarLayout instanceof COUICollapsingToolbarLayout) {
            return ((COUICollapsingToolbarLayout) viewFindCollapsingToolbarLayout).isCollapsed();
        }
        return false;
    }

    private boolean isExpanded() {
        View viewFindCollapsingToolbarLayout = findCollapsingToolbarLayout();
        if (viewFindCollapsingToolbarLayout instanceof COUICollapsingToolbarLayout) {
            return ((COUICollapsingToolbarLayout) viewFindCollapsingToolbarLayout).isExpanded();
        }
        return false;
    }

    private void setScrollFlags(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.setScrollFlags(i);
            childAt.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateOffset(boolean z) {
        this.mUpdateOffset = z;
    }

    private void updateIconViewLocationIfNeed(float f) {
        View viewFindCollapsingToolbarLayout = findCollapsingToolbarLayout();
        if (viewFindCollapsingToolbarLayout instanceof COUICollapsingToolbarLayout) {
            COUICollapsingToolbarLayout cOUICollapsingToolbarLayout = (COUICollapsingToolbarLayout) viewFindCollapsingToolbarLayout;
            cOUICollapsingToolbarLayout.collapsingTextHelper.setExpansionFraction(f);
            cOUICollapsingToolbarLayout.updateIconViewLocationIfNeed();
        }
    }

    public void enableAutoExpand(boolean z) {
        this.mAutoExpand = z;
    }

    public View findSubtitleContentView() {
        return findViewById(R$id.coui_appbar_subtitle_content);
    }

    @Override // com.google.android.material.appbar.COUIDividerAppBarLayout, com.google.android.material.appbar.AppBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new ScrollBehavior();
    }

    @Override // com.google.android.material.appbar.COUIDividerAppBarLayout
    public int getDividerScrollRange() {
        View viewFindCollapsingToolbarLayout = findCollapsingToolbarLayout();
        if (viewFindCollapsingToolbarLayout != null) {
            int i = this.mMode;
            if (i == 0) {
                return getTotalScrollRange();
            }
            if (i == 1) {
                return viewFindCollapsingToolbarLayout.getMinimumHeight();
            }
        }
        return getMeasuredHeight();
    }

    public int getEndPaddingBottom() {
        return this.mEndPaddingBottom;
    }

    public int getMode() {
        return this.mMode;
    }

    public int getStartPaddingBottom() {
        return this.mStartPaddingBottom;
    }

    public boolean isSubtitleHideEnable() {
        return this.mSubtitleHideEnable;
    }

    @Override // com.google.android.material.appbar.COUIDividerAppBarLayout, com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMode(this.mMode);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(new Runnable() { // from class: com.oplus.aiunit.vision.ih2
            @Override // java.lang.Runnable
            public final void run() {
                this.i.updateSubtitle();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (findSubtitleContentView() != null) {
            findSubtitleContentView().setTranslationY(-this.mStartPaddingBottom);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        View viewFindSubtitleContentView = findSubtitleContentView();
        View viewFindCollapsingToolbarLayout = findCollapsingToolbarLayout();
        boolean z = true;
        setUpdateOffset(this.mSubtitleHideEnable && isCollapsed());
        boolean z2 = viewFindSubtitleContentView != null && viewFindSubtitleContentView.getVisibility() == 0;
        if (viewFindCollapsingToolbarLayout != null) {
            ViewGroup.LayoutParams layoutParams = viewFindCollapsingToolbarLayout.getLayoutParams();
            if (this.mCollapsingToolbarHeight == 0) {
                this.mCollapsingToolbarHeight = layoutParams.height;
            }
            int i3 = this.mCollapsingToolbarHeight;
            if (i3 != 0) {
                if (z2) {
                    viewFindSubtitleContentView.measure(i, i2);
                    ViewGroup.LayoutParams layoutParams2 = viewFindSubtitleContentView.getLayoutParams();
                    int i4 = this.mSubtitleViewHeight;
                    boolean z3 = (i4 == 0 || i4 == viewFindSubtitleContentView.getMeasuredHeight()) ? false : true;
                    if (!this.mUpdateOffset && (!z3 || !isCollapsed())) {
                        z = false;
                    }
                    setUpdateOffset(z);
                    if (layoutParams.height == this.mCollapsingToolbarHeight || z3) {
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            int measuredHeight = viewFindSubtitleContentView.getMeasuredHeight();
                            this.mSubtitleViewHeight = measuredHeight;
                            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = -measuredHeight;
                            viewFindSubtitleContentView.setLayoutParams(layoutParams2);
                        }
                        layoutParams.height = this.mCollapsingToolbarHeight + this.mSubtitleViewHeight;
                        viewFindCollapsingToolbarLayout.setLayoutParams(layoutParams);
                    }
                } else {
                    layoutParams.height = i3;
                    viewFindCollapsingToolbarLayout.setLayoutParams(layoutParams);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout
    public void onOffsetChanged(int i) {
        super.onOffsetChanged(i);
        if (i == this.mOffset) {
            return;
        }
        if (this.mMode == 0) {
            this.mScrollDyByOffset = Math.max(0, -i);
        }
        this.mOffset = i;
        onDividerChanged();
        adjustPaddingBottom(i, false);
        adjustSubtitleIfNeed(i);
        View viewFindCollapsingToolbarLayout = findCollapsingToolbarLayout();
        if (viewFindCollapsingToolbarLayout instanceof COUICollapsingToolbarLayout) {
            ((COUICollapsingToolbarLayout) viewFindCollapsingToolbarLayout).updateIconViewLocationIfNeed();
            viewFindCollapsingToolbarLayout.invalidate();
        }
        if (this.mNeedUpdateModeAfterOffsetChanged) {
            int i2 = this.mMode;
            if (i2 == 0) {
                this.mNeedUpdateModeAfterOffsetChanged = false;
            } else if (i2 == 1 && this.mOffset == (-getDividerScrollRange())) {
                updateIconViewLocationIfNeed(1.0f);
                this.mNeedUpdateModeAfterOffsetChanged = false;
            } else if (this.mMode == 2 && this.mOffset == 0) {
                setScrollFlags(0);
                updateIconViewLocationIfNeed(0.0f);
                this.mNeedUpdateModeAfterOffsetChanged = false;
            }
        }
        if (this.mTargetViewState == 2 && this.mOffset == (-getDividerScrollRange()) && !this.mTargetView.canScrollVertically(1) && !this.mTargetView.canScrollVertically(-1) && this.mMode == 0) {
            setExpanded(true);
        }
    }

    @Override // com.google.android.material.appbar.COUIDividerAppBarLayout, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.mOffset = bundle.getInt(OFFSET_STATE_KEY);
            this.mMode = bundle.getInt(MODE_STATE_KEY);
            updateIconViewLocationIfNeed(bundle.getFloat(TITLE_FRACTION_STATE_KEY, 0.0f));
            parcelable = bundle.getParcelable(SUPER_STATE_KEY);
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.google.android.material.appbar.COUIDividerAppBarLayout, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(SUPER_STATE_KEY, super.onSaveInstanceState());
        bundle.putInt(OFFSET_STATE_KEY, this.mOffset);
        bundle.putInt(MODE_STATE_KEY, this.mMode);
        bundle.putFloat(TITLE_FRACTION_STATE_KEY, getExpansionFraction());
        return bundle;
    }

    @Override // com.google.android.material.appbar.COUIDividerAppBarLayout
    public boolean refreshAppBar(View view) {
        boolean z;
        boolean zRefreshAppBar = super.refreshAppBar(view);
        if (!view.canScrollVertically(1) && !view.canScrollVertically(-1) && this.mMode == 0 && isCollapsed() && this.mTargetViewState == 2) {
            setExpanded(true);
            z = true;
        } else {
            z = false;
        }
        return zRefreshAppBar || z;
    }

    @Deprecated
    public void refreshExpand(View view) {
        if (view.canScrollVertically(1) || view.canScrollVertically(-1) || this.mMode != 0 || !isCollapsed()) {
            return;
        }
        setExpanded(true);
    }

    @Override // com.google.android.material.appbar.COUIDividerAppBarLayout
    public void reset() {
        super.reset();
        this.mCollapsable = true;
        setMode(0);
        setExpanded(true);
    }

    @Override // com.google.android.material.appbar.COUIDividerAppBarLayout
    public void setDebug(boolean z) {
        super.setDebug(z);
        DEBUG = z;
    }

    public void setEndPaddingBottom(int i) {
        this.mEndPaddingBottom = i;
        adjustPaddingBottom(this.mOffset, true);
    }

    public void setMode(int i) {
        if (this.mMode == i) {
            return;
        }
        if (i == 0) {
            this.mCollapsable = true;
            setScrollFlags(19);
            if (this.mMode == 1) {
                if (this.mScrollDyByScroll > 0) {
                    this.mScrollDyByOffset -= this.mOffset;
                    onDividerChanged();
                } else {
                    setExpanded(true);
                }
            }
            if (this.mMode == 2 && this.mScrollDyByScroll > 0) {
                this.mScrollDyByOffset -= this.mOffset;
                setExpanded(false);
            }
        } else if (i == 1) {
            this.mCollapsable = false;
            setExpanded(false);
            setScrollFlags(19);
            this.mScrollDyByOffset = 0;
            if (isCollapsed()) {
                updateIconViewLocationIfNeed(1.0f);
            } else {
                this.mNeedUpdateModeAfterOffsetChanged = true;
            }
            onDividerChanged();
        } else if (i == 2) {
            this.mCollapsable = false;
            setExpanded(true);
            this.mScrollDyByOffset = 0;
            if (isExpanded()) {
                setScrollFlags(0);
                updateIconViewLocationIfNeed(0.0f);
            } else {
                this.mNeedUpdateModeAfterOffsetChanged = true;
            }
            onDividerChanged();
        }
        this.mMode = i;
    }

    public void setStartPaddingBottom(int i) {
        this.mStartPaddingBottom = i;
        adjustPaddingBottom(this.mOffset, true);
    }

    public void setSubtitleHideEnable(boolean z) {
        if (this.mSubtitleHideEnable != z) {
            this.mSubtitleHideEnable = z;
            updateSubtitle();
        }
    }

    public void updateSubtitle() {
        adjustSubtitleIfNeed(this.mOffset);
    }

    public COUICollapsableAppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 0;
        this.mCollapsingToolbarHeight = 0;
        this.mSubtitleViewHeight = 0;
        this.mAutoExpand = true;
        this.mUpdateOffset = false;
        this.mNeedUpdateModeAfterOffsetChanged = false;
        init(attributeSet);
    }

    public COUICollapsableAppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMode = 0;
        this.mCollapsingToolbarHeight = 0;
        this.mSubtitleViewHeight = 0;
        this.mAutoExpand = true;
        this.mUpdateOffset = false;
        this.mNeedUpdateModeAfterOffsetChanged = false;
        init(attributeSet);
    }
}

package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.heytap.nearx.uikit.R;
import com.heytap.nearx.uikit.widget.NearRecyclerView;
import com.oplus.aiunit.vision.ojc;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class NearCollapsableAppBarLayout extends NearDividerAppBarLayout {
    public static final int DEFAULT_SCROLL_FLAG = 19;
    public static final int MODE_COLLAPSABLE = 0;
    public static final int MODE_FIXED_COLLAPSED = 1;
    public static final int MODE_FIXED_EXPANDED = 2;
    private static final String TAG = "NearCollapsableAppBarLayout";
    private int mEndPaddingBottom;
    private int mMode;
    private int mOffset;
    private int mStartPaddingBottom;
    private boolean mSubtitleHideEnable;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public static class ScrollBehavior extends NearDividerAppBarLayout.DividerBehavior {
        private ScrollBehavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.HeaderBehavior
        public boolean canDragView(AppBarLayout appBarLayout) {
            return super.canDragView(appBarLayout) && (!(appBarLayout instanceof NearCollapsableAppBarLayout) || ((NearCollapsableAppBarLayout) appBarLayout).getMode() == 0);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            if ((view instanceof NearRecyclerView) && view.getScrollY() < 0) {
                i2 = 0;
            }
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.NearDividerAppBarLayout.DividerBehavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, ((appBarLayout instanceof NearCollapsableAppBarLayout) && ((NearCollapsableAppBarLayout) appBarLayout).mMode == 1) ? 0 : i4, i5, iArr);
        }
    }

    public NearCollapsableAppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void adjustPaddingBottom(int i) {
        float totalScrollRange = getTotalScrollRange();
        if (totalScrollRange == 0.0f || this.mStartPaddingBottom == this.mEndPaddingBottom) {
            return;
        }
        float fAbs = Math.abs(i) / totalScrollRange;
        int i2 = this.mStartPaddingBottom;
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i2 + ((int) ((this.mEndPaddingBottom - i2) * fAbs)));
    }

    private void adjustSubtitleIfNeed(int i) {
        View viewFindSubtitleContentView = findSubtitleContentView();
        boolean z = viewFindSubtitleContentView != null && viewFindSubtitleContentView.getVisibility() == 0;
        if ((findCollapsingToolbarLayout() != null) && z) {
            float fAbs = Math.abs(i) / getTotalScrollRange();
            float f = this.mSubtitleHideEnable ? 1.0f - fAbs : 1.0f;
            int iB = ojc.b(getContext(), 6);
            int i2 = (int) (iB + (((-viewFindSubtitleContentView.getMeasuredHeight()) - iB) * fAbs));
            ViewGroup.LayoutParams layoutParams = viewFindSubtitleContentView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
            }
            viewFindSubtitleContentView.setLayoutParams(layoutParams);
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

    private void init(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.UiKitNearCollapsableAppBarLayout);
        this.mMode = typedArrayObtainStyledAttributes.getInt(R.styleable.UiKitNearCollapsableAppBarLayout_uncabmode, 0);
        this.mSubtitleHideEnable = typedArrayObtainStyledAttributes.getBoolean(R.styleable.UiKitNearCollapsableAppBarLayout_subtitleHideEnable, true);
        this.mStartPaddingBottom = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.UiKitNearCollapsableAppBarLayout_startPaddingBottom, getContext().getResources().getDimensionPixelOffset(R.dimen.nx_appbar_start_padding_bottom));
        this.mEndPaddingBottom = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.UiKitNearCollapsableAppBarLayout_endPaddingBottom, getContext().getResources().getDimensionPixelOffset(R.dimen.nx_appbar_end_padding_bottom));
        typedArrayObtainStyledAttributes.recycle();
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

    private void updateIconViewLocationIfNeed(float f) {
        View viewFindCollapsingToolbarLayout = findCollapsingToolbarLayout();
        if (viewFindCollapsingToolbarLayout instanceof NearCollapsingToolbarLayout) {
            NearCollapsingToolbarLayout nearCollapsingToolbarLayout = (NearCollapsingToolbarLayout) viewFindCollapsingToolbarLayout;
            nearCollapsingToolbarLayout.collapsingTextHelper.setExpansionFraction(f);
            nearCollapsingToolbarLayout.updateIconViewLocationIfNeed();
        }
    }

    public View findSubtitleContentView() {
        return findViewById(R.id.nx_appbar_subtitle_content);
    }

    @Override // com.google.android.material.appbar.NearDividerAppBarLayout, com.google.android.material.appbar.AppBarLayout
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new ScrollBehavior();
    }

    @Override // com.google.android.material.appbar.NearDividerAppBarLayout
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

    @Override // com.google.android.material.appbar.NearDividerAppBarLayout, com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.mMode;
        int i2 = i == 1 ? this.mEndPaddingBottom : this.mStartPaddingBottom;
        setMode(i);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout
    public void onOffsetChanged(int i) {
        if (this.mOffset == i) {
            return;
        }
        this.mOffset = i;
        super.onOffsetChanged(i);
        int i2 = this.mMode;
        if (i2 == 1) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.mEndPaddingBottom);
        } else if (i2 == 2) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.mStartPaddingBottom);
        }
        adjustPaddingBottom(i);
        adjustSubtitleIfNeed(i);
        View viewFindCollapsingToolbarLayout = findCollapsingToolbarLayout();
        if (viewFindCollapsingToolbarLayout instanceof NearCollapsingToolbarLayout) {
            ((NearCollapsingToolbarLayout) viewFindCollapsingToolbarLayout).updateIconViewLocationIfNeed();
        }
    }

    public void setEndPaddingBottom(int i) {
        this.mEndPaddingBottom = i;
    }

    public void setMode(int i) {
        this.mMode = i;
        if (i == 0) {
            setExpanded(true);
            setScrollFlags(19);
        } else if (i == 1) {
            setExpanded(false);
            setScrollFlags(19);
            updateIconViewLocationIfNeed(1.0f);
        } else {
            if (i != 2) {
                return;
            }
            setExpanded(true);
            setScrollFlags(0);
            updateIconViewLocationIfNeed(0.0f);
        }
    }

    public void setStartPaddingBottom(int i) {
        this.mStartPaddingBottom = i;
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

    public NearCollapsableAppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 0;
        init(attributeSet);
    }

    public NearCollapsableAppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMode = 0;
        init(attributeSet);
    }
}

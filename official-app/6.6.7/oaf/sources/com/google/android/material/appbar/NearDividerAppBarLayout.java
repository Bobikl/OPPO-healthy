package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.heytap.nearx.uikit.R;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class NearDividerAppBarLayout extends AppBarLayout {
    private static final String TAG = "NearDividerAppBarLayout";
    private float mDividerEndAlpha;
    private int mDividerEndMarginHorizontal;
    private float mDividerStartAlpha;
    private int mDividerStartMarginHorizontal;
    private View mDividerView;
    private boolean mHasDivider;
    private int mTotalScrollDy;

    public static class DividerBehavior extends AppBarLayout.Behavior {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (appBarLayout instanceof NearDividerAppBarLayout) {
                if (!view.canScrollVertically(-1)) {
                    ((NearDividerAppBarLayout) appBarLayout).onDividerChangedTo(0);
                } else {
                    ((NearDividerAppBarLayout) appBarLayout).onDividerChangedBy(i2);
                }
            }
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2) || ((appBarLayout instanceof NearDividerAppBarLayout) && ((NearDividerAppBarLayout) appBarLayout).isDividerAnimEnable());
        }
    }

    public NearDividerAppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void init(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.NearDividerAppBarLayout);
        this.mHasDivider = typedArrayObtainStyledAttributes.getBoolean(R.styleable.NearDividerAppBarLayout_hasDivider, true);
        this.mDividerStartAlpha = typedArrayObtainStyledAttributes.getFloat(R.styleable.NearDividerAppBarLayout_dividerStartAlpha, 0.0f);
        this.mDividerEndAlpha = typedArrayObtainStyledAttributes.getFloat(R.styleable.NearDividerAppBarLayout_dividerEndAlpha, this.mHasDivider ? 1.0f : 0.0f);
        this.mDividerStartMarginHorizontal = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NearDividerAppBarLayout_dividerStartMarginHorizontal, getContext().getResources().getDimensionPixelOffset(R.dimen.nx_appbar_divider_expanded_margin_horizontal));
        this.mDividerEndMarginHorizontal = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NearDividerAppBarLayout_dividerEndMarginHorizontal, getContext().getResources().getDimensionPixelOffset(R.dimen.nx_appbar_divider_collapsed_margin_horizontal));
        typedArrayObtainStyledAttributes.recycle();
        this.mDividerEndAlpha = Math.max(0.0f, Math.min(this.mDividerEndAlpha, 1.0f));
        this.mDividerStartAlpha = Math.max(0.0f, Math.min(this.mDividerStartAlpha, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDividerAnimEnable() {
        return (this.mDividerView != null && this.mHasDivider) && ((this.mDividerStartAlpha > this.mDividerEndAlpha ? 1 : (this.mDividerStartAlpha == this.mDividerEndAlpha ? 0 : -1)) != 0 || this.mDividerStartMarginHorizontal != this.mDividerEndMarginHorizontal);
    }

    private void setDividerHorizontalMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mDividerView.getLayoutParams();
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i;
        this.mDividerView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.google.android.material.appbar.AppBarLayout
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new DividerBehavior();
    }

    public float getDividerEndAlpha() {
        return this.mDividerEndAlpha;
    }

    public int getDividerEndMarginHorizontal() {
        return this.mDividerEndMarginHorizontal;
    }

    public int getDividerScrollRange() {
        return getMeasuredHeight();
    }

    public float getDividerStartAlpha() {
        return this.mDividerStartAlpha;
    }

    public int getDividerStartMarginHorizontal() {
        return this.mDividerStartMarginHorizontal;
    }

    public boolean hasDivider() {
        return this.mHasDivider;
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mDividerView == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.nx_appbar_divider_layout, (ViewGroup) this, false);
            this.mDividerView = viewInflate;
            addView(viewInflate, getChildCount());
            this.mDividerView.setAlpha(this.mDividerStartAlpha);
        }
        this.mDividerView.setVisibility(this.mHasDivider ? 0 : 8);
        this.mDividerView.setForceDarkAllowed(false);
    }

    public void onDividerChanged() {
        int i = this.mTotalScrollDy;
        if ((i >= 0 && i <= getDividerScrollRange()) && isDividerAnimEnable()) {
            float dividerScrollRange = this.mTotalScrollDy / getDividerScrollRange();
            float f = this.mDividerStartAlpha;
            float f2 = f + ((this.mDividerEndAlpha - f) * dividerScrollRange);
            int i2 = this.mDividerStartMarginHorizontal;
            int i3 = i2 + ((int) ((this.mDividerEndMarginHorizontal - i2) * dividerScrollRange));
            this.mDividerView.setAlpha(f2);
            setDividerHorizontalMargin(i3);
        }
    }

    public void onDividerChangedBy(int i) {
        if (i == 0) {
            return;
        }
        this.mTotalScrollDy = Math.max(0, this.mTotalScrollDy + i);
        onDividerChanged();
    }

    public void onDividerChangedTo(int i) {
        if (this.mTotalScrollDy == i) {
            return;
        }
        this.mTotalScrollDy = Math.max(0, i);
        onDividerChanged();
    }

    public void setDividerEndAlpha(float f) {
        this.mDividerEndAlpha = f;
    }

    public void setDividerEndMarginHorizontal(int i) {
        this.mDividerEndMarginHorizontal = i;
    }

    public void setDividerStartAlpha(float f) {
        this.mDividerStartAlpha = f;
    }

    public void setDividerStartMarginHorizontal(int i) {
        this.mDividerStartMarginHorizontal = i;
    }

    public void setHasDivider(boolean z) {
        this.mHasDivider = z;
        this.mDividerView.setVisibility(z ? 0 : 8);
    }

    public NearDividerAppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearDividerAppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}

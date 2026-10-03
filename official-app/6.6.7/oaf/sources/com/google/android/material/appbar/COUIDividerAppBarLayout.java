package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.COUIRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.scrollview.COUINestedScrollView;
import com.oplus.aiunit.vision.di2;
import com.oplus.aiunit.vision.zh2;
import com.support.toolbar.R;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class COUIDividerAppBarLayout extends AppBarLayout {
    private static boolean DEBUG = false;
    private static final String DIVIDER_FRACTION_STATE_KEY = "DIVIDER_FRACTION_STATE_KEY";
    private static final float MAX_FRACTION = 1.0f;
    private static final String OFFSET_DY_SCROLL_STATE_KEY = "OFFSET_DY_SCROLL_STATE_KEY";
    private static final String OVERSCROLL_DY_SCROLL_STATE_KEY = "OVERSCROLL_DY_SCROLL_STATE_KEY";
    private static final String SCROLL_DY_SCROLL_STATE_KEY = "SCROLL_DY_SCROLL_STATE_KEY";
    private static final String SUPER_STATE_KEY = "SUPER_STATE_KEY";
    private static final String TAG = "COUIDividerAppBarLayout";
    protected boolean mCollapsable;
    private float mDividerEndAlpha;
    private int mDividerEndMarginHorizontal;
    private float mDividerFraction;
    private float mDividerStartAlpha;
    private int mDividerStartMarginHorizontal;
    private View mDividerView;
    private boolean mHasDivider;
    private OnDividerProgressChangedListener mOnDividerProgressChangedListener;
    private View.OnLayoutChangeListener mOnLayoutChangeListener;
    private RecyclerView.OnScrollListener mOnScrollListener;
    protected int mScrollDyByOffset;
    protected int mScrollDyByOverScroll;
    protected int mScrollDyByScroll;
    protected RecyclerView mTargetView;
    protected int mTargetViewState;

    public static class DividerAppBarOnScrollChangedListener implements ViewTreeObserver.OnScrollChangedListener {
        private AppBarLayout mAbl;
        private View mTarget;

        private DividerAppBarOnScrollChangedListener() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            View view = this.mTarget;
            if (view instanceof COUIRecyclerView) {
                int scrollY = view.getScrollY();
                ((COUIDividerAppBarLayout) this.mAbl).mScrollDyByOverScroll = Math.max(0, scrollY);
                ((COUIDividerAppBarLayout) this.mAbl).onDividerChanged();
                if (((COUIDividerAppBarLayout) this.mAbl).mScrollDyByOverScroll == 0) {
                    this.mTarget.getViewTreeObserver().removeOnScrollChangedListener(this);
                }
            }
        }

        public void setAbl(AppBarLayout appBarLayout) {
            this.mAbl = appBarLayout;
        }

        public void setTarget(View view) {
            this.mTarget = view;
        }
    }

    public static class DividerBehavior extends AppBarLayout.Behavior {
        private DividerAppBarOnScrollChangedListener mScrollChangedListener;
        private boolean mStopAfterFling = false;

        public boolean canScrollUp(View view) {
            return view.canScrollVertically(1);
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, float f, float f2) {
            this.mStopAfterFling = true;
            return super.onNestedPreFling(coordinatorLayout, appBarLayout, view, f, f2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if ((appBarLayout instanceof COUIDividerAppBarLayout) && (view instanceof COUIRecyclerView)) {
                COUIDividerAppBarLayout cOUIDividerAppBarLayout = (COUIDividerAppBarLayout) appBarLayout;
                int i6 = cOUIDividerAppBarLayout.mScrollDyByOverScroll;
                int iMax = Math.max(0, view.getScrollY());
                cOUIDividerAppBarLayout.mScrollDyByOverScroll = iMax;
                if (i6 != iMax) {
                    cOUIDividerAppBarLayout.onDividerChanged();
                }
            }
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2) || ((appBarLayout instanceof COUIDividerAppBarLayout) && ((COUIDividerAppBarLayout) appBarLayout).isDividerAnimEnable());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i) {
            if (view instanceof COUIRecyclerView) {
                if (this.mScrollChangedListener == null) {
                    this.mScrollChangedListener = new DividerAppBarOnScrollChangedListener();
                }
                this.mScrollChangedListener.setTarget(view);
                this.mScrollChangedListener.setAbl(appBarLayout);
                view.getViewTreeObserver().addOnScrollChangedListener(this.mScrollChangedListener);
            }
            if (!this.mStopAfterFling) {
                super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
            }
            this.mStopAfterFling = false;
        }
    }

    public interface OnDividerProgressChangedListener {
        void onDividerProgressChanged(float f);
    }

    public COUIDividerAppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void bindListener() {
        RecyclerView recyclerView = this.mTargetView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.mOnScrollListener);
            this.mTargetView.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        } else if (DEBUG) {
            Log.d(TAG, "Can not find RecyclerView");
        }
    }

    private void findRecyclerView() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof RecyclerView) {
                this.mTargetView = viewGroup.getChildAt(i);
                return;
            }
        }
    }

    private void init(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.COUIDividerAppBarLayout);
        this.mHasDivider = typedArrayObtainStyledAttributes.getBoolean(R.styleable.COUIDividerAppBarLayout_hasDivider, true);
        this.mDividerStartAlpha = typedArrayObtainStyledAttributes.getFloat(R.styleable.COUIDividerAppBarLayout_dividerStartAlpha, 0.0f);
        this.mDividerEndAlpha = typedArrayObtainStyledAttributes.getFloat(R.styleable.COUIDividerAppBarLayout_dividerEndAlpha, this.mHasDivider ? 1.0f : 0.0f);
        this.mDividerStartMarginHorizontal = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.COUIDividerAppBarLayout_dividerStartMarginHorizontal, getContext().getResources().getDimensionPixelOffset(R.dimen.coui_appbar_divider_expanded_margin_horizontal));
        this.mDividerEndMarginHorizontal = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.COUIDividerAppBarLayout_dividerEndMarginHorizontal, getContext().getResources().getDimensionPixelOffset(R.dimen.coui_appbar_divider_collapsed_margin_horizontal));
        typedArrayObtainStyledAttributes.recycle();
        this.mDividerEndAlpha = Math.max(0.0f, Math.min(this.mDividerEndAlpha, 1.0f));
        this.mDividerStartAlpha = Math.max(0.0f, Math.min(this.mDividerStartAlpha, 1.0f));
        this.mOnScrollListener = new RecyclerView.OnScrollListener() { // from class: com.google.android.material.appbar.COUIDividerAppBarLayout.1
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                COUIDividerAppBarLayout.this.mTargetViewState = i;
            }

            public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                COUIDividerAppBarLayout.this.mScrollDyByScroll = recyclerView.computeVerticalScrollOffset();
                COUIDividerAppBarLayout.this.onDividerChanged();
            }
        };
        this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.appbar.COUIDividerAppBarLayout.2
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                COUIDividerAppBarLayout.this.refreshAppBar(view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDividerAnimEnable() {
        return (this.mDividerView != null && this.mHasDivider) && ((this.mDividerStartAlpha > this.mDividerEndAlpha ? 1 : (this.mDividerStartAlpha == this.mDividerEndAlpha ? 0 : -1)) != 0 || this.mDividerStartMarginHorizontal != this.mDividerEndMarginHorizontal);
    }

    private void setDividerHorizontalMargin(int i) {
        View view = this.mDividerView;
        if (view == null || !view.isAttachedToWindow() || this.mDividerView.getMeasuredWidth() <= 0) {
            return;
        }
        View view2 = this.mDividerView;
        view2.setPivotX(view2.getMeasuredWidth() / 2.0f);
        this.mDividerView.setScaleX((getMeasuredWidth() - (i * 2)) / this.mDividerView.getMeasuredWidth());
    }

    public void bindRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mTargetView;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.mOnScrollListener);
            this.mTargetView.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        }
        this.mTargetView = recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.mOnScrollListener);
            this.mTargetView.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        }
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
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.coui_appbar_divider_layout, (ViewGroup) this, false);
            this.mDividerView = viewInflate;
            addView(viewInflate, getChildCount());
            this.mDividerView.setAlpha(this.mDividerStartAlpha);
        }
        this.mDividerView.setBackgroundColor(zh2.a(getContext(), com.support.appcompat.R.attr.couiColorDivider));
        refreshDivider();
        this.mDividerView.setVisibility(this.mHasDivider ? 0 : 8);
        di2.c(this.mDividerView, false);
        findRecyclerView();
        bindListener();
        setTouchscreenBlocksFocus(false);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RecyclerView recyclerView = this.mTargetView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.mOnScrollListener);
            this.mTargetView.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        } else if (DEBUG) {
            Log.d(TAG, "Can not find RecyclerView");
        }
    }

    public void onDividerChanged() {
        if (DEBUG) {
            Log.d(TAG, "onDividerChanged: mScrollDyByScroll = " + this.mScrollDyByScroll + " mScrollDyByOffset = " + this.mScrollDyByOffset + " mScrollDyByOverScroll = " + this.mScrollDyByOverScroll);
        }
        int iMax = Math.max(0, this.mScrollDyByScroll) + this.mScrollDyByOffset + this.mScrollDyByOverScroll;
        if (iMax < 0 || !isDividerAnimEnable()) {
            return;
        }
        float f = this.mDividerFraction;
        float dividerScrollRange = getDividerScrollRange();
        if (dividerScrollRange == 0.0f) {
            this.mDividerFraction = dividerScrollRange;
        } else {
            this.mDividerFraction = Math.min(iMax / dividerScrollRange, 1.0f);
        }
        float f2 = this.mDividerStartAlpha;
        float f3 = this.mDividerEndAlpha - f2;
        float f4 = this.mDividerFraction;
        float f5 = f2 + (f3 * f4);
        int i = this.mDividerStartMarginHorizontal;
        int i2 = i + ((int) ((this.mDividerEndMarginHorizontal - i) * f4));
        View view = this.mDividerView;
        if (view != null) {
            view.setAlpha(f5);
            setDividerHorizontalMargin(i2);
        }
        OnDividerProgressChangedListener onDividerProgressChangedListener = this.mOnDividerProgressChangedListener;
        if (onDividerProgressChangedListener != null) {
            float f6 = this.mDividerFraction;
            if (f != f6) {
                onDividerProgressChangedListener.onDividerProgressChanged(f6);
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.mScrollDyByOffset = bundle.getInt(OFFSET_DY_SCROLL_STATE_KEY);
            this.mScrollDyByScroll = bundle.getInt(SCROLL_DY_SCROLL_STATE_KEY);
            this.mScrollDyByOverScroll = bundle.getInt(OVERSCROLL_DY_SCROLL_STATE_KEY);
            this.mDividerFraction = bundle.getFloat(DIVIDER_FRACTION_STATE_KEY);
            parcelable = bundle.getParcelable(SUPER_STATE_KEY);
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(SUPER_STATE_KEY, super.onSaveInstanceState());
        bundle.putInt(OFFSET_DY_SCROLL_STATE_KEY, this.mScrollDyByOffset);
        bundle.putInt(SCROLL_DY_SCROLL_STATE_KEY, this.mScrollDyByScroll);
        bundle.putInt(OVERSCROLL_DY_SCROLL_STATE_KEY, this.mScrollDyByOverScroll);
        bundle.putFloat(DIVIDER_FRACTION_STATE_KEY, this.mDividerFraction);
        return bundle;
    }

    public boolean refreshAppBar(View view) {
        int scrollY;
        if (view instanceof COUIRecyclerView) {
            scrollY = ((COUIRecyclerView) view).computeVerticalScrollOffset();
        } else {
            if (!(view instanceof COUINestedScrollView)) {
                return false;
            }
            scrollY = view.getScrollY();
        }
        if (scrollY == this.mScrollDyByScroll) {
            return false;
        }
        this.mScrollDyByScroll = scrollY;
        return true;
    }

    public void refreshDivider() {
        float f = this.mDividerStartAlpha;
        float f2 = this.mDividerEndAlpha - f;
        float f3 = this.mDividerFraction;
        float f4 = f + (f2 * f3);
        int i = this.mDividerStartMarginHorizontal;
        int i2 = i + ((int) ((this.mDividerEndMarginHorizontal - i) * f3));
        View view = this.mDividerView;
        if (view != null) {
            view.setBackgroundColor(zh2.a(getContext(), com.support.appcompat.R.attr.couiColorDivider));
            this.mDividerView.setAlpha(f4);
        }
        onDividerChanged();
        setDividerHorizontalMargin(i2);
        OnDividerProgressChangedListener onDividerProgressChangedListener = this.mOnDividerProgressChangedListener;
        if (onDividerProgressChangedListener != null) {
            onDividerProgressChangedListener.onDividerProgressChanged(this.mDividerFraction);
        }
    }

    public void reset() {
        this.mScrollDyByScroll = 0;
        this.mScrollDyByOffset = 0;
        this.mScrollDyByOverScroll = 0;
    }

    public void setDebug(boolean z) {
        DEBUG = z;
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
        View view = this.mDividerView;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setOnDividerProgressChangedListener(OnDividerProgressChangedListener onDividerProgressChangedListener) {
        this.mOnDividerProgressChangedListener = onDividerProgressChangedListener;
    }

    public void translateDivider(int i) {
        View view = this.mDividerView;
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        this.mDividerView.setTranslationY(i);
    }

    public COUIDividerAppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIDividerAppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCollapsable = false;
        this.mTargetViewState = 0;
        this.mTargetView = null;
        this.mDividerFraction = 0.0f;
        this.mOnDividerProgressChangedListener = null;
        this.mOnScrollListener = null;
        this.mOnLayoutChangeListener = null;
        init(attributeSet);
    }
}

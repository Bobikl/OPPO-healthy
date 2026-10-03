package com.coui.appcompat.panel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.core.view.ScrollingView;
import com.coui.appcompat.buttonBar.COUIButtonBarLayout;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.ti2;
import com.support.appcompat.R$id;
import com.support.panel.R$bool;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPanelAdjustResizeHelperBeforeR extends COUIAbsPanelAdjustResizeHelper {
    private static final float DISMISS_HEIGHT_ANIM_DURATION_COEFFICIENT = 50.0f;
    private static final float DISMISS_HEIGHT_ANIM_DURATION_INITIAL_VALUE = 200.0f;
    private static final int IME_ADJUST = 1;
    private static final int IME_HIDE = 2;
    private static final int IME_SHOW = 0;
    private static final float SHOW_HEIGHT_ANIM_DURATION_COEFFICIENT = 120.0f;
    private static final float SHOW_HEIGHT_ANIM_DURATION_INITIAL_VALUE = 300.0f;
    private ValueAnimator mBottomButtonBarAnim;
    private int mMarginBottomValue;
    private ValueAnimator mPaddingBottomAnim;
    private WeakReference<View> mPaddingBottomAnimView;
    private int mPaddingBottomOffset;
    private float mTranslateOffset;
    private static final Interpolator SHOW_HEIGHT_ANIM_INTERPOLATOR = new ti2();
    private static final Interpolator DISMISS_HEIGHT_ANIM_INTERPOLATOR = new LinearInterpolator();
    private int mWindowType = 2;
    private int mAdjustResizeType = 2;
    private int mAdjustKeyboardStartHeight = 0;
    private int mAdjustKeyboardHeight = 0;
    private int mAdjustKeyboardOffset = 0;
    private int mFocusViewRawY = 0;
    private boolean mIsIgnoreHideKeyboardAnim = true;
    private boolean mIsKeyboardShow = false;
    private boolean mIsFocusViewDisplayInVerticalScrolledView = false;
    private View mFocusVerticalScrolledView = null;

    private void adjustResizeBeforeR(ViewGroup viewGroup, boolean z, int i) {
        updateAdjustKeyboardType(z);
        updateAdjustKeyboardData(viewGroup, i);
        updateAdjustKeyboardOffset(viewGroup, Boolean.valueOf(z));
        doAdjustKeyboardAnim(viewGroup, z);
        this.mIsIgnoreHideKeyboardAnim = false;
    }

    private void doAdjustKeyboardAnim(ViewGroup viewGroup, boolean z) {
        if (viewGroup == null || this.mPaddingBottomAnimView == null) {
            return;
        }
        if (!(viewGroup instanceof COUIPanelContentLayout)) {
            int iK = ifk.k(viewGroup.getContext());
            doMarginBottomAnim(viewGroup, this.mMarginBottomValue, (long) (z ? Math.abs((this.mAdjustKeyboardOffset * 120.0f) / iK) + 300.0f : Math.abs((this.mAdjustKeyboardOffset * 50.0f) / iK) + 200.0f));
            return;
        }
        COUIPanelContentLayout cOUIPanelContentLayout = (COUIPanelContentLayout) viewGroup;
        int maxHeight = cOUIPanelContentLayout.getMaxHeight();
        long jAbs = (long) (z ? Math.abs((this.mAdjustKeyboardOffset * 120.0f) / maxHeight) + 300.0f : Math.abs((this.mAdjustKeyboardOffset * 50.0f) / maxHeight) + 200.0f);
        doPaddingBottomAnim(this.mPaddingBottomAnimView.get(), this.mPaddingBottomOffset, jAbs);
        doBottomButtonTranslateAnim(cOUIPanelContentLayout, this.mTranslateOffset, jAbs);
    }

    private void doBottomButtonTranslateAnim(final COUIPanelContentLayout cOUIPanelContentLayout, float f, long j2) {
        if (f == 0.0f || cOUIPanelContentLayout == null || cOUIPanelContentLayout.getBtnBarLayout() == null) {
            return;
        }
        float translationY = cOUIPanelContentLayout.getBtnBarLayout().getTranslationY();
        final float fMin = Math.min(0.0f, f + translationY);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, fMin);
        this.mBottomButtonBarAnim = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j2);
        if (translationY < fMin) {
            this.mBottomButtonBarAnim.setInterpolator(SHOW_HEIGHT_ANIM_INTERPOLATOR);
        } else {
            this.mBottomButtonBarAnim.setInterpolator(DISMISS_HEIGHT_ANIM_INTERPOLATOR);
        }
        this.mBottomButtonBarAnim.addListener(new AnimatorListenerAdapter() { // from class: com.coui.appcompat.panel.COUIPanelAdjustResizeHelperBeforeR.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                cOUIPanelContentLayout.getBtnBarLayout().setTranslationY(fMin);
                cOUIPanelContentLayout.getDivider().setTranslationY(fMin);
            }
        });
        this.mBottomButtonBarAnim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.coui.appcompat.panel.COUIPanelAdjustResizeHelperBeforeR.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (cOUIPanelContentLayout.isAttachedToWindow()) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    cOUIPanelContentLayout.getBtnBarLayout().setTranslationY(fFloatValue);
                    cOUIPanelContentLayout.getDivider().setTranslationY(fFloatValue);
                }
            }
        });
        this.mBottomButtonBarAnim.start();
    }

    private void doMarginBottomAnim(final View view, int i, long j2) {
        if (i == 0 || view == null) {
            return;
        }
        int iMax = Math.max(0, COUIViewMarginUtil.getMargin(view, 3));
        final int iMax2 = Math.max(0, i + iMax);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iMax, iMax2);
        valueAnimatorOfInt.setDuration(j2);
        if (iMax < iMax2) {
            valueAnimatorOfInt.setInterpolator(SHOW_HEIGHT_ANIM_INTERPOLATOR);
        } else {
            valueAnimatorOfInt.setInterpolator(DISMISS_HEIGHT_ANIM_INTERPOLATOR);
        }
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: com.coui.appcompat.panel.COUIPanelAdjustResizeHelperBeforeR.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                COUIViewMarginUtil.setMargin(view, iMax2, 3);
            }
        });
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.coui.appcompat.panel.COUIPanelAdjustResizeHelperBeforeR.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (view.isAttachedToWindow()) {
                    COUIViewMarginUtil.setMargin(view, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 3);
                }
            }
        });
        valueAnimatorOfInt.start();
    }

    private void doPaddingBottomAnim(final View view, int i, long j2) {
        if (i == 0 || view == null) {
            return;
        }
        final int paddingLeft = view.getPaddingLeft();
        final int paddingRight = view.getPaddingRight();
        final int paddingTop = view.getPaddingTop();
        int iMax = Math.max(0, view.getPaddingBottom());
        final int iMax2 = Math.max(0, i + iMax);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iMax, iMax2);
        this.mPaddingBottomAnim = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(j2);
        if (iMax < iMax2) {
            this.mPaddingBottomAnim.setInterpolator(SHOW_HEIGHT_ANIM_INTERPOLATOR);
        } else {
            this.mPaddingBottomAnim.setInterpolator(DISMISS_HEIGHT_ANIM_INTERPOLATOR);
        }
        this.mPaddingBottomAnim.addListener(new AnimatorListenerAdapter() { // from class: com.coui.appcompat.panel.COUIPanelAdjustResizeHelperBeforeR.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setPadding(paddingLeft, paddingTop, paddingRight, iMax2);
            }
        });
        this.mPaddingBottomAnim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.coui.appcompat.panel.COUIPanelAdjustResizeHelperBeforeR.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (view.isAttachedToWindow()) {
                    view.setPadding(paddingLeft, paddingTop, paddingRight, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        });
        this.mPaddingBottomAnim.start();
    }

    private void findFocusView(ViewGroup viewGroup) {
        View viewFindFocus;
        if (viewGroup == null || (viewFindFocus = viewGroup.findFocus()) == null) {
            return;
        }
        this.mFocusViewRawY = 0;
        this.mIsFocusViewDisplayInVerticalScrolledView = false;
        this.mFocusVerticalScrolledView = null;
        if (isScrollable(viewFindFocus)) {
            this.mIsFocusViewDisplayInVerticalScrolledView = true;
            this.mFocusVerticalScrolledView = viewFindFocus;
        }
        this.mFocusViewRawY = getMeasureHeight(viewFindFocus) + viewFindFocus.getTop() + COUIViewMarginUtil.getMargin(viewFindFocus, 3);
        for (View view = (View) viewFindFocus.getParent(); view != null && view != viewGroup.getParent(); view = (View) view.getParent()) {
            if (isScrollable(view)) {
                this.mIsFocusViewDisplayInVerticalScrolledView = true;
                this.mFocusVerticalScrolledView = view;
            }
            this.mFocusViewRawY += view.getTop();
        }
    }

    private int getKeyboardHeightBeforeR(int i, int i2) {
        return this.mWindowType == 2038 ? i : i - i2;
    }

    private int getMeasureHeight(View view) {
        if (view == null || view.getVisibility() == 8) {
            return 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight != 0) {
            return measuredHeight;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    private boolean isScrollable(@NonNull View view) {
        return (view instanceof ScrollView) || (view instanceof AbsListView) || (view instanceof ScrollingView);
    }

    private boolean updateAdjustKeyboardData(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            return false;
        }
        releaseData();
        if (viewGroup instanceof COUIPanelContentLayout) {
            COUIPanelContentLayout cOUIPanelContentLayout = (COUIPanelContentLayout) viewGroup;
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(cOUIPanelContentLayout.getMaxHeight(), cOUIPanelContentLayout.getLayoutAtMaxHeight() ? 1073741824 : Integer.MIN_VALUE));
            findFocusView(viewGroup);
        }
        int measuredHeight = viewGroup.getMeasuredHeight();
        this.mAdjustKeyboardStartHeight = measuredHeight;
        int i2 = this.mAdjustResizeType;
        if (i2 == 0) {
            this.mAdjustKeyboardHeight = i;
            this.mAdjustKeyboardOffset = i;
        } else if (i2 == 1) {
            this.mAdjustKeyboardStartHeight = measuredHeight - i;
            this.mAdjustKeyboardOffset = i - this.mAdjustKeyboardHeight;
            this.mAdjustKeyboardHeight = i;
        } else if (i2 == 2 && !this.mIsIgnoreHideKeyboardAnim) {
            this.mAdjustKeyboardHeight = i;
            this.mAdjustKeyboardOffset = i;
        }
        return true;
    }

    private void updateAdjustKeyboardOffset(ViewGroup viewGroup, Boolean bool) {
        this.mPaddingBottomAnimView = null;
        this.mPaddingBottomOffset = 0;
        this.mTranslateOffset = 0.0f;
        this.mMarginBottomValue = 0;
        if (viewGroup == null || this.mAdjustKeyboardOffset == 0) {
            return;
        }
        if (viewGroup instanceof COUIPanelContentLayout) {
            updateOffsetInConstraintLayout((COUIPanelContentLayout) viewGroup, bool);
        } else {
            updateOffsetInNormalLayout(viewGroup, bool);
        }
    }

    private void updateAdjustKeyboardType(boolean z) {
        this.mAdjustResizeType = 2;
        boolean z2 = this.mIsKeyboardShow;
        if (!z2 && z) {
            this.mAdjustResizeType = 0;
        } else if (z2 && z) {
            this.mAdjustResizeType = 1;
        }
        this.mIsKeyboardShow = z;
    }

    private void updateOffsetInConstraintLayout(COUIPanelContentLayout cOUIPanelContentLayout, Boolean bool) {
        int i = this.mAdjustResizeType == 2 ? -1 : 1;
        int maxHeight = cOUIPanelContentLayout.getMaxHeight();
        int i2 = this.mAdjustKeyboardOffset * i;
        float translationY = cOUIPanelContentLayout.getBtnBarLayout() != null ? cOUIPanelContentLayout.getBtnBarLayout().getTranslationY() : 0.0f;
        this.mPaddingBottomAnimView = new WeakReference<>(cOUIPanelContentLayout);
        if ((this.mIsFocusViewDisplayInVerticalScrolledView && maxHeight != 0) || (!COUIPanelMultiWindowUtils.isPortrait(cOUIPanelContentLayout.getContext()) && translationY == 0.0f)) {
            View view = this.mFocusVerticalScrolledView;
            if (view != null) {
                View view2 = (View) view.getParent();
                if (view2 != null) {
                    this.mPaddingBottomAnimView = new WeakReference<>(view2);
                }
                this.mTranslateOffset = -i2;
            }
            this.mPaddingBottomOffset = i2;
            return;
        }
        int i3 = this.mAdjustKeyboardStartHeight - this.mFocusViewRawY;
        int paddingBottom = cOUIPanelContentLayout.getPaddingBottom();
        int height = cOUIPanelContentLayout.getBtnBarLayout() != null ? cOUIPanelContentLayout.getBtnBarLayout().getHeight() : 0;
        int height2 = cOUIPanelContentLayout.getDivider() != null ? cOUIPanelContentLayout.getDivider().getHeight() : 0;
        int i4 = this.mAdjustResizeType;
        if (i4 == 1) {
            i3 += this.mAdjustKeyboardHeight;
        } else if (i4 == 2) {
            i3 -= this.mAdjustKeyboardHeight;
        }
        int i5 = this.mAdjustKeyboardHeight;
        if (i3 >= i5 + height + height2 && paddingBottom == 0) {
            this.mTranslateOffset = -i2;
            return;
        }
        int i6 = ((i5 + height) + height2) - i3;
        int i7 = i * i6;
        this.mPaddingBottomOffset = Math.max(-paddingBottom, i7);
        if (this.mAdjustResizeType != 1) {
            this.mTranslateOffset = bool.booleanValue() ? -(i2 - i6) : -translationY;
            return;
        }
        int iMax = Math.max(0, paddingBottom + i7);
        int i8 = this.mAdjustKeyboardHeight;
        this.mTranslateOffset = (-Math.min(i8, Math.max(-i8, i8 - iMax))) - translationY;
    }

    private void updateOffsetInNormalLayout(ViewGroup viewGroup, Boolean bool) {
        int i = (this.mAdjustResizeType == 2 ? -1 : 1) * this.mAdjustKeyboardOffset;
        this.mPaddingBottomAnimView = new WeakReference<>(viewGroup);
        this.mMarginBottomValue = i;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public void adjustResize(Context context, ViewGroup viewGroup, WindowInsets windowInsets, View view, boolean z) {
        if (viewGroup == null || !z) {
            return;
        }
        int keyboardHeightBeforeR = getKeyboardHeightBeforeR(windowInsets.getSystemWindowInsetBottom(), COUINavigationBarUtil.isNavigationBarShow(context) && !context.getResources().getBoolean(R$bool.is_ignore_nav_height_in_panel_ime_adjust) ? COUINavigationBarUtil.getNavigationBarHeight(context) : 0);
        if (keyboardHeightBeforeR > 0) {
            adjustResizeBeforeR(viewGroup, true, keyboardHeightBeforeR);
            return;
        }
        if (this.mAdjustResizeType != 2) {
            adjustResizeBeforeR(viewGroup, false, this.mAdjustKeyboardHeight);
        }
        View viewFindViewById = view.findViewById(R$id.design_bottom_sheet);
        int panelMarginBottom = COUIPanelMultiWindowUtils.getPanelMarginBottom(viewGroup.getContext(), viewGroup.getContext().getResources().getConfiguration(), windowInsets, viewFindViewById instanceof COUIPanelPercentFrameLayout ? ((COUIPanelPercentFrameLayout) viewFindViewById).isIsHandlePanel() : false, isCouiPanelEdgeToEdgeEnable());
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = panelMarginBottom;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public int getMarginBottomValue() {
        return this.mMarginBottomValue;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public int getPaddingBottomOffset() {
        return this.mPaddingBottomOffset;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public float getTranslateOffset() {
        return this.mTranslateOffset;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public int getWindowType() {
        return this.mWindowType;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public void recoveryScrollingParentViewPaddingBottom(COUIPanelContentLayout cOUIPanelContentLayout) {
        if (cOUIPanelContentLayout != null) {
            COUIButtonBarLayout btnBarLayout = cOUIPanelContentLayout.getBtnBarLayout();
            View divider = cOUIPanelContentLayout.getDivider();
            if (btnBarLayout != null) {
                btnBarLayout.setTranslationY(0.0f);
            }
            if (divider != null) {
                divider.setTranslationY(0.0f);
            }
            cOUIPanelContentLayout.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public boolean releaseData() {
        ValueAnimator valueAnimator = this.mPaddingBottomAnim;
        boolean z = false;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                this.mPaddingBottomAnim.cancel();
                z = true;
            }
            this.mPaddingBottomAnim = null;
        }
        ValueAnimator valueAnimator2 = this.mBottomButtonBarAnim;
        if (valueAnimator2 != null) {
            if (valueAnimator2.isRunning()) {
                this.mBottomButtonBarAnim.cancel();
            }
            this.mBottomButtonBarAnim = null;
        }
        return z;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public void resetInnerStatus() {
        this.mAdjustKeyboardHeight = 0;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public void setIgnoreHideKeyboardAnim(boolean z) {
        this.mIsIgnoreHideKeyboardAnim = z;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public void setWindowType(int i) {
        this.mWindowType = i;
    }
}

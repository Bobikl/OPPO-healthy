package com.heytap.nearx.uikit.widget.panel;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import androidx.annotation.RequiresApi;
import com.heytap.nearx.uikit.R$id;
import com.oplus.aiunit.vision.dmc;
import com.oplus.aiunit.vision.mjc;
import com.oplus.aiunit.vision.qic;

/* JADX INFO: loaded from: classes18.dex */
public class NearPanelAdjustResizeHelperAfterR extends NearAbsPanelAdjustResizeHelper {
    private static final float DISMISS_HEIGHT_ANIM_DURATION_COEFFICIENT = 133.0f;
    private static final float DISMISS_HEIGHT_ANIM_DURATION_COEFFICIENT_IN_LARGE = 117.0f;
    private static final float DISMISS_HEIGHT_ANIM_DURATION_INITIAL_VALUE = 200.0f;
    private static final long PANEL_ALPHA_ANIM_DURATION = 250;
    private static final float SHOW_HEIGHT_ANIM_DURATION_COEFFICIENT = 132.0f;
    private static final float SHOW_HEIGHT_ANIM_DURATION_COEFFICIENT_IN_LARGE = 150.0f;
    private static final float SHOW_HEIGHT_ANIM_DURATION_INITIAL_VALUE = 300.0f;
    private boolean mIsPanelAlphaRun;
    private int mWindowType = 2;
    private ValueAnimator marginBottomAnim;
    private static final Interpolator SHOW_HEIGHT_ANIM_INTERPOLATOR = new qic();
    private static final Interpolator DISMISS_HEIGHT_ANIM_INTERPOLATOR = new mjc();
    private static final Interpolator SHOW_HEIGHT_ANIM_INTERPOLATOR_IN_LARGE = new qic();
    private static final Interpolator DISMISS_HEIGHT_ANIM_INTERPOLATOR_IN_LARGE = new mjc();

    @RequiresApi(api = 30)
    private void adjustResizeAfterR(ViewGroup viewGroup, int i, WindowInsets windowInsets, Context context, View view) {
        setMarginBottomTo(viewGroup, i, windowInsets, view);
    }

    private ValueAnimator createPanelAlphaAnimation(final View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.panel.NearPanelAdjustResizeHelperAfterR.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    if (NearPanelAdjustResizeHelperAfterR.this.mIsPanelAlphaRun) {
                        return;
                    }
                    NearPanelAdjustResizeHelperAfterR.this.mIsPanelAlphaRun = true;
                }
            }
        });
        return valueAnimatorOfFloat;
    }

    private void doMarginBottomAnim(final View view, final int i, boolean z, final int i2, final View view2, int i3) {
        float fAbs;
        int iA = dmc.a(view, 3);
        ValueAnimator valueAnimator = this.marginBottomAnim;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.marginBottomAnim.cancel();
        }
        if (i == 0 && iA == 0 && (view instanceof NearPanelContentLayout)) {
            View viewFindViewById = view.findViewById(R$id.nx_panel_content_layout);
            if (viewFindViewById != null) {
                viewFindViewById.setPadding(0, 0, 0, Math.max(i2, 0));
                return;
            }
            return;
        }
        int iMax = Math.max(0, Math.max(i2, 0) + i + i3);
        int iMax2 = Math.max(0, iA);
        int screenHeight = NearPanelMultiWindowUtils.getScreenHeight(view.getContext());
        this.marginBottomAnim = ValueAnimator.ofInt(iMax2, iMax);
        if (NearPanelMultiWindowUtils.isLargeHeightScreen(view.getContext(), null)) {
            if (z) {
                fAbs = Math.abs((i * SHOW_HEIGHT_ANIM_DURATION_COEFFICIENT_IN_LARGE) / screenHeight) + 300.0f;
                this.marginBottomAnim.setInterpolator(SHOW_HEIGHT_ANIM_INTERPOLATOR_IN_LARGE);
            } else {
                fAbs = Math.abs((i * DISMISS_HEIGHT_ANIM_DURATION_COEFFICIENT_IN_LARGE) / screenHeight) + 200.0f;
                this.marginBottomAnim.setInterpolator(DISMISS_HEIGHT_ANIM_INTERPOLATOR_IN_LARGE);
            }
        } else if (z) {
            fAbs = Math.abs((i * SHOW_HEIGHT_ANIM_DURATION_COEFFICIENT) / screenHeight) + 300.0f;
            this.marginBottomAnim.setInterpolator(SHOW_HEIGHT_ANIM_INTERPOLATOR);
        } else {
            fAbs = Math.abs((i * DISMISS_HEIGHT_ANIM_DURATION_COEFFICIENT) / screenHeight) + 200.0f;
            this.marginBottomAnim.setInterpolator(DISMISS_HEIGHT_ANIM_INTERPOLATOR);
        }
        this.marginBottomAnim.setDuration((long) fAbs);
        int i4 = R$id.design_bottom_sheet;
        ValueAnimator valueAnimatorCreatePanelAlphaAnimation = createPanelAlphaAnimation(view2.findViewById(i4));
        valueAnimatorCreatePanelAlphaAnimation.setDuration(PANEL_ALPHA_ANIM_DURATION);
        valueAnimatorCreatePanelAlphaAnimation.setInterpolator(this.marginBottomAnim.getInterpolator());
        this.marginBottomAnim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.panel.NearPanelAdjustResizeHelperAfterR.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i5;
                if (view.isAttachedToWindow()) {
                    int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (i2 > 0 && iIntValue >= (i5 = i)) {
                        view.findViewById(R$id.nx_panel_content_layout).setPadding(0, 0, 0, Math.max(iIntValue - i, 0));
                        iIntValue = i5;
                    }
                    View view3 = view;
                    if (((view3 instanceof NearIgnoreWindowInsetsFrameLayout) && layoutParams.height > 0) || (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iIntValue;
                        view3.setLayoutParams(layoutParams);
                    }
                    View view4 = view;
                    if (view4 instanceof NearPanelContentLayout) {
                        dmc.b(view2.findViewById(R$id.design_bottom_sheet), 3, 0);
                    } else {
                        dmc.b(view4.findViewById(R$id.nx_panel_content_layout), 3, 0);
                    }
                }
            }
        });
        this.marginBottomAnim.start();
        if (!z) {
            this.mIsPanelAlphaRun = false;
        }
        if (z && !this.mIsPanelAlphaRun && view2.findViewById(i4).getAlpha() == 0.0f) {
            valueAnimatorCreatePanelAlphaAnimation.start();
        }
    }

    @RequiresApi(api = 30)
    private void setMarginBottomTo(View view, int i, WindowInsets windowInsets, View view2) {
        int i2;
        if (view != null) {
            View rootView = view.getRootView();
            int i3 = R$id.nx_panel_content_layout;
            if (rootView.findViewById(i3) != null) {
                view.getRootView().findViewById(i3).setPadding(0, 0, 0, 0);
            }
            int measuredHeight = view2.findViewById(R$id.coordinator).getMeasuredHeight();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i > measuredHeight * 0.9f) {
                return;
            }
            doMarginBottomAnim(view, (measuredHeight <= 0 || measuredHeight2 <= 0 || (i2 = measuredHeight2 + i) <= measuredHeight) ? i : i - (i2 - measuredHeight), windowInsets.getInsets(WindowInsets.Type.ime()).bottom != 0, ((measuredHeight2 + i) - measuredHeight) - NearPanelMultiWindowUtils.getPanelMarginBottom(view.getContext(), view.getContext().getResources().getConfiguration()), view2, NearPanelMultiWindowUtils.getPanelMarginBottom(view.getContext(), view.getContext().getResources().getConfiguration(), windowInsets));
        }
    }

    @Override // com.heytap.nearx.uikit.widget.panel.NearAbsPanelAdjustResizeHelper
    @RequiresApi(api = 30)
    public void adjustResize(Context context, ViewGroup viewGroup, WindowInsets windowInsets, View view, boolean z) {
        int iMax = 0;
        if (z) {
            iMax = Math.max(0, windowInsets.getInsets(WindowInsets.Type.ime()).bottom - windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom);
        }
        adjustResizeAfterR(viewGroup, iMax, windowInsets, context, view);
    }

    @Override // com.heytap.nearx.uikit.widget.panel.NearAbsPanelAdjustResizeHelper
    public int getMarginBottomValue() {
        return -1;
    }

    @Override // com.heytap.nearx.uikit.widget.panel.NearAbsPanelAdjustResizeHelper
    public int getPaddingBottomOffset() {
        return -1;
    }

    @Override // com.heytap.nearx.uikit.widget.panel.NearAbsPanelAdjustResizeHelper
    public float getTranslateOffset() {
        return -1.0f;
    }

    @Override // com.heytap.nearx.uikit.widget.panel.NearAbsPanelAdjustResizeHelper
    public int getWindowType() {
        return this.mWindowType;
    }

    @Override // com.heytap.nearx.uikit.widget.panel.NearAbsPanelAdjustResizeHelper
    public void recoveryScrollingParentViewPaddingBottom(NearPanelContentLayout nearPanelContentLayout) {
        if (nearPanelContentLayout != null) {
            nearPanelContentLayout.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.heytap.nearx.uikit.widget.panel.NearAbsPanelAdjustResizeHelper
    public boolean releaseData() {
        return true;
    }

    @Override // com.heytap.nearx.uikit.widget.panel.NearAbsPanelAdjustResizeHelper
    public void resetInnerStatus() {
    }

    @Override // com.heytap.nearx.uikit.widget.panel.NearAbsPanelAdjustResizeHelper
    public void setIgnoreHideKeyboardAnim(boolean z) {
    }

    @Override // com.heytap.nearx.uikit.widget.panel.NearAbsPanelAdjustResizeHelper
    public void setWindowType(int i) {
        this.mWindowType = i;
    }
}

package com.coui.appcompat.panel;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import androidx.dynamicanimation.animation.FloatValueHolder;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.coui.appcompat.animation.dynamicanimation.b;
import com.coui.appcompat.animation.dynamicanimation.c;
import com.support.panel.R$id;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPanelAdjustResizeHelperAfterR extends COUIAbsPanelAdjustResizeHelper {
    private static final float DEFAULT_SPRING_BOUNCE = 0.0f;
    private static final float DEFAULT_SPRING_RESPONSE = 0.3f;
    private static final String TAG = "AdjustResizeAfterR";
    private int mAnimMaxMargin;
    private int mAnimStartBottomMargin;
    private int mAnimStartOffset;
    private int mAnimStartPaddingBottom;
    private int mAnimTargetBottomMargin;
    private int mAnimTargetOffset;
    private int mAnimTargetPaddingBottom;
    private View mLastBottomDesignSheetOrPanelContentLayout;
    private View mLastCouiPanelContentLayout;
    private b mOffsetSpringAnimation;
    private FloatValueHolder mOffsetValueHolder;
    private int mWindowType = 2;
    private int mCurrentKeyboardHeight = 0;
    private int mBottomMarginOfDesignBottomSheet = 0;

    private void doMarginBottomAnim(int i, int i2, int i3) {
        this.mAnimMaxMargin = i;
        this.mAnimStartOffset = i2;
        this.mAnimTargetOffset = i3;
        int paddingBottom = this.mLastCouiPanelContentLayout.getPaddingBottom();
        int iMax = Math.max(0, i2 - paddingBottom);
        int iMin = Math.min(i3, i);
        int iMax2 = Math.max(i3 - i, 0);
        this.mAnimStartBottomMargin = iMax;
        this.mAnimStartPaddingBottom = paddingBottom;
        this.mAnimTargetBottomMargin = iMin;
        this.mAnimTargetPaddingBottom = iMax2;
        FloatValueHolder floatValueHolder = this.mOffsetValueHolder;
        if (floatValueHolder == null) {
            this.mOffsetValueHolder = new FloatValueHolder(i2);
        } else {
            floatValueHolder.setValue(i2);
        }
        b bVar = this.mOffsetSpringAnimation;
        if (bVar == null) {
            b bVarR = new b(this.mOffsetValueHolder).E(new c(i3).i(0.0f).l(0.3f)).r(i2);
            this.mOffsetSpringAnimation = bVarR;
            bVarR.b(new COUIDynamicAnimation.r() { // from class: com.oplus.aiunit.vision.qj2
                @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
                public final void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
                    this.a.lambda$doMarginBottomAnim$0(cOUIDynamicAnimation, f, f2);
                }
            });
        } else {
            bVar.r(i2);
            this.mOffsetSpringAnimation.A().k(i3);
            this.mAnimStartOffset = i2;
            this.mAnimTargetOffset = i3;
        }
        if (this.mOffsetSpringAnimation.i()) {
            return;
        }
        this.mOffsetSpringAnimation.u();
    }

    private int getCurrentBottomMargin(View view) {
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    private int getCurrentBottomOffset(View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return (layoutParams instanceof ViewGroup.MarginLayoutParams ? 0 + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : 0) + view2.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doMarginBottomAnim$0(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
        View view = this.mLastCouiPanelContentLayout;
        View view2 = this.mLastBottomDesignSheetOrPanelContentLayout;
        if (view2 == null || view == null) {
            return;
        }
        int i = this.mAnimTargetOffset;
        int i2 = this.mAnimStartOffset;
        float fMax = i != i2 ? Math.max(0.0f, Math.min(1.0f, (f - i2) / (i - i2))) : 1.0f;
        int i3 = this.mAnimStartBottomMargin;
        int iMax = Math.max(0, Math.min(i3 + ((int) ((this.mAnimTargetBottomMargin - i3) * fMax)), this.mAnimMaxMargin));
        int i4 = this.mAnimStartPaddingBottom;
        view.setPadding(0, 0, 0, Math.max(0, i4 + ((int) ((this.mAnimTargetPaddingBottom - i4) * fMax))));
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iMax;
            view2.setLayoutParams(layoutParams);
        }
    }

    private void resetPaddingAndMargin() {
        View view = this.mLastBottomDesignSheetOrPanelContentLayout;
        if (view != null) {
            if (this.mAnimTargetPaddingBottom == 0 && this.mAnimTargetBottomMargin == 0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.mBottomMarginOfDesignBottomSheet;
                this.mLastBottomDesignSheetOrPanelContentLayout.setLayoutParams(layoutParams);
            }
            View view2 = this.mLastCouiPanelContentLayout;
            if (view2 != null) {
                view2.setPadding(0, 0, 0, 0);
            }
        }
    }

    @RequiresApi(api = 30)
    private void setMarginBottomTo(View view, int i, WindowInsets windowInsets, View view2) {
        int currentBottomMargin;
        int i2;
        if (view != null) {
            View viewFindViewById = view2.findViewById(R$id.coui_panel_content_layout);
            if (viewFindViewById == null) {
                Log.e(TAG, "couiPanelContentLayout is null");
                return;
            }
            int measuredHeight = view2.getMeasuredHeight();
            int measuredHeight2 = view.getMeasuredHeight() - viewFindViewById.getPaddingBottom();
            if (i > measuredHeight * 0.9f) {
                Log.e(TAG, "KeyboardHeight > availableHeight * 0.9f, so not elevated");
                return;
            }
            Context context = view.getContext();
            View viewFindViewById2 = view2.findViewById(com.support.appcompat.R$id.design_bottom_sheet);
            this.mBottomMarginOfDesignBottomSheet = COUIPanelMultiWindowUtils.getPanelMarginBottom(context, context.getResources().getConfiguration(), windowInsets, viewFindViewById2 instanceof COUIPanelPercentFrameLayout ? ((COUIPanelPercentFrameLayout) viewFindViewById2).isIsHandlePanel() : false, isCouiPanelEdgeToEdgeEnable());
            if (i > 0) {
                currentBottomMargin = (measuredHeight <= 0 || measuredHeight2 <= 0 || (i2 = measuredHeight2 + i) <= measuredHeight) ? i : i - (i2 - measuredHeight);
            } else {
                currentBottomMargin = getCurrentBottomMargin(view);
            }
            int iMax = Math.max(currentBottomMargin, this.mBottomMarginOfDesignBottomSheet);
            if (i == 0) {
                i = this.mBottomMarginOfDesignBottomSheet;
            }
            int currentBottomOffset = getCurrentBottomOffset(view, viewFindViewById);
            if (currentBottomOffset == i && this.mLastBottomDesignSheetOrPanelContentLayout == view && this.mLastCouiPanelContentLayout == viewFindViewById) {
                Log.w(TAG, "currentBottomOffset == targetBottomOffset, skip animation");
                return;
            }
            this.mLastBottomDesignSheetOrPanelContentLayout = view;
            this.mLastCouiPanelContentLayout = viewFindViewById;
            b bVar = this.mOffsetSpringAnimation;
            if (bVar == null || !bVar.i()) {
                doMarginBottomAnim(iMax, currentBottomOffset, i);
                return;
            }
            FloatValueHolder floatValueHolder = this.mOffsetValueHolder;
            int value = (int) (floatValueHolder != null ? floatValueHolder.getValue() : currentBottomOffset);
            this.mAnimMaxMargin = iMax;
            this.mAnimStartOffset = value;
            this.mAnimTargetOffset = i;
            this.mAnimStartBottomMargin = getCurrentBottomMargin(view);
            this.mAnimStartPaddingBottom = viewFindViewById.getPaddingBottom();
            this.mAnimTargetBottomMargin = Math.min(i, iMax);
            this.mAnimTargetPaddingBottom = Math.max(i - iMax, 0);
            FloatValueHolder floatValueHolder2 = this.mOffsetValueHolder;
            if (floatValueHolder2 != null) {
                floatValueHolder2.setValue(value);
            }
            this.mOffsetSpringAnimation.x(i);
        }
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    @RequiresApi(api = 30)
    public void adjustResize(Context context, ViewGroup viewGroup, WindowInsets windowInsets, View view, boolean z) {
        if (z) {
            int iMax = Math.max(0, windowInsets.getInsets(WindowInsets.Type.ime()).bottom - windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom);
            if (iMax != this.mCurrentKeyboardHeight) {
                this.mCurrentKeyboardHeight = iMax;
                setMarginBottomTo(viewGroup, iMax, windowInsets, view);
            } else {
                Log.w(TAG, "keyboardHeight is the same size, keyboardHeight :" + iMax);
            }
        }
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public int getMarginBottomValue() {
        return -1;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public int getPaddingBottomOffset() {
        return -1;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public float getTranslateOffset() {
        return -1.0f;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public int getWindowType() {
        return this.mWindowType;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public void recoveryScrollingParentViewPaddingBottom(COUIPanelContentLayout cOUIPanelContentLayout) {
        if (cOUIPanelContentLayout != null) {
            cOUIPanelContentLayout.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public boolean releaseData() {
        resetInnerStatus();
        b bVar = this.mOffsetSpringAnimation;
        if (bVar != null && bVar.i()) {
            this.mOffsetSpringAnimation.c();
            this.mOffsetSpringAnimation = null;
        }
        this.mOffsetValueHolder = null;
        resetPaddingAndMargin();
        this.mCurrentKeyboardHeight = 0;
        this.mBottomMarginOfDesignBottomSheet = 0;
        this.mLastBottomDesignSheetOrPanelContentLayout = null;
        this.mLastCouiPanelContentLayout = null;
        return true;
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public void resetInnerStatus() {
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public void setIgnoreHideKeyboardAnim(boolean z) {
    }

    @Override // com.coui.appcompat.panel.COUIAbsPanelAdjustResizeHelper
    public void setWindowType(int i) {
        this.mWindowType = i;
    }
}

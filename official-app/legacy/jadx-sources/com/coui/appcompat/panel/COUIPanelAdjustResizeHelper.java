package com.coui.appcompat.panel;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPanelAdjustResizeHelper {
    private COUIAbsPanelAdjustResizeHelper mAdjustHelper;

    public COUIPanelAdjustResizeHelper() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mAdjustHelper = new COUIPanelAdjustResizeHelperAfterR();
        } else {
            this.mAdjustHelper = new COUIPanelAdjustResizeHelperBeforeR();
        }
    }

    public void adjustResize(Context context, ViewGroup viewGroup, WindowInsets windowInsets, View view, boolean z) {
        this.mAdjustHelper.adjustResize(context, viewGroup, windowInsets, view, z);
    }

    public int getMarginBottomValue() {
        return this.mAdjustHelper.getMarginBottomValue();
    }

    public int getPaddingBottomOffset() {
        return this.mAdjustHelper.getPaddingBottomOffset();
    }

    public float getTranslateOffset() {
        return this.mAdjustHelper.getTranslateOffset();
    }

    public int getWindowType() {
        return this.mAdjustHelper.getWindowType();
    }

    public void recoveryScrollingParentViewPaddingBottom(COUIPanelContentLayout cOUIPanelContentLayout) {
        this.mAdjustHelper.recoveryScrollingParentViewPaddingBottom(cOUIPanelContentLayout);
    }

    public boolean releaseData() {
        return this.mAdjustHelper.releaseData();
    }

    public void resetInnerStatus() {
        this.mAdjustHelper.resetInnerStatus();
    }

    public void setCouiPanelEdgeToEdgeEnable(boolean z) {
        this.mAdjustHelper.setCouiPanelEdgeToEdgeEnable(z);
    }

    public void setIgnoreHideKeyboardAnim(boolean z) {
        this.mAdjustHelper.setIgnoreHideKeyboardAnim(z);
    }

    public void setWindowType(int i) {
        this.mAdjustHelper.setWindowType(i);
    }
}

package com.heytap.nearx.uikit.widget.panel;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes18.dex */
public class NearPanelAdjustResizeHelper {
    private NearAbsPanelAdjustResizeHelper mAdjustHelper;

    public NearPanelAdjustResizeHelper() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mAdjustHelper = new NearPanelAdjustResizeHelperAfterR();
        } else {
            this.mAdjustHelper = new NearPanelAdjustResizeHelperBeforeR();
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

    public void recoveryScrollingParentViewPaddingBottom(NearPanelContentLayout nearPanelContentLayout) {
        this.mAdjustHelper.recoveryScrollingParentViewPaddingBottom(nearPanelContentLayout);
    }

    public boolean releaseData() {
        return this.mAdjustHelper.releaseData();
    }

    public void resetInnerStatus() {
        this.mAdjustHelper.resetInnerStatus();
    }

    public void setIgnoreHideKeyboardAnim(boolean z) {
        this.mAdjustHelper.setIgnoreHideKeyboardAnim(z);
    }

    public void setWindowType(int i) {
        this.mAdjustHelper.setWindowType(i);
    }
}

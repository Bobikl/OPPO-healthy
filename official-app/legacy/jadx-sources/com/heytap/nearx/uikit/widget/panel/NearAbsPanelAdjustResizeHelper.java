package com.heytap.nearx.uikit.widget.panel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes18.dex */
public abstract class NearAbsPanelAdjustResizeHelper {
    public void adjustResize(Context context, ViewGroup viewGroup, WindowInsets windowInsets, View view, boolean z) {
    }

    public int getMarginBottomValue() {
        return -1;
    }

    public int getPaddingBottomOffset() {
        return -1;
    }

    public float getTranslateOffset() {
        return -1.0f;
    }

    public int getWindowType() {
        return -1;
    }

    public void recoveryScrollingParentViewPaddingBottom(NearPanelContentLayout nearPanelContentLayout) {
    }

    public boolean releaseData() {
        return false;
    }

    public void resetInnerStatus() {
    }

    public void setIgnoreHideKeyboardAnim(boolean z) {
    }

    public void setWindowType(int i) {
    }
}

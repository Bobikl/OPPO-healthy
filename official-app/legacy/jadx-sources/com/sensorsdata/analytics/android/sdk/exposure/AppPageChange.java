package com.sensorsdata.analytics.android.sdk.exposure;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewTreeObserver;
import com.sensorsdata.analytics.android.sdk.SALog;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"NewApi"})
public class AppPageChange implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnWindowFocusChangeListener {
    private static final String TAG = "SA.AppPageChange";
    private final ExposedTransform.LayoutCallBack mLayoutCallBack;

    public AppPageChange(ExposedTransform.LayoutCallBack layoutCallBack) {
        this.mLayoutCallBack = layoutCallBack;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        SALog.i(TAG, "onGlobalFocusChanged");
        this.mLayoutCallBack.viewLayoutChange();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        SALog.i(TAG, "onGlobalLayout");
        this.mLayoutCallBack.viewLayoutChange();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        SALog.i(TAG, "onScrollChanged");
        this.mLayoutCallBack.viewLayoutChange();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z) {
        SALog.i(TAG, "onWindowFocusChanged");
        this.mLayoutCallBack.viewLayoutChange();
    }
}

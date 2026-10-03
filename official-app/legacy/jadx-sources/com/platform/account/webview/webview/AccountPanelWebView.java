package com.platform.account.webview.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class AccountPanelWebView extends AccountWebView {
    public int k;

    public AccountPanelWebView(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.k;
        if (i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setFixHeight(int i) {
        this.k = i;
        requestLayout();
        invalidate();
    }

    public AccountPanelWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountPanelWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

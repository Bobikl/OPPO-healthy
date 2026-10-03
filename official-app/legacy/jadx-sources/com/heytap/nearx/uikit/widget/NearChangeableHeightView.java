package com.heytap.nearx.uikit.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes18.dex */
public class NearChangeableHeightView {
    private View view;

    public NearChangeableHeightView(View view) {
        this.view = view;
    }

    public int getHeight() {
        View view = this.view;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    public void setHeight(int i) {
        View view = this.view;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            this.view.setLayoutParams(layoutParams);
        }
    }
}

package com.heytap.health.base.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SmoothViewPager extends ViewPager {
    public SmoothViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, true);
    }

    public SmoothViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

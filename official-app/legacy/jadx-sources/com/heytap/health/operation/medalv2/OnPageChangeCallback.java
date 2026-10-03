package com.heytap.health.operation.medalv2;

import androidx.viewpager.widget.ViewPager;
import com.coui.appcompat.indicator.COUIPageIndicator;

/* JADX INFO: loaded from: classes17.dex */
public class OnPageChangeCallback implements ViewPager.OnPageChangeListener {
    public COUIPageIndicator i;

    public OnPageChangeCallback(COUIPageIndicator cOUIPageIndicator) {
        this.i = cOUIPageIndicator;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        COUIPageIndicator cOUIPageIndicator = this.i;
        if (cOUIPageIndicator != null) {
            cOUIPageIndicator.q(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        COUIPageIndicator cOUIPageIndicator = this.i;
        if (cOUIPageIndicator != null) {
            cOUIPageIndicator.r(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        COUIPageIndicator cOUIPageIndicator = this.i;
        if (cOUIPageIndicator != null) {
            cOUIPageIndicator.s(i);
        }
    }
}

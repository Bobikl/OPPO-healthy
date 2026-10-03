package com.coui.appcompat.viewpager;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPageTransformerAdapter extends ViewPager2.OnPageChangeCallback {
    public final LinearLayoutManager i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewPager2.PageTransformer f2158j;

    public COUIPageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.i = linearLayoutManager;
    }

    public ViewPager2.PageTransformer getPageTransformer() {
        return this.f2158j;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f2158j == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.i.getChildCount(); i3++) {
            View childAt = this.i.getChildAt(i3);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.i.getChildCount())));
            }
            this.f2158j.transformPage(childAt, (this.i.getPosition(childAt) - i) + f2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
    }

    public void setPageTransformer(@Nullable ViewPager2.PageTransformer pageTransformer) {
        this.f2158j = pageTransformer;
    }
}

package com.coui.appcompat.viewpager;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes13.dex */
public class COUIMarginPageTransformer implements ViewPager2.PageTransformer {
    public final int a;

    public final COUIViewPager2 a(@NonNull View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof COUIViewPager2)) {
            return (COUIViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NonNull View view, float f) {
        COUIViewPager2 cOUIViewPager2A = a(view);
        float f2 = this.a * f;
        if (cOUIViewPager2A.getOrientation() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (cOUIViewPager2A.m()) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }
}

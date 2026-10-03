package com.coui.appcompat.banner;

import androidx.annotation.Px;
import androidx.viewpager2.widget.ViewPager2;
import com.oplus.aiunit.vision.kf2;
import com.support.nearx.R$id;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class COUIBannerOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
    public WeakReference<COUIBanner> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1541j = -1;
    public boolean k;

    public COUIBannerOnPageChangeCallback(COUIBanner cOUIBanner) {
        this.i = new WeakReference<>(cOUIBanner);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
        if (this.i.get() == null) {
            return;
        }
        COUIBanner cOUIBanner = this.i.get();
        if (i == 1 || i == 2) {
            this.k = true;
        } else if (i == 0) {
            this.k = false;
            if (this.f1541j != -1 && cOUIBanner.isInfiniteLoop()) {
                int i2 = this.f1541j;
                if (i2 == 0) {
                    cOUIBanner.setCurrentItem(cOUIBanner.getRealCount(), false);
                } else if (i2 == cOUIBanner.getItemCount() - 1) {
                    cOUIBanner.setCurrentItem(1, false);
                }
            }
        }
        if (cOUIBanner.getOnPageChangeCallback() != null) {
            cOUIBanner.getOnPageChangeCallback().onPageScrollStateChanged(i);
        }
        if (cOUIBanner.getIndicator() != null) {
            if (((ViewPager2) cOUIBanner.findViewById(R$id.viewpager)).isFakeDragging() && i == 1) {
                i = 2;
            }
            cOUIBanner.getIndicator().y(i);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, @Px int i2) {
        if (this.i.get() == null) {
            return;
        }
        COUIBanner cOUIBanner = this.i.get();
        int iA = kf2.a(cOUIBanner.isInfiniteLoop(), i, cOUIBanner.getRealCount());
        if (cOUIBanner.getOnPageChangeCallback() != null && iA == cOUIBanner.getCurrentItem() - 1) {
            cOUIBanner.getOnPageChangeCallback().onPageScrolled(iA, f, i2);
        }
        cOUIBanner.getIndicator().z(iA, f, i2);
        if (iA == 0 && cOUIBanner.getCurrentItem() == 1 && f == 0.0f) {
            cOUIBanner.getIndicator().setCurrentPosition(iA);
        } else if (iA == cOUIBanner.getRealCount() - 1 && f == 0.0f) {
            cOUIBanner.getIndicator().setCurrentPosition(iA);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
        if (this.i.get() == null) {
            return;
        }
        COUIBanner cOUIBanner = this.i.get();
        if (this.k) {
            this.f1541j = i;
            int iA = kf2.a(cOUIBanner.isInfiniteLoop(), i, cOUIBanner.getRealCount());
            if (cOUIBanner.getOnPageChangeCallback() != null) {
                cOUIBanner.getOnPageChangeCallback().onPageSelected(iA);
            }
            if (cOUIBanner.getIndicator() != null) {
                cOUIBanner.getIndicator().A(iA);
            }
        }
    }
}

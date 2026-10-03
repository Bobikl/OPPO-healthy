package com.heytap.nearx.uikit.widget.banner;

import androidx.annotation.Px;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.nearx.uikit.R$id;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class NearBannerOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
    private boolean isScrolled;
    private WeakReference<NearBanner> mBannerWeakReference;
    private int mTempPosition = -1;

    public NearBannerOnPageChangeCallback(NearBanner nearBanner) {
        this.mBannerWeakReference = new WeakReference<>(nearBanner);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
        if (this.mBannerWeakReference.get() == null) {
            return;
        }
        NearBanner nearBanner = this.mBannerWeakReference.get();
        if (i == 1 || i == 2) {
            this.isScrolled = true;
        } else if (i == 0) {
            this.isScrolled = false;
            if (this.mTempPosition != -1 && nearBanner.isInfiniteLoop()) {
                int i2 = this.mTempPosition;
                if (i2 == 0) {
                    nearBanner.setCurrentItem(nearBanner.getRealCount(), false);
                } else if (i2 == nearBanner.getItemCount() - 1) {
                    nearBanner.setCurrentItem(1, false);
                }
            }
        }
        if (nearBanner.getOnPageChangeCallback() != null) {
            nearBanner.getOnPageChangeCallback().onPageScrollStateChanged(i);
        }
        if (nearBanner.getIndicator() != null) {
            if (((ViewPager2) nearBanner.findViewById(R$id.viewpager)).isFakeDragging() && i == 1) {
                i = 2;
            }
            nearBanner.getIndicator().onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, @Px int i2) {
        if (this.mBannerWeakReference.get() == null) {
            return;
        }
        NearBanner nearBanner = this.mBannerWeakReference.get();
        int realPosition = NearBannerUtil.getRealPosition(nearBanner.isInfiniteLoop(), i, nearBanner.getRealCount());
        if (nearBanner.getOnPageChangeCallback() != null && realPosition == nearBanner.getCurrentItem() - 1) {
            nearBanner.getOnPageChangeCallback().onPageScrolled(realPosition, f, i2);
        }
        nearBanner.getIndicator().onPageScrolled(realPosition, f, i2);
        if (realPosition == 0 && nearBanner.getCurrentItem() == 1 && f == 0.0f) {
            nearBanner.getIndicator().setCurrentPosition(realPosition);
        } else if (realPosition == nearBanner.getRealCount() - 1 && f == 0.0f) {
            nearBanner.getIndicator().setCurrentPosition(realPosition);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
        if (this.mBannerWeakReference.get() == null) {
            return;
        }
        NearBanner nearBanner = this.mBannerWeakReference.get();
        if (this.isScrolled) {
            this.mTempPosition = i;
            int realPosition = NearBannerUtil.getRealPosition(nearBanner.isInfiniteLoop(), i, nearBanner.getRealCount());
            if (nearBanner.getOnPageChangeCallback() != null) {
                nearBanner.getOnPageChangeCallback().onPageSelected(realPosition);
            }
            if (nearBanner.getIndicator() != null) {
                nearBanner.getIndicator().onPageSelected(realPosition);
            }
        }
    }
}

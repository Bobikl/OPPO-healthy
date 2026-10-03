package com.oplus.aiunit.vision;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes13.dex */
public class an2 extends vk2<ViewPager> {
    public an2(ViewPager viewPager) {
        super(viewPager);
    }

    @Override // com.oplus.aiunit.vision.fx9
    public boolean a(int i, int i2) {
        if (i == 1) {
            return false;
        }
        return ((ViewPager) this.a).canScrollHorizontally((int) (-Math.signum(i2)));
    }

    @Override // com.oplus.aiunit.vision.fx9
    public int getOrientation() {
        return 0;
    }
}

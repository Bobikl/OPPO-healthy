package com.oplus.aiunit.vision;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes18.dex */
public class bmc extends vkc<ViewPager> {
    public bmc(ViewPager viewPager) {
        super(viewPager);
    }

    @Override // com.oplus.aiunit.vision.ex9
    public boolean a(int i, int i2) {
        if (i == 1) {
            return false;
        }
        return ((ViewPager) this.a).canScrollHorizontally((int) (-Math.signum(i2)));
    }

    @Override // com.oplus.aiunit.vision.ex9
    public int getOrientation() {
        return 0;
    }
}

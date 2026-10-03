package com.oplus.aiunit.vision;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes18.dex */
public class amc extends vkc<ViewPager2> {
    public amc(ViewPager2 viewPager2) {
        super(viewPager2);
    }

    @Override // com.oplus.aiunit.vision.ex9
    public boolean a(int i, int i2) {
        int i3 = (int) (-Math.signum(i2));
        return i == 0 ? ((ViewPager2) this.a).canScrollHorizontally(i3) : ((ViewPager2) this.a).canScrollVertically(i3);
    }

    @Override // com.oplus.aiunit.vision.ex9
    public int getOrientation() {
        return ((ViewPager2) this.a).getOrientation();
    }
}

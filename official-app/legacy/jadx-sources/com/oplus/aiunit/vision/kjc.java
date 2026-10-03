package com.oplus.aiunit.vision;

import com.heytap.nearx.uikit.widget.viewPager.NearViewPager;

/* JADX INFO: loaded from: classes18.dex */
public class kjc extends vkc<NearViewPager> {
    public kjc(NearViewPager nearViewPager) {
        super(nearViewPager);
    }

    @Override // com.oplus.aiunit.vision.ex9
    public boolean a(int i, int i2) {
        int i3 = (int) (-Math.signum(i2));
        return i == 1 ? ((NearViewPager) this.a).canScrollVertically(i3) : ((NearViewPager) this.a).canScrollHorizontally(i3);
    }

    @Override // com.oplus.aiunit.vision.ex9
    public int getOrientation() {
        return ((NearViewPager) this.a).getOrientation();
    }
}

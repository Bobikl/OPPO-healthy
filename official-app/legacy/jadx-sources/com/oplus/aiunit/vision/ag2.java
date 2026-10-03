package com.oplus.aiunit.vision;

import com.coui.appcompat.viewpager.COUIViewPager2;

/* JADX INFO: loaded from: classes13.dex */
public class ag2 extends vk2<COUIViewPager2> {
    public ag2(COUIViewPager2 cOUIViewPager2) {
        super(cOUIViewPager2);
    }

    @Override // com.oplus.aiunit.vision.fx9
    public boolean a(int i, int i2) {
        int i3 = (int) (-Math.signum(i2));
        return getOrientation() == 0 ? ((COUIViewPager2) this.a).canScrollHorizontally(i3) : ((COUIViewPager2) this.a).canScrollVertically(i3);
    }

    @Override // com.oplus.aiunit.vision.fx9
    public int getOrientation() {
        return ((COUIViewPager2) this.a).getOrientation();
    }
}

package com.oplus.aiunit.vision;

import android.widget.ScrollView;

/* JADX INFO: loaded from: classes13.dex */
public class tk2 extends vk2<ScrollView> {
    public tk2(ScrollView scrollView) {
        super(scrollView);
    }

    @Override // com.oplus.aiunit.vision.fx9
    public boolean a(int i, int i2) {
        if (i == 0) {
            return false;
        }
        return ((ScrollView) this.a).canScrollVertically((int) (-Math.signum(i2)));
    }

    @Override // com.oplus.aiunit.vision.fx9
    public int getOrientation() {
        return 1;
    }
}

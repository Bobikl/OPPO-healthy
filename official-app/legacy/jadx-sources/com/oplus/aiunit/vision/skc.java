package com.oplus.aiunit.vision;

import android.widget.ScrollView;

/* JADX INFO: loaded from: classes18.dex */
public class skc extends vkc<ScrollView> {
    public skc(ScrollView scrollView) {
        super(scrollView);
    }

    @Override // com.oplus.aiunit.vision.ex9
    public boolean a(int i, int i2) {
        if (i == 0) {
            return false;
        }
        return ((ScrollView) this.a).canScrollVertically((int) (-Math.signum(i2)));
    }

    @Override // com.oplus.aiunit.vision.ex9
    public int getOrientation() {
        return 1;
    }
}

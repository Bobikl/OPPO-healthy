package com.oplus.aiunit.vision;

import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes13.dex */
public class ij2 extends vk2<NestedScrollView> {
    public ij2(NestedScrollView nestedScrollView) {
        super(nestedScrollView);
    }

    @Override // com.oplus.aiunit.vision.fx9
    public boolean a(int i, int i2) {
        if (i == 0) {
            return false;
        }
        return ((NestedScrollView) this.a).canScrollVertically((int) (-Math.signum(i2)));
    }

    @Override // com.oplus.aiunit.vision.fx9
    public int getOrientation() {
        return 1;
    }
}

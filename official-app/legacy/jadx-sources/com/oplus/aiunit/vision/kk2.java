package com.oplus.aiunit.vision;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class kk2 extends vk2<RecyclerView> {
    public kk2(RecyclerView recyclerView) {
        super(recyclerView);
    }

    @Override // com.oplus.aiunit.vision.fx9
    public boolean a(int i, int i2) {
        int i3 = (int) (-Math.signum(i2));
        return i == 1 ? ((RecyclerView) this.a).canScrollVertically(i3) : ((RecyclerView) this.a).canScrollHorizontally(i3);
    }

    @Override // com.oplus.aiunit.vision.fx9
    public int getOrientation() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) this.a).getLayoutManager();
        if (linearLayoutManager != null) {
            return linearLayoutManager.getOrientation();
        }
        return 1;
    }
}

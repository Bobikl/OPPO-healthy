package com.oplus.aiunit.vision;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes18.dex */
public class hkc extends vkc<RecyclerView> {
    public hkc(RecyclerView recyclerView) {
        super(recyclerView);
    }

    @Override // com.oplus.aiunit.vision.ex9
    public boolean a(int i, int i2) {
        int i3 = (int) (-Math.signum(i2));
        return i == 1 ? ((RecyclerView) this.a).canScrollVertically(i3) : ((RecyclerView) this.a).canScrollHorizontally(i3);
    }

    @Override // com.oplus.aiunit.vision.ex9
    public int getOrientation() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) this.a).getLayoutManager();
        if (linearLayoutManager != null) {
            return linearLayoutManager.getOrientation();
        }
        return 1;
    }
}

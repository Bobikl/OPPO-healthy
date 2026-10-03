package com.heytap.sporthealth.blib.weiget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.yha;

/* JADX INFO: loaded from: classes2.dex */
public class JLinearLayoutManager extends LinearLayoutManager {
    public JLinearLayoutManager() {
        super(rg7.h());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            yha.a(a7b.e(e2));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            yha.a(a7b.e(e2));
            return 0;
        }
    }

    public JLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public JLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

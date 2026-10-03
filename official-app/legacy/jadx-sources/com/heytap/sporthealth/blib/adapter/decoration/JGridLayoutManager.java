package com.heytap.sporthealth.blib.adapter.decoration;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.a7b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class JGridLayoutManager extends GridLayoutManager {
    public JGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            a7b.b("JGridLayoutManager", "IndexOutOfBoundsException e" + e2.getMessage());
        }
    }

    public JGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public JGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }
}

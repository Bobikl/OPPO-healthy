package com.heytap.health.watchface.business.legacy.main.util;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
public class NoCrashGridLayoutManager extends GridLayoutManager {
    public static final String TAG = "NoCrashGridLayoutManager";

    public NoCrashGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e2) {
            ltl.j(TAG, "[onLayoutChildren] --> error=", e2);
        }
    }

    public NoCrashGridLayoutManager(Context context, int i) {
        super(context, i);
    }
}

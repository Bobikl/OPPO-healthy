package com.heytap.health.watchface.business.legacy.main.util;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
public class NoCrashLinearLayoutManager extends LinearLayoutManager {
    public static final String TAG = "NoCrashLinearLayoutManager";

    public NoCrashLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e2) {
            ltl.b("NoCrashLinearLayoutManager", "[onLayoutChildren] --> error=" + e2.getMessage());
        }
    }

    public NoCrashLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public NoCrashLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

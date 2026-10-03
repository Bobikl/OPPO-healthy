package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes12.dex */
public class COUIPanelPreferenceLinearLayoutManager extends LinearLayoutManager {
    public COUIPanelPreferenceLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return super.computeVerticalScrollOffset(state) + this.mRecyclerView.getScrollY();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return super.computeVerticalScrollRange(state) + this.mRecyclerView.getScrollY();
    }

    public COUIPanelPreferenceLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public COUIPanelPreferenceLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes12.dex */
public class NearLinearLayoutManager extends LinearLayoutManager {
    public NearLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        super.scrollToPositionWithOffset(i, i2 - this.mRecyclerView.getPaddingTop());
    }

    public NearLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public NearLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

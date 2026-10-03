package com.heytap.store.base.widget.recycler;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"getSnapPosition", "", "Landroidx/recyclerview/widget/SnapHelper;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SnapOnScrollListenerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSnapPosition(SnapHelper snapHelper, RecyclerView recyclerView) {
        View viewFindSnapView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (viewFindSnapView = snapHelper.findSnapView(layoutManager)) == null) {
            return -1;
        }
        return layoutManager.getPosition(viewFindSnapView);
    }
}

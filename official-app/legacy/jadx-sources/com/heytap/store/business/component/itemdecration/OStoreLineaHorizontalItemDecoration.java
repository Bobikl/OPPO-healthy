package com.heytap.store.business.component.itemdecration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/business/component/itemdecration/OStoreLineaHorizontalItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "horizontalSpacing", "", "startSpacing", "endSpacing", "topSpacing", "bottomSpacing", "(IIIII)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreLineaHorizontalItemDecoration extends RecyclerView.ItemDecoration {
    private final int bottomSpacing;
    private final int endSpacing;
    private final int horizontalSpacing;
    private final int startSpacing;
    private final int topSpacing;

    public OStoreLineaHorizontalItemDecoration() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.Adapter adapter = parent.getAdapter();
        Integer numValueOf = adapter == null ? null : Integer.valueOf(adapter.getItemCount());
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        outRect.right = childLayoutPosition >= iIntValue + (-1) ? this.endSpacing : this.horizontalSpacing;
        outRect.left = childLayoutPosition == 0 ? this.startSpacing : 0;
        outRect.top = this.topSpacing;
        outRect.bottom = this.bottomSpacing;
    }

    public /* synthetic */ OStoreLineaHorizontalItemDecoration(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }

    public OStoreLineaHorizontalItemDecoration(int i, int i2, int i3, int i4, int i5) {
        this.horizontalSpacing = i;
        this.startSpacing = i2;
        this.endSpacing = i3;
        this.topSpacing = i4;
        this.bottomSpacing = i5;
    }
}

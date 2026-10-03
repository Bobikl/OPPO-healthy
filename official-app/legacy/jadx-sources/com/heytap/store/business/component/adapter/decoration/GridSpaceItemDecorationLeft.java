package com.heytap.store.business.component.adapter.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.databaseengine.apiv3.data.Element;
import com.oplus.smartenginehelper.entity.TextEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/business/component/adapter/decoration/GridSpaceItemDecorationLeft;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", Element.ELEMENT_NAME_TOTAL, "", "start", TextEntity.ELLIPSIZE_END, "top", "bottom", "horizontalSpacing", "verticalSpacing", "(IIIIIII)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class GridSpaceItemDecorationLeft extends RecyclerView.ItemDecoration {
    private final int bottom;
    private final int end;
    private final int horizontalSpacing;
    private final int start;
    private final int top;
    private final int total;
    private final int verticalSpacing;

    public GridSpaceItemDecorationLeft() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (!(linearLayoutManager != null && linearLayoutManager.canScrollVertically())) {
            outRect.top = this.top;
            if (childLayoutPosition == 0) {
                outRect.left = this.start;
                outRect.right = this.horizontalSpacing / 2;
            } else if (childLayoutPosition == this.total - 1) {
                outRect.left = this.horizontalSpacing / 2;
                outRect.right = this.end;
            } else {
                int i = this.horizontalSpacing;
                outRect.left = i / 2;
                outRect.right = i / 2;
            }
            outRect.bottom = this.bottom;
            return;
        }
        if (childLayoutPosition == 0 || childLayoutPosition == 1) {
            outRect.top = this.top;
        } else {
            outRect.top = 0;
        }
        if (childLayoutPosition % 2 == 0) {
            outRect.left = this.start;
            outRect.right = this.horizontalSpacing / 2;
        } else {
            outRect.left = this.horizontalSpacing / 2;
            outRect.right = this.end;
        }
        int iCeil = (int) Math.ceil(((double) this.total) / ((double) 2));
        int i2 = (childLayoutPosition + 2) / 2;
        if (this.total <= 0 || i2 != iCeil) {
            outRect.bottom = this.verticalSpacing;
        } else {
            outRect.bottom = this.bottom;
        }
    }

    public /* synthetic */ GridSpaceItemDecorationLeft(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }

    public GridSpaceItemDecorationLeft(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.total = i;
        this.start = i2;
        this.end = i3;
        this.top = i4;
        this.bottom = i5;
        this.horizontalSpacing = i6;
        this.verticalSpacing = i7;
    }
}

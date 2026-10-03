package com.heytap.store.business.component.adapter.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.core.text.TextUtilsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.smartenginehelper.entity.TextEntity;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/business/component/adapter/decoration/GridSpaceItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "start", "", TextEntity.ELLIPSIZE_END, "top", "bottom", "horizontalSpacing", "verticalSpacing", "(IIIIII)V", "calculateBottomOffsets", "nMinusOne", "verticalSizeAvg", "calculateEndOffset", "horizontalSizeAvg", "calculateOffset", "initialValue", "commonDifference", "calculateStartOffsets", "calculateTopOffsets", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class GridSpaceItemDecoration extends RecyclerView.ItemDecoration {
    private final int bottom;
    private final int end;
    private final int horizontalSpacing;
    private final int start;
    private final int top;
    private final int verticalSpacing;

    public GridSpaceItemDecoration() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    private final int calculateBottomOffsets(int nMinusOne, int verticalSizeAvg) {
        return calculateOffset(this.bottom, nMinusOne, this.verticalSpacing - verticalSizeAvg);
    }

    private final int calculateEndOffset(int nMinusOne, int horizontalSizeAvg) {
        return calculateOffset(this.end, nMinusOne, this.horizontalSpacing - horizontalSizeAvg);
    }

    private final int calculateOffset(int initialValue, int nMinusOne, int commonDifference) {
        return initialValue + (nMinusOne * commonDifference);
    }

    private final int calculateStartOffsets(int nMinusOne, int horizontalSizeAvg) {
        return calculateOffset(this.start, nMinusOne, this.horizontalSpacing - horizontalSizeAvg);
    }

    private final int calculateTopOffsets(int nMinusOne, int verticalSizeAvg) {
        return calculateOffset(this.top, nMinusOne, this.verticalSpacing - verticalSizeAvg);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        int spanCount = gridLayoutManager.getSpanCount();
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
        int spanSize = spanSizeLookup.getSpanSize(childLayoutPosition);
        int spanIndex = spanSizeLookup.getSpanIndex(childLayoutPosition, spanCount);
        int spanGroupIndex = spanSizeLookup.getSpanGroupIndex(childLayoutPosition, spanCount);
        boolean z = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        int spanGroupIndex2 = spanSizeLookup.getSpanGroupIndex(iIntValue - 1, spanCount) + 1;
        int i = spanGroupIndex2 - 1;
        int i2 = ((this.top + this.bottom) + (this.verticalSpacing * i)) / spanGroupIndex2;
        int i3 = spanCount - 1;
        int i4 = ((this.start + this.end) + (this.horizontalSpacing * i3)) / spanCount;
        int iCalculateStartOffsets = calculateStartOffsets(spanIndex, i4);
        int iCalculateEndOffset = calculateEndOffset(i3 - ((spanIndex + spanSize) - 1), i4);
        int iCalculateTopOffsets = calculateTopOffsets(spanGroupIndex, i2);
        int iCalculateBottomOffsets = calculateBottomOffsets(i - spanGroupIndex, i2);
        Pair pair = z ? TuplesKt.to(Integer.valueOf(iCalculateEndOffset), Integer.valueOf(iCalculateStartOffsets)) : TuplesKt.to(Integer.valueOf(iCalculateStartOffsets), Integer.valueOf(iCalculateEndOffset));
        outRect.set(((Number) pair.component1()).intValue(), iCalculateTopOffsets, ((Number) pair.component2()).intValue(), iCalculateBottomOffsets);
    }

    public /* synthetic */ GridSpaceItemDecoration(int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }

    public GridSpaceItemDecoration(int i, int i2, int i3, int i4, int i5, int i6) {
        this.start = i;
        this.end = i2;
        this.top = i3;
        this.bottom = i4;
        this.horizontalSpacing = i5;
        this.verticalSpacing = i6;
    }
}

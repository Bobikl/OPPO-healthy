package com.heytap.store.homemodule.adapter.viewholder;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/homemodule/adapter/viewholder/MultiScrollItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", ParserTag.SPAN_COUNT, "", "spaces", "", "(I[Ljava/lang/Integer;)V", "getSpaces", "()[Ljava/lang/Integer;", "setSpaces", "([Ljava/lang/Integer;)V", "[Ljava/lang/Integer;", "getSpanCount", "()I", "setSpanCount", "(I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class MultiScrollItemDecoration extends RecyclerView.ItemDecoration {

    @NotNull
    private Integer[] spaces;
    private int spanCount;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiScrollItemDecoration() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.spaces.length < 6) {
            return;
        }
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        int itemCount = adapter == null ? Integer.MAX_VALUE : adapter.getItemCount();
        outRect.left = childLayoutPosition < this.spanCount ? this.spaces[4].intValue() : this.spaces[0].intValue();
        outRect.right = this.spanCount + childLayoutPosition >= itemCount ? this.spaces[5].intValue() : 0;
        outRect.top = (childLayoutPosition % this.spanCount) * (this.spaces[1].intValue() / this.spanCount);
        outRect.bottom = this.spaces[1].intValue() - (((childLayoutPosition % this.spanCount) + 1) * (this.spaces[1].intValue() / this.spanCount));
    }

    @NotNull
    public final Integer[] getSpaces() {
        return this.spaces;
    }

    public final int getSpanCount() {
        return this.spanCount;
    }

    public final void setSpaces(@NotNull Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<set-?>");
        this.spaces = numArr;
    }

    public final void setSpanCount(int i) {
        this.spanCount = i;
    }

    public MultiScrollItemDecoration(int i, @NotNull Integer[] spaces) {
        Intrinsics.checkNotNullParameter(spaces, "spaces");
        this.spanCount = i;
        this.spaces = spaces;
    }

    public /* synthetic */ MultiScrollItemDecoration(int i, Integer[] numArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? new Integer[0] : numArr);
    }
}

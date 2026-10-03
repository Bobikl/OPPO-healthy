package com.heytap.sporthealth.blib.helper;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.sporthealth.blib.weiget.jlayout.MultiStateLayout;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/LineItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "", "a", "Z", "isFold", "()Z", "", "b", "I", "getDp4", "()I", "dp4", "c", "getDp16", "dp16", "d", "getDp24", "dp24", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final class LineItemDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isFold;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int dp4;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int dp16;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int dp24;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.isFold) {
            view.measure(-2, -2);
            int i = this.dp24;
            outRect.left = i;
            outRect.right = i;
            outRect.bottom = MultiStateLayout.g(16.0f);
            return;
        }
        if (parent.getChildPosition(view) % 2 == 0) {
            outRect.left = this.dp24;
            outRect.right = this.dp4;
        } else {
            outRect.left = this.dp4;
            outRect.right = this.dp24;
        }
        outRect.bottom = this.dp16;
    }
}

package com.heytap.health.insight.ui.decoration;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.ejg;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/insight/ui/decoration/InsightItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "", "a", "I", "itemSpacing", "b", "topSpacing", "c", "bottomSpacing", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class InsightItemDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int itemSpacing;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int topSpacing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int bottomSpacing;

    public InsightItemDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemSpacing = ejg.a(context, 12.0f);
        this.topSpacing = ejg.a(context, 12.0f);
        this.bottomSpacing = ejg.a(context, 12.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int itemCount = state.getItemCount();
        if (childAdapterPosition < 0 || childAdapterPosition >= itemCount) {
            return;
        }
        if (childAdapterPosition == 0) {
            outRect.top = this.topSpacing;
        }
        if (childAdapterPosition == itemCount - 1) {
            outRect.bottom = this.bottomSpacing;
        } else {
            outRect.bottom = this.itemSpacing;
        }
    }
}

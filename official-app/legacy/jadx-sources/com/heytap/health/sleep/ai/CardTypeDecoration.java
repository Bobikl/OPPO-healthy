package com.heytap.health.sleep.ai;

import android.graphics.Canvas;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/sleep/ai/CardTypeDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "onDrawOver", "Lkotlin/Function2;", "", "a", "Lkotlin/jvm/functions/Function2;", "visiblePositionListener", "b", "I", "mFirstVisiblePosition", "mLastVisiblePosition", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class CardTypeDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function2<Integer, Integer, Unit> visiblePositionListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int mFirstVisiblePosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int mLastVisiblePosition;

    /* JADX WARN: Multi-variable type inference failed */
    public CardTypeDecoration(@NotNull Function2<? super Integer, ? super Integer, Unit> visiblePositionListener) {
        Intrinsics.checkNotNullParameter(visiblePositionListener, "visiblePositionListener");
        this.visiblePositionListener = visiblePositionListener;
        this.mFirstVisiblePosition = -1;
        this.mLastVisiblePosition = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas c2, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        LinearLayoutManager linearLayoutManager;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c2, parent, state);
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.checkNotNull(adapter);
        if (adapter.getItemCount() > 0 && parent.getChildCount() > 0 && (linearLayoutManager = (LinearLayoutManager) parent.getLayoutManager()) != null && this.mFirstVisiblePosition != linearLayoutManager.findFirstVisibleItemPosition()) {
            this.mFirstVisiblePosition = linearLayoutManager.findFirstVisibleItemPosition();
            this.mLastVisiblePosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            this.visiblePositionListener.invoke(Integer.valueOf(this.mFirstVisiblePosition), Integer.valueOf(this.mLastVisiblePosition));
        }
    }
}

package com.heytap.health.health_archives.adapter;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J8\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u000e\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/health_archives/adapter/DragItemAnimator;", "Landroidx/recyclerview/widget/DefaultItemAnimator;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "fromX", "fromY", "toX", "toY", "", "animateMove", "oldHolder", "newHolder", "animateChange", "a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getDraggedViewHolder", "()Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "draggedViewHolder", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class DragItemAnimator extends DefaultItemAnimator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public RecyclerView.ViewHolder draggedViewHolder;

    public DragItemAnimator() {
        setMoveDuration(150L);
        setChangeDuration(100L);
    }

    public final void a(@Nullable RecyclerView.ViewHolder viewHolder) {
        this.draggedViewHolder = viewHolder;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(@NotNull RecyclerView.ViewHolder oldHolder, @NotNull RecyclerView.ViewHolder newHolder, int fromX, int fromY, int toX, int toY) {
        Intrinsics.checkNotNullParameter(oldHolder, "oldHolder");
        Intrinsics.checkNotNullParameter(newHolder, "newHolder");
        RecyclerView.ViewHolder viewHolder = this.draggedViewHolder;
        if (oldHolder != viewHolder && newHolder != viewHolder) {
            return super.animateChange(oldHolder, newHolder, fromX, fromY, toX, toY);
        }
        if (oldHolder == newHolder) {
            dispatchChangeFinished(oldHolder, true);
        } else {
            dispatchChangeFinished(oldHolder, true);
            dispatchChangeFinished(newHolder, false);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(@NotNull RecyclerView.ViewHolder holder, int fromX, int fromY, int toX, int toY) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder != this.draggedViewHolder) {
            return super.animateMove(holder, fromX, fromY, toX, toY);
        }
        dispatchMoveFinished(holder);
        return false;
    }
}

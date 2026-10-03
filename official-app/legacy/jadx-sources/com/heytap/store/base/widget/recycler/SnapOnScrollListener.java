package com.heytap.store.base.widget.recycler;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.heytap.databaseengineservice.db.table.newsleep.HeartRateWarningBehavior;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016J \u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/base/widget/recycler/SnapOnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "snapHelper", "Landroidx/recyclerview/widget/SnapHelper;", HeartRateWarningBehavior.BEHAVIOR, "Lcom/heytap/store/base/widget/recycler/SnapOnScrollListener$Behavior;", "onSnapPositionChangeListener", "Lcom/heytap/store/base/widget/recycler/OnSnapPositionChangeListener;", "(Landroidx/recyclerview/widget/SnapHelper;Lcom/heytap/store/base/widget/recycler/SnapOnScrollListener$Behavior;Lcom/heytap/store/base/widget/recycler/OnSnapPositionChangeListener;)V", "snapPosition", "", "maybeNotifySnapPositionChange", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onScrollStateChanged", "newState", "onScrolled", "dx", "dy", "Behavior", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SnapOnScrollListener extends RecyclerView.OnScrollListener {

    @NotNull
    private Behavior behavior;

    @Nullable
    private OnSnapPositionChangeListener onSnapPositionChangeListener;

    @NotNull
    private final SnapHelper snapHelper;
    private int snapPosition;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/store/base/widget/recycler/SnapOnScrollListener$Behavior;", "", "(Ljava/lang/String;I)V", "NOTIFY_ON_SCROLL", "NOTIFY_ON_SCROLL_STATE_IDLE", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum Behavior {
        NOTIFY_ON_SCROLL,
        NOTIFY_ON_SCROLL_STATE_IDLE
    }

    public /* synthetic */ SnapOnScrollListener(SnapHelper snapHelper, Behavior behavior, OnSnapPositionChangeListener onSnapPositionChangeListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(snapHelper, (i & 2) != 0 ? Behavior.NOTIFY_ON_SCROLL : behavior, (i & 4) != 0 ? null : onSnapPositionChangeListener);
    }

    private final void maybeNotifySnapPositionChange(RecyclerView recyclerView) {
        int snapPosition = SnapOnScrollListenerKt.getSnapPosition(this.snapHelper, recyclerView);
        if (this.snapPosition != snapPosition) {
            OnSnapPositionChangeListener onSnapPositionChangeListener = this.onSnapPositionChangeListener;
            if (onSnapPositionChangeListener != null) {
                onSnapPositionChangeListener.onSnapPositionChange(snapPosition);
            }
            this.snapPosition = snapPosition;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.behavior == Behavior.NOTIFY_ON_SCROLL_STATE_IDLE && newState == 0) {
            maybeNotifySnapPositionChange(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.behavior == Behavior.NOTIFY_ON_SCROLL) {
            maybeNotifySnapPositionChange(recyclerView);
        }
    }

    public SnapOnScrollListener(@NotNull SnapHelper snapHelper, @NotNull Behavior behavior, @Nullable OnSnapPositionChangeListener onSnapPositionChangeListener) {
        Intrinsics.checkNotNullParameter(snapHelper, "snapHelper");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.snapHelper = snapHelper;
        this.behavior = behavior;
        this.onSnapPositionChangeListener = onSnapPositionChangeListener;
        this.snapPosition = -1;
    }
}

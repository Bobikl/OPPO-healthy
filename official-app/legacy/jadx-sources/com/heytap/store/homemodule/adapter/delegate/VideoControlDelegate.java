package com.heytap.store.homemodule.adapter.delegate;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.store.base.widget.recyclerview.BaseRViewHolder;
import com.heytap.store.homemodule.adapter.HolderStateWatcher;
import com.heytap.store.homemodule.data.HomeDataBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\u0016\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0016\u0010\u0016\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0016\u0010\u0017\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/homemodule/adapter/delegate/VideoControlDelegate;", "Lcom/heytap/store/homemodule/adapter/HolderStateWatcher;", "()V", "listener", "com/heytap/store/homemodule/adapter/delegate/VideoControlDelegate$listener$1", "Lcom/heytap/store/homemodule/adapter/delegate/VideoControlDelegate$listener$1;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "changeVideoViewPlayState", "", "shouldPlay", "", "destroy", "onAttachedToRecyclerView", "onDestroy", "onDetachedFromRecyclerView", "onEnterUserVision", "onLeaveUserVision", "onViewAttachToWindow", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "Lcom/heytap/store/base/widget/recyclerview/BaseRViewHolder;", "Lcom/heytap/store/homemodule/data/HomeDataBean;", "onViewDetachedFromWindow", "onViewRecycled", "updateVideoStatus", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoControlDelegate implements HolderStateWatcher {

    @NotNull
    private final VideoControlDelegate$listener$1 listener = new RecyclerView.OnScrollListener() { // from class: com.heytap.store.homemodule.adapter.delegate.VideoControlDelegate$listener$1
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                this.this$0.changeVideoViewPlayState(true);
            }
        }
    };

    @Nullable
    private RecyclerView recyclerView;

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeVideoViewPlayState(boolean shouldPlay) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        Intrinsics.checkNotNull(recyclerView);
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            RecyclerView recyclerView2 = this.recyclerView;
            Intrinsics.checkNotNull(recyclerView2);
            RecyclerView recyclerView3 = this.recyclerView;
            Intrinsics.checkNotNull(recyclerView3);
            RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView3.getChildAt(i));
            Intrinsics.checkNotNullExpressionValue(childViewHolder, "recyclerView!!.getChildV…clerView!!.getChildAt(i))");
            updateVideoStatus(childViewHolder, shouldPlay);
            i = i2;
        }
    }

    private final void destroy() {
        RecyclerView recyclerView = this.recyclerView;
        int i = 0;
        int childCount = recyclerView == null ? 0 : recyclerView.getChildCount();
        while (i < childCount) {
            int i2 = i + 1;
            RecyclerView recyclerView2 = this.recyclerView;
            View childAt = recyclerView2 == null ? null : recyclerView2.getChildAt(i);
            if (childAt != null) {
                RecyclerView recyclerView3 = this.recyclerView;
                RecyclerView.ViewHolder childViewHolder = recyclerView3 == null ? null : recyclerView3.getChildViewHolder(childAt);
                if (childViewHolder != null) {
                    VideoProvider videoProvider = childViewHolder instanceof VideoProvider ? (VideoProvider) childViewHolder : null;
                    if (videoProvider != null) {
                        videoProvider.destroy();
                    }
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateVideoStatus(RecyclerView.ViewHolder holder, boolean shouldPlay) {
        VideoProvider videoProvider = holder instanceof VideoProvider ? (VideoProvider) holder : null;
        if (videoProvider == null) {
            return;
        }
        if (!shouldPlay) {
            videoProvider.stopPlay();
            return;
        }
        Rect rect = new Rect();
        holder.itemView.getLocalVisibleRect(rect);
        if (rect.height() / holder.itemView.getHeight() < 0.1d) {
            videoProvider.stopPlay();
        } else {
            videoProvider.startPlay();
        }
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (!Intrinsics.areEqual(this.recyclerView, recyclerView) && (recyclerView2 = this.recyclerView) != null) {
            recyclerView2.removeOnScrollListener(this.listener);
        }
        this.recyclerView = recyclerView;
        recyclerView.addOnScrollListener(this.listener);
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onDestroy() {
        destroy();
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (Intrinsics.areEqual(recyclerView, this.recyclerView)) {
            recyclerView.removeOnScrollListener(this.listener);
        }
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onEnterUserVision() {
        super.onEnterUserVision();
        changeVideoViewPlayState(true);
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onLeaveUserVision() {
        super.onLeaveUserVision();
        changeVideoViewPlayState(false);
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onViewAttachToWindow(@NotNull BaseRViewHolder<HomeDataBean> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachToWindow(holder);
        updateVideoStatus(holder, true);
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onViewDetachedFromWindow(@NotNull BaseRViewHolder<HomeDataBean> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        updateVideoStatus(holder, false);
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onViewRecycled(@NotNull BaseRViewHolder<HomeDataBean> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        updateVideoStatus(holder, false);
    }
}

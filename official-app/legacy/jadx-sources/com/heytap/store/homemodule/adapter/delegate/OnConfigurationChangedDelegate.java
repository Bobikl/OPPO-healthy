package com.heytap.store.homemodule.adapter.delegate;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.store.base.widget.recyclerview.BaseRViewHolder;
import com.heytap.store.homemodule.adapter.HolderStateWatcher;
import com.heytap.store.homemodule.adapter.viewholder.MultiRecommendViewHolder;
import com.heytap.store.homemodule.data.HomeDataBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/heytap/store/homemodule/adapter/delegate/OnConfigurationChangedDelegate;", "Lcom/heytap/store/homemodule/adapter/HolderStateWatcher;", "()V", "globalLayoutListener", "com/heytap/store/homemodule/adapter/delegate/OnConfigurationChangedDelegate$globalLayoutListener$1", "Lcom/heytap/store/homemodule/adapter/delegate/OnConfigurationChangedDelegate$globalLayoutListener$1;", "onCofigChange", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onAttachedToRecyclerView", "", "onConfigurationChanged", "onDetachedFromRecyclerView", "onEnterUserVision", "onLeaveUserVision", "onViewAttachToWindow", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "Lcom/heytap/store/base/widget/recyclerview/BaseRViewHolder;", "Lcom/heytap/store/homemodule/data/HomeDataBean;", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OnConfigurationChangedDelegate implements HolderStateWatcher {

    @NotNull
    private final OnConfigurationChangedDelegate$globalLayoutListener$1 globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.store.homemodule.adapter.delegate.OnConfigurationChangedDelegate$globalLayoutListener$1
        private int height = -1;

        public final int getHeight() {
            return this.height;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerView recyclerView;
            if (this.this$0.recyclerView == null || (recyclerView = this.this$0.recyclerView) == null) {
                return;
            }
            OnConfigurationChangedDelegate onConfigurationChangedDelegate = this.this$0;
            if (getHeight() != recyclerView.getHeight()) {
                setHeight(recyclerView.getHeight());
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() + 1;
                int i = 0;
                while (i < iFindLastVisibleItemPosition) {
                    int i2 = i + 1;
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                    if (viewHolderFindViewHolderForAdapterPosition instanceof MultiRecommendViewHolder) {
                        ((MultiRecommendViewHolder) viewHolderFindViewHolderForAdapterPosition).onConfigurationChanged(onConfigurationChangedDelegate.recyclerView);
                    }
                    i = i2;
                }
            }
        }

        public final void setHeight(int i) {
            this.height = i;
        }
    };
    private boolean onCofigChange;

    @Nullable
    private RecyclerView recyclerView;

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
    }

    public final void onConfigurationChanged() {
        this.onCofigChange = true;
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.recyclerView = null;
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onEnterUserVision() {
        super.onEnterUserVision();
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onLeaveUserVision() {
        super.onLeaveUserVision();
    }

    @Override // com.heytap.store.homemodule.adapter.HolderStateWatcher
    public void onViewAttachToWindow(@NotNull BaseRViewHolder<HomeDataBean> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachToWindow(holder);
    }
}

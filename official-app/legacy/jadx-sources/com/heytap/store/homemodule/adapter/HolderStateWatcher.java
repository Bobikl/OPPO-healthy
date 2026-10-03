package com.heytap.store.homemodule.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.store.base.widget.recyclerview.BaseRViewHolder;
import com.heytap.store.homemodule.data.HomeDataBean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/adapter/HolderStateWatcher;", "", "afterBindViewHolder", "", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "Lcom/heytap/store/base/widget/recyclerview/BaseRViewHolder;", "Lcom/heytap/store/homemodule/data/HomeDataBean;", "beforeBindViewHolder", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onDestroy", "onDetachedFromRecyclerView", "onEnterUserVision", "onLeaveUserVision", "onViewAttachToWindow", "onViewDetachedFromWindow", "onViewHolderCreated", "onViewRecycled", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface HolderStateWatcher {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void afterBindViewHolder(@NotNull HolderStateWatcher holderStateWatcher, @NotNull BaseRViewHolder<HomeDataBean> holder) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            Intrinsics.checkNotNullParameter(holder, "holder");
            HolderStateWatcher.super.afterBindViewHolder(holder);
        }

        @Deprecated
        public static void beforeBindViewHolder(@NotNull HolderStateWatcher holderStateWatcher, @NotNull BaseRViewHolder<HomeDataBean> holder) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            Intrinsics.checkNotNullParameter(holder, "holder");
            HolderStateWatcher.super.beforeBindViewHolder(holder);
        }

        @Deprecated
        public static void onAttachedToRecyclerView(@NotNull HolderStateWatcher holderStateWatcher, @NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            HolderStateWatcher.super.onAttachedToRecyclerView(recyclerView);
        }

        @Deprecated
        public static void onDestroy(@NotNull HolderStateWatcher holderStateWatcher) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            HolderStateWatcher.super.onDestroy();
        }

        @Deprecated
        public static void onDetachedFromRecyclerView(@NotNull HolderStateWatcher holderStateWatcher, @NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            HolderStateWatcher.super.onDetachedFromRecyclerView(recyclerView);
        }

        @Deprecated
        public static void onEnterUserVision(@NotNull HolderStateWatcher holderStateWatcher) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            HolderStateWatcher.super.onEnterUserVision();
        }

        @Deprecated
        public static void onLeaveUserVision(@NotNull HolderStateWatcher holderStateWatcher) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            HolderStateWatcher.super.onLeaveUserVision();
        }

        @Deprecated
        public static void onViewAttachToWindow(@NotNull HolderStateWatcher holderStateWatcher, @NotNull BaseRViewHolder<HomeDataBean> holder) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            Intrinsics.checkNotNullParameter(holder, "holder");
            HolderStateWatcher.super.onViewAttachToWindow(holder);
        }

        @Deprecated
        public static void onViewDetachedFromWindow(@NotNull HolderStateWatcher holderStateWatcher, @NotNull BaseRViewHolder<HomeDataBean> holder) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            Intrinsics.checkNotNullParameter(holder, "holder");
            HolderStateWatcher.super.onViewDetachedFromWindow(holder);
        }

        @Deprecated
        public static void onViewHolderCreated(@NotNull HolderStateWatcher holderStateWatcher, @NotNull BaseRViewHolder<HomeDataBean> holder) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            Intrinsics.checkNotNullParameter(holder, "holder");
            HolderStateWatcher.super.onViewHolderCreated(holder);
        }

        @Deprecated
        public static void onViewRecycled(@NotNull HolderStateWatcher holderStateWatcher, @NotNull BaseRViewHolder<HomeDataBean> holder) {
            Intrinsics.checkNotNullParameter(holderStateWatcher, "this");
            Intrinsics.checkNotNullParameter(holder, "holder");
            HolderStateWatcher.super.onViewRecycled(holder);
        }
    }

    default void afterBindViewHolder(@NotNull BaseRViewHolder<HomeDataBean> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    default void beforeBindViewHolder(@NotNull BaseRViewHolder<HomeDataBean> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    default void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    default void onDestroy() {
    }

    default void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    default void onEnterUserVision() {
    }

    default void onLeaveUserVision() {
    }

    default void onViewAttachToWindow(@NotNull BaseRViewHolder<HomeDataBean> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    default void onViewDetachedFromWindow(@NotNull BaseRViewHolder<HomeDataBean> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    default void onViewHolderCreated(@NotNull BaseRViewHolder<HomeDataBean> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    default void onViewRecycled(@NotNull BaseRViewHolder<HomeDataBean> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }
}

package com.heytap.store.homemodule.adapter;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/adapter/HolderLifecycle;", "", "onViewAttachToWindow", "", "onViewDetachedFromWindow", "onViewRecycled", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface HolderLifecycle {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onViewAttachToWindow(@NotNull HolderLifecycle holderLifecycle) {
            Intrinsics.checkNotNullParameter(holderLifecycle, "this");
            HolderLifecycle.super.onViewAttachToWindow();
        }

        @Deprecated
        public static void onViewDetachedFromWindow(@NotNull HolderLifecycle holderLifecycle) {
            Intrinsics.checkNotNullParameter(holderLifecycle, "this");
            HolderLifecycle.super.onViewDetachedFromWindow();
        }

        @Deprecated
        public static void onViewRecycled(@NotNull HolderLifecycle holderLifecycle) {
            Intrinsics.checkNotNullParameter(holderLifecycle, "this");
            HolderLifecycle.super.onViewRecycled();
        }
    }

    default void onViewAttachToWindow() {
    }

    default void onViewDetachedFromWindow() {
    }

    default void onViewRecycled() {
    }
}

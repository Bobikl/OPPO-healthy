package com.heytap.store.product_support.interfaces;

import com.heytap.store.base.widget.recyclerview.ChildRecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/product_support/interfaces/IRecommendView;", "", "exposureCurrentPage", "", "getCurrentChildRv", "Lcom/heytap/store/base/widget/recyclerview/ChildRecyclerView;", "notifyBackTop", "notifyScroll", "notifyTabFold", "fold", "", "setNestedScrollListener", "listener", "Lcom/heytap/store/product_support/interfaces/INestedScrollListener;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IRecommendView {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void exposureCurrentPage(@NotNull IRecommendView iRecommendView) {
            Intrinsics.checkNotNullParameter(iRecommendView, "this");
            IRecommendView.super.exposureCurrentPage();
        }

        @Deprecated
        public static void notifyTabFold(@NotNull IRecommendView iRecommendView, boolean z) {
            Intrinsics.checkNotNullParameter(iRecommendView, "this");
            IRecommendView.super.notifyTabFold(z);
        }
    }

    default void exposureCurrentPage() {
    }

    @Nullable
    ChildRecyclerView getCurrentChildRv();

    void notifyBackTop();

    void notifyScroll();

    default void notifyTabFold(boolean fold) {
    }

    void setNestedScrollListener(@NotNull INestedScrollListener listener);
}

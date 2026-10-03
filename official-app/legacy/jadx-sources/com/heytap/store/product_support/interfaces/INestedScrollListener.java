package com.heytap.store.product_support.interfaces;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/heytap/store/product_support/interfaces/INestedScrollListener;", "", "nestedScroll", "", "scrollY", "", "scrollX", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface INestedScrollListener {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void nestedScroll(@NotNull INestedScrollListener iNestedScrollListener, int i, int i2) {
            Intrinsics.checkNotNullParameter(iNestedScrollListener, "this");
            INestedScrollListener.super.nestedScroll(i, i2);
        }
    }

    default void nestedScroll(int scrollY, int scrollX) {
    }
}

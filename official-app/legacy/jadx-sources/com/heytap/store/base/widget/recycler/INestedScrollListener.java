package com.heytap.store.base.widget.recycler;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/heytap/store/base/widget/recycler/INestedScrollListener;", "", "nestedScrollX", "", "scrollX", "", "nestedScrollY", "scrollY", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface INestedScrollListener {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void nestedScrollX(@NotNull INestedScrollListener iNestedScrollListener, int i) {
            Intrinsics.checkNotNullParameter(iNestedScrollListener, "this");
        }

        public static void nestedScrollY(@NotNull INestedScrollListener iNestedScrollListener, int i) {
            Intrinsics.checkNotNullParameter(iNestedScrollListener, "this");
        }
    }

    void nestedScrollX(int scrollX);

    void nestedScrollY(int scrollY);
}

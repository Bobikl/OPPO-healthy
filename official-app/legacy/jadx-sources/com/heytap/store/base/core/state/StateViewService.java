package com.heytap.store.base.core.state;

import android.content.Context;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/store/base/core/state/StateViewService;", "", "createStateView", "Landroid/view/View;", "context", "Landroid/content/Context;", "onStateViewVisibleChanged", "", "isVisible", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface StateViewService {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onStateViewVisibleChanged(@NotNull StateViewService stateViewService, boolean z) {
            Intrinsics.checkNotNullParameter(stateViewService, "this");
        }
    }

    @Nullable
    View createStateView(@NotNull Context context);

    void onStateViewVisibleChanged(boolean isVisible);
}

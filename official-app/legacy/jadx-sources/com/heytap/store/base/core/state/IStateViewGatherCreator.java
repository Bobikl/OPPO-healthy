package com.heytap.store.base.core.state;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/heytap/store/base/core/state/IStateViewGatherCreator;", "", "addCreator", "", "stateViewKey", "", "service", "Lcom/heytap/store/base/core/state/StateViewService;", "addEmptyViewCreator", "addErrorViewCreator", "addLoadingViewCreator", "addNetworkErrorViewCreator", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IStateViewGatherCreator {
    void addCreator(@NotNull String stateViewKey, @NotNull StateViewService service);

    void addEmptyViewCreator(@NotNull StateViewService service);

    void addErrorViewCreator(@NotNull StateViewService service);

    void addLoadingViewCreator(@NotNull StateViewService service);

    void addNetworkErrorViewCreator(@NotNull StateViewService service);
}

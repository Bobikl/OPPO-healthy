package com.oplus.seedling.sdk.task;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0001H&J\b\u0010\u0005\u001a\u00020\u0001H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/seedling/sdk/task/ISeedlingTask;", "", "cancel", "", "getStatus", "getTaskName", "isCanceled", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ISeedlingTask {
    boolean cancel();

    @NotNull
    Object getStatus();

    @NotNull
    Object getTaskName();

    boolean isCanceled();
}

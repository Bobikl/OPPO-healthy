package com.pantanal.server.content.recommendlist;

import androidx.annotation.Keep;
import com.oplus.utrace.sdk.UTraceContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/pantanal/server/content/recommendlist/ListObserver;", "", "onListChanged", "", "newList", "", "Lcom/pantanal/server/content/recommendlist/ServiceInfo;", "parentCtx", "Lcom/oplus/utrace/sdk/UTraceContext;", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ListObserver {
    void onListChanged(@NotNull List<ServiceInfo> newList, @Nullable UTraceContext parentCtx);
}

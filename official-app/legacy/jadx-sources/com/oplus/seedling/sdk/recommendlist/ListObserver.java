package com.oplus.seedling.sdk.recommendlist;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/seedling/sdk/recommendlist/ListObserver;", "", "onListChanged", "", "newList", "", "Lcom/oplus/seedling/sdk/recommendlist/ServiceInfo;", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ListObserver {
    void onListChanged(@NotNull List<ServiceInfo> newList);
}

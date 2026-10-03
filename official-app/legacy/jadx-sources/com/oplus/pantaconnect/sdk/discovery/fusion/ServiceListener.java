package com.oplus.pantaconnect.sdk.discovery.fusion;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/fusion/ServiceListener;", "", "onServiceFound", "", "serviceNode", "Lcom/oplus/pantaconnect/sdk/discovery/fusion/ServiceNode;", "queryLocalServiceInfo", "Lcom/oplus/pantaconnect/sdk/discovery/fusion/ServiceInfo;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ServiceListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static ServiceInfo queryLocalServiceInfo(@NotNull ServiceListener serviceListener) {
            return null;
        }
    }

    void onServiceFound(@NotNull ServiceNode serviceNode);

    @Nullable
    ServiceInfo queryLocalServiceInfo();
}

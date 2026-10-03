package com.oplus.pantaconnect.sdk;

import com.oplus.pantaconnect.sdk.connection.ConnectionExtension;
import com.oplus.pantaconnect.sdk.discovery.DiscoveryExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/oplus/pantaconnect/sdk/SdkExtension;", "", "connectionExtension", "Lcom/oplus/pantaconnect/sdk/connection/ConnectionExtension;", "getConnectionExtension", "()Lcom/oplus/pantaconnect/sdk/connection/ConnectionExtension;", "getDiscoveryExtension", "Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryExtension;", "type", "", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SdkExtension {
    @NotNull
    ConnectionExtension getConnectionExtension();

    @Nullable
    DiscoveryExtension getDiscoveryExtension(@NotNull String type);
}

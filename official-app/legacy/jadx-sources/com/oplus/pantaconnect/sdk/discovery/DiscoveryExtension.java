package com.oplus.pantaconnect.sdk.discovery;

import com.google.protobuf.ByteString;
import com.oplus.pantaconnect.sdk.RequestScope;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryExtension;", "", "requestScope", "Lcom/oplus/pantaconnect/sdk/RequestScope;", "getRequestScope", "()Lcom/oplus/pantaconnect/sdk/RequestScope;", "type", "", "getType", "()Ljava/lang/String;", "advertisingOptions", "Lcom/google/protobuf/ByteString;", "serviceId", "discoveryOptions", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DiscoveryExtension {
    @NotNull
    ByteString advertisingOptions(@NotNull String serviceId);

    @NotNull
    ByteString discoveryOptions(@NotNull String serviceId);

    @NotNull
    RequestScope getRequestScope();

    @NotNull
    String getType();
}

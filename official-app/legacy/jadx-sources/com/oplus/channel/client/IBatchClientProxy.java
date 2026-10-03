package com.oplus.channel.client;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/channel/client/IBatchClientProxy;", "", "batchCallback", "", "clientName", "", "callbackIds", "", "data", "", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface IBatchClientProxy {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static boolean batchCallback(@NotNull IBatchClientProxy iBatchClientProxy, @NotNull String clientName, @NotNull List<String> callbackIds, @NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(iBatchClientProxy, "this");
            Intrinsics.checkNotNullParameter(clientName, "clientName");
            Intrinsics.checkNotNullParameter(callbackIds, "callbackIds");
            Intrinsics.checkNotNullParameter(data, "data");
            return false;
        }
    }

    boolean batchCallback(@NotNull String clientName, @NotNull List<String> callbackIds, @NotNull byte[] data);
}

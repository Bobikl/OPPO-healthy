package com.oplus.channel.client;

import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J=\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH&J0\u0010\u000f\u001a\u00020\u00072&\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0011j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0012H\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0017J=\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0005H&J3\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\u000bH&J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u0019"}, d2 = {"Lcom/oplus/channel/client/IClient;", "", "getRequestActionIdentify", "Lcom/oplus/channel/client/ClientProxy$ActionIdentify;", "params", "", "observe", "", "observeResStr", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "observeData", "observes", "ids", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "", "replaceObserve", "request", "requestData", "requestOnce", "unObserve", "client_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface IClient {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void observes(@NotNull IClient iClient, @NotNull HashMap<String, byte[]> ids) {
            Intrinsics.checkNotNullParameter(iClient, "this");
            Intrinsics.checkNotNullParameter(ids, "ids");
        }

        public static void replaceObserve(@NotNull IClient iClient, @NotNull String observeResStr, @Nullable byte[] bArr, @NotNull Function1<? super byte[], Unit> callback) {
            Intrinsics.checkNotNullParameter(iClient, "this");
            Intrinsics.checkNotNullParameter(observeResStr, "observeResStr");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }

        @Deprecated(message = "it is replace with fun observes(ids: HashMap<String, ByteArray?>)")
        public static void observes(@NotNull IClient iClient, @NotNull List<String> ids) {
            Intrinsics.checkNotNullParameter(iClient, "this");
            Intrinsics.checkNotNullParameter(ids, "ids");
        }
    }

    @NotNull
    ClientProxy.ActionIdentify getRequestActionIdentify(@NotNull byte[] params);

    void observe(@NotNull String observeResStr, @Nullable byte[] params, @NotNull Function1<? super byte[], Unit> callback);

    void observes(@NotNull HashMap<String, byte[]> ids);

    @Deprecated(message = "it is replace with fun observes(ids: HashMap<String, ByteArray?>)")
    void observes(@NotNull List<String> ids);

    void replaceObserve(@NotNull String observeResStr, @Nullable byte[] params, @NotNull Function1<? super byte[], Unit> callback);

    void request(@NotNull byte[] requestData);

    void requestOnce(@NotNull byte[] requestData, @NotNull Function1<? super byte[], Unit> callback);

    void unObserve(@NotNull String observeResStr);
}

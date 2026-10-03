package com.oplus.channel.server;

import com.oplus.channel.server.data.Command;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J]\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2+\u0010\u000e\u001a'\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\r`\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001H&J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0005H&J[\u0010\u0017\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2+\u0010\u000e\u001a'\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\r`\u00132\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001H&J&\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001H&J0\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u0005H&Jg\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\r2+\u0010\u000e\u001a'\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\r`\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001H&J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\rH&JK\u0010\"\u001a\u00020\u00032+\u0010\u000e\u001a'\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\r`\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001H&J?\u0010#\u001a\u00020\u00032+\u0010\u000e\u001a'\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\r`\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¨\u0006$"}, d2 = {"Lcom/oplus/channel/server/ClientProxy;", "", "destroy", "", "shouldForceFetch", "", "getCommandList", "", "Lcom/oplus/channel/server/data/Command;", "observe", "observeResStr", "", "params", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "observeData", "Lcom/oplus/channel/server/Callback;", "businessTag", "pullCommand", "needLog", "replaceObserve", "request", "requestData", "shouldNotify", "requestOnce", "requestSeqId", "timeOut", "", "runCallback", "callbackId", "data", "stopObserve", "unObserve", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ClientProxy {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void destroy$default(ClientProxy clientProxy, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            clientProxy.destroy(z);
        }

        public static /* synthetic */ void observe$default(ClientProxy clientProxy, String str, byte[] bArr, Function1 function1, boolean z, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observe");
            }
            if ((i & 8) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                obj = null;
            }
            clientProxy.observe(str, bArr, function1, z2, obj);
        }

        public static /* synthetic */ List pullCommand$default(ClientProxy clientProxy, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullCommand");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return clientProxy.pullCommand(z);
        }

        public static /* synthetic */ void replaceObserve$default(ClientProxy clientProxy, String str, byte[] bArr, Function1 function1, boolean z, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceObserve");
            }
            if ((i & 16) != 0) {
                obj = null;
            }
            clientProxy.replaceObserve(str, bArr, function1, z, obj);
        }

        public static /* synthetic */ void request$default(ClientProxy clientProxy, byte[] bArr, boolean z, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            clientProxy.request(bArr, z, obj);
        }

        public static /* synthetic */ void requestOnce$default(ClientProxy clientProxy, String str, byte[] bArr, Function1 function1, long j2, boolean z, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOnce");
            }
            clientProxy.requestOnce((i & 1) != 0 ? "default" : str, bArr, function1, (i & 8) != 0 ? -1L : j2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : obj);
        }

        public static /* synthetic */ void stopObserve$default(ClientProxy clientProxy, Function1 function1, boolean z, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopObserve");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            clientProxy.stopObserve(function1, z, obj);
        }

        public static /* synthetic */ void unObserve$default(ClientProxy clientProxy, Function1 function1, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unObserve");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            clientProxy.unObserve(function1, z);
        }

        public static /* synthetic */ void request$default(ClientProxy clientProxy, byte[] bArr, boolean z, Object obj, boolean z2, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            clientProxy.request(bArr, z, obj, z2);
        }
    }

    void destroy(boolean shouldForceFetch);

    @NotNull
    List<Command> getCommandList();

    void observe(@NotNull String observeResStr, @Nullable byte[] params, @NotNull Function1<? super byte[], Unit> callback, boolean shouldForceFetch, @Nullable Object businessTag);

    @NotNull
    List<Command> pullCommand(boolean needLog);

    void replaceObserve(@NotNull String observeResStr, @Nullable byte[] params, @NotNull Function1<? super byte[], Unit> callback, boolean shouldForceFetch, @Nullable Object businessTag);

    void request(@NotNull byte[] requestData, boolean shouldForceFetch, @Nullable Object businessTag);

    void request(@NotNull byte[] requestData, boolean shouldForceFetch, @Nullable Object businessTag, boolean shouldNotify);

    void requestOnce(@NotNull String requestSeqId, @NotNull byte[] requestData, @NotNull Function1<? super byte[], Unit> callback, long timeOut, boolean shouldForceFetch, @Nullable Object businessTag);

    void runCallback(@NotNull String callbackId, @NotNull byte[] data);

    void stopObserve(@NotNull Function1<? super byte[], Unit> callback, boolean shouldForceFetch, @Nullable Object businessTag);

    void unObserve(@NotNull Function1<? super byte[], Unit> callback, boolean shouldForceFetch);
}

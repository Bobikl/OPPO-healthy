package com.heytap.health.rpc.host;

import android.os.IBinder;
import com.heytap.health.annotation.ProcessName;
import com.heytap.health.rpc.RpcMsg;
import com.heytap.health.rpc.host.RpcMsgAPI;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.n6c;
import com.oplus.aiunit.vision.t6c;
import com.oplus.aiunit.vision.xzf;
import com.oplus.aiunit.vision.z3b;
import com.oplus.health.apiprovider.ClientManager;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\b\u0007*\u000237\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\"B\t\b\u0002¢\u0006\u0004\b;\u0010<J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J(\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/heytap/health/rpc/host/RpcMsgAPI;", "", "", "appId", "Lcom/heytap/health/rpc/RpcMsg;", "msg", "", "v", "Lcom/heytap/health/rpc/host/RpcMsgAPI$a;", "callback", "timeout", "w", "Lcom/oplus/aiunit/vision/z3b;", "listener", "Lcom/oplus/aiunit/vision/n6c;", "filter", MapSchema.FIELD_NAME_KEY, "j", "u", "s", "Lcom/oplus/aiunit/vision/t6c;", "sendCallback", "Lcom/heytap/health/rpc/host/RpcMsgAPI$b;", "respMsgCallback", "t", "Lcom/heytap/health/rpc/host/IRpcMsgApi;", "q", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "", "b", "Z", "isRemoteMsgListenerAdded", "Ljava/util/concurrent/ThreadPoolExecutor;", "c", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Lcom/oplus/aiunit/vision/xzf;", "d", "Lcom/oplus/aiunit/vision/xzf;", "msgDispatcher", "Lcom/heytap/health/rpc/host/a;", MapSchema.FIELD_NAME_ENTRY, "Lkotlin/Lazy;", LogFieldKey.PROCESS_NAME_KEY, "()Lcom/heytap/health/rpc/host/a;", "callbackProcessor", "com/heytap/health/rpc/host/RpcMsgAPI$c", "f", "Lcom/heytap/health/rpc/host/RpcMsgAPI$c;", "serviceStatusListener", "com/heytap/health/rpc/host/RpcMsgAPI$remoteMsgListener$1", b2n.f, "Lcom/heytap/health/rpc/host/RpcMsgAPI$remoteMsgListener$1;", "remoteMsgListener", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
public final class RpcMsgAPI {

    @NotNull
    public static final RpcMsgAPI INSTANCE = new RpcMsgAPI();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger threadNumber = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isRemoteMsgListenerAdded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static ThreadPoolExecutor executor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static xzf msgDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy callbackProcessor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final c serviceStatusListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static RpcMsgAPI$remoteMsgListener$1 remoteMsgListener;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/health/rpc/host/RpcMsgAPI$a;", "Lcom/oplus/aiunit/vision/t6c;", "Lcom/heytap/health/rpc/host/RpcMsgAPI$b;", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    public interface a extends t6c, b {

        /* JADX INFO: renamed from: com.heytap.health.rpc.host.RpcMsgAPI$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C0540a {
            public static void a(@NotNull a aVar, @NotNull RespMsgResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                b.a.a(aVar, result);
            }

            public static void b(@NotNull a aVar, int i, boolean z) {
                t6c.a.a(aVar, i, z);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/rpc/host/RpcMsgAPI$b;", "", "Lcom/heytap/health/rpc/host/b;", "result", "", "a", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    public interface b {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public static void a(@NotNull b bVar, @NotNull RespMsgResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
            }
        }

        void a(@NotNull RespMsgResult result);
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"com/heytap/health/rpc/host/RpcMsgAPI$c", "Lcom/oplus/health/apiprovider/ClientManager$d;", "", "name", "Lcom/heytap/health/annotation/ProcessName;", Fields.PROCESS_NAME_FIELD, "", "a", "c", "", "diedService", "b", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements ClientManager.d {
        @Override // com.oplus.health.apiprovider.ClientManager.d
        public void a(@Nullable String name, @Nullable ProcessName processName) {
        }

        @Override // com.oplus.health.apiprovider.ClientManager.d
        public void b(@NotNull List<String> diedService, @Nullable ProcessName processName) {
            Intrinsics.checkNotNullParameter(diedService, "diedService");
            if (diedService.contains(RpcMsgApiImpl.RPC_MSG_AIDL_API)) {
                synchronized (RpcMsgAPI.remoteMsgListener) {
                    RpcMsgAPI.isRemoteMsgListenerAdded = false;
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        @Override // com.oplus.health.apiprovider.ClientManager.d
        public void c(@Nullable String name, @Nullable ProcessName processName) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.heytap.health.rpc.host.RpcMsgAPI$remoteMsgListener$1] */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 3, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.oplus.aiunit.vision.qzf
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return RpcMsgAPI.o(runnable);
            }
        });
        executor = threadPoolExecutor;
        msgDispatcher = new xzf(threadPoolExecutor);
        callbackProcessor = LazyKt__LazyJVMKt.lazy(new Function0<com.heytap.health.rpc.host.a>() { // from class: com.heytap.health.rpc.host.RpcMsgAPI$callbackProcessor$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final a invoke() {
                a aVar = new a();
                RpcMsgAPI.INSTANCE.j(aVar);
                return aVar;
            }
        });
        c cVar = new c();
        serviceStatusListener = cVar;
        remoteMsgListener = new RpcMsgListener.Stub() { // from class: com.heytap.health.rpc.host.RpcMsgAPI$remoteMsgListener$1
            @Override // com.heytap.health.rpc.host.RpcMsgListener
            public void onMsgReceived(int appId, @Nullable RpcMsg msg) {
                StringBuilder sb = new StringBuilder();
                sb.append("On rpc msg received=");
                sb.append(msg);
                if (msg != null) {
                    RpcMsgAPI.msgDispatcher.d(appId, msg);
                }
            }

            @Override // com.heytap.health.rpc.host.RpcMsgListener
            public void onMsgSendResult(int msgId, boolean isSuccess) {
                StringBuilder sb = new StringBuilder();
                sb.append("onMsgSendResult, msgId=");
                sb.append(msgId);
                sb.append(" isSuccess=");
                sb.append(isSuccess);
                RpcMsgAPI.INSTANCE.p().e(msgId, isSuccess);
            }
        };
        ClientManager.getInstance().addServiceStatusListener(cVar);
    }

    public static final void n() {
        INSTANCE.l();
    }

    public static final Thread o(Runnable runnable) {
        return new Thread(runnable, "RpcAPI@" + threadNumber.getAndIncrement());
    }

    public static final IRpcMsgApi r(IBinder iBinder) {
        return IRpcMsgApi.Stub.asInterface(iBinder);
    }

    public static /* synthetic */ void x(RpcMsgAPI rpcMsgAPI, int i, RpcMsg rpcMsg, a aVar, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 5000;
        }
        rpcMsgAPI.w(i, rpcMsg, aVar, i2);
    }

    public static final void y(int i, RpcMsg msg) {
        Intrinsics.checkNotNullParameter(msg, "$msg");
        RpcMsgAPI rpcMsgAPI = INSTANCE;
        rpcMsgAPI.l();
        IRpcMsgApi iRpcMsgApiQ = rpcMsgAPI.q();
        if (iRpcMsgApiQ == null) {
            rpcMsgAPI.s(msg);
            return;
        }
        try {
            iRpcMsgApiQ.sendMsg(i, msg);
        } catch (Exception e2) {
            a7b.b("RpcLog-MsgAPI", "Send msg exception, e=" + e2);
        }
    }

    public static final void z(int i, RpcMsg msg, a callback, int i2) {
        Intrinsics.checkNotNullParameter(msg, "$msg");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        RpcMsgAPI rpcMsgAPI = INSTANCE;
        IRpcMsgApi iRpcMsgApiQ = rpcMsgAPI.q();
        if (iRpcMsgApiQ != null) {
            new e(iRpcMsgApiQ, i, msg, rpcMsgAPI.p()).a(callback, i2);
        } else {
            rpcMsgAPI.t(msg, callback, callback);
        }
    }

    public final void j(@NotNull z3b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        xzf.c(msgDispatcher, listener, null, 2, null);
        m();
    }

    public final void k(@NotNull z3b listener, @NotNull n6c filter) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(filter, "filter");
        msgDispatcher.b(listener, filter);
        m();
    }

    public final void l() {
        boolean z;
        synchronized (remoteMsgListener) {
            if (isRemoteMsgListenerAdded) {
                return;
            }
            IRpcMsgApi iRpcMsgApiQ = INSTANCE.q();
            if (iRpcMsgApiQ != null) {
                iRpcMsgApiQ.addMsgListener(remoteMsgListener);
                z = true;
            } else {
                z = false;
            }
            isRemoteMsgListenerAdded = z;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void m() {
        executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.tzf
            @Override // java.lang.Runnable
            public final void run() {
                RpcMsgAPI.n();
            }
        });
    }

    public final com.heytap.health.rpc.host.a p() {
        return (com.heytap.health.rpc.host.a) callbackProcessor.getValue();
    }

    public final IRpcMsgApi q() {
        return (IRpcMsgApi) ClientManager.getInstance().getBuildService(RpcMsgApiImpl.RPC_MSG_AIDL_API, new ClientManager.a() { // from class: com.oplus.aiunit.vision.uzf
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return RpcMsgAPI.r(iBinder);
            }
        });
    }

    public final void s(RpcMsg msg) {
        a7b.b("RpcLog-MsgAPI", "API from api provider is null， send msg fail msg=" + msg);
    }

    public final void t(RpcMsg msg, t6c sendCallback, b respMsgCallback) {
        if (sendCallback != null) {
            sendCallback.b(msg.getMsgId(), false);
        }
        if (respMsgCallback != null) {
            respMsgCallback.a(RespMsgResult.INSTANCE.a());
        }
    }

    public final void u(@NotNull z3b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        msgDispatcher.f(listener);
    }

    public final void v(final int appId, @NotNull final RpcMsg msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.rzf
            @Override // java.lang.Runnable
            public final void run() {
                RpcMsgAPI.y(appId, msg);
            }
        });
    }

    public final void w(final int appId, @NotNull final RpcMsg msg, @NotNull final a callback, final int timeout) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.szf
            @Override // java.lang.Runnable
            public final void run() {
                RpcMsgAPI.z(appId, msg, callback, timeout);
            }
        });
    }
}

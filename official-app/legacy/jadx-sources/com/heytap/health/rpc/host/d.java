package com.heytap.health.rpc.host;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteCallbackList;
import com.heytap.health.rpc.RpcMsg;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.t6c;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/heytap/health/rpc/host/d;", "Lcom/oplus/aiunit/vision/t6c;", "", "appId", "Lcom/heytap/health/rpc/RpcMsg;", "msg", "", LogFieldKey.MESSAGE_KEY, "f", "Lcom/heytap/health/rpc/host/RpcMsgListener;", "listener", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.LEVEL_KEY, "msgId", "", "isSuccess", "b", b2n.g, "Lcom/heytap/health/rpc/d;", "j", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "", "Ljava/util/Map;", "apiMap", "Landroid/os/RemoteCallbackList;", "c", "Landroid/os/RemoteCallbackList;", "msgListeners", "Ljava/util/concurrent/ThreadPoolExecutor;", "d", "Ljava/util/concurrent/ThreadPoolExecutor;", "msgExecutor", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
public final class d implements t6c {

    @NotNull
    public static final d INSTANCE = new d();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger threadNumber = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<Integer, com.heytap.health.rpc.d> apiMap = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RemoteCallbackList<RpcMsgListener> msgListeners = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final ThreadPoolExecutor msgExecutor = new ThreadPoolExecutor(0, 2, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.oplus.aiunit.vision.yzf
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return com.heytap.health.rpc.host.d.k(runnable);
        }
    });

    public static final void g(int i, RpcMsg msg) {
        Intrinsics.checkNotNullParameter(msg, "$msg");
        try {
            int iBeginBroadcast = msgListeners.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                try {
                    ((RpcMsgListener) msgListeners.getBroadcastItem(i2)).onMsgReceived(i, msg);
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Msg callback exception=");
                    sb.append(e2);
                }
            }
            msgListeners.finishBroadcast();
        } catch (Throwable th) {
            msgListeners.finishBroadcast();
            throw th;
        }
    }

    public static final void i(int i, boolean z) {
        try {
            int iBeginBroadcast = msgListeners.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                try {
                    ((RpcMsgListener) msgListeners.getBroadcastItem(i2)).onMsgSendResult(i, z);
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Msg callback exception=");
                    sb.append(e2);
                }
            }
            msgListeners.finishBroadcast();
        } catch (Throwable th) {
            msgListeners.finishBroadcast();
            throw th;
        }
    }

    public static final Thread k(Runnable runnable) {
        return new Thread(runnable, "RpcMan@" + threadNumber.getAndIncrement());
    }

    @Override // com.oplus.aiunit.vision.t6c
    public void b(int msgId, boolean isSuccess) {
        h(msgId, isSuccess);
    }

    public final void e(@NotNull RpcMsgListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        msgListeners.register(listener);
    }

    public final void f(final int appId, @NotNull final RpcMsg msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        StringBuilder sb = new StringBuilder();
        sb.append("server receive msg:");
        sb.append(msg);
        msgExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.zzf
            @Override // java.lang.Runnable
            public final void run() {
                com.heytap.health.rpc.host.d.g(appId, msg);
            }
        });
    }

    public final void h(final int msgId, final boolean isSuccess) {
        msgExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.a0g
            @Override // java.lang.Runnable
            public final void run() {
                com.heytap.health.rpc.host.d.i(msgId, isSuccess);
            }
        });
    }

    public final com.heytap.health.rpc.d j(int appId) {
        Intent intentB;
        Map<Integer, com.heytap.health.rpc.d> map = apiMap;
        com.heytap.health.rpc.d dVar = map.get(Integer.valueOf(appId));
        if (dVar != null || (intentB = c.INSTANCE.b(appId)) == null || intentB.getPackage() == null) {
            return dVar;
        }
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        com.heytap.health.rpc.d dVar2 = new com.heytap.health.rpc.d(contextA, intentB, 300000);
        map.put(Integer.valueOf(appId), dVar2);
        return dVar2;
    }

    public final void l(@NotNull RpcMsgListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        msgListeners.unregister(listener);
    }

    public final void m(int appId, @NotNull RpcMsg msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        com.heytap.health.rpc.d dVarJ = j(appId);
        if (dVarJ != null) {
            dVarJ.d(msg, this);
        } else {
            b(msg.getMsgId(), false);
        }
    }
}

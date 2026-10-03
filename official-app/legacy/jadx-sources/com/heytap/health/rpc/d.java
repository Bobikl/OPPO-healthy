package com.heytap.health.rpc;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.oplus.aiunit.vision.t6c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/rpc/d;", "", "Lcom/heytap/health/rpc/RpcMsg;", "msg", "Lcom/oplus/aiunit/vision/t6c;", "sendMsgCallback", "", "d", "", "a", "I", "binderReleaseTime", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "Ljava/util/concurrent/ThreadPoolExecutor;", "c", "Ljava/util/concurrent/ThreadPoolExecutor;", "msgExecutor", "Lcom/heytap/health/rpc/a;", "Lcom/heytap/health/rpc/MsgInterface;", "Lcom/heytap/health/rpc/a;", "binderHolder", "Landroid/content/Context;", "appContext", "Landroid/content/Intent;", "remoteIntent", "releaseTime", "<init>", "(Landroid/content/Context;Landroid/content/Intent;I)V", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRpcMsgSender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RpcMsgSender.kt\ncom/heytap/health/rpc/RpcMsgSender\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int binderReleaseTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger threadNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ThreadPoolExecutor msgExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final com.heytap.health.rpc.a<MsgInterface> binderHolder;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/rpc/d$a", "Lcom/heytap/health/rpc/a$c;", "Lcom/heytap/health/rpc/MsgInterface;", "Landroid/os/IBinder;", "binder", "b", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements com.heytap.health.rpc.a.c<MsgInterface> {
        @Override // com.heytap.health.rpc.a.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MsgInterface a(@Nullable IBinder binder) {
            MsgInterface msgInterfaceAsInterface = MsgInterface.Stub.asInterface(binder);
            Intrinsics.checkNotNullExpressionValue(msgInterfaceAsInterface, "asInterface(binder)");
            return msgInterfaceAsInterface;
        }
    }

    public d(@NotNull Context appContext, @NotNull Intent remoteIntent, int i) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(remoteIntent, "remoteIntent");
        this.binderReleaseTime = i;
        this.threadNumber = new AtomicInteger(1);
        this.msgExecutor = new ThreadPoolExecutor(0, 3, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.oplus.aiunit.vision.c0g
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return com.heytap.health.rpc.d.c(this.i, runnable);
            }
        });
        com.heytap.health.rpc.a<MsgInterface> aVar = new com.heytap.health.rpc.a<>(appContext, remoteIntent, new a(), 0, 0, 24, null);
        aVar.u(i);
        this.binderHolder = aVar;
    }

    public static final Thread c(d this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Thread(runnable, "RpcSend@" + this$0.threadNumber.getAndIncrement());
    }

    public static final void e(d this$0, RpcMsg msg, t6c t6cVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "$msg");
        boolean z = true;
        MsgInterface msgInterface = (MsgInterface) this$0.binderHolder.q(1);
        boolean z2 = false;
        if (msgInterface != null) {
            try {
                c.INSTANCE.a("MsgCall=" + msg);
                msgInterface.msgCall(msg);
            } catch (Exception unused) {
                z = false;
            }
            z2 = z;
        }
        if (t6cVar != null) {
            t6cVar.b(msg.getMsgId(), z2);
        }
    }

    public final void d(@NotNull final RpcMsg msg, @Nullable final t6c sendMsgCallback) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.msgExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.b0g
            @Override // java.lang.Runnable
            public final void run() {
                com.heytap.health.rpc.d.e(this.i, msg, sendMsgCallback);
            }
        });
    }
}

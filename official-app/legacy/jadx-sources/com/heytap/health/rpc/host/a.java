package com.heytap.health.rpc.host;

import android.os.Handler;
import android.os.HandlerThread;
import com.heytap.health.rpc.RpcMsg;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.t6c;
import com.oplus.aiunit.vision.z3b;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0010\u0014B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/rpc/host/a;", "Lcom/oplus/aiunit/vision/z3b;", "Lcom/heytap/health/rpc/host/a$a;", "callbackMsg", "", b2n.f, "", "appId", "Lcom/heytap/health/rpc/RpcMsg;", "msg", "onMsgReceived", "msgId", "", "isSuccess", MapSchema.FIELD_NAME_ENTRY, "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "mHandler", "Ljava/util/LinkedList;", "b", "Ljava/util/LinkedList;", "waitingList", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCallbackMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallbackMsgProcessor.kt\ncom/heytap/health/rpc/host/CallbackMsgProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public final class a implements z3b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Handler mHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LinkedList<C0541a> waitingList = new LinkedList<>();

    /* JADX INFO: renamed from: com.heytap.health.rpc.host.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/rpc/host/a$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "appId", "b", "msgId", "<init>", "(II)V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class MsgTag {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int appId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int msgId;

        public MsgTag(int i, int i2) {
            this.appId = i;
            this.msgId = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAppId() {
            return this.appId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMsgId() {
            return this.msgId;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MsgTag)) {
                return false;
            }
            MsgTag msgTag = (MsgTag) other;
            return this.appId == msgTag.appId && this.msgId == msgTag.msgId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.appId) * 31) + Integer.hashCode(this.msgId);
        }

        @NotNull
        public String toString() {
            return "MsgTag(appId=" + this.appId + ", msgId=" + this.msgId + ")";
        }
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("CallbackMsgProcessor");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
    }

    public static final void f(a this$0, int i, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<C0541a> it = this$0.waitingList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "waitingList.iterator()");
        while (it.hasNext()) {
            C0541a next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
            C0541a c0541a = next;
            if (c0541a.getMsgTag().getMsgId() == i) {
                t6c sendCallback = c0541a.getSendCallback();
                if (sendCallback != null) {
                    sendCallback.b(i, z);
                }
                if (c0541a.getRespMsgCallback() == null || !z) {
                    it.remove();
                    Runnable waitRespTimeoutRunnable = c0541a.getWaitRespTimeoutRunnable();
                    if (waitRespTimeoutRunnable != null) {
                        this$0.mHandler.removeCallbacks(waitRespTimeoutRunnable);
                    }
                    RpcMsgAPI.b respMsgCallback = c0541a.getRespMsgCallback();
                    if (respMsgCallback != null) {
                        respMsgCallback.a(RespMsgResult.INSTANCE.a());
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public static final void h(a this$0, C0541a callbackMsg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callbackMsg, "$callbackMsg");
        this$0.waitingList.add(callbackMsg);
    }

    public static final void i(a this$0, C0541a callbackMsg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callbackMsg, "$callbackMsg");
        this$0.waitingList.remove(callbackMsg);
        callbackMsg.getRespMsgCallback().a(RespMsgResult.INSTANCE.c());
    }

    public static final void j(a this$0, int i, RpcMsg msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "$msg");
        Iterator<C0541a> it = this$0.waitingList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "waitingList.iterator()");
        while (it.hasNext()) {
            C0541a next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
            C0541a c0541a = next;
            if (c0541a.f(i, msg)) {
                it.remove();
                Runnable waitRespTimeoutRunnable = c0541a.getWaitRespTimeoutRunnable();
                if (waitRespTimeoutRunnable != null) {
                    this$0.mHandler.removeCallbacks(waitRespTimeoutRunnable);
                }
                RpcMsgAPI.b respMsgCallback = c0541a.getRespMsgCallback();
                if (respMsgCallback != null) {
                    respMsgCallback.a(RespMsgResult.INSTANCE.b(msg));
                    return;
                }
                return;
            }
        }
    }

    public final void e(final int msgId, final boolean isSuccess) {
        this.mHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.mt2
            @Override // java.lang.Runnable
            public final void run() {
                com.heytap.health.rpc.host.a.f(this.i, msgId, isSuccess);
            }
        });
    }

    public final void g(@NotNull final C0541a callbackMsg) {
        Intrinsics.checkNotNullParameter(callbackMsg, "callbackMsg");
        this.mHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.ot2
            @Override // java.lang.Runnable
            public final void run() {
                com.heytap.health.rpc.host.a.h(this.i, callbackMsg);
            }
        });
        if (callbackMsg.getRespMsgCallback() == null || callbackMsg.getRespMsgTimeout() == null) {
            return;
        }
        callbackMsg.g(new Runnable() { // from class: com.oplus.aiunit.vision.pt2
            @Override // java.lang.Runnable
            public final void run() {
                com.heytap.health.rpc.host.a.i(this.i, callbackMsg);
            }
        });
        Handler handler = this.mHandler;
        Runnable waitRespTimeoutRunnable = callbackMsg.getWaitRespTimeoutRunnable();
        Intrinsics.checkNotNull(waitRespTimeoutRunnable);
        handler.postDelayed(waitRespTimeoutRunnable, callbackMsg.getRespMsgTimeout().intValue());
    }

    @Override // com.oplus.aiunit.vision.z3b
    public void onMsgReceived(final int appId, @NotNull final RpcMsg msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.getIsRespMsg()) {
            this.mHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.nt2
                @Override // java.lang.Runnable
                public final void run() {
                    com.heytap.health.rpc.host.a.j(this.i, appId, msg);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.rpc.host.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/heytap/health/rpc/host/a$a;", "", "", "appId", "Lcom/heytap/health/rpc/RpcMsg;", "respMsg", "", "f", "Lcom/heytap/health/rpc/host/a$b;", "a", "Lcom/heytap/health/rpc/host/a$b;", "()Lcom/heytap/health/rpc/host/a$b;", "msgTag", "Lcom/oplus/aiunit/vision/t6c;", "b", "Lcom/oplus/aiunit/vision/t6c;", "d", "()Lcom/oplus/aiunit/vision/t6c;", "sendCallback", "Lcom/heytap/health/rpc/host/RpcMsgAPI$b;", "c", "Lcom/heytap/health/rpc/host/RpcMsgAPI$b;", "()Lcom/heytap/health/rpc/host/RpcMsgAPI$b;", "respMsgCallback", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "respMsgTimeout", "Ljava/lang/Runnable;", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", b2n.f, "(Ljava/lang/Runnable;)V", "waitRespTimeoutRunnable", "<init>", "(Lcom/heytap/health/rpc/host/a$b;Lcom/oplus/aiunit/vision/t6c;Lcom/heytap/health/rpc/host/RpcMsgAPI$b;Ljava/lang/Integer;)V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0541a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final MsgTag msgTag;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final t6c sendCallback;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final RpcMsgAPI.b respMsgCallback;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Integer respMsgTimeout;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Runnable waitRespTimeoutRunnable;

        public C0541a(@NotNull MsgTag msgTag, @Nullable t6c t6cVar, @Nullable RpcMsgAPI.b bVar, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(msgTag, "msgTag");
            this.msgTag = msgTag;
            this.sendCallback = t6cVar;
            this.respMsgCallback = bVar;
            this.respMsgTimeout = num;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final MsgTag getMsgTag() {
            return this.msgTag;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final RpcMsgAPI.b getRespMsgCallback() {
            return this.respMsgCallback;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getRespMsgTimeout() {
            return this.respMsgTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final t6c getSendCallback() {
            return this.sendCallback;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Runnable getWaitRespTimeoutRunnable() {
            return this.waitRespTimeoutRunnable;
        }

        public final boolean f(int appId, @NotNull RpcMsg respMsg) {
            Intrinsics.checkNotNullParameter(respMsg, "respMsg");
            return this.msgTag.getAppId() == appId && this.msgTag.getMsgId() == respMsg.getMsgId();
        }

        public final void g(@Nullable Runnable runnable) {
            this.waitRespTimeoutRunnable = runnable;
        }

        public /* synthetic */ C0541a(MsgTag msgTag, t6c t6cVar, RpcMsgAPI.b bVar, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(msgTag, (i & 2) != 0 ? null : t6cVar, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? 8000 : num);
        }
    }
}

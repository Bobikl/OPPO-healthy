package com.oplus.aiunit.vision;

import com.heytap.health.rpc.RpcMsg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/xzf;", "", "", "appId", "Lcom/heytap/health/rpc/RpcMsg;", "msg", "", "d", "Lcom/oplus/aiunit/vision/z3b;", "msgListener", "Lcom/oplus/aiunit/vision/n6c;", "filter", "b", "listener", "f", "Ljava/util/concurrent/ThreadPoolExecutor;", "a", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/ArrayList;", "Lcom/oplus/aiunit/vision/xzf$a;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "listenerList", "<init>", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
public final class xzf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ThreadPoolExecutor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<MsgListenerWrapper> listenerList;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.xzf$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/xzf$a;", "", "", "appId", "Lcom/heytap/health/rpc/RpcMsg;", "msg", "", "b", "", "toString", "hashCode", "other", "equals", "Lcom/oplus/aiunit/vision/z3b;", "a", "Lcom/oplus/aiunit/vision/z3b;", "()Lcom/oplus/aiunit/vision/z3b;", "listener", "Lcom/oplus/aiunit/vision/n6c;", "Lcom/oplus/aiunit/vision/n6c;", "getFilter", "()Lcom/oplus/aiunit/vision/n6c;", "filter", "<init>", "(Lcom/oplus/aiunit/vision/z3b;Lcom/oplus/aiunit/vision/n6c;)V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class MsgListenerWrapper {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final z3b listener;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final n6c filter;

        public MsgListenerWrapper(@NotNull z3b listener, @Nullable n6c n6cVar) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            this.filter = n6cVar;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final z3b getListener() {
            return this.listener;
        }

        public final boolean b(int appId, @NotNull RpcMsg msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            n6c n6cVar = this.filter;
            if (n6cVar == null) {
                return true;
            }
            if (n6cVar.getCid() != -1) {
                return appId == this.filter.getAppId() && msg.getSid() == this.filter.getCom.heytap.voiceassistant.sdk.tts.constant.SpeechConstant.KEY_EVENT_SID java.lang.String() && msg.getCid() == this.filter.getCid();
            }
            if (this.filter.getCom.heytap.voiceassistant.sdk.tts.constant.SpeechConstant.KEY_EVENT_SID java.lang.String() != -1) {
                return appId == this.filter.getAppId() && msg.getSid() == this.filter.getCom.heytap.voiceassistant.sdk.tts.constant.SpeechConstant.KEY_EVENT_SID java.lang.String();
            }
            return appId == this.filter.getAppId();
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MsgListenerWrapper)) {
                return false;
            }
            MsgListenerWrapper msgListenerWrapper = (MsgListenerWrapper) other;
            return Intrinsics.areEqual(this.listener, msgListenerWrapper.listener) && Intrinsics.areEqual(this.filter, msgListenerWrapper.filter);
        }

        public int hashCode() {
            int iHashCode = this.listener.hashCode() * 31;
            n6c n6cVar = this.filter;
            return iHashCode + (n6cVar == null ? 0 : n6cVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "MsgListenerWrapper(listener=" + this.listener + ", filter=" + this.filter + ")";
        }
    }

    public xzf(@NotNull ThreadPoolExecutor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.listenerList = new ArrayList<>();
    }

    public static /* synthetic */ void c(xzf xzfVar, z3b z3bVar, n6c n6cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            n6cVar = null;
        }
        xzfVar.b(z3bVar, n6cVar);
    }

    public static final void e(xzf this$0, int i, RpcMsg msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "$msg");
        ArrayList<MsgListenerWrapper> arrayList = new ArrayList();
        synchronized (this$0.listenerList) {
            arrayList.addAll(this$0.listenerList);
        }
        for (MsgListenerWrapper msgListenerWrapper : arrayList) {
            if (msgListenerWrapper.b(i, msg)) {
                msgListenerWrapper.getListener().onMsgReceived(i, msg);
            }
        }
    }

    public final void b(@NotNull z3b msgListener, @Nullable n6c filter) {
        Intrinsics.checkNotNullParameter(msgListener, "msgListener");
        synchronized (this.listenerList) {
            this.listenerList.add(new MsgListenerWrapper(msgListener, filter));
        }
    }

    public final void d(final int appId, @NotNull final RpcMsg msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.wzf
            @Override // java.lang.Runnable
            public final void run() {
                xzf.e(this.i, appId, msg);
            }
        });
    }

    public final void f(@NotNull z3b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.listenerList) {
            Iterator<MsgListenerWrapper> it = this.listenerList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "listenerList.iterator()");
            while (it.hasNext()) {
                MsgListenerWrapper next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
                if (Intrinsics.areEqual(next.getListener(), listener)) {
                    it.remove();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}

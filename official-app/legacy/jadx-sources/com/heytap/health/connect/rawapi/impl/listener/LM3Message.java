package com.heytap.health.connect.rawapi.impl.listener;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.CallSuper;
import com.heytap.health.connect.rawapi.IHMessageListener;
import com.heytap.health.connect.rawapi.IHeytap;
import com.heytap.health.connect.rawapi.impl.listener.LM3Message;
import com.heytap.health.connect.rawapi.util.LockedHashSet;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.business.rn.service.RnConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.nxb;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.zq8;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0017J\b\u0010\u000b\u001a\u00020\u0007H\u0017J \u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ \u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/heytap/health/connect/rawapi/impl/listener/LM3Message;", "Lcom/heytap/health/connect/rawapi/impl/listener/LM2Node;", "Ljava/io/PrintWriter;", "writer", "", "", RnConstant.KEY_INIT_OPTIONS, "", "dumpWithParam", "(Ljava/io/PrintWriter;[Ljava/lang/String;)V", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "", SpeechConstant.KEY_EVENT_SID, "cid", "Lcom/oplus/aiunit/vision/nxb$b;", "listener", "e0", "g0", "Lcom/heytap/health/connect/rawapi/util/LockedHashSet;", "Lcom/heytap/health/connect/rawapi/impl/listener/LM3Message$MessageListenerWrapper;", "t", "Lcom/heytap/health/connect/rawapi/util/LockedHashSet;", "mMessageCallbackHolder", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "u", "Ljava/util/concurrent/ExecutorService;", "msgRunningExecutor", "Ljava/util/LinkedList;", "v", "Ljava/util/LinkedList;", "timeoutMsgList", "Lcom/heytap/health/connect/rawapi/IHMessageListener;", "w", "Lcom/heytap/health/connect/rawapi/IHMessageListener;", "mMessageCallback", "<init>", "()V", "MessageListenerWrapper", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLM3Message.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LM3Message.kt\ncom/heytap/health/connect/rawapi/impl/listener/LM3Message\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1855#2,2:148\n*S KotlinDebug\n*F\n+ 1 LM3Message.kt\ncom/heytap/health/connect/rawapi/impl/listener/LM3Message\n*L\n26#1:148,2\n*E\n"})
public abstract class LM3Message extends LM2Node {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final LockedHashSet<MessageListenerWrapper> mMessageCallbackHolder = new LockedHashSet<>();

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final ExecutorService msgRunningExecutor = zq8.a("LM3Message");

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final LinkedList<String> timeoutMsgList = new LinkedList<>();

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final IHMessageListener mMessageCallback = new LM3Message$mMessageCallback$1(this);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\f\u001a\u00020\bH\u0016J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u0011\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/connect/rawapi/impl/listener/LM3Message$MessageListenerWrapper;", "", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "b", "Landroid/content/Context;", "context", "", "mac", "", "c", "toString", "", "hashCode", "other", "equals", "a", "I", "getSid", "()I", SpeechConstant.KEY_EVENT_SID, "getCid", "cid", "Lcom/oplus/aiunit/vision/nxb$b;", "Lcom/oplus/aiunit/vision/nxb$b;", "()Lcom/oplus/aiunit/vision/nxb$b;", "listener", "<init>", "(IILcom/oplus/aiunit/vision/nxb$b;)V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class MessageListenerWrapper {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int sid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int cid;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final nxb.b listener;

        public MessageListenerWrapper(int i, int i2, @Nullable nxb.b bVar) {
            this.sid = i;
            this.cid = i2;
            this.listener = bVar;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final nxb.b getListener() {
            return this.listener;
        }

        public final boolean b(@NotNull MessageEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            int i = this.sid;
            if (i == -1 && this.cid == -1) {
                return true;
            }
            if (i == event.getServiceId() && this.cid == -1) {
                return true;
            }
            return this.sid == event.getServiceId() && this.cid == event.getCommandId();
        }

        public final void c(@NotNull Context context, @NotNull final String mac, @NotNull final MessageEvent event) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(event, "event");
            nxb.b bVar = this.listener;
            if (bVar != null) {
                LM0Heytap.Companion companion = LM0Heytap.INSTANCE;
                LM0Heytap.o("onMessageReceived", bVar, new Function0<Unit>() { // from class: com.heytap.health.connect.rawapi.impl.listener.LM3Message$MessageListenerWrapper$notifyEvent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.getListener().onMessageReceived(mac, event);
                    }
                });
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageListenerWrapper)) {
                return false;
            }
            MessageListenerWrapper messageListenerWrapper = (MessageListenerWrapper) other;
            return this.sid == messageListenerWrapper.sid && this.cid == messageListenerWrapper.cid && Intrinsics.areEqual(this.listener, messageListenerWrapper.listener);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.sid) * 31) + Integer.hashCode(this.cid)) * 31;
            nxb.b bVar = this.listener;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "MessageListenerWrapper(sid=" + this.sid + ", cid=" + this.cid + ", listener=" + this.listener + ")";
        }
    }

    public static final void f0(final LM3Message this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.mMessageCallbackHolder.readLock();
            boolean zIsEmpty = this$0.mMessageCallbackHolder.isEmpty();
            this$0.mMessageCallbackHolder.readUnLock();
            if (zIsEmpty) {
                wil.d(LM0Heytap.TAG, "onConnect: mMessageCallbackHolder is empty");
            } else {
                this$0.k("addMessageListener0", true, Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.listener.LM3Message$onConnect$1$1
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
                        invoke2(iHeytap);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull IHeytap iHeytap) throws RemoteException {
                        Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                        iHeytap.addMessageListener(this.this$0.mMessageCallback);
                    }
                });
            }
        } catch (Throwable th) {
            this$0.mMessageCallbackHolder.readUnLock();
            throw th;
        }
    }

    @Override // com.heytap.health.connect.rawapi.impl.listener.LM2Node, com.heytap.health.connect.rawapi.impl.listener.LM1RunMode, com.heytap.health.connect.rawapi.impl.listener.LM0Heytap, com.oplus.health.apiprovider.ClientManager.b
    public void dumpWithParam(@NotNull PrintWriter writer, @Nullable String[] param) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        super.dumpWithParam(writer, param);
        try {
            this.mMessageCallbackHolder.readLock();
            writer.println("mMessageCallbackHolder: " + this.mMessageCallbackHolder.size());
            Iterator<MessageListenerWrapper> it = this.mMessageCallbackHolder.iterator();
            while (it.hasNext()) {
                writer.append("    ").println(it.next());
            }
            this.mMessageCallbackHolder.readUnLock();
        } catch (Throwable th) {
            this.mMessageCallbackHolder.readUnLock();
            throw th;
        }
    }

    public final void e0(int sid, int cid, @Nullable nxb.b listener) {
        if (listener == null) {
            return;
        }
        try {
            this.mMessageCallbackHolder.writeLock();
            this.mMessageCallbackHolder.add(new MessageListenerWrapper(sid, cid, listener));
            this.mMessageCallbackHolder.writeUnLock();
            j("addMessageListener", Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.listener.LM3Message$addMessageListener$1
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
                    invoke2(iHeytap);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IHeytap iHeytap) throws RemoteException {
                    Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                    iHeytap.addMessageListener(this.this$0.mMessageCallback);
                }
            });
        } catch (Throwable th) {
            this.mMessageCallbackHolder.writeUnLock();
            throw th;
        }
    }

    public final void g0(int sid, int cid, @Nullable nxb.b listener) {
        if (listener == null) {
            return;
        }
        try {
            this.mMessageCallbackHolder.writeLock();
            this.mMessageCallbackHolder.remove(new MessageListenerWrapper(sid, cid, listener));
            boolean zIsEmpty = this.mMessageCallbackHolder.isEmpty();
            this.mMessageCallbackHolder.writeUnLock();
            if (zIsEmpty) {
                j("removeMessageListener", Unit.INSTANCE, new Function1<IHeytap, Unit>() { // from class: com.heytap.health.connect.rawapi.impl.listener.LM3Message$removeMessageListener$1
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IHeytap iHeytap) throws RemoteException {
                        invoke2(iHeytap);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull IHeytap iHeytap) throws RemoteException {
                        Intrinsics.checkNotNullParameter(iHeytap, "iHeytap");
                        iHeytap.removeMessageListener(this.this$0.mMessageCallback);
                    }
                });
            }
        } catch (Throwable th) {
            this.mMessageCallbackHolder.writeUnLock();
            throw th;
        }
    }

    @Override // com.heytap.health.connect.rawapi.impl.listener.LM2Node, com.heytap.health.connect.rawapi.impl.listener.LM1RunMode, com.heytap.health.connect.rawapi.impl.listener.LM0Heytap
    @CallSuper
    public void l() {
        super.l();
        getMClientExecutor().e(new Runnable() { // from class: com.oplus.aiunit.vision.yqa
            @Override // java.lang.Runnable
            public final void run() {
                LM3Message.f0(this.i);
            }
        });
    }

    @Override // com.heytap.health.connect.rawapi.impl.listener.LM2Node, com.heytap.health.connect.rawapi.impl.listener.LM0Heytap
    @CallSuper
    public void m() {
        super.m();
    }
}

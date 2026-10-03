package com.heytap.health.devicemanager.client.impl.multiple;

import android.content.Context;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.devicemanager.lock.LockDMHashMap;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.a1;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.mm5;
import com.oplus.aiunit.vision.nm5;
import com.oplus.aiunit.vision.nxb;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.rl4;
import com.oplus.aiunit.vision.sa5;
import com.oplus.aiunit.vision.tl4;
import com.oplus.aiunit.vision.u89;
import com.oplus.aiunit.vision.wk4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002)*B\u0007¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J(\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\"\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J*\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016R\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR$\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060 R\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u00060$R\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"¨\u0006+"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/multiple/DMMessageMultipleImpl;", "Lcom/oplus/aiunit/vision/tl4;", "Lcom/oplus/aiunit/vision/ra5;", "role", "Lcom/oplus/aiunit/vision/tl4$a;", "listener", "", "r", "", SpeechConstant.KEY_EVENT_SID, "cid", LogFieldKey.LEVEL_KEY, "s", "", "arouterPath", "i", LogFieldKey.PROCESS_NAME_KEY, LogFieldKey.MESSAGE_KEY, "a", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "message", "", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/rl4$c;", "result", "j", "mac", "o", b2n.f, "Ljava/lang/String;", "TAG", "Lcom/heytap/health/devicemanager/lock/LockDMHashMap;", "Lcom/heytap/health/devicemanager/client/impl/multiple/DMMessageMultipleImpl$MessageListenerWrapper;", "b", "Lcom/heytap/health/devicemanager/lock/LockDMHashMap;", "messageListeners", "Lcom/heytap/health/devicemanager/client/impl/multiple/DMMessageMultipleImpl$ArouterMessageListenerWrapper;", "c", "messageArouterListeners", "<init>", "()V", "ArouterMessageListenerWrapper", "MessageListenerWrapper", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class DMMessageMultipleImpl implements tl4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "DMMessageMultipleImpl";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LockDMHashMap<tl4.a, MessageListenerWrapper> messageListeners = new LockDMHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LockDMHashMap<String, ArouterMessageListenerWrapper> messageArouterListeners = new LockDMHashMap<>();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/multiple/DMMessageMultipleImpl$ArouterMessageListenerWrapper;", "Lcom/oplus/aiunit/vision/mm5;", "Lcom/oplus/aiunit/vision/nxb$b;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "onMessageReceived", "toString", "b", "Ljava/lang/String;", "path", "", "role", "<init>", "(Lcom/heytap/health/devicemanager/client/impl/multiple/DMMessageMultipleImpl;ILjava/lang/String;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public final class ArouterMessageListenerWrapper extends mm5 implements nxb.b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String path;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DMMessageMultipleImpl f4041c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArouterMessageListenerWrapper(DMMessageMultipleImpl dMMessageMultipleImpl, @NotNull int i, String path) {
            super(i);
            Intrinsics.checkNotNullParameter(path, "path");
            this.f4041c = dMMessageMultipleImpl;
            this.path = path;
        }

        @Override // com.oplus.aiunit.vision.nxb.b
        public void onMessageReceived(@NotNull final String mac, @NotNull final MessageEvent event) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(event, "event");
            final ra5.c cVarF = gl4.managerApi.f(mac);
            if (sa5.a(getRole(), cVarF)) {
                a1 a1Var = a1.INSTANCE;
                Context contextA = b78.a();
                Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
                a1Var.b(contextA, this.path, new Function1<DMIMessageHandler, Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMMessageMultipleImpl$ArouterMessageListenerWrapper$onMessageReceived$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DMIMessageHandler dMIMessageHandler) {
                        invoke2(dMIMessageHandler);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull final DMIMessageHandler it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        final ra5.c cVar = cVarF;
                        final String str = mac;
                        final MessageEvent messageEvent = event;
                        wk4.a("onMessageReceived", it, new Function0<Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMMessageMultipleImpl$ArouterMessageListenerWrapper$onMessageReceived$1.1
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
                                it.onMessageReceived(cVar, str, messageEvent);
                            }
                        });
                    }
                });
            }
        }

        @NotNull
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getPath() {
            return this.path;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/multiple/DMMessageMultipleImpl$MessageListenerWrapper;", "Lcom/oplus/aiunit/vision/mm5;", "Lcom/oplus/aiunit/vision/nxb$b;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "onMessageReceived", "toString", "Lcom/oplus/aiunit/vision/tl4$a;", "b", "Lcom/oplus/aiunit/vision/tl4$a;", "listener", "", "role", "<init>", "(Lcom/heytap/health/devicemanager/client/impl/multiple/DMMessageMultipleImpl;ILcom/oplus/aiunit/vision/tl4$a;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public final class MessageListenerWrapper extends mm5 implements nxb.b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final tl4.a listener;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DMMessageMultipleImpl f4042c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageListenerWrapper(DMMessageMultipleImpl dMMessageMultipleImpl, @NotNull int i, tl4.a listener) {
            super(i);
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f4042c = dMMessageMultipleImpl;
            this.listener = listener;
        }

        @Override // com.oplus.aiunit.vision.nxb.b
        public void onMessageReceived(@NotNull final String mac, @NotNull final MessageEvent event) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(event, "event");
            final ra5.c cVarF = gl4.managerApi.f(mac);
            if (sa5.a(getRole(), cVarF)) {
                wk4.a("onMessageReceived", this.listener, new Function0<Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMMessageMultipleImpl$MessageListenerWrapper$onMessageReceived$1
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
                        this.this$0.listener.onMessageReceived(cVarF, mac, event);
                    }
                });
            }
        }

        @NotNull
        public String toString() {
            return this.listener.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/devicemanager/client/impl/multiple/DMMessageMultipleImpl$a", "Lcom/oplus/aiunit/vision/nxb$c;", "", "success", "", "code", "", "a", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements nxb.c {
        public final /* synthetic */ rl4.c a;

        public a(rl4.c cVar) {
            this.a = cVar;
        }

        @Override // com.oplus.aiunit.vision.nxb.c
        public void a(boolean success, int code) {
            this.a.a(success, code);
        }
    }

    public void a(@NotNull ra5 role, int sid, int cid, @NotNull String arouterPath) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        ArouterMessageListenerWrapper arouterMessageListenerWrapper = (ArouterMessageListenerWrapper) nm5.b(this.messageArouterListeners, role, arouterPath);
        if (arouterMessageListenerWrapper != null) {
            u89.MessageApi.d(sid, cid, arouterMessageListenerWrapper);
        }
    }

    @Override // com.oplus.aiunit.vision.tl4
    public boolean g(@NotNull ra5 role, @NotNull String mac, @NotNull MessageEvent message, @Nullable rl4.c result) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(message, "message");
        ra5.c cVarF = gl4.managerApi.f(mac);
        if (role.b(cVarF)) {
            return u89.MessageApi.c(mac, message, result != null ? new a(result) : null);
        }
        ml4.c(this.TAG, "sendMessage fail,deviceRole:" + cVarF + ",sendRole:" + role + "(" + gdb.a(mac) + "),message:" + message);
        return false;
    }

    @Override // com.oplus.aiunit.vision.tl4
    public void i(@NotNull ra5 role, int sid, @NotNull String arouterPath) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        p(role, sid, -1, arouterPath);
    }

    @Override // com.oplus.aiunit.vision.tl4
    public boolean j(@NotNull ra5 role, @NotNull MessageEvent message, @Nullable rl4.c result) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(message, "message");
        return g(role, gl4.managerApi.q(ra5.a.INSTANCE), message, result);
    }

    @Override // com.oplus.aiunit.vision.tl4
    public boolean k(@NotNull ra5 role, @NotNull MessageEvent message) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(message, "message");
        return g(role, gl4.managerApi.q(ra5.a.INSTANCE), message, null);
    }

    @Override // com.oplus.aiunit.vision.tl4
    public void l(@NotNull final ra5 role, int sid, int cid, @NotNull final tl4.a listener) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(listener, "listener");
        u89.MessageApi.a(sid, cid, (MessageListenerWrapper) nm5.a(this.messageListeners, role, listener, new Function0<MessageListenerWrapper>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMMessageMultipleImpl$addMessageListener$messageListenerWrapper$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DMMessageMultipleImpl.MessageListenerWrapper invoke() {
                return new DMMessageMultipleImpl.MessageListenerWrapper(this.this$0, role.getValue(), listener);
            }
        }));
    }

    @Override // com.oplus.aiunit.vision.tl4
    public void m(@NotNull ra5 role, int sid, @NotNull String arouterPath) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        a(role, sid, -1, arouterPath);
    }

    @Override // com.oplus.aiunit.vision.tl4
    public boolean o(@NotNull ra5 role, @NotNull String mac, @NotNull MessageEvent message) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(message, "message");
        return g(role, mac, message, null);
    }

    @Override // com.oplus.aiunit.vision.tl4
    public void p(@NotNull final ra5 role, int sid, int cid, @NotNull final String arouterPath) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        u89.MessageApi.a(sid, cid, (ArouterMessageListenerWrapper) nm5.a(this.messageArouterListeners, role, arouterPath, new Function0<ArouterMessageListenerWrapper>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMMessageMultipleImpl$addARouterListener$messageListenerWrapper$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DMMessageMultipleImpl.ArouterMessageListenerWrapper invoke() {
                return new DMMessageMultipleImpl.ArouterMessageListenerWrapper(this.this$0, role.getValue(), arouterPath);
            }
        }));
    }

    @Override // com.oplus.aiunit.vision.tl4
    public void r(@NotNull ra5 role, @NotNull tl4.a listener) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(listener, "listener");
        l(role, -1, -1, listener);
    }

    @Override // com.oplus.aiunit.vision.tl4
    public void s(@NotNull ra5 role, int sid, int cid, @NotNull tl4.a listener) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(listener, "listener");
        MessageListenerWrapper messageListenerWrapper = (MessageListenerWrapper) nm5.b(this.messageListeners, role, listener);
        if (messageListenerWrapper != null) {
            u89.MessageApi.d(sid, cid, messageListenerWrapper);
        }
    }
}

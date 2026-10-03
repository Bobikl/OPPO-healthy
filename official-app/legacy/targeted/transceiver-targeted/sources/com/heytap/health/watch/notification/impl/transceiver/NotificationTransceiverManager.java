package com.heytap.health.watch.notification.impl.transceiver;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.watch.notification.BleNotificationNeedIcon;
import com.heytap.health.watch.notification.CacheIcons;
import com.heytap.health.watch.notification.NotificationRemoved;
import com.heytap.health.watch.notification.ParsedNotificationActionProto;
import com.heytap.health.watch.notification.SimpleNotificationProto;
import com.heytap.health.watch.notification.WeChatLoginStatus;
import com.heytap.health.watch.notification.impl.module.NotificationModule;
import com.heytap.health.watch.notification.impl.transceiver.NotificationTransceiverManager;
import com.oplus.aiunit.p007vision.exc;
import com.oplus.aiunit.p007vision.gwc;
import com.oplus.aiunit.p007vision.kyc;
import com.oplus.aiunit.p007vision.s0a;
import com.oplus.aiunit.p007vision.vxc;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ra5;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\dex\classes19.dex */
@Route(path = "/ntf/TransceiverManager")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/watch/notification/impl/transceiver/NotificationTransceiverManager;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "Landroid/content/Context;", "context", "", "init", "Lcom/oplus/aiunit/vision/ra5;", "role", "", "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "onMessageReceived", "<init>", "()V", "Companion", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class NotificationTransceiverManager extends DMIMessageHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final vxc i = new vxc();

    /* JADX INFO: renamed from: com.heytap.health.watch.notification.impl.transceiver.NotificationTransceiverManager$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/watch/notification/impl/transceiver/NotificationTransceiverManager$a;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "", "b", "", "TAG", "Ljava/lang/String;", "Lcom/oplus/aiunit/vision/vxc;", "mTransceiverConverter", "Lcom/oplus/aiunit/vision/vxc;", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void c(Node node) {
            Intrinsics.checkNotNullParameter(node, "$node");
            NotificationTransceiverManager.i.f(node);
        }

        public final void b(@NotNull final Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.xxc
                @Override // java.lang.Runnable
                public final void run() {
                    NotificationTransceiverManager.Companion.c(node);
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static final void Q2(MessageEvent messageEvent, String str) {
        String strKey;
        Intrinsics.checkNotNullParameter(messageEvent, "$messageEvent");
        Intrinsics.checkNotNullParameter(str, "$nodeId");
        if (2 != messageEvent.getServiceId()) {
            a7b.m("NTF_TransceiverManager", "onMessageReceived: not notification module message");
        }
        int commandId = messageEvent.getCommandId();
        byte[] data = messageEvent.getData();
        a7b.m("NTF_TransceiverManager", "onMessageReceived: cid=" + commandId);
        if (commandId == 3 || commandId == 4) {
            i.a(commandId, data);
            return;
        }
        if (commandId == 48) {
            WeChatLoginStatus weChatLoginStatusL = exc.INSTANCE.l(data);
            if (weChatLoginStatusL != null) {
                gwc.INSTANCE.N(weChatLoginStatusL.getStatus());
                return;
            }
            return;
        }
        if (commandId == 64) {
            i.b(data);
            return;
        }
        if (commandId == 150) {
            try {
                s0a s0aVar = s0a.INSTANCE;
                CacheIcons from = CacheIcons.parseFrom(data);
                Intrinsics.checkNotNullExpressionValue(from, "parseFrom(data)");
                s0aVar.b(from);
                return;
            } catch (InvalidProtocolBufferException unused) {
                return;
            }
        }
        if (commandId == 201) {
            i.a(commandId, data);
            return;
        }
        if (commandId == 211) {
            int iE = exc.INSTANCE.e(data);
            StringBuilder sb = new StringBuilder();
            sb.append("onMessageReceived: devices status=");
            sb.append(iE);
            NotificationModule.INSTANCE.J(str, iE);
            return;
        }
        if (commandId == 215) {
            NotificationRemoved notificationRemovedH = exc.INSTANCE.h(data);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onMessageReceived: dismiss fluid = ");
            sb2.append(notificationRemovedH);
            NotificationModule.INSTANCE.o(notificationRemovedH);
            return;
        }
        if (commandId == 144) {
            BleNotificationNeedIcon bleNotificationNeedIconC = exc.INSTANCE.c(data);
            if (bleNotificationNeedIconC == null || (strKey = bleNotificationNeedIconC.getStrKey()) == null) {
                return;
            }
            kyc.INSTANCE.c(strKey);
            return;
        }
        if (commandId == 145) {
            kyc.INSTANCE.a();
            return;
        }
        switch (commandId) {
            case CID_MSG_ACTION_REPLY_VALUE:
                ParsedNotificationActionProto parsedNotificationActionProtoA = exc.INSTANCE.a(data);
                if (parsedNotificationActionProtoA != null) {
                    i.c(parsedNotificationActionProtoA);
                }
                break;
            case 204:
                kyc.INSTANCE.a();
                break;
            case CID_MSG_CLEAR_PICTURE_KEY_VALUE:
                SimpleNotificationProto simpleNotificationProtoD = exc.INSTANCE.d(data);
                if (simpleNotificationProtoD != null) {
                    kyc kycVar = kyc.INSTANCE;
                    String key = simpleNotificationProtoD.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "it.key");
                    kycVar.c(key);
                }
                break;
            case CID_MSG_SYNC_AFTER_DEVICE_RESTART_VALUE:
                i.d(data);
                break;
            case CID_MSG_OPEN_PHONE_VALUE:
                String strF = exc.INSTANCE.f(data);
                if (strF != null) {
                    i.e(strF);
                }
                break;
        }
    }

    public void init(@Nullable Context context) {
        onCreate(context);
    }

    public void onMessageReceived(@NotNull ra5 role, @NotNull final String nodeId, @NotNull final MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.wxc
            @Override // java.lang.Runnable
            public final void run() {
                NotificationTransceiverManager.Q2(messageEvent, nodeId);
            }
        });
    }
}

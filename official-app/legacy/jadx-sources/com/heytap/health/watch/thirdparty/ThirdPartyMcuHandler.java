package com.heytap.health.watch.thirdparty;

import android.annotation.SuppressLint;
import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.wearable.oms.base.message.MessageManager;
import com.heytap.wearable.oms.common.Status;
import com.oplus.aiunit.vision.k25;
import com.oplus.aiunit.vision.ovj;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/thirdparty/message_mcu")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/watch/thirdparty/ThirdPartyMcuHandler;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "Landroid/content/Context;", "context", "", "onCreate", "", "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "onMessageReceived", "Lcom/heytap/wearable/oms/base/message/MessageManager;", "i", "Lcom/heytap/wearable/oms/base/message/MessageManager;", "messageManager", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ThirdPartyMcuHandler extends DMIMessageHandler {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public MessageManager messageManager;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/watch/thirdparty/ThirdPartyMcuHandler$a", "Lcom/heytap/wearable/oms/base/message/MessageManager;", "", "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "Lcom/heytap/wearable/oms/common/Status;", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends MessageManager {
        @Override // com.oplus.aiunit.vision.sx9
        @NotNull
        public Status a(@NotNull String nodeId, @NotNull MessageEvent messageEvent) {
            Intrinsics.checkNotNullParameter(nodeId, "nodeId");
            Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
            Status statusF = ovj.d().f(messageEvent);
            Intrinsics.checkNotNullExpressionValue(statusF, "getInstance().sendMessage(messageEvent)");
            return statusF;
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onCreate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.messageManager = new a();
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    @SuppressLint({"CheckResult"})
    public void onMessageReceived(@NotNull String nodeId, @NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        k25.a("ThirdPartyMcuHandler", "onMessageReceived: " + messageEvent.getServiceId() + "#" + messageEvent.getCommandId());
        MessageManager messageManager = this.messageManager;
        Intrinsics.checkNotNull(messageManager);
        int commandId = messageEvent.getCommandId();
        byte[] data = messageEvent.getData();
        Intrinsics.checkNotNullExpressionValue(data, "messageEvent.data");
        messageManager.f(nodeId, 104, commandId, data);
    }
}

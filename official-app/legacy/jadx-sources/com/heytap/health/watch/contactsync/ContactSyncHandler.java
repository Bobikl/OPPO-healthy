package com.heytap.health.watch.contactsync;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.z44;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = z44.MESSAGE_API_PATH)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/heytap/health/watch/contactsync/ContactSyncHandler;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "Lcom/oplus/aiunit/vision/ra5;", "role", "", "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "", "onMessageReceived", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ContactSyncHandler extends DMIMessageHandler {
    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(@Nullable ra5 role, @NotNull String nodeId, @NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        ContactSyncOnceApi.INSTANCE.k(messageEvent);
    }
}

package com.heytap.health.watch.heybreeno;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/heybreeno/sync")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/heytap/health/watch/heybreeno/HeyBreenoHandler;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "()V", "onMessageReceived", "", "nodeId", "", "messageEvent", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "heybreeno_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HeyBreenoHandler extends DMIMessageHandler {
    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(@NotNull String nodeId, @NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        HeyBreenoManager.INSTANCE.b(messageEvent);
    }
}

package com.heytap.wearable.watch.finddevice.third;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.device.protocol.findwatch.FindWatchProto$FindWatchInfo;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.wearable.watch.InterConnSyncMainInitializer;
import com.oplus.aiunit.vision.a7b;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = InterConnSyncMainInitializer.SERVICE_FIND_WATCH)
public final class ThirdFindDeviceHandler extends DMIMessageHandler {
    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        super.onMessageReceived(str, messageEvent);
        if (messageEvent.getCommandId() == 1) {
            try {
                ThirdFindDeviceManager.r().A(FindWatchProto$FindWatchInfo.parseFrom(messageEvent.getData()));
            } catch (InvalidProtocolBufferException e2) {
                a7b.f("ThirdFindDeviceHandler", e2.getMessage());
            }
        }
    }
}

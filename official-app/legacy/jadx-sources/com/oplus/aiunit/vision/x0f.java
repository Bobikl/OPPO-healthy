package com.oplus.aiunit.vision;

import com.op.proto.CapabilityHand;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes17.dex */
public class x0f {
    public static MessageEvent a(int i) {
        return new MessageEvent(11, 1, CapabilityHand.Capability.newBuilder().setHandSignal(i).setHandResult(false).build().toByteArray());
    }
}

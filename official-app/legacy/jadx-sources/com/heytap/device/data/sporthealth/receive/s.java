package com.heytap.device.data.sporthealth.receive;

import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.protocol.fitness.FitnessProto$RemindPopUp;
import com.oplus.aiunit.vision.a1e;
import com.oplus.aiunit.vision.a7b;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class s implements j {
    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        try {
            a7b.f("SleepRestSettingProcessor", "OnMessageReceived remindPopUp=" + a1e.b(FitnessProto$RemindPopUp.parseFrom(messageEvent.getData())));
        } catch (InvalidProtocolBufferException e2) {
            a7b.b("SleepRestSettingProcessor", "Parse sleep state msg fail=" + e2);
        }
    }

    @Override // com.heytap.device.data.sporthealth.receive.j
    public List<j.a> t() {
        return Collections.singletonList(j.a.a(5, 72));
    }
}

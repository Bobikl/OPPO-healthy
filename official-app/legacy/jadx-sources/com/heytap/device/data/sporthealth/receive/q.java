package com.heytap.device.data.sporthealth.receive;

import android.annotation.SuppressLint;
import com.heytap.health.protocol.workout.WorkoutProto$Run3KmTime;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.erk;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@SuppressLint({"CheckResult"})
public class q implements j {
    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        try {
            erk.f(WorkoutProto$Run3KmTime.parseFrom(messageEvent.getData()));
        } catch (Exception e2) {
            a7b.b("Run3KmTimeProcessor", e2.getMessage());
        }
    }

    @Override // com.heytap.device.data.sporthealth.receive.j
    public List<j.a> t() {
        return Arrays.asList(j.a.a(4, 12));
    }
}

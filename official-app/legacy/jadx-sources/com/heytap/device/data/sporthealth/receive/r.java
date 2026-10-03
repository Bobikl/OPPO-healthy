package com.heytap.device.data.sporthealth.receive;

import androidx.annotation.NonNull;
import com.heytap.device.sleep.SleepModeManager;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class r implements j {
    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(@NonNull String str, @NonNull MessageEvent messageEvent) {
        SleepModeManager.INSTANCE.u(messageEvent);
    }

    @Override // com.heytap.device.data.sporthealth.receive.j
    public List<j.a> t() {
        return Arrays.asList(j.a.a(5, 73), j.a.a(5, 79), j.a.a(5, 74), j.a.a(5, 204), j.a.a(5, 209), j.a.a(5, 205));
    }
}

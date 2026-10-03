package com.oplus.aiunit.vision;

import com.heytap.health.annotation.ProcessName;
import com.heytap.wearable.emergency.api.emergency.EmergencyMainApis;
import com.heytap.wearable.watch.emergency.EmergencyMainApisImpl;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fw3 {
    public static final void a(List<i70> list) {
        list.add(new i70(EmergencyMainApisImpl.class, EmergencyMainApis.EMERGENCY_MAIN_AIDL, ProcessName.MAIN, 2, new luc()));
    }
}

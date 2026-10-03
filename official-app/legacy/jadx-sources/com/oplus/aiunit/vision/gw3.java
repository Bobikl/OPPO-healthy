package com.oplus.aiunit.vision;

import com.heytap.health.annotation.ProcessName;
import com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis;
import com.heytap.wearable.watch.emergency.EmergencyTransportApisImpl;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gw3 {
    public static final void a(List<i70> list) {
        list.add(new i70(EmergencyTransportApisImpl.class, EmergencyTransportApis.EMERGENCY_TRANSPORT_AIDL, ProcessName.TRANSPORT, 2, new luc()));
    }
}

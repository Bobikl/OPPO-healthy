package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class i37 {
    public static final String TAG = "FamilyDeviceUtil";

    public static boolean b() {
        return c(gl4.managerApi.getCurrActiveMac());
    }

    public static boolean c(String str) {
        return ((Boolean) lc5.c(str).a(new Function1() { // from class: com.oplus.aiunit.vision.h37
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i37.d((DeviceInfo) obj);
            }
        })).booleanValue();
    }

    public static /* synthetic */ Boolean d(DeviceInfo deviceInfo) {
        boolean zRa = deviceInfo.Ra();
        StringBuilder sb = new StringBuilder();
        sb.append("isFamilyDeviceByMac=");
        sb.append(zRa);
        return Boolean.valueOf(zRa);
    }
}

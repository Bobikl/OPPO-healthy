package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.heytap.health.device.ota.bean.OTAVersion;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import java.util.List;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class atd {
    public static final String WIFI_CONNECTION_REASON = "ota";

    public static long a(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return (long) Math.ceil(((j2 / 1024.0d) / 400.0d) * 1.5d * 1000.0d);
    }

    public static boolean b(@Nullable String str) {
        return ((Boolean) lc5.c(str).a(new Function1() { // from class: com.oplus.aiunit.vision.zsd
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((DeviceInfo) obj).db());
            }
        })).booleanValue();
    }

    public static long c(@Nullable OTAVersion oTAVersion) {
        String str;
        if (oTAVersion != null && (str = oTAVersion.size) != null) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
                a7b.m("OtaWifiP2pHelper", "parseOtaPackageSizeBytes fail: " + oTAVersion.size);
            }
        }
        return 0L;
    }

    public static void d() {
        a7b.f("OtaWifiP2pHelper", "releaseWifiConnection reason=ota");
        gl4.managerApi.disableWifiConnection(WIFI_CONNECTION_REASON);
    }

    public static boolean e(@Nullable String str, long j2) {
        return b(str) && j2 > 1048576;
    }

    public static long f(@Nullable OTAVersion oTAVersion) {
        List list;
        long j2 = 0;
        if (oTAVersion != null && (list = oTAVersion.fileList) != null) {
            for (Object obj : list) {
                if (obj instanceof m6d) {
                    j2 += ((m6d) obj).f13962c;
                }
            }
        }
        return j2;
    }
}

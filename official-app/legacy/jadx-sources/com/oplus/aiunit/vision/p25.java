package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import com.oppo.obus.common.configmetadata.core.enums.Area;

/* JADX INFO: loaded from: classes6.dex */
public final class p25 {
    public static void a(String str, co3 co3Var, zs6 zs6Var, boolean z) {
        if (!f(str) || co3Var == null || zs6Var == null) {
            return;
        }
        if (z) {
            if (zs6Var.i != 4) {
                z6b.q("DebugOverridePolicy", "applyOverrides.status: " + zs6Var.i + " -> ONLINE, appId=" + str);
                zs6Var.i = 4;
                return;
            }
            return;
        }
        Integer numE = e(str, co3Var.o);
        if (numE != null) {
            z6b.k("DebugOverridePolicy", "applyOverrides.uploadType: " + co3Var.o + " -> " + numE + ", appId=" + str);
            co3Var.o = numE.intValue();
        }
    }

    public static DebugModeEntity b(String str) {
        ou3 ou3Var;
        DebugModeEntity debugModeEntityD;
        if (TextUtils.isEmpty(str) || (ou3Var = t56.configService) == null || (debugModeEntityD = ou3Var.d(str)) == null || !g(debugModeEntityD, System.currentTimeMillis())) {
            return null;
        }
        return debugModeEntityD;
    }

    public static Area c(String str) {
        DebugModeEntity debugModeEntityB = b(str);
        if (debugModeEntityB == null) {
            return null;
        }
        String area = debugModeEntityB.getArea();
        if (TextUtils.isEmpty(area)) {
            return null;
        }
        try {
            return Area.valueOf(area);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean d(String str) {
        DebugModeEntity debugModeEntityB = b(str);
        if (debugModeEntityB != null && debugModeEntityB.getSample() == 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    public static Integer e(String str, int i) {
        DebugModeEntity debugModeEntityB = b(str);
        if (debugModeEntityB != null && debugModeEntityB.getUploadType() == 1) {
            return (i == 0 || i == 1 || i == 2) ? 2 : null;
        }
        return null;
    }

    public static boolean f(String str) {
        return b(str) != null;
    }

    public static boolean g(DebugModeEntity debugModeEntity, long j2) {
        if (debugModeEntity == null) {
            return false;
        }
        long startAt = debugModeEntity.getStartAt();
        long endAt = debugModeEntity.getEndAt();
        return ((startAt > 0L ? 1 : (startAt == 0L ? 0 : -1)) <= 0 || (j2 > startAt ? 1 : (j2 == startAt ? 0 : -1)) >= 0) && ((endAt > 0L ? 1 : (endAt == 0L ? 0 : -1)) <= 0 || (j2 > endAt ? 1 : (j2 == endAt ? 0 : -1)) < 0);
    }

    public static boolean h(String str) {
        return f(str);
    }
}

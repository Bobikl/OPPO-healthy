package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.heytap.health.stress.R$string;
import java.time.LocalDate;
import java.time.ZoneId;

/* JADX INFO: loaded from: classes18.dex */
public class o0j {
    public static final String EMPTY = "- -";
    public static final long STRESS_DATA_START_TIME = 1546272000000L;
    public static final String TAG = "Health_Stress";

    public static String a(Context context, float f) {
        if (f > 0.0f && f <= 4.0f) {
            return context.getString(R$string.health_stress_relax);
        }
        if (f <= 4.0f || f > 6.0f) {
            return f > 6.0f ? context.getString(R$string.health_stress_unbalance) : "- -";
        }
        return context.getString(R$string.health_stress_balance);
    }

    public static float b(float f) {
        float f2 = f * 10.0f;
        if (f2 > 0.0f && f2 <= 40.0f) {
            return 16.5f;
        }
        if (f2 < 40.0f || f2 > 60.0f) {
            return f2 > 60.0f ? 82.5f : 0.0f;
        }
        return 50.0f;
    }

    public static long c() {
        return LocalDate.now().plusDays(1L).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - 1000;
    }

    public static long d() {
        return LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static boolean e(StressDataStat stressDataStat) {
        if (stressDataStat == null) {
            return true;
        }
        return stressDataStat.getRelaxStressTotalTime() == 0 && stressDataStat.getNormalStressTotalTime() == 0 && stressDataStat.getMiddleStressTotalTime() == 0 && stressDataStat.getHighStressTotalTime() == 0;
    }

    public static int f(float f) {
        if (f >= 0.0f && f <= 29.0f) {
            return R$string.health_stress_relax;
        }
        if (f < 30.0f || f > 59.0f) {
            return (f < 60.0f || f > 79.0f) ? R$string.health_stress_high : R$string.health_stress_medium;
        }
        return R$string.health_stress_normal;
    }
}

package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.oplus.drs.base.concurrent.DeviceTier;

/* JADX INFO: loaded from: classes6.dex */
public interface np5 {

    public static class a implements np5 {
        public final Context a;

        public a(Context context) {
            this.a = context.getApplicationContext();
        }

        public final String a(String str) {
            try {
                return (String) Build.class.getField(str).get(null);
            } catch (Throwable unused) {
                return "";
            }
        }

        public final long b() {
            try {
                ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    long j2 = memoryInfo.totalMem;
                    if (j2 > 0) {
                        long jMax = Math.max(1L, j2 / 1073741824);
                        Log.d("DeviceTierResolver", "totalMem=" + memoryInfo.totalMem + " bytes, ramGb=" + jMax);
                        return jMax;
                    }
                }
            } catch (Throwable th) {
                Log.w("DeviceTierResolver", "Failed to get totalMem", th);
            }
            Log.w("DeviceTierResolver", "Failed to get RAM, using default 4GB");
            return 4L;
        }

        public final boolean c() {
            String lowerCase = (d(Build.HARDWARE) + " " + d(Build.BOARD) + " " + d(a("SOC_MODEL"))).toLowerCase();
            return lowerCase.contains("mt6") || lowerCase.contains("mt67") || lowerCase.contains("msm8") || lowerCase.contains("sdm4");
        }

        public final String d(String str) {
            return str == null ? "" : str;
        }

        @Override // com.oplus.aiunit.vision.np5
        public DeviceTier resolve() {
            DeviceTier deviceTier;
            long jB = b();
            boolean zC = c();
            if (jB > 4 || !zC) {
                deviceTier = jB <= 8 ? DeviceTier.MID : DeviceTier.HIGH;
            } else {
                deviceTier = DeviceTier.LOW;
            }
            Log.i("DeviceTierResolver", "DeviceTier resolved: tier=" + deviceTier + ", totalRamGb=" + jB + ", legacySoc=" + zC);
            return deviceTier;
        }
    }

    DeviceTier resolve();
}

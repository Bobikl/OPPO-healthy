package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;

/* JADX INFO: loaded from: classes19.dex */
public final class sli {
    public static void a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            opa.a(context.getApplicationContext(), "drs_sdk_storage").putBoolean("drain_done_" + str, true);
            TrackLogger.h("StandaloneDrainGuard", "markDrained: appId=%s", str);
        } catch (Throwable th) {
            TrackLogger.d("StandaloneDrainGuard", "markDrained error", th, new Object[0]);
        }
    }

    public static void b(Context context, boolean z) {
        if (context == null) {
            return;
        }
        try {
            opa opaVarA = opa.a(context.getApplicationContext(), "drs_sdk_storage");
            if (!z) {
                opaVarA.remove("standalone_time");
            } else if (!opaVarA.contains("standalone_time")) {
                opaVarA.putLong("standalone_time", System.currentTimeMillis());
            }
        } catch (Throwable th) {
            TrackLogger.d("StandaloneDrainGuard", "setIsStandalone error", th, new Object[0]);
        }
    }
}

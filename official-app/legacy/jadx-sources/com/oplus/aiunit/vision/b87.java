package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class b87 {
    public static final String FF_CORE_RT_DUAL_WORKER = "ff_core_rt_dual_worker";
    public static final String FF_CORE_RT_HANDLER_ROUTE = "ff_core_rt_handler_route";
    public static final String FF_CORE_RT_INDEPENDENT_DB = "ff_core_rt_independent_db";
    public static final String FF_CORE_RT_MIGRATION_CUTOVER = "ff_core_rt_migration_cutover";
    public static final String FF_SDK_IPC_900KB = "ff_sdk_ipc_900kb";
    public static final String FF_SDK_RT_DIRECT_IPC = "ff_sdk_rt_direct_ipc";
    public static final String FF_SHARED_NTP_IN_SDK = "ff_shared_ntp_in_sdk";

    public static boolean a(Context context, String str, boolean z) {
        if (context != null && str != null && !str.isEmpty()) {
            try {
                return context.getApplicationContext().getSharedPreferences("drs_feature_flags", 0).getBoolean(str, z);
            } catch (Throwable unused) {
            }
        }
        return z;
    }
}

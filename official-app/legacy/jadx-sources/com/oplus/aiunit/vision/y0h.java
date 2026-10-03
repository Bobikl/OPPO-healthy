package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class y0h {
    public static final String STAT_OLD_DATA_CURRENT_VERSION = "_stat_old_data_current_version";
    public static final int STAT_OLD_DATA_VERSION = 31;

    public static int a(String str) {
        return qa2.spData.m0(q9j.SYNC_SP, str + STAT_OLD_DATA_CURRENT_VERSION, 1);
    }

    public static void b(String str, int i) {
        qa2.spData.U(q9j.SYNC_SP, str + STAT_OLD_DATA_CURRENT_VERSION, i);
    }
}

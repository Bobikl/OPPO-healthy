package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class jh3 {
    public static final String SP_TABLE = "global_data";

    public static long a(Context context) {
        return context.getSharedPreferences(SP_TABLE, 0).getLong("update_time", 0L);
    }

    public static void b(Context context, long j2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SP_TABLE, 0).edit();
        editorEdit.putLong("update_time", j2);
        editorEdit.apply();
    }
}

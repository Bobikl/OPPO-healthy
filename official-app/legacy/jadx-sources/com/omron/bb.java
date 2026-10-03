package com.omron;

import com.oplus.utrace.db.UTraceSQLiteHelperKt;

/* JADX INFO: loaded from: classes5.dex */
public class bb {
    public static String a(int i) {
        return (i == 1 || i != 2) ? UTraceSQLiteHelperKt.COL_INFO : "error";
    }
}

package com.oplus.aiunit.vision;

import java.time.LocalDate;
import java.time.ZoneId;

/* JADX INFO: loaded from: classes16.dex */
public final class xp2 {
    public static String a(LocalDate localDate, String str) {
        return fn9.g(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli(), str);
    }
}

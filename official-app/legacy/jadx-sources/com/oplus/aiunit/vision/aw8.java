package com.oplus.aiunit.vision;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: loaded from: classes16.dex */
public class aw8 {
    public static final int START_TIME_HOUR = 20;

    public static long a(long j2, long j3) {
        return Math.abs(LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate().toEpochDay() - LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().toEpochDay());
    }
}

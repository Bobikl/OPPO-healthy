package com.heytap.connect.api.logger;

import java.util.Arrays;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/connect/api/logger/LogLevel;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "LEVEL_VERBOSE", "LEVEL_DEBUG", "LEVEL_INFO", "LEVEL_WARNING", "LEVEL_ERROR", "LEVEL_NONE", "connect_release"}, k = 1, mv = {1, 5, 1})
public enum LogLevel {
    LEVEL_VERBOSE(0),
    LEVEL_DEBUG(1),
    LEVEL_INFO(2),
    LEVEL_WARNING(4),
    LEVEL_ERROR(5),
    LEVEL_NONE(6);

    private final int value;

    LogLevel(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static LogLevel[] valuesCustom() {
        LogLevel[] logLevelArrValuesCustom = values();
        return (LogLevel[]) Arrays.copyOf(logLevelArrValuesCustom, logLevelArrValuesCustom.length);
    }

    public final int getValue() {
        return this.value;
    }
}

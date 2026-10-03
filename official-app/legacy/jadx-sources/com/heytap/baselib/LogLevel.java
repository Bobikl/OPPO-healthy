package com.heytap.baselib;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/heytap/baselib/LogLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "LEVEL_VERBOSE", "LEVEL_DEBUG", "LEVEL_INFO", "LEVEL_WARNING", "LEVEL_ERROR", "LEVEL_NONE", "lib_utils_release"}, k = 1, mv = {1, 1, 15})
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

    public final int getValue() {
        return this.value;
    }
}

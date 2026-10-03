package com.heytap.health.insight.utils;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/heytap/health/insight/utils/InsightConstant$Trend", "", "Lcom/heytap/health/insight/utils/InsightConstant$Trend;", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "INC", "DEC", "FLAT", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public enum InsightConstant$Trend {
    INC(0),
    DEC(1),
    FLAT(2);

    private final int value;

    InsightConstant$Trend(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}

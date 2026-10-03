package com.heytap.health.sunshine.constant;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/sunshine/constant/SunshineType;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "DEFAULT", "ONE", "TWO", "THREE", "FOUR", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public enum SunshineType {
    DEFAULT(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4);

    private final int value;

    SunshineType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}

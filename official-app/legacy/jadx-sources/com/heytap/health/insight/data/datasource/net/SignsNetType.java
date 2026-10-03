package com.heytap.health.insight.data.datasource.net;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/insight/data/datasource/net/SignsNetType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "FEVER", "STAY_UP", "OVER_EXERCISE", "SUDDEN_STAY_UP", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum SignsNetType {
    FEVER(1),
    STAY_UP(2),
    OVER_EXERCISE(3),
    SUDDEN_STAY_UP(4);

    private final int type;

    SignsNetType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}

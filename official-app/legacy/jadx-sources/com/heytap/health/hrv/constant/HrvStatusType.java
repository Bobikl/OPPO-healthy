package com.heytap.health.hrv.constant;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/heytap/health/hrv/constant/HrvStatusType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "DEFAULT", "GOOD", "RELAX", "NORMAL", "REST", "hrv_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum HrvStatusType {
    DEFAULT(0),
    GOOD(4),
    RELAX(3),
    NORMAL(2),
    REST(1);

    private final int type;

    HrvStatusType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}

package com.oplus.drs.core.ratelimit;

/* JADX INFO: loaded from: classes6.dex */
public enum QuotaType {
    INGEST(0),
    UPLOAD(1);

    public final int value;

    QuotaType(int i) {
        this.value = i;
    }

    public static QuotaType fromValue(int i) {
        for (QuotaType quotaType : values()) {
            if (quotaType.value == i) {
                return quotaType;
            }
        }
        return INGEST;
    }
}

package com.oplus.drs.core.reconciliation;

/* JADX INFO: loaded from: classes6.dex */
public enum ClearReason {
    NONE(0, "Not Cleared"),
    DATA_CORRUPTED(1, "Data Corrupted"),
    TTL_EXPIRED(2, "TTL Expired"),
    DB_CAPACITY_FULL(3, "DB Capacity Full"),
    PENDING_DATA_CLEANUP(4, "Pending Data Cleanup"),
    PRIORITY_CLEANUP(5, "Priority-Based Cleanup"),
    REALTIME_CLEANUP(6, "Realtime Data Cleanup"),
    SDK_EXPIRED_CLEAN(7, "SDK Expired Clean"),
    SDK_CAPACITY_CLEAN(8, "SDK Capacity Clean"),
    OTHER(99, "Other Reasons");

    private final int code;
    private final String description;

    ClearReason(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static ClearReason fromCode(int i) {
        for (ClearReason clearReason : values()) {
            if (clearReason.getCode() == i) {
                return clearReason;
            }
        }
        return OTHER;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}

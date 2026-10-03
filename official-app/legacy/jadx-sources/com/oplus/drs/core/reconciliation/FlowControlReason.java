package com.oplus.drs.core.reconciliation;

/* JADX INFO: loaded from: classes6.dex */
public enum FlowControlReason {
    NONE(0, "Not Flow Controlled"),
    SYSTEM_BUSY(1, "System Busy (Backpressure)"),
    QUEUE_FULL(2, "Message Queue Full"),
    QUOTA_APP_EXCEEDED(3, "Quota Exceeded (Per-App)"),
    QUOTA_GLOBAL_EXCEEDED(4, "Quota Exceeded (Global)"),
    OTHER(99, "Other Reasons");

    private final int code;
    private final String description;

    FlowControlReason(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static FlowControlReason fromCode(int i) {
        for (FlowControlReason flowControlReason : values()) {
            if (flowControlReason.getCode() == i) {
                return flowControlReason;
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

package com.oplus.drs.core.reconciliation;

/* JADX INFO: loaded from: classes6.dex */
public enum ReconciliationStage {
    RECEIVED(1, "Received"),
    VALIDATION_FAILED(2, "Validation Failed"),
    FILTERED(3, "Filtered"),
    CACHED(4, "Cached"),
    RATE_LIMITED(5, "Rate Limited"),
    UPLOAD_ATTEMPT(6, "Upload Attempt"),
    UPLOAD_FAILED(7, "Upload Failed"),
    UPLOADED(8, "Uploaded"),
    EXPIRED(9, "Expired");

    private final int code;
    private final String description;

    ReconciliationStage(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static ReconciliationStage fromCode(int i) {
        for (ReconciliationStage reconciliationStage : values()) {
            if (reconciliationStage.getCode() == i) {
                return reconciliationStage;
            }
        }
        return RECEIVED;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}

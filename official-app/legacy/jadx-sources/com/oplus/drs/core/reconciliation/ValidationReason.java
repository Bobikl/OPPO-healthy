package com.oplus.drs.core.reconciliation;

/* JADX INFO: loaded from: classes6.dex */
public enum ValidationReason {
    NONE(0, "No Validation Failure"),
    MISSING_REQUIRED_FIELD(1, "Missing Required Field"),
    CLIENT_DATA_TOO_LARGE(2, "Client Data Too Large"),
    CLIENT_DB_WRITE_FAILED(3, "Client DB Write Failed"),
    CLIENT_STORAGE_FULL(4, "Client Local Storage Full"),
    CLIENT_EXPIRED_CLEAN(5, "Client Local Expired Clean"),
    CLIENT_CAPACITY_CLEAN(6, "Client Local Capacity Clean"),
    CLIENT_IPC_RETRY_EXHAUSTED(7, "Client IPC Retry Exhausted"),
    CLIENT_IPC_TIMEOUT(8, "Client IPC Timeout"),
    CLIENT_IPC_SERVICE_UNAVAILABLE(9, "Client IPC Service Unavailable"),
    JSON_PARSE_ERROR(10, "JSON Parse Error"),
    ENCRYPTION_ERROR(11, "Encryption Error"),
    OTHER(99, "Other Validation Error");

    private final int code;
    private final String description;

    ValidationReason(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static ValidationReason fromCode(int i) {
        for (ValidationReason validationReason : values()) {
            if (validationReason.getCode() == i) {
                return validationReason;
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

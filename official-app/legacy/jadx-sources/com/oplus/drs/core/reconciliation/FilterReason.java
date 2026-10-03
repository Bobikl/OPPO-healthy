package com.oplus.drs.core.reconciliation;

/* JADX INFO: loaded from: classes6.dex */
public enum FilterReason {
    NONE(0, "Not Filtered"),
    RULE_DISABLED(1, "Rule Disabled"),
    SAMPLE_REJECT(2, "Sample Reject"),
    ILLEGAL_PKG(3, "Illegal Calling Package"),
    SDK_PREFILTER_STATUS(4, "SDK Prefilter Status Drop"),
    SDK_PREFILTER_SAMPLE(5, "SDK Prefilter Sample Drop"),
    OTHER(99, "Other Reasons");

    private final int code;
    private final String description;

    FilterReason(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static FilterReason fromCode(int i) {
        for (FilterReason filterReason : values()) {
            if (filterReason.getCode() == i) {
                return filterReason;
            }
        }
        return OTHER;
    }

    public static FilterReason fromReasonString(String str) {
        if (str == null) {
            return OTHER;
        }
        switch (str) {
            case "SAMPLE_REJECT":
                return SAMPLE_REJECT;
            case "SDK_PREFILTER_STATUS_DROP":
                return SDK_PREFILTER_STATUS;
            case "SDK_PREFILTER_SAMPLE_DROP":
                return SDK_PREFILTER_SAMPLE;
            case "ILLEGAL_PKG":
                return ILLEGAL_PKG;
            case "RULE_DISABLED":
                return RULE_DISABLED;
            default:
                return OTHER;
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}

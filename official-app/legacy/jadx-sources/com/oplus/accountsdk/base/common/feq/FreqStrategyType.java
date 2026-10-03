package com.oplus.accountsdk.base.common.feq;

/* JADX INFO: loaded from: classes6.dex */
public enum FreqStrategyType {
    SUCCESS("STRATEGY_SUCCESS"),
    FAIL("STRATEGY_ERROR");

    private final String value;

    FreqStrategyType(String str) {
        this.value = str;
    }

    public static FreqStrategyType fromString(String str) {
        for (FreqStrategyType freqStrategyType : values()) {
            if (freqStrategyType.value.equals(str)) {
                return freqStrategyType;
            }
        }
        return null;
    }

    public String getValue() {
        return this.value;
    }
}

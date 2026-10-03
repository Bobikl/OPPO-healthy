package com.oplus.drs.rom.sdk.comm.exception;

/* JADX INFO: loaded from: classes19.dex */
public enum CleanExceptionType {
    EXPIRED_CLEAN("sdk_clean_expired", "过期清理"),
    CAPACITY_CLEAN("sdk_clean_capacity", "容量清理");

    private final String code;
    private final String description;

    CleanExceptionType(String str, String str2) {
        this.code = str;
        this.description = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}

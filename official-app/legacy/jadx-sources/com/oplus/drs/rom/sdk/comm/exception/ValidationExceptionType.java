package com.oplus.drs.rom.sdk.comm.exception;

/* JADX INFO: loaded from: classes19.dex */
public enum ValidationExceptionType {
    SIZE_EXCEEDED("sdk_validation_size_exceeded", "单条数据超过500KB"),
    REQUIRED_FIELD_MISSING("sdk_validation_field_missing", "必填字段缺失"),
    FORMAT_ERROR("sdk_validation_format_error", "数据格式错误"),
    ENCRYPT_FAILED("sdk_validation_encrypt_failed", "加密失败");

    private final String code;
    private final String description;

    ValidationExceptionType(String str, String str2) {
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

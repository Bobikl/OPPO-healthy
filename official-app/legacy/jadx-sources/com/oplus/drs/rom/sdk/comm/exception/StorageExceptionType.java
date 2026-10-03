package com.oplus.drs.rom.sdk.comm.exception;

/* JADX INFO: loaded from: classes19.dex */
public enum StorageExceptionType {
    DB_FULL("sdk_storage_db_full", "数据库已满");

    private final String code;
    private final String description;

    StorageExceptionType(String str, String str2) {
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

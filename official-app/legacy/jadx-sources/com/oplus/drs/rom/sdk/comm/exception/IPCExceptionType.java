package com.oplus.drs.rom.sdk.comm.exception;

/* JADX INFO: loaded from: classes19.dex */
public enum IPCExceptionType {
    SERVICE_UNAVAILABLE("sdk_ipc_service_unavailable", "DRS服务不可用"),
    TIMEOUT("sdk_ipc_timeout", "超时"),
    RETRY_EXHAUSTED("sdk_ipc_retry_exhausted", "重试次数耗尽");

    private final String code;
    private final String description;

    IPCExceptionType(String str, String str2) {
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

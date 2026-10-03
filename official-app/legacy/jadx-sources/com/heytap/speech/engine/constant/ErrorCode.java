package com.heytap.speech.engine.constant;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/speech/engine/constant/ErrorCode;", "", "()V", "ERROR_AGENT_NODE_NOT_CONNECT", "", "ERROR_AGENT_UNKNOWN", "ERROR_ASR_NODE_NOT_CONNECT", "ERROR_BUSCLIENT_IMPLEMENT", "ERROR_BUSCLIENT_RUNTIME", "ERROR_INIT_ILLEGAL_PARAMETER", "ERROR_UNKNOWN", "ERROR_VAD_NODE_NOT_CONNECT", "ERROR_VAD_UNKNOWN", "SUCCESS", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ErrorCode {
    public static final int ERROR_AGENT_NODE_NOT_CONNECT = -30001;
    public static final int ERROR_AGENT_UNKNOWN = -30000;
    public static final int ERROR_ASR_NODE_NOT_CONNECT = -40001;
    public static final int ERROR_BUSCLIENT_IMPLEMENT = -10001;
    public static final int ERROR_BUSCLIENT_RUNTIME = -10002;
    public static final int ERROR_INIT_ILLEGAL_PARAMETER = -100;
    public static final int ERROR_UNKNOWN = -10000;
    public static final int ERROR_VAD_NODE_NOT_CONNECT = -20001;
    public static final int ERROR_VAD_UNKNOWN = -20000;

    @NotNull
    public static final ErrorCode INSTANCE = new ErrorCode();
    public static final int SUCCESS = 0;

    private ErrorCode() {
    }
}

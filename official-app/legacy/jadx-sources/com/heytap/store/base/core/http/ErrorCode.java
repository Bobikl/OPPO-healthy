package com.heytap.store.base.core.http;

import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/heytap/store/base/core/http/ErrorCode;", "", "()V", "NETWORK_ERROR", "", "PARSE_ERROR", "SERVER_ERROR", LanConstants.OPERATOR_UNKNOWN, "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ErrorCode {

    @NotNull
    public static final ErrorCode INSTANCE = new ErrorCode();

    @JvmField
    public static int PARSE_ERROR = 201;

    @JvmField
    public static int NETWORK_ERROR = 202;

    @JvmField
    public static int SERVER_ERROR = 203;

    @JvmField
    public static int UNKNOWN = 204;

    private ErrorCode() {
    }
}

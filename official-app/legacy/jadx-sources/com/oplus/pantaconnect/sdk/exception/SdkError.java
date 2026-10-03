package com.oplus.pantaconnect.sdk.exception;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/oplus/pantaconnect/sdk/exception/SdkError;", "", "code", "", "msg", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "INITIALIZATION_ERROR", "BINDER_INTERFACE_EMPTY_ERROR", "METHOD_INVOKE_NULL_POINT", "METHOD_NOT_FOUND", "CALLBACK_FUNCTION_NOT_FOUND", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum SdkError {
    INITIALIZATION_ERROR(101, "initialization error!"),
    BINDER_INTERFACE_EMPTY_ERROR(102, "ipc binder interface is null!"),
    METHOD_INVOKE_NULL_POINT(103, "method invoke target object is null!"),
    METHOD_NOT_FOUND(104, "method not found!"),
    CALLBACK_FUNCTION_NOT_FOUND(201, "callback function not found!");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int code;

    @NotNull
    private final String msg;

    SdkError(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    @NotNull
    public static EnumEntries<SdkError> getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }
}

package com.oplus.pantaconnect.sdk.exception;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantaconnect/sdk/exception/MethodNotFoundException;", "Lcom/oplus/pantaconnect/sdk/exception/InnerException;", "code", "", "msg", "", "(ILjava/lang/String;)V", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MethodNotFoundException extends InnerException {
    /* JADX WARN: Multi-variable type inference failed */
    public MethodNotFoundException() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MethodNotFoundException(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? SdkError.METHOD_NOT_FOUND.getCode() : i, (i2 & 2) != 0 ? SdkError.METHOD_NOT_FOUND.getMsg() : str);
    }

    public MethodNotFoundException(int i, @NotNull String str) {
        super(i, str);
    }
}

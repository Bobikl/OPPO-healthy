package com.heytap.health.connect.rawapi.call;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/heytap/health/connect/rawapi/call/CallException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/heytap/health/connect/rawapi/call/b;", "errorCode", "Lcom/heytap/health/connect/rawapi/call/b;", "getErrorCode", "()Lcom/heytap/health/connect/rawapi/call/b;", "", "message", "<init>", "(Lcom/heytap/health/connect/rawapi/call/b;Ljava/lang/String;)V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final class CallException extends Exception {

    @NotNull
    private final b errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallException(@NotNull b errorCode, @Nullable String str) {
        super(errorCode + " ## " + str);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.errorCode = errorCode;
    }

    @NotNull
    public final b getErrorCode() {
        return this.errorCode;
    }
}

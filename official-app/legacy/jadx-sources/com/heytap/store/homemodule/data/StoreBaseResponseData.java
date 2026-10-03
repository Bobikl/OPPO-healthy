package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/homemodule/data/StoreBaseResponseData;", "", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "errorType", "getErrorType", "setErrorType", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class StoreBaseResponseData {
    private int code;

    @NotNull
    private String errorMessage = "";

    @NotNull
    private String errorType = "";

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getErrorMessage() {
        String str = this.errorMessage;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getErrorType() {
        String str = this.errorType;
        return str == null ? "" : str;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorMessage = str;
    }

    public final void setErrorType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorType = str;
    }
}

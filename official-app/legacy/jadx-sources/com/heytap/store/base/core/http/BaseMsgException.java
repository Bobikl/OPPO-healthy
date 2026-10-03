package com.heytap.store.base.core.http;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/base/core/http/BaseMsgException;", "", "code", "", "msg", "", "(ILjava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BaseMsgException extends Throwable {
    private int code;

    @Nullable
    private String msg;

    public BaseMsgException(int i, @Nullable String str) {
        super(str);
        this.code = i;
        this.msg = str;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "BaseMsgException{code='" + this.code + "', msg='" + ((Object) this.msg) + "'}";
    }
}

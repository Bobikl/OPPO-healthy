package com.heytap.store.base.core.http;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/heytap/store/base/core/http/BaseMessageException;", "Ljava/io/IOException;", "detailMessage", "", "(Ljava/lang/String;)V", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "setCode", "(I)V", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BaseMessageException extends IOException {
    private int code;

    public BaseMessageException(@Nullable String str) {
        super(str);
    }

    public final int getCode() {
        return this.code;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "BaseMessageException{code=" + this.code + ", detailMessage='" + ((Object) getMessage()) + "'}";
    }

    public BaseMessageException(@Nullable String str, int i) {
        super(str);
        this.code = i;
    }
}

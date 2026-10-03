package com.heytap.connect.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/heytap/connect/api/ConnectResult;", "", "", "reset", "()V", "", "result", "()I", "success", "()Lcom/heytap/connect/api/ConnectResult;", "", "msg", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "", "socketSucc", "Z", "getSocketSucc", "()Z", "setSocketSucc", "(Z)V", "tlsSucc", "getTlsSucc", "setTlsSucc", "<init>", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class ConnectResult {

    @Nullable
    private String msg;
    private boolean socketSucc;
    private boolean tlsSucc;

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public final boolean getSocketSucc() {
        return this.socketSucc;
    }

    public final boolean getTlsSucc() {
        return this.tlsSucc;
    }

    public final void reset() {
        this.socketSucc = false;
        this.tlsSucc = false;
        this.msg = null;
    }

    public final int result() {
        boolean z = this.socketSucc;
        if (z && this.tlsSucc) {
            return 2;
        }
        return z ? 1 : 0;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    public final void setSocketSucc(boolean z) {
        this.socketSucc = z;
    }

    public final void setTlsSucc(boolean z) {
        this.tlsSucc = z;
    }

    @NotNull
    public final ConnectResult success() {
        setSocketSucc(true);
        setTlsSucc(true);
        return this;
    }
}

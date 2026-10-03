package com.heytap;

import java.io.IOException;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated(message = "move to okhttp3_extension module", replaceWith = @ReplaceWith(expression = "com.heytap.okhttp.extension.util.ExIOException", imports = {}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/heytap/ExIOException;", "Ljava/io/IOException;", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "<set-?>", "", "connectSocketTime", "getConnectSocketTime", "()J", "connectTlsTime", "getConnectTlsTime", "lastConnectIp", "getLastConnectIp", "()Ljava/lang/String;", "setLastConnectIp", "setConnectTime", "", "socketTime", "tlsTime", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class ExIOException extends IOException {
    private long connectSocketTime;
    private long connectTlsTime;

    @Nullable
    private String lastConnectIp;

    public ExIOException() {
    }

    public final long getConnectSocketTime() {
        return this.connectSocketTime;
    }

    public final long getConnectTlsTime() {
        return this.connectTlsTime;
    }

    @Nullable
    public final String getLastConnectIp() {
        return this.lastConnectIp;
    }

    @Nullable
    public final String message() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s last connected Ip:%s", Arrays.copyOf(new Object[]{super.getMessage(), this.lastConnectIp}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public final void setConnectTime(long socketTime, long tlsTime) {
        this.connectSocketTime = socketTime;
        this.connectTlsTime = tlsTime;
    }

    public final void setLastConnectIp(@Nullable String str) {
        this.lastConnectIp = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExIOException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExIOException(@NotNull String message, @NotNull Throwable cause) {
        super(message, cause);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExIOException(@NotNull Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}

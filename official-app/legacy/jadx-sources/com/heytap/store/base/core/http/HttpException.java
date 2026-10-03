package com.heytap.store.base.core.http;

import com.heytap.store.base.core.connectivity.ConnectivityManagerProxy;
import com.heytap.store.platform.tools.ContextGetterUtils;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/base/core/http/HttpException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "throwable", "", "errorCode", "", "(Ljava/lang/Throwable;I)V", "apiCode", "getApiCode", "()I", "setApiCode", "(I)V", "getErrorCode", "httpCode", "getHttpCode", "setHttpCode", "msg", "", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "Companion", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HttpException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int apiCode;
    private final int errorCode;
    private int httpCode;

    @Nullable
    private String msg;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/base/core/http/HttpException$Companion;", "", "()V", "parseThrowable", "Lcom/heytap/store/base/core/http/HttpException;", MapSchema.FIELD_NAME_ENTRY, "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HttpException parseThrowable(@Nullable Throwable e2) {
            return !ConnectivityManagerProxy.isAvailable(ContextGetterUtils.INSTANCE.getApp()) ? new HttpException(e2, ErrorCode.NETWORK_ERROR) : new HttpException(e2, ErrorCode.UNKNOWN);
        }
    }

    public HttpException(@Nullable Throwable th, int i) {
        super(th);
        this.errorCode = i;
    }

    public final int getApiCode() {
        return this.apiCode;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public final void setApiCode(int i) {
        this.apiCode = i;
    }

    public final void setHttpCode(int i) {
        this.httpCode = i;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }
}

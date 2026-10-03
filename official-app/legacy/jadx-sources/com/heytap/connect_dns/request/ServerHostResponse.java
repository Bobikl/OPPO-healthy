package com.heytap.connect_dns.request;

import com.heytap.connect.api.request.IResponse;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0006\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0019"}, d2 = {"Lcom/heytap/connect_dns/request/ServerHostResponse;", "", "", "toString", "()Ljava/lang/String;", "", "success", "Z", "getSuccess", "()Z", "Lcom/heytap/connect/api/request/IResponse;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "Lcom/heytap/connect/api/request/IResponse;", "getResponse", "()Lcom/heytap/connect/api/request/IResponse;", "setResponse", "(Lcom/heytap/connect/api/request/IResponse;)V", "bodyText", "Ljava/lang/String;", "getBodyText", "msg", "getMsg", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class ServerHostResponse {

    @NotNull
    public static final String HTTPDNS_SIGNATURE = "httpdns-signature";

    @Nullable
    private final String bodyText;

    @Nullable
    private final String msg;

    @Nullable
    private IResponse response;
    private final boolean success;

    public ServerHostResponse(boolean z, @Nullable String str, @Nullable String str2) {
        this.success = z;
        this.bodyText = str;
        this.msg = str2;
    }

    @Nullable
    public final String getBodyText() {
        return this.bodyText;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final IResponse getResponse() {
        return this.response;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setResponse(@Nullable IResponse iResponse) {
        this.response = iResponse;
    }

    @NotNull
    public String toString() {
        String str = String.format(Locale.US, "success:" + this.success + ", msg:" + ((Object) this.msg) + ". body:\n" + ((Object) this.bodyText), Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }
}

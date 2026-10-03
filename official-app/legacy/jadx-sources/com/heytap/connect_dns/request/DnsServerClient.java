package com.heytap.connect_dns.request;

import com.heytap.connect.Env;
import com.heytap.connect.api.request.IHttpClient;
import com.heytap.connect.api.request.IRequest;
import com.heytap.connect.api.request.IResponse;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.r7b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB-\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/heytap/connect_dns/request/DnsServerClient;", "", "Lcom/heytap/connect/api/request/IRequest;", "Lcom/heytap/connect/api/request/IResponse;", "sendRequest", "(Lcom/heytap/connect/api/request/IRequest;)Lcom/heytap/connect/api/request/IResponse;", "Lcom/heytap/connect/Env;", HttpConst.SERVER_ENV, "Lcom/heytap/connect/Env;", "getEnv", "()Lcom/heytap/connect/Env;", "Lcom/heytap/connect/api/request/IHttpClient;", "httpClient", "Lcom/heytap/connect/api/request/IHttpClient;", "getHttpClient", "()Lcom/heytap/connect/api/request/IHttpClient;", "Lcom/oplus/aiunit/vision/r7b;", "logger", "Lcom/oplus/aiunit/vision/r7b;", "getLogger", "()Lcom/oplus/aiunit/vision/r7b;", "Lcom/heytap/connect_dns/request/DnsServerHostGet;", "hostContainer", "Lcom/heytap/connect_dns/request/DnsServerHostGet;", "<init>", "(Lcom/heytap/connect/Env;Lcom/heytap/connect/api/request/IHttpClient;Lcom/oplus/aiunit/vision/r7b;Lcom/heytap/connect_dns/request/DnsServerHostGet;)V", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class DnsServerClient {

    @NotNull
    public static final String TAG = "DnsServerHost.Client";
    public static final int TIMT_OUT_MILL = 2000;

    @NotNull
    private final Env env;

    @NotNull
    private final DnsServerHostGet hostContainer;

    @Nullable
    private final IHttpClient httpClient;

    @Nullable
    private final r7b logger;

    public DnsServerClient(@NotNull Env env, @Nullable IHttpClient iHttpClient, @Nullable r7b r7bVar, @NotNull DnsServerHostGet hostContainer) {
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(hostContainer, "hostContainer");
        this.env = env;
        this.httpClient = iHttpClient;
        this.logger = r7bVar;
        this.hostContainer = hostContainer;
    }

    @NotNull
    public final Env getEnv() {
        return this.env;
    }

    @Nullable
    public final IHttpClient getHttpClient() {
        return this.httpClient;
    }

    @Nullable
    public final r7b getLogger() {
        return this.logger;
    }

    @Nullable
    public final IResponse sendRequest(@NotNull IRequest iRequest) {
        Intrinsics.checkNotNullParameter(iRequest, "<this>");
        IHttpClient iHttpClient = this.httpClient;
        if (iHttpClient == null) {
            return null;
        }
        return iHttpClient.sendRequest(iRequest);
    }

    public /* synthetic */ DnsServerClient(Env env, IHttpClient iHttpClient, r7b r7bVar, DnsServerHostGet dnsServerHostGet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(env, iHttpClient, r7bVar, (i & 8) != 0 ? DnsServerHostGet.INSTANCE.extDnsServerHost(env) : dnsServerHostGet);
    }
}

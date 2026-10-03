package com.heytap.connect_dns;

import com.heytap.connect.api.request.IHttpClient;
import com.heytap.connect.api.request.IRequest;
import com.heytap.connect.api.request.IResponse;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.aiunit.vision.ck9;
import com.oplus.aiunit.vision.gk9;
import com.oplus.aiunit.vision.xq9;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/heytap/connect_dns/DefaultRequestHandler;", "Lcom/oplus/aiunit/vision/xq9;", "Lcom/oplus/aiunit/vision/ck9;", "request", "Lcom/heytap/connect/api/request/IRequest;", "newRequest", "(Lcom/oplus/aiunit/vision/ck9;)Lcom/heytap/connect/api/request/IRequest;", "Lcom/heytap/connect/api/request/IResponse;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "Lcom/oplus/aiunit/vision/gk9;", "newResponse", "(Lcom/heytap/connect/api/request/IResponse;)Lcom/oplus/aiunit/vision/gk9;", "doRequest", "(Lcom/oplus/aiunit/vision/ck9;)Lcom/oplus/aiunit/vision/gk9;", "Lcom/heytap/connect/api/request/IHttpClient;", "iHttpClient", "Lcom/heytap/connect/api/request/IHttpClient;", "<init>", "(Lcom/heytap/connect/api/request/IHttpClient;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultRequestHandler implements xq9 {

    @NotNull
    private final IHttpClient iHttpClient;

    public DefaultRequestHandler(@NotNull IHttpClient iHttpClient) {
        Intrinsics.checkNotNullParameter(iHttpClient, "iHttpClient");
        this.iHttpClient = iHttpClient;
    }

    private final IRequest newRequest(ck9 request) {
        IRequest.Builder builderUrl = new IRequest.Builder().url(request.d());
        for (Map.Entry<String, String> entry : request.b().entrySet()) {
            builderUrl.addHeader(entry.getKey(), entry.getValue());
        }
        return builderUrl.addParams(request.c()).build();
    }

    private final gk9 newResponse(final IResponse response) {
        return new gk9(response.getCode(), response.getMessage(), response.getHeader(), new Function0<byte[]>() { // from class: com.heytap.connect_dns.DefaultRequestHandler.newResponse.1
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final byte[] invoke() {
                return response.body();
            }
        }, new Function0<Long>() { // from class: com.heytap.connect_dns.DefaultRequestHandler.newResponse.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final Long invoke() {
                return response.contentLength();
            }
        }, new LinkedHashMap());
    }

    @Override // com.oplus.aiunit.vision.xq9
    @NotNull
    public gk9 doRequest(@Nullable ck9 request) {
        IHttpClient iHttpClient = this.iHttpClient;
        Intrinsics.checkNotNull(request);
        return newResponse(iHttpClient.sendRequest(newRequest(request)));
    }
}

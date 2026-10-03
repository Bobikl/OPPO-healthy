package com.platform.usercenter.network.interceptor;

import android.text.TextUtils;
import com.oplus.aiunit.vision.jea;
import com.oplus.aiunit.vision.uk9;
import com.oplus.aiunit.vision.ytf;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.io.IOException;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbsDomainInterceptor implements jea {
    public abstract uk9.a createHttpUrlBuilder(uk9 uk9Var);

    public abstract String getNewHost(Request request);

    @Override // com.oplus.aiunit.vision.jea
    @NotNull
    public ytf intercept(jea.a aVar) throws IOException {
        Request request = aVar.request();
        uk9 url = request.getUrl();
        String newHost = getNewHost(request);
        uk9.a aVarCreateHttpUrlBuilder = createHttpUrlBuilder(url);
        Request requestBuild = request.n().url(TextUtils.isEmpty(newHost) ? aVarCreateHttpUrlBuilder.g(url.getHost()).c() : aVarCreateHttpUrlBuilder.g(newHost).c()).build();
        UCLogUtil.e("Final URL-----", requestBuild.getUrl().getUrl());
        return aVar.c(requestBuild);
    }

    @Deprecated
    public abstract boolean isWhiteDomain(uk9 uk9Var);

    @Deprecated
    public abstract boolean shouldUpdateDomainConfig();
}

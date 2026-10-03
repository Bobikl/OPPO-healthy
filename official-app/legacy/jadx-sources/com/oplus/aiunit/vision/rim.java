package com.oplus.aiunit.vision;

import okhttp3.Request;

/* JADX INFO: loaded from: classes10.dex */
public final class rim implements jea {
    @Override // com.oplus.aiunit.vision.jea
    public final ytf intercept(jea.a aVar) {
        Request request = aVar.request();
        return (request.getBody() == null || request.g(ar9.CONTENT_ENCODING) != null) ? aVar.c(request) : aVar.c(request.n().header(ar9.CONTENT_ENCODING, "gzip").method(request.getMethod(), new xcm(request.getBody())).build());
    }
}

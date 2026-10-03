package com.oppo.osec.signer.http;

import com.oplus.aiunit.vision.h1j;

/* JADX INFO: loaded from: classes9.dex */
public enum HttpMethodName {
    GET,
    POST,
    PUT,
    DELETE,
    HEAD,
    PATCH,
    OPTIONS;

    public static HttpMethodName fromValue(String str) {
        if (h1j.b(str)) {
            return null;
        }
        String strF = h1j.f(str);
        for (HttpMethodName httpMethodName : values()) {
            if (httpMethodName.name().equals(strF)) {
                return httpMethodName;
            }
        }
        throw new IllegalArgumentException("Unsupported HTTP method name " + str);
    }
}

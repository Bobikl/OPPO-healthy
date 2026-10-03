package com.oplus.aiunit.vision;

import com.heytap.epona.Response;

/* JADX INFO: loaded from: classes2.dex */
public class i99 implements la4<Response, com.oplus.epona.Response> {
    @Override // com.oplus.aiunit.vision.la4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.oplus.epona.Response convert(Response response) throws Throwable {
        if (response.isSuccessful()) {
            return com.oplus.epona.Response.newResponse(response.getBundle());
        }
        try {
            response.checkThrowable(Exception.class);
            return com.oplus.epona.Response.errorResponse(response.getMessage());
        } catch (Exception e2) {
            return com.oplus.epona.Response.errorResponse(e2);
        }
    }
}

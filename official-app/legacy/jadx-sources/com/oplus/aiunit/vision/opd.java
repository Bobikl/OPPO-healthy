package com.oplus.aiunit.vision;

import com.oplus.epona.Request;

/* JADX INFO: loaded from: classes2.dex */
public class opd implements la4<Request, com.heytap.epona.Request> {
    @Override // com.oplus.aiunit.vision.la4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.heytap.epona.Request convert(Request request) {
        com.heytap.epona.Request requestA = new com.heytap.epona.Request.b().c(request.getComponentName()).b(request.getActionName()).a();
        requestA.putBundle(request.getBundle());
        return requestA;
    }
}

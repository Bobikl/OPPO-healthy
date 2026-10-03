package com.oplus.aiunit.vision;

import com.heytap.epona.Request;
import com.heytap.epona.Response;

/* JADX INFO: loaded from: classes15.dex */
public interface t76 {
    Response a(Request request);

    default void b(Request request, vr2 vr2Var) {
        vr2Var.onReceive(a(request));
    }
}

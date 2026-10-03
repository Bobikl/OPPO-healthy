package com.oplus.aiunit.vision;

import com.oplus.epona.Call$Callback;
import com.oplus.epona.Request;
import com.oplus.epona.Response;

/* JADX INFO: loaded from: classes2.dex */
public interface s76 {
    Response a(Request request);

    default void b(Request request, Call$Callback call$Callback) {
        call$Callback.onReceive(a(request));
    }

    String getName();
}

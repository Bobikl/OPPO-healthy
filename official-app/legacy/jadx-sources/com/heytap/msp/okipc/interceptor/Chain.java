package com.heytap.msp.okipc.interceptor;

/* JADX INFO: loaded from: classes19.dex */
public interface Chain<REQUEST, RESPONSE, CALL> {
    CALL call();

    RESPONSE proceed(REQUEST request);

    REQUEST request();
}

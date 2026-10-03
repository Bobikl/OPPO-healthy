package com.heytap.msp.okipc.interceptor;

/* JADX INFO: loaded from: classes19.dex */
public interface Interceptor<REQUEST, RESPONSE, CALL> {
    RESPONSE intercept(Chain<REQUEST, RESPONSE, CALL> chain);
}

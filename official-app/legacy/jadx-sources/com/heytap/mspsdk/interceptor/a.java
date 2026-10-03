package com.heytap.mspsdk.interceptor;

/* JADX INFO: loaded from: classes19.dex */
public interface a<REQUEST, RESPONSE> {
    RESPONSE proceed(REQUEST request);

    REQUEST request();
}

package com.heytap.msp.okipc.client;

import com.heytap.msp.okipc.interceptor.Chain;
import com.heytap.msp.okipc.interceptor.Interceptor;

/* JADX INFO: loaded from: classes19.dex */
public interface IPCClientInterceptor extends Interceptor<com.heytap.msp.okipc.d, Void, com.heytap.msp.okipc.c> {
    @Override // com.heytap.msp.okipc.interceptor.Interceptor
    Void intercept(Chain<com.heytap.msp.okipc.d, Void, com.heytap.msp.okipc.c> chain);
}

package com.heytap.mspsdk.proxy;

/* JADX INFO: loaded from: classes19.dex */
public class i implements com.heytap.mspsdk.interceptor.b<e, Object> {
    @Override // com.heytap.mspsdk.interceptor.b
    public Object a(com.heytap.mspsdk.interceptor.a<e, Object> aVar) {
        return aVar.proceed(aVar.request());
    }
}

package com.heytap.msp.okipc.interceptor;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class a<REQUEST, RESPONSE, CALL> implements Chain<REQUEST, RESPONSE, CALL> {
    public final REQUEST a;
    public final CALL b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Interceptor<REQUEST, RESPONSE, CALL>> f7340c;
    public int d;

    public a(List<Interceptor<REQUEST, RESPONSE, CALL>> list, int i, REQUEST request, CALL call) {
        this.f7340c = list;
        this.d = i;
        this.a = request;
        this.b = call;
    }

    @Override // com.heytap.msp.okipc.interceptor.Chain
    public CALL call() {
        return this.b;
    }

    @Override // com.heytap.msp.okipc.interceptor.Chain
    public RESPONSE proceed(REQUEST request) {
        int i = this.d;
        if (i < 0 || i >= this.f7340c.size()) {
            throw new IndexOutOfBoundsException("interceptors out bounds");
        }
        return this.f7340c.get(this.d).intercept(new a(this.f7340c, this.d + 1, request, this.b));
    }

    @Override // com.heytap.msp.okipc.interceptor.Chain
    public REQUEST request() {
        return this.a;
    }
}

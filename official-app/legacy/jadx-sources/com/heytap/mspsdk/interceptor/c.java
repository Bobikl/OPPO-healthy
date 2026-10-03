package com.heytap.mspsdk.interceptor;

import com.heytap.mspsdk.log.MspLog;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class c<REQUEST, RESPONSE> implements a<REQUEST, RESPONSE> {
    public final REQUEST a;
    public List<b<REQUEST, RESPONSE>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7402c;

    public c(List<b<REQUEST, RESPONSE>> list, int i, REQUEST request) {
        this.b = list;
        this.f7402c = i;
        this.a = request;
    }

    @Override // com.heytap.mspsdk.interceptor.a
    public RESPONSE proceed(REQUEST request) {
        int i = this.f7402c;
        if (i < 0 || i >= this.b.size()) {
            throw new IndexOutOfBoundsException("interceptors out bounds");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        b<REQUEST, RESPONSE> bVar = this.b.get(this.f7402c);
        RESPONSE responseA = bVar.a(new c(this.b, this.f7402c + 1, request));
        MspLog.iIgnore("StandardListChain", bVar.getClass().getSimpleName() + ", " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        return responseA;
    }

    @Override // com.heytap.mspsdk.interceptor.a
    public REQUEST request() {
        return this.a;
    }
}

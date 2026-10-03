package com.oplus.aiunit.vision;

import com.oplus.account.netrequest.annotation.AcRequestTimeOut;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public class dk extends r7 {
    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws IOException {
        Request request = aVar.request();
        AcRequestTimeOut acRequestTimeOut = (AcRequestTimeOut) ma.a(request, AcRequestTimeOut.class);
        if (acRequestTimeOut == null) {
            mb.b("AcIntercept.AcTimeout", "ignore intercept!");
            return aVar.c(request);
        }
        int timeOut = acRequestTimeOut.readTimeOut();
        int iConnectTimeOut = acRequestTimeOut.connectTimeOut();
        int iWriteTimeOut = acRequestTimeOut.writeTimeOut();
        mb.b("AcIntercept.AcTimeout", "Set readTimeOut:" + timeOut + ", connectTimeOut:" + iConnectTimeOut + ", writeTimeOut:" + iWriteTimeOut);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return aVar.e(timeOut, timeUnit).b(iConnectTimeOut, timeUnit).f(iWriteTimeOut, timeUnit).c(request);
    }
}

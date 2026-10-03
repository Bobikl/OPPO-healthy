package com.oplus.aiunit.vision;

import com.oplus.account.netrequest.annotation.AcAutoRetry;
import java.io.IOException;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public class p7 extends r7 {
    public final boolean a(Exception exc) {
        return exc instanceof IOException;
    }

    public final ytf b(jea.a aVar, Request request, AcAutoRetry acAutoRetry) throws Exception {
        boolean zA = true;
        Exception exc = null;
        for (int i = 1; zA && i <= acAutoRetry.maxRetryCount(); i++) {
            try {
                mb.b("AcIntercept.autoRetry", "before retry sleep, currRetryCount:" + i);
                Thread.sleep(acAutoRetry.retryInterval());
                mb.b("AcIntercept.autoRetry", "after retry sleep, currRetryCount:" + i);
                return aVar.c(request);
            } catch (InterruptedException e2) {
                mb.b("AcIntercept.autoRetry", "intercept retry interruptedException currRetryCount:" + i + " " + e2.getMessage());
            } catch (Exception e3) {
                exc = e3;
                zA = this.a(exc);
                mb.b("AcIntercept.autoRetry", "intercept retry exception currRetryCount:" + i + ",isNeedRetry：" + zA + " " + exc.getMessage());
                if (!zA) {
                    throw exc;
                }
            }
        }
        if (!(exc instanceof IOException)) {
            return null;
        }
        mb.b("AcIntercept.autoRetry", "retry exceed max still exception:" + exc.getMessage());
        throw ((IOException) exc);
    }

    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws Exception {
        ytf ytfVarC;
        boolean z;
        Request request = aVar.request();
        AcAutoRetry acAutoRetry = (AcAutoRetry) ma.a(request, AcAutoRetry.class);
        if (acAutoRetry == null) {
            mb.b("AcIntercept.autoRetry", "not intercept! autoRetryAnno is null");
            return aVar.c(request);
        }
        if (acAutoRetry.maxRetryCount() <= 0) {
            mb.b("AcIntercept.autoRetry", "not intercept! maxRetryCount is:" + acAutoRetry.maxRetryCount());
            return aVar.c(request);
        }
        try {
            ytfVarC = aVar.c(request);
            try {
                if (ytfVarC.b()) {
                    return ytfVarC;
                }
                z = false;
                if (!z) {
                    return ytfVarC;
                }
                if (ytfVarC != null) {
                    ytfVarC.close();
                }
                return b(aVar, request, acAutoRetry);
            } catch (Exception e2) {
                e = e2;
                boolean zA = a(e);
                if (!zA) {
                    throw e;
                }
                z = zA;
            }
        } catch (Exception e3) {
            e = e3;
            ytfVarC = null;
        }
    }
}

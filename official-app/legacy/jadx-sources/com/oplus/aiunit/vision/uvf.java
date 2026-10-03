package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public class uvf implements jea {
    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws IOException {
        int i;
        Request request = aVar.request();
        ytf ytfVarC = aVar.c(request);
        int i2 = 0;
        while (ytfVarC.getCode() == 204 && i2 < 3) {
            i2++;
            String strP = ytfVarC.p("Retry-After");
            if (strP == null || strP.isEmpty()) {
                i = 2;
            } else {
                try {
                    i = Integer.parseInt(strP);
                } catch (RuntimeException unused) {
                    i = 2;
                }
            }
            if (i > 0) {
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(i));
                } catch (InterruptedException unused2) {
                }
            }
            ytfVarC = aVar.c(request);
        }
        return ytfVarC;
    }
}

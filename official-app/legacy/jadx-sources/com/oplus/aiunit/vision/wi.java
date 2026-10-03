package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.IOException;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public class wi extends r7 {
    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws IOException {
        Request request = aVar.request();
        vi viVar = (vi) ma.a(request, vi.class);
        if (viVar == null) {
            mb.b("AcIntercept.replaceHeader", "encryptAnno is null, return！");
            return aVar.c(request);
        }
        String[] strArrFormHeaderKey = viVar.formHeaderKey();
        String[] replacedHeaderKey = viVar.toReplacedHeaderKey();
        if (strArrFormHeaderKey == null || replacedHeaderKey == null || strArrFormHeaderKey.length == 0 || replacedHeaderKey.length == 0 || strArrFormHeaderKey.length != replacedHeaderKey.length) {
            mb.b("AcIntercept.replaceHeader", "keyArray error return：");
            return aVar.c(request);
        }
        Request.Builder builderN = request.n();
        for (int i = 0; i < strArrFormHeaderKey.length && i < replacedHeaderKey.length; i++) {
            if (TextUtils.isEmpty(request.g(strArrFormHeaderKey[i]))) {
                mb.b("AcIntercept.replaceHeader", "formHeaderKeyArray :" + i + " is null skip this header continue for while");
            } else {
                mb.b("AcIntercept.replaceHeader", "replace Header key:" + replacedHeaderKey[i] + ", from value:" + request.g(strArrFormHeaderKey[i]) + ", remove key:" + replacedHeaderKey[i]);
                builderN.removeHeader(replacedHeaderKey[i]);
                builderN.addHeader(replacedHeaderKey[i], request.g(strArrFormHeaderKey[i]));
                builderN.removeHeader(strArrFormHeaderKey[i]);
            }
        }
        mb.b("AcIntercept.replaceHeader", "replace Header and continue request！");
        return aVar.c(builderN.build());
    }
}

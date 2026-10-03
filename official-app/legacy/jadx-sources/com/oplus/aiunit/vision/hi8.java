package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;

/* JADX INFO: loaded from: classes18.dex */
public class hi8 implements jea {
    public Context a;

    public hi8(Context context) {
        this.a = context;
    }

    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws IOException {
        Request.Builder builderN = aVar.request().n();
        Map<String, String> mapA = ai8.a(this.a);
        for (String str : mapA.keySet()) {
            String str2 = mapA.get(str);
            Objects.requireNonNull(str2);
            builderN.addHeader(str, str2);
        }
        return aVar.c(builderN.build());
    }
}

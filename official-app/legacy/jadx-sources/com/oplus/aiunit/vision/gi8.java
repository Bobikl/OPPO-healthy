package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class gi8 implements jea {
    public Context a;

    public gi8(Context context) {
        this.a = context;
    }

    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws IOException {
        Request.Builder builderN = aVar.request().n();
        Map<String, String> mapA = zh8.a(this.a);
        for (String str : mapA.keySet()) {
            String str2 = mapA.get(str);
            Objects.requireNonNull(str2);
            builderN.addHeader(str, str2);
        }
        try {
            q8k q8kVar = q8k.INSTANCE;
            String strC = q8kVar.c();
            String strB = q8kVar.b(strC);
            if (!TextUtils.isEmpty(strB)) {
                builderN.addHeader(ebe.TRACE_TRACECONTEXT, strB);
            } else if (!TextUtils.isEmpty(strC)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ebe.TRACE_TRACEID, strC);
                builderN.addHeader(ebe.TRACE_TRACECONTEXT, jSONObject.toString());
            }
        } catch (Exception unused) {
        }
        return aVar.c(builderN.build());
    }
}

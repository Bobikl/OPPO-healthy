package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class jj8 implements rfa {
    public Context a;

    public jj8(Context context) {
        this.a = context;
    }

    public axf intercept(rfa.a aVar) throws IOException {
        Request.Builder builderN = aVar.request().n();
        Map<String, String> mapA = cj8.a(this.a);
        for (String str : mapA.keySet()) {
            String str2 = mapA.get(str);
            Objects.requireNonNull(str2);
            builderN.addHeader(str, str2);
        }
        try {
            sck sckVar = sck.INSTANCE;
            String strC = sckVar.c();
            String strB = sckVar.b(strC);
            if (!TextUtils.isEmpty(strB)) {
                builderN.addHeader(dde.TRACE_TRACECONTEXT, strB);
            } else if (!TextUtils.isEmpty(strC)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(dde.TRACE_TRACEID, strC);
                builderN.addHeader(dde.TRACE_TRACECONTEXT, jSONObject.toString());
            }
        } catch (Exception unused) {
        }
        return aVar.c(builderN.build());
    }
}

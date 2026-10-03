package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class kj8 implements rfa {
    public Context a;

    public kj8(Context context) {
        this.a = context;
    }

    public axf intercept(rfa.a aVar) throws IOException {
        Request.Builder builderN = aVar.request().n();
        Map<String, String> mapA = dj8.a(this.a);
        for (String str : mapA.keySet()) {
            String str2 = mapA.get(str);
            Objects.requireNonNull(str2);
            builderN.addHeader(str, str2);
        }
        return aVar.c(builderN.build());
    }
}

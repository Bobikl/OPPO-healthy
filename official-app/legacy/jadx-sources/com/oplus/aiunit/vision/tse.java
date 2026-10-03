package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import androidx.lifecycle.MutableLiveData;
import com.heytap.webpro.preload.InterceptorResponse;
import com.oplus.weatherservicesdk.data.Weather;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tse {
    public static rse b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new rse(InterceptorResponse.FAIL_5000, (String) null);
        }
        String strF = f(str);
        lv9 lv9VarF = pnl.d().f();
        if (lv9VarF == null) {
            return new rse(InterceptorResponse.FAIL_5001, strF);
        }
        try {
            WebResourceResponse webResourceResponseA = lv9VarF.a(strF);
            return webResourceResponseA == null ? new rse(InterceptorResponse.FAIL_5002, strF) : new rse(strF, webResourceResponseA);
        } catch (Exception e2) {
            InterceptorResponse interceptorResponse = InterceptorResponse.FAIL_5003;
            return new rse(interceptorResponse.getCode(), interceptorResponse.getMsg() + Weather.SEPARATOR + e2.getMessage(), "");
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            q7b.i("PreloadWebInterceptor", "isPreloadRequest url is null!");
            return false;
        }
        kv9 kv9VarE = pnl.d().e();
        if (kv9VarE == null) {
            q7b.i("PreloadWebInterceptor", "isPreloadRequest parallelManager is null!");
            return false;
        }
        boolean zA = kv9VarE.a(str);
        q7b.j("PreloadWebInterceptor", "isPreloadRequest isParallel=%s, url=%s", Boolean.valueOf(zA), str);
        return zA;
    }

    public static /* synthetic */ void d(String str, MutableLiveData mutableLiveData, JSONObject jSONObject) {
        q7b.c("PreloadWebInterceptor", "getParallelPageData get cache data success! url: %s, response: %s", str, jSONObject);
        mutableLiveData.postValue(jSONObject);
    }

    public static void e(final MutableLiveData<JSONObject> mutableLiveData, final String str) {
        if (mutableLiveData == null) {
            q7b.o("PreloadWebInterceptor", "getParallelPageData cacheData is null! url=%s", str);
            return;
        }
        kv9 kv9VarE = pnl.d().e();
        if (kv9VarE != null) {
            kv9VarE.b(str, new pt9() { // from class: com.oplus.aiunit.vision.sse
                @Override // com.oplus.aiunit.vision.pt9
                public final void onResult(Object obj) {
                    tse.d(str, mutableLiveData, (JSONObject) obj);
                }
            });
        }
    }

    public static String f(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://" + url.getHost() + url.getPath();
        } catch (MalformedURLException e2) {
            q7b.f("PreloadWebInterceptor", "unifiedUrl failed!", e2);
            return str;
        }
    }
}

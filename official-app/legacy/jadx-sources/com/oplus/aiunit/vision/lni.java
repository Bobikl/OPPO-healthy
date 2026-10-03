package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.oplus.nearx.track.TrackApi;
import com.platform.usercenter.trace.rumtime.AutoTraceNew;
import com.platform.usercenter.trace.rumtime.ITraceInterceptor;
import com.platform.usercenter.trace.rumtime.IUploadFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class lni {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static volatile AutoTraceNew b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile String f13771c = null;

    public static void c(Context context, String str, String str2, boolean z) {
        f13771c = str2;
        if (a.compareAndSet(false, true)) {
            wb0.b(rni.KEY_BUSINESS_ID);
            TrackApi.L((Application) context.getApplicationContext(), new TrackApi.c.a(str).c(z).d(true).a());
            TrackApi.t(rni.KEY_BUSINESS_ID).D(new TrackApi.b.a("1333", "lRYdIqQQ3hsTqXHa5tq6tFYB6o6UaTkf").a());
            b = d(context);
        }
    }

    public static AutoTraceNew d(final Context context) {
        return new AutoTraceNew.Builder(new IUploadFactory() { // from class: com.oplus.aiunit.vision.jni
            @Override // com.platform.usercenter.trace.rumtime.IUploadFactory
            public final void upload(Map map) throws JSONException {
                lni.e(map);
            }
        }).addTraceInterceptor(new ITraceInterceptor() { // from class: com.oplus.aiunit.vision.kni
            @Override // com.platform.usercenter.trace.rumtime.ITraceInterceptor
            public final Map intercept(Map map) {
                return lni.f(context, map);
            }
        }).uploadExecutor(mwj.c.EXECUTOR).create();
    }

    public static /* synthetic */ void e(Map map) throws JSONException {
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("categoryStatId");
        String str2 = (String) map.get(of5.ARG_EVENT_ID);
        if ("20151_WEB_SDK_STAT".equals(str)) {
            g(str2, new HashMap(map));
        }
    }

    public static /* synthetic */ Map f(Context context, Map map) {
        HashMap map2 = new HashMap();
        map2.put("ouid", th5.e());
        map2.put("guid", th5.d());
        map2.put("romVersion", eie.c());
        map2.put("osVersion", eie.h());
        map2.put("androidVersion", eie.i());
        map2.put("osVersionCode", eie.g() + "");
        map2.put("osBuildTime", eie.b() + "");
        map2.put("web_version_name", "1.0.19");
        map2.put("web_version_code", "10019");
        String packageName = context.getPackageName();
        map2.put("hostPackage", packageName);
        map2.put("hostVersion", ai8.a.b(context, packageName));
        map2.put("systemTime", String.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(f13771c)) {
            map2.put("traceId", f13771c);
        }
        return map2;
    }

    public static void g(String str, Map<String, String> map) throws JSONException {
        TrackApi.t(rni.KEY_BUSINESS_ID).M(rni.DEFAULT_CATEGORY, str, map);
    }

    public static void h(Map<String, String> map) {
        if (b != null) {
            b.upload(map);
        }
    }
}

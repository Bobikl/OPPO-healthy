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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class dri {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static volatile AutoTraceNew b = null;
    public static volatile String c = null;

    public static void c(Context context, String str, String str2, boolean z) {
        c = str2;
        if (a.compareAndSet(false, true)) {
            lc0.b(jri.KEY_BUSINESS_ID);
            TrackApi.L((Application) context.getApplicationContext(), new TrackApi.c.a(str).c(z).d(true).a());
            TrackApi.t(jri.KEY_BUSINESS_ID).D(new TrackApi.b.a("1333", "lRYdIqQQ3hsTqXHa5tq6tFYB6o6UaTkf").a());
            b = d(context);
        }
    }

    public static AutoTraceNew d(final Context context) {
        return new AutoTraceNew.Builder(new IUploadFactory() { // from class: com.oplus.aiunit.vision.bri
            public final void upload(Map map) {
                dri.e(map);
            }
        }).addTraceInterceptor(new ITraceInterceptor() { // from class: com.oplus.aiunit.vision.cri
            public final Map intercept(Map map) {
                return dri.f(context, map);
            }
        }).uploadExecutor(o0k.c.EXECUTOR).create();
    }

    public static /* synthetic */ void e(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("categoryStatId");
        String str2 = (String) map.get("event_id");
        if ("20151_WEB_SDK_STAT".equals(str)) {
            g(str2, new HashMap(map));
        }
    }

    public static /* synthetic */ Map f(Context context, Map map) {
        HashMap map2 = new HashMap();
        map2.put(rde.PAY_SDK_OUID, pi5.e());
        map2.put(rde.PAY_SDK_GUID, pi5.d());
        map2.put("romVersion", mke.c());
        map2.put("osVersion", mke.h());
        map2.put("androidVersion", mke.i());
        map2.put("osVersionCode", mke.g() + "");
        map2.put("osBuildTime", mke.b() + "");
        map2.put("web_version_name", "1.0.19");
        map2.put("web_version_code", "10019");
        String packageName = context.getPackageName();
        map2.put("hostPackage", packageName);
        map2.put("hostVersion", dj8.a.b(context, packageName));
        map2.put("systemTime", String.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(c)) {
            map2.put("traceId", c);
        }
        return map2;
    }

    public static void g(String str, Map<String, String> map) {
        TrackApi.t(jri.KEY_BUSINESS_ID).M(jri.DEFAULT_CATEGORY, str, map);
    }

    public static void h(Map<String, String> map) {
        if (b != null) {
            b.upload(map);
        }
    }
}

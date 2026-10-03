package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.instant.router.Instant;
import com.oplus.instant.router.callback.Callback;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class mrm {
    public static Handler a;
    public static Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static com.oplus.instant.router.callback.a f14192c = new com.oplus.instant.router.callback.a();

    public static class a implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f14193j;
        public final /* synthetic */ Map k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Map f14194l;
        public final /* synthetic */ Map m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Map f14195n;

        public a(Context context, String str, Map map, Map map2, Map map3, Map map4) {
            this.i = context;
            this.f14193j = str;
            this.k = map;
            this.f14194l = map2;
            this.m = map3;
            this.f14195n = map4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zym.h(this.i) < 1100) {
                mrm.x(mrm.f14192c, new Exception("platform not found"));
            } else {
                mrm.y(this.f14193j, this.i, this.k, this.f14194l, this.m, this.f14195n);
            }
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f14196j;
        public final /* synthetic */ Map k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Map f14197l;
        public final /* synthetic */ Map m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Map f14198n;

        public b(String str, Context context, Map map, Map map2, Map map3, Map map4) {
            this.i = str;
            this.f14196j = context;
            this.k = map;
            this.f14197l = map2;
            this.m = map3;
            this.f14198n = map4;
        }

        @Override // java.lang.Runnable
        public void run() {
            mrm.A(this.i, this.f14196j, this.k, this.f14197l, this.m, this.f14198n);
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Intent f14199j;
        public final /* synthetic */ Callback k;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                mrm.t(c.this.k);
            }
        }

        public c(Context context, Intent intent, Callback callback) {
            this.i = context;
            this.f14199j = intent;
            this.k = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!(this.i instanceof Activity)) {
                    this.f14199j.addFlags(268435456);
                }
                this.i.startActivity(this.f14199j);
                mrm.a.post(new a());
            } catch (Exception e2) {
                mrm.x(this.k, e2);
            }
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ Callback i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Throwable f14200j;

        public d(Callback callback, Throwable th) {
            this.i = callback;
            this.f14200j = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            mrm.z(this.i, this.f14200j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    public static void A(String str, Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4) {
        String queryParameter;
        if (str != null) {
            try {
                if (str.contains("pkg")) {
                    try {
                        queryParameter = Uri.parse(str).getQueryParameter("pkg");
                    } catch (Exception unused) {
                        queryParameter = "";
                    }
                } else {
                    queryParameter = "";
                }
            } catch (Throwable th) {
                x(f14192c, th);
                return;
            }
        } else {
            queryParameter = "";
        }
        h(context, queryParameter);
        n(map, queryParameter);
        Map<String, Object> mapR = r(map);
        String str2 = (String) mapR.get(CloudDownloadWorker.KEY_SECRET);
        String str3 = (String) mapR.get("origin");
        Uri uriP = p(str, phm.a(context, str2, e(mapR)));
        ContentValues contentValuesA = a(context, str, map, map2, map3, map4, str2, str3);
        context.getContentResolver().registerContentObserver(uriP, false, new jbm(context, mapR, f14192c, uriP));
        context.getContentResolver().insert(uriP, contentValuesA);
    }

    public static ContentValues a(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        f(contentValues, "sgtp", map.get("sgtp"));
        f(contentValues, "req_url", phm.a(context, str2, str));
        f(contentValues, "from", "ins_sdk");
        f(contentValues, "origin", str3);
        g(contentValues, "EXTRA_DEEPLINK_PARAMS", map2);
        g(contentValues, "EXTRA_STAT_PARAMS", map3);
        g(contentValues, "EXTRA_EXTEND_PARAMS", map4);
        return contentValues;
    }

    public static Cursor b(Context context, Uri uri) {
        try {
            return context.getContentResolver().query(uri, null, null, null, null);
        } catch (Throwable th) {
            epm.d("RequestUtil", th);
            return null;
        }
    }

    public static Uri c(String str, String str2) {
        StringBuilder sb;
        String str3;
        Uri uri = Uri.parse(str);
        if (m82.b()) {
            sb = new StringBuilder();
            str3 = "content://tv.";
        } else {
            sb = new StringBuilder();
            str3 = NotificationApiService.CONTENT;
        }
        sb.append(str3);
        sb.append(uri.getScheme());
        sb.append("_");
        sb.append(uri.getHost());
        sb.append("/");
        sb.append(str2);
        return Uri.parse(sb.toString());
    }

    public static String e(Map<String, ?> map) {
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(map.get(str));
        }
        return sb.toString();
    }

    public static void f(ContentValues contentValues, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        contentValues.put(str, str2);
    }

    public static void g(ContentValues contentValues, String str, Map<String, ?> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        contentValues.put(str, e(map));
    }

    public static void h(Context context, String str) throws com.oplus.instant.router.c.a {
        if (!zym.n(context)) {
            throw new com.oplus.instant.router.c.a(104, str);
        }
    }

    public static void i(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, Callback callback) {
        w();
        f14192c.a(callback);
        a.post(new b(str, context, map2, map, map3, map4));
    }

    public static void l(Exception exc, Context context, String str, Callback callback) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            x(callback, exc);
            return;
        }
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        b.post(new c(context, intent, callback));
    }

    public static void n(Map<String, String> map, String str) throws com.oplus.instant.router.c.a {
        if (!map.containsKey("origin")) {
            throw new com.oplus.instant.router.c.a(102, str);
        }
        if (!map.containsKey(CloudDownloadWorker.KEY_SECRET)) {
            throw new com.oplus.instant.router.c.a(103, str);
        }
    }

    public static boolean o(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null) {
            return false;
        }
        if (!Instant.SCHEME_OAPS.equals(uri.getScheme()) && !"hap".equals(uri.getScheme())) {
            return false;
        }
        if (!Instant.SCHEME_OAPS.equals(uri.getScheme()) || Instant.HOST_INSTANT.equals(uri.getHost())) {
            return !TextUtils.isEmpty(uri.getPath());
        }
        return false;
    }

    public static Uri p(String str, String str2) {
        StringBuilder sb;
        String str3;
        Uri uri = Uri.parse(str);
        if (m82.b()) {
            sb = new StringBuilder();
            str3 = "content://tv.preload_";
        } else {
            sb = new StringBuilder();
            str3 = "content://preload_";
        }
        sb.append(str3);
        sb.append(uri.getScheme());
        sb.append("_");
        sb.append(uri.getHost());
        sb.append("/");
        sb.append(str2);
        return Uri.parse(sb.toString());
    }

    public static Map<String, Object> r(Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.put("ts", String.valueOf(System.currentTimeMillis()));
        map2.put("version", zym.f());
        return map2;
    }

    public static synchronized void s(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, Callback callback) {
        w();
        Context applicationContext = context.getApplicationContext();
        if (mkm.b(applicationContext, str, map4)) {
            callback = mkm.a(context, str, callback);
        }
        if (str.startsWith("hap://app/") && map4 != null && "1".equals(map4.get("in_one_task"))) {
            callback = new com.oplus.instant.router.callback.c(context, str, callback);
        }
        f14192c.a(callback);
        a.post(new a(applicationContext, str, map2, map, map3, map4));
    }

    public static void t(Callback callback) {
        Callback.Response response = new Callback.Response();
        response.setCode(1);
        response.setMsg("success");
        callback.onResponse(response);
    }

    public static synchronized void w() {
        Handler handler = a;
        if (handler == null || handler.getLooper() == null) {
            HandlerThread handlerThread = new HandlerThread("instant-req");
            handlerThread.start();
            if (handlerThread.getLooper() != null) {
                a = new Handler(handlerThread.getLooper());
            } else {
                a = new Handler();
            }
        }
    }

    public static void x(Callback callback, Throwable th) {
        if (cym.a()) {
            a.post(new d(callback, th));
        } else {
            z(callback, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (r13.startsWith("hap://") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r13.startsWith("hap://") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        l(r0, r14, r13, com.oplus.aiunit.vision.mrm.f14192c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void y(String str, Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4) {
        String queryParameter;
        if (str != null) {
            try {
                try {
                    if (str.contains("pkg")) {
                        try {
                            queryParameter = Uri.parse(str).getQueryParameter("pkg");
                        } catch (Exception unused) {
                            queryParameter = "";
                        }
                    } else {
                        queryParameter = "";
                    }
                } catch (Throwable th) {
                    th = th;
                    x(f14192c, th);
                    return;
                }
            } catch (IllegalArgumentException e2) {
                th = e2;
                if (th.getMessage().contains("Unknown URL content")) {
                }
                x(f14192c, th);
                return;
            } catch (SecurityException e3) {
                th = e3;
                if (th.getMessage().contains("Failed to find provider hap_app")) {
                }
                x(f14192c, th);
                return;
            }
        } else {
            queryParameter = "";
        }
        h(context, queryParameter);
        n(map, queryParameter);
        Map<String, Object> mapR = r(map);
        String str2 = (String) mapR.get(CloudDownloadWorker.KEY_SECRET);
        String str3 = (String) mapR.get("origin");
        Uri uriC = c(str, phm.a(context, str2, e(mapR)));
        ContentValues contentValuesA = a(context, str, map, map2, map3, map4, str2, str3);
        context.getContentResolver().registerContentObserver(uriC, false, new jbm(context, mapR, f14192c, uriC));
        context.getContentResolver().insert(uriC, contentValuesA);
    }

    public static void z(Callback callback, Throwable th) {
        Callback.Response response = new Callback.Response();
        response.setCode(-8);
        response.setMsg(th.getMessage());
        callback.onResponse(response);
    }
}

package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ComponentName;
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
import com.heytap.store.base.core.http.HttpUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class z0n {
    public static Handler a;
    public static Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ecm f19219c = new ecm();

    public static class a implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f19220j;
        public final /* synthetic */ Map k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Map f19221l;
        public final /* synthetic */ Map m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Map f19222n;

        public a(Context context, String str, Map map, Map map2, Map map3, Map map4) {
            this.i = context;
            this.f19220j = str;
            this.k = map;
            this.f19221l = map2;
            this.m = map3;
            this.f19222n = map4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (w5n.d(this.i)) {
                z0n.y(this.f19220j, this.i, this.k, this.f19221l, this.m, this.f19222n);
            }
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f19223j;
        public final /* synthetic */ Map k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Map f19224l;
        public final /* synthetic */ Map m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Map f19225n;

        public b(String str, Context context, Map map, Map map2, Map map3, Map map4) {
            this.i = str;
            this.f19223j = context;
            this.k = map;
            this.f19224l = map2;
            this.m = map3;
            this.f19225n = map4;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0n.A(this.i, this.f19223j, this.k, this.f19224l, this.m, this.f19225n);
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Intent f19226j;
        public final /* synthetic */ ws2 k;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                z0n.u(c.this.k);
            }
        }

        public c(Context context, Intent intent, ws2 ws2Var) {
            this.i = context;
            this.f19226j = intent;
            this.k = ws2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.i.startActivity(this.f19226j);
                z0n.a.post(new a());
            } catch (Exception e2) {
                z0n.x(this.k, e2);
            }
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ ws2 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Throwable f19227j;

        public d(ws2 ws2Var, Throwable th) {
            this.i = ws2Var;
            this.f19227j = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0n.z(this.i, this.f19227j);
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
                x(f19219c, th);
                return;
            }
        } else {
            queryParameter = "";
        }
        h(context, queryParameter);
        o(map, queryParameter);
        Map<String, Object> mapR = r(map);
        String str2 = (String) mapR.get(CloudDownloadWorker.KEY_SECRET);
        String str3 = (String) mapR.get("origin");
        Uri uriQ = q(str, qum.a(context, str2, e(mapR)));
        ContentValues contentValuesA = a(context, str, map, map2, map3, map4, str2, str3);
        context.getContentResolver().registerContentObserver(uriQ, false, new yqf(context, mapR, f19219c, uriQ));
        context.getContentResolver().insert(uriQ, contentValuesA);
    }

    public static ContentValues a(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        f(contentValues, "sgtp", map.get("sgtp"));
        f(contentValues, "req_url", qum.a(context, str2, str));
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
            th.printStackTrace();
            return null;
        }
    }

    public static Uri c(String str, String str2) {
        Uri uri = Uri.parse(str);
        return Uri.parse("content://xgame_" + uri.getScheme() + "_" + uri.getHost() + "/" + str2);
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

    public static void h(Context context, String str) throws com.oplus.quickgame.sdk.engine.a.a {
        if (!w5n.d(context)) {
            throw new com.oplus.quickgame.sdk.engine.a.a(104, str);
        }
    }

    public static void i(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, ws2 ws2Var) {
        s();
        f19219c.c(ws2Var);
        a.post(new b(str, context, map2, map, map3, map4));
    }

    public static void l(Exception exc, Context context, String str, ws2 ws2Var) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setComponent(new ComponentName(bmm.a("Y29tLmhleXRhcC54Z2FtZQ=="), bmm.a("Y29tLmhleXRhcC54Z2FtZS5kaXNwYXRjaC5hY3Rpdml0eS5IYXBEaXNwYXRjaGVyQWN0aXZpdHk=")));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            x(ws2Var, exc);
            return;
        }
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        b.post(new c(context, intent, ws2Var));
    }

    public static void n(Map<String, String> map, int i, x7f.a aVar) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            if (i == 0) {
                aVar.b(str, map.get(str));
            } else if (i == 1) {
                aVar.d(str, map.get(str));
            } else if (i == 2) {
                aVar.c(str, map.get(str));
            } else if (i == 3) {
                aVar.e(str, map.get(str));
            }
        }
    }

    public static void o(Map<String, String> map, String str) throws com.oplus.quickgame.sdk.engine.a.a {
        if (!map.containsKey("origin")) {
            throw new com.oplus.quickgame.sdk.engine.a.a(102, str);
        }
        if (!map.containsKey(CloudDownloadWorker.KEY_SECRET)) {
            throw new com.oplus.quickgame.sdk.engine.a.a(103, str);
        }
    }

    public static boolean p(String str) {
        Uri uri;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && "hap".equals(uri.getScheme()) && "game".equals(uri.getHost())) {
            return !TextUtils.isEmpty(uri.getPath());
        }
        return false;
    }

    public static Uri q(String str, String str2) {
        Uri uri = Uri.parse(str);
        return Uri.parse("content://xgame_preload_" + uri.getScheme() + "_" + uri.getHost() + "/" + str2);
    }

    public static Map<String, Object> r(Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.put("ts", String.valueOf(System.currentTimeMillis()));
        map2.put("version", Integer.valueOf(w5n.a()));
        return map2;
    }

    public static synchronized void s() {
        if (a == null) {
            HandlerThread handlerThread = new HandlerThread("xgame-req");
            handlerThread.start();
            if (handlerThread.getLooper() != null) {
                a = new Handler(handlerThread.getLooper());
            } else {
                a = new Handler();
            }
        }
    }

    public static synchronized void t(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, ws2 ws2Var) {
        String str2;
        String str3;
        s();
        map4.put("tsf_key", sxm.b());
        xzm.a("QgRouterManager", " reqAsync url = " + str);
        if (sxm.d(context, str, map4)) {
            ws2Var = sxm.a(context, str, ws2Var, map4);
            map4.put("in_one_task", "1");
            str2 = "QgRouterManager";
            str3 = " reqAsync in one task";
        } else {
            if (sxm.c(context, str, map4)) {
                ws2Var = sxm.a(context, str, ws2Var, map4);
                map4.put("in_tsf", "1");
                str2 = "QgRouterManager";
                str3 = " reqAsync in deep link";
            }
            f19219c.c(ws2Var);
            a.post(new a(context, str, map2, map, map3, map4));
        }
        xzm.a(str2, str3);
        f19219c.c(ws2Var);
        a.post(new a(context, str, map2, map, map3, map4));
    }

    public static void u(ws2 ws2Var) {
        ws2.a aVar = new ws2.a();
        aVar.d(1);
        aVar.e("success");
        ws2Var.a(aVar);
    }

    public static void x(ws2 ws2Var, Throwable th) {
        if (l3n.b()) {
            a.post(new d(ws2Var, th));
        } else {
            z(ws2Var, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public static void y(String str, Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4) {
        String queryParameter;
        StringBuilder sb;
        String str2;
        String string;
        if (str != null) {
            try {
                try {
                    if (str.contains("pkg")) {
                        try {
                            queryParameter = Uri.parse(str).getQueryParameter("pkg");
                        } catch (Exception e2) {
                            xzm.b("QgRouterManager", str + " do jump exception 0: " + e2.toString());
                            queryParameter = "";
                        }
                    } else {
                        queryParameter = "";
                    }
                } catch (Throwable th) {
                    x(f19219c, th);
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" do jump exception 5: ");
                    string = th.toString();
                    sb.append(string);
                    xzm.b("QgRouterManager", sb.toString());
                    return;
                }
            } catch (IllegalArgumentException e3) {
                e = e3;
                if (e.getMessage().contains("Unknown URL content") && str.startsWith("hap://")) {
                    l(e, context, str, f19219c);
                    sb = new StringBuilder();
                    sb.append(str);
                    str2 = " do jump exception 1: ";
                } else {
                    x(f19219c, e);
                    sb = new StringBuilder();
                    sb.append(str);
                    str2 = " do jump exception 2: ";
                }
                sb.append(str2);
                string = e.toString();
                sb.append(string);
                xzm.b("QgRouterManager", sb.toString());
                return;
            } catch (SecurityException e4) {
                e = e4;
                if (e.getMessage().contains("Failed to find provider xgame_hap_game") && str.startsWith("hap://")) {
                    l(e, context, str, f19219c);
                    sb = new StringBuilder();
                    sb.append(str);
                    str2 = " do jump exception 3: ";
                } else {
                    x(f19219c, e);
                    sb = new StringBuilder();
                    sb.append(str);
                    str2 = " do jump exception 4: ";
                }
                sb.append(str2);
                string = e.toString();
                sb.append(string);
                xzm.b("QgRouterManager", sb.toString());
                return;
            }
        } else {
            queryParameter = "";
        }
        h(context, queryParameter);
        o(map, queryParameter);
        Map<String, Object> mapR = r(map);
        String str3 = (String) mapR.get(CloudDownloadWorker.KEY_SECRET);
        String str4 = (String) mapR.get("origin");
        Uri uriC = c(str, qum.a(context, str3, e(mapR)));
        ContentValues contentValuesA = a(context, str, map, map2, map3, map4, str3, str4);
        context.getContentResolver().registerContentObserver(uriC, false, new yqf(context, mapR, f19219c, uriC));
        context.getContentResolver().insert(uriC, contentValuesA);
    }

    public static void z(ws2 ws2Var, Throwable th) {
        ws2.a aVar = new ws2.a();
        aVar.d(-8);
        aVar.e(th.getMessage());
        ws2Var.a(aVar);
    }
}

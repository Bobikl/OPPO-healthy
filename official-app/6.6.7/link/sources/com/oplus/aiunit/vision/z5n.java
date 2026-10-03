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
import com.oplus.pantanal.seedling.convertor.WidgetCodeToSeedlingCardConvertor;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class z5n {
    public static Handler a;
    public static Handler b;
    public static ngm c = new ngm();

    public static class a implements Runnable {
        public final /* synthetic */ Context i;
        public final /* synthetic */ String j;
        public final /* synthetic */ Map k;
        public final /* synthetic */ Map l;
        public final /* synthetic */ Map m;
        public final /* synthetic */ Map n;

        public a(Context context, String str, Map map, Map map2, Map map3, Map map4) {
            this.i = context;
            this.j = str;
            this.k = map;
            this.l = map2;
            this.m = map3;
            this.n = map4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (yan.d(this.i)) {
                z5n.y(this.j, this.i, this.k, this.l, this.m, this.n);
            }
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ String i;
        public final /* synthetic */ Context j;
        public final /* synthetic */ Map k;
        public final /* synthetic */ Map l;
        public final /* synthetic */ Map m;
        public final /* synthetic */ Map n;

        public b(String str, Context context, Map map, Map map2, Map map3, Map map4) {
            this.i = str;
            this.j = context;
            this.k = map;
            this.l = map2;
            this.m = map3;
            this.n = map4;
        }

        @Override // java.lang.Runnable
        public void run() {
            z5n.A(this.i, this.j, this.k, this.l, this.m, this.n);
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ Context i;
        public final /* synthetic */ Intent j;
        public final /* synthetic */ kt2 k;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                z5n.u(c.this.k);
            }
        }

        public c(Context context, Intent intent, kt2 kt2Var) {
            this.i = context;
            this.j = intent;
            this.k = kt2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.i.startActivity(this.j);
                z5n.a.post(new a());
            } catch (Exception e) {
                z5n.x(this.k, e);
            }
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ kt2 i;
        public final /* synthetic */ Throwable j;

        public d(kt2 kt2Var, Throwable th) {
            this.i = kt2Var;
            this.j = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            z5n.z(this.i, this.j);
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
                x(c, th);
                return;
            }
        } else {
            queryParameter = "";
        }
        h(context, queryParameter);
        o(map, queryParameter);
        Map<String, Object> mapR = r(map);
        String str2 = (String) mapR.get("secret");
        String str3 = (String) mapR.get("origin");
        Uri uriQ = q(str, jzm.a(context, str2, e(mapR)));
        ContentValues contentValuesA = a(context, str, map, map2, map3, map4, str2, str3);
        context.getContentResolver().registerContentObserver(uriQ, false, new auf(context, mapR, c, uriQ));
        context.getContentResolver().insert(uriQ, contentValuesA);
    }

    public static ContentValues a(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        f(contentValues, "sgtp", map.get("sgtp"));
        f(contentValues, "req_url", jzm.a(context, str2, str));
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
                sb.append(WidgetCodeToSeedlingCardConvertor.CARD_SPLIT);
            }
            sb.append(str);
            sb.append("=");
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
        if (!yan.d(context)) {
            throw new com.oplus.quickgame.sdk.engine.a.a(104, str);
        }
    }

    public static void i(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, kt2 kt2Var) {
        s();
        c.c(kt2Var);
        a.post(new b(str, context, map2, map, map3, map4));
    }

    public static void l(Exception exc, Context context, String str, kt2 kt2Var) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setComponent(new ComponentName(kqm.a("Y29tLmhleXRhcC54Z2FtZQ=="), kqm.a("Y29tLmhleXRhcC54Z2FtZS5kaXNwYXRjaC5hY3Rpdml0eS5IYXBEaXNwYXRjaGVyQWN0aXZpdHk=")));
        if (!(context instanceof Activity)) {
            intent.addFlags(SauAarConstants.L);
        }
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            x(kt2Var, exc);
            return;
        }
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        b.post(new c(context, intent, kt2Var));
    }

    public static void n(Map<String, String> map, int i, jaf.a aVar) {
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
        if (!map.containsKey("secret")) {
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
        map2.put("version", Integer.valueOf(yan.a()));
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

    public static synchronized void t(Context context, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, kt2 kt2Var) {
        String str2;
        String str3;
        s();
        map4.put("tsf_key", l2n.b());
        y4n.a("QgRouterManager", " reqAsync url = " + str);
        if (l2n.d(context, str, map4)) {
            kt2Var = l2n.a(context, str, kt2Var, map4);
            map4.put("in_one_task", erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE);
            str2 = "QgRouterManager";
            str3 = " reqAsync in one task";
        } else {
            if (l2n.c(context, str, map4)) {
                kt2Var = l2n.a(context, str, kt2Var, map4);
                map4.put("in_tsf", erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE);
                str2 = "QgRouterManager";
                str3 = " reqAsync in deep link";
            }
            c.c(kt2Var);
            a.post(new a(context, str, map2, map, map3, map4));
        }
        y4n.a(str2, str3);
        c.c(kt2Var);
        a.post(new a(context, str, map2, map, map3, map4));
    }

    public static void u(kt2 kt2Var) {
        kt2.a aVar = new kt2.a();
        aVar.d(1);
        aVar.e("success");
        kt2Var.a(aVar);
    }

    public static void x(kt2 kt2Var, Throwable th) {
        if (n8n.b()) {
            a.post(new d(kt2Var, th));
        } else {
            z(kt2Var, th);
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
                        } catch (Exception e) {
                            y4n.b("QgRouterManager", str + " do jump exception 0: " + e.toString());
                            queryParameter = "";
                        }
                    } else {
                        queryParameter = "";
                    }
                } catch (Throwable th) {
                    x(c, th);
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" do jump exception 5: ");
                    string = th.toString();
                    sb.append(string);
                    y4n.b("QgRouterManager", sb.toString());
                    return;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                if (e.getMessage().contains("Unknown URL content") && str.startsWith("hap://")) {
                    l(e, context, str, c);
                    sb = new StringBuilder();
                    sb.append(str);
                    str2 = " do jump exception 1: ";
                } else {
                    x(c, e);
                    sb = new StringBuilder();
                    sb.append(str);
                    str2 = " do jump exception 2: ";
                }
                sb.append(str2);
                string = e.toString();
                sb.append(string);
                y4n.b("QgRouterManager", sb.toString());
                return;
            } catch (SecurityException e3) {
                e = e3;
                if (e.getMessage().contains("Failed to find provider xgame_hap_game") && str.startsWith("hap://")) {
                    l(e, context, str, c);
                    sb = new StringBuilder();
                    sb.append(str);
                    str2 = " do jump exception 3: ";
                } else {
                    x(c, e);
                    sb = new StringBuilder();
                    sb.append(str);
                    str2 = " do jump exception 4: ";
                }
                sb.append(str2);
                string = e.toString();
                sb.append(string);
                y4n.b("QgRouterManager", sb.toString());
                return;
            }
        } else {
            queryParameter = "";
        }
        h(context, queryParameter);
        o(map, queryParameter);
        Map<String, Object> mapR = r(map);
        String str3 = (String) mapR.get("secret");
        String str4 = (String) mapR.get("origin");
        Uri uriC = c(str, jzm.a(context, str3, e(mapR)));
        ContentValues contentValuesA = a(context, str, map, map2, map3, map4, str3, str4);
        context.getContentResolver().registerContentObserver(uriC, false, new auf(context, mapR, c, uriC));
        context.getContentResolver().insert(uriC, contentValuesA);
    }

    public static void z(kt2 kt2Var, Throwable th) {
        kt2.a aVar = new kt2.a();
        aVar.d(-8);
        aVar.e(th.getMessage());
        kt2Var.a(aVar);
    }
}

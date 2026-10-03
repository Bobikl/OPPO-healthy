package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.oplus.smartenginehelper.ParserTag;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class i3n {
    public static volatile ConcurrentHashMap<String, c> a = new ConcurrentHashMap<>(8);
    public static volatile List<String> b = Collections.synchronizedList(new ArrayList(8));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile ConcurrentHashMap<String, b> f12374c = new ConcurrentHashMap<>(8);
    public static Random d = new Random();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ConcurrentHashMap<String, String> f12375e = new ConcurrentHashMap<>(8);
    public static List<x3n> f = Collections.synchronizedList(new ArrayList(16));

    public static class a {
        public String a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f12376c;

        public a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static class b {
        public q3n a;
        public long b;

        public b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    public static synchronized String a(String str, String str2) throws com.amap.api.col.p0003sl.ik {
        try {
            try {
                System.currentTimeMillis();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    Context context = com.amap.api.col.p0003sl.e0.f681c;
                    try {
                        if (b == null) {
                            b = Collections.synchronizedList(new ArrayList(8));
                        }
                        if (context != null && !b.contains(str2)) {
                            b.add(str2);
                            String strD = x2n.d(context, "Yb3Blbl9odHRwX2NvbnRyb2w", str2);
                            if (!TextUtils.isEmpty(strD)) {
                                h(str2, new JSONObject(strD));
                            }
                        }
                    } catch (Throwable th) {
                        a2n.e(th, "hlUtil", "llhl");
                    }
                    if (a != null && a.size() > 0) {
                        if (!a.containsKey(str2)) {
                            return str;
                        }
                        c cVar = a.get(str2);
                        if (cVar == null) {
                            return str;
                        }
                        if (m(str, cVar, str2)) {
                            throw new com.amap.api.col.p0003sl.ik("服务QPS超限");
                        }
                        return p(str, cVar, str2);
                    }
                    return str;
                }
                return str;
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (com.amap.api.col.p0003sl.ik e2) {
            throw e2;
        } catch (Throwable th3) {
            a2n.e(th3, "hlUtil", "pcr");
            return str;
        }
    }

    public static void b() {
        try {
            Context context = com.amap.api.col.p0003sl.e0.f681c;
            if (context == null) {
                return;
            }
            y3n.e(q(), context);
        } catch (Throwable unused) {
        }
    }

    public static synchronized void c(v0n v0nVar, JSONObject jSONObject) {
        if (v0nVar == null) {
            return;
        }
        try {
            String strA = v0nVar.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            if (jSONObject == null) {
                e(strA);
            }
            if (!com.amap.api.col.p0003sl.e0.x(jSONObject.optString("able", null), false)) {
                e(strA);
            } else {
                x2n.e(com.amap.api.col.p0003sl.e0.f681c, "Yb3Blbl9odHRwX2NvbnRyb2w", strA, jSONObject.toString());
                h(strA, jSONObject);
            }
        } catch (Throwable th) {
            a2n.e(th, "hlUtil", "par");
        }
    }

    public static void d(c cVar, JSONObject jSONObject) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("block");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            HashMap map = new HashMap(8);
            byte b2 = 0;
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(oea.FEATURE_API_REQUEST);
                    if (!TextUtils.isEmpty(strOptString)) {
                        if (!strOptString.startsWith("/")) {
                            strOptString = "/".concat(strOptString);
                        }
                        if (strOptString.endsWith("/")) {
                            strOptString = strOptString.substring(0, strOptString.length() - 1);
                        }
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("periods");
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject2 != null) {
                                a aVar = new a(b2);
                                aVar.a = jSONObjectOptJSONObject2.optString("begin");
                                aVar.b = jSONObjectOptJSONObject2.optInt("duration");
                                aVar.f12376c = jSONObjectOptJSONObject2.optDouble(ParserTag.TAG_PERCENT);
                                arrayList.add(aVar);
                            }
                        }
                        map.put(strOptString, arrayList);
                    }
                }
            }
            cVar.a = map;
        } catch (Throwable th) {
            a2n.e(th, "hlUtil", "pbr");
        }
    }

    public static synchronized void e(String str) {
        try {
            if (a.containsKey(str)) {
                a.remove(str);
            }
            SharedPreferences.Editor editorC = x2n.c(com.amap.api.col.p0003sl.e0.f681c, "Yb3Blbl9odHRwX2NvbnRyb2w");
            x2n.g(editorC, str);
            x2n.f(editorC);
        } catch (Throwable th) {
            a2n.e(th, "hlUtil", "rc");
        }
    }

    public static void f(String str, c cVar) {
        try {
            if (a == null) {
                a = new ConcurrentHashMap<>(8);
            }
            a.put(str, cVar);
        } catch (Throwable th) {
            a2n.e(th, "hlUtil", "ucr");
        }
    }

    public static void g(String str, String str2, String str3) {
        try {
            Context context = com.amap.api.col.p0003sl.e0.f681c;
            if (context != null && !TextUtils.isEmpty(str)) {
                if (f12375e == null) {
                    f12375e = new ConcurrentHashMap<>(8);
                }
                synchronized (f12375e) {
                    if (f12375e.containsKey(str2)) {
                        return;
                    }
                    f12375e.put(str2, str3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("timestamp", System.currentTimeMillis());
                    jSONObject.put("type", p1n.f15156j);
                    jSONObject.put("name", str);
                    jSONObject.put("version", p1n.a(str));
                    jSONObject.put("hostname", str2 + "#" + str3);
                    String string = jSONObject.toString();
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    x3n x3nVar = new x3n(context, "core", "2.0", "O005");
                    x3nVar.a(string);
                    y3n.d(x3nVar, context);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void h(String str, JSONObject jSONObject) {
        try {
            c cVar = new c((byte) 0);
            d(cVar, jSONObject);
            r(cVar, jSONObject);
            if (cVar.b == null && cVar.a == null) {
                e(str);
            } else {
                f(str, cVar);
            }
        } catch (Throwable unused) {
        }
    }

    public static void i(URL url, q3n q3nVar) {
        List<String> list;
        try {
            if (f12374c == null) {
                f12374c = new ConcurrentHashMap<>(8);
            }
            Map<String, List<String>> map = q3nVar.b;
            if (map != null && map.containsKey("nb") && (list = q3nVar.b.get("nb")) != null && list.size() > 0) {
                byte b2 = 0;
                String[] strArrSplit = list.get(0).split("#");
                if (strArrSplit.length < 2) {
                    return;
                }
                int i = Integer.parseInt(strArrSplit[0]);
                long j2 = Integer.parseInt(strArrSplit[1]);
                b bVar = new b(b2);
                bVar.a = q3nVar;
                if (j2 <= 0) {
                    j2 = 30;
                }
                bVar.b = SystemClock.elapsedRealtime() + (j2 * 1000);
                if (i == 1) {
                    f12374c.put("app", bVar);
                } else {
                    if (i != 2 || url == null) {
                        return;
                    }
                    f12374c.put(url.getPath(), bVar);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void j(boolean z, String str) {
        try {
            Context context = com.amap.api.col.p0003sl.e0.f681c;
            if (context != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                if (z) {
                    jSONObject.put("type", p1n.g);
                } else {
                    jSONObject.put("type", p1n.f);
                }
                jSONObject.put("name", str);
                jSONObject.put("version", p1n.a(str));
                String string = jSONObject.toString();
                x3n x3nVar = new x3n(context, "core", "2.0", "O005");
                x3nVar.a(string);
                y3n.d(x3nVar, context);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(boolean z, String str, String str2, int i) {
        Context context = com.amap.api.col.p0003sl.e0.f681c;
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", System.currentTimeMillis());
            String strA = p1n.a(str);
            if (z) {
                jSONObject.put("type", p1n.i);
            } else {
                jSONObject.put("type", p1n.h);
            }
            jSONObject.put("name", str);
            jSONObject.put("version", strA);
            jSONObject.put(ParserTag.TAG_URI, Uri.parse(str2).getPath());
            jSONObject.put("blockLevel", i);
            String string = jSONObject.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            x3n x3nVar = new x3n(context, "core", "2.0", "O005");
            x3nVar.a(string);
            if (f == null) {
                f = Collections.synchronizedList(new ArrayList(16));
            }
            synchronized (f) {
                try {
                    f.add(x3nVar);
                    if (f.size() >= 15) {
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean l(a aVar) {
        if (aVar == null || aVar.f12376c == 1.0d) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(aVar.a) && aVar.b > 0) {
            long timeInMillis = jCurrentTimeMillis - w0n.h(aVar.a, z0j.DATA_FMT2).getTimeInMillis();
            if (timeInMillis > 0 && timeInMillis < aVar.b * 1000) {
                if (aVar.f12376c == 0.0d) {
                    return true;
                }
                if (d == null) {
                    d = new Random();
                }
                d.setSeed(((long) UUID.randomUUID().hashCode()) + jCurrentTimeMillis);
                if (d.nextDouble() > aVar.f12376c) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(String str, c cVar, String str2) {
        try {
            Map<String, List<a>> map = cVar.a;
            if (map != null && map.size() > 0) {
                if (map.containsKey("*")) {
                    Iterator<Map.Entry<String, List<a>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (n(it.next().getValue())) {
                            k(false, str2, str, 1);
                            return true;
                        }
                    }
                } else {
                    String path = Uri.parse(str).getPath();
                    if (map.containsKey(path) && n(map.get(path))) {
                        k(false, str2, str, 2);
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            a2n.e(th, "hlUtil", "inb");
        }
    }

    public static boolean n(List<a> list) {
        if (list != null && list.size() > 0) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                if (l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static q3n o(String str, String str2) {
        Uri uri;
        try {
            if (f12374c == null) {
                return null;
            }
            if (f12374c.containsKey("app")) {
                b bVar = f12374c.get("app");
                if (SystemClock.elapsedRealtime() <= bVar.b) {
                    q3n q3nVar = bVar.a;
                    if (q3nVar != null) {
                        q3nVar.f15624e = false;
                    }
                    k(true, str2, str, 1);
                    return q3nVar;
                }
                f12374c.remove("app");
            } else if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null) {
                String path = uri.getPath();
                if (f12374c.containsKey(path)) {
                    b bVar2 = f12374c.get(path);
                    if (SystemClock.elapsedRealtime() <= bVar2.b) {
                        q3n q3nVar2 = bVar2.a;
                        if (q3nVar2 != null) {
                            q3nVar2.f15624e = false;
                        }
                        k(true, str2, str, 2);
                        return q3nVar2;
                    }
                    f12374c.remove(path);
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public static String p(String str, c cVar, String str2) {
        try {
            Map<String, String> map = cVar.b;
            if (map != null && map.size() > 0) {
                Uri uri = Uri.parse(str);
                String authority = uri.getAuthority();
                if (!map.containsKey(authority)) {
                    return str;
                }
                String str3 = map.get(authority);
                str = uri.buildUpon().authority(str3).toString();
                g(str2, authority, str3);
                return str;
            }
            return str;
        } catch (Throwable th) {
            a2n.e(th, "hlUtil", "pdr");
            return str;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0028 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0024, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<x3n> q() {
        ArrayList arrayList;
        Throwable th;
        ArrayList arrayList2 = null;
        try {
            synchronized (f) {
                try {
                    List<x3n> list = f;
                    if (list != null && list.size() > 0) {
                        arrayList = new ArrayList();
                        arrayList.addAll(f);
                        f.clear();
                        arrayList2 = arrayList;
                    }
                    return arrayList2;
                } catch (Throwable th2) {
                    arrayList = arrayList2;
                    th = th2;
                }
            }
            while (true) {
                try {
                    break;
                } catch (Throwable unused) {
                    return arrayList;
                }
            }
            throw th;
            while (true) {
                break;
                break;
            }
            throw th;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void r(c cVar, JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("domainMap");
            if (jSONObjectOptJSONObject == null || (jSONArrayNames = jSONObjectOptJSONObject.names()) == null) {
                return;
            }
            HashMap map = new HashMap(8);
            int length = jSONArrayNames.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayNames.optString(i);
                map.put(strOptString, jSONObjectOptJSONObject.optString(strOptString));
            }
            cVar.b = map;
        } catch (Throwable th) {
            a2n.e(th, "hlUtil", "pdr");
        }
    }

    public static class c {
        public Map<String, List<a>> a;
        public Map<String, String> b;

        public c() {
            this.a = new HashMap(8);
            this.b = new HashMap(8);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.a.equals(cVar.a) && this.b.equals(cVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Map<String, List<a>> map = this.a;
            int iHashCode = map != null ? map.hashCode() : 0;
            Map<String, String> map2 = this.b;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }
}

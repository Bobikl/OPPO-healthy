package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.a2n;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.h3n;
import com.oplus.aiunit.vision.i3n;
import com.oplus.aiunit.vision.n0n;
import com.oplus.aiunit.vision.p0n;
import com.oplus.aiunit.vision.p1n;
import com.oplus.aiunit.vision.q3n;
import com.oplus.aiunit.vision.r0;
import com.oplus.aiunit.vision.r0n;
import com.oplus.aiunit.vision.t0n;
import com.oplus.aiunit.vision.u4n;
import com.oplus.aiunit.vision.v0n;
import com.oplus.aiunit.vision.w0n;
import com.oplus.aiunit.vision.x0n;
import com.oplus.aiunit.vision.x2n;
import com.oplus.aiunit.vision.x3n;
import com.oplus.aiunit.vision.y3n;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.coroutines.DebugKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 {
    public static volatile boolean D = false;
    public static int a = -1;
    public static String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f681c = null;
    public static String k = "6";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f684l = "4";
    public static String m = "9";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f685n = "8";
    public static volatile boolean o = true;
    public static Vector<f> p = new Vector<>();
    public static Map<String, Integer> q = new HashMap();
    public static String r = null;
    public static long s = 0;
    public static volatile boolean d = false;
    public static volatile ConcurrentHashMap<String, h> t = new ConcurrentHashMap<>(8);
    public static volatile ConcurrentHashMap<String, Long> u = new ConcurrentHashMap<>(8);
    public static volatile ConcurrentHashMap<String, e> v = new ConcurrentHashMap<>(8);
    public static boolean w = false;
    public static boolean x = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f682e = 5000;
    public static boolean f = true;
    public static boolean g = false;
    public static int y = 3;
    public static boolean h = true;
    public static boolean i = false;
    public static int z = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f683j = false;
    public static ConcurrentHashMap<String, Boolean> A = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, Boolean> B = new ConcurrentHashMap<>();
    public static ArrayList<k0.a> C = new ArrayList<>();
    public static Queue<k0.c> E = new LinkedList();

    public class a extends u4n {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f686j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f687l;

        public a(String str, String str2, String str3, String str4) {
            this.i = str;
            this.f686j = str2;
            this.k = str3;
            this.f687l = str4;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            e eVar = (e) e0.v.get(this.i);
            if (eVar == null) {
                return;
            }
            b bVar = eVar.f691c;
            c cVarB = e0.b(e0.f681c, eVar.a, eVar.b, this.f686j, this.k, this.f687l);
            if (cVarB == null || bVar == null) {
                return;
            }
            bVar.a(cVarB);
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        @Deprecated
        public JSONObject a;

        @Deprecated
        public JSONObject b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f688c;
        public int d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f689e = 0;
        public JSONObject f;
        public a g;
        public b h;
        public boolean i;

        public static class a {
            public boolean a;
            public boolean b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public JSONObject f690c;
        }

        public static class b {
            public boolean a;
        }
    }

    public static class d extends h3n {
        public String r;
        public Map<String, String> s;
        public String t;
        public String u;
        public String v;

        public d(Context context, v0n v0nVar, String str, Map<String, String> map, String str2, String str3, String str4) {
            super(context, v0nVar);
            this.r = str;
            this.s = map;
            this.t = str2;
            this.u = str3;
            this.v = str4;
            setHttpProtocol(la.c.HTTPS);
            setDegradeAbility(la.a.FIX);
        }

        public static String m(String str, String str2) {
            try {
                return !TextUtils.isEmpty(str2) ? Uri.parse(str).buildUpon().encodedAuthority(str2).build().toString() : str;
            } catch (Throwable unused) {
                return str;
            }
        }

        @Override // com.oplus.aiunit.vision.h3n
        public final byte[] c() {
            return null;
        }

        @Override // com.oplus.aiunit.vision.h3n
        public final byte[] d() {
            String strW = p0n.W(((h3n) this).a);
            if (!TextUtils.isEmpty(strW)) {
                strW = t0n.d(new StringBuilder(strW).reverse().toString());
            }
            HashMap map = new HashMap();
            map.put("authkey", TextUtils.isEmpty(this.r) ? "" : this.r);
            map.put("plattype", "android");
            map.put("ccver", "1");
            map.put("product", ((h3n) this).b.a());
            map.put("version", ((h3n) this).b.e());
            map.put("output", "json");
            StringBuilder sb = new StringBuilder();
            sb.append(Build.VERSION.SDK_INT);
            map.put("androidversion", sb.toString());
            map.put("deviceId", strW);
            map.put("manufacture", Build.MANUFACTURER);
            Map<String, String> map2 = this.s;
            if (map2 != null && !map2.isEmpty()) {
                map.putAll(this.s);
            }
            map.put("abitype", w0n.d(((h3n) this).a));
            map.put(ConnectIdLogic.PARAM_EXT, ((h3n) this).b.g());
            return w0n.n(w0n.f(map));
        }

        @Override // com.oplus.aiunit.vision.h3n
        public final String e() {
            return "3.0";
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getIPDNSName() {
            return !TextUtils.isEmpty(this.v) ? this.v : super.getIPDNSName();
        }

        @Override // com.oplus.aiunit.vision.s0n, com.amap.api.col.p0003sl.la
        public final String getIPV6URL() {
            return m("https://dualstack-arestapi.amap.com/v3/iasdkauth", this.u);
        }

        @Override // com.amap.api.col.p0003sl.la
        public final Map<String, String> getRequestHead() {
            if (TextUtils.isEmpty(this.v)) {
                return null;
            }
            HashMap map = new HashMap();
            map.put("host", this.v);
            return map;
        }

        @Override // com.amap.api.col.p0003sl.la
        public final String getURL() {
            return m("https://restsdk.amap.com/v3/iasdkauth", this.t);
        }
    }

    public static class e {
        public v0n a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f691c;

        public e() {
        }

        public /* synthetic */ e(byte b) {
            this();
        }
    }

    public static class f {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AtomicInteger f692c;

        public f(String str, String str2, int i) {
            this.a = str;
            this.b = str2;
            this.f692c = new AtomicInteger(i);
        }

        public static f d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new f(jSONObject.optString("a"), jSONObject.optString("f"), jSONObject.optInt(b2n.g));
            } catch (Throwable unused) {
                return null;
            }
        }

        public final int a() {
            AtomicInteger atomicInteger = this.f692c;
            if (atomicInteger == null) {
                return 0;
            }
            return atomicInteger.get();
        }

        public final void c(String str) {
            this.b = str;
        }

        public final String e() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("a", this.a);
                jSONObject.put("f", this.b);
                jSONObject.put(b2n.g, this.f692c.get());
                return jSONObject.toString();
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    public static class g {
        public static boolean a = true;
        public static boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static boolean f693c = true;
        public static int d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static boolean f694e = false;
        public static int f;
    }

    public static class h {
        public long a;
        public String b;

        public h(Long l2, String str) {
            this.a = 0L;
            this.b = "";
            this.a = l2.longValue();
            this.b = str;
        }
    }

    public static v0n A(String str) {
        e eVar = v.get(str);
        if (eVar != null) {
            return eVar.a;
        }
        return null;
    }

    public static String B(String str, String str2) {
        return str2 + "_" + t0n.b(str.getBytes());
    }

    public static String C(List<String> list) {
        if (list == null) {
            return "";
        }
        try {
            if (list.size() <= 0) {
                return "";
            }
            String str = list.get(0);
            return !TextUtils.isEmpty(str) ? str : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static void D(Context context) {
        if (context == null) {
            return;
        }
        o = x2n.l(context, "open_common", "a2", true);
    }

    public static void E(k0.c cVar) {
        synchronized (C) {
            boolean z2 = false;
            for (int i2 = 0; i2 < C.size(); i2++) {
                k0.a aVar = C.get(i2);
                if (cVar.k.equals(aVar.f771j) && cVar.f775l.equals(aVar.m)) {
                    int i3 = cVar.u;
                    int i4 = aVar.f773n;
                    if (i3 == i4) {
                        z2 = true;
                        if (i4 == 1) {
                            aVar.q = ((((long) aVar.r.get()) * aVar.q) + cVar.f776n) / ((long) (aVar.r.get() + 1));
                        }
                        aVar.r.getAndIncrement();
                    }
                }
            }
            if (!z2) {
                C.add(new k0.a(cVar));
            }
            k0.s();
        }
    }

    public static synchronized void F(String str, boolean z2) {
        r(str, z2, null, null, null);
    }

    public static boolean G() {
        Integer num;
        Context context = f681c;
        if (context == null) {
            return false;
        }
        String strU = p0n.U(context);
        return (TextUtils.isEmpty(strU) || (num = q.get(strU.toUpperCase())) == null || num.intValue() != 2) ? false : true;
    }

    public static String H(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + ";15K;16H;17I;1A4;17S;183";
    }

    public static void I(Context context) {
        if (context == null) {
            return;
        }
        f = x2n.l(context, "open_common", "a13", true);
        h = x2n.l(context, "open_common", "a6", true);
        g = x2n.l(context, "open_common", "a7", false);
        f682e = x2n.a(context, "open_common", "a8", 5000);
        y = x2n.a(context, "open_common", "a9", 3);
        i = x2n.l(context, "open_common", "a10", false);
        z = x2n.a(context, "open_common", "a11", 3);
        f683j = x2n.l(context, "open_common", "a12", false);
    }

    public static void J(k0.c cVar) {
        if (cVar != null && f683j) {
            synchronized (E) {
                E.offer(cVar);
                k0.s();
            }
        }
    }

    public static boolean K() {
        Integer num;
        Context context = f681c;
        if (context == null) {
            return false;
        }
        String strU = p0n.U(context);
        return (TextUtils.isEmpty(strU) || (num = q.get(strU.toUpperCase())) == null || num.intValue() < 2) ? false : true;
    }

    public static void L() {
        try {
            f fVarE = e(f681c, "IPV6_CONFIG_NAME", "open_common");
            String strC = w0n.c(System.currentTimeMillis(), "yyyyMMdd");
            if (!strC.equals(fVarE.b)) {
                fVarE.c(strC);
                fVarE.f692c.set(0);
            }
            fVarE.f692c.incrementAndGet();
            m(f681c, "IPV6_CONFIG_NAME", "open_common", fVarE);
        } catch (Throwable unused) {
        }
    }

    public static void M(Context context) {
        try {
            if (w) {
                return;
            }
            p1n.d = x2n.l(context, "open_common", "a4", true);
            p1n.f15155e = x2n.l(context, "open_common", "a5", true);
            w = true;
        } catch (Throwable unused) {
        }
    }

    public static synchronized boolean N(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (v == null) {
                return false;
            }
            if (u == null) {
                u = new ConcurrentHashMap<>(8);
            }
            if (v.containsKey(str) && !u.containsKey(str)) {
                u.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
                return true;
            }
        } catch (Throwable th) {
            a2n.e(th, "at", "cslct");
        }
        return false;
    }

    public static void O() {
        if (d) {
            return;
        }
        try {
            Context context = f681c;
            if (context == null) {
                return;
            }
            d = true;
            r0n.a().c(context);
            D(context);
            I(context);
            g.a = x2n.l(context, "open_common", "ucf", g.a);
            g.b = x2n.l(context, "open_common", "fsv2", g.b);
            g.f693c = x2n.l(context, "open_common", "usc", g.f693c);
            g.d = x2n.a(context, "open_common", "umv", g.d);
            g.f694e = x2n.l(context, "open_common", "ust", g.f694e);
            g.f = x2n.a(context, "open_common", "ustv", g.f);
        } catch (Throwable unused) {
        }
    }

    public static void P(Context context) {
        try {
            if (x) {
                return;
            }
            x0n.d = x(x2n.o(context, "open_common", "a16", ""), true);
            x0n.b = x2n.b(context, "open_common", "a17", x0n.a);
            x = true;
        } catch (Throwable unused) {
        }
    }

    public static synchronized void Q(String str) {
        if (u == null) {
            return;
        }
        if (u.containsKey(str)) {
            u.remove(str);
        }
    }

    public static synchronized h R(String str) {
        try {
            if (t == null) {
                t = new ConcurrentHashMap<>(8);
            }
            if (t.containsKey(str)) {
                return t.get(str);
            }
            return new h(0L, "");
        } catch (Throwable th) {
            a2n.e(th, "at", "glcut");
        }
        throw th;
    }

    public static k0.a S() {
        if (D) {
            return null;
        }
        synchronized (C) {
            if (D) {
                return null;
            }
            Collections.sort(C);
            if (C.size() <= 0) {
                return null;
            }
            k0.a aVarClone = C.get(0).clone();
            D = true;
            return aVarClone;
        }
    }

    public static k0.c T() {
        synchronized (E) {
            k0.c cVarPoll = E.poll();
            if (cVarPoll != null) {
                return cVarPoll;
            }
            return null;
        }
    }

    public static boolean U(String str) {
        f fVarE;
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (!f) {
                return false;
            }
            if (!(A.get(str) == null)) {
                return false;
            }
            Context context = f681c;
            return context == null || (fVarE = e(context, B(str, "a14"), "open_common")) == null || fVarE.a() < y;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean W(String str) {
        f fVarE;
        try {
            if (TextUtils.isEmpty(str) || !i) {
                return false;
            }
            if (!(B.get(str) == null)) {
                return false;
            }
            Context context = f681c;
            if (context == null || (fVarE = e(context, B(str, "a15"), "open_common")) == null || fVarE.a() < z) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void X() {
        try {
            Context context = f681c;
            if (context != null) {
                String strU = p0n.U(context);
                if (!TextUtils.isEmpty(r) && !TextUtils.isEmpty(strU) && r.equals(strU) && System.currentTimeMillis() - s < 60000) {
                    return;
                }
                if (!TextUtils.isEmpty(strU)) {
                    r = strU;
                }
            } else if (System.currentTimeMillis() - s < 10000) {
                return;
            }
            s = System.currentTimeMillis();
            q.clear();
            if (!r0.a()) {
                q.put("WIFI", 3);
                q.put(Const.Callback.NetworkState.NetworkType.NETWORK_MOBILE, 3);
                return;
            }
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                    String displayName = networkInterface.getDisplayName();
                    Iterator<InterfaceAddress> it = networkInterface.getInterfaceAddresses().iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        InetAddress address = it.next().getAddress();
                        if (address instanceof Inet6Address) {
                            if (!y((Inet6Address) address)) {
                                i2 |= 2;
                            }
                        } else if (address instanceof Inet4Address) {
                            Inet4Address inet4Address = (Inet4Address) address;
                            if (!y(inet4Address) && !inet4Address.getHostAddress().startsWith(w0n.t("FMTkyLjE2OC40My4"))) {
                                i2 |= 1;
                            }
                        }
                    }
                    if (i2 != 0) {
                        if (displayName != null && displayName.startsWith("wlan")) {
                            q.put("WIFI", Integer.valueOf(i2));
                        } else if (displayName != null && displayName.startsWith("rmnet")) {
                            q.put(Const.Callback.NetworkState.NetworkType.NETWORK_MOBILE, Integer.valueOf(i2));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a2n.e(th, "at", "ipstack");
        }
    }

    public static long a(List<String> list) {
        if (list == null) {
            return 0L;
        }
        try {
            if (list.size() <= 0) {
                return 0L;
            }
            String str = list.get(0);
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            return Long.valueOf(str).longValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static c b(Context context, v0n v0nVar, String str, String str2, String str3, String str4) {
        return d(context, v0nVar, str, null, str2, str3, str4);
    }

    public static c c(Context context, v0n v0nVar, String str, Map<String, String> map) {
        return z(context, v0nVar, str, map);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0204 A[Catch: all -> 0x0257, TRY_LEAVE, TryCatch #15 {all -> 0x0257, blocks: (B:84:0x01ae, B:86:0x01b9, B:88:0x01c0, B:111:0x021c, B:113:0x0224, B:110:0x0219, B:92:0x01cb, B:94:0x01d4, B:96:0x01e2, B:97:0x01e8, B:99:0x01f2, B:100:0x01f6, B:102:0x0204, B:105:0x020b, B:107:0x0211), top: B:127:0x01ae, inners: #16 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0211 A[Catch: all -> 0x0218, TRY_LEAVE, TryCatch #16 {all -> 0x0218, blocks: (B:105:0x020b, B:107:0x0211), top: B:128:0x020b, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0224 A[Catch: all -> 0x0257, TRY_LEAVE, TryCatch #15 {all -> 0x0257, blocks: (B:84:0x01ae, B:86:0x01b9, B:88:0x01c0, B:111:0x021c, B:113:0x0224, B:110:0x0219, B:92:0x01cb, B:94:0x01d4, B:96:0x01e2, B:97:0x01e8, B:99:0x01f2, B:100:0x01f6, B:102:0x0204, B:105:0x020b, B:107:0x0211), top: B:127:0x01ae, inners: #16 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0248 A[Catch: all -> 0x025b, TryCatch #18 {all -> 0x025b, blocks: (B:114:0x022b, B:116:0x0248, B:117:0x024f), top: B:131:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:117:0x024f A[Catch: all -> 0x025b, TRY_LEAVE, TryCatch #18 {all -> 0x025b, blocks: (B:114:0x022b, B:116:0x0248, B:117:0x024f), top: B:131:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0196 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:80:0x019d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9 A[Catch: all -> 0x0257, TryCatch #15 {all -> 0x0257, blocks: (B:84:0x01ae, B:86:0x01b9, B:88:0x01c0, B:111:0x021c, B:113:0x0224, B:110:0x0219, B:92:0x01cb, B:94:0x01d4, B:96:0x01e2, B:97:0x01e8, B:99:0x01f2, B:100:0x01f6, B:102:0x0204, B:105:0x020b, B:107:0x0211), top: B:127:0x01ae, inners: #16 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c0 A[Catch: all -> 0x0257, TryCatch #15 {all -> 0x0257, blocks: (B:84:0x01ae, B:86:0x01b9, B:88:0x01c0, B:111:0x021c, B:113:0x0224, B:110:0x0219, B:92:0x01cb, B:94:0x01d4, B:96:0x01e2, B:97:0x01e8, B:99:0x01f2, B:100:0x01f6, B:102:0x0204, B:105:0x020b, B:107:0x0211), top: B:127:0x01ae, inners: #16 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cb A[Catch: all -> 0x0257, TryCatch #15 {all -> 0x0257, blocks: (B:84:0x01ae, B:86:0x01b9, B:88:0x01c0, B:111:0x021c, B:113:0x0224, B:110:0x0219, B:92:0x01cb, B:94:0x01d4, B:96:0x01e2, B:97:0x01e8, B:99:0x01f2, B:100:0x01f6, B:102:0x0204, B:105:0x020b, B:107:0x0211), top: B:127:0x01ae, inners: #16 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e2 A[Catch: all -> 0x0257, TryCatch #15 {all -> 0x0257, blocks: (B:84:0x01ae, B:86:0x01b9, B:88:0x01c0, B:111:0x021c, B:113:0x0224, B:110:0x0219, B:92:0x01cb, B:94:0x01d4, B:96:0x01e2, B:97:0x01e8, B:99:0x01f2, B:100:0x01f6, B:102:0x0204, B:105:0x020b, B:107:0x0211), top: B:127:0x01ae, inners: #16 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01f2 A[Catch: all -> 0x0257, TryCatch #15 {all -> 0x0257, blocks: (B:84:0x01ae, B:86:0x01b9, B:88:0x01c0, B:111:0x021c, B:113:0x0224, B:110:0x0219, B:92:0x01cb, B:94:0x01d4, B:96:0x01e2, B:97:0x01e8, B:99:0x01f2, B:100:0x01f6, B:102:0x0204, B:105:0x020b, B:107:0x0211), top: B:127:0x01ae, inners: #16 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [com.amap.api.col.3sl.e0$c] */
    /* JADX WARN: Type inference failed for: r13v14, types: [com.amap.api.col.3sl.e0$c] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.amap.api.col.3sl.e0$c] */
    public static c d(Context context, v0n v0nVar, String str, Map<String, String> map, String str2, String str3, String str4) throws ik {
        String str5;
        String str6;
        String str7;
        String str8;
        String strH;
        q3n q3nVarD;
        byte[] bArr;
        ?? r13;
        String str9;
        String str10;
        JSONObject jSONObject;
        int i2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        JSONObject jSONObject2;
        boolean zX;
        String str16 = "infocode";
        ?? r14 = "result";
        String str17 = "ver";
        c cVar = new c();
        cVar.f = new JSONObject();
        if (context != null) {
            f681c = context.getApplicationContext();
        }
        O();
        String strG = null;
        try {
            o(v0nVar);
            new i0();
            boolean zIsEmpty = TextUtils.isEmpty(str);
            try {
                if (zIsEmpty) {
                    strH = str;
                } else {
                    try {
                        strH = H(str);
                    } catch (ik e2) {
                        e = e2;
                        throw e;
                    } catch (Throwable unused) {
                        throw new ik(AMapException.ERROR_UNKNOWN);
                    }
                }
                try {
                    M(context);
                    P(context);
                    str7 = "result";
                    String str18 = strH;
                    r14 = cVar;
                    str8 = "ver";
                    str17 = "at";
                    str5 = "infocode";
                    str16 = "lc";
                    str6 = UTraceSQLiteHelperKt.COL_INFO;
                    try {
                        q3nVarD = i0.d(new d(context, v0nVar, str18, map, str2, str3, str4));
                        if (zIsEmpty) {
                            return r14;
                        }
                        if (q3nVarD != null) {
                            try {
                                bArr = q3nVarD.a;
                                try {
                                    Map<String, List<String>> map2 = q3nVarD.b;
                                    if (map2 != null && map2.containsKey("lct")) {
                                        List<String> list = map2.get("lct");
                                        List<String> list2 = map2.get("lct-info");
                                        r14.f689e = a(list);
                                        String strC = C(list2);
                                        if (r14.f689e != 0 && v0nVar != null) {
                                            String strA = v0nVar.a();
                                            if (!TextUtils.isEmpty(strA)) {
                                                p(strA, r14.f689e, strC);
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    try {
                                        th.printStackTrace();
                                        c2n.r(th, str17, "lct");
                                    } catch (ik e3) {
                                        e = e3;
                                        r14.f688c = e.a();
                                        h(context, v0nVar, e.a());
                                        c2n.j(v0nVar, "/v3/iasdkauth", e);
                                        r13 = r14;
                                    } catch (IllegalBlockSizeException e4) {
                                        e = e4;
                                        k(context, v0nVar, e);
                                        r13 = r14;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c2n.r(th, str17, str16);
                                        k(context, v0nVar, th);
                                        r13 = r14;
                                    }
                                }
                            } catch (ik e5) {
                                e = e5;
                                bArr = null;
                                r14.f688c = e.a();
                                h(context, v0nVar, e.a());
                                c2n.j(v0nVar, "/v3/iasdkauth", e);
                                r13 = r14;
                            } catch (IllegalBlockSizeException e6) {
                                e = e6;
                                bArr = null;
                                k(context, v0nVar, e);
                                r13 = r14;
                            } catch (Throwable th3) {
                                th = th3;
                                bArr = null;
                                c2n.r(th, str17, str16);
                                k(context, v0nVar, th);
                                r13 = r14;
                            }
                        } else {
                            bArr = null;
                        }
                        byte[] bArr2 = new byte[16];
                        byte[] bArr3 = new byte[bArr.length - 16];
                        System.arraycopy(bArr, 0, bArr2, 0, 16);
                        System.arraycopy(bArr, 16, bArr3, 0, bArr.length - 16);
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, w0n.t("EQUVT"));
                        Cipher cipher = Cipher.getInstance(w0n.t("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
                        cipher.init(2, secretKeySpec, new IvParameterSpec(w0n.u()));
                        strG = w0n.g(cipher.doFinal(bArr3));
                        r13 = r14;
                        str9 = strH;
                        if (bArr == null) {
                            return r13;
                        }
                        if (TextUtils.isEmpty(strG)) {
                            strG = w0n.g(bArr);
                        }
                        str10 = strG;
                        if (TextUtils.isEmpty(str10)) {
                            h(context, v0nVar, "result is null");
                        }
                        try {
                            jSONObject = new JSONObject(str10);
                            if (jSONObject.has("status")) {
                                i2 = jSONObject.getInt("status");
                                if (i2 == 1) {
                                    a = 1;
                                } else if (i2 == 0) {
                                    if (q3nVarD != null) {
                                        str11 = q3nVarD.f15623c;
                                        str12 = q3nVarD.d;
                                    } else {
                                        str11 = "authcsid";
                                        str12 = "authgsid";
                                    }
                                    w0n.i(context, str11, str12, jSONObject);
                                    a = 0;
                                    str13 = str6;
                                    if (jSONObject.has(str13)) {
                                        b = jSONObject.getString(str13);
                                    }
                                    String str19 = str5;
                                    c2n.l(v0nVar, "/v3/iasdkauth", b, str12, str11, jSONObject.has(str19) ? jSONObject.getString(str19) : "");
                                    if (a == 0) {
                                        r13.f688c = b;
                                        return r13;
                                    }
                                }
                                str14 = str8;
                                try {
                                    if (jSONObject.has(str14)) {
                                        r13.d = jSONObject.getInt(str14);
                                    }
                                } catch (Throwable th4) {
                                    a2n.e(th4, str17, str16);
                                }
                                str15 = str7;
                                if (w0n.l(jSONObject, str15)) {
                                    JSONObject jSONObject3 = jSONObject.getJSONObject(str15);
                                    j(context, v0nVar, str9, r13, jSONObject3);
                                    try {
                                        jSONObject2 = jSONObject3.getJSONObject("15K");
                                        zX = x(jSONObject2.optString("isTargetAble"), false);
                                        if (x(jSONObject2.optString("able"), false)) {
                                            r0n.a().d(context, zX);
                                        } else {
                                            r0n.a();
                                            r0n.e(context);
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            a2n.e(th5, str17, str16);
                        }
                        return r13;
                    } catch (ik e7) {
                        throw e7;
                    } catch (Throwable unused3) {
                        throw new ik(AMapException.ERROR_UNKNOWN);
                    }
                } catch (ik e8) {
                    e = e8;
                    throw e;
                } catch (Throwable unused4) {
                    throw new ik(AMapException.ERROR_UNKNOWN);
                }
            } catch (ik e9) {
                e = e9;
                q3nVarD = null;
                bArr = null;
                r14.f688c = e.a();
                h(context, v0nVar, e.a());
                c2n.j(v0nVar, "/v3/iasdkauth", e);
                r13 = r14;
                str9 = strH;
                if (bArr == null) {
                    return r13;
                }
                if (TextUtils.isEmpty(strG)) {
                    strG = w0n.g(bArr);
                }
                str10 = strG;
                if (TextUtils.isEmpty(str10)) {
                    h(context, v0nVar, "result is null");
                }
                jSONObject = new JSONObject(str10);
                if (jSONObject.has("status")) {
                    i2 = jSONObject.getInt("status");
                    if (i2 == 1) {
                        a = 1;
                    } else if (i2 == 0) {
                        if (q3nVarD != null) {
                            str11 = q3nVarD.f15623c;
                            str12 = q3nVarD.d;
                        } else {
                            str11 = "authcsid";
                            str12 = "authgsid";
                        }
                        w0n.i(context, str11, str12, jSONObject);
                        a = 0;
                        str13 = str6;
                        if (jSONObject.has(str13)) {
                            b = jSONObject.getString(str13);
                        }
                        String str110 = str5;
                        if (jSONObject.has(str110)) {
                        }
                        c2n.l(v0nVar, "/v3/iasdkauth", b, str12, str11, jSONObject.has(str110) ? jSONObject.getString(str110) : "");
                        if (a == 0) {
                            r13.f688c = b;
                            return r13;
                        }
                    }
                    str14 = str8;
                    if (jSONObject.has(str14)) {
                        r13.d = jSONObject.getInt(str14);
                    }
                    str15 = str7;
                    if (w0n.l(jSONObject, str15)) {
                        JSONObject jSONObject4 = jSONObject.getJSONObject(str15);
                        j(context, v0nVar, str9, r13, jSONObject4);
                        jSONObject2 = jSONObject4.getJSONObject("15K");
                        zX = x(jSONObject2.optString("isTargetAble"), false);
                        if (x(jSONObject2.optString("able"), false)) {
                            r0n.a();
                            r0n.e(context);
                        } else {
                            r0n.a().d(context, zX);
                        }
                    }
                }
                return r13;
            } catch (IllegalBlockSizeException e10) {
                e = e10;
                q3nVarD = null;
                bArr = null;
                k(context, v0nVar, e);
                r13 = r14;
                str9 = strH;
                if (bArr == null) {
                    return r13;
                }
                if (TextUtils.isEmpty(strG)) {
                    strG = w0n.g(bArr);
                }
                str10 = strG;
                if (TextUtils.isEmpty(str10)) {
                    h(context, v0nVar, "result is null");
                }
                jSONObject = new JSONObject(str10);
                if (jSONObject.has("status")) {
                    i2 = jSONObject.getInt("status");
                    if (i2 == 1) {
                        a = 1;
                    } else if (i2 == 0) {
                        if (q3nVarD != null) {
                            str11 = q3nVarD.f15623c;
                            str12 = q3nVarD.d;
                        } else {
                            str11 = "authcsid";
                            str12 = "authgsid";
                        }
                        w0n.i(context, str11, str12, jSONObject);
                        a = 0;
                        str13 = str6;
                        if (jSONObject.has(str13)) {
                            b = jSONObject.getString(str13);
                        }
                        String str111 = str5;
                        if (jSONObject.has(str111)) {
                        }
                        c2n.l(v0nVar, "/v3/iasdkauth", b, str12, str11, jSONObject.has(str111) ? jSONObject.getString(str111) : "");
                        if (a == 0) {
                            r13.f688c = b;
                            return r13;
                        }
                    }
                    str14 = str8;
                    if (jSONObject.has(str14)) {
                        r13.d = jSONObject.getInt(str14);
                    }
                    str15 = str7;
                    if (w0n.l(jSONObject, str15)) {
                        JSONObject jSONObject5 = jSONObject.getJSONObject(str15);
                        j(context, v0nVar, str9, r13, jSONObject5);
                        jSONObject2 = jSONObject5.getJSONObject("15K");
                        zX = x(jSONObject2.optString("isTargetAble"), false);
                        if (x(jSONObject2.optString("able"), false)) {
                            r0n.a();
                            r0n.e(context);
                        } else {
                            r0n.a().d(context, zX);
                        }
                    }
                }
                return r13;
            } catch (Throwable th6) {
                th = th6;
                q3nVarD = null;
                bArr = null;
                c2n.r(th, str17, str16);
                k(context, v0nVar, th);
                r13 = r14;
                str9 = strH;
                if (bArr == null) {
                    return r13;
                }
                if (TextUtils.isEmpty(strG)) {
                    strG = w0n.g(bArr);
                }
                str10 = strG;
                if (TextUtils.isEmpty(str10)) {
                    h(context, v0nVar, "result is null");
                }
                jSONObject = new JSONObject(str10);
                if (jSONObject.has("status")) {
                    i2 = jSONObject.getInt("status");
                    if (i2 == 1) {
                        a = 1;
                    } else if (i2 == 0) {
                        if (q3nVarD != null) {
                            str11 = q3nVarD.f15623c;
                            str12 = q3nVarD.d;
                        } else {
                            str11 = "authcsid";
                            str12 = "authgsid";
                        }
                        w0n.i(context, str11, str12, jSONObject);
                        a = 0;
                        str13 = str6;
                        if (jSONObject.has(str13)) {
                            b = jSONObject.getString(str13);
                        }
                        String str112 = str5;
                        if (jSONObject.has(str112)) {
                        }
                        c2n.l(v0nVar, "/v3/iasdkauth", b, str12, str11, jSONObject.has(str112) ? jSONObject.getString(str112) : "");
                        if (a == 0) {
                            r13.f688c = b;
                            return r13;
                        }
                    }
                    str14 = str8;
                    if (jSONObject.has(str14)) {
                        r13.d = jSONObject.getInt(str14);
                    }
                    str15 = str7;
                    if (w0n.l(jSONObject, str15)) {
                        JSONObject jSONObject6 = jSONObject.getJSONObject(str15);
                        j(context, v0nVar, str9, r13, jSONObject6);
                        jSONObject2 = jSONObject6.getJSONObject("15K");
                        zX = x(jSONObject2.optString("isTargetAble"), false);
                        if (x(jSONObject2.optString("able"), false)) {
                            r0n.a();
                            r0n.e(context);
                        } else {
                            r0n.a().d(context, zX);
                        }
                    }
                }
                return r13;
            }
        } catch (ik e11) {
            e = e11;
            str5 = "infocode";
            str6 = UTraceSQLiteHelperKt.COL_INFO;
            str7 = "result";
            str8 = "ver";
            r14 = cVar;
            str17 = "at";
            str16 = "lc";
            strH = str;
        } catch (IllegalBlockSizeException e12) {
            e = e12;
            str5 = "infocode";
            str6 = UTraceSQLiteHelperKt.COL_INFO;
            str7 = "result";
            str8 = "ver";
            r14 = cVar;
            str17 = "at";
            str16 = "lc";
            strH = str;
        } catch (Throwable th7) {
            th = th7;
            str5 = "infocode";
            str6 = UTraceSQLiteHelperKt.COL_INFO;
            str7 = "result";
            str8 = "ver";
            r14 = cVar;
            str17 = "at";
            str16 = "lc";
            strH = str;
        }
    }

    public static synchronized f e(Context context, String str, String str2) {
        f fVar;
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            while (true) {
                if (i2 >= p.size()) {
                    fVar = null;
                    break;
                }
                fVar = p.get(i2);
                if (fVar != null && str.equals(fVar.a)) {
                    break;
                }
                i2++;
            }
        } else {
            fVar = null;
            break;
        }
        if (fVar != null) {
            return fVar;
        }
        if (context == null) {
            return null;
        }
        f fVarD = f.d(x2n.o(context, str2, str, ""));
        String strC = w0n.c(System.currentTimeMillis(), "yyyyMMdd");
        if (fVarD == null) {
            fVarD = new f(str, strC, 0);
        }
        if (!strC.equals(fVarD.b)) {
            fVarD.c(strC);
            fVarD.f692c.set(0);
        }
        p.add(fVarD);
        return fVarD;
    }

    public static String f(String str) {
        e eVar;
        if (!v.containsKey(str) || (eVar = v.get(str)) == null) {
            return null;
        }
        return eVar.b;
    }

    public static void g(Context context) {
        if (context != null) {
            f681c = context.getApplicationContext();
        }
    }

    public static void h(Context context, v0n v0nVar, String str) {
        HashMap map = new HashMap();
        map.put("amap_sdk_auth_fail", "1");
        map.put("amap_sdk_auth_fail_type", str);
        map.put("amap_sdk_name", v0nVar.a());
        map.put("amap_sdk_version", v0nVar.f());
        String string = new JSONObject(map).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            x3n x3nVar = new x3n(context, "core", "2.0", "O001");
            x3nVar.a(string);
            y3n.d(x3nVar, context);
        } catch (ik unused) {
        }
    }

    public static synchronized void i(Context context, v0n v0nVar, String str, b bVar) {
        if (context == null || v0nVar == null) {
            return;
        }
        try {
            if (f681c == null) {
                f681c = context.getApplicationContext();
            }
            String strA = v0nVar.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            o(v0nVar);
            if (v == null) {
                v = new ConcurrentHashMap<>(8);
            }
            if (u == null) {
                u = new ConcurrentHashMap<>(8);
            }
            if (t == null) {
                t = new ConcurrentHashMap<>(8);
            }
            if (!v.containsKey(strA)) {
                e eVar = new e((byte) 0);
                eVar.a = v0nVar;
                eVar.b = str;
                eVar.f691c = bVar;
                v.put(strA, eVar);
                t.put(strA, new h(Long.valueOf(x2n.b(f681c, "open_common", strA, 0L)), x2n.o(f681c, "open_common", strA + "lct-info", "")));
                M(f681c);
                P(f681c);
            }
        } catch (Throwable th) {
            a2n.e(th, "at", "rglc");
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x028d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0297 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x02ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fc A[Catch: all -> 0x0284, TryCatch #1 {all -> 0x0284, blocks: (B:96:0x01f6, B:98:0x01fc, B:100:0x023a, B:102:0x023e, B:104:0x0242, B:106:0x0246, B:108:0x024a, B:110:0x024e), top: B:139:0x01f6 }] */
    public static void j(Context context, v0n v0nVar, String str, c cVar, JSONObject jSONObject) throws JSONException {
        String str2;
        String str3;
        boolean zX;
        Context context2;
        JSONObject jSONObject2;
        boolean zX2;
        boolean zX3;
        boolean zX4;
        String str4;
        int iOptInt;
        String str5;
        boolean zX5;
        int iOptInt2;
        c.a aVar = new c.a();
        aVar.a = false;
        aVar.b = false;
        cVar.g = aVar;
        try {
            String[] strArrSplit = str.split(";");
            if (strArrSplit != null && strArrSplit.length > 0) {
                for (String str6 : strArrSplit) {
                    if (jSONObject.has(str6)) {
                        cVar.f.putOpt(str6, jSONObject.get(str6));
                    }
                }
            }
        } catch (Throwable th) {
            a2n.e(th, "at", "co");
        }
        if (w0n.l(jSONObject, "16H")) {
            try {
                cVar.i = x(jSONObject.getJSONObject("16H").optString("able"), false);
            } catch (Throwable th2) {
                a2n.e(th2, "AuthConfigManager", "load 16H");
            }
        }
        if (w0n.l(jSONObject, "11K")) {
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject("11K");
                aVar.a = x(jSONObject3.getString("able"), false);
                if (jSONObject3.has(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                    aVar.f690c = jSONObject3.getJSONObject(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
                }
            } catch (Throwable th3) {
                a2n.e(th3, "AuthConfigManager", "load 11K");
            }
        }
        if (w0n.l(jSONObject, "145")) {
            try {
                cVar.a = jSONObject.getJSONObject("145");
            } catch (Throwable th4) {
                a2n.e(th4, "AuthConfigManager", "load 145");
            }
        }
        if (w0n.l(jSONObject, "14D")) {
            try {
                cVar.b = jSONObject.getJSONObject("14D");
            } catch (Throwable th5) {
                a2n.e(th5, "AuthConfigManager", "load 14D");
            }
        }
        if (w0n.l(jSONObject, "151")) {
            try {
                JSONObject jSONObject4 = jSONObject.getJSONObject("151");
                c.b bVar = new c.b();
                if (jSONObject4 != null) {
                    bVar.a = x(jSONObject4.optString("able"), false);
                }
                cVar.h = bVar;
            } catch (Throwable th6) {
                a2n.e(th6, "AuthConfigManager", "load 151");
            }
        }
        if (w0n.l(jSONObject, "17S")) {
            try {
                JSONObject jSONObject5 = jSONObject.getJSONObject("17S");
                if (jSONObject5 != null && (zX = x(jSONObject5.optString("able"), false)) != o) {
                    o = zX;
                    if (context != null) {
                        SharedPreferences.Editor editorC = x2n.c(context, "open_common");
                        x2n.k(editorC, "a2", zX);
                        x2n.f(editorC);
                    }
                }
                if (jSONObject5 != null) {
                    boolean zX6 = x(jSONObject5.optString("static_enable"), true);
                    boolean zX7 = x(jSONObject5.optString("static_ip_direct_enable"), false);
                    int iOptInt3 = jSONObject5.optInt("static_timeout", 5) * 1000;
                    int iOptInt4 = jSONObject5.optInt("static_retry", 3);
                    boolean zX8 = x(jSONObject5.optString("bgp_enable"), true);
                    str2 = "ust";
                    try {
                        boolean zX9 = x(jSONObject5.optString("bgp_ip_direct_enable"), false);
                        str3 = "umv";
                        try {
                            int iOptInt5 = jSONObject5.optInt("bgp_retry", 3);
                            boolean zX10 = x(jSONObject5.optString("perf_data_upload_enable"), false);
                            if (zX6 != f || zX7 != g || iOptInt3 != f682e || iOptInt4 != y || zX8 != h || zX9 != i || iOptInt5 != z || zX10 != f683j) {
                                f = zX6;
                                g = zX7;
                                f682e = iOptInt3;
                                y = iOptInt4;
                                h = zX8;
                                i = zX9;
                                z = iOptInt5;
                                f683j = zX10;
                                if (context != null) {
                                    SharedPreferences.Editor editorC2 = x2n.c(context, "open_common");
                                    x2n.k(editorC2, "a13", zX6);
                                    x2n.k(editorC2, "a6", zX8);
                                    x2n.k(editorC2, "a7", zX7);
                                    x2n.h(editorC2, "a8", iOptInt3);
                                    x2n.h(editorC2, "a9", iOptInt4);
                                    x2n.k(editorC2, "a10", zX9);
                                    x2n.h(editorC2, "a11", iOptInt5);
                                    x2n.k(editorC2, "a12", zX10);
                                    x2n.f(editorC2);
                                }
                            }
                            k0.s();
                            k0.s();
                            k0.s();
                            k0.s();
                            k0.s();
                        } catch (Throwable th7) {
                            th = th7;
                            a2n.e(th, "AuthConfigManager", "load 17S");
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        str3 = "umv";
                        a2n.e(th, "AuthConfigManager", "load 17S");
                        if (w0n.l(jSONObject, "15K")) {
                            try {
                                jSONObject2 = jSONObject.getJSONObject("15K");
                                if (jSONObject2 != null) {
                                    zX2 = x(jSONObject2.optString("ucf"), g.a);
                                    zX3 = x(jSONObject2.optString("fsv2"), g.b);
                                    zX4 = x(jSONObject2.optString("usc"), g.f693c);
                                    str4 = str3;
                                    iOptInt = jSONObject2.optInt(str4, g.d);
                                    str5 = str2;
                                    zX5 = x(jSONObject2.optString(str5), g.f694e);
                                    iOptInt2 = jSONObject2.optInt("ustv", g.f);
                                    if (zX2 != g.a) {
                                    }
                                    g.a = zX2;
                                    g.b = zX3;
                                    g.f693c = zX4;
                                    g.d = iOptInt;
                                    g.f694e = zX5;
                                    g.f = iOptInt2;
                                    context2 = context;
                                    try {
                                        SharedPreferences.Editor editorC3 = x2n.c(context2, "open_common");
                                        x2n.k(editorC3, "ucf", g.a);
                                        x2n.k(editorC3, "fsv2", g.b);
                                        x2n.k(editorC3, "usc", g.f693c);
                                        x2n.h(editorC3, str4, g.d);
                                        x2n.k(editorC3, str5, g.f694e);
                                        x2n.h(editorC3, "ustv", g.f);
                                        x2n.f(editorC3);
                                    } catch (Throwable unused) {
                                    }
                                } else {
                                    context2 = context;
                                }
                            } catch (Throwable th9) {
                                context2 = context;
                                a2n.e(th9, "AuthConfigManager", "load 15K");
                            }
                        } else {
                            context2 = context;
                        }
                        if (w0n.l(jSONObject, "183")) {
                            try {
                                i3n.c(v0nVar, jSONObject.getJSONObject("183"));
                            } catch (Throwable th10) {
                                a2n.e(th10, "AuthConfigManager", "load 183");
                            }
                        }
                        if (w0n.l(jSONObject, "17I")) {
                            try {
                                JSONObject jSONObject6 = jSONObject.getJSONObject("17I");
                                boolean zX11 = x(jSONObject6.optString("na"), false);
                                boolean zX12 = x(jSONObject6.optString("aa"), false);
                                p1n.d = zX11;
                                p1n.f15155e = zX12;
                                SharedPreferences.Editor editorC4 = x2n.c(context2, "open_common");
                                x2n.k(editorC4, "a4", zX11);
                                x2n.k(editorC4, "a5", zX12);
                                x2n.f(editorC4);
                            } catch (Throwable th11) {
                                a2n.e(th11, "AuthConfigManager", "load 17I");
                            }
                        }
                        if (w0n.l(jSONObject, "1A4")) {
                            try {
                                JSONObject jSONObject7 = jSONObject.getJSONObject("1A4");
                                String strOptString = jSONObject7.optString("ada");
                                boolean zX13 = x(strOptString, x0n.f18463c);
                                long jOptLong = jSONObject7.optLong("iv", x0n.a);
                                x0n.d = zX13;
                                x0n.b = jOptLong;
                                SharedPreferences.Editor editorC5 = x2n.c(context2, "open_common");
                                x2n.j(editorC5, "a16", strOptString);
                                x2n.i(editorC5, "a17", jOptLong);
                                x2n.f(editorC5);
                            } catch (Throwable th12) {
                                a2n.e(th12, "AuthConfigManager", "load 1A4");
                                return;
                            }
                        }
                    }
                } else {
                    str2 = "ust";
                    str3 = "umv";
                }
            } catch (Throwable th13) {
                th = th13;
                str2 = "ust";
            }
        } else {
            str2 = "ust";
            str3 = "umv";
        }
        if (w0n.l(jSONObject, "15K")) {
            jSONObject2 = jSONObject.getJSONObject("15K");
            if (jSONObject2 != null) {
                zX2 = x(jSONObject2.optString("ucf"), g.a);
                zX3 = x(jSONObject2.optString("fsv2"), g.b);
                zX4 = x(jSONObject2.optString("usc"), g.f693c);
                str4 = str3;
                iOptInt = jSONObject2.optInt(str4, g.d);
                str5 = str2;
                zX5 = x(jSONObject2.optString(str5), g.f694e);
                iOptInt2 = jSONObject2.optInt("ustv", g.f);
                if (zX2 != g.a && zX3 == g.b && zX4 == g.f693c && iOptInt == g.d && zX5 == g.f694e && iOptInt2 == g.d) {
                    context2 = context;
                } else {
                    g.a = zX2;
                    g.b = zX3;
                    g.f693c = zX4;
                    g.d = iOptInt;
                    g.f694e = zX5;
                    g.f = iOptInt2;
                    context2 = context;
                    SharedPreferences.Editor editorC6 = x2n.c(context2, "open_common");
                    x2n.k(editorC6, "ucf", g.a);
                    x2n.k(editorC6, "fsv2", g.b);
                    x2n.k(editorC6, "usc", g.f693c);
                    x2n.h(editorC6, str4, g.d);
                    x2n.k(editorC6, str5, g.f694e);
                    x2n.h(editorC6, "ustv", g.f);
                    x2n.f(editorC6);
                }
            } else {
                context2 = context;
            }
        } else {
            context2 = context;
        }
        if (w0n.l(jSONObject, "183")) {
            i3n.c(v0nVar, jSONObject.getJSONObject("183"));
        }
        if (w0n.l(jSONObject, "17I")) {
            JSONObject jSONObject8 = jSONObject.getJSONObject("17I");
            boolean zX14 = x(jSONObject8.optString("na"), false);
            boolean zX15 = x(jSONObject8.optString("aa"), false);
            p1n.d = zX14;
            p1n.f15155e = zX15;
            SharedPreferences.Editor editorC7 = x2n.c(context2, "open_common");
            x2n.k(editorC7, "a4", zX14);
            x2n.k(editorC7, "a5", zX15);
            x2n.f(editorC7);
        }
        if (w0n.l(jSONObject, "1A4")) {
            JSONObject jSONObject9 = jSONObject.getJSONObject("1A4");
            String strOptString2 = jSONObject9.optString("ada");
            boolean zX16 = x(strOptString2, x0n.f18463c);
            long jOptLong2 = jSONObject9.optLong("iv", x0n.a);
            x0n.d = zX16;
            x0n.b = jOptLong2;
            SharedPreferences.Editor editorC8 = x2n.c(context2, "open_common");
            x2n.j(editorC8, "a16", strOptString2);
            x2n.i(editorC8, "a17", jOptLong2);
            x2n.f(editorC8);
        }
    }

    public static void k(Context context, v0n v0nVar, Throwable th) {
        h(context, v0nVar, th.getMessage());
    }

    public static void l(Context context, String str) {
        n0n.b(context, str);
    }

    public static void m(Context context, String str, String str2, f fVar) {
        if (fVar == null || TextUtils.isEmpty(fVar.a)) {
            return;
        }
        String strE = fVar.e();
        if (TextUtils.isEmpty(strE) || context == null) {
            return;
        }
        SharedPreferences.Editor editorC = x2n.c(context, str2);
        editorC.putString(str, strE);
        x2n.f(editorC);
    }

    public static void n(k0.c cVar) {
        if (cVar == null || f681c == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("serverip", cVar.k);
        map.put("hostname", cVar.m);
        map.put("path", cVar.f775l);
        map.put("csid", cVar.i);
        map.put("degrade", String.valueOf(cVar.f774j.a()));
        map.put("errorcode", String.valueOf(cVar.u));
        map.put("errorsubcode", String.valueOf(cVar.v));
        map.put("connecttime", String.valueOf(cVar.p));
        map.put("writetime", String.valueOf(cVar.q));
        map.put("readtime", String.valueOf(cVar.r));
        map.put("datasize", String.valueOf(cVar.t));
        map.put("totaltime", String.valueOf(cVar.f776n));
        String string = new JSONObject(map).toString();
        "--埋点--".concat(String.valueOf(string));
        k0.s();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            x3n x3nVar = new x3n(f681c, "core", "2.0", "O008");
            x3nVar.a(string);
            y3n.d(x3nVar, f681c);
        } catch (ik unused) {
        }
    }

    public static void o(v0n v0nVar) {
        if (v0nVar != null) {
            try {
                if (TextUtils.isEmpty(v0nVar.a())) {
                    return;
                }
                String strF = v0nVar.f();
                if (TextUtils.isEmpty(strF)) {
                    strF = v0nVar.e();
                }
                if (TextUtils.isEmpty(strF)) {
                    return;
                }
                p1n.b(v0nVar.a(), strF);
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void p(String str, long j2, String str2) {
        try {
            if (v != null && v.containsKey(str)) {
                if (t == null) {
                    t = new ConcurrentHashMap<>(8);
                }
                t.put(str, new h(Long.valueOf(j2), str2));
                Context context = f681c;
                if (context != null) {
                    SharedPreferences.Editor editorC = x2n.c(context, "open_common");
                    x2n.i(editorC, str, j2);
                    x2n.j(editorC, str + "lct-info", str2);
                    x2n.f(editorC);
                }
            }
        } catch (Throwable th) {
            a2n.e(th, "at", "ucut");
        }
    }

    public static void q(String str, String str2) {
        f fVarE = e(f681c, str, str2);
        String strC = w0n.c(System.currentTimeMillis(), "yyyyMMdd");
        if (!strC.equals(fVarE.b)) {
            fVarE.c(strC);
            fVarE.f692c.set(0);
        }
        fVarE.f692c.incrementAndGet();
        m(f681c, str, str2, fVarE);
    }

    public static synchronized void r(String str, boolean z2, String str2, String str3, String str4) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (u == null) {
                u = new ConcurrentHashMap<>(8);
            }
            u.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            if (v == null) {
                return;
            }
            if (v.containsKey(str)) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (z2) {
                    i3n.j(true, str);
                }
                q0.h().b(new a(str, str2, str3, str4));
            }
        } catch (Throwable th) {
            a2n.e(th, "at", "lca");
        }
    }

    public static void s(String str, boolean z2, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str) || f681c == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("url", str);
        map.put("downLevel", String.valueOf(z2));
        map.put("ant", p0n.K(f681c) == 0 ? "0" : "1");
        if (z4) {
            map.put("type", z2 ? m : f685n);
        } else {
            map.put("type", z2 ? k : f684l);
        }
        map.put("status", z3 ? "0" : "1");
        String string = new JSONObject(map).toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            x3n x3nVar = new x3n(f681c, "core", "2.0", "O002");
            x3nVar.a(string);
            y3n.d(x3nVar, f681c);
        } catch (ik unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e A[Catch: all -> 0x0084, LOOP:0: B:23:0x0068->B:25:0x006e, LOOP_END, TryCatch #0 {, blocks: (B:9:0x000d, B:10:0x0013, B:12:0x0019, B:14:0x0029, B:16:0x0033, B:18:0x0039, B:20:0x003f, B:21:0x0046, B:22:0x005c, B:23:0x0068, B:25:0x006e, B:26:0x007f, B:27:0x0082), top: B:33:0x000d }] */
    public static void t(boolean z2, k0.a aVar) {
        if (!D || aVar == null) {
            return;
        }
        synchronized (C) {
            if (z2) {
                Iterator<k0.a> it = C.iterator();
                while (it.hasNext()) {
                    k0.a next = it.next();
                    if (next.f771j.equals(aVar.f771j) && next.m.equals(aVar.m) && next.f773n == aVar.f773n) {
                        if (next.r == aVar.r) {
                            it.remove();
                            k0.s();
                        } else {
                            next.r.set(next.r.get() - aVar.r.get());
                            k0.s();
                        }
                    }
                }
                D = false;
                k0.s();
                for (k0.a aVar2 : C) {
                    String str = aVar2.m;
                    Objects.toString(aVar2.r);
                    k0.s();
                }
                k0.s();
            } else {
                D = false;
                k0.s();
                while (r4.hasNext()) {
                    String str2 = aVar2.m;
                    Objects.toString(aVar2.r);
                    k0.s();
                }
                k0.s();
            }
            throw th;
        }
    }

    public static void u(boolean z2, String str) {
        try {
            "--markHostNameFailed---hostname=".concat(String.valueOf(str));
            k0.s();
            if (f || z2) {
                if ((i || !z2) && !TextUtils.isEmpty(str)) {
                    if (z2) {
                        if (B.get(str) != null) {
                            return;
                        }
                        B.put(str, Boolean.TRUE);
                        q(B(str, "a15"), "open_common");
                        return;
                    }
                    if (A.get(str) != null) {
                        return;
                    }
                    A.put(str, Boolean.TRUE);
                    q(B(str, "a14"), "open_common");
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean v() {
        f fVarE;
        if (f681c != null) {
            X();
            if (!K()) {
                return false;
            }
            if (G()) {
                return true;
            }
        }
        return o && (fVarE = e(f681c, "IPV6_CONFIG_NAME", "open_common")) != null && fVarE.a() < 5;
    }

    public static synchronized boolean w(String str, long j2) {
        boolean z2 = false;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            h hVarR = R(str);
            long jLongValue = 0;
            if (j2 != (hVarR != null ? hVarR.a : 0L)) {
                if (u != null && u.containsKey(str)) {
                    jLongValue = u.get(str).longValue();
                }
                if (SystemClock.elapsedRealtime() - jLongValue > 30000) {
                    z2 = true;
                }
            }
        } catch (Throwable unused) {
        }
        return z2;
    }

    public static boolean x(String str, boolean z2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return z2;
            }
            String[] strArrSplit = URLDecoder.decode(str).split("/");
            return strArrSplit[strArrSplit.length - 1].charAt(4) % 2 == 1;
        } catch (Throwable unused) {
            return z2;
        }
    }

    public static boolean y(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }

    public static c z(Context context, v0n v0nVar, String str, Map<String, String> map) {
        return d(context, v0nVar, str, map, null, null, null);
    }
}

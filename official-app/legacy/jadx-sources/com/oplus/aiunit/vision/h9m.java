package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class h9m {
    public static final String A = "DynCon";
    public static final int B = 10000;
    public static final String C = "https://h5.m.taobao.com/mlapp/olist.html";
    public static final int D = 10;
    public static final boolean E = true;
    public static final boolean F = false;
    public static final boolean G = true;
    public static final boolean H = true;
    public static final boolean I = false;
    public static final boolean J = false;
    public static final boolean K = false;
    public static final boolean L = false;
    public static final boolean M = true;
    public static final String N = "";
    public static final boolean O = false;
    public static final boolean P = false;
    public static final int Q = 1000;
    public static final boolean R = true;
    public static final String S = "";
    public static final boolean T = false;
    public static final boolean U = false;
    public static final int V = 1000;
    public static final int W = 20000;
    public static final boolean X = false;
    public static final String Y = "alipay_cashier_dynamic_config";
    public static final String Z = "timeout";
    public static final String a0 = "h5_port_degrade";
    public static final String b0 = "st_sdk_config";
    public static final String c0 = "tbreturl";
    public static final String d0 = "launchAppSwitch";
    public static final String e0 = "configQueryInterval";
    public static final String f0 = "deg_log_mcgw";
    public static final String g0 = "deg_start_srv_first";
    public static final String h0 = "prev_jump_dual";
    public static final String i0 = "bind_use_imp";
    public static final String j0 = "retry_bnd_once";
    public static final String k0 = "skip_trans";
    public static final String l0 = "start_trans";
    public static final String m0 = "up_before_pay";
    public static final String n0 = "lck_k";
    public static final String o0 = "use_sc_lck_a";
    public static final String p0 = "utdid_factor";
    public static final String q0 = "cfg_max_time";
    public static final String r0 = "get_oa_id";
    public static final String s0 = "notifyFailApp";
    public static final String t0 = "startactivity_in_ui_thread";
    public static final String u0 = "intercept_batch";
    public static final String v0 = "bind_with_startActivity";
    public static final String w0 = "enableStartActivityFallback";
    public static final String x0 = "enableBindExFallback";
    public static h9m y0;
    public JSONObject w;
    public int a = 10000;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12072c = C;
    public int d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12073e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12074j = true;
    public boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12075l = false;
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12076n = false;
    public boolean o = true;
    public String p = "";
    public String q = "";
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public int u = 1000;
    public boolean v = false;
    public boolean x = true;
    public List<b> y = null;
    public int z = -1;

    public class a implements Runnable {
        public final /* synthetic */ qam i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f12077j;
        public final /* synthetic */ boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f12078l;

        public a(qam qamVar, Context context, boolean z, int i) {
            this.i = qamVar;
            this.f12077j = context;
            this.k = z;
            this.f12078l = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ygm ygmVarA = new ahm().a(this.i, this.f12077j);
                if (ygmVarA != null) {
                    h9m.this.g(this.i, ygmVarA.a());
                    h9m.this.e(qam.w());
                    l9m.b(this.i, sgm.f16581l, "offcfg|" + this.k + "|" + this.f12078l);
                }
            } catch (Throwable th) {
                qrm.d(th);
            }
        }
    }

    public static final class b {
        public final String a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f12079c;

        public b(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.f12079c = str2;
        }

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new b(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString("pk"));
        }

        public static List<b> b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                b bVarA = a(jSONArray.optJSONObject(i));
                if (bVarA != null) {
                    arrayList.add(bVarA);
                }
            }
            return arrayList;
        }

        public static JSONArray c(List<b> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(d(it.next()));
            }
            return jSONArray;
        }

        public static JSONObject d(b bVar) {
            if (bVar == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", bVar.a).put("v", bVar.b).put("pk", bVar.f12079c);
            } catch (JSONException e2) {
                qrm.d(e2);
                return null;
            }
        }

        public String toString() {
            return String.valueOf(d(this));
        }
    }

    public static h9m I() {
        if (y0 == null) {
            h9m h9mVar = new h9m();
            y0 = h9mVar;
            h9mVar.z();
        }
        return y0;
    }

    public boolean A() {
        return this.s;
    }

    public boolean B() {
        return this.v;
    }

    public boolean C() {
        return this.r;
    }

    public boolean D() {
        return this.x;
    }

    public boolean E() {
        return this.b;
    }

    public boolean F() {
        return this.f;
    }

    public boolean G() {
        return this.f12076n;
    }

    public final int H() {
        return this.u;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeout", r());
        jSONObject.put(a0, E());
        jSONObject.put(c0, x());
        jSONObject.put(e0, m());
        jSONObject.put(d0, b.c(s()));
        jSONObject.put(u0, p());
        jSONObject.put(f0, n());
        jSONObject.put(g0, o());
        jSONObject.put(h0, t());
        jSONObject.put(i0, k());
        jSONObject.put(j0, u());
        jSONObject.put(k0, w());
        jSONObject.put(l0, G());
        jSONObject.put(m0, y());
        jSONObject.put(o0, v());
        jSONObject.put(n0, q());
        jSONObject.put(v0, l());
        jSONObject.put(q0, H());
        jSONObject.put(r0, D());
        jSONObject.put(s0, B());
        jSONObject.put(w0, C());
        jSONObject.put(x0, A());
        jSONObject.put(t0, F());
        jSONObject.put(sam.b, b());
        return jSONObject;
    }

    public JSONObject b() {
        return this.w;
    }

    public final void e(qam qamVar) {
        try {
            JSONObject jSONObjectA = a();
            a1n.c(qamVar, chm.e().c(), Y, jSONObjectA.toString());
        } catch (Exception e2) {
            qrm.d(e2);
        }
    }

    public void f(qam qamVar, Context context, boolean z, int i) {
        l9m.b(qamVar, sgm.f16581l, "oncfg|" + z + "|" + i);
        a aVar = new a(qamVar, context, z, i);
        if (!z || com.alipay.sdk.m.u.a.Y()) {
            Thread thread = new Thread(aVar);
            thread.setName("AlipayDCP");
            thread.start();
            return;
        }
        int iH = H();
        if (com.alipay.sdk.m.u.a.u(iH, aVar, "AlipayDCPBlok")) {
            return;
        }
        l9m.h(qamVar, sgm.f16581l, sgm.m0, "" + iH);
    }

    public final void g(qam qamVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(b0);
            sam.e(qamVar, jSONObjectOptJSONObject, sam.c(qamVar, jSONObject));
            if (jSONObjectOptJSONObject != null) {
                i(jSONObjectOptJSONObject);
            } else {
                qrm.i(A, "empty config");
            }
        } catch (Throwable th) {
            qrm.d(th);
        }
    }

    public final void h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            i(new JSONObject(str));
        } catch (Throwable th) {
            qrm.d(th);
        }
    }

    public final void i(JSONObject jSONObject) {
        this.a = jSONObject.optInt("timeout", 10000);
        this.b = jSONObject.optBoolean(a0, false);
        this.f12072c = jSONObject.optString(c0, C).trim();
        this.d = jSONObject.optInt(e0, 10);
        this.y = b.b(jSONObject.optJSONArray(d0));
        this.f12073e = jSONObject.optBoolean(u0, true);
        this.h = jSONObject.optBoolean(f0, false);
        this.i = jSONObject.optBoolean(g0, true);
        this.f12074j = jSONObject.optBoolean(h0, true);
        this.k = jSONObject.optBoolean(i0, false);
        this.f12075l = jSONObject.optBoolean(j0, false);
        this.m = jSONObject.optBoolean(k0, false);
        this.f12076n = jSONObject.optBoolean(l0, false);
        this.o = jSONObject.optBoolean(m0, true);
        this.p = jSONObject.optString(n0, "");
        this.t = jSONObject.optBoolean(o0, false);
        this.v = jSONObject.optBoolean(s0, false);
        this.q = jSONObject.optString(v0, "");
        this.u = jSONObject.optInt(q0, 1000);
        this.x = jSONObject.optBoolean(r0, true);
        this.r = jSONObject.optBoolean(w0, false);
        this.s = jSONObject.optBoolean(x0, false);
        this.f = jSONObject.optBoolean(t0, false);
        this.w = jSONObject.optJSONObject(sam.b);
    }

    public boolean j(Context context, int i) {
        if (this.z == -1) {
            this.z = com.alipay.sdk.m.u.a.a();
            a1n.c(qam.w(), context, p0, String.valueOf(this.z));
        }
        return this.z < i;
    }

    public boolean k() {
        return this.k;
    }

    public String l() {
        return this.q;
    }

    public int m() {
        return this.d;
    }

    public boolean n() {
        return this.h;
    }

    public boolean o() {
        return this.i;
    }

    public boolean p() {
        return this.f12073e;
    }

    public String q() {
        return this.p;
    }

    public int r() {
        int i = this.a;
        if (i < 1000 || i > 20000) {
            qrm.f(A, "time(def) = 10000");
            return 10000;
        }
        qrm.f(A, "time = " + this.a);
        return this.a;
    }

    public List<b> s() {
        return this.y;
    }

    public boolean t() {
        return this.f12074j;
    }

    public boolean u() {
        return this.f12075l;
    }

    public boolean v() {
        return this.t;
    }

    public boolean w() {
        return this.m;
    }

    public String x() {
        return this.f12072c;
    }

    public boolean y() {
        return this.o;
    }

    public void z() {
        Context contextC = chm.e().c();
        String strB = a1n.b(qam.w(), contextC, Y, null);
        try {
            this.z = Integer.parseInt(a1n.b(qam.w(), contextC, p0, "-1"));
        } catch (Exception unused) {
        }
        h(strB);
    }
}

package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.hzm;
import com.oplus.aiunit.vision.jym;
import com.oplus.aiunit.vision.mym;
import com.oplus.aiunit.vision.nym;
import com.oplus.aiunit.vision.pxm;
import com.oplus.aiunit.vision.qxm;
import com.oplus.aiunit.vision.v0n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class u {
    public static v0n a;
    public static u d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f863e;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f864c = new a("manifestThread");

    public class a extends HandlerThread {

        /* JADX INFO: renamed from: com.amap.api.col.3sl.u$a$a, reason: collision with other inner class name */
        public class C0163a implements e0.b {
            public C0163a() {
            }

            @Override // com.amap.api.col.3sl.e0.b
            public final void a(e0.c cVar) {
                b bVar;
                JSONObject jSONObject;
                JSONObject jSONObjectOptJSONObject;
                JSONObject jSONObject2;
                JSONObject jSONObjectOptJSONObject2;
                Message message = new Message();
                if (cVar != null) {
                    try {
                        e0.c.a aVar = cVar.g;
                        if (aVar != null) {
                            message.obj = new jym(aVar.b, aVar.a);
                        }
                    } catch (Throwable th) {
                        try {
                            qxm.g(th, "ManifestConfig", "run");
                            if (bVar == null) {
                                return;
                            }
                        } finally {
                            message.what = 3;
                            if (u.this.b != null) {
                                u.this.b.sendMessage(message);
                            }
                        }
                    }
                }
                if (cVar != null && (jSONObject2 = cVar.f) != null && (jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("184")) != null) {
                    u.l(jSONObjectOptJSONObject2);
                    hzm.a(u.f863e, "amap_search", "cache_control", jSONObjectOptJSONObject2.toString());
                }
                if (cVar != null && (jSONObject = cVar.f) != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("185")) != null) {
                    u.k(jSONObjectOptJSONObject);
                    hzm.a(u.f863e, "amap_search", "parm_control", jSONObjectOptJSONObject.toString());
                }
                message.what = 3;
                if (u.this.b == null) {
                }
            }
        }

        public a(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            Thread.currentThread().setName("ManifestConfigThread");
            v0n v0nVarA = pxm.a(false);
            u.j(u.f863e);
            e0.i(u.f863e, v0nVarA, "11K;001;184;185", new C0163a());
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public class b extends Handler {
        public String a;

        public b(Looper looper) {
            super(looper);
            this.a = "handleMessage";
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message != null && message.what == 3) {
                try {
                    jym jymVar = (jym) message.obj;
                    if (jymVar == null) {
                        jymVar = new jym(false, false);
                    }
                    c2n.g(u.f863e, pxm.a(jymVar.a()));
                    u.a = pxm.a(jymVar.a());
                } catch (Throwable th) {
                    qxm.g(th, "ManifestConfig", this.a);
                }
            }
        }
    }

    public u(Context context) {
        f863e = context;
        a = pxm.a(false);
        try {
            g();
            this.b = new b(Looper.getMainLooper());
            this.f864c.start();
        } catch (Throwable th) {
            qxm.g(th, "ManifestConfig", "ManifestConfig");
        }
    }

    public static u c(Context context) {
        if (d == null) {
            d = new u(context);
        }
        return d;
    }

    public static x.a d(JSONObject jSONObject, boolean z, x.a aVar) {
        boolean zOptBoolean;
        x.a aVar2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            x.a aVar3 = new x.a();
            try {
                if (z) {
                    zOptBoolean = e0.x(jSONObject.optString("able"), aVar == null || aVar.e());
                } else {
                    zOptBoolean = jSONObject.optBoolean("able", aVar == null || aVar.e());
                }
                int iOptInt = jSONObject.optInt("timeoffset", aVar != null ? (int) aVar.f() : 86400);
                int iOptInt2 = jSONObject.optInt("num", aVar != null ? aVar.g() : 10);
                double dOptDouble = jSONObject.optDouble("limitDistance", aVar != null ? aVar.h() : 0.0d);
                aVar3.d(zOptBoolean);
                aVar3.c(iOptInt);
                aVar3.b(iOptInt2);
                aVar3.a(dOptDouble);
                return aVar3;
            } catch (Throwable th) {
                th = th;
                aVar2 = aVar3;
                th.printStackTrace();
                return aVar2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void e(String str, JSONObject jSONObject, x.a aVar) {
        if (jSONObject != null && jSONObject.has(str)) {
            x.b().f(str, d(jSONObject.optJSONObject(str), false, aVar));
        }
    }

    public static void g() {
        mym.a();
    }

    public static void j(Context context) {
        try {
            String str = (String) hzm.b(context, "amap_search", "cache_control", "");
            if (!TextUtils.isEmpty(str)) {
                l(new JSONObject(str));
            }
            String str2 = (String) hzm.b(context, "amap_search", "parm_control", "");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            k(new JSONObject(str2));
        } catch (Throwable th) {
            qxm.g(th, "ManifestConfig", "ManifestConfig-readAuthFromCache");
        }
    }

    public static void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                boolean zX = e0.x(jSONObject.optString("passAreaAble"), true);
                boolean zX2 = e0.x(jSONObject.optString("truckAble"), true);
                boolean zX3 = e0.x(jSONObject.optString("poiPageAble"), true);
                boolean zX4 = e0.x(jSONObject.optString("rideAble"), true);
                boolean zX5 = e0.x(jSONObject.optString("walkAble"), true);
                boolean zX6 = e0.x(jSONObject.optString("passPointAble"), true);
                boolean zX7 = e0.x(jSONObject.optString("keyWordLenAble"), true);
                int iOptInt = jSONObject.optInt("poiPageMaxSize", 25);
                int iOptInt2 = jSONObject.optInt("passAreaMaxCount", 100);
                int iOptInt3 = jSONObject.optInt("walkMaxLength", 100);
                int iOptInt4 = jSONObject.optInt("passPointMaxCount", 6);
                int iOptInt5 = jSONObject.optInt("poiPageMaxNum", 100);
                int iOptInt6 = jSONObject.optInt("truckMaxLength", 5000);
                int iOptInt7 = jSONObject.optInt("rideMaxLength", 1200);
                int iOptInt8 = jSONObject.optInt("passAreaMaxArea", 100000000);
                int iOptInt9 = jSONObject.optInt("passAreaPointCount", 16);
                int iOptInt10 = jSONObject.optInt("keyWordLenMaxNum", 100);
                nym.a().d(zX);
                nym.a().g(iOptInt2);
                nym.a().r(iOptInt8);
                nym.a().s(iOptInt9);
                nym.a().f(zX2);
                nym.a().o(iOptInt6);
                nym.a().h(zX3);
                nym.a().m(iOptInt5);
                nym.a().b(iOptInt);
                nym.a().e(iOptInt10);
                nym.a().p(zX7);
                nym.a().j(zX4);
                nym.a().q(iOptInt7);
                nym.a().l(zX5);
                nym.a().i(iOptInt3);
                nym.a().n(zX6);
                nym.a().k(iOptInt4);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void l(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("able")) {
                    x.a aVarD = d(jSONObject, true, null);
                    x.b().d(aVarD);
                    if (aVarD.e()) {
                        e("regeo", jSONObject, aVarD);
                        e("geo", jSONObject, aVarD);
                        e("placeText", jSONObject, aVarD);
                        e("placeAround", jSONObject, aVarD);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

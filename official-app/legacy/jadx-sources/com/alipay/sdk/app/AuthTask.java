package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.m.j.c;
import com.alipay.sdk.m.u.h;
import com.oplus.aiunit.vision.bhm;
import com.oplus.aiunit.vision.chm;
import com.oplus.aiunit.vision.gam;
import com.oplus.aiunit.vision.h9m;
import com.oplus.aiunit.vision.j3n;
import com.oplus.aiunit.vision.l9m;
import com.oplus.aiunit.vision.oam;
import com.oplus.aiunit.vision.qam;
import com.oplus.aiunit.vision.qgm;
import com.oplus.aiunit.vision.qrm;
import com.oplus.aiunit.vision.sgm;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class AuthTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f581c = h.class;
    public Activity a;
    public com.alipay.sdk.m.x.a b;

    public class a implements h.f {
        public a() {
        }

        @Override // com.alipay.sdk.m.u.h.f
        public void a() {
            AuthTask.this.c();
        }

        @Override // com.alipay.sdk.m.u.h.f
        public void b() {
        }
    }

    public AuthTask(Activity activity) {
        this.a = activity;
        chm.e().b(this.a);
        this.b = new com.alipay.sdk.m.x.a(activity, com.alipay.sdk.m.x.a.k);
    }

    public synchronized String auth(String str, boolean z) {
        return innerAuth(new qam(this.a, str, sgm.f16582n), str, z);
    }

    public synchronized Map<String, String> authV2(String str, boolean z) {
        qam qamVar;
        qamVar = new qam(this.a, str, "authV2");
        return j3n.c(qamVar, innerAuth(qamVar, str, z));
    }

    public final String b(qam qamVar, bhm bhmVar) {
        String[] strArrF = bhmVar.f();
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrF[0]);
        Intent intent = new Intent(this.a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        qam.a.c(qamVar, intent);
        this.a.startActivity(intent);
        Object obj = f581c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return qgm.a();
            }
        }
        String strG = qgm.g();
        return TextUtils.isEmpty(strG) ? qgm.a() : strG;
    }

    public final void c() {
        com.alipay.sdk.m.x.a aVar = this.b;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final h.f d() {
        return new a();
    }

    public final String e(Activity activity, String str, qam qamVar) {
        f();
        c cVarB = null;
        try {
            try {
                List<bhm> listB = bhm.b(new oam().b(qamVar, activity, str).c().optJSONObject("form").optJSONObject("onload"));
                c();
                for (int i = 0; i < listB.size(); i++) {
                    if (listB.get(i).a() == com.alipay.sdk.m.r.a.WapPay) {
                        String strB = b(qamVar, listB.get(i));
                        c();
                        return strB;
                    }
                }
                c();
            } catch (Throwable th) {
                c();
                throw th;
            }
        } catch (IOException e2) {
            c cVarB2 = c.b(c.NETWORK_ERROR.b());
            l9m.f(qamVar, "net", e2);
            cVarB = cVarB2;
            c();
        } catch (Throwable th2) {
            l9m.d(qamVar, sgm.f16581l, sgm.C, th2);
            c();
        }
        if (cVarB == null) {
            cVarB = c.b(c.FAILED.b());
        }
        return qgm.b(cVarB.b(), cVarB.a(), "");
    }

    public final void f() {
        com.alipay.sdk.m.x.a aVar = this.b;
        if (aVar != null) {
            aVar.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00c1 A[Catch: all -> 0x0137, PHI: r9
  0x00c1: PHI (r9v11 java.lang.String) = (r9v2 java.lang.String), (r9v13 java.lang.String) binds: [B:16:0x00bf, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x0006, B:8:0x0020, B:18:0x00ca, B:17:0x00c1, B:21:0x00d6, B:23:0x0123, B:24:0x012c, B:25:0x0136, B:15:0x0074, B:7:0x001a, B:14:0x0071), top: B:31:0x0003, inners: #0, #2 }] */
    public synchronized String innerAuth(qam qamVar, String str, boolean z) {
        String strA;
        if (z) {
            f();
            chm.e().b(this.a);
            strA = qgm.a();
            gam.b("");
            try {
                try {
                    strA = a(this.a, str, qamVar);
                    l9m.c(qamVar, sgm.f16581l, sgm.V, "" + SystemClock.elapsedRealtime());
                    l9m.c(qamVar, sgm.f16581l, sgm.W, j3n.a(strA, j3n.a) + "|" + j3n.a(strA, j3n.b));
                    if (!h9m.I().y()) {
                        h9m.I().f(qamVar, this.a, false, 1);
                    }
                } catch (Exception e2) {
                    qrm.d(e2);
                    l9m.c(qamVar, sgm.f16581l, sgm.V, "" + SystemClock.elapsedRealtime());
                    l9m.c(qamVar, sgm.f16581l, sgm.W, j3n.a(strA, j3n.a) + "|" + j3n.a(strA, j3n.b));
                    if (!h9m.I().y()) {
                        h9m.I().f(qamVar, this.a, false, 1);
                    }
                }
                c();
                l9m.g(this.a, qamVar, str, qamVar.d);
            } catch (Throwable th) {
                l9m.c(qamVar, sgm.f16581l, sgm.V, "" + SystemClock.elapsedRealtime());
                l9m.c(qamVar, sgm.f16581l, sgm.W, j3n.a(strA, j3n.a) + "|" + j3n.a(strA, j3n.b));
                if (!h9m.I().y()) {
                    h9m.I().f(qamVar, this.a, false, 1);
                }
                c();
                l9m.g(this.a, qamVar, str, qamVar.d);
                throw th;
            }
        } else {
            chm.e().b(this.a);
            strA = qgm.a();
            gam.b("");
            strA = a(this.a, str, qamVar);
            l9m.c(qamVar, sgm.f16581l, sgm.V, "" + SystemClock.elapsedRealtime());
            l9m.c(qamVar, sgm.f16581l, sgm.W, j3n.a(strA, j3n.a) + "|" + j3n.a(strA, j3n.b));
            if (!h9m.I().y()) {
                h9m.I().f(qamVar, this.a, false, 1);
            }
            c();
            l9m.g(this.a, qamVar, str, qamVar.d);
        }
        throw th;
        return strA;
    }

    public final String a(Activity activity, String str, qam qamVar) {
        String strB = qamVar.b(str);
        List<h9m.b> listS = h9m.I().s();
        if (!h9m.I().g || listS == null) {
            listS = gam.d;
        }
        if (!com.alipay.sdk.m.u.a.w(qamVar, this.a, listS, true)) {
            l9m.b(qamVar, sgm.f16581l, sgm.j0);
            return e(activity, strB, qamVar);
        }
        h hVar = new h(activity, qamVar, d());
        String strH = hVar.h(strB, false);
        hVar.i();
        if (!TextUtils.equals(strH, h.i) && !TextUtils.equals(strH, h.f617j)) {
            return TextUtils.isEmpty(strH) ? qgm.a() : strH;
        }
        l9m.b(qamVar, sgm.f16581l, sgm.i0);
        return e(activity, strB, qamVar);
    }
}

package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.m.u.h;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.bhm;
import com.oplus.aiunit.vision.chm;
import com.oplus.aiunit.vision.dhm;
import com.oplus.aiunit.vision.gam;
import com.oplus.aiunit.vision.h9m;
import com.oplus.aiunit.vision.ham;
import com.oplus.aiunit.vision.ivm;
import com.oplus.aiunit.vision.j3n;
import com.oplus.aiunit.vision.kam;
import com.oplus.aiunit.vision.l9m;
import com.oplus.aiunit.vision.ld8;
import com.oplus.aiunit.vision.qam;
import com.oplus.aiunit.vision.qgm;
import com.oplus.aiunit.vision.qrm;
import com.oplus.aiunit.vision.ram;
import com.oplus.aiunit.vision.sgm;
import com.oplus.aiunit.vision.tzm;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class PayTask {
    public static final Object h = h.class;
    public static long i;
    public Activity a;
    public com.alipay.sdk.m.x.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f589c = "wappaygw.alipay.com/service/rest.htm";
    public final String d = "mclient.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f590e = "mclient.alipay.com/home/exterfaceAssign.htm";
    public final String f = "mclient.alipay.com/cashier/mobilepay.htm";
    public Map<String, c> g = new HashMap();

    public class a implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f591j;
        public final /* synthetic */ H5PayCallback k;

        public a(String str, boolean z, H5PayCallback h5PayCallback) {
            this.i = str;
            this.f591j = z;
            this.k = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            ld8 ld8VarH5Pay = PayTask.this.h5Pay(new qam(PayTask.this.a, this.i, "payInterceptorWithUrl"), this.i, this.f591j);
            qrm.h(ham.A, "inc finished: " + ld8VarH5Pay.a());
            this.k.onPayResult(ld8VarH5Pay);
        }
    }

    public class b implements h.f {
        public b() {
        }

        @Override // com.alipay.sdk.m.u.h.f
        public void a() {
            PayTask.this.dismissLoading();
        }

        @Override // com.alipay.sdk.m.u.h.f
        public void b() {
        }
    }

    public PayTask(Activity activity) {
        this.a = activity;
        chm.e().b(this.a);
        this.b = new com.alipay.sdk.m.x.a(activity, com.alipay.sdk.m.x.a.f622j);
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        try {
            chm.e().b(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - i < h9m.I().m()) {
                return false;
            }
            i = jElapsedRealtime;
            h9m.I().f(qam.w(), context.getApplicationContext(), false, 4);
            return true;
        } catch (Exception e2) {
            qrm.d(e2);
            return false;
        }
        throw th;
    }

    public final h.f b() {
        return new b();
    }

    public final String c(qam qamVar, bhm bhmVar) {
        String[] strArrF = bhmVar.f();
        Intent intent = new Intent(this.a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrF[0]);
        if (strArrF.length == 2) {
            bundle.putString(HttpConst.COOKIE, strArrF[1]);
        }
        intent.putExtras(bundle);
        qam.a.c(qamVar, intent);
        this.a.startActivity(intent);
        Object obj = h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e2) {
                qrm.d(e2);
                return qgm.a();
            }
        }
        String strG = qgm.g();
        return TextUtils.isEmpty(strG) ? qgm.a() : strG;
    }

    public final String d(qam qamVar, bhm bhmVar, String str) {
        boolean zF;
        String strG;
        String[] strArrF = bhmVar.f();
        Intent intent = new Intent(this.a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectX = com.alipay.sdk.m.u.a.X(new String(kam.d(strArrF[2])));
            intent.putExtra("url", strArrF[0]);
            intent.putExtra("title", strArrF[1]);
            intent.putExtra("version", com.alipay.sdk.m.x.c.d);
            intent.putExtra("method", jSONObjectX.optString("method", "POST"));
            qgm.d(false);
            qgm.c(null);
            qam.a.c(qamVar, intent);
            this.a.startActivity(intent);
            Object obj = h;
            synchronized (obj) {
                try {
                    obj.wait();
                    zF = qgm.f();
                    strG = qgm.g();
                    qgm.d(false);
                    qgm.c(null);
                } catch (InterruptedException e2) {
                    qrm.d(e2);
                    return qgm.a();
                }
            }
            String strB = "";
            if (zF) {
                try {
                    List<bhm> listB = bhm.b(com.alipay.sdk.m.u.a.X(new String(kam.d(strG))));
                    for (int i2 = 0; i2 < listB.size(); i2++) {
                        bhm bhmVar2 = listB.get(i2);
                        if (bhmVar2.a() == com.alipay.sdk.m.r.a.SetResult) {
                            String[] strArrF2 = bhmVar2.f();
                            strB = qgm.b(Integer.valueOf(strArrF2[1]).intValue(), strArrF2[0], com.alipay.sdk.m.u.a.Q(qamVar, strArrF2[2]));
                            break;
                        }
                    }
                } catch (Throwable th) {
                    qrm.d(th);
                    l9m.e(qamVar, sgm.f16581l, sgm.B, th, strG);
                }
            }
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            try {
                return qgm.b(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th2) {
                l9m.e(qamVar, sgm.f16581l, sgm.B, th2, "endCode: " + str);
                return qgm.b(8000, "", "");
            }
        } catch (Throwable th3) {
            qrm.d(th3);
            l9m.e(qamVar, sgm.f16581l, sgm.B, th3, Arrays.toString(strArrF));
            return qgm.a();
        }
    }

    public void dismissLoading() {
        com.alipay.sdk.m.x.a aVar = this.b;
        if (aVar != null) {
            aVar.c();
            this.b = null;
        }
    }

    public final String e(qam qamVar, String str) {
        showLoading();
        com.alipay.sdk.m.j.c cVarB = null;
        try {
            try {
                try {
                    JSONObject jSONObjectC = new ivm().b(qamVar, this.a.getApplicationContext(), str).c();
                    String strOptString = jSONObjectC.optString("end_code", null);
                    List<bhm> listB = bhm.b(jSONObjectC.optJSONObject("form").optJSONObject("onload"));
                    for (int i2 = 0; i2 < listB.size(); i2++) {
                        if (listB.get(i2).a() == com.alipay.sdk.m.r.a.Update) {
                            bhm.c(listB.get(i2));
                        }
                    }
                    j(qamVar, jSONObjectC);
                    dismissLoading();
                    l9m.a(this.a, qamVar, str, qamVar.d);
                    for (int i3 = 0; i3 < listB.size(); i3++) {
                        bhm bhmVar = listB.get(i3);
                        if (bhmVar.a() == com.alipay.sdk.m.r.a.WapPay) {
                            String strC = c(qamVar, bhmVar);
                            dismissLoading();
                            l9m.a(this.a, qamVar, str, qamVar.d);
                            return strC;
                        }
                        if (bhmVar.a() == com.alipay.sdk.m.r.a.OpenWeb) {
                            String strD = d(qamVar, bhmVar, strOptString);
                            dismissLoading();
                            l9m.a(this.a, qamVar, str, qamVar.d);
                            return strD;
                        }
                    }
                    dismissLoading();
                    l9m.a(this.a, qamVar, str, qamVar.d);
                } catch (IOException e2) {
                    com.alipay.sdk.m.j.c cVarB2 = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.NETWORK_ERROR.b());
                    l9m.f(qamVar, "net", e2);
                    dismissLoading();
                    l9m.a(this.a, qamVar, str, qamVar.d);
                    cVarB = cVarB2;
                }
            } catch (Throwable th) {
                qrm.d(th);
                l9m.d(qamVar, sgm.f16581l, sgm.B, th);
                dismissLoading();
                l9m.a(this.a, qamVar, str, qamVar.d);
            }
            if (cVarB == null) {
                cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.FAILED.b());
            }
            return qgm.b(cVarB.b(), cVarB.a(), "");
        } catch (Throwable th2) {
            dismissLoading();
            l9m.a(this.a, qamVar, str, qamVar.d);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0050 A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x006c A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0074 A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x015f A[Catch: all -> 0x01fc, PHI: r9
  0x015f: PHI (r9v18 java.lang.String) = (r9v17 java.lang.String), (r9v20 java.lang.String) binds: [B:34:0x015d, B:29:0x0107] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x000f A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[Catch: all -> 0x01fc, TryCatch #2 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000f, B:9:0x0023, B:10:0x0027, B:12:0x0048, B:14:0x0050, B:15:0x0053, B:17:0x0057, B:19:0x005f, B:20:0x006c, B:22:0x0074, B:28:0x00bc, B:36:0x016c, B:35:0x015f, B:33:0x0112, B:40:0x0193, B:42:0x01e0, B:43:0x01ed, B:44:0x01fb, B:11:0x0043, B:32:0x010b, B:25:0x0085, B:27:0x009f), top: B:52:0x0003, inners: #0, #1 }] */
    public final synchronized String f(qam qamVar, String str, boolean z) {
        String strA;
        String strSubstring;
        int iIndexOf;
        if (z) {
            showLoading();
            if (str.contains("payment_inst=")) {
                strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
                iIndexOf = strSubstring.indexOf(38);
                if (iIndexOf > 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                gam.b(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
            } else {
                gam.b("");
            }
            if (str.contains(ham.w)) {
                ham.x = true;
            }
            if (ham.x) {
                if (str.startsWith(ham.y)) {
                    str = str.substring(str.indexOf(ham.y) + 53);
                } else if (str.startsWith(ham.z)) {
                    str = str.substring(str.indexOf(ham.z) + 52);
                }
            }
            strA = "";
            try {
                qrm.h(ham.A, "pay prepared: " + str);
                strA = g(str, qamVar);
                qrm.h(ham.A, "pay raw result: " + strA);
                tzm.c(qamVar, this.a.getApplicationContext(), strA);
                l9m.c(qamVar, sgm.f16581l, sgm.V, "" + SystemClock.elapsedRealtime());
                l9m.c(qamVar, sgm.f16581l, sgm.W, j3n.a(strA, j3n.a) + "|" + j3n.a(strA, j3n.b));
                if (!h9m.I().y()) {
                    h9m.I().f(qamVar, this.a.getApplicationContext(), false, 3);
                }
            } catch (Throwable th) {
                try {
                    strA = qgm.a();
                    qrm.d(th);
                    l9m.c(qamVar, sgm.f16581l, sgm.V, "" + SystemClock.elapsedRealtime());
                    l9m.c(qamVar, sgm.f16581l, sgm.W, j3n.a(strA, j3n.a) + "|" + j3n.a(strA, j3n.b));
                    if (!h9m.I().y()) {
                        h9m.I().f(qamVar, this.a.getApplicationContext(), false, 3);
                    }
                } catch (Throwable th2) {
                    l9m.c(qamVar, sgm.f16581l, sgm.V, "" + SystemClock.elapsedRealtime());
                    l9m.c(qamVar, sgm.f16581l, sgm.W, j3n.a(strA, j3n.a) + "|" + j3n.a(strA, j3n.b));
                    if (!h9m.I().y()) {
                        h9m.I().f(qamVar, this.a.getApplicationContext(), false, 3);
                    }
                    dismissLoading();
                    l9m.g(this.a.getApplicationContext(), qamVar, str, qamVar.d);
                    throw th2;
                }
            }
            dismissLoading();
            l9m.g(this.a.getApplicationContext(), qamVar, str, qamVar.d);
            qrm.h(ham.A, "pay returning: " + strA);
        } else {
            if (str.contains("payment_inst=")) {
                strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
                iIndexOf = strSubstring.indexOf(38);
                if (iIndexOf > 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                gam.b(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
            } else {
                gam.b("");
            }
            if (str.contains(ham.w)) {
                ham.x = true;
            }
            if (ham.x) {
                if (str.startsWith(ham.y)) {
                    str = str.substring(str.indexOf(ham.y) + 53);
                } else if (str.startsWith(ham.z)) {
                    str = str.substring(str.indexOf(ham.z) + 52);
                }
            }
            strA = "";
            qrm.h(ham.A, "pay prepared: " + str);
            strA = g(str, qamVar);
            qrm.h(ham.A, "pay raw result: " + strA);
            tzm.c(qamVar, this.a.getApplicationContext(), strA);
            l9m.c(qamVar, sgm.f16581l, sgm.V, "" + SystemClock.elapsedRealtime());
            l9m.c(qamVar, sgm.f16581l, sgm.W, j3n.a(strA, j3n.a) + "|" + j3n.a(strA, j3n.b));
            if (!h9m.I().y()) {
                h9m.I().f(qamVar, this.a.getApplicationContext(), false, 3);
            }
            dismissLoading();
            l9m.g(this.a.getApplicationContext(), qamVar, str, qamVar.d);
            qrm.h(ham.A, "pay returning: " + strA);
        }
        throw th;
        return strA;
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String strTrim = str.trim();
                if (strTrim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || strTrim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String strTrim2 = strTrim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + com.alipay.sdk.m.u.a.o("<request_token>", "</request_token>", com.alipay.sdk.m.u.a.E(strTrim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.a) + "\"";
                    }
                }
                if (strTrim.startsWith("https://mclient.alipay.com/service/rest.htm") || strTrim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String strTrim3 = strTrim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + com.alipay.sdk.m.u.a.o("<request_token>", "</request_token>", com.alipay.sdk.m.u.a.E(strTrim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.a) + "\"";
                    }
                }
                if ((strTrim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || strTrim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((strTrim.contains("alipay.wap.create.direct.pay.by.user") || strTrim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(strTrim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", a(this.a));
                    return qam.C + jSONObject.toString();
                }
                a aVar = null;
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String strO = com.alipay.sdk.m.u.a.o("?", "", str);
                    if (!TextUtils.isEmpty(strO)) {
                        Map<String, String> mapE = com.alipay.sdk.m.u.a.E(strO);
                        StringBuilder sb = new StringBuilder();
                        if (k(false, true, "trade_no", sb, mapE, "trade_no", "alipay_trade_no")) {
                            k(true, false, "pay_phase_id", sb, mapE, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb.append("&biz_sub_type=\"TRADE\"");
                            sb.append("&biz_type=\"trade\"");
                            String str2 = mapE.get("app_name");
                            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(mapE.get("cid"))) {
                                str2 = "ali1688";
                            } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(mapE.get(SpeechConstant.KEY_EVENT_SID)) || !TextUtils.isEmpty(mapE.get("s_id")))) {
                                str2 = "tb";
                            }
                            sb.append("&app_name=\"" + str2 + "\"");
                            if (!k(true, true, "extern_token", sb, mapE, "extern_token", "cid", SpeechConstant.KEY_EVENT_SID, "s_id")) {
                                return "";
                            }
                            k(true, false, "appenv", sb, mapE, "appenv");
                            sb.append("&pay_channel_id=\"alipay_sdk\"");
                            c cVar = new c(this, aVar);
                            cVar.c(mapE.get("return_url"));
                            cVar.e(mapE.get("show_url"));
                            cVar.a(mapE.get("pay_order_id"));
                            String str3 = sb.toString() + "&bizcontext=\"" + a(this.a) + "\"";
                            this.g.put(str3, cVar);
                            return str3;
                        }
                    }
                }
                if (!strTrim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !strTrim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!EnvUtils.c() || !strTrim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if (h9m.I().p() && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(strTrim).find()) {
                        Uri uri = Uri.parse(strTrim);
                        String queryParameter = uri.getQueryParameter("return_url");
                        String queryParameter2 = uri.getQueryParameter("show_url");
                        String queryParameter3 = uri.getQueryParameter("pay_order_id");
                        String strA = a(uri.getQueryParameter("trade_nos"), uri.getQueryParameter("alipay_trade_no"));
                        String strA2 = a(uri.getQueryParameter("payPhaseId"), uri.getQueryParameter("pay_phase_id"), uri.getQueryParameter("out_relation_id"));
                        String[] strArr = new String[4];
                        strArr[0] = uri.getQueryParameter("app_name");
                        strArr[1] = !TextUtils.isEmpty(uri.getQueryParameter("cid")) ? "ali1688" : "";
                        strArr[2] = !TextUtils.isEmpty(uri.getQueryParameter(SpeechConstant.KEY_EVENT_SID)) ? "tb" : "";
                        strArr[3] = !TextUtils.isEmpty(uri.getQueryParameter("s_id")) ? "tb" : "";
                        String strA3 = a(strArr);
                        String strA4 = a(uri.getQueryParameter("extern_token"), uri.getQueryParameter("cid"), uri.getQueryParameter(SpeechConstant.KEY_EVENT_SID), uri.getQueryParameter("s_id"));
                        String strA5 = a(uri.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA3) && !TextUtils.isEmpty(strA4)) {
                            String str4 = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", strA, strA2, strA3, strA4, strA5, a(this.a));
                            c cVar2 = new c(this, null);
                            cVar2.c(queryParameter);
                            cVar2.e(queryParameter2);
                            cVar2.a(queryParameter3);
                            cVar2.f(strA);
                            this.g.put(str4, cVar2);
                            return str4;
                        }
                    }
                }
                String strA6 = a(this.a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", strTrim);
                jSONObject2.put("bizcontext", strA6);
                return String.format("new_external_info==%s", jSONObject2.toString());
            }
        } catch (Throwable th) {
            qrm.d(th);
        }
        return "";
    }

    public synchronized String fetchTradeToken() {
        return tzm.a(new qam(this.a, "", "fetchTradeToken"), this.a.getApplicationContext());
    }

    public final String g(String str, qam qamVar) {
        String strB = qamVar.b(str);
        if (strB.contains("paymethod=\"expressGateway\"")) {
            return e(qamVar, strB);
        }
        List<h9m.b> listS = h9m.I().s();
        if (!h9m.I().g || listS == null) {
            listS = gam.d;
        }
        if (!com.alipay.sdk.m.u.a.w(qamVar, this.a, listS, true)) {
            l9m.b(qamVar, sgm.f16581l, sgm.j0);
            return e(qamVar, strB);
        }
        h hVar = new h(this.a, qamVar, b());
        qrm.h(ham.A, "pay inner started: " + strB);
        String strH = hVar.h(strB, false);
        if (!TextUtils.isEmpty(strH)) {
            if (strH.contains("resultStatus={" + com.alipay.sdk.m.j.c.ACTIVITY_NOT_START_EXIT.b() + "}")) {
                com.alipay.sdk.m.u.a.t("alipaySdk", "startActivityEx", this.a, qamVar);
                strH = hVar.h(strB, true);
            }
        }
        qrm.h(ham.A, "pay inner raw result: " + strH);
        hVar.i();
        boolean zC = h9m.I().C();
        if (TextUtils.equals(strH, h.i) || TextUtils.equals(strH, h.f617j) || (zC && qamVar.s())) {
            l9m.b(qamVar, sgm.f16581l, sgm.i0);
            return e(qamVar, strB);
        }
        if (TextUtils.isEmpty(strH)) {
            return qgm.a();
        }
        if (!strH.contains(PayResultActivity.b)) {
            return strH;
        }
        l9m.b(qamVar, sgm.f16581l, sgm.k0);
        return a(qamVar, strB, listS, strH, this.a);
    }

    public String getVersion() {
        return ham.f12086j;
    }

    public final String h(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }

    public synchronized ld8 h5Pay(qam qamVar, String str, boolean z) {
        ld8 ld8Var;
        ld8Var = new ld8();
        try {
            String[] strArrSplit = f(qamVar, str, z).split(";");
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                int iIndexOf = str2.indexOf("={");
                if (iIndexOf >= 0) {
                    String strSubstring = str2.substring(0, iIndexOf);
                    map.put(strSubstring, h(str2, strSubstring));
                }
            }
            if (map.containsKey(j3n.a)) {
                ld8Var.c(map.get(j3n.a));
            }
            ld8Var.d(i(str, map));
            if (TextUtils.isEmpty(ld8Var.b())) {
                l9m.h(qamVar, sgm.f16581l, sgm.n0, "");
            }
        } catch (Throwable th) {
            l9m.d(qamVar, sgm.f16581l, sgm.o0, th);
            qrm.d(th);
        }
        return ld8Var;
    }

    public final String i(String str, Map<String, String> map) throws UnsupportedEncodingException {
        boolean zEquals = "9000".equals(map.get(j3n.a));
        String str2 = map.get("result");
        c cVarRemove = this.g.remove(str);
        if (map.containsKey("callBackUrl")) {
            return map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String strA = a(com.alipay.sdk.m.u.a.o("&callBackUrl=\"", "\"", str2), com.alipay.sdk.m.u.a.o("&call_back_url=\"", "\"", str2), com.alipay.sdk.m.u.a.o(ham.u, "\"", str2), URLDecoder.decode(com.alipay.sdk.m.u.a.o(ham.v, "&", str2), "utf-8"), URLDecoder.decode(com.alipay.sdk.m.u.a.o("&callBackUrl=", "&", str2), "utf-8"), com.alipay.sdk.m.u.a.o("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        if (cVarRemove != null) {
            String strB = zEquals ? cVarRemove.b() : cVarRemove.d();
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
        }
        return cVarRemove != null ? h9m.I().x() : "";
    }

    public final void j(qam qamVar, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("tid");
            String strOptString2 = jSONObject.optString(ram.f16142j);
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            ram.a(chm.e().c()).b(strOptString, strOptString2);
        } catch (Throwable th) {
            l9m.d(qamVar, sgm.f16581l, sgm.P, th);
        }
    }

    public final boolean k(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i2];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i2++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z2;
        }
        if (!z) {
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
            return true;
        }
        sb.append("&");
        sb.append(str);
        sb.append("=\"");
        sb.append(str2);
        sb.append("\"");
        return true;
    }

    public synchronized String pay(String str, boolean z) {
        if (dhm.a()) {
            return qgm.e();
        }
        return f(new qam(this.a, str, "pay"), str, z);
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
        String strFetchOrderInfoFromH5PayUrl;
        strFetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl)) {
            qrm.h(ham.A, "intercepted: " + strFetchOrderInfoFromH5PayUrl);
            new Thread(new a(strFetchOrderInfoFromH5PayUrl, z, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
        String strF;
        qam qamVar;
        if (dhm.a()) {
            strF = qgm.e();
            qamVar = null;
        } else {
            qam qamVar2 = new qam(this.a, str, "payV2");
            strF = f(qamVar2, str, z);
            qamVar = qamVar2;
        }
        return j3n.c(qamVar, strF);
    }

    public void showLoading() {
        com.alipay.sdk.m.x.a aVar = this.b;
        if (aVar != null) {
            aVar.f();
        }
    }

    public static String a(Context context) {
        String str;
        String str2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = packageInfo.packageName;
            } catch (Exception e2) {
                e = e2;
                qrm.d(e);
                str2 = "";
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(qam.r, ham.g);
            jSONObject.put(qam.s, "and_lite");
            jSONObject.put(qam.t, ham.i);
            jSONObject.put(qam.u, str2);
            jSONObject.put(qam.w, str);
            jSONObject.put(qam.x, System.currentTimeMillis());
            if (!TextUtils.isEmpty("sc")) {
                jSONObject.put("sc", "h5tonative");
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            qrm.d(th);
            return "";
        }
    }

    public class c {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f593c;
        public String d;

        public c() {
            this.a = "";
            this.b = "";
            this.f593c = "";
            this.d = "";
        }

        public void a(String str) {
            this.f593c = str;
        }

        public String b() {
            return this.a;
        }

        public void c(String str) {
            this.a = str;
        }

        public String d() {
            return this.b;
        }

        public void e(String str) {
            this.b = str;
        }

        public void f(String str) {
            this.d = str;
        }

        public /* synthetic */ c(PayTask payTask, a aVar) {
            this();
        }
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public static String a(qam qamVar, String str, List<h9m.b> list, String str2, Activity activity) {
        com.alipay.sdk.m.u.a.c cVarH = com.alipay.sdk.m.u.a.h(qamVar, activity, list);
        if (cVarH == null || cVarH.b(qamVar) || cVarH.a() || !TextUtils.equals(cVarH.a.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        qrm.f(ham.A, "PayTask not_login");
        String strValueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap<String, Object> map = PayResultActivity.f586c;
        map.put(strValueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra(PayResultActivity.f, str);
        intent.putExtra(PayResultActivity.g, activity.getPackageName());
        intent.putExtra(PayResultActivity.f587e, strValueOf);
        qam.a.c(qamVar, intent);
        activity.startActivity(intent);
        synchronized (map.get(strValueOf)) {
            try {
                qrm.f(ham.A, "PayTask wait");
                map.get(strValueOf).wait();
            } catch (InterruptedException unused) {
                qrm.f(ham.A, "PayTask interrupted");
                return qgm.a();
            }
        }
        String str3 = PayResultActivity.b.b;
        qrm.f(ham.A, "PayTask ret: " + str3);
        return str3;
    }
}

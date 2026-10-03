package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes12.dex */
public class l9m {

    public static final class a {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.l9m$a$a, reason: collision with other inner class name */
        public static class RunnableC0897a implements Runnable {
            public final /* synthetic */ String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ Context f13599j;

            public RunnableC0897a(String str, Context context) {
                this.i = str;
                this.f13599j = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(this.i) || a.d(this.f13599j, this.i)) {
                    for (int i = 0; i < 4; i++) {
                        String strE = b.e(this.f13599j);
                        if (TextUtils.isEmpty(strE) || !a.d(this.f13599j, strE)) {
                            return;
                        }
                    }
                }
            }
        }

        public static synchronized void a(Context context, sgm sgmVar, String str, String str2) {
            if (context == null || sgmVar == null || str == null) {
                return;
            }
            b(context, sgmVar.e(str), str2);
        }

        public static synchronized void b(Context context, String str, String str2) {
            if (context == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                b.c(context, str, str2);
            }
            new Thread(new RunnableC0897a(str, context)).start();
        }

        public static synchronized boolean d(Context context, String str) {
            qrm.f(ham.A, "stat sub " + str);
            try {
                if ((h9m.I().n() ? new xom() : new prm()).b(null, context, str) == null) {
                    return false;
                }
                b.a(context, str);
                return true;
            } catch (Throwable th) {
                qrm.d(th);
                return false;
            }
        }
    }

    public static final class b {
        public static final String a = "RecordPref";
        public static final String b = "alipay_cashier_statistic_record";

        public static synchronized int a(Context context, String str) {
            qrm.f(a, "stat remove " + str);
            if (context != null && !TextUtils.isEmpty(str)) {
                a aVarB = b(context);
                if (aVarB.a.isEmpty()) {
                    return 0;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, String> entry : aVarB.a.entrySet()) {
                        if (str.equals(entry.getValue())) {
                            arrayList.add(entry.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        aVarB.a.remove((String) it.next());
                    }
                    d(context, aVarB);
                    return arrayList.size();
                } catch (Throwable th) {
                    qrm.d(th);
                    int size = aVarB.a.size();
                    d(context, new a());
                    return size;
                }
            }
            return 0;
        }

        public static synchronized a b(Context context) {
            try {
                String strB = a1n.b(null, context, b, null);
                if (TextUtils.isEmpty(strB)) {
                    return new a();
                }
                return new a(strB);
            } catch (Throwable th) {
                qrm.d(th);
                return new a();
            }
        }

        public static synchronized String c(Context context, String str, String str2) {
            qrm.f(a, "stat append " + str2 + " , " + str);
            if (context != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = UUID.randomUUID().toString();
                }
                a aVarB = b(context);
                if (aVarB.a.size() > 20) {
                    aVarB.a.clear();
                }
                aVarB.a.put(str2, str);
                d(context, aVarB);
                return str2;
            }
            return null;
        }

        public static synchronized void d(Context context, a aVar) {
            if (aVar == null) {
                try {
                    aVar = new a();
                } catch (Throwable th) {
                    qrm.d(th);
                }
            }
            a1n.c(null, context, b, aVar.a());
        }

        public static synchronized String e(Context context) {
            qrm.f(a, "stat peek");
            if (context == null) {
                return null;
            }
            a aVarB = b(context);
            if (aVarB.a.isEmpty()) {
                return null;
            }
            try {
                return aVarB.a.entrySet().iterator().next().getValue();
            } catch (Throwable th) {
                qrm.d(th);
                return null;
            }
        }

        public static final class a {
            public final LinkedHashMap<String, String> a = new LinkedHashMap<>();

            public a() {
            }

            public String a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th) {
                    qrm.d(th);
                    return new JSONArray().toString();
                }
            }

            public a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        this.a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th) {
                    qrm.d(th);
                }
            }
        }
    }

    public static final class c {
        public static final String a = "alipay_cashier_ap_seq_v";

        public static synchronized long a(Context context) {
            return d.a(context, a);
        }
    }

    public static final class d {
        public static synchronized long a(Context context, String str) {
            long j2;
            String strB;
            try {
                strB = a1n.b(null, context, str, null);
            } catch (Throwable unused) {
            }
            j2 = (!TextUtils.isEmpty(strB) ? Long.parseLong(strB) : 0L) + 1;
            try {
                a1n.c(null, context, str, Long.toString(j2));
            } catch (Throwable unused2) {
            }
            return j2;
        }
    }

    public static final class e {
        public static final String a = "alipay_cashier_statistic_v";

        public static synchronized long a(Context context) {
            return d.a(context, a);
        }
    }

    public static synchronized void a(Context context, qam qamVar, String str, String str2) {
        if (context == null || qamVar == null) {
            return;
        }
        try {
            b.c(context, qamVar.f15713l.e(str), str2);
        } catch (Throwable th) {
            qrm.d(th);
        }
    }

    public static void b(qam qamVar, String str, String str2) {
        if (qamVar == null) {
            return;
        }
        qamVar.f15713l.g(str, str2);
    }

    public static void c(qam qamVar, String str, String str2, String str3) {
        if (qamVar == null) {
            return;
        }
        qamVar.f15713l.h(str, str2, str3);
    }

    public static void d(qam qamVar, String str, String str2, Throwable th) {
        if (qamVar == null) {
            return;
        }
        qamVar.f15713l.i(str, str2, th);
    }

    public static void e(qam qamVar, String str, String str2, Throwable th, String str3) {
        if (qamVar == null) {
            return;
        }
        qamVar.f15713l.j(str, str2, th, str3);
    }

    public static void f(qam qamVar, String str, Throwable th) {
        if (qamVar == null || th == null) {
            return;
        }
        qamVar.f15713l.i(str, th.getClass().getSimpleName(), th);
    }

    public static synchronized void g(Context context, qam qamVar, String str, String str2) {
        if (context == null || qamVar == null) {
            return;
        }
        a.a(context, qamVar.f15713l, str, str2);
    }

    public static void h(qam qamVar, String str, String str2, String str3) {
        if (qamVar == null) {
            return;
        }
        qamVar.f15713l.n(str, str2, str3);
    }
}

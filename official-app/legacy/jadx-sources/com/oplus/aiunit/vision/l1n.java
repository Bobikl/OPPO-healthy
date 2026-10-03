package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class l1n {
    public Context a;
    public v0n b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13486c = true;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13487e = true;
    public boolean f = false;
    public List<String> g = new ArrayList();
    public n1n h = new n1n((byte) 0);
    public n1n i = new n1n();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d2n.d f13488j = new a();
    public d2n.d k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f13489l = null;
    public s3n m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s3n f13490n = null;

    public class a implements d2n.d {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.l1n$a$a, reason: collision with other inner class name */
        public class RunnableC0896a implements Runnable {
            public RunnableC0896a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                l1n.this.s(false);
            }
        }

        public a() {
        }

        @Override // com.oplus.aiunit.vision.d2n.d
        public final void a(int i) {
            if (i > 0 && l1n.b(l1n.this) != null) {
                ((m1n) l1n.this.p().f).f(i);
                l1n.i(l1n.this, "error", String.valueOf(((m1n) l1n.this.p().f).h()));
                l1n.b(l1n.this).postDelayed(new RunnableC0896a(), 660000L);
            }
        }
    }

    public class b implements d2n.d {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                l1n.this.v(false);
            }
        }

        public b() {
        }

        @Override // com.oplus.aiunit.vision.d2n.d
        public final void a(int i) {
            if (i <= 0) {
                return;
            }
            ((m1n) l1n.this.w().f).f(i);
            l1n.i(l1n.this, UTraceSQLiteHelperKt.COL_INFO, String.valueOf(((m1n) l1n.this.w().f).h()));
            if (l1n.b(l1n.this) == null) {
                return;
            }
            l1n.b(l1n.this).postDelayed(new a(), 660000L);
        }
    }

    public static class c {
        public static Map<String, l1n> a = new HashMap();
    }

    public l1n(v0n v0nVar) {
        this.b = v0nVar;
    }

    public static /* synthetic */ Handler b(l1n l1nVar) {
        Context context = l1nVar.a;
        if (context == null || context == null) {
            return null;
        }
        if (l1nVar.f13489l == null) {
            l1nVar.f13489l = new Handler(l1nVar.a.getMainLooper());
        }
        return l1nVar.f13489l;
    }

    public static l1n c(v0n v0nVar) {
        if (v0nVar == null || TextUtils.isEmpty(v0nVar.a())) {
            return null;
        }
        if (c.a.get(v0nVar.a()) == null) {
            c.a.put(v0nVar.a(), new l1n(v0nVar));
        }
        return c.a.get(v0nVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    public static String d(Context context, String str, v0n v0nVar) {
        String strD;
        if (context == null) {
            return null;
        }
        if (v0nVar != null) {
            try {
                if (TextUtils.isEmpty(v0nVar.a())) {
                    strD = "a";
                } else {
                    strD = t0n.d(v0nVar.a());
                }
            } catch (Throwable unused) {
                return null;
            }
        } else {
            strD = "a";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("EBDEC84EF205FEA2DF0719DEB822869E");
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append(strD);
        return sb.toString();
    }

    public static /* synthetic */ void i(l1n l1nVar, String str, String str2) {
        try {
            String str3 = new SimpleDateFormat("yyyyMMdd").format(new Date());
            o1n.a(l1nVar.b).d(l1nVar.a, "", "", str3 + str, str2);
        } catch (Throwable unused) {
        }
    }

    public final String A() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return d(context, "CB5E100E5A9A3E7F6D1FD97512215282", this.b);
    }

    public final long a(String str) {
        try {
            String str2 = new SimpleDateFormat("yyyyMMdd").format(new Date());
            return Long.parseLong(o1n.a(this.b).c(this.a, "", "", str2 + str));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final void e() {
        if (o()) {
            f(k1n.b);
            f(k1n.a);
        }
    }

    public final void f(int i) {
        Context context;
        n1n n1nVarL = l(i);
        String strD = k1n.d(n1nVarL.a());
        if (TextUtils.isEmpty(strD) || "[]".equals(strD) || (context = this.a) == null) {
            return;
        }
        d2n.h(context, this.b, k1n.c(i), q(i), strD);
        n1nVarL.d();
    }

    public final void g(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void h(k1n k1nVar) {
        if (o() && this.f13486c && k1n.e(k1nVar)) {
            boolean z = true;
            if (k1nVar != null) {
                List<String> list = this.g;
                if (list != null && list.size() != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= this.g.size()) {
                            z = false;
                            break;
                        } else if (!TextUtils.isEmpty(this.g.get(i)) && k1nVar.g().contains(this.g.get(i))) {
                            break;
                        } else {
                            i++;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return;
            }
            if (this.f13487e || k1nVar.a() != k1n.a) {
                n1n n1nVarL = l(k1nVar.a());
                if (n1nVarL.c(k1nVar.g())) {
                    String strD = k1n.d(n1nVarL.a());
                    if (this.a == null || TextUtils.isEmpty(strD) || "[]".equals(strD)) {
                        return;
                    }
                    d2n.h(this.a, this.b, k1nVar.i(), q(k1nVar.a()), strD);
                    n(false);
                    n1nVarL.d();
                }
                n1nVarL.b(k1nVar);
            }
        }
    }

    public final void j(boolean z) {
        if (o()) {
            n(z);
        }
    }

    public final void k(boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
        this.f13486c = z;
        this.d = z2;
        this.f13487e = z3;
        this.f = z4;
        this.g = list;
        t();
        y();
    }

    public final n1n l(int i) {
        return i == k1n.b ? this.i : this.h;
    }

    public final void n(boolean z) {
        s(z);
        v(z);
    }

    public final boolean o() {
        return this.a != null;
    }

    public final s3n p() {
        s3n s3nVar = this.f13490n;
        if (s3nVar != null) {
            return s3nVar;
        }
        t();
        return this.f13490n;
    }

    public final s3n q(int i) {
        if (i == k1n.b) {
            if (this.f13490n == null) {
                this.f13490n = p();
            }
            return this.f13490n;
        }
        if (this.m == null) {
            this.m = w();
        }
        return this.m;
    }

    public final void s(boolean z) {
        s3n s3nVarQ = q(k1n.b);
        if (z) {
            ((m1n) s3nVarQ.f).g(z);
        }
        Context context = this.a;
        if (context == null) {
            return;
        }
        d2n.i(context, s3nVarQ, this.f13488j);
    }

    public final s3n t() {
        if (this.a == null) {
            return null;
        }
        s3n s3nVar = new s3n();
        this.f13490n = s3nVar;
        s3nVar.a = A();
        s3n s3nVar2 = this.f13490n;
        s3nVar2.b = 512000000L;
        s3nVar2.d = 12500;
        s3nVar2.f16461c = "1";
        s3nVar2.h = -1;
        s3nVar2.i = "elkey";
        long jA = a("error");
        this.f13490n.f = new m1n(true, new n4n(this.a, this.d), jA, 10000000);
        s3n s3nVar3 = this.f13490n;
        s3nVar3.g = null;
        return s3nVar3;
    }

    public final void v(boolean z) {
        s3n s3nVarQ = q(k1n.a);
        if (z) {
            ((m1n) s3nVarQ.f).g(z);
        }
        Context context = this.a;
        if (context == null) {
            return;
        }
        d2n.i(context, s3nVarQ, this.k);
    }

    public final s3n w() {
        s3n s3nVar = this.m;
        if (s3nVar != null) {
            return s3nVar;
        }
        y();
        return this.m;
    }

    public final s3n y() {
        if (this.a == null) {
            return null;
        }
        s3n s3nVar = new s3n();
        this.m = s3nVar;
        s3nVar.a = z();
        s3n s3nVar2 = this.m;
        s3nVar2.b = 512000000L;
        s3nVar2.d = 12500;
        s3nVar2.f16461c = "1";
        s3nVar2.h = -1;
        s3nVar2.i = "inlkey";
        long jA = a(UTraceSQLiteHelperKt.COL_INFO);
        this.m.f = new m1n(this.f, new n4n(this.a, this.d), jA, 30000000);
        s3n s3nVar3 = this.m;
        s3nVar3.g = null;
        return s3nVar3;
    }

    public final String z() {
        Context context = this.a;
        if (context == null) {
            return null;
        }
        return d(context, "CAF9B6B99962BF5C2264824231D7A40C", this.b);
    }
}

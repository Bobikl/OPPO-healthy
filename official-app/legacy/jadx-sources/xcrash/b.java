package xcrash;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.oplus.aiunit.vision.fp;
import com.oplus.aiunit.vision.js9;
import com.oplus.aiunit.vision.ko9;
import com.oplus.aiunit.vision.qqk;
import com.oplus.aiunit.vision.vb7;
import com.oplus.aiunit.vision.y45;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static boolean a = false;
    public static String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f20855c;
    public static String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static js9 f20856e = new y45();
    public static String nativeLibDir = null;

    public static class a {
        public String a = null;
        public String b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20857c = 5000;
        public js9 d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20858e = 0;
        public int f = 128;
        public boolean g = true;
        public boolean h = true;
        public int i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f20859j = 50;
        public int k = 50;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f20860l = 200;
        public boolean m = true;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f20861n = true;
        public boolean o = true;
        public int p = 0;
        public String[] q = null;
        public ko9 r = null;
        public boolean s = true;
        public boolean t = true;
        public int u = 10;
        public int v = 50;
        public int w = 50;
        public int x = 200;
        public boolean y = true;
        public boolean z = true;
        public boolean A = true;
        public boolean B = true;
        public boolean C = true;
        public int D = 0;
        public String[] E = null;
        public ko9 F = null;
        public boolean G = true;
        public boolean H = true;
        public boolean I = true;
        public int J = 10;
        public int K = 50;
        public int L = 50;
        public int M = 200;
        public boolean N = true;
        public boolean O = true;
        public ko9 P = null;
        public ko9 Q = null;

        public a a() {
            this.G = false;
            return this;
        }

        public a b() {
            this.g = false;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }

        public a d(int i) {
            if (i < 0) {
                i = 0;
            }
            this.f20857c = i;
            return this;
        }

        public a e(ko9 ko9Var) {
            this.F = ko9Var;
            return this;
        }

        public a f(int i) {
            if (i < 0) {
                i = 0;
            }
            this.D = i;
            return this;
        }

        public a g(String[] strArr) {
            this.E = strArr;
            return this;
        }

        public a h(int i) {
            if (i < 1) {
                i = 1;
            }
            this.u = i;
            return this;
        }

        public a i(boolean z) {
            this.t = z;
            return this;
        }

        public a j(int i) {
            if (i < 0) {
                i = 0;
            }
            this.f20858e = i;
            return this;
        }

        public a k(int i) {
            if (i < 0) {
                i = 0;
            }
            this.f = i;
            return this;
        }
    }

    public static String a() {
        return b;
    }

    public static String b() {
        return f20855c;
    }

    public static js9 c() {
        return f20856e;
    }

    public static synchronized int d(Context context, a aVar) {
        String str;
        int iC;
        if (a) {
            return 0;
        }
        a = true;
        if (context == null) {
            return -1;
        }
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext != null ? applicationContext : context;
        a aVar2 = aVar == null ? new a() : aVar;
        js9 js9Var = aVar2.d;
        if (js9Var != null) {
            f20856e = js9Var;
        }
        String packageName = context2.getPackageName();
        b = packageName;
        if (TextUtils.isEmpty(packageName)) {
            b = "unknown";
        }
        if (TextUtils.isEmpty(aVar2.a)) {
            aVar2.a = qqk.d(context2);
        }
        f20855c = aVar2.a;
        nativeLibDir = context2.getApplicationInfo().nativeLibraryDir;
        if (TextUtils.isEmpty(aVar2.b)) {
            aVar2.b = context2.getFilesDir() + "/tombstones";
        }
        d = aVar2.b;
        int iMyPid = Process.myPid();
        if (aVar2.g || aVar2.G) {
            String strP = qqk.p(context2, iMyPid);
            if (aVar2.G && (TextUtils.isEmpty(strP) || !strP.equals(packageName))) {
                aVar2.G = false;
            }
            str = strP;
        } else {
            str = null;
        }
        vb7.l().n(aVar2.b, aVar2.i, aVar2.u, aVar2.J, aVar2.f20858e, aVar2.f, aVar2.f20857c);
        if ((aVar2.g || aVar2.s || aVar2.G) && (context2 instanceof Application)) {
            fp.d().e((Application) context2);
        }
        if (aVar2.g) {
            xcrash.a.c().g(iMyPid, str, b, aVar2.a, aVar2.b, aVar2.h, aVar2.f20859j, aVar2.k, aVar2.f20860l, aVar2.m, aVar2.f20861n, aVar2.o, aVar2.p, aVar2.q, aVar2.r);
        }
        boolean z = aVar2.G;
        if (aVar2.s || z) {
            iC = NativeHandler.a().c(context2, null, b, aVar2.a, aVar2.b, aVar2.s, aVar2.t, aVar2.v, aVar2.w, aVar2.x, aVar2.y, aVar2.z, aVar2.A, aVar2.B, aVar2.C, aVar2.D, aVar2.E, aVar2.F, aVar2.G, aVar2.H, aVar2.I, aVar2.K, aVar2.L, aVar2.M, aVar2.N, aVar2.O, aVar2.P, aVar2.Q);
        } else {
            iC = 0;
        }
        vb7.l().o();
        return iC;
    }

    public static void e(boolean z) {
        NativeHandler.a().e(z);
    }
}

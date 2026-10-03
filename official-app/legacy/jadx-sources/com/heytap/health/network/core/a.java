package com.heytap.health.network.core;

import android.content.Context;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.omas.omkms.api.SecKitClient;
import com.heytap.omas.omkms.data.EnvConfig;
import com.heytap.omas.omkms.data.InitParamSpec;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cd8;
import com.oplus.aiunit.vision.cuf;
import com.oplus.aiunit.vision.efd;
import com.oplus.aiunit.vision.evf;
import com.oplus.aiunit.vision.fn6;
import com.oplus.aiunit.vision.hk9;
import com.oplus.aiunit.vision.i9j;
import com.oplus.aiunit.vision.jea;
import com.oplus.aiunit.vision.joc;
import com.oplus.aiunit.vision.lc8;
import com.oplus.aiunit.vision.nu6;
import com.oplus.aiunit.vision.q0g;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.s2h;
import com.oplus.aiunit.vision.sh8;
import com.oplus.aiunit.vision.u3g;
import com.oplus.aiunit.vision.vo6;
import com.oplus.aiunit.vision.y80;
import com.oplus.aiunit.vision.zv8;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class a {
    public static final cuf EMPTY_BODY = cuf.o(null, "");
    public static volatile efd a;
    public static volatile efd b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile evf f5076c;
    public static volatile evf d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile evf f5077e;
    public static volatile evf f;
    public static volatile evf g;
    public static volatile efd h;
    public static volatile evf i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile efd f5078j;
    public static volatile evf k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile evf f5079l;
    public static volatile evf m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile evf f5080n;
    public static boolean o;

    /* JADX INFO: renamed from: com.heytap.health.network.core.a$a, reason: collision with other inner class name */
    public static final class C0485a {
        public static <T> T a(evf evfVar, Class<T> cls) {
            return (T) evfVar.b(cls);
        }
    }

    static {
        z();
        s();
        v();
        E();
        C();
        A();
        u();
        B();
        w();
        F();
        y();
        x();
        t();
        o = true;
    }

    public static void A() {
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new evf.b().d(zv8.PLATFORM_PATH).g(a).a(u3g.a()).b(lc8.a()).e();
                }
            }
        }
    }

    public static void B() {
        f = new evf.b().d(zv8.HOST).g(a).a(u3g.a()).b(lc8.a()).e();
    }

    public static void C() {
        if (f5076c == null) {
            synchronized (a.class) {
                if (f5076c == null) {
                    f5076c = new evf.b().d(zv8.API_PATH).g(a).a(u3g.b()).b(lc8.a()).e();
                }
            }
        }
    }

    public static void D(final Context context) {
        ThreadUtils.doInBackground("initSignRet", new Runnable() { // from class: com.oplus.aiunit.vision.ivf
            @Override // java.lang.Runnable
            public final void run() {
                com.heytap.health.network.core.a.H(context);
            }
        });
    }

    public static void E() {
        if (f5078j == null) {
            synchronized (a.class) {
                if (f5078j == null) {
                    f5078j = T();
                }
            }
        }
    }

    public static void F() {
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    i = new evf.b().d(zv8.API_PATH).g(f5078j).a(u3g.b()).b(lc8.a()).e();
                }
            }
        }
    }

    public static boolean G() {
        return o;
    }

    public static /* synthetic */ void H(Context context) {
        if (k == null) {
            synchronized (a.class) {
                if (k == null) {
                    SecKitClient secKitClient = new SecKitClient();
                    try {
                        secKitClient.init(context, InitParamSpec.newBuilder("sporthealth-server".getBytes()).setAccessKey(vo6.b(context, y80.OMAS_ACCESS_KEY).getBytes()).setWbId(vo6.b(context, y80.OMAS_WB_ID).getBytes()).setWbKeyId(vo6.b(context, y80.OMAS_WB_KEY_ID).getBytes()).setWbVersion(1).setSignMode(1).setEnvConfig((qe0.E() || qe0.x()) ? EnvConfig.RELEASE : EnvConfig.TEST).build());
                        k = new evf.b().d(zv8.API_PATH).g(S(context, secKitClient)).a(u3g.b()).b(lc8.a()).e();
                    } catch (Exception e2) {
                        a7b.c("RetrofitHelper", "initSecKitClient init error.", e2);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void I(String str) {
    }

    public static /* synthetic */ void J(String str) {
    }

    public static /* synthetic */ void K(String str) {
    }

    public static /* synthetic */ void L(String str) {
    }

    public static /* synthetic */ void M(String str) {
    }

    public static /* synthetic */ void N(String str) {
    }

    public static efd O() {
        efd.a aVar = new efd.a();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.a() { // from class: com.oplus.aiunit.vision.fvf
            @Override // com.heytap.health.network.core.HttpLoggingInterceptor.a
            public final void log(String str) {
                com.heytap.health.network.core.a.I(str);
            }
        });
        httpLoggingInterceptor.d(HttpLoggingInterceptor.Level.BODY);
        efd.a aVarA = aVar.a(httpLoggingInterceptor);
        efd.a aVarY = aVarA.a(new sh8()).a(new joc()).a(new i9j()).a(new hk9()).Y(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVarY.g(60L, timeUnit).b0(60L, timeUnit).X(60L, timeUnit);
        return aVarA.c();
    }

    public static efd P() {
        efd.a aVar = new efd.a();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.a() { // from class: com.oplus.aiunit.vision.jvf
            @Override // com.heytap.health.network.core.HttpLoggingInterceptor.a
            public final void log(String str) {
                com.heytap.health.network.core.a.J(str);
            }
        });
        httpLoggingInterceptor.d(HttpLoggingInterceptor.Level.BODY);
        efd.a aVarY = aVar.a(new q0g()).a(new nu6()).a(new sh8()).a(new joc()).a(httpLoggingInterceptor).a(new i9j()).a(new hk9()).Y(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return aVarY.g(20L, timeUnit).b0(20L, timeUnit).X(20L, timeUnit).c();
    }

    public static efd Q() {
        efd.a aVar = new efd.a();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.a() { // from class: com.oplus.aiunit.vision.kvf
            @Override // com.heytap.health.network.core.HttpLoggingInterceptor.a
            public final void log(String str) {
                com.heytap.health.network.core.a.K(str);
            }
        });
        httpLoggingInterceptor.d(HttpLoggingInterceptor.Level.BODY);
        efd.a aVarA = aVar.a(httpLoggingInterceptor);
        efd.a aVarY = aVarA.a(new sh8()).a(new cd8()).a(new joc()).a(new i9j()).a(new hk9()).Y(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVarY.g(20L, timeUnit).b0(20L, timeUnit).X(20L, timeUnit);
        return aVarA.c();
    }

    public static efd R(jea... jeaVarArr) {
        efd.a aVar = new efd.a();
        if (jeaVarArr != null) {
            for (jea jeaVar : jeaVarArr) {
                aVar.a(jeaVar);
            }
        }
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.a() { // from class: com.oplus.aiunit.vision.mvf
            @Override // com.heytap.health.network.core.HttpLoggingInterceptor.a
            public final void log(String str) {
                com.heytap.health.network.core.a.L(str);
            }
        });
        httpLoggingInterceptor.d(HttpLoggingInterceptor.Level.BODY);
        efd.a aVarY = aVar.a(new joc()).a(httpLoggingInterceptor).a(new i9j()).Y(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return aVarY.g(20L, timeUnit).b0(20L, timeUnit).X(20L, timeUnit).c();
    }

    public static efd S(Context context, SecKitClient secKitClient) {
        efd.a aVar = new efd.a();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.a() { // from class: com.oplus.aiunit.vision.lvf
            @Override // com.heytap.health.network.core.HttpLoggingInterceptor.a
            public final void log(String str) {
                com.heytap.health.network.core.a.M(str);
            }
        });
        httpLoggingInterceptor.d(HttpLoggingInterceptor.Level.BODY);
        efd.a aVarY = aVar.a(httpLoggingInterceptor).a(new sh8()).a(new s2h(context, secKitClient)).a(new cd8()).a(new joc()).a(new i9j()).a(new hk9()).Y(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return aVarY.g(20L, timeUnit).b0(20L, timeUnit).X(20L, timeUnit).c();
    }

    public static efd T() {
        efd.a aVar = new efd.a();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.a() { // from class: com.oplus.aiunit.vision.hvf
            @Override // com.heytap.health.network.core.HttpLoggingInterceptor.a
            public final void log(String str) {
                com.heytap.health.network.core.a.N(str);
            }
        });
        httpLoggingInterceptor.d(HttpLoggingInterceptor.Level.BODY);
        efd.a aVarY = aVar.a(new sh8()).a(new joc()).a(httpLoggingInterceptor).a(new i9j()).a(new hk9()).Y(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return aVarY.g(20L, timeUnit).b0(20L, timeUnit).X(20L, timeUnit).c();
    }

    public static <T> T h(Class<T> cls) {
        return (T) C0485a.a(f5080n, cls);
    }

    public static <T> T i(Class<T> cls) {
        return (T) C0485a.a(CacheRetrofitKt.e(), cls);
    }

    public static <T> T j(Class<T> cls) {
        return (T) C0485a.a(f5076c, cls);
    }

    public static <T> T k(Class<T> cls) {
        return (T) C0485a.a(i, cls);
    }

    public static <T> T l(Class<T> cls) {
        return (T) C0485a.a(f5077e, cls);
    }

    public static <T> T m(Class<T> cls) {
        return (T) C0485a.a(g, cls);
    }

    public static <T> T n(Class<T> cls) {
        return (T) C0485a.a(f5079l, cls);
    }

    public static <T> T o(Class<T> cls) {
        return (T) C0485a.a(m, cls);
    }

    public static efd p() {
        return a;
    }

    public static <T> T q(Class<T> cls) {
        return (T) C0485a.a(d, cls);
    }

    public static <T> T r(Class<T> cls) {
        return (T) C0485a.a(k, cls);
    }

    public static void s() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = O();
                }
            }
        }
    }

    public static void t() {
        f5080n = new evf.b().d(zv8.AI_HEALTH_AI_PATH).g(b).a(u3g.b()).b(lc8.a()).e();
    }

    public static void u() {
        f5077e = new evf.b().d(zv8.API_PATH).g(a).a(u3g.a()).b(fn6.a()).e();
    }

    public static void v() {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = P();
                }
            }
        }
    }

    public static void w() {
        if (g == null) {
            synchronized (a.class) {
                if (g == null) {
                    g = new evf.b().d(zv8.API_PATH).g(h).a(u3g.b()).b(lc8.a()).e();
                }
            }
        }
    }

    public static void x() {
        m = new evf.b().d(zv8.AI_HEALTH_ARCHIVES_PATH).g(a).a(u3g.b()).b(fn6.a()).e();
    }

    public static void y() {
        f5079l = new evf.b().d(zv8.AI_HEALTH_ARCHIVES_PATH).g(a).a(u3g.b()).b(lc8.a()).e();
    }

    public static void z() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = Q();
                }
            }
        }
    }
}

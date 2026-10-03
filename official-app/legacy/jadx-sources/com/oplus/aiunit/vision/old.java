package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class old {
    public static final String TAG = "OpenId";
    public static String a = "";
    public static String b = "";

    public class a implements d08<lbd<Throwable>, jdd<?>> {
        public int i;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ jdd c(Throwable th) throws Throwable {
            int i = this.i + 1;
            this.i = i;
            return i <= 3 ? lbd.b1(3L, TimeUnit.SECONDS) : lbd.O(th);
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public jdd<?> apply(lbd<Throwable> lbdVar) {
            return lbdVar.Q(new d08() { // from class: com.oplus.aiunit.vision.nld
                @Override // com.oplus.aiunit.vision.d08
                public final Object apply(Object obj) {
                    return this.i.c((Throwable) obj);
                }
            });
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        return "********************" + str.substring(length / 2, length);
    }

    public static lbd<Boolean> g(final Context context) {
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.kld
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                old.l(context, ccdVar);
            }
        }).Q(new d08() { // from class: com.oplus.aiunit.vision.lld
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return old.n(context, obj);
            }
        }).L0(su8.c());
    }

    public static String h() {
        return a;
    }

    public static String i() {
        return b;
    }

    @SuppressLint({"CheckResult"})
    public static void j(Context context) {
        g(context).b(new o14() { // from class: com.oplus.aiunit.vision.ild
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) {
                a7b.f("OpenId", "[init] --> health init openid finish");
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.jld
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                old.p((Throwable) obj);
            }
        });
    }

    public static void k(Context context) {
        poi.j(context);
        if (poi.k()) {
            String strG = poi.h(context) ? poi.g(context) : "";
            String strC = poi.c(context);
            q(strG);
            StringBuilder sb = new StringBuilder();
            sb.append("[init] -->  ouid=");
            sb.append(f(strG));
            sb.append(" auid=");
            sb.append(f(strC));
            poi.a(context);
            return;
        }
        a7b.m("OpenId", "[init] --> health init openid, not support");
        String strC2 = ilj.c();
        r(strC2);
        q(strC2);
        com.heytap.health.base.track.a.I(strC2);
        com.heytap.health.base.track.a.g(" duid= " + strC2);
    }

    public static /* synthetic */ void l(Context context, ccd ccdVar) throws Throwable {
        k(context);
        ccdVar.onNext(Boolean.TRUE);
        ccdVar.onComplete();
    }

    public static /* synthetic */ void m(Context context, ccd ccdVar) throws Throwable {
        String strC;
        if (poi.k()) {
            strC = poi.e(context);
            r(strC);
            if (TextUtils.isEmpty(strC)) {
                ccdVar.onError(new Throwable("duid is empty"));
                return;
            }
        } else {
            a7b.f("OpenId", "openId sdk not supported, set androidId to vaid");
            strC = ilj.c();
        }
        r(strC);
        StringBuilder sb = new StringBuilder();
        sb.append("[init] --> duid=");
        sb.append(f(i()));
        ccdVar.onNext(Boolean.TRUE);
        ccdVar.onComplete();
    }

    public static /* synthetic */ jdd n(final Context context, Object obj) throws Throwable {
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.mld
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                old.m(context, ccdVar);
            }
        }).D0(new a());
    }

    public static /* synthetic */ void p(Throwable th) throws Throwable {
        a7b.b("OpenId", "[init] --> health init openid fail, " + th.toString());
    }

    public static void q(String str) {
        if (!TextUtils.isEmpty(str)) {
            a = str;
        } else {
            a7b.f("OpenId", "[setOaid] --> oaid is empty");
            a = ilj.c();
        }
    }

    public static void r(String str) {
        if (!TextUtils.isEmpty(str)) {
            b = str;
        } else {
            a7b.f("OpenId", "[setVaid] --> vaid is empty");
            b = ilj.c();
        }
    }
}

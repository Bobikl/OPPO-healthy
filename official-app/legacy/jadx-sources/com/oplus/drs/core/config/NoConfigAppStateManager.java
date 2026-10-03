package com.oplus.drs.core.config;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.co3;
import com.oplus.aiunit.vision.opa;
import com.oplus.aiunit.vision.q7a;
import com.oplus.aiunit.vision.tpe;
import com.oplus.aiunit.vision.w56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.core.db.service.ConfigRepository;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class NoConfigAppStateManager {
    public final opa a;
    public final ConcurrentHashMap<String, Long> b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<String, a> f19703c = new ConcurrentHashMap<>();
    public final Object d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile ConfigRepository f19704e;

    public enum Mode {
        REALTIME_FALLBACK,
        NORMAL_FALLBACK,
        REVERT_TO_PENDING
    }

    public static final class a {
        public final boolean a;
        public final long b;

        public a(boolean z, long j2) {
            this.a = z;
            this.b = j2;
        }
    }

    public NoConfigAppStateManager(Context context, ConfigRepository configRepository) {
        this.a = tpe.h(context != null ? context.getApplicationContext() : w56.h(), "no_config_app_state");
        this.f19704e = configRepository;
        i();
    }

    public static String c(String str) {
        return str + "_first_seen_ms";
    }

    public static boolean f(String str) {
        return "149700".equals(str);
    }

    public q7a.b a(q7a.b bVar) {
        co3 co3Var;
        if (bVar == null || (co3Var = bVar.a) == null || bVar.b != 1) {
            return bVar;
        }
        String str = co3Var.i;
        if (f(str) || !e(str)) {
            return bVar;
        }
        Integer numG = g(co3Var.t);
        if (numG == null) {
            z6b.u("NoConfigAppState", "skip no-config fallback due to unsupported eventSource, appId=" + str + ", eventSource=" + co3Var.t + ", triplet=" + co3Var.a());
            return bVar;
        }
        Mode modeJ = j(str);
        if (modeJ == Mode.REVERT_TO_PENDING) {
            co3Var.b = 0L;
            co3Var.q = 1;
            co3Var.o = 0;
            co3Var.f10173n = 0;
            co3Var.m = 1;
            co3Var.t = numG.intValue();
            z6b.q("NoConfigAppState", "no-config fallback expired, revert to pending, appId=" + str);
            return bVar;
        }
        co3Var.b = 0L;
        co3Var.q = 0;
        co3Var.o = modeJ == Mode.REALTIME_FALLBACK ? 2 : 0;
        co3Var.f10173n = 0;
        co3Var.m = 1;
        co3Var.t = numG.intValue();
        z6b.q("NoConfigAppState", "apply no-config fallback, appId=" + str + ", mode=" + modeJ + ", uploadType=" + co3Var.o);
        return new q7a.b(co3Var, 0);
    }

    public void b(ConfigRepository configRepository) {
        if (configRepository != null) {
            this.f19704e = configRepository;
        }
    }

    public final long d(String str, long j2) {
        Long l2 = this.b.get(str);
        if (l2 != null && l2.longValue() > 0) {
            return l2.longValue();
        }
        synchronized (this.d) {
            Long l3 = this.b.get(str);
            if (l3 != null && l3.longValue() > 0) {
                return l3.longValue();
            }
            this.b.put(str, Long.valueOf(j2));
            this.a.putLong(c(str), j2);
            z6b.q("NoConfigAppState", "record first no-config time, appId=" + str + ", firstSeenMs=" + j2);
            return j2;
        }
    }

    public boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (f(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVar = this.f19703c.get(str);
        if (aVar != null && jCurrentTimeMillis <= aVar.b) {
            return aVar.a;
        }
        ConfigRepository configRepository = this.f19704e;
        if (configRepository != null) {
            boolean zQ = configRepository.q(str);
            this.f19703c.put(str, new a(zQ, jCurrentTimeMillis + 300000));
            return zQ;
        }
        z6b.u("NoConfigAppState", "isAppWithoutEventRules: configRepository not ready, appId=" + str);
        return false;
    }

    public final Integer g(int i) {
        if (i == 1 || i == 1) {
            return 1;
        }
        return (i == 2 || i == 2) ? 2 : null;
    }

    public void h(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.d) {
            for (String str : collection) {
                if (!TextUtils.isEmpty(str)) {
                    this.b.remove(str);
                    this.a.remove(c(str));
                    this.f19703c.put(str, new a(false, 300000 + jCurrentTimeMillis));
                }
            }
        }
        z6b.q("NoConfigAppState", "clear no-config state and mark has-rules, appIds=" + collection);
    }

    public final void i() {
        String[] strArrKeys = this.a.keys();
        if (strArrKeys == null || strArrKeys.length == 0) {
            return;
        }
        for (String str : strArrKeys) {
            if (!TextUtils.isEmpty(str) && str.endsWith("_first_seen_ms")) {
                String strSubstring = str.substring(0, str.length() - 14);
                if (!TextUtils.isEmpty(strSubstring)) {
                    long j2 = this.a.getLong(str, 0L);
                    if (j2 > 0) {
                        this.b.put(strSubstring, Long.valueOf(j2));
                    }
                }
            }
        }
        z6b.q("NoConfigAppState", "preload no-config firstSeen cache, size=" + this.b.size());
    }

    public Mode j(String str) {
        if (TextUtils.isEmpty(str)) {
            return Mode.REVERT_TO_PENDING;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jD = jCurrentTimeMillis - d(str, jCurrentTimeMillis);
        if (jD < 86400000) {
            return Mode.REALTIME_FALLBACK;
        }
        return jD < 604800000 ? Mode.NORMAL_FALLBACK : Mode.REVERT_TO_PENDING;
    }
}

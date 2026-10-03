package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.drs.core.db.service.ConfigRepository;

/* JADX INFO: loaded from: classes6.dex */
public class q7a {
    public static volatile a d;
    public final ConfigRepository a;
    public final d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f15660c;

    public static final class a {
        public final String a;
        public final long b;

        public a(String str, long j2) {
            this.a = str;
            this.b = j2;
        }
    }

    public static final class b {
        public final co3 a;
        public final int b;

        public b(co3 co3Var, int i) {
            this.a = co3Var;
            this.b = i;
        }
    }

    public interface c {
        void a(co3 co3Var, zs6 zs6Var, boolean z);
    }

    public interface d {
        Boolean a(co3 co3Var, int i);
    }

    public q7a(ConfigRepository configRepository, d dVar, c cVar) {
        if (configRepository == null) {
            throw new IllegalArgumentException("ConfigRepository must not be null for IngestLogic");
        }
        this.a = configRepository;
        this.b = dVar;
        this.f15660c = cVar;
    }

    public static String d() {
        a aVar = d;
        if (aVar != null && System.currentTimeMillis() <= aVar.b) {
            return aVar.a;
        }
        return null;
    }

    public static boolean e(String str, int i) {
        if (i >= 100000) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        return TextUtils.isEmpty(str) || Math.abs(((long) s8c.a(str)) % 100000) < ((long) i);
    }

    public static boolean f(int i) {
        return e(d(), i);
    }

    public static void h(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d = new a(str, System.currentTimeMillis() + 3600000);
    }

    public final void a(co3 co3Var, zs6 zs6Var) {
        int i = zs6Var.h;
        co3Var.o = i;
        co3Var.f10172l = zs6Var.f;
        co3Var.m = zs6Var.g;
        co3Var.f10173n = zs6Var.f19536e;
        co3Var.q = 0;
        co3Var.t = b(co3Var.t, i);
        if ("page_visit".equals(co3Var.f10171j) && co3Var.t == 2) {
            co3Var.t = 5;
        }
    }

    public final int b(int i, int i2) {
        boolean z = i2 == 4 || i2 == 5;
        boolean z2 = i == 1;
        if (z) {
            return z2 ? 3 : 4;
        }
        return z2 ? 1 : 2;
    }

    public final zs6 c(co3 co3Var) {
        if (TextUtils.isEmpty(co3Var.f10171j) || TextUtils.isEmpty(co3Var.k)) {
            return null;
        }
        return this.a.j(co3Var.i, co3Var.f10171j, co3Var.k);
    }

    public b g(co3 co3Var) {
        Boolean boolA;
        if (co3Var == null) {
            z6b.o("DRS-IngestLogic", "process: record is null");
            return new b(null, -1003);
        }
        z6b.k("DRS-IngestLogic", "ingest.process triplet, " + co3Var.a());
        if (co3Var.b == 865432) {
            z6b.q("DRS-IngestLogic", "ingest.reconciliation, triplet " + co3Var.a());
            co3Var.q = 0;
            co3Var.o = 0;
            if (co3Var.m == 0) {
                co3Var.m = 1;
            }
            return new b(co3Var, 0);
        }
        zs6 zs6VarC = c(co3Var);
        if (zs6VarC == null) {
            z6b.q("DRS-IngestLogic", "ingest.no_rule, triplet " + co3Var.a());
            co3Var.q = 1;
            co3Var.o = 0;
            return new b(co3Var, 1);
        }
        c cVar = this.f15660c;
        if (cVar != null) {
            cVar.a(co3Var, zs6VarC, true);
        }
        if (zs6VarC.i != 4) {
            z6b.u("DRS-IngestLogic", "ingest.rule_not_online_drop, triplet " + co3Var.a() + ", status=" + zs6VarC.i);
            return new b(null, -1001);
        }
        if (co3Var.b <= 0) {
            long j2 = zs6VarC.b;
            if (j2 > 0) {
                co3Var.b = j2;
            }
        }
        if (TextUtils.isEmpty(co3Var.u)) {
            String strD = d();
            if (!TextUtils.isEmpty(strD)) {
                co3Var.u = strD;
            }
        } else {
            h(co3Var.u);
        }
        try {
            d dVar = this.b;
            boolA = dVar != null ? dVar.a(co3Var, zs6VarC.f19537j) : null;
        } catch (Throwable unused) {
        }
        if (!(boolA != null ? boolA.booleanValue() : e(co3Var.u, zs6VarC.f19537j))) {
            z6b.k("DRS-IngestLogic", "ingest.sampled_out, triplet " + co3Var.a());
            return new b(null, -1002);
        }
        a(co3Var, zs6VarC);
        c cVar2 = this.f15660c;
        if (cVar2 != null) {
            cVar2.a(co3Var, zs6VarC, false);
        }
        z6b.k("DRS-IngestLogic", "ingest.accepted, triplet " + co3Var.a());
        return new b(co3Var, 0);
    }
}

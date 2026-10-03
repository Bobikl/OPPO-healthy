package com.oplus.aiunit.vision;

import com.oplus.drs.base.util.Supplier;
import com.oplus.drs.core.ingest.step.StepResult;
import com.oplus.drs.core.ratelimit.QuotaCheckResult;
import com.oplus.drs.core.ratelimit.QuotaType;
import com.oplus.drs.core.reconciliation.FlowControlReason;
import com.oplus.drs.core.reconciliation.ValidationReason;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class u15 extends i41 {
    public final com.oplus.drs.core.db.service.a a;
    public final qaf b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Supplier<com.oplus.drs.core.db.service.a.n> f17248c;

    public u15(com.oplus.drs.core.db.service.a aVar, qaf qafVar, Supplier<com.oplus.drs.core.db.service.a.n> supplier) {
        this.a = aVar;
        this.b = qafVar;
        this.f17248c = supplier;
    }

    public static void c(agf agfVar, List<co3> list) {
        String str;
        if (list == null) {
            return;
        }
        for (co3 co3Var : list) {
            if (co3Var != null && (str = co3Var.i) != null) {
                agfVar.a(str, co3Var.p, 1);
            }
        }
    }

    public static void d(agf agfVar, List<co3> list) {
        String str;
        if (list == null) {
            return;
        }
        for (co3 co3Var : list) {
            if (co3Var != null && (str = co3Var.i) != null) {
                agfVar.e(str, co3Var.p, 1, ValidationReason.OTHER.getCode());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.i41
    public StepResult b(p7a p7aVar) {
        if (this.a != null) {
            i(p7aVar);
            if (!p7aVar.f15230e.isEmpty() || !p7aVar.f.isEmpty()) {
                k(p7aVar);
                e(p7aVar);
                return StepResult.b("done");
            }
            e(p7aVar);
            agf agfVar = p7aVar.q;
            if (agfVar != null) {
                agfVar.f();
            }
            return StepResult.b("no_records");
        }
        z6b.o("DbIngestStep", "ingestRepository is null, recording as validation_failed");
        if (!p7aVar.e()) {
            Iterator<sga> it = p7aVar.b.iterator();
            while (it.hasNext()) {
                co3 co3Var = p7aVar.d.get(it.next().C());
                if (co3Var != null) {
                    agf agfVar2 = p7aVar.q;
                    if (agfVar2 != null) {
                        agfVar2.e(co3Var.i, co3Var.p, 1, ValidationReason.OTHER.getCode());
                    } else {
                        cgf.j(Collections.singletonList(co3Var));
                    }
                }
            }
        }
        e(p7aVar);
        agf agfVar3 = p7aVar.q;
        if (agfVar3 != null) {
            agfVar3.f();
        }
        return StepResult.a("no_ingest_repo");
    }

    public final void e(p7a p7aVar) {
        if (p7aVar.e()) {
            return;
        }
        Iterator<sga> it = p7aVar.b.iterator();
        while (it.hasNext()) {
            p7aVar.c(it.next());
        }
        p7aVar.b.clear();
    }

    public final void f(com.oplus.drs.core.db.service.a.n nVar, boolean z, boolean z2) {
        if (nVar == null) {
            return;
        }
        if (z) {
            nVar.a(2);
        } else if (z2) {
            nVar.a(1);
        }
    }

    public final void g(p7a p7aVar) {
        if (p7aVar.d.isEmpty()) {
            return;
        }
        String str = null;
        long j2 = 0;
        for (co3 co3Var : p7aVar.d.values()) {
            if (co3Var != null) {
                j2 += (long) co3Var.v;
                if (str == null) {
                    str = co3Var.i;
                }
            }
        }
        qaf qafVar = this.b;
        if (qafVar != null && j2 > 0 && str != null) {
            QuotaCheckResult quotaCheckResultG = qafVar.g(str, j2);
            if (!quotaCheckResultG.d()) {
                this.b.w(str, QuotaType.INGEST, j2, p7aVar.d.size());
                QuotaCheckResult.Status status = quotaCheckResultG.a;
                QuotaCheckResult.Status status2 = QuotaCheckResult.Status.APP_EXCEEDED;
                int code = status == status2 ? FlowControlReason.QUOTA_APP_EXCEEDED.getCode() : FlowControlReason.QUOTA_GLOBAL_EXCEEDED.getCode();
                agf agfVar = p7aVar.q;
                if (agfVar != null) {
                    agfVar.c(str, System.currentTimeMillis(), 1, code);
                } else if (quotaCheckResultG.a == status2) {
                    cgf.l(str, System.currentTimeMillis());
                } else {
                    cgf.n(str, System.currentTimeMillis());
                }
                p7aVar.d.clear();
                return;
            }
            this.b.x(str, j2);
        }
        Iterator<co3> it = p7aVar.d.values().iterator();
        while (it.hasNext()) {
            j(p7aVar, it.next());
        }
    }

    public final void h(p7a p7aVar) {
        if (p7aVar.b.isEmpty()) {
            return;
        }
        Iterator<sga> it = p7aVar.b.iterator();
        String str = null;
        long j2 = 0;
        while (it.hasNext()) {
            co3 co3Var = p7aVar.d.get(it.next().C());
            if (co3Var != null) {
                j2 += (long) co3Var.v;
                if (str == null) {
                    str = co3Var.i;
                }
            }
        }
        qaf qafVar = this.b;
        if (qafVar != null && j2 > 0 && str != null) {
            QuotaCheckResult quotaCheckResultG = qafVar.g(str, j2);
            if (!quotaCheckResultG.d()) {
                String str2 = quotaCheckResultG.b;
                if (str2 == null) {
                    str2 = "quota_exceeded";
                }
                long j3 = p7aVar.p;
                long jCurrentTimeMillis = j3 > 0 ? j3 : System.currentTimeMillis();
                QuotaCheckResult.Status status = quotaCheckResultG.a;
                QuotaCheckResult.Status status2 = QuotaCheckResult.Status.APP_EXCEEDED;
                int code = status == status2 ? FlowControlReason.QUOTA_APP_EXCEEDED.getCode() : FlowControlReason.QUOTA_GLOBAL_EXCEEDED.getCode();
                agf agfVar = p7aVar.q;
                if (agfVar != null) {
                    agfVar.c(str, jCurrentTimeMillis, 1, code);
                } else if (quotaCheckResultG.a == status2) {
                    cgf.l(str, jCurrentTimeMillis);
                } else {
                    cgf.n(str, jCurrentTimeMillis);
                }
                Iterator<sga> it2 = p7aVar.b.iterator();
                while (it2.hasNext()) {
                    p7aVar.b(it2.next(), 602, str2);
                }
                p7aVar.b.clear();
                p7aVar.d.clear();
                return;
            }
            this.b.x(str, j2);
        }
        Iterator<sga> it3 = p7aVar.b.iterator();
        while (it3.hasNext()) {
            sga next = it3.next();
            co3 co3Var2 = p7aVar.d.get(next.C());
            if (co3Var2 == null) {
                agf agfVar2 = p7aVar.q;
                if (agfVar2 != null) {
                    agfVar2.e(next.a(), next.p(), 1, ValidationReason.OTHER.getCode());
                } else {
                    dgf.k(next, "OTHER");
                }
                p7aVar.c(next);
                it3.remove();
            } else {
                j(p7aVar, co3Var2);
            }
        }
    }

    public final void i(p7a p7aVar) {
        if (p7aVar.e()) {
            g(p7aVar);
        } else {
            h(p7aVar);
        }
    }

    public final void j(p7a p7aVar, co3 co3Var) {
        int i = co3Var.o;
        if (i != 2) {
            if (i != 1) {
                p7aVar.f.add(co3Var);
                return;
            } else {
                p7aVar.f15230e.add(co3Var);
                p7aVar.k = true;
                return;
            }
        }
        p7aVar.f15230e.add(co3Var);
        p7aVar.f15231j = true;
        String str = co3Var.i;
        if (str != null) {
            p7aVar.i.add(str);
        }
    }

    public final void k(p7a p7aVar) {
        int iL;
        Supplier<com.oplus.drs.core.db.service.a.n> supplier = this.f17248c;
        com.oplus.drs.core.db.service.a.n nVar = supplier != null ? supplier.get() : null;
        if (!p7aVar.f15230e.isEmpty()) {
            try {
                z6b.q("DbIngestStep", "inline rt write: size=" + p7aVar.f15230e.size() + ", inserted=" + this.a.m(p7aVar.f15230e));
                agf agfVar = p7aVar.q;
                if (agfVar != null) {
                    c(agfVar, p7aVar.f15230e);
                } else {
                    cgf.g(p7aVar.f15230e);
                }
                f(nVar, p7aVar.f15231j, p7aVar.k);
            } catch (Exception e2) {
                z6b.p("DbIngestStep", "inline rt write error", e2);
                agf agfVar2 = p7aVar.q;
                if (agfVar2 != null) {
                    d(agfVar2, p7aVar.f15230e);
                } else {
                    cgf.j(p7aVar.f15230e);
                }
            }
        }
        if (!p7aVar.f.isEmpty()) {
            try {
                synchronized (e25.a()) {
                    iL = this.a.l(p7aVar.f);
                }
                z6b.q("DbIngestStep", "inline nr write: size=" + p7aVar.f.size() + ", inserted=" + iL);
                agf agfVar3 = p7aVar.q;
                if (agfVar3 != null) {
                    c(agfVar3, p7aVar.f);
                } else {
                    cgf.g(p7aVar.f);
                }
            } catch (Exception e3) {
                z6b.p("DbIngestStep", "inline nr write error", e3);
                agf agfVar4 = p7aVar.q;
                if (agfVar4 != null) {
                    d(agfVar4, p7aVar.f);
                } else {
                    cgf.j(p7aVar.f);
                }
            }
        }
        agf agfVar5 = p7aVar.q;
        if (agfVar5 != null) {
            agfVar5.f();
        }
    }

    @Override // com.oplus.aiunit.vision.u7a
    public String name() {
        return "DbIngest";
    }
}

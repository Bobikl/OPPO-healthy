package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.drs.core.db.service.ConfigRepository;
import com.oplus.drs.core.ingest.step.StepResult;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cv1 extends i41 {
    public final ConfigRepository a;

    public cv1(ConfigRepository configRepository) {
        this.a = configRepository;
    }

    @Override // com.oplus.aiunit.vision.i41
    public StepResult b(p7a p7aVar) {
        if (this.a != null) {
            return p7aVar.e() ? e(p7aVar) : f(p7aVar);
        }
        z6b.u("BodyEncryptStep", "configRepository is null, skip encryption");
        return StepResult.c();
    }

    public final void c(p7a p7aVar, Iterator<sga> it, sga sgaVar) {
        it.remove();
        p7aVar.d.remove(sgaVar.C());
        dgf.k(sgaVar, "ENCRYPTION_ERROR");
    }

    public final void d(p7a p7aVar, Iterator<sga> it, sga sgaVar) {
        it.remove();
        p7aVar.d.remove(sgaVar.C());
        dgf.k(sgaVar, "MISSING_REQUIRED_FIELD");
    }

    public final StepResult e(p7a p7aVar) {
        Iterator<Map.Entry<String, co3>> it = p7aVar.d.entrySet().iterator();
        while (it.hasNext()) {
            co3 value = it.next().getValue();
            if (value.g == null && value.f != null) {
                zb0 zb0VarI = this.a.i(value.i);
                if (zb0VarI == null || TextUtils.isEmpty(zb0VarI.c())) {
                    z6b.u("BodyEncryptStep", "missing secret for appId=" + value.i);
                    it.remove();
                } else {
                    try {
                        value.g = pe4.b(value.f.getBytes(StandardCharsets.UTF_8), zb0VarI.c());
                        value.f = null;
                    } catch (Exception e2) {
                        z6b.p("BodyEncryptStep", "encrypt error, appId=" + value.i, e2);
                        it.remove();
                    }
                }
            }
        }
        return p7aVar.d.isEmpty() ? StepResult.b("all_dropped_by_encrypt") : StepResult.c();
    }

    public final StepResult f(p7a p7aVar) {
        Iterator<sga> it = p7aVar.b.iterator();
        while (it.hasNext()) {
            sga next = it.next();
            co3 co3Var = p7aVar.d.get(next.C());
            if (co3Var != null && co3Var.g == null && co3Var.f != null) {
                zb0 zb0VarI = this.a.i(co3Var.i);
                if (zb0VarI == null || TextUtils.isEmpty(zb0VarI.c())) {
                    d(p7aVar, it, next);
                } else {
                    try {
                        co3Var.g = pe4.b(co3Var.f.getBytes(StandardCharsets.UTF_8), zb0VarI.c());
                        co3Var.f = null;
                    } catch (Exception e2) {
                        z6b.p("BodyEncryptStep", "encrypt error, appId=" + co3Var.i, e2);
                        c(p7aVar, it, next);
                    }
                }
            }
        }
        return p7aVar.b.isEmpty() ? StepResult.b("all_dropped_by_encrypt") : StepResult.c();
    }

    @Override // com.oplus.aiunit.vision.u7a
    public String name() {
        return "BodyEncrypt";
    }
}

package com.oplus.aiunit.vision;

import com.oplus.drs.core.ingest.step.StepResult;

/* JADX INFO: loaded from: classes6.dex */
public final class bj8 extends i41 {
    public final ni8 a;

    public bj8(ni8 ni8Var) {
        this.a = ni8Var;
    }

    @Override // com.oplus.aiunit.vision.i41
    public StepResult b(p7a p7aVar) {
        if (this.a == null) {
            z6b.u("HeaderProcessStep", "headerLogic is null, skip header processing");
            return StepResult.c();
        }
        for (co3 co3Var : p7aVar.d.values()) {
            try {
                this.a.g(co3Var);
            } catch (Exception e2) {
                z6b.p("HeaderProcessStep", "processForWrite error, appId=" + co3Var.i, e2);
            }
        }
        return StepResult.c();
    }

    @Override // com.oplus.aiunit.vision.u7a
    public String name() {
        return "HeaderProcess";
    }
}

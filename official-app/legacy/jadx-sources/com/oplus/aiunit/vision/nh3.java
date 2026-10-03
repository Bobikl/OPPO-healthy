package com.oplus.aiunit.vision;

import com.heytap.health.operation.medal.core.Utils;
import com.heytap.health.operations.bean.MedalListBean;

/* JADX INFO: loaded from: classes17.dex */
public class nh3 extends j61 {
    @Override // com.oplus.aiunit.vision.hea
    public void a() {
        MedalListBean medalListBeanN = n();
        oqb.a(this.a, "check cloud medal > ", medalListBeanN);
        if (medalListBeanN.getFlag() == 1) {
            if (medalListBeanN.getAckStatus() != 0) {
                oqb.c(this.a, "check cloud medal > medal is checked by cloud");
            } else if (ax7.j().k()) {
                this.f12766e.add(Utils.i(medalListBeanN, 0L, 1, 0));
                this.d.add(medalListBeanN);
                t();
            } else {
                a7b.f(this.a, "MedalNotificationHelper");
                new pqb(b78.a(), medalListBeanN.getName());
            }
        }
        j(this.f12766e, this.d);
    }

    @Override // com.oplus.aiunit.vision.j61
    public String p() {
        return "Cloud";
    }

    @Override // com.oplus.aiunit.vision.j61
    public void v() {
        e(krb.CMESTEPRANKING, false);
    }
}

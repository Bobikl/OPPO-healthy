package com.oplus.aiunit.vision;

import com.heytap.health.operation.medal.core.Utils;
import com.heytap.health.operations.bean.MedalListBean;

/* JADX INFO: loaded from: classes17.dex */
public class co extends j61 {
    @Override // com.oplus.aiunit.vision.hea
    public void a() {
        MedalListBean medalListBeanN = n();
        int iE = Utils.e(medalListBeanN.getCode());
        float fI = krb.i(v9g.x(krb.e()).D(krb.ALL_BONES));
        if (fI >= iE) {
            if (Utils.a(medalListBeanN)) {
                this.f12766e.add(Utils.f(medalListBeanN, (long) fI, 1, 0));
                this.d.add(medalListBeanN);
            }
            t();
        }
        medalListBeanN.setProgress("");
        j(this.f12766e, this.d);
    }

    @Override // com.oplus.aiunit.vision.j61
    public String p() {
        return "ActTotalBouns";
    }

    @Override // com.oplus.aiunit.vision.j61
    public void v() {
        d(krb.CMEALLACTBONUS);
    }
}

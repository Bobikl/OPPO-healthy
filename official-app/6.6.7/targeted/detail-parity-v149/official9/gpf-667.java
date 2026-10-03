package com.oplus.aiunit.vision;

import com.heytap.health.relax.bean.RelaxDayBean;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class gpf extends fr8<RelaxDayBean> {
    public gpf(int i, long j2, dr8 dr8Var) {
        super(i, j2, dr8Var);
    }

    @Override // com.oplus.aiunit.vision.fr8
    public void j() {
        if (this.f12931n.size() > 0) {
            RelaxDayBean relaxDayBean = (RelaxDayBean) this.f12931n.get(0);
            if (relaxDayBean.isUndue()) {
                spf.a("RelaxDayPaging", "restore first data");
                relaxDayBean.setStyle(0);
            }
            List<T> list = this.f12931n;
            RelaxDayBean relaxDayBean2 = (RelaxDayBean) list.get(list.size() - 1);
            if (relaxDayBean2.isUndue()) {
                spf.a("RelaxDayPaging", "restore end data");
                relaxDayBean2.setStyle(0);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.fr8
    public void p() {
        if (!this.p) {
            spf.a("RelaxDayPaging", "add left loading data bean");
            ((RelaxDayBean) this.f12931n.get(0)).setStyle(1);
        }
        if (this.q || this.f12931n.size() < 30) {
            return;
        }
        spf.a("RelaxDayPaging", "add right loading data bean");
        List<T> list = this.f12931n;
        ((RelaxDayBean) list.get(list.size() - 1)).setStyle(1);
    }
}
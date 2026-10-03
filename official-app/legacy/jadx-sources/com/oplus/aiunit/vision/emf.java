package com.oplus.aiunit.vision;

import com.heytap.health.relax.bean.RelaxDayBean;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class emf extends cq8<RelaxDayBean> {
    public emf(int i, long j2, aq8 aq8Var) {
        super(i, j2, aq8Var);
    }

    @Override // com.oplus.aiunit.vision.cq8
    public void j() {
        if (this.f10197n.size() > 0) {
            RelaxDayBean relaxDayBean = (RelaxDayBean) this.f10197n.get(0);
            if (relaxDayBean.isUndue()) {
                qmf.a("RelaxDayPaging", "restore first data");
                relaxDayBean.setStyle(0);
            }
            List<T> list = this.f10197n;
            RelaxDayBean relaxDayBean2 = (RelaxDayBean) list.get(list.size() - 1);
            if (relaxDayBean2.isUndue()) {
                qmf.a("RelaxDayPaging", "restore end data");
                relaxDayBean2.setStyle(0);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cq8
    public void p() {
        if (!this.p) {
            qmf.a("RelaxDayPaging", "add left loading data bean");
            ((RelaxDayBean) this.f10197n.get(0)).setStyle(1);
        }
        if (this.q || this.f10197n.size() < 30) {
            return;
        }
        qmf.a("RelaxDayPaging", "add right loading data bean");
        List<T> list = this.f10197n;
        ((RelaxDayBean) list.get(list.size() - 1)).setStyle(1);
    }
}

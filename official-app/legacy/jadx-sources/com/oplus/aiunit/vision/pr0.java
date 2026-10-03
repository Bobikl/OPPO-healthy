package com.oplus.aiunit.vision;

import com.heytap.health.operation.medal.core.Utils;
import com.heytap.health.operations.bean.MedalListBean;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class pr0 extends j61 {
    public boolean g;

    public pr0(boolean z) {
        this.g = z;
    }

    @Override // com.oplus.aiunit.vision.hea
    public void a() {
        if (!(this.g || ax7.j().k())) {
            a7b.f(this.a, "skip BackGroundGetMedalShow");
            return;
        }
        List<MedalListBean> listD = Utils.d();
        a7b.f(this.a, "BackGroundGetMedalShow > getBgGetMedals: " + listD);
        this.d.addAll(listD);
        Utils.c();
    }

    @Override // com.oplus.aiunit.vision.j61
    public String p() {
        return "BackGroundGetMedalShow";
    }

    @Override // com.oplus.aiunit.vision.j61
    public void v() {
    }
}

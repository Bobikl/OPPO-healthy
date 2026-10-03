package com.oplus.aiunit.vision;

import java.util.HashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ngm extends kt2 {
    public kt2 a;

    @Override // com.oplus.aiunit.vision.kt2
    public void a(kt2.a aVar) {
        if (1 != aVar.a()) {
            HashMap map = new HashMap();
            map.put("failMsg", aVar.b());
            ogm.b().a().onStat(map);
        }
        y4n.c("router_response", aVar.toString());
        kt2 kt2Var = this.a;
        if (kt2Var != null) {
            kt2Var.a(aVar);
            this.a = null;
        }
    }

    public void c(kt2 kt2Var) {
        if (kt2Var == null) {
            kt2Var = new omm();
        }
        this.a = kt2Var;
    }
}

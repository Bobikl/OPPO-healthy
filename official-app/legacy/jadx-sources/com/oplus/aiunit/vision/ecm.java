package com.oplus.aiunit.vision;

import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class ecm extends ws2 {
    public ws2 a;

    @Override // com.oplus.aiunit.vision.ws2
    public void a(ws2.a aVar) {
        if (1 != aVar.a()) {
            HashMap map = new HashMap();
            map.put("failMsg", aVar.b());
            gcm.b().a().onStat(map);
        }
        xzm.c("router_response", aVar.toString());
        ws2 ws2Var = this.a;
        if (ws2Var != null) {
            ws2Var.a(aVar);
            this.a = null;
        }
    }

    public void c(ws2 ws2Var) {
        if (ws2Var == null) {
            ws2Var = new gim();
        }
        this.a = ws2Var;
    }
}

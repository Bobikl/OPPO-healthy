package com.oplus.instant.router.callback;

import com.oplus.aiunit.vision.epm;
import com.oplus.aiunit.vision.kbm;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class a extends Callback {
    public Callback a;

    public void a(Callback callback) {
        if (callback == null) {
            callback = new b();
        }
        this.a = callback;
    }

    @Override // com.oplus.instant.router.callback.Callback
    public void onResponse(Callback.Response response) {
        if (1 != response.getCode()) {
            HashMap map = new HashMap();
            map.put("failMsg", response.getMsg());
            kbm.c().a().onStat(map);
        }
        epm.f("router_response", response.toString());
        Callback callback = this.a;
        if (callback != null) {
            callback.onResponse(response);
            this.a = null;
        }
    }
}

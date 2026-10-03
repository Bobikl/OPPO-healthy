package com.heytap.health.utils;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.utils.IShortCutService;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.w1h;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/app/ShortCutServiceImpl")
public class ShortCutServiceImpl implements IShortCutService {
    @Override // com.heytap.health.base.utils.IShortCutService
    public void X0() {
        w1h.h(b78.a());
    }

    @Override // com.heytap.health.base.utils.IShortCutService
    public void X1() {
        w1h.f();
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }
}

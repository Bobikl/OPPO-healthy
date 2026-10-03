package com.oplus.pay.opensdk.chain;

import android.content.Context;
import android.content.Intent;
import com.oplus.aiunit.vision.pce;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.utils.Resource;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class b implements g {
    @Override // com.oplus.pay.opensdk.chain.g
    public void a(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2) {
        pce.b("CheckEnd");
        aVar2.a(resource);
    }
}

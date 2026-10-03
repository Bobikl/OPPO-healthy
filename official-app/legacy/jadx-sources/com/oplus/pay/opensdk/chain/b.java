package com.oplus.pay.opensdk.chain;

import android.content.Context;
import android.content.Intent;
import com.oplus.aiunit.vision.qae;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.utils.Resource;

/* JADX INFO: loaded from: classes8.dex */
public class b implements g {
    @Override // com.oplus.pay.opensdk.chain.g
    public void a(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2) {
        qae.b("CheckEnd");
        aVar2.a(resource);
    }
}

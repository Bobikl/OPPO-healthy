package com.oplus.pay.opensdk.chain;

import android.content.Context;
import android.content.Intent;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.utils.Resource;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface g {

    public interface a {
        void a(Resource<Intent> resource);
    }

    void a(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, com.oplus.pay.opensdk.chain.a aVar, a aVar2);
}

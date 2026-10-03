package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.wearable.watch.finddevice.third.bean.FindWatchStatus;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class re7 {
    public static xr2<BaseResponse<FindWatchStatus>> a(String str, at2<BaseResponse<FindWatchStatus>> at2Var) {
        HashMap map = new HashMap(1);
        map.put("imei", str);
        xr2<BaseResponse<FindWatchStatus>> xr2VarA = ((uf7) com.heytap.health.network.core.a.j(uf7.class)).a(map);
        xr2VarA.h(at2Var);
        return xr2VarA;
    }
}

package com.oplus.aiunit.vision;

import com.heytap.health.network.core.BaseResponse;
import com.heytap.wearable.watch.finddevice.third.bean.FindWatchStatus;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface uf7 {
    @m1e("v1/c2s/third/phone/queryThirdPartyPhoneFindWatchStatus")
    xr2<BaseResponse<FindWatchStatus>> a(@av1 Map<String, Object> map);
}

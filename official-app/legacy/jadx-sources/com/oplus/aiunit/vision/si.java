package com.oplus.aiunit.vision;

import com.oplus.account.netrequest.annotation.AcNeedEncrypt;
import com.oplus.accountsdk.base.account.refresh.api.bean.AcRefreshTokenRequest;
import com.oplus.accountsdk.base.account.refresh.api.bean.AcRefreshTokenResponse;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface si {
    @AcNeedEncrypt
    @m1e("authorization/v1/token/refresh")
    xr2<AcSdkNetResponse<AcRefreshTokenResponse, Object>> a(@oi8 Map<String, String> map, @av1 AcRefreshTokenRequest acRefreshTokenRequest);
}

package com.oplus.aiunit.vision;

import com.oplus.account.netrequest.annotation.AcNeedEncrypt;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.service.account.net.beans.AcCheckUpgradeRequest;
import com.oplus.accountsdk.service.account.net.beans.AcCheckUpgradeResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public interface f8 {
    @AcNeedEncrypt(version = "v1")
    @m1e("uc/v1/verification/check-upgrade")
    xr2<AcSdkNetResponse<AcCheckUpgradeResponse, Object>> a(@oi8 Map<String, String> map, @av1 AcCheckUpgradeRequest acCheckUpgradeRequest);
}

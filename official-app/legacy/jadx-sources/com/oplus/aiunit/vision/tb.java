package com.oplus.aiunit.vision;

import com.oplus.account.netrequest.annotation.AcNeedEncrypt;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;

/* JADX INFO: loaded from: classes19.dex */
public interface tb {
    @AcNeedEncrypt
    @m1e("/uc/v1/profile/sdk/basic-info")
    xr2<AcSdkNetResponse<AcAccountInfo, Object>> a(@yh8(AcBaseConstants.a.HEADER_X_TOKEN) String str);
}

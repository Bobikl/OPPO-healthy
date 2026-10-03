package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.account.trace.bean.AcTraceConfigRequest;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceConfigResponse;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceUploadBean;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;

/* JADX INFO: loaded from: classes6.dex */
public interface rk {
    @m1e("/track/v1/config")
    xr2<AcSdkNetResponse<AcTraceConfigResponse, Object>> a(@yh8(AcBaseConstants.a.X_SYS_DUID) String str, @av1 AcTraceConfigRequest acTraceConfigRequest);

    @m1e("/track/v1/track")
    xr2<AcSdkNetResponse<String, Object>> b(@yh8(n8.DYNAMIC_HOST_HEADER) String str, @av1 AcTraceUploadBean acTraceUploadBean);
}

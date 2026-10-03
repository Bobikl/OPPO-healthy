package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.net.bean.AcOpenLogoutRequest;
import com.oplus.accountsdk.open.core.trace.AcOpenCoreSourceInfo;
import com.oplus.accountsdk.open.core.utils.AcOpenCoreNetworkUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class kf {
    public static AcSdkNetResponse<String, Object> a(Context context, String str, AcOpenCoreSourceInfo acOpenCoreSourceInfo) {
        AcLogUtil.i("AcOpenLogoutRequestImpl", "request invoke traceId=" + acOpenCoreSourceInfo.getAppTraceId(), true);
        AcOpenLogoutRequest acOpenLogoutRequest = new AcOpenLogoutRequest("", "", "", str, false, 1);
        HashMap map = new HashMap();
        map.put("X-App-TraceId", acOpenCoreSourceInfo.getAppTraceId());
        map.put(AcBaseConstants.a.HEADER_BIZ_TRACE_ID, acOpenCoreSourceInfo.getBizTraceId());
        AcSdkNetResponse<String, Object> acSdkNetResponseRetrofitCallSync = AcOpenCoreNetworkUtil.getInstance(context).retrofitCallSync(((wb) AcOpenCoreNetworkUtil.getInstance(context).getAcNetRequestService(wb.class)).i(map, acOpenLogoutRequest));
        if (!acSdkNetResponseRetrofitCallSync.isSuccess()) {
            AcLogUtil.e("AcOpenLogoutRequestImpl", "request logout fail, code=" + acSdkNetResponseRetrofitCallSync.getCode(), true);
        }
        return acSdkNetResponseRetrofitCallSync;
    }
}

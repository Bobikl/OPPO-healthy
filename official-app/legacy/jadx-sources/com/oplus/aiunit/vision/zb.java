package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.net.bean.AcOpenAccountInfoResponse;
import com.oplus.accountsdk.open.core.trace.AcOpenCoreSourceInfo;
import com.oplus.accountsdk.open.core.utils.AcOpenCoreNetworkUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class zb {
    public static AcSdkNetResponse<AcOpenAccountInfoResponse, Object> a(Context context, String str, AcOpenCoreSourceInfo acOpenCoreSourceInfo) {
        AcLogUtil.i("AcOpenAccountInfoRequestImpl", "request invoke appId=" + str + " traceId=" + acOpenCoreSourceInfo.getAppTraceId(), true);
        wb wbVar = (wb) AcOpenCoreNetworkUtil.getInstance(context).getAcNetRequestService(wb.class);
        HashMap map = new HashMap();
        map.put("X-App-TraceId", acOpenCoreSourceInfo.getAppTraceId());
        map.put(AcBaseConstants.a.HEADER_BIZ_TRACE_ID, acOpenCoreSourceInfo.getBizTraceId());
        return AcOpenCoreNetworkUtil.getInstance(context).retrofitCallSync(wbVar.e(map));
    }
}

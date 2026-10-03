package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.utils.AcOpenCoreNetworkUtil;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ee {
    public static AcSdkNetResponse<List<String>, Object> a(Context context, String str) {
        AcLogUtil.i("AcOpenDomainListRequestImpl", "request invoke traceId=" + str, true);
        AcSdkNetResponse<List<String>, Object> acSdkNetResponseRetrofitCallSync = AcOpenCoreNetworkUtil.getInstance(context).retrofitCallSync(((wb) AcOpenCoreNetworkUtil.getInstance(context).getAcNetRequestService(wb.class)).b());
        if (!acSdkNetResponseRetrofitCallSync.isSuccess()) {
            AcLogUtil.e("AcOpenDomainListRequestImpl", "request domain fail, code=" + acSdkNetResponseRetrofitCallSync.getCode(), true);
        }
        return acSdkNetResponseRetrofitCallSync;
    }
}

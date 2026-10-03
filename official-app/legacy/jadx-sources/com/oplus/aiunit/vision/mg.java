package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.net.bean.AcOpenSystemConfigData;
import com.oplus.accountsdk.open.core.net.bean.AcOpenSystemConfigRequest;
import com.oplus.accountsdk.open.core.utils.AcOpenCoreNetworkUtil;

/* JADX INFO: loaded from: classes6.dex */
public class mg {
    public static String a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            AcSdkNetResponse acSdkNetResponseRetrofitCallSync = AcOpenCoreNetworkUtil.getInstance(context).retrofitCallSync(((wb) AcOpenCoreNetworkUtil.getInstance(context).getAcNetRequestService(wb.class)).a(new AcOpenSystemConfigRequest(AcBaseConstants.a.OPEN_SDK_TYPE_VALUE, ng.b(context))));
            if (acSdkNetResponseRetrofitCallSync != null && acSdkNetResponseRetrofitCallSync.isSuccess()) {
                AcOpenSystemConfigData acOpenSystemConfigData = (AcOpenSystemConfigData) acSdkNetResponseRetrofitCallSync.getData();
                if (acOpenSystemConfigData == null) {
                    return "{}";
                }
                ng.c(context, acOpenSystemConfigData.version);
                String strD = xa.d(acOpenSystemConfigData);
                return !TextUtils.isEmpty(strD) ? strD : "{}";
            }
        } catch (Exception e2) {
            AcLogUtil.e("AcOpenSystemConfigNetApi", "fetch system config error: " + e2.getMessage());
        }
        return null;
    }
}

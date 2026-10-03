package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.net.bean.AcVerifyUrlConfigRequest;
import com.oplus.accountsdk.open.core.net.bean.AcVerifyUrlConfigResponse;
import com.oplus.accountsdk.open.core.utils.AcOpenCoreNetworkUtil;

/* JADX INFO: loaded from: classes6.dex */
public class w8 {
    public static AcSdkNetResponse<AcVerifyUrlConfigResponse, Object> a(Context context, String str) {
        AcLogUtil.i("AcOpenVerifyUrlConfigApi", "request invoke, version=" + str, true);
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        AcSdkNetResponse<AcVerifyUrlConfigResponse, Object> acSdkNetResponseRetrofitCallSync = AcOpenCoreNetworkUtil.getInstance(context).retrofitCallSync(((wb) AcOpenCoreNetworkUtil.getInstance(context).getAcNetRequestService(wb.class)).d(new AcVerifyUrlConfigRequest(str)));
        if (!acSdkNetResponseRetrofitCallSync.isSuccess() || acSdkNetResponseRetrofitCallSync.getData() == null) {
            AcLogUtil.e("AcOpenVerifyUrlConfigApi", "request failed, response=" + acSdkNetResponseRetrofitCallSync);
        } else {
            AcLogUtil.i("AcOpenVerifyUrlConfigApi", "request success, data=" + acSdkNetResponseRetrofitCallSync.getData());
        }
        return acSdkNetResponseRetrofitCallSync;
    }
}

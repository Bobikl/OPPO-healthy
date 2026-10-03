package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceConfigResponse;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceUploadBean;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;

/* JADX INFO: loaded from: classes6.dex */
public interface tl9 {
    AcSdkNetResponse<AcTraceConfigResponse, Object> a(Context context, String str);

    AcSdkNetResponse<String, Object> b(AcTraceConfigResponse acTraceConfigResponse, AcTraceUploadBean acTraceUploadBean);
}

package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceConfigResponse;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceDomainConfig;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceUploadBean;
import com.oplus.accountsdk.base.common.constants.AcBaseResponseEnum;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;

/* JADX INFO: loaded from: classes6.dex */
public class zd implements tl9 {
    public volatile AcTraceConfigResponse a;
    public final s7 b;

    public zd(Context context) {
        this.b = yd.a(context);
    }

    @Override // com.oplus.aiunit.vision.tl9
    public AcSdkNetResponse<AcTraceConfigResponse, Object> a(Context context, String str) {
        return AcSdkNetResponse.createSuccess(c(context));
    }

    @Override // com.oplus.aiunit.vision.tl9
    public AcSdkNetResponse<String, Object> b(AcTraceConfigResponse acTraceConfigResponse, AcTraceUploadBean acTraceUploadBean) {
        AcTraceDomainConfig acTraceDomainConfig = acTraceConfigResponse.domainConfig.get(this.b.getRegion());
        if (acTraceDomainConfig == null || !acTraceDomainConfig.report) {
            AcLogUtil.e("AcOpenCoreTraceRepo", "upload but config is null or not report " + acTraceConfigResponse);
            AcBaseResponseEnum acBaseResponseEnum = AcBaseResponseEnum.ERROR_TRACK_DOMAIN_ERROR;
            return AcSdkNetResponse.createError(acBaseResponseEnum.getCode(), acBaseResponseEnum.getRemark(), "");
        }
        AcSdkNetResponse<String, Object> acSdkNetResponseRetrofitCallSync = this.b.retrofitCallSync(((rk) this.b.getAcNetRequestService(rk.class)).b(acTraceDomainConfig.domain, acTraceUploadBean));
        AcLogUtil.i("AcOpenCoreTraceRepo", "trace upload end, isSuccess = " + acSdkNetResponseRetrofitCallSync.isSuccess() + " code = " + acSdkNetResponseRetrofitCallSync.getCode() + " msg = " + acSdkNetResponseRetrofitCallSync.getErrorMessage());
        if (acSdkNetResponseRetrofitCallSync.getCode() == 600001) {
            this.a = null;
        }
        return acSdkNetResponseRetrofitCallSync;
    }

    public final AcTraceConfigResponse c(Context context) {
        if (this.a != null) {
            return this.a;
        }
        String strE = db.e(context, "account_trace_opensdk", "trace_config_opensdk");
        if (TextUtils.isEmpty(strE)) {
            AcLogUtil.i("AcOpenCoreTraceRepo", "getLocalTraceConfig, configJson is empty");
            return null;
        }
        this.a = (AcTraceConfigResponse) xa.c(strE, AcTraceConfigResponse.class);
        return this.a;
    }
}

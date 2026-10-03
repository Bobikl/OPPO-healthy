package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceConfigRequest;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceConfigResponse;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceDomainConfig;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceUploadBean;
import com.oplus.accountsdk.base.common.constants.AcBaseResponseEnum;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class dh implements tl9 {
    public static final int STATUS_NOT_MODIFY = 304;
    public volatile AcTraceConfigResponse a;
    public s7 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AtomicBoolean f10570c = new AtomicBoolean(false);
    public volatile AtomicBoolean d = new AtomicBoolean(false);

    public dh(Context context) {
        this.b = bh.a(context);
    }

    @Override // com.oplus.aiunit.vision.tl9
    public AcSdkNetResponse<AcTraceConfigResponse, Object> a(Context context, String str) {
        if (this.d.get()) {
            return AcSdkNetResponse.createSuccess(this.a);
        }
        AcTraceConfigResponse acTraceConfigResponseC = c(context);
        if (!this.f10570c.compareAndSet(false, true)) {
            AcBaseResponseEnum acBaseResponseEnum = AcBaseResponseEnum.ERROR_CONFIG_REQUESTING;
            return AcSdkNetResponse.createError(acBaseResponseEnum.getCode(), acBaseResponseEnum.getRemark(), acBaseResponseEnum.getRemark());
        }
        if (this.d.get()) {
            return AcSdkNetResponse.createSuccess(this.a);
        }
        AcTraceConfigResponse acTraceConfigResponse = null;
        try {
            AcSdkNetResponse acSdkNetResponseRetrofitCallSync = this.b.retrofitCallSync(((rk) this.b.getAcNetRequestService(rk.class)).a(str, new AcTraceConfigRequest(acTraceConfigResponseC != null ? acTraceConfigResponseC.version : 0)));
            if (acSdkNetResponseRetrofitCallSync.isSuccess() && acSdkNetResponseRetrofitCallSync.getData() != null) {
                acTraceConfigResponseC = (AcTraceConfigResponse) acSdkNetResponseRetrofitCallSync.getData();
            } else if (acSdkNetResponseRetrofitCallSync.getCode() != 304) {
                acTraceConfigResponseC = null;
            }
            try {
                d(context, acTraceConfigResponseC);
                this.d.set(true);
            } catch (Throwable th) {
                th = th;
                acTraceConfigResponse = acTraceConfigResponseC;
                try {
                    AcLogUtil.e("AcOpenTraceRepo", "getTraceConfig network request failed", th);
                    this.d.set(true);
                    acTraceConfigResponseC = acTraceConfigResponse;
                } catch (Throwable th2) {
                    this.d.set(true);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return AcSdkNetResponse.createSuccess(acTraceConfigResponseC);
    }

    @Override // com.oplus.aiunit.vision.tl9
    public AcSdkNetResponse<String, Object> b(AcTraceConfigResponse acTraceConfigResponse, AcTraceUploadBean acTraceUploadBean) {
        AcTraceDomainConfig acTraceDomainConfig = acTraceConfigResponse.domainConfig.get(this.b.getRegion());
        if (acTraceDomainConfig == null || !acTraceDomainConfig.report) {
            AcLogUtil.e("AcOpenTraceRepo", "upload but config is null or not report " + acTraceConfigResponse);
            AcBaseResponseEnum acBaseResponseEnum = AcBaseResponseEnum.ERROR_TRACK_DOMAIN_ERROR;
            return AcSdkNetResponse.createError(acBaseResponseEnum.getCode(), acBaseResponseEnum.getRemark(), "");
        }
        AcSdkNetResponse<String, Object> acSdkNetResponseRetrofitCallSync = this.b.retrofitCallSync(((rk) this.b.getAcNetRequestService(rk.class)).b(acTraceDomainConfig.domain, acTraceUploadBean));
        AcLogUtil.i("AcOpenTraceRepo", "trace upload end, isSuccess = " + acSdkNetResponseRetrofitCallSync.isSuccess() + " code = " + acSdkNetResponseRetrofitCallSync.getCode() + " msg = " + acSdkNetResponseRetrofitCallSync.getErrorMessage());
        if (acSdkNetResponseRetrofitCallSync.getCode() == 600001) {
            this.a = null;
        }
        return acSdkNetResponseRetrofitCallSync;
    }

    public final AcTraceConfigResponse c(Context context) {
        if (this.a != null) {
            return this.a;
        }
        String strE = bb.e(context, "account_trace_opensdk", "trace_config_opensdk");
        if (!TextUtils.isEmpty(strE)) {
            return (AcTraceConfigResponse) xa.c(strE, AcTraceConfigResponse.class);
        }
        AcLogUtil.i("AcOpenTraceRepo", "getLocalTraceConfig, configJson is empty");
        return null;
    }

    public final void d(Context context, AcTraceConfigResponse acTraceConfigResponse) {
        this.a = acTraceConfigResponse;
        bb.j(context, "account_trace_opensdk", "trace_config_opensdk", xa.d(acTraceConfigResponse));
    }
}

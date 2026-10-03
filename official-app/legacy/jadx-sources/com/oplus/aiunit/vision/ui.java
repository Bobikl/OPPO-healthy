package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.account.refresh.api.bean.AcRefreshTokenRequest;
import com.oplus.accountsdk.base.account.refresh.api.bean.AcRefreshTokenResponse;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.feq.FreqStrategyType;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.AcAuthResponse;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ui {
    public v8 a;
    public kl9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sl9 f17473c;
    public ya d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ol9 f17474e;

    public ui(kl9 kl9Var, sl9 sl9Var, ya yaVar, ol9 ol9Var) {
        this.b = kl9Var;
        this.f17473c = sl9Var;
        this.d = yaVar;
        this.f17474e = ol9Var;
    }

    public final v8 a(Context context) {
        return v8.c(context, "refreshApiControl", this.b, FreqStrategyType.SUCCESS, FreqStrategyType.FAIL);
    }

    public final v8 b(Context context) {
        if (this.a == null) {
            this.a = a(context);
        }
        return this.a;
    }

    public AcApiResponse<AcAuthResponse> c(Context context, String str, String str2, String str3, String str4) {
        AcAuthResponse acAuthResponseG = this.d.g(context, str);
        if (acAuthResponseG == null) {
            AcLogUtil.e("AcRefreshV2TokenRepo", "request error: auth token is null", str3);
            return new AcApiResponse<>(ResponseEnum.ERROR_NOT_AUTH, null);
        }
        String strB = b(context).b(u8.e(str));
        if (strB == null) {
            return d(context, acAuthResponseG, str, str2, str4, str3);
        }
        AcLogUtil.e("AcRefreshV2TokenRepo", "request freq, interrupted by " + strB, str3);
        return TextUtils.equals(strB, FreqStrategyType.SUCCESS.getValue()) ? new AcApiResponse<>(ResponseEnum.SUCCESS.getCode(), "request success frequently", acAuthResponseG) : new AcApiResponse<>(ResponseEnum.REFRESH_FREQUENTLY_ERROR, null);
    }

    public AcApiResponse<AcAuthResponse> d(Context context, AcAuthResponse acAuthResponse, String str, String str2, String str3, String str4) {
        AcApiResponse<AcAuthResponse> acApiResponse;
        AcRefreshTokenRequest acRefreshTokenRequest = new AcRefreshTokenRequest(o8.a(context, str, str2, acAuthResponse.getPkgSign(), acAuthResponse.getDeviceId()));
        si siVar = (si) this.f17474e.a(context).getAcNetRequestService(si.class);
        HashMap map = new HashMap();
        map.put(AcBaseConstants.a.X_SYS_DUID, str3);
        map.put(AcBaseConstants.a.HEADER_X_TOKEN, acAuthResponse.getAccessToken());
        map.put(AcBaseConstants.a.HEADER_BIZ_APPI, str);
        map.put(AcBaseConstants.a.HEADER_BIZ_APPK, str2);
        map.put(AcBaseConstants.a.HEADER_BIZ_TRACE_ID, str4);
        map.put(AcBaseConstants.a.HEADER_X_AC_REFRESH_TOKEN, acAuthResponse.getRefreshToken());
        this.f17473c.a(context).report(str, str4, nj.a());
        xr2<AcSdkNetResponse<AcRefreshTokenResponse, Object>> xr2VarA = siVar.a(map, acRefreshTokenRequest);
        AcLogUtil.i("AcRefreshV2TokenRepo", "refresh token by " + acRefreshTokenRequest, AcLogUtil.enableDebug());
        AcSdkNetResponse acSdkNetResponseRetrofitCallSync = this.f17474e.a(context).retrofitCallSync(xr2VarA);
        this.f17473c.a(context).report(str, str4, nj.b(acSdkNetResponseRetrofitCallSync.isSuccess() ? "success" : AcBaseTraceHelper.VAL_FAIL, acSdkNetResponseRetrofitCallSync.getCode() + "", acSdkNetResponseRetrofitCallSync.getErrorMessage()));
        if (acSdkNetResponseRetrofitCallSync.getCode() == ResponseEnum.NET_ACCOUNT_EXPIRED.getCode() || acSdkNetResponseRetrofitCallSync.getCode() == ResponseEnum.NET_AUTH_EXPIRED.getCode()) {
            this.d.b(context);
            AcLogUtil.d("AcRefreshV2TokenRepo", "accountStateHandle NET_ACCOUNT_EXPIRED " + acSdkNetResponseRetrofitCallSync.getCode(), str4);
        }
        AcLogUtil.i("AcRefreshV2TokenRepo", "refresh token response " + xa.d(acSdkNetResponseRetrofitCallSync), AcLogUtil.enableDebug());
        StringBuilder sb = new StringBuilder();
        sb.append("refresh token response, code ");
        sb.append(acSdkNetResponseRetrofitCallSync.getCode());
        sb.append(", data is null? ");
        sb.append(acSdkNetResponseRetrofitCallSync.getData() == null);
        AcLogUtil.i("AcRefreshV2TokenRepo", sb.toString(), str4);
        AcAuthResponse acAuthResponse2 = null;
        if (!acSdkNetResponseRetrofitCallSync.isSuccess() || acSdkNetResponseRetrofitCallSync.getData() == null) {
            AcLogUtil.e("AcRefreshV2TokenRepo", "refresh token error", str4);
            acApiResponse = new AcApiResponse<>(acSdkNetResponseRetrofitCallSync.getCode(), acSdkNetResponseRetrofitCallSync.getErrorMessage(), null);
        } else {
            AcRefreshTokenResponse acRefreshTokenResponse = (AcRefreshTokenResponse) acSdkNetResponseRetrofitCallSync.getData();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("refresh token success, v3TokenResp is null? ");
            sb2.append(acRefreshTokenResponse.getV3TokenResp() == null);
            AcLogUtil.i("AcRefreshV2TokenRepo", sb2.toString(), str4);
            if (acRefreshTokenResponse.getV3TokenResp() != null) {
                acAuthResponse2 = new AcAuthResponse(acRefreshTokenResponse.getV3TokenResp().getIdToken() != null ? acRefreshTokenResponse.getV3TokenResp().getIdToken() : acAuthResponse.getIdToken(), acRefreshTokenResponse.getV3TokenResp().getAccessToken(), acRefreshTokenResponse.getV3TokenResp().getRefreshToken(), acAuthResponse.getPkgSign(), acAuthResponse.getDeviceId(), acAuthResponse.getHost(), acRefreshTokenResponse.getV3TokenResp().getAccessTokenExp(), acRefreshTokenResponse.getV3TokenResp().getRefreshTokenExp(), acRefreshTokenResponse.getV3TokenResp().getAccessTokenRfAdv(), acRefreshTokenResponse.getV3TokenResp().getRefreshTokenRfAdv());
            } else {
                AcLogUtil.i("AcRefreshV2TokenRepo", "Refresh token finish: Tokens are not expired!", str4);
            }
            acApiResponse = new AcApiResponse<>(ResponseEnum.SUCCESS, acAuthResponse2);
        }
        if (acAuthResponse2 != null) {
            this.d.q(context, acAuthResponse2, str);
        }
        return acApiResponse;
    }
}

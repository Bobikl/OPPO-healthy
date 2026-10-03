package com.accountauthencation;

import android.text.TextUtils;
import android.widget.Toast;
import com.heytap.accountsdk.authencation.UCAuthencationRequest;
import com.heytap.accountsdk.authencation.UCAuthencationResponse;
import com.heytap.accountsdk.authencation.bean.AuthUserInfo;
import com.heytap.accountsdk.authencation.inner.UCAuthContainerActivity;
import com.heytap.accountsdk.authencation.repository.AuthApi;
import com.heytap.usercenter.accountsdk.http.UCProviderRepository;
import com.oplus.aiunit.vision.at2;
import com.oplus.aiunit.vision.xr2;
import com.oplus.aiunit.vision.ztf;
import com.platform.usercenter.basic.annotation.NoSign;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;
import com.platform.usercenter.tools.algorithm.MD5Util;
import com.platform.usercenter.tools.algorithm.UCSignHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class a implements at2<CoreResponse<AuthUserInfo.Response>> {
    public final /* synthetic */ UCAuthContainerActivity a;

    public a(UCAuthContainerActivity uCAuthContainerActivity) {
        this.a = uCAuthContainerActivity;
    }

    @Override // com.oplus.aiunit.vision.at2
    public void onFailure(@NotNull xr2<CoreResponse<AuthUserInfo.Response>> xr2Var, @NotNull Throwable th) {
        UCAuthencationResponse.sendErrorResult(this.a.a, UCAuthencationResponse.UCAuthencationError.AUTHENCATION_ERROR_NETWORK, xr2Var.request().getUrl().d() + ":" + th.getMessage());
        this.a.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.heytap.accountsdk.authencation.bean.AuthType$Request] */
    @Override // com.oplus.aiunit.vision.at2
    public void onResponse(@NotNull xr2<CoreResponse<AuthUserInfo.Response>> xr2Var, @NotNull ztf<CoreResponse<AuthUserInfo.Response>> ztfVar) {
        if (ztfVar.a() == null) {
            UCAuthencationResponse.sendErrorResult(this.a.a, UCAuthencationResponse.UCAuthencationError.AUTHENCATION_ERROR_NETWORK, "auth mask user response is null");
            this.a.finish();
            return;
        }
        CoreResponse<AuthUserInfo.Response> coreResponseA = ztfVar.a();
        if (coreResponseA.success) {
            UCAuthContainerActivity uCAuthContainerActivity = this.a;
            uCAuthContainerActivity.d = coreResponseA.data;
            UCAuthencationRequest uCAuthencationRequest = uCAuthContainerActivity.a;
            final String str = uCAuthencationRequest.appId;
            final String str2 = uCAuthencationRequest.businessId;
            final String str3 = uCAuthencationRequest.ssoid;
            final String str4 = uCAuthencationRequest.userToken;
            ((AuthApi) UCProviderRepository.provideAccountService(AuthApi.class)).authType(new Object(str, str2, str3, str4) { // from class: com.heytap.accountsdk.authencation.bean.AuthType$Request
                public final String appId;
                public final String businessId;
                public final String ssoid;
                public final String userToken;
                public long timestamp = System.currentTimeMillis();

                @NoSign
                public String sign = MD5Util.md5Hex(UCSignHelper.signWithAnnotation(this));

                {
                    this.appId = str;
                    this.businessId = str2;
                    this.ssoid = str3;
                    this.userToken = str4;
                }
            }).h(new b(uCAuthContainerActivity));
            return;
        }
        CoreResponse.ErrorResp errorResp = coreResponseA.error;
        if (errorResp == null) {
            UCAuthencationResponse.sendErrorResult(this.a.a, UCAuthencationResponse.UCAuthencationError.AUTHENCATION_ERROR_NETWORK, "auth mask user response is null");
            this.a.finish();
            return;
        }
        String str5 = String.format("%s[%s]", errorResp.message, Integer.valueOf(errorResp.code));
        Toast.makeText(this.a, str5, 0).show();
        String str6 = "" + coreResponseA.error.code;
        if (TextUtils.equals(AuthUserInfo.Response.KEY_ERROR_CODE_3031, str6) || TextUtils.equals("3034", str6)) {
            UCAuthencationResponse.sendErrorResult(this.a.a, UCAuthencationResponse.UCAuthencationError.AUTHENCATION_ERROR_USER_INVALIDATE, str5);
        } else {
            UCAuthencationResponse.sendErrorResult(this.a.a, UCAuthencationResponse.UCAuthencationError.AUTHENCATION_ERROR_PARAM_INVALIDATE, str5);
        }
        this.a.finish();
    }
}

package com.oplus.aiunit.vision;

import com.oplus.account.netrequest.annotation.AcIgnoreIntercept;
import com.oplus.account.netrequest.annotation.AcNeedEncrypt;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.open.core.beans.AcRefreshTokenRequest;
import com.oplus.accountsdk.open.core.beans.AcRefreshTokenResponse;
import com.oplus.accountsdk.open.core.interceptor.AcOpenCoreTokenExpiredInterceptor;
import com.oplus.accountsdk.open.core.net.bean.AcOpenAccountInfoResponse;
import com.oplus.accountsdk.open.core.net.bean.AcOpenBizAuthRequest;
import com.oplus.accountsdk.open.core.net.bean.AcOpenBizAuthResponse;
import com.oplus.accountsdk.open.core.net.bean.AcOpenBizOAuthCodeRequest;
import com.oplus.accountsdk.open.core.net.bean.AcOpenBizOAuthCodeResponse;
import com.oplus.accountsdk.open.core.net.bean.AcOpenLogoutRequest;
import com.oplus.accountsdk.open.core.net.bean.AcOpenSystemConfigData;
import com.oplus.accountsdk.open.core.net.bean.AcOpenSystemConfigRequest;
import com.oplus.accountsdk.open.core.net.bean.AcVerifyUrlConfigRequest;
import com.oplus.accountsdk.open.core.net.bean.AcVerifyUrlConfigResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface wb {
    @AcNeedEncrypt(version = "V1")
    @m1e("config/system-configurations")
    xr2<AcSdkNetResponse<AcOpenSystemConfigData, Object>> a(@av1 AcOpenSystemConfigRequest acOpenSystemConfigRequest);

    @AcNeedEncrypt
    @m1e("/uc/v1/config/h5-sdk/webview-domain-list")
    xr2<AcSdkNetResponse<List<String>, Object>> b();

    @ib
    @hb
    @gb
    @eb
    @AcNeedEncrypt
    @m1e("authorization/v1/token/refresh")
    @AcIgnoreIntercept({AcOpenCoreTokenExpiredInterceptor.class, jd.class})
    xr2<AcSdkNetResponse<AcRefreshTokenResponse, Object>> c(@oi8 Map<String, String> map, @av1 AcRefreshTokenRequest acRefreshTokenRequest);

    @AcNeedEncrypt(version = "V1")
    @m1e("config/business-url-configurations")
    xr2<AcSdkNetResponse<AcVerifyUrlConfigResponse, Object>> d(@av1 AcVerifyUrlConfigRequest acVerifyUrlConfigRequest);

    @eb
    @AcNeedEncrypt
    @m1e("uc/v1/user-info/query-detail")
    xr2<AcSdkNetResponse<AcOpenAccountInfoResponse, Object>> e(@oi8 Map<String, String> map);

    @eb
    @j8
    @m1e("authorization/v1/token/refresh-no-service")
    xr2<AcSdkNetResponse<String, Object>> f();

    @fb
    @AcNeedEncrypt
    @m1e("oauth/v1/oauth2/auth")
    xr2<AcSdkNetResponse<AcOpenBizOAuthCodeResponse, Object>> g(@oi8 Map<String, String> map, @av1 AcOpenBizOAuthCodeRequest acOpenBizOAuthCodeRequest);

    @AcNeedEncrypt
    @m1e("authorization/v1/token/authorize")
    @fb
    @eb
    xr2<AcSdkNetResponse<AcOpenBizAuthResponse, Object>> h(@oi8 Map<String, String> map, @av1 AcOpenBizAuthRequest acOpenBizAuthRequest);

    @eb
    @AcNeedEncrypt(version = "V1")
    @m1e("identity/v1/authn/logout")
    xr2<AcSdkNetResponse<String, Object>> i(@oi8 Map<String, String> map, @av1 AcOpenLogoutRequest acOpenLogoutRequest);
}

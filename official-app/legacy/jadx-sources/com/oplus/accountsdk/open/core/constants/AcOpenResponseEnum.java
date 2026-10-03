package com.oplus.accountsdk.open.core.constants;

import com.heytap.log.core.ConstantCode;

/* JADX INFO: loaded from: classes6.dex */
public enum AcOpenResponseEnum {
    CODE_NOT_SUPPORT(-440001, "not support"),
    ERROR_NOT_INIT(-440002, "sdk not init"),
    OPEN_WEBVIEW_ERROR(-440003, "open webView error"),
    LOGIN_FAIL_ERROR(-441001, "login failed!"),
    LOGIN_RESP_IS_EMPTY(-441002, "loginResp is empty!"),
    LOGIN_RESP_TRANSFORM_ERROR(-441004, "loginResp transform error!"),
    LOGIN_AND_AUTH_ERROR(-441005, "login and auth error!"),
    LOGOUT_ERROR(-441003, "logout error"),
    CODE_PARAMS_ERROR(-442001, "auth fail because bizToken is null"),
    AUTH_FAIL_ERROR(-442002, "auth silently failed!"),
    AUTH_IPC_PARAM_ERROR(-442003, "auth ipc paramJson error!"),
    AUTH_RESULT_DATE_IS_NULL(-442004, "auth fail date is null"),
    INFO_RESULT_DATE_IS_NULL(-443001, "info fail date is null"),
    CONVERT_NO_REQUEST_IS_REQUIRED(-444002, "convert don't need request"),
    CONVERT_RESULT_DATE_IS_NULL(-444003, "convert date is null"),
    CONVERT_RESULT_ID_TOKEN_ERROR(-444004, "convert idToken error"),
    CONVERT_RESULT_ACCESS_TOKEN_ERROR(-444005, "convert accessToken error"),
    CONVERT_RESULT_REFRESH_TOKEN_ERROR(-444006, "convert refreshToken error"),
    CONVERT_RESULT_DEVICE_ID_ERROR(-444007, "convert deviceId error"),
    CONVERT_RESULT_SECONDARY_TOKEN_ERROR(-444008, "convert secondaryToken error"),
    WEB_NEED_LOGIN(-445001, "this action need login"),
    THIRD_AUTH_OP_RESPONSE_ERROR(-445101, "op auth error: bundle or result is null"),
    THIRD_AUTH_GG_PROVIDER_ERROR(-445201, "gg auth error: thirdPartyLoginProvider is null"),
    THIRD_AUTH_GG_THIRD_API_ERROR(-445202, "gg auth error: third api livedata is null"),
    OAUTH_URL_NULL_ERROR(-2009, "Get oauth url error"),
    OAUTH_VERSION_NOT_SUPPORT(ConstantCode.CloganStatus.CLOGAN_OPEN_SUCCESS, "Account app is not support this version."),
    OAUTH_STATE_CHANGE_ERROR(-2011, "state has changed"),
    OAUTH_H5_DATA_ERROR(-2012, "oauth h5 returns a wrong data"),
    OAUTH_H5_OPERATE_FAILED(-2013, "oauth h5 operated fail");

    private final int code;
    private final String remark;

    AcOpenResponseEnum(int i, String str) {
        this.code = i;
        this.remark = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getRemark() {
        return this.remark;
    }
}

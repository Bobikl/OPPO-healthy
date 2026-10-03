package com.lifesense.device.scale.login;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public class LoginRequest extends BaseRequest {
    public LoginRequest() {
        setRequestMethod("POST");
        addIntValue("tenantId", 1);
        addIntValue("subscriptionId", 6);
        addIntValue("associatedId", 1);
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return LoginResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/sessions_service/associatedBusiness/login";
    }
}

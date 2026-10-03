package com.lifesense.device.scale.infrastructure.protocol;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public class GetLoginUserRequest extends BaseRequest {
    public GetLoginUserRequest() {
        setRequestMethod("GET");
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return GetLoginUserResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/user_service/load/loadUserBaseInfo";
    }
}

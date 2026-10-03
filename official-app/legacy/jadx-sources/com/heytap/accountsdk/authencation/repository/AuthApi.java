package com.heytap.accountsdk.authencation.repository;

import com.heytap.accountsdk.authencation.bean.AuthBean;
import com.heytap.accountsdk.authencation.bean.AuthType$Request;
import com.heytap.accountsdk.authencation.bean.AuthType$Response;
import com.heytap.accountsdk.authencation.bean.AuthUserInfo;
import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.xr2;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;

/* JADX INFO: loaded from: classes14.dex */
public interface AuthApi {
    @m1e("business/authencation/valid")
    xr2<CoreResponse<AuthBean.Response>> auth(@av1 AuthBean.Request request);

    @m1e("business/authencation/list")
    xr2<CoreResponse<AuthType$Response>> authType(@av1 AuthType$Request authType$Request);

    @m1e("business/userinfo/mask")
    xr2<CoreResponse<AuthUserInfo.Response>> authUserInfo(@av1 AuthUserInfo.Request request);
}

package com.heytap.accountsdk.authencation.repository;

import com.heytap.accountsdk.authencation.bean.AuthBean;
import com.heytap.accountsdk.authencation.bean.AuthType$Request;
import com.heytap.accountsdk.authencation.bean.AuthType$Response;
import com.heytap.accountsdk.authencation.bean.AuthUserInfo;
import com.oplus.aiunit.vision.j3e;
import com.oplus.aiunit.vision.ls2;
import com.oplus.aiunit.vision.ov1;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface AuthApi {
    @j3e("business/authencation/valid")
    ls2<CoreResponse<AuthBean.Response>> auth(@ov1 AuthBean.Request request);

    @j3e("business/authencation/list")
    ls2<CoreResponse<AuthType$Response>> authType(@ov1 AuthType$Request authType$Request);

    @j3e("business/userinfo/mask")
    ls2<CoreResponse<AuthUserInfo.Response>> authUserInfo(@ov1 AuthUserInfo.Request request);
}

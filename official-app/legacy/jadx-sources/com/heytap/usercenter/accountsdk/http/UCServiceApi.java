package com.heytap.usercenter.accountsdk.http;

import androidx.lifecycle.LiveData;
import com.heytap.usercenter.accountsdk.model.BasicUserInfo;
import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.xr2;
import com.platform.usercenter.basic.core.mvvm.ApiResponse;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;

/* JADX INFO: loaded from: classes19.dex */
public interface UCServiceApi {
    @m1e("api/profile/v8.0/sdk/basic-info")
    LiveData<ApiResponse<CoreResponse<BasicUserInfo>>> queryUserBasicInfo(@av1 AccountBasicParam accountBasicParam);

    @m1e("api/profile/v8.0/sdk/basic-info")
    xr2<CoreResponse<BasicUserInfo>> reqSignInAccount(@av1 AccountBasicParam accountBasicParam);
}

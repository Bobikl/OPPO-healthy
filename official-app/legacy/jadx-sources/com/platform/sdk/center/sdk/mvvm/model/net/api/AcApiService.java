package com.platform.sdk.center.sdk.mvvm.model.net.api;

import com.oplus.aiunit.vision.av1;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.xr2;
import com.platform.sdk.center.sdk.mvvm.model.data.AcCardOperationResult;
import com.platform.sdk.center.sdk.mvvm.model.data.AcInfo;
import com.platform.sdk.center.sdk.mvvm.model.net.param.AcCardOperatinParam;
import com.platform.sdk.center.sdk.mvvm.model.net.param.AcInfoParam;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;

/* JADX INFO: loaded from: classes9.dex */
public interface AcApiService {
    @m1e("api/client/account/sdk/account-info")
    xr2<CoreResponse<AcInfo>> reqAccountInfo(@av1 AcInfoParam acInfoParam);

    @m1e("api/black-card/query-entrance-info")
    xr2<CoreResponse<AcCardOperationResult.OperationInfo>> reqEntranceInfo(@av1 AcCardOperatinParam acCardOperatinParam);
}

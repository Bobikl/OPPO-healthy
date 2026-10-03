package com.oplus.accountsdk.service.account.clients;

import android.content.Context;
import com.oplus.accountsdk.base.account.beans.AcAccountToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.c8;
import com.oplus.aiunit.vision.il9;
import com.platform.usercenter.account.ams.bean.AcLoginParam;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes19.dex */
public class AcGuestClient implements il9 {
    private static final String TAG = "AcGuestClient";

    @Override // com.oplus.aiunit.vision.il9
    public AcApiResponse<AcAccountInfo> getAccountInfo() {
        AcLogUtil.i(TAG, "getAccountInfo");
        return new AcApiResponse<>(ResponseEnum.ERROR_GUEST_MODE, null);
    }

    @Override // com.oplus.aiunit.vision.il9
    public AcApiResponse<AcAccountToken> getAccountToken() {
        AcLogUtil.i(TAG, "getAccountToken");
        return new AcApiResponse<>(ResponseEnum.ERROR_GUEST_MODE, null);
    }

    @Override // com.oplus.aiunit.vision.il9
    public AcApiResponse<AcAccountToken> getV1Token() {
        AcLogUtil.i(TAG, "getSdkToken");
        return new AcApiResponse<>(ResponseEnum.ERROR_GUEST_MODE, null);
    }

    @Override // com.oplus.aiunit.vision.il9
    public boolean isLogin() {
        AcLogUtil.i(TAG, "isTokenExist");
        return false;
    }

    @Override // com.oplus.aiunit.vision.il9
    public void login(Context context, c8<AcApiResponse<String>> c8Var) {
        AcLogUtil.i(TAG, "login");
        c8Var.call(new AcApiResponse<>(ResponseEnum.ERROR_GUEST_MODE, null));
    }

    @Override // com.oplus.aiunit.vision.il9
    public AcApiResponse<String> refresh() {
        AcLogUtil.i(TAG, "refresh");
        return new AcApiResponse<>(ResponseEnum.ERROR_GUEST_MODE, null);
    }

    @Override // com.oplus.aiunit.vision.il9
    public void login(Context context, AcLoginParam acLoginParam, c8<AcApiResponse<String>> c8Var) {
        AcLogUtil.i(TAG, "loginWithRequest");
        c8Var.call(new AcApiResponse<>(ResponseEnum.ERROR_GUEST_MODE, null));
    }
}

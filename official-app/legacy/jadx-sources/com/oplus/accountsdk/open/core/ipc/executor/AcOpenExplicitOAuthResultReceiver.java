package com.oplus.accountsdk.open.core.ipc.executor;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.beans.AcOpenOauthOperate;
import com.oplus.accountsdk.open.core.beans.AcOpenOauthOperateResult;
import com.oplus.accountsdk.open.core.beans.AcOpenOauthWebData;
import com.oplus.accountsdk.open.core.beans.AcOpenOauthWebResult;
import com.oplus.aiunit.vision.rc;
import com.oplus.aiunit.vision.xa;
import com.platform.usercenter.account.ams.bean.AcOauthResult;
import com.platform.usercenter.account.ams.ipc.AcResultHelper;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes6.dex */
class AcOpenExplicitOAuthResultReceiver extends ResultReceiver {
    private static final String TAG = "AcOpenExplicitOAuthResultReceiver";
    private final ResultReceiver ipcCallback;
    private final String state;
    private final String traceId;

    public AcOpenExplicitOAuthResultReceiver(ResultReceiver resultReceiver, String str, String str2) {
        super(new Handler(Looper.getMainLooper()));
        this.ipcCallback = resultReceiver;
        this.traceId = str;
        this.state = str2;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        AcOpenOauthWebData acOpenOauthWebData;
        AcOpenOauthOperate acOpenOauthOperate;
        if (bundle == null) {
            AcLogUtil.e(TAG, "explicit oauth result data is null", true);
            rc.h(this.ipcCallback, ResponseEnum.NETWORK_DATA_NULL.getCode(), "explicit oauth result data is null");
            return;
        }
        AcApiResponse acApiResponse = (AcApiResponse) xa.b(bundle.getString("data"), new TypeToken<AcApiResponse<String>>() { // from class: com.oplus.accountsdk.open.core.ipc.executor.AcOpenExplicitOAuthResultReceiver.1
        });
        if (acApiResponse == null) {
            AcLogUtil.e(TAG, "explicit oauth: parse AcApiResponse failed", true);
            rc.h(this.ipcCallback, ResponseEnum.NETWORK_DATA_NULL.getCode(), "explicit oauth result parse failed");
            return;
        }
        if (!acApiResponse.isSuccess()) {
            AcLogUtil.e(TAG, "explicit oauth failed, code=" + acApiResponse.getCode() + ", msg=" + acApiResponse.getMsg(), true);
            rc.h(this.ipcCallback, acApiResponse.getCode(), acApiResponse.getMsg());
            return;
        }
        AcLogUtil.i(TAG, "explicit oauth success, traceId=" + this.traceId, true);
        AcOpenOauthWebResult acOpenOauthWebResult = (AcOpenOauthWebResult) xa.c((String) acApiResponse.getData(), AcOpenOauthWebResult.class);
        if (acOpenOauthWebResult == null || (acOpenOauthWebData = acOpenOauthWebResult.data) == null || (acOpenOauthOperate = acOpenOauthWebData.operate) == null) {
            AcLogUtil.e(TAG, "explicit oauth but data = " + ((String) acApiResponse.getData()), true);
            ResultReceiver resultReceiver = this.ipcCallback;
            ResponseEnum responseEnum = ResponseEnum.AUTH_H5_RESULT_NULL;
            rc.h(resultReceiver, responseEnum.getCode(), responseEnum.getRemark());
            return;
        }
        if (!acOpenOauthOperate.operateSuccess) {
            AcLogUtil.e(TAG, "oauth fail msg = " + acOpenOauthWebResult.msg, true);
            rc.h(this.ipcCallback, ResponseEnum.OAUTH_H5_OPERATE_FAILED.getCode(), acOpenOauthWebResult.msg);
            return;
        }
        AcOpenOauthOperateResult acOpenOauthOperateResult = (AcOpenOauthOperateResult) xa.c(acOpenOauthOperate.operateResult.replace("\\\"", "\""), AcOpenOauthOperateResult.class);
        if (acOpenOauthOperateResult == null || TextUtils.isEmpty(acOpenOauthOperateResult.code)) {
            AcLogUtil.e(TAG, "oauth fail , h5 data error.", true);
            ResultReceiver resultReceiver2 = this.ipcCallback;
            ResponseEnum responseEnum2 = ResponseEnum.OAUTH_H5_DATA_ERROR;
            rc.h(resultReceiver2, responseEnum2.getCode(), responseEnum2.getRemark());
            return;
        }
        if (acOpenOauthOperateResult.state.equals(this.state)) {
            AcLogUtil.e(TAG, "oauth success!", true);
            rc.i(this.ipcCallback, AcResultHelper.getSuccessResult(xa.d(new AcOauthResult(acOpenOauthOperateResult.code))));
            return;
        }
        AcLogUtil.e(TAG, "oauth state not match, client state: " + this.state + " server state: " + acOpenOauthOperateResult.state, true);
        ResultReceiver resultReceiver3 = this.ipcCallback;
        ResponseEnum responseEnum3 = ResponseEnum.OAUTH_STATE_CHANGE_ERROR;
        rc.h(resultReceiver3, responseEnum3.getCode(), responseEnum3.getRemark());
    }
}

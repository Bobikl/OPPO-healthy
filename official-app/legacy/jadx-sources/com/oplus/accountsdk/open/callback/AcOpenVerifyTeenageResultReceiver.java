package com.oplus.accountsdk.open.callback;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.gson.reflect.TypeToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.base.sdk.teenageauth.AcTeenagerVerifyResult;
import com.oplus.aiunit.vision.c8;
import com.oplus.aiunit.vision.xa;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes6.dex */
public class AcOpenVerifyTeenageResultReceiver extends ResultReceiver {
    private static final String TAG = "AcOpenVerifyTeenageResultReceiver";
    private final c8<AcApiResponse<AcTeenagerVerifyResult>> callback;

    public AcOpenVerifyTeenageResultReceiver(Handler handler, c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var) {
        super(handler);
        this.callback = c8Var;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("onReceiveResult ");
        sb.append(i);
        sb.append(" resultData has data ");
        sb.append(bundle != null);
        AcLogUtil.i(TAG, sb.toString());
        if (i == 0) {
            c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var = this.callback;
            ResponseEnum responseEnum = ResponseEnum.TEENATE_RESULT_CODE_CANCEL;
            c8Var.call(new AcApiResponse<>(responseEnum.getCode(), responseEnum.getRemark(), null));
            return;
        }
        if (-1 != i) {
            c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var2 = this.callback;
            ResponseEnum responseEnum2 = ResponseEnum.TEENATE_VERIFY_RESULT_CODE_FAILED;
            c8Var2.call(new AcApiResponse<>(responseEnum2.getCode(), responseEnum2.getRemark(), null));
            return;
        }
        if (bundle == null) {
            AcLogUtil.e(TAG, "onReceiveResult: resultData is null");
            c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var3 = this.callback;
            ResponseEnum responseEnum3 = ResponseEnum.TEENATE_VERIFY_RESULT_NULL;
            c8Var3.call(new AcApiResponse<>(responseEnum3.getCode(), responseEnum3.getRemark(), null));
            return;
        }
        AcApiResponse acApiResponse = (AcApiResponse) xa.b(bundle.getString("data", ""), new TypeToken<AcApiResponse<String>>() { // from class: com.oplus.accountsdk.open.callback.AcOpenVerifyTeenageResultReceiver.1
        });
        if (acApiResponse == null) {
            AcLogUtil.e(TAG, "onReceiveResult: parse AcApiResponse failed");
            c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var4 = this.callback;
            ResponseEnum responseEnum4 = ResponseEnum.TEENATE_VERIFY_RESULT_NULL;
            c8Var4.call(new AcApiResponse<>(responseEnum4.getCode(), responseEnum4.getRemark(), null));
            return;
        }
        if (!acApiResponse.isSuccess()) {
            AcLogUtil.e(TAG, "onReceiveResult: api error, code=" + acApiResponse.getCode() + ", msg=" + acApiResponse.getMsg());
            this.callback.call(new AcApiResponse<>(acApiResponse.getCode(), acApiResponse.getMsg(), null));
            return;
        }
        AcApiResponse<AcTeenagerVerifyResult> acApiResponse2 = (AcApiResponse) xa.b((String) acApiResponse.getData(), new TypeToken<AcApiResponse<AcTeenagerVerifyResult>>() { // from class: com.oplus.accountsdk.open.callback.AcOpenVerifyTeenageResultReceiver.2
        });
        if (acApiResponse2 == null) {
            AcLogUtil.e(TAG, "onReceiveResult: parse teenage verify result failed");
            c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var5 = this.callback;
            ResponseEnum responseEnum5 = ResponseEnum.TEENATE_VERIFY_RESULT_NULL;
            c8Var5.call(new AcApiResponse<>(responseEnum5.getCode(), responseEnum5.getRemark(), null));
            return;
        }
        if (200 != acApiResponse2.getCode()) {
            this.callback.call(acApiResponse2);
            return;
        }
        AcLogUtil.e(TAG, "onReceiveResult: api error, code=" + acApiResponse.getCode() + ", msg=" + acApiResponse2.getMsg());
        c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var6 = this.callback;
        ResponseEnum responseEnum6 = ResponseEnum.SUCCESS;
        c8Var6.call(new AcApiResponse<>(responseEnum6.getCode(), responseEnum6.getRemark(), acApiResponse2.getData()));
    }
}

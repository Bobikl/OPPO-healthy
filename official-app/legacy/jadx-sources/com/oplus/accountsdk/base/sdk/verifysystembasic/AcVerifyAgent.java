package com.oplus.accountsdk.base.sdk.verifysystembasic;

import android.app.Activity;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.common.constants.AcBaseResponseEnum;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.base.sdk.verifysystembasic.callback.VerifySysCallBack;
import com.oplus.accountsdk.base.sdk.verifysystembasic.data.AcVerifyResultData;
import com.oplus.accountsdk.base.sdk.verifysystembasic.data.VerifyParam;
import com.oplus.aiunit.vision.qi;
import com.oplus.aiunit.vision.w9;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcVerifyAgent {
    private static final String TAG = "AcVerifyAgent";
    private static volatile w9 sIDOVerifyAgent;
    private static volatile w9 sOpenVerifyAgent;

    private static synchronized w9 getAgent(boolean z) {
        AcLogUtil.e(TAG, "getVerifyAgent isOpen " + z);
        if (z) {
            if (sOpenVerifyAgent == null) {
                sOpenVerifyAgent = (w9) qi.a("com.oplus.accountsdk.open.AcOpenVerifyAgent", w9.class);
            }
            return sOpenVerifyAgent;
        }
        if (sIDOVerifyAgent == null) {
            sIDOVerifyAgent = (w9) qi.a("com.oplus.accountsdk.service.sdk.verifysystembasic.AcIDVerifyAgent", w9.class);
        }
        return sIDOVerifyAgent;
    }

    public static void startVerifyForResult(@NonNull Activity activity, @NonNull VerifyParam verifyParam, @NonNull VerifySysCallBack verifySysCallBack) {
        startVerifyForResult(activity, verifyParam, verifySysCallBack, false);
    }

    public static void startVerifyForResult(@NonNull Activity activity, @NonNull VerifyParam verifyParam, @NonNull VerifySysCallBack verifySysCallBack, boolean z) {
        AcLogUtil.i(TAG, "startOperateVerify");
        w9 agent = getAgent(z);
        if (agent != null) {
            agent.startVerifyForResult(activity, verifyParam, verifySysCallBack);
            return;
        }
        AcVerifyResultData acVerifyResultData = new AcVerifyResultData();
        AcBaseResponseEnum acBaseResponseEnum = AcBaseResponseEnum.ERROR_NOT_VERIFY_AGENT;
        acVerifyResultData.setCode(acBaseResponseEnum.getCode());
        acVerifyResultData.setMsg(acBaseResponseEnum.getRemark());
        acVerifyResultData.setBusinessId(verifyParam.getBusinessId());
        verifySysCallBack.callBack(acVerifyResultData);
        AcLogUtil.e(TAG, "not supprot verify");
    }
}

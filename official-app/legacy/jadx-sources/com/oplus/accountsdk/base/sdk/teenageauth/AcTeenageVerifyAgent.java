package com.oplus.accountsdk.base.sdk.teenageauth;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.constants.AcBaseResponseEnum;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.c8;
import com.oplus.aiunit.vision.qi;
import com.oplus.aiunit.vision.u9;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcTeenageVerifyAgent {
    private static final String TAG = "AcTeenageVerifyAgent";
    private static volatile u9 sIDTeenageAgent;
    private static volatile u9 sOpenTeenageAgent;

    private static synchronized u9 getAgent(boolean z) {
        AcLogUtil.e(TAG, "getOAuthAgent isOpen " + z);
        if (z) {
            if (sOpenTeenageAgent == null) {
                sOpenTeenageAgent = (u9) qi.a("com.oplus.accountsdk.open.AcOpenTeenageVerifyAgent", u9.class);
            }
            return sOpenTeenageAgent;
        }
        if (sIDTeenageAgent == null) {
            sIDTeenageAgent = (u9) qi.a("com.oplus.accountsdk.service.sdk.teenageauth.AcIDTeenageVerifyAgent", u9.class);
        }
        return sIDTeenageAgent;
    }

    public static void startTeenageVerifyForResult(Context context, String str, String str2, @NonNull c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var) {
        startTeenageVerifyForResult(context, str, str2, c8Var, false);
    }

    public static void startTeenageVerifyForResult(Context context, String str, String str2, @NonNull c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var, boolean z) {
        AcLogUtil.i(TAG, "startOperateVerify");
        u9 agent = getAgent(z);
        if (agent != null) {
            agent.startTeenageVerifyForResult(context, str, str2, c8Var);
            return;
        }
        AcBaseResponseEnum acBaseResponseEnum = AcBaseResponseEnum.ERROR_NOT_TEENAGE_VERIFY_AGENT;
        c8Var.call(new AcApiResponse<>(acBaseResponseEnum.getCode(), acBaseResponseEnum.getRemark(), null));
        AcLogUtil.e(TAG, "not supprot teenage verify");
    }
}

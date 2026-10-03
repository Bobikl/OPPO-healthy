package com.oplus.accountsdk.service.movehome;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.c8;
import com.oplus.aiunit.vision.z9;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AcAccountBackupManager {
    private static final String TAG = "AcBackupManager";

    public static void requestEncryptSsoid(Context context, c8<AcApiResponse<String>> c8Var) {
        if (c8Var == null) {
            AcLogUtil.i(TAG, "callback can't be null");
        } else {
            z9.i().j(context, c8Var);
        }
    }

    public static void silentlyLogin(Context context, String str, String str2, c8<AcApiResponse<String>> c8Var) {
        if (c8Var == null) {
            AcLogUtil.e(TAG, "callback can't be null");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AcLogUtil.e(TAG, "apid == null? " + TextUtils.isEmpty(str) + " appK == null? " + TextUtils.isEmpty(str2));
            c8Var.call(new AcApiResponse<>(ResponseEnum.ERROR_APID_APKY_NULL, null));
        }
        if (context == null) {
            AcLogUtil.e(TAG, "context can't be null");
            c8Var.call(new AcApiResponse<>(ResponseEnum.ERROR_JUMP_CONTEXT_ERROR, null));
        } else {
            z9.i().n(context, AcBaseTraceHelper.createTraceId(str2), str, str2, c8Var);
        }
    }
}

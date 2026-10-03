package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.data.AcAppInfo;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.base.sdk.teenageauth.AcTeenagerVerifyResult;
import com.oplus.accountsdk.service.account.BuildConfig;
import com.oplus.accountsdk.service.common.constants.AcConstants;
import com.oplus.accountsdk.service.sdk.verifysystembasic.data.AcResultData;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes19.dex */
public class q9 {
    public static final String TAG = "AcIDTeenageVerifyUtil";

    public class a extends Handler {
        public final /* synthetic */ c8 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper, c8 c8Var) {
            super(looper);
            this.a = c8Var;
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            AcLogUtil.i(q9.TAG, "handler receive result  ");
            if (this.a == null) {
                AcLogUtil.e(q9.TAG, "mCallBack is null");
                return;
            }
            Bundle data = message.getData();
            if (data == null) {
                AcLogUtil.e(q9.TAG, "bundle == null");
                return;
            }
            AcResultData acResultData = (AcResultData) xa.c(data.getString("KEY_REQUEST_INTENT_EXTRA_RESULT"), AcResultData.class);
            if (acResultData == null) {
                AcLogUtil.e(q9.TAG, "data is null");
                this.a.call(q9.c());
                return;
            }
            AcLogUtil.i(q9.TAG, "handler receive result data= " + acResultData.code + ",msg=" + acResultData.msg + ",originalCode=" + acResultData.getOriginalCode());
            AcApiResponse<AcTeenagerVerifyResult> acApiResponseE = q9.e(acResultData);
            StringBuilder sb = new StringBuilder();
            sb.append("handler receive result callback code=");
            sb.append(acApiResponseE.getCode());
            sb.append(",msg=");
            sb.append(acApiResponseE.getMsg());
            AcLogUtil.i(q9.TAG, sb.toString());
            this.a.call(acApiResponseE);
            removeCallbacksAndMessages(null);
        }
    }

    public static boolean b(Context context, String str) {
        try {
            boolean z = context.getPackageManager().getApplicationInfo(str, 128).metaData.getBoolean("teenage_verify_sdk_enable", false);
            AcLogUtil.i(TAG, "teenage_verify_sdk_enable=" + z);
            return z;
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "checkHasTeenageMetaInfo error ", e2);
            return false;
        }
    }

    public static AcApiResponse<AcTeenagerVerifyResult> c() {
        return new AcApiResponse<>(ResponseEnum.TEENATE_VERIFY_RESULT_NULL, null);
    }

    public static boolean d(Context context, Intent intent) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (packageManager != null) {
            return !packageManager.queryIntentActivities(intent, 65536).isEmpty();
        }
        AcLogUtil.i(TAG, "packageManager == null");
        return false;
    }

    public static AcApiResponse<AcTeenagerVerifyResult> e(AcResultData acResultData) {
        int i;
        ResponseEnum responseEnum = ResponseEnum.TEENATE_VERIFY_RESULT_CODE_FAILED;
        int i2 = responseEnum.code;
        String msg = responseEnum.remark;
        try {
            i = Integer.parseInt(acResultData.getOriginalCode());
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "originalCode parseInt error", e2);
            i = i2;
        }
        if (AcConstants.c.TEENAGE_VERIFY_RESULT_CODE_SUCCESS.equals(acResultData.code)) {
            ResponseEnum responseEnum2 = ResponseEnum.SUCCESS;
            i2 = responseEnum2.code;
            msg = responseEnum2.remark;
        } else if (AcConstants.c.TEENAGE_VERIFY_RESULT_CODE_CANCEL.equals(acResultData.code)) {
            ResponseEnum responseEnum3 = ResponseEnum.TEENATE_RESULT_CODE_CANCEL;
            i2 = responseEnum3.code;
            msg = responseEnum3.remark;
        } else if (i > 0) {
            msg = acResultData.getMsg();
            i2 = i;
        }
        return new AcApiResponse<>(i2, msg, new AcTeenagerVerifyResult(acResultData.getTicket()));
    }

    @NonNull
    public static Handler f(c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var) {
        return new a(Looper.getMainLooper(), c8Var);
    }

    public static void g(Intent intent, Context context, String str, String str2, c8<AcApiResponse<AcTeenagerVerifyResult>> c8Var) {
        intent.putExtra(AcConstants.c.KEY_MESSENGER, new Messenger(f(c8Var)));
        intent.putExtra(AcConstants.c.KEY_SCENE_PARAM, str);
        intent.putExtra(AcConstants.c.KEY_PACKAGE_PARAM, str2);
        intent.putExtra(AcConstants.a.a(), xa.d(AcAppInfo.getAppInfo(context, BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE)));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "startAccountApkForTeenage", e2);
            c8Var.call(new AcApiResponse<>(ResponseEnum.TEENATE_VERIFY_RESULT_CODE_FAILED.code, e2.getMessage(), new AcTeenagerVerifyResult("")));
        }
    }
}

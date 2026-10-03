package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.common.data.AcAppInfo;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.base.sdk.verifysystembasic.callback.VerifySysCallBack;
import com.oplus.accountsdk.base.sdk.verifysystembasic.data.AcVerifyResultData;
import com.oplus.accountsdk.base.sdk.verifysystembasic.data.VerifyParam;
import com.oplus.accountsdk.service.account.BuildConfig;
import com.oplus.accountsdk.service.common.constants.AcConstants;
import com.oplus.accountsdk.service.sdk.verifysystembasic.data.AcResultData;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.sdk.verifysystembasic.data.VerifyBusinessParamConfig;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class t9 {

    public class a extends Handler {
        public final /* synthetic */ VerifySysCallBack a;
        public final /* synthetic */ VerifyParam b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper, VerifySysCallBack verifySysCallBack, VerifyParam verifyParam) {
            super(looper);
            this.a = verifySysCallBack;
            this.b = verifyParam;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AcLogUtil.i("AcIDVerifyUtil", "handler receive result ");
            if (this.a == null) {
                AcLogUtil.e("AcIDVerifyUtil", "mCallBack is null");
                return;
            }
            AcResultData acResultData = (AcResultData) xa.c(message.getData().getString(AcConstants.c.KEY_REQUEST_INTENT_EXTRA_VERIFY_RESULT), AcResultData.class);
            if (acResultData == null) {
                AcLogUtil.e("AcIDVerifyUtil", "data is null");
                this.a.callBack(t9.c(this.b));
                return;
            }
            AcLogUtil.i("AcIDVerifyUtil", "handler receive result data= " + acResultData.code + ",msg=" + acResultData.msg + ",originalCode=" + acResultData.getOriginalCode());
            AcVerifyResultData acVerifyResultDataF = t9.f(acResultData);
            StringBuilder sb = new StringBuilder();
            sb.append("handler receive result callback code=");
            sb.append(acVerifyResultDataF.getCode());
            sb.append(",msg=");
            sb.append(acVerifyResultDataF.getMsg());
            AcLogUtil.i("AcIDVerifyUtil", sb.toString());
            this.a.callBack(acVerifyResultDataF);
            removeCallbacksAndMessages(null);
        }
    }

    public static boolean b(Context context, String str) {
        try {
            boolean z = context.getPackageManager().getApplicationInfo(str, 128).metaData.getBoolean("verify_sdk_enable", false);
            AcLogUtil.i("AcIDVerifyUtil", "verifySdkEnable=" + z);
            return z;
        } catch (Exception e2) {
            AcLogUtil.e("AcIDVerifyUtil", "checkHasMetaInfo error", e2);
            return false;
        }
    }

    public static AcVerifyResultData c(VerifyParam verifyParam) {
        AcVerifyResultData acVerifyResultData = new AcVerifyResultData();
        acVerifyResultData.setCode((verifyParam == null || !"COMPLETE_TYPE".equals(verifyParam.getOperateType())) ? ResponseEnum.VERIFY_RESULT_CODE_FAILED.getCode() : ResponseEnum.COMPLETE_RESULT_CODE_FAILED.getCode());
        acVerifyResultData.setMsg("data is null");
        acVerifyResultData.setBusinessId(verifyParam != null ? verifyParam.getBusinessId() : null);
        acVerifyResultData.setRequestCode(verifyParam != null ? verifyParam.getRequestCode() : null);
        return acVerifyResultData;
    }

    public static boolean d(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getApplicationContext().getPackageManager().queryIntentActivities(intent, 65536);
        return listQueryIntentActivities != null && listQueryIntentActivities.size() > 0;
    }

    public static VerifyBusinessParamConfig e(VerifyParam verifyParam) {
        return new VerifyBusinessParamConfig.Builder().addUserToken(verifyParam.getUserToken()).bizk(verifyParam.getMk()).bizs(verifyParam.getMs()).businessId(verifyParam.getBusinessId()).appId(verifyParam.getAppI()).processToken(verifyParam.getProcessToken()).ssoId(verifyParam.getSsoId()).requestCode(verifyParam.getRequestCode()).operateType(verifyParam.getOperateType()).create();
    }

    public static AcVerifyResultData f(AcResultData acResultData) {
        ResponseEnum responseEnum = ResponseEnum.VERIFY_RESULT_CODE_FAILED;
        int code = responseEnum.getCode();
        int code2 = responseEnum.getCode();
        String remark = responseEnum.getRemark();
        String str = acResultData.originalCode;
        if (str != null) {
            try {
                code2 = Integer.parseInt(str);
            } catch (Exception e2) {
                AcLogUtil.e("AcIDVerifyUtil", "originalCode parseInt error", e2);
            }
        }
        if (AcConstants.c.VERIFY_RESULT_CODE_CANCEL.equals(acResultData.code)) {
            ResponseEnum responseEnum2 = ResponseEnum.VERIFY_RESULT_CODE_CANCEL;
            code = responseEnum2.code;
            remark = responseEnum2.remark;
        } else if (AcConstants.c.VERIFY_RESULT_CODE_FAILED.equals(acResultData.code)) {
            if (code2 > 0) {
                remark = acResultData.msg;
                code = code2;
            } else {
                ResponseEnum responseEnum3 = ResponseEnum.VERIFY_RESULT_CODE_FAILED;
                code = responseEnum3.code;
                remark = responseEnum3.remark;
            }
        } else if (AcConstants.c.COMPLETE_RESULT_CODE_CANCEL.equals(acResultData.code)) {
            ResponseEnum responseEnum4 = ResponseEnum.COMPLETE_RESULT_CODE_CANCEL;
            code = responseEnum4.code;
            remark = responseEnum4.remark;
        } else if (AcConstants.c.COMPLETE_RESULT_CODE_FAILED.equals(acResultData.code)) {
            if (code2 > 0) {
                remark = acResultData.msg;
                code = code2;
            } else {
                ResponseEnum responseEnum5 = ResponseEnum.COMPLETE_RESULT_CODE_FAILED;
                code = responseEnum5.code;
                remark = responseEnum5.remark;
            }
        } else if (AcConstants.c.COMPLETE_RESULT_CODE_EXIST.equals(acResultData.code)) {
            if (code2 > 0) {
                remark = acResultData.msg;
                code = code2;
            } else {
                ResponseEnum responseEnum6 = ResponseEnum.COMPLETE_RESULT_CODE_EXIST;
                code = responseEnum6.code;
                remark = responseEnum6.remark;
            }
        } else if (AcConstants.c.VERIFY_RESULT_CODE_SUCCESS.equals(acResultData.code) || AcConstants.c.COMPLETE_RESULT_CODE_SUCCESS.equals(acResultData.code)) {
            ResponseEnum responseEnum7 = ResponseEnum.SUCCESS;
            code = responseEnum7.code;
            remark = responseEnum7.remark;
        } else if (code2 > 0) {
            remark = acResultData.msg;
            code = code2;
        }
        AcVerifyResultData acVerifyResultData = new AcVerifyResultData();
        acVerifyResultData.setCode(code);
        acVerifyResultData.setMsg(remark);
        acVerifyResultData.setBusinessId(acResultData.getBusinessId());
        acVerifyResultData.setRequestCode(acResultData.getRequestCode());
        acVerifyResultData.setTicket(acResultData.getTicket());
        return acVerifyResultData;
    }

    @NonNull
    public static Handler g(VerifySysCallBack verifySysCallBack, VerifyParam verifyParam) {
        return new a(Looper.getMainLooper(), verifySysCallBack, verifyParam);
    }

    public static void h(Intent intent, Context context, VerifySysCallBack verifySysCallBack, VerifyParam verifyParam) {
        intent.putExtra(AcConstants.a.a(), xa.d(AcAppInfo.getAppInfo(context, BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE)));
        intent.putExtra(AcConstants.c.KEY_VERIFY_PARAM, e(verifyParam));
        intent.putExtra(AcConstants.c.KEY_MESSENGER, new Messenger(g(verifySysCallBack, verifyParam)));
        intent.putExtra(AcConstants.c.KEY_EXTRA_CALLBACK_SENSE, verifyParam.getExtraCallbackScene());
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Exception e2) {
            AcLogUtil.e("AcIDVerifyUtil", "startAccountApk", e2);
            if ("VERIFY_TYPE".equalsIgnoreCase(verifyParam.getOperateType())) {
                verifySysCallBack.callBack(new AcVerifyResultData(ResponseEnum.VERIFY_RESULT_CODE_FAILED.code, e2.getMessage(), null, verifyParam.getBusinessId(), verifyParam.getRequestCode()));
            } else {
                verifySysCallBack.callBack(new AcVerifyResultData(ResponseEnum.COMPLETE_RESULT_CODE_FAILED.code, e2.getMessage(), null, verifyParam.getBusinessId(), verifyParam.getRequestCode()));
            }
        }
    }
}

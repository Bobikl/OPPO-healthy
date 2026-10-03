package com.oplus.accountsdk.open.callback;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.reflect.TypeToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.base.sdk.verifysystembasic.callback.VerifySysCallBack;
import com.oplus.accountsdk.base.sdk.verifysystembasic.data.AcVerifyResultData;
import com.oplus.aiunit.vision.xa;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes6.dex */
public class AcOpenVerifyResultReceiver extends AcOpenSingleResultReceiver {
    private static final String TAG = "AcOpenVerifyReceiver";
    private final VerifySysCallBack responseCallback;

    public AcOpenVerifyResultReceiver(@NonNull Context context, @NonNull VerifySysCallBack verifySysCallBack) {
        super(context);
        this.responseCallback = verifySysCallBack;
    }

    private void callbackError(int i, String str) {
        if (this.responseCallback == null) {
            AcLogUtil.w(TAG, "callbackError: callback is null");
            return;
        }
        AcVerifyResultData acVerifyResultData = new AcVerifyResultData();
        acVerifyResultData.setCode(i);
        acVerifyResultData.setMsg(str);
        this.responseCallback.callBack(acVerifyResultData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleVerifyResult, reason: merged with bridge method [inline-methods] */
    public void lambda$handleResultOnce$5(AcVerifyResultData acVerifyResultData) {
        if (this.responseCallback == null) {
            AcLogUtil.w(TAG, "handleVerifyResult: callback is null");
        } else if (acVerifyResultData != null) {
            AcLogUtil.i(TAG, "handleVerifyResult: verify success");
            this.responseCallback.callBack(acVerifyResultData);
        } else {
            AcLogUtil.e(TAG, "handleVerifyResult: parse verify data failed");
            callbackError(ResponseEnum.VERIFY_RESULT_CODE_FAILED.getCode(), "verify data parse failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleResultOnce$0() {
        ResponseEnum responseEnum = ResponseEnum.VERIFY_RESULT_CODE_CANCEL;
        callbackError(responseEnum.getCode(), responseEnum.getRemark());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleResultOnce$1() {
        callbackError(ResponseEnum.VERIFY_RESULT_CODE_FAILED.getCode(), "result parse failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleResultOnce$2(String str) {
        callbackError(ResponseEnum.VERIFY_RESULT_CODE_FAILED.getCode(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleResultOnce$3() {
        callbackError(ResponseEnum.VERIFY_RESULT_CODE_FAILED.getCode(), "verify data parse failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleResultOnce$4() {
        callbackError(ResponseEnum.VERIFY_RESULT_CODE_FAILED.getCode(), "ticket is null");
    }

    @Override // com.oplus.accountsdk.open.callback.AcOpenSingleResultReceiver
    @NonNull
    public String getLogTag() {
        return TAG;
    }

    @Override // com.oplus.accountsdk.open.callback.AcOpenSingleResultReceiver
    @Nullable
    public Runnable handleResultOnce(int i, Bundle bundle) {
        AcLogUtil.i(TAG, "onReceiveResult, resultCode=" + i);
        if (i == 0) {
            return new Runnable() { // from class: com.oplus.aiunit.vision.hh
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$handleResultOnce$0();
                }
            };
        }
        AcApiResponse acApiResponse = (AcApiResponse) xa.b(bundle != null ? bundle.getString("data") : null, new TypeToken<AcApiResponse<String>>() { // from class: com.oplus.accountsdk.open.callback.AcOpenVerifyResultReceiver.1
        });
        if (acApiResponse == null) {
            AcLogUtil.e(TAG, "handleResultOnce: parse AcApiResponse failed");
            return new Runnable() { // from class: com.oplus.aiunit.vision.ih
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$handleResultOnce$1();
                }
            };
        }
        if (!acApiResponse.isSuccess()) {
            final String remark = TextUtils.isEmpty(acApiResponse.getMsg()) ? ResponseEnum.VERIFY_RESULT_CODE_FAILED.getRemark() : acApiResponse.getMsg();
            AcLogUtil.e(TAG, "handleResultOnce: api error, code=" + acApiResponse.getCode() + ", msg=" + remark);
            return new Runnable() { // from class: com.oplus.aiunit.vision.jh
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$handleResultOnce$2(remark);
                }
            };
        }
        String str = (String) acApiResponse.getData();
        final AcVerifyResultData acVerifyResultData = (AcVerifyResultData) xa.c(str, AcVerifyResultData.class);
        if (acVerifyResultData == null) {
            AcLogUtil.e(TAG, "handleResultOnce: verify payload null or parse failed, dataEmpty=" + TextUtils.isEmpty(str));
            return new Runnable() { // from class: com.oplus.aiunit.vision.kh
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$handleResultOnce$3();
                }
            };
        }
        if (TextUtils.isEmpty(acVerifyResultData.getTicket())) {
            AcLogUtil.e(TAG, "handleResultOnce: ticket is empty");
            return new Runnable() { // from class: com.oplus.aiunit.vision.lh
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$handleResultOnce$4();
                }
            };
        }
        acVerifyResultData.setCode(ResponseEnum.SUCCESS.getCode());
        return new Runnable() { // from class: com.oplus.aiunit.vision.mh
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$handleResultOnce$5(acVerifyResultData);
            }
        };
    }
}

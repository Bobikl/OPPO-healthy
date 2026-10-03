package com.platform.usercenter.account.ams.ipc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes9.dex */
public class AcResultHelper {
    public static final String KEY_INTENT = "KEY_INTENT";
    public static final String KEY_MSG = "Message";
    public static final String KEY_RESULT = "KEY_RESULT";
    public static final String KEY_RESULT_RECEIVER = "KEY_RESULT_RECEIVER";
    public static final String KEY_SDK_CONFIG = "KEY_SDK_CONFIG";
    public static final String KEY_SDK_RESULT_RECEIVER = "key_sdk_result_receiver";
    private static IAcSdkConfigInjector sdkConfigInjector;

    public interface ErrorCallback {
        void onError(int i, String str);
    }

    public interface SuccessCallback {
        void onSuccess(Bundle bundle);
    }

    public static void analyzeResult(int i, Bundle bundle, SuccessCallback successCallback, ErrorCallback errorCallback) {
        if (i == ResponseEnum.SUCCESS.getCode()) {
            successCallback.onSuccess(bundle);
        } else {
            errorCallback.onError(i, bundle.getString(KEY_MSG, "none msg"));
        }
    }

    public static Bundle getFailResult(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_MSG, str);
        return bundle;
    }

    public static Intent getJumpAction(Bundle bundle) {
        String string = bundle.getString(KEY_INTENT);
        if (string != null) {
            try {
                return Intent.parseUri(string, 1);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Bundle getSuccessResult(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_RESULT, str);
        return bundle;
    }

    public static ResultReceiver receiverForSending(ResultReceiver resultReceiver) {
        Parcel parcelObtain = Parcel.obtain();
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver2;
    }

    public static void sendFailResult(ResultReceiver resultReceiver, int i, String str) {
        sendResult(resultReceiver, i, getFailResult(str));
    }

    public static void sendJumpAction(ResultReceiver resultReceiver, Intent intent) {
        ResultReceiver resultReceiver2 = (ResultReceiver) intent.getParcelableExtra(KEY_SDK_RESULT_RECEIVER);
        intent.removeExtra(KEY_SDK_RESULT_RECEIVER);
        String uri = intent.toUri(1);
        Bundle bundle = new Bundle();
        bundle.putString(KEY_INTENT, uri);
        if (resultReceiver2 != null) {
            bundle.putParcelable(KEY_SDK_RESULT_RECEIVER, receiverForSending(resultReceiver2));
        }
        sendResult(resultReceiver, InnerResponseConstant.CODE_START_ACTIVITY, bundle);
    }

    public static void sendResult(ResultReceiver resultReceiver, int i, Bundle bundle) {
        String sdkConfigJson;
        IAcSdkConfigInjector iAcSdkConfigInjector = sdkConfigInjector;
        if (iAcSdkConfigInjector != null && (sdkConfigJson = iAcSdkConfigInjector.getSdkConfigJson()) != null && !sdkConfigJson.isEmpty()) {
            bundle.putString(KEY_SDK_CONFIG, sdkConfigJson);
        }
        resultReceiver.send(i, bundle);
    }

    public static void sendSuccessResult(ResultReceiver resultReceiver, Bundle bundle) {
        sendResult(resultReceiver, ResponseEnum.SUCCESS.getCode(), bundle);
    }

    public static void setSdkConfigInjector(IAcSdkConfigInjector iAcSdkConfigInjector) {
        sdkConfigInjector = iAcSdkConfigInjector;
    }
}

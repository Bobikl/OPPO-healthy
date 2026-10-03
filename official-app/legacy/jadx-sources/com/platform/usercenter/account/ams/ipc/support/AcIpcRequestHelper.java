package com.platform.usercenter.account.ams.ipc.support;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.platform.usercenter.account.ams.ipc.AcResultHelper;
import com.platform.usercenter.account.ams.ipc.IAmsBinder;
import com.platform.usercenter.account.ams.ipc.IpcRequest;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.account.ams.ipc.support.AcIpcRequestHelper;
import com.platform.usercenter.account.ams.ipc.utils.AcIpcLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class AcIpcRequestHelper {
    private static final String TAG = "AcIpcRequestHelper";

    private static void executeJump(Context context, Intent intent, String str, IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            AcIpcLogUtil.e(TAG, "jumpIntent error", th, str);
            iAcIpcRequestCallback.call(new AcIpcResponse(ResponseEnum.ERROR_JUMP_UNKNOWN.code, null, null));
        }
    }

    private static void handleErrorResult(AcInnerCallbackWrapper acInnerCallbackWrapper, int i, String str, AcIpcResult acIpcResult, IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback) {
        AcIpcBinderProvider.getInstance().unregister(acInnerCallbackWrapper);
        iAcIpcRequestCallback.call(new AcIpcResponse(i, str, acIpcResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleIpcResult(int i, Bundle bundle, String str, AcInnerCallbackWrapper acInnerCallbackWrapper, boolean z, WeakReference<Context> weakReference, ResultReceiver resultReceiver, IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback) {
        AcIpcResult ipcResult = parseIpcResult(bundle, str);
        if (i == ResponseEnum.SUCCESS.getCode()) {
            handleSuccessResult(acInnerCallbackWrapper, ipcResult, iAcIpcRequestCallback);
            return;
        }
        String string = bundle.getString(AcResultHelper.KEY_MSG);
        AcIpcLogUtil.e(TAG, "onReceiveResult error: code " + i + ", msg " + string, str);
        if (i != -32001) {
            handleErrorResult(acInnerCallbackWrapper, i, string, ipcResult, iAcIpcRequestCallback);
        } else {
            handleJumpRequest(z, weakReference, ipcResult, str, acInnerCallbackWrapper, resultReceiver, iAcIpcRequestCallback);
        }
    }

    private static void handleJumpRequest(boolean z, WeakReference<Context> weakReference, AcIpcResult acIpcResult, String str, AcInnerCallbackWrapper acInnerCallbackWrapper, ResultReceiver resultReceiver, IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback) {
        if (z && weakReference.get() != null) {
            jumpIntent(str, weakReference, acIpcResult.getIntent(), resultReceiver, iAcIpcRequestCallback);
            return;
        }
        AcIpcLogUtil.e(TAG, "contextRef is null needJump = " + z, str);
        AcIpcBinderProvider.getInstance().unregister(acInnerCallbackWrapper);
        iAcIpcRequestCallback.call(new AcIpcResponse(ResponseEnum.ERROR_JUMP_CONTEXT_ERROR.code, null, acIpcResult));
    }

    private static void handleSuccessResult(AcInnerCallbackWrapper acInnerCallbackWrapper, AcIpcResult acIpcResult, IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback) {
        AcIpcBinderProvider.getInstance().unregister(acInnerCallbackWrapper);
        iAcIpcRequestCallback.call(new AcIpcResponse(ResponseEnum.SUCCESS.code, null, acIpcResult));
    }

    private static void jumpIntent(String str, WeakReference<Context> weakReference, Intent intent, ResultReceiver resultReceiver, IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback) {
        if (validateJumpParams(intent, weakReference, str, iAcIpcRequestCallback)) {
            Context context = weakReference.get();
            prepareIntentForJump(intent, context, resultReceiver);
            executeJump(context, intent, str, iAcIpcRequestCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestIpc$0(IAcIpcRequestCallback iAcIpcRequestCallback, Object obj) {
        iAcIpcRequestCallback.call((AcIpcResponse) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestIpc$1(String str, boolean z, Context context, WeakReference weakReference, IpcRequest ipcRequest, IAcIpcRequestCallback iAcIpcRequestCallback, IAcIpcUriProvider iAcIpcUriProvider, AcInnerCallbackWrapper acInnerCallbackWrapper, Object obj) {
        AcIpcResponse acIpcResponse = (AcIpcResponse) obj;
        if (acIpcResponse.getCode() != ResponseEnum.REMOTE_SERVICE_DEAD.getCode()) {
            iAcIpcRequestCallback.call(acIpcResponse);
            return;
        }
        AcIpcLogUtil.i(TAG, "binder died, retry once, traceId=" + str);
        requestIpcInternal(z, true, context, weakReference, ipcRequest, str, iAcIpcRequestCallback, iAcIpcUriProvider, acInnerCallbackWrapper);
    }

    private static AcIpcResult parseIpcResult(Bundle bundle, String str) {
        AcIpcResult acIpcResult = new AcIpcResult();
        String string = bundle.getString(AcResultHelper.KEY_SDK_CONFIG, "");
        String string2 = bundle.getString(AcResultHelper.KEY_RESULT);
        String string3 = bundle.getString(AcResultHelper.KEY_INTENT);
        ResultReceiver resultReceiver = (ResultReceiver) bundle.getParcelable(AcResultHelper.KEY_SDK_RESULT_RECEIVER);
        acIpcResult.setConfigJson(string);
        acIpcResult.setResponseJson(string2);
        if (string3 != null) {
            try {
                Intent uri = Intent.parseUri(string3, 1);
                uri.putExtra(AcResultHelper.KEY_SDK_RESULT_RECEIVER, resultReceiver);
                acIpcResult.setIntent(uri);
            } catch (Exception e2) {
                AcIpcLogUtil.e(TAG, "parseUri error: " + e2.getMessage(), str);
            }
        }
        return acIpcResult;
    }

    private static void prepareIntentForJump(Intent intent, Context context, ResultReceiver resultReceiver) {
        intent.putExtra(AcResultHelper.KEY_RESULT_RECEIVER, receiverForSending(resultReceiver));
        if (context instanceof Activity) {
            return;
        }
        intent.addFlags(268435456);
    }

    private static ResultReceiver receiverForSending(ResultReceiver resultReceiver) {
        Parcel parcelObtain = Parcel.obtain();
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver2;
    }

    public static void requestIpc(final boolean z, final Context context, final WeakReference<Context> weakReference, final IpcRequest ipcRequest, final String str, final IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback, final IAcIpcUriProvider iAcIpcUriProvider) {
        final AcInnerCallbackWrapper acInnerCallbackWrapper = new AcInnerCallbackWrapper(str, new IAcIpcRequestCallback() { // from class: com.oplus.aiunit.vision.qa
            @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback
            public final void call(Object obj) {
                AcIpcRequestHelper.lambda$requestIpc$0(iAcIpcRequestCallback, obj);
            }
        });
        requestIpcInternal(z, z, context, weakReference, ipcRequest, str, iAcIpcRequestCallback, iAcIpcUriProvider, new AcInnerCallbackWrapper(str, new IAcIpcRequestCallback() { // from class: com.oplus.aiunit.vision.ra
            @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback
            public final void call(Object obj) {
                AcIpcRequestHelper.lambda$requestIpc$1(str, z, context, weakReference, ipcRequest, iAcIpcRequestCallback, iAcIpcUriProvider, acInnerCallbackWrapper, obj);
            }
        }));
    }

    private static void requestIpcInternal(final boolean z, boolean z2, Context context, final WeakReference<Context> weakReference, IpcRequest ipcRequest, final String str, final IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback, IAcIpcUriProvider iAcIpcUriProvider, final AcInnerCallbackWrapper acInnerCallbackWrapper) {
        IAmsBinder iAmsBinder = AcIpcBinderProvider.getInstance().get(context.getApplicationContext(), z2, str, iAcIpcUriProvider);
        if (iAmsBinder == null) {
            AcIpcLogUtil.e(TAG, "request error: binder is null", str);
            iAcIpcRequestCallback.call(new AcIpcResponse(ResponseEnum.REMOTE_UNKNOWN_ERROR.getCode(), "require binder is null", null));
            return;
        }
        AcIpcBinderProvider.getInstance().register(acInnerCallbackWrapper);
        try {
            iAmsBinder.execute(ipcRequest, new ResultReceiver(null) { // from class: com.platform.usercenter.account.ams.ipc.support.AcIpcRequestHelper.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i, Bundle bundle) {
                    AcIpcRequestHelper.handleIpcResult(i, bundle, str, acInnerCallbackWrapper, z, weakReference, this, iAcIpcRequestCallback);
                }
            });
        } catch (Throwable th) {
            AcIpcBinderProvider.getInstance().unregister(acInnerCallbackWrapper);
            if (th instanceof DeadObjectException) {
                AcIpcLogUtil.e(TAG, "request error: binder dead on execute", str);
                acInnerCallbackWrapper.getCallback().call(new AcIpcResponse(ResponseEnum.REMOTE_SERVICE_DEAD.getCode(), th.getMessage(), null));
                return;
            }
            AcIpcLogUtil.e(TAG, "request error: " + th, str);
            acInnerCallbackWrapper.getCallback().call(new AcIpcResponse(ResponseEnum.REMOTE_UNKNOWN_ERROR.getCode(), th.toString(), null));
        }
    }

    private static boolean validateJumpParams(Intent intent, WeakReference<Context> weakReference, String str, IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback) {
        if (intent == null) {
            AcIpcLogUtil.e(TAG, "jumpIntent failed: intent is null", str);
            iAcIpcRequestCallback.call(new AcIpcResponse(ResponseEnum.ERROR_JUMP_INTENT_NULL.code, null, null));
            return false;
        }
        if (weakReference.get() != null) {
            return true;
        }
        AcIpcLogUtil.e(TAG, "jumpIntent failed: context is null", str);
        iAcIpcRequestCallback.call(new AcIpcResponse(ResponseEnum.ERROR_JUMP_CONTEXT_ERROR.code, null, null));
        return false;
    }
}

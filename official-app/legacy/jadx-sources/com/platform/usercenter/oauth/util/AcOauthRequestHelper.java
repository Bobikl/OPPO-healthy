package com.platform.usercenter.oauth.util;

import android.content.Context;
import androidx.annotation.Keep;
import com.platform.usercenter.account.ams.api.AcOauthCallback;
import com.platform.usercenter.account.ams.bean.AcOauthApiResponse;
import com.platform.usercenter.account.ams.ipc.AcBasicInfoBean;
import com.platform.usercenter.account.ams.ipc.IpcRequest;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.account.ams.ipc.support.AcIpcRequestHelper;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthRequestHelper {
    private static final String TAG = "AcOauthRequestHelper";

    public static class AcRequestHelperHolder {
        private static final AcOauthRequestHelper sINSTANCE = new AcOauthRequestHelper();

        private AcRequestHelperHolder() {
        }
    }

    public static AcOauthRequestHelper getInstance() {
        return AcRequestHelperHolder.sINSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleIpcResponse, reason: merged with bridge method [inline-methods] */
    public <R> void lambda$requestIpc$0(AcIpcResponse acIpcResponse, Class<R> cls, String str, AcOauthCallback<AcOauthApiResponse<R>> acOauthCallback) {
        int code = acIpcResponse.getCode();
        ResponseEnum responseEnum = ResponseEnum.SUCCESS;
        if (code != responseEnum.getCode()) {
            acOauthCallback.call(new AcOauthApiResponse<>(acIpcResponse.getCode(), acIpcResponse.getMsg(), null));
            return;
        }
        String responseJson = acIpcResponse.getData().getResponseJson();
        if (acIpcResponse.getData() == null || responseJson == null) {
            AcOauthLogUtil.e(TAG, "onReceiveResult: responseJson is null, traceId: " + str);
            ResponseEnum responseEnum2 = ResponseEnum.REMOTE_DATA_NULL;
            acOauthCallback.call(new AcOauthApiResponse<>(responseEnum2.getCode(), responseEnum2.getRemark(), null));
            return;
        }
        Object objStringToClassByTypeToken = cls == null ? AcOauthJsonUtils.stringToClassByTypeToken(responseJson) : AcOauthJsonUtils.stringToClass(responseJson, cls);
        StringBuilder sb = new StringBuilder();
        sb.append("onReceiveResult, data is null? ");
        sb.append(objStringToClassByTypeToken == null);
        sb.append(", traceId: ");
        sb.append(str);
        AcOauthLogUtil.i(TAG, sb.toString());
        if (objStringToClassByTypeToken != null) {
            acOauthCallback.call(new AcOauthApiResponse<>(responseEnum.getCode(), null, objStringToClassByTypeToken));
        } else {
            ResponseEnum responseEnum3 = ResponseEnum.REMOTE_DATA_NULL;
            acOauthCallback.call(new AcOauthApiResponse<>(responseEnum3.getCode(), responseEnum3.getRemark(), null));
        }
    }

    public <R> void requestIpc(boolean z, Context context, IpcRequest ipcRequest, AcBasicInfoBean acBasicInfoBean, final Class<R> cls, final String str, final AcOauthCallback<AcOauthApiResponse<R>> acOauthCallback) {
        WeakReference weakReference = new WeakReference(context);
        ipcRequest.setBasicInfo(AcOauthJsonUtils.toJson(acBasicInfoBean));
        AcIpcRequestHelper.requestIpc(z, context, weakReference, ipcRequest, str, new IAcIpcRequestCallback() { // from class: com.oplus.aiunit.vision.qb
            @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback
            public final void call(Object obj) {
                this.a.lambda$requestIpc$0(cls, str, acOauthCallback, (AcIpcResponse) obj);
            }
        }, AcOauthBinderProvider.getInstance());
    }

    public <R> void requestIpcComplexParsing(boolean z, Context context, IpcRequest ipcRequest, AcBasicInfoBean acBasicInfoBean, String str, AcOauthCallback<AcOauthApiResponse<R>> acOauthCallback) {
        requestIpc(z, context, ipcRequest, acBasicInfoBean, null, str, acOauthCallback);
    }

    private AcOauthRequestHelper() {
    }
}

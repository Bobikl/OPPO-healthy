package com.heytap.msp;

import android.os.RemoteException;
import android.text.TextUtils;
import com.heytap.msp.bean.Request;
import com.heytap.msp.bean.Response;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.heytap.msp.sdk.base.callback.InternalCallback;
import com.heytap.msp.sdk.base.common.log.MspLog;
import com.heytap.msp.sdk.base.common.util.AppUtils;
import com.heytap.msp.sdk.base.common.util.JsonUtil;

/* JADX INFO: loaded from: classes19.dex */
public class a extends IBizClientProxy.Stub {

    /* JADX INFO: renamed from: com.heytap.msp.a$a, reason: collision with other inner class name */
    public class C0715a implements InternalCallback<Response> {
        public final /* synthetic */ IBizBinderCallback a;

        public C0715a(IBizBinderCallback iBizBinderCallback) {
            this.a = iBizBinderCallback;
        }

        @Override // com.heytap.msp.sdk.base.callback.InternalCallback
        public void callback(Response response) {
            IpcResponse ipcResponse = new IpcResponse();
            ipcResponse.setCode(response.getCode());
            ipcResponse.setMessage(response.getMessage());
            ipcResponse.setData(JsonUtil.beanToJson(response));
            try {
                MspLog.d("BizClientImpl", "BizClientImpl ipcResponse:" + ipcResponse.toString());
                this.a.call(ipcResponse);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    private IpcResponse a() {
        Response responseCreate = Response.create(10502, "AIDL remote exception:calling package name is invalid.");
        IpcResponse ipcResponse = new IpcResponse();
        ipcResponse.setCode(responseCreate.getCode());
        ipcResponse.setMessage(responseCreate.getMessage());
        ipcResponse.setData(JsonUtil.beanToJson(responseCreate));
        MspLog.e("BizClientImpl", ipcResponse.toString());
        return ipcResponse;
    }

    @Override // com.heytap.msp.IBizClientProxy
    public void execute(IpcRequest ipcRequest, IBizBinderCallback iBizBinderCallback) throws RemoteException {
        MspLog.d("BizClientImpl", "request from server " + ipcRequest.toString());
        Request request = (Request) JsonUtil.jsonToBean(ipcRequest.getParams(), Request.class);
        if (a(request)) {
            BaseSdkAgent.getInstance().dispatchMsg(request, new C0715a(iBizBinderCallback));
        } else {
            iBizBinderCallback.call(a());
        }
    }

    @Override // com.heytap.msp.IBizClientProxy
    public IpcResponse syncExecute(IpcRequest ipcRequest) {
        MspLog.d("BizClientImpl", "syncExecute: request from server " + ipcRequest.toString());
        Request request = (Request) JsonUtil.jsonToBean(ipcRequest.getParams(), Request.class);
        if (!a(request)) {
            return a();
        }
        Response responseDispatchMsg = BaseSdkAgent.getInstance().dispatchMsg(request);
        IpcResponse ipcResponse = new IpcResponse();
        ipcResponse.setCode(responseDispatchMsg.getCode());
        ipcResponse.setMessage(responseDispatchMsg.getMessage());
        ipcResponse.setData(JsonUtil.beanToJson(responseDispatchMsg));
        return ipcResponse;
    }

    public boolean a(Request request) {
        return TextUtils.equals(request.getBaseRequest().getAppPackageName(), AppUtils.getPackageName());
    }
}

package com.heytap.epona.interceptor;

import android.os.RemoteException;
import com.heytap.epona.IRemoteTransfer;
import com.heytap.epona.ITransferCallback;
import com.heytap.epona.Request;
import com.heytap.epona.Response;
import com.heytap.epona.ipc.local.RemoteTransfer;
import com.oplus.aiunit.vision.fea;
import com.oplus.aiunit.vision.s7b;
import com.oplus.aiunit.vision.vr2;

/* JADX INFO: loaded from: classes15.dex */
public class CallIPCComponentInterceptor implements fea {
    @Override // com.oplus.aiunit.vision.fea
    public void a(fea.a aVar) {
        final Request request = aVar.request();
        IRemoteTransfer iRemoteTransferFindRemoteTransfer = RemoteTransfer.getInstance().findRemoteTransfer(request.getComponentName());
        if (iRemoteTransferFindRemoteTransfer == null) {
            aVar.a();
            return;
        }
        final vr2 vr2VarCallback = aVar.callback();
        try {
            if (aVar.b()) {
                iRemoteTransferFindRemoteTransfer.asyncCall(request, new ITransferCallback.Stub() { // from class: com.heytap.epona.interceptor.CallIPCComponentInterceptor.1
                    @Override // com.heytap.epona.ITransferCallback
                    public void onReceive(Response response) throws RemoteException {
                        s7b.b("CallIPCComponentInterceptor", "Component(%s).Action(%s) response : %s", request.getComponentName(), request.getActionName(), response);
                        vr2VarCallback.onReceive(response);
                    }
                });
            } else {
                Response responseCall = iRemoteTransferFindRemoteTransfer.call(request);
                s7b.b("CallIPCComponentInterceptor", "Component(%s).Action(%s) response : %s", request.getComponentName(), request.getActionName(), responseCall);
                vr2VarCallback.onReceive(responseCall);
            }
        } catch (RemoteException e2) {
            s7b.c("CallIPCComponentInterceptor", "fail to call %s#%s and exception is %s", request.getComponentName(), request.getActionName(), e2.toString());
            vr2VarCallback.onReceive(Response.defaultErrorResponse());
        }
    }
}

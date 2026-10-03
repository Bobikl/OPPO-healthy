package com.oplus.epona.interceptor;

import android.os.RemoteException;
import com.oplus.aiunit.vision.ep6;
import com.oplus.aiunit.vision.iea;
import com.oplus.aiunit.vision.l7b;
import com.oplus.epona.Call$Callback;
import com.oplus.epona.IRemoteTransfer;
import com.oplus.epona.ITransferCallback;
import com.oplus.epona.Request;
import com.oplus.epona.Response;

/* JADX INFO: loaded from: classes2.dex */
public class IPCInterceptor implements iea {
    @Override // com.oplus.aiunit.vision.iea
    public void a(iea.a aVar) {
        Request request = aVar.request();
        IRemoteTransfer iRemoteTransferAsInterface = IRemoteTransfer.Stub.asInterface(ep6.m().a(request.getComponentName()));
        if (iRemoteTransferAsInterface == null) {
            aVar.a();
            return;
        }
        final Call$Callback call$CallbackCallback = aVar.callback();
        try {
            if (aVar.b()) {
                iRemoteTransferAsInterface.asyncCall(request, new ITransferCallback.Stub() { // from class: com.oplus.epona.interceptor.IPCInterceptor.1
                    @Override // com.oplus.epona.ITransferCallback
                    public void onReceive(Response response) throws RemoteException {
                        call$CallbackCallback.onReceive(response);
                    }
                });
            } else {
                call$CallbackCallback.onReceive(iRemoteTransferAsInterface.call(request));
            }
        } catch (RemoteException e2) {
            l7b.d("Epona->IPCInterceptor", "fail to call %s#%s and exception is %s", request.getComponentName(), request.getActionName(), e2.toString());
            call$CallbackCallback.onReceive(Response.defaultErrorResponse());
        }
    }
}

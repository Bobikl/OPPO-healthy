package com.oplus.epona.ipc.local;

import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.aiunit.vision.ep6;
import com.oplus.aiunit.vision.l7b;
import com.oplus.epona.Call$Callback;
import com.oplus.epona.IRemoteTransfer;
import com.oplus.epona.ITransferCallback;
import com.oplus.epona.Request;
import com.oplus.epona.Response;
import com.oplus.epona.ipc.local.RemoteTransfer;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteTransfer extends IRemoteTransfer.Stub {
    private static final String TAG = "Epona->RemoteTransfer";
    private static volatile RemoteTransfer sInstance;

    private RemoteTransfer() {
    }

    public static RemoteTransfer getInstance() {
        if (sInstance == null) {
            synchronized (RemoteTransfer.class) {
                if (sInstance == null) {
                    sInstance = new RemoteTransfer();
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$asyncCall$0(ITransferCallback iTransferCallback, Response response) {
        try {
            iTransferCallback.onReceive(response);
        } catch (RemoteException e2) {
            l7b.d(TAG, "failed to asyncCall and exception is %s", e2.toString());
        }
    }

    @Override // com.oplus.epona.IRemoteTransfer
    public void asyncCall(Request request, final ITransferCallback iTransferCallback) throws RemoteException {
        ep6.o(request).c(new Call$Callback() { // from class: com.oplus.aiunit.vision.rof
            @Override // com.oplus.epona.Call$Callback
            public final void onReceive(Response response) {
                RemoteTransfer.lambda$asyncCall$0(iTransferCallback, response);
            }
        });
    }

    @Override // com.oplus.epona.IRemoteTransfer
    public Response call(Request request) throws RemoteException {
        return ep6.o(request).d();
    }

    @Override // com.oplus.epona.IRemoteTransfer.Stub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        try {
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (RuntimeException e2) {
            l7b.d(TAG, "onTransact Exception: " + e2.toString(), new Object[0]);
            throw e2;
        }
    }
}

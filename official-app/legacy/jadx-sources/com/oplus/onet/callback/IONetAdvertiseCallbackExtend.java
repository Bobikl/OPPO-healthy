package com.oplus.onet.callback;

import android.os.IBinder;
import android.os.RemoteException;
import com.oplus.onet.device.ONetDevice;

/* JADX INFO: loaded from: classes8.dex */
public abstract class IONetAdvertiseCallbackExtend extends IONetAdvertiseCallback.Stub {
    @Override // com.oplus.onet.callback.IONetAdvertiseCallback.Stub, android.os.IInterface
    public IBinder asBinder() {
        return super.asBinder();
    }

    public void onAdvertiseFailure() throws RemoteException {
    }

    public void onAdvertiseStart() throws RemoteException {
    }

    public void onAdvertiseStopped() throws RemoteException {
    }

    public void onAdvertiseSuccess() throws RemoteException {
    }

    public int onPairFailure(ONetDevice oNetDevice, int i) throws RemoteException {
        return 0;
    }

    public int onPairSuccess(ONetDevice oNetDevice) throws RemoteException {
        return 0;
    }
}

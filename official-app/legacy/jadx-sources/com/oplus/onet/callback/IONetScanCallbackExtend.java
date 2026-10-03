package com.oplus.onet.callback;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.onet.device.ONetDevice;

/* JADX INFO: loaded from: classes8.dex */
public abstract class IONetScanCallbackExtend extends IONetScanCallback.Stub {
    @Override // com.oplus.onet.callback.IONetScanCallback.Stub, android.os.IInterface
    public IBinder asBinder() {
        return super.asBinder();
    }

    public void onDeviceFound(ONetDevice oNetDevice) throws RemoteException {
    }

    public void onDeviceLost(ONetDevice oNetDevice) throws RemoteException {
    }

    public void onScanStop() throws RemoteException {
    }

    @Override // com.oplus.onet.callback.IONetScanCallback.Stub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return super.onTransact(i, parcel, parcel2, i2);
    }
}

package com.oplus.onet.callback;

import android.os.IBinder;
import android.os.RemoteException;
import com.oplus.onet.device.ONetDevice;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ILinkManagerExtend extends ILinkManager.Stub {
    @Override // com.oplus.onet.callback.ILinkManager.Stub, android.os.IInterface
    public IBinder asBinder() {
        return super.asBinder();
    }

    public void onDeviceConnected(ONetDevice oNetDevice) throws RemoteException {
    }

    public void onDeviceDisconnected(ONetDevice oNetDevice) throws RemoteException {
    }

    public void onDormant(ONetDevice oNetDevice, boolean z) throws RemoteException {
    }

    public void onError(ONetDevice oNetDevice, int i) throws RemoteException {
    }

    public byte[] onPairData(int i, int i2) throws RemoteException {
        return new byte[0];
    }
}

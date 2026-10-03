package com.oplus.onet.callback;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.oplus.aiunit.vision.d3d;
import com.oplus.onet.device.ONetDevice;

/* JADX INFO: loaded from: classes8.dex */
public class IONetAdvertiseCallbackExtendImpl extends IONetAdvertiseCallbackExtend {
    private static final String TAG = "IONetAdvertiseCallbackExtendImpl";
    private IONetAdvertiseCallback mONetAdvertiseCallback;

    public IONetAdvertiseCallbackExtendImpl(IONetAdvertiseCallback iONetAdvertiseCallback) {
        this.mONetAdvertiseCallback = iONetAdvertiseCallback;
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallbackExtend, com.oplus.onet.callback.IONetAdvertiseCallback.Stub, android.os.IInterface
    public IBinder asBinder() {
        return super.asBinder();
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallbackExtend
    public void onAdvertiseFailure() throws RemoteException {
        onAdvertiseFailure(new Bundle());
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallbackExtend
    public void onAdvertiseStart() throws RemoteException {
        d3d.b(TAG, "onAdvertiseStart");
        onAdvertiseStart(new Bundle());
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallbackExtend
    public void onAdvertiseStopped() throws RemoteException {
        onAdvertiseStopped(new Bundle());
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallbackExtend
    public void onAdvertiseSuccess() throws RemoteException {
        d3d.b(TAG, "onAdvertiseSuccess:");
        onAdvertiseSuccess(new Bundle());
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallbackExtend
    public int onPairFailure(ONetDevice oNetDevice, int i) throws RemoteException {
        d3d.b(TAG, "onPairFailure:i" + i);
        return onPairFailure(oNetDevice, i, new Bundle());
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallbackExtend
    public int onPairSuccess(ONetDevice oNetDevice) throws RemoteException {
        return onPairSuccess(oNetDevice, new Bundle());
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallback
    public int onRequestAuthenticate(ONetDevice oNetDevice, ONetAuthenticateMessage oNetAuthenticateMessage) throws RemoteException {
        d3d.b(TAG, "onRequestAuthenticate:authenticateMessage=" + oNetAuthenticateMessage);
        return this.mONetAdvertiseCallback.onRequestAuthenticate(oNetDevice, oNetAuthenticateMessage);
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallback
    public int onRequestConnect(ONetDevice oNetDevice, ONetConnectMessage oNetConnectMessage) throws RemoteException {
        d3d.b(TAG, "onRequestConnect:connectMessage=" + oNetConnectMessage);
        return this.mONetAdvertiseCallback.onRequestConnect(oNetDevice, oNetConnectMessage);
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallback
    public void onAdvertiseFailure(Bundle bundle) throws RemoteException {
        this.mONetAdvertiseCallback.onAdvertiseFailure(bundle);
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallback
    public void onAdvertiseStopped(Bundle bundle) throws RemoteException {
        this.mONetAdvertiseCallback.onAdvertiseStopped(bundle);
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallback
    public int onPairSuccess(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
        d3d.b(TAG, "onPairSuccess:");
        return this.mONetAdvertiseCallback.onPairSuccess(oNetDevice, bundle);
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallback
    public void onAdvertiseStart(Bundle bundle) throws RemoteException {
        d3d.b(TAG, "onAdvertiseStart:extraDat" + bundle);
        this.mONetAdvertiseCallback.onAdvertiseStart(bundle);
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallback
    public void onAdvertiseSuccess(Bundle bundle) throws RemoteException {
        this.mONetAdvertiseCallback.onAdvertiseSuccess(bundle);
    }

    @Override // com.oplus.onet.callback.IONetAdvertiseCallback
    public int onPairFailure(ONetDevice oNetDevice, int i, Bundle bundle) throws RemoteException {
        d3d.b(TAG, "onPairFailure:i=" + i + ", deviceInfo=" + oNetDevice);
        return this.mONetAdvertiseCallback.onPairFailure(oNetDevice, i, bundle);
    }
}

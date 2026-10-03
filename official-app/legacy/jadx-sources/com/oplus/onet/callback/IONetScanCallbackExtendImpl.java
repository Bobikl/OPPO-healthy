package com.oplus.onet.callback;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.oplus.aiunit.vision.d3d;
import com.oplus.aiunit.vision.zqm;
import com.oplus.onet.device.ONetDevice;

/* JADX INFO: loaded from: classes8.dex */
public class IONetScanCallbackExtendImpl extends IONetScanCallbackExtend {
    public static final String TAG = "IONetScanCallbackExtendImpl";
    private IONetScanCallback mScanCallback;

    public IONetScanCallbackExtendImpl(IONetScanCallback iONetScanCallback) {
        d3d.b(TAG, "IONetScanCallbackExtendImpl :IONetScanCallback=" + iONetScanCallback);
        this.mScanCallback = iONetScanCallback;
    }

    @Override // com.oplus.onet.callback.IONetScanCallbackExtend, com.oplus.onet.callback.IONetScanCallback.Stub, android.os.IInterface
    public IBinder asBinder() {
        return super.asBinder();
    }

    @Override // com.oplus.onet.callback.IONetScanCallbackExtend
    public void onDeviceFound(ONetDevice oNetDevice) throws RemoteException {
        d3d.b(TAG, "onDeviceFound:");
        onDeviceFound(oNetDevice, new Bundle());
    }

    @Override // com.oplus.onet.callback.IONetScanCallbackExtend
    public void onDeviceLost(ONetDevice oNetDevice) throws RemoteException {
        d3d.b(TAG, "onDeviceLost:");
        onDeviceLost(oNetDevice, new Bundle());
    }

    @Override // com.oplus.onet.callback.IONetScanCallbackExtend
    public void onScanStop() throws RemoteException {
        onScanStop(new Bundle());
    }

    @Override // com.oplus.onet.callback.IONetScanCallback
    public void onScanStop(Bundle bundle) throws RemoteException {
        d3d.b(TAG, "onScanStop:extraData=" + bundle);
        this.mScanCallback.onScanStop(bundle);
    }

    @Override // com.oplus.onet.callback.IONetScanCallback
    public void onDeviceFound(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
        String str = TAG;
        StringBuilder sbA = zqm.a("onDeviceFound:deviceInfo=");
        sbA.append(oNetDevice.toString());
        sbA.append(", extraData=");
        sbA.append(bundle);
        d3d.b(str, sbA.toString());
        try {
            this.mScanCallback.onDeviceFound(oNetDevice, bundle);
        } catch (Exception e2) {
            String str2 = TAG;
            StringBuilder sbA2 = zqm.a("onDeviceFound Exception: ");
            sbA2.append(e2.toString());
            d3d.c(str2, sbA2.toString());
        }
    }

    @Override // com.oplus.onet.callback.IONetScanCallback
    public void onDeviceLost(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
        String str = TAG;
        StringBuilder sbA = zqm.a("onDeviceLost:deviceInfo=");
        sbA.append(oNetDevice.toString());
        d3d.b(str, sbA.toString());
        try {
            this.mScanCallback.onDeviceLost(oNetDevice, bundle);
        } catch (Exception e2) {
            String str2 = TAG;
            StringBuilder sbA2 = zqm.a("onDeviceLost Exception: ");
            sbA2.append(e2.toString());
            d3d.c(str2, sbA2.toString());
        }
    }
}

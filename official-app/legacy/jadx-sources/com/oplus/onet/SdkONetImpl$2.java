package com.oplus.onet;

import android.os.Bundle;
import android.os.RemoteException;
import com.oplus.aiunit.vision.e3d;
import com.oplus.aiunit.vision.it9;
import com.oplus.aiunit.vision.zqm;
import com.oplus.onet.callback.ILinkManager;
import com.oplus.onet.device.ONetDevice;

/* JADX INFO: loaded from: classes8.dex */
class SdkONetImpl$2 extends ILinkManager.Stub {

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final /* synthetic */ a f146do;

    public SdkONetImpl$2(a aVar) {
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final void onDeviceConnected(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final void onDeviceDisconnected(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final void onDormant(ONetDevice oNetDevice, boolean z, Bundle bundle) throws RemoteException {
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final void onError(ONetDevice oNetDevice, int i, Bundle bundle) throws RemoteException {
        try {
            throw null;
        } catch (Exception e2) {
            it9 it9Var = a.f147class;
            StringBuilder sbA = zqm.a("onError: Exception:");
            sbA.append(e2.toString());
            e3d.a("try", sbA.toString());
        }
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final void onLinkManagerReady() throws RemoteException {
        throw null;
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final byte[] onPairData(int i, int i2, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final int onPairTypeReceived(ONetDevice oNetDevice, int i) throws RemoteException {
        throw null;
    }
}

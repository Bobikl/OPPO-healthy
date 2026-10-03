package com.oplus.onet;

import android.os.Bundle;
import android.os.RemoteException;
import com.oplus.aiunit.vision.e3d;
import com.oplus.aiunit.vision.it9;
import com.oplus.aiunit.vision.oxm;
import com.oplus.aiunit.vision.zqm;
import com.oplus.onet.callback.ILinkManagerExtend;
import com.oplus.onet.device.ONetDevice;

/* JADX INFO: loaded from: classes8.dex */
public class ILinkManagerExtendImpl extends ILinkManagerExtend {

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public oxm f140do;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public it9 f141for;

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public volatile boolean f142if;

    public ILinkManagerExtendImpl(oxm oxmVar, boolean z, it9 it9Var) {
        this.f142if = false;
        this.f142if = z;
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final void onDeviceConnected(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
        StringBuilder sbA = zqm.a("ILinkManagerExtendImpl:onDeviceConnected:oNetDvd=");
        sbA.append(oNetDevice.toString());
        e3d.a("ILinkManagerExtendImpl", sbA.toString());
        throw null;
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final void onDeviceDisconnected(ONetDevice oNetDevice, Bundle bundle) throws RemoteException {
        StringBuilder sbA = zqm.a("ILinkManagerExtendImpl:onDeviceDisconnected:dvd=");
        sbA.append(oNetDevice.toString());
        e3d.a("ILinkManagerExtendImpl", sbA.toString());
        throw null;
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final void onDormant(ONetDevice oNetDevice, boolean z, Bundle bundle) throws RemoteException {
    }

    @Override // com.oplus.onet.callback.ILinkManagerExtend
    public final void onError(ONetDevice oNetDevice, int i) throws RemoteException {
        e3d.a("ILinkManagerExtendImpl", "ILinkManagerExtendImpl:onError:errCode=" + i);
        onError(oNetDevice, i, new Bundle());
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final void onLinkManagerReady() throws RemoteException {
        StringBuilder sbA = zqm.a("ILinkManagerExtendImpl:onLinkManagerReady:mIsInitialized=");
        sbA.append(this.f142if);
        e3d.a("ILinkManagerExtendImpl", sbA.toString());
    }

    @Override // com.oplus.onet.callback.ILinkManagerExtend
    public final byte[] onPairData(int i, int i2) throws RemoteException {
        return onPairData(i, i2, new Bundle());
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final int onPairTypeReceived(ONetDevice oNetDevice, int i) throws RemoteException {
        e3d.a("ILinkManagerExtendImpl", "ILinkManagerExtendImpl:onPairTypeReceived:supportedConnectionType=" + i);
        throw null;
    }

    @Override // com.oplus.onet.callback.ILinkManagerExtend
    public final void onDormant(ONetDevice oNetDevice, boolean z) throws RemoteException {
        onDormant(oNetDevice, z, new Bundle());
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final byte[] onPairData(int i, int i2, Bundle bundle) throws RemoteException {
        e3d.a("ILinkManagerExtendImpl", "ILinkManagerExtendImpl:onPairData:authMode=" + i + ", authLimitLen=" + i2);
        throw null;
    }

    @Override // com.oplus.onet.callback.ILinkManager
    public final void onError(ONetDevice oNetDevice, int i, Bundle bundle) throws RemoteException {
        e3d.a("ILinkManagerExtendImpl", "ILinkManagerExtendImpl:onError:errCode=" + i + ", dvd=" + oNetDevice.toString());
        try {
            throw null;
        } catch (Exception e2) {
            StringBuilder sbA = zqm.a("onError: Exception:");
            sbA.append(e2.toString());
            e3d.a("ILinkManagerExtendImpl", sbA.toString());
        }
    }

    @Override // com.oplus.onet.callback.ILinkManagerExtend
    public final void onDeviceConnected(ONetDevice oNetDevice) throws RemoteException {
        onDeviceConnected(oNetDevice, new Bundle());
    }

    @Override // com.oplus.onet.callback.ILinkManagerExtend
    public final void onDeviceDisconnected(ONetDevice oNetDevice) throws RemoteException {
        onDeviceDisconnected(oNetDevice, new Bundle());
    }
}

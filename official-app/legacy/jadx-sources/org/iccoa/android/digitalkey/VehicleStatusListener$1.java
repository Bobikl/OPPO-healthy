package org.iccoa.android.digitalkey;

import android.os.RemoteException;
import com.oplus.aiunit.vision.quk;

/* JADX INFO: loaded from: classes11.dex */
class VehicleStatusListener$1 extends IVehicleStatusListener.Stub {
    final /* synthetic */ quk this$0;

    public VehicleStatusListener$1(quk qukVar) {
    }

    @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
    public void onBleAuthStatusChange(byte[] bArr, int i) throws RemoteException {
        throw null;
    }

    @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
    public void onConnectionStateChange(byte[] bArr, boolean z) throws RemoteException {
        throw null;
    }

    @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
    public void onConsecutiveRkeConfirmation(byte[] bArr, int i, int i2, int i3, byte[] bArr2) throws RemoteException {
        throw null;
    }

    @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
    public void onCustomEvent(byte[] bArr, byte[] bArr2) throws RemoteException {
        throw null;
    }

    @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
    public void onExecutionStatus(byte[] bArr, int i, int i2, int i3) throws RemoteException {
        throw null;
    }

    @Override // org.iccoa.android.digitalkey.IVehicleStatusListener
    public void onFunctionStatus(byte[] bArr, int i, int i2) throws RemoteException {
        throw null;
    }
}

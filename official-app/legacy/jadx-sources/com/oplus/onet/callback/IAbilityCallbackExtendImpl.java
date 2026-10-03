package com.oplus.onet.callback;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.oplus.aiunit.vision.d3d;

/* JADX INFO: loaded from: classes8.dex */
public class IAbilityCallbackExtendImpl extends IAbilityCallbackExtend {
    private static final String TAG = "IAbilityCallbackExtendImpl";
    private IAbilityCallback mAbilityCallback;

    public IAbilityCallbackExtendImpl(IAbilityCallback iAbilityCallback) {
        this.mAbilityCallback = iAbilityCallback;
    }

    @Override // com.oplus.onet.callback.IAbilityCallbackExtend, com.oplus.onet.callback.IAbilityCallback.Stub, android.os.IInterface
    public IBinder asBinder() {
        return super.asBinder();
    }

    @Override // com.oplus.onet.callback.IAbilityCallbackExtend
    public void onError(int i) throws RemoteException {
        d3d.b(TAG, "getIAbilityCallbackExtend onError:errorCode=" + i);
        onError(i, new Bundle());
    }

    @Override // com.oplus.onet.callback.IAbilityCallback
    public void onInitialized() throws RemoteException {
        d3d.b(TAG, "getIAbilityCallbackExtend onInitialized:");
        this.mAbilityCallback.onInitialized();
    }

    @Override // com.oplus.onet.callback.IAbilityCallback
    public void onError(int i, Bundle bundle) throws RemoteException {
        this.mAbilityCallback.onError(i, bundle);
    }
}

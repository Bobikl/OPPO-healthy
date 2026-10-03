package com.oplus.onet.callback;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class IAbilityCallbackExtend extends IAbilityCallback.Stub {
    @Override // com.oplus.onet.callback.IAbilityCallback.Stub, android.os.IInterface
    public IBinder asBinder() {
        return super.asBinder();
    }

    public void onError(int i) throws RemoteException {
    }
}

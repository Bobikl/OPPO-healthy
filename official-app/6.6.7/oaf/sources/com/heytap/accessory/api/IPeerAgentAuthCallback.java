package com.heytap.accessory.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IPeerAgentAuthCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IPeerAgentAuthCallback";

    public static class Default implements IPeerAgentAuthCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IPeerAgentAuthCallback
        public void onPeerAgentAuthenticated(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IPeerAgentAuthCallback {
        static final int TRANSACTION_onPeerAgentAuthenticated = 1;

        public static class Proxy implements IPeerAgentAuthCallback {
            public static IPeerAgentAuthCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IPeerAgentAuthCallback.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IPeerAgentAuthCallback
            public void onPeerAgentAuthenticated(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeerAgentAuthCallback.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPeerAgentAuthenticated(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPeerAgentAuthCallback.DESCRIPTOR);
        }

        public static IPeerAgentAuthCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPeerAgentAuthCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPeerAgentAuthCallback)) ? new Proxy(iBinder) : (IPeerAgentAuthCallback) iInterfaceQueryLocalInterface;
        }

        public static IPeerAgentAuthCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPeerAgentAuthCallback iPeerAgentAuthCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iPeerAgentAuthCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPeerAgentAuthCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IPeerAgentAuthCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IPeerAgentAuthCallback.DESCRIPTOR);
            onPeerAgentAuthenticated(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onPeerAgentAuthenticated(Bundle bundle) throws RemoteException;
}

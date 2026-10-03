package com.heytap.accessory.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes14.dex */
public interface IPeerAgentCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IPeerAgentCallback";

    public static class Default implements IPeerAgentCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IPeerAgentCallback
        public void onPeerAgentUpdated(Bundle bundle) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeerAgentCallback
        public void onPeerAgentsFound(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IPeerAgentCallback {
        static final int TRANSACTION_onPeerAgentUpdated = 2;
        static final int TRANSACTION_onPeerAgentsFound = 1;

        public static class Proxy implements IPeerAgentCallback {
            public static IPeerAgentCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IPeerAgentCallback.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IPeerAgentCallback
            public void onPeerAgentUpdated(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeerAgentCallback.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPeerAgentUpdated(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPeerAgentCallback
            public void onPeerAgentsFound(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeerAgentCallback.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPeerAgentsFound(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPeerAgentCallback.DESCRIPTOR);
        }

        public static IPeerAgentCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPeerAgentCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPeerAgentCallback)) ? new Proxy(iBinder) : (IPeerAgentCallback) iInterfaceQueryLocalInterface;
        }

        public static IPeerAgentCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPeerAgentCallback iPeerAgentCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iPeerAgentCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPeerAgentCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IPeerAgentCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IPeerAgentCallback.DESCRIPTOR);
                onPeerAgentsFound(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IPeerAgentCallback.DESCRIPTOR);
            onPeerAgentUpdated(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onPeerAgentUpdated(Bundle bundle) throws RemoteException;

    void onPeerAgentsFound(Bundle bundle) throws RemoteException;
}

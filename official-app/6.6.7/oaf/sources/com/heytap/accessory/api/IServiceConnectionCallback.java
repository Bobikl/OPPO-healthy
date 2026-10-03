package com.heytap.accessory.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IServiceConnectionCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IServiceConnectionCallback";

    public static class Default implements IServiceConnectionCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IServiceConnectionCallback
        public void onConnectionLost(Bundle bundle) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IServiceConnectionCallback
        public void onConnectionResponse(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IServiceConnectionCallback {
        static final int TRANSACTION_onConnectionLost = 2;
        static final int TRANSACTION_onConnectionResponse = 1;

        public static class Proxy implements IServiceConnectionCallback {
            public static IServiceConnectionCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IServiceConnectionCallback.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IServiceConnectionCallback
            public void onConnectionLost(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceConnectionCallback.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnectionLost(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IServiceConnectionCallback
            public void onConnectionResponse(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceConnectionCallback.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onConnectionResponse(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IServiceConnectionCallback.DESCRIPTOR);
        }

        public static IServiceConnectionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IServiceConnectionCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServiceConnectionCallback)) ? new Proxy(iBinder) : (IServiceConnectionCallback) iInterfaceQueryLocalInterface;
        }

        public static IServiceConnectionCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IServiceConnectionCallback iServiceConnectionCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iServiceConnectionCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iServiceConnectionCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IServiceConnectionCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IServiceConnectionCallback.DESCRIPTOR);
                onConnectionResponse(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IServiceConnectionCallback.DESCRIPTOR);
            onConnectionLost(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onConnectionLost(Bundle bundle) throws RemoteException;

    void onConnectionResponse(Bundle bundle) throws RemoteException;
}

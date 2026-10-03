package com.heytap.accessory.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes14.dex */
public interface IServiceConnectionIndicationCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IServiceConnectionIndicationCallback";

    public static class Default implements IServiceConnectionIndicationCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IServiceConnectionIndicationCallback
        public void onServiceConnectionRequested(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IServiceConnectionIndicationCallback {
        static final int TRANSACTION_onServiceConnectionRequested = 1;

        public static class Proxy implements IServiceConnectionIndicationCallback {
            public static IServiceConnectionIndicationCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IServiceConnectionIndicationCallback.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IServiceConnectionIndicationCallback
            public void onServiceConnectionRequested(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceConnectionIndicationCallback.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onServiceConnectionRequested(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IServiceConnectionIndicationCallback.DESCRIPTOR);
        }

        public static IServiceConnectionIndicationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IServiceConnectionIndicationCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServiceConnectionIndicationCallback)) ? new Proxy(iBinder) : (IServiceConnectionIndicationCallback) iInterfaceQueryLocalInterface;
        }

        public static IServiceConnectionIndicationCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IServiceConnectionIndicationCallback iServiceConnectionIndicationCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iServiceConnectionIndicationCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iServiceConnectionIndicationCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IServiceConnectionIndicationCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IServiceConnectionIndicationCallback.DESCRIPTOR);
            onServiceConnectionRequested(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onServiceConnectionRequested(Bundle bundle) throws RemoteException;
}

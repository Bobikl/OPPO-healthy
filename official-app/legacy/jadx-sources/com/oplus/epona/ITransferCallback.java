package com.oplus.epona;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface ITransferCallback extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.epona.ITransferCallback";

    public static class Default implements ITransferCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.epona.ITransferCallback
        public void onReceive(Response response) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ITransferCallback {
        static final int TRANSACTION_onReceive = 1;

        public static class Proxy implements ITransferCallback {
            public static ITransferCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ITransferCallback.DESCRIPTOR;
            }

            @Override // com.oplus.epona.ITransferCallback
            public void onReceive(Response response) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITransferCallback.DESCRIPTOR);
                    if (response != null) {
                        parcelObtain.writeInt(1);
                        response.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onReceive(response);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ITransferCallback.DESCRIPTOR);
        }

        public static ITransferCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITransferCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITransferCallback)) ? new Proxy(iBinder) : (ITransferCallback) iInterfaceQueryLocalInterface;
        }

        public static ITransferCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ITransferCallback iTransferCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iTransferCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iTransferCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(ITransferCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(ITransferCallback.DESCRIPTOR);
            onReceive(parcel.readInt() != 0 ? Response.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onReceive(Response response) throws RemoteException;
}

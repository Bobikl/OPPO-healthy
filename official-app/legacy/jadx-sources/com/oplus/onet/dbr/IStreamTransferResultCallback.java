package com.oplus.onet.dbr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IStreamTransferResultCallback extends IInterface {

    public static class Default implements IStreamTransferResultCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.dbr.IStreamTransferResultCallback
        public void onStreamReceived(String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IStreamTransferResultCallback
        public void onStreamTransferCompleted(String str, int i) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IStreamTransferResultCallback
        public void onStreamTransferRequested(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IStreamTransferResultCallback {
        private static final String DESCRIPTOR = "com.oplus.onet.dbr.IStreamTransferResultCallback";
        public static final int TRANSACTION_onStreamReceived = 2;
        public static final int TRANSACTION_onStreamTransferCompleted = 3;
        public static final int TRANSACTION_onStreamTransferRequested = 1;

        public static class Proxy implements IStreamTransferResultCallback {
            public static IStreamTransferResultCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.oplus.onet.dbr.IStreamTransferResultCallback
            public void onStreamReceived(String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (parcelFileDescriptor != null) {
                        parcelObtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStreamReceived(str, parcelFileDescriptor);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IStreamTransferResultCallback
            public void onStreamTransferCompleted(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStreamTransferCompleted(str, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IStreamTransferResultCallback
            public void onStreamTransferRequested(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onStreamTransferRequested(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IStreamTransferResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IStreamTransferResultCallback)) ? new Proxy(iBinder) : (IStreamTransferResultCallback) iInterfaceQueryLocalInterface;
        }

        public static IStreamTransferResultCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IStreamTransferResultCallback iStreamTransferResultCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iStreamTransferResultCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iStreamTransferResultCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onStreamTransferRequested(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onStreamReceived(parcel.readString(), parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onStreamTransferCompleted(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onStreamReceived(String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void onStreamTransferCompleted(String str, int i) throws RemoteException;

    void onStreamTransferRequested(String str) throws RemoteException;
}

package com.oplus.onet.dbr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IFileTransferResultCallback extends IInterface {

    public static class Default implements IFileTransferResultCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.dbr.IFileTransferResultCallback
        public void onFileProgressChanged(String str, int i) throws RemoteException {
        }

        @Override // com.oplus.onet.dbr.IFileTransferResultCallback
        public void onFileTransferCompleted(String str, String str2, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IFileTransferResultCallback {
        private static final String DESCRIPTOR = "com.oplus.onet.dbr.IFileTransferResultCallback";
        public static final int TRANSACTION_onFileProgressChanged = 1;
        public static final int TRANSACTION_onFileTransferCompleted = 2;

        public static class Proxy implements IFileTransferResultCallback {
            public static IFileTransferResultCallback sDefaultImpl;
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

            @Override // com.oplus.onet.dbr.IFileTransferResultCallback
            public void onFileProgressChanged(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFileProgressChanged(str, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.onet.dbr.IFileTransferResultCallback
            public void onFileTransferCompleted(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onFileTransferCompleted(str, str2, i);
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

        public static IFileTransferResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IFileTransferResultCallback)) ? new Proxy(iBinder) : (IFileTransferResultCallback) iInterfaceQueryLocalInterface;
        }

        public static IFileTransferResultCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IFileTransferResultCallback iFileTransferResultCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iFileTransferResultCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iFileTransferResultCallback;
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
                onFileProgressChanged(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onFileTransferCompleted(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onFileProgressChanged(String str, int i) throws RemoteException;

    void onFileTransferCompleted(String str, String str2, int i) throws RemoteException;
}

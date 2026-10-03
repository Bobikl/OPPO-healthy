package com.health.database.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes14.dex */
public interface IUploadWork extends IInterface {
    public static final String DESCRIPTOR = "com.health.database.depend.IUploadWork";

    public static class Default implements IUploadWork {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.health.database.depend.IUploadWork
        public void call() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IUploadWork {
        static final int TRANSACTION_call = 1;

        public static class Proxy implements IUploadWork {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.health.database.depend.IUploadWork
            public void call() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUploadWork.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IUploadWork.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IUploadWork.DESCRIPTOR);
        }

        public static IUploadWork asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUploadWork.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUploadWork)) ? new Proxy(iBinder) : (IUploadWork) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IUploadWork.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IUploadWork.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            call();
            parcel2.writeNoException();
            return true;
        }
    }

    void call() throws RemoteException;
}

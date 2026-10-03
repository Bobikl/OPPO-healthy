package com.heytap.databaseengine.apiv2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.databaseengine.callback.ICommonListener;

/* JADX INFO: loaded from: classes15.dex */
public interface IAuthorityManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.apiv2.IAuthorityManager";

    public static class Default implements IAuthorityManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.apiv2.IAuthorityManager
        public void revoke(ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.IAuthorityManager
        public void valid(ICommonListener iCommonListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAuthorityManager {
        static final int TRANSACTION_revoke = 1;
        static final int TRANSACTION_valid = 2;

        public static class Proxy implements IAuthorityManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAuthorityManager.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.apiv2.IAuthorityManager
            public void revoke(ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAuthorityManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.IAuthorityManager
            public void valid(ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAuthorityManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAuthorityManager.DESCRIPTOR);
        }

        public static IAuthorityManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAuthorityManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAuthorityManager)) ? new Proxy(iBinder) : (IAuthorityManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAuthorityManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IAuthorityManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                revoke(ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                valid(ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void revoke(ICommonListener iCommonListener) throws RemoteException;

    void valid(ICommonListener iCommonListener) throws RemoteException;
}

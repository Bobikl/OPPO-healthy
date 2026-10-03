package com.heytap.databaseengine.apiv2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.databaseengine.callback.ICommonListener;

/* JADX INFO: loaded from: classes15.dex */
public interface IUserInfoManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.apiv2.IUserInfoManager";

    public static class Default implements IUserInfoManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.apiv2.IUserInfoManager
        public void readUserInfo(ICommonListener iCommonListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.IUserInfoManager
        public void readV2(ICommonListener iCommonListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IUserInfoManager {
        static final int TRANSACTION_readUserInfo = 1;
        static final int TRANSACTION_readV2 = 2;

        public static class Proxy implements IUserInfoManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IUserInfoManager.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.apiv2.IUserInfoManager
            public void readUserInfo(ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUserInfoManager.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCommonListener);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.IUserInfoManager
            public void readV2(ICommonListener iCommonListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUserInfoManager.DESCRIPTOR);
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
            attachInterface(this, IUserInfoManager.DESCRIPTOR);
        }

        public static IUserInfoManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUserInfoManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUserInfoManager)) ? new Proxy(iBinder) : (IUserInfoManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IUserInfoManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IUserInfoManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                readUserInfo(ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                readV2(ICommonListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void readUserInfo(ICommonListener iCommonListener) throws RemoteException;

    void readV2(ICommonListener iCommonListener) throws RemoteException;
}

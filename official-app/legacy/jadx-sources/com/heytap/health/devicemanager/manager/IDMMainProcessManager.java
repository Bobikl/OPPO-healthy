package com.heytap.health.devicemanager.manager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public interface IDMMainProcessManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.devicemanager.manager.IDMMainProcessManager";

    public static class Default implements IDMMainProcessManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.devicemanager.manager.IDMMainProcessManager
        public boolean checkIsOobeing() throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.devicemanager.manager.IDMMainProcessManager
        public boolean isInForeground() throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IDMMainProcessManager {
        static final int TRANSACTION_checkIsOobeing = 2;
        static final int TRANSACTION_isInForeground = 3;

        public static class Proxy implements IDMMainProcessManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.devicemanager.manager.IDMMainProcessManager
            public boolean checkIsOobeing() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDMMainProcessManager.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IDMMainProcessManager.DESCRIPTOR;
            }

            @Override // com.heytap.health.devicemanager.manager.IDMMainProcessManager
            public boolean isInForeground() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDMMainProcessManager.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDMMainProcessManager.DESCRIPTOR);
        }

        public static IDMMainProcessManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDMMainProcessManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDMMainProcessManager)) ? new Proxy(iBinder) : (IDMMainProcessManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDMMainProcessManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDMMainProcessManager.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                boolean zCheckIsOobeing = checkIsOobeing();
                parcel2.writeNoException();
                parcel2.writeInt(zCheckIsOobeing ? 1 : 0);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                boolean zIsInForeground = isInForeground();
                parcel2.writeNoException();
                parcel2.writeInt(zIsInForeground ? 1 : 0);
            }
            return true;
        }
    }

    boolean checkIsOobeing() throws RemoteException;

    boolean isInForeground() throws RemoteException;
}

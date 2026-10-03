package com.heytap.health.watch.commonsync.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface ICommonSyncMain extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.commonsync.aidl.ICommonSyncMain";

    public static class Default implements ICommonSyncMain {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncMain
        public void oobeSyncFinish(int i, boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncMain
        public void startTimeSyncWorker(boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICommonSyncMain {
        static final int TRANSACTION_oobeSyncFinish = 1;
        static final int TRANSACTION_startTimeSyncWorker = 2;

        public static class Proxy implements ICommonSyncMain {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICommonSyncMain.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncMain
            public void oobeSyncFinish(int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonSyncMain.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncMain
            public void startTimeSyncWorker(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonSyncMain.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICommonSyncMain.DESCRIPTOR);
        }

        public static ICommonSyncMain asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICommonSyncMain.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICommonSyncMain)) ? new Proxy(iBinder) : (ICommonSyncMain) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICommonSyncMain.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICommonSyncMain.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                oobeSyncFinish(parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                startTimeSyncWorker(parcel.readInt() != 0);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void oobeSyncFinish(int i, boolean z) throws RemoteException;

    void startTimeSyncWorker(boolean z) throws RemoteException;
}

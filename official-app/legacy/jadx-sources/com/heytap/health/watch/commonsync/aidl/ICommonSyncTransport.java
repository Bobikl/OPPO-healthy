package com.heytap.health.watch.commonsync.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface ICommonSyncTransport extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport";

    public static class Default implements ICommonSyncTransport {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
        public void onActionTimeChanged() throws RemoteException {
        }

        @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
        public void onActionTimeZoneChanged() throws RemoteException {
        }

        @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
        public void onLocaleChanged() throws RemoteException {
        }

        @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
        public void onTimeChangedFromOOBE(boolean z, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICommonSyncTransport {
        static final int TRANSACTION_onActionTimeChanged = 1;
        static final int TRANSACTION_onActionTimeZoneChanged = 2;
        static final int TRANSACTION_onLocaleChanged = 4;
        static final int TRANSACTION_onTimeChangedFromOOBE = 3;

        public static class Proxy implements ICommonSyncTransport {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICommonSyncTransport.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
            public void onActionTimeChanged() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonSyncTransport.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
            public void onActionTimeZoneChanged() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonSyncTransport.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
            public void onLocaleChanged() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonSyncTransport.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.commonsync.aidl.ICommonSyncTransport
            public void onTimeChangedFromOOBE(boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonSyncTransport.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICommonSyncTransport.DESCRIPTOR);
        }

        public static ICommonSyncTransport asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICommonSyncTransport.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICommonSyncTransport)) ? new Proxy(iBinder) : (ICommonSyncTransport) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICommonSyncTransport.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICommonSyncTransport.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onActionTimeChanged();
                parcel2.writeNoException();
            } else if (i == 2) {
                onActionTimeZoneChanged();
                parcel2.writeNoException();
            } else if (i == 3) {
                onTimeChangedFromOOBE(parcel.readInt() != 0, parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onLocaleChanged();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onActionTimeChanged() throws RemoteException;

    void onActionTimeZoneChanged() throws RemoteException;

    void onLocaleChanged() throws RemoteException;

    void onTimeChangedFromOOBE(boolean z, int i) throws RemoteException;
}

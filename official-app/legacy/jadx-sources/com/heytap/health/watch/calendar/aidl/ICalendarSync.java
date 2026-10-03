package com.heytap.health.watch.calendar.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface ICalendarSync extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.calendar.aidl.ICalendarSync";

    public static class Default implements ICalendarSync {
        @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
        public void addSyncListener(ICalendarSyncListener iCalendarSyncListener) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
        public void onAction(int i) throws RemoteException {
        }

        @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
        public void onSyncFail(int i) throws RemoteException {
        }

        @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
        public void removeSyncListener(ICalendarSyncListener iCalendarSyncListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICalendarSync {
        static final int TRANSACTION_addSyncListener = 2;
        static final int TRANSACTION_onAction = 1;
        static final int TRANSACTION_onSyncFail = 4;
        static final int TRANSACTION_removeSyncListener = 3;

        public static class Proxy implements ICalendarSync {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
            public void addSyncListener(ICalendarSyncListener iCalendarSyncListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICalendarSync.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCalendarSyncListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICalendarSync.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
            public void onAction(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICalendarSync.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
            public void onSyncFail(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICalendarSync.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.calendar.aidl.ICalendarSync
            public void removeSyncListener(ICalendarSyncListener iCalendarSyncListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICalendarSync.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iCalendarSyncListener);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICalendarSync.DESCRIPTOR);
        }

        public static ICalendarSync asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICalendarSync.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICalendarSync)) ? new Proxy(iBinder) : (ICalendarSync) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICalendarSync.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICalendarSync.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onAction(parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 2) {
                addSyncListener(ICalendarSyncListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                removeSyncListener(ICalendarSyncListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onSyncFail(parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void addSyncListener(ICalendarSyncListener iCalendarSyncListener) throws RemoteException;

    void onAction(int i) throws RemoteException;

    void onSyncFail(int i) throws RemoteException;

    void removeSyncListener(ICalendarSyncListener iCalendarSyncListener) throws RemoteException;
}

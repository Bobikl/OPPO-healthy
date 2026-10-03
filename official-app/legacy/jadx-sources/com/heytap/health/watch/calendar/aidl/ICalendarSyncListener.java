package com.heytap.health.watch.calendar.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface ICalendarSyncListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.calendar.aidl.ICalendarSyncListener";

    public static class Default implements ICalendarSyncListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.calendar.aidl.ICalendarSyncListener
        public void onSyncFail(int i) throws RemoteException {
        }

        @Override // com.heytap.health.watch.calendar.aidl.ICalendarSyncListener
        public void onSyncSuccess() throws RemoteException {
        }

        @Override // com.heytap.health.watch.calendar.aidl.ICalendarSyncListener
        public void onSyncing() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICalendarSyncListener {
        static final int TRANSACTION_onSyncFail = 4;
        static final int TRANSACTION_onSyncSuccess = 3;
        static final int TRANSACTION_onSyncing = 2;

        public static class Proxy implements ICalendarSyncListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICalendarSyncListener.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.calendar.aidl.ICalendarSyncListener
            public void onSyncFail(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICalendarSyncListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.calendar.aidl.ICalendarSyncListener
            public void onSyncSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICalendarSyncListener.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.calendar.aidl.ICalendarSyncListener
            public void onSyncing() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICalendarSyncListener.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICalendarSyncListener.DESCRIPTOR);
        }

        public static ICalendarSyncListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICalendarSyncListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICalendarSyncListener)) ? new Proxy(iBinder) : (ICalendarSyncListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICalendarSyncListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICalendarSyncListener.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                onSyncing();
                parcel2.writeNoException();
            } else if (i == 3) {
                onSyncSuccess();
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

    void onSyncFail(int i) throws RemoteException;

    void onSyncSuccess() throws RemoteException;

    void onSyncing() throws RemoteException;
}

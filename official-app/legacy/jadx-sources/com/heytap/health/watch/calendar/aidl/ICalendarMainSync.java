package com.heytap.health.watch.calendar.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface ICalendarMainSync extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.calendar.aidl.ICalendarMainSync";

    public static class Default implements ICalendarMainSync {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.calendar.aidl.ICalendarMainSync
        public void oobeSyncFinish(boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICalendarMainSync {
        static final int TRANSACTION_oobeSyncFinish = 1;

        public static class Proxy implements ICalendarMainSync {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICalendarMainSync.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.calendar.aidl.ICalendarMainSync
            public void oobeSyncFinish(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICalendarMainSync.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICalendarMainSync.DESCRIPTOR);
        }

        public static ICalendarMainSync asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICalendarMainSync.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICalendarMainSync)) ? new Proxy(iBinder) : (ICalendarMainSync) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICalendarMainSync.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICalendarMainSync.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            oobeSyncFinish(parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    void oobeSyncFinish(boolean z) throws RemoteException;
}

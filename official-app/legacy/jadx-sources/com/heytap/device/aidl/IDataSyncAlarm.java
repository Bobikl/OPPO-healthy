package com.heytap.device.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes15.dex */
public interface IDataSyncAlarm extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.device.aidl.IDataSyncAlarm";

    public static class Default implements IDataSyncAlarm {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.device.aidl.IDataSyncAlarm
        public void updateDataSyncAlarm() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDataSyncAlarm {
        static final int TRANSACTION_updateDataSyncAlarm = 1;

        public static class Proxy implements IDataSyncAlarm {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDataSyncAlarm.DESCRIPTOR;
            }

            @Override // com.heytap.device.aidl.IDataSyncAlarm
            public void updateDataSyncAlarm() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDataSyncAlarm.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDataSyncAlarm.DESCRIPTOR);
        }

        public static IDataSyncAlarm asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDataSyncAlarm.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDataSyncAlarm)) ? new Proxy(iBinder) : (IDataSyncAlarm) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDataSyncAlarm.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDataSyncAlarm.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            updateDataSyncAlarm();
            parcel2.writeNoException();
            return true;
        }
    }

    void updateDataSyncAlarm() throws RemoteException;
}

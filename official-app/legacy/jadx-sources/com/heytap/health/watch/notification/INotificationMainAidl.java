package com.heytap.health.watch.notification;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface INotificationMainAidl extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.notification.INotificationMainAidl";

    public static class Default implements INotificationMainAidl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.notification.INotificationMainAidl
        public void cancelAlarm() throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationMainAidl
        public void setAlarm() throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationMainAidl
        public void updateUI() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationMainAidl {
        static final int TRANSACTION_cancelAlarm = 2;
        static final int TRANSACTION_setAlarm = 1;
        static final int TRANSACTION_updateUI = 3;

        public static class Proxy implements INotificationMainAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.watch.notification.INotificationMainAidl
            public void cancelAlarm() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationMainAidl.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return INotificationMainAidl.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.notification.INotificationMainAidl
            public void setAlarm() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationMainAidl.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.notification.INotificationMainAidl
            public void updateUI() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationMainAidl.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INotificationMainAidl.DESCRIPTOR);
        }

        public static INotificationMainAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationMainAidl.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationMainAidl)) ? new Proxy(iBinder) : (INotificationMainAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INotificationMainAidl.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INotificationMainAidl.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                setAlarm();
                parcel2.writeNoException();
            } else if (i == 2) {
                cancelAlarm();
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                updateUI();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void cancelAlarm() throws RemoteException;

    void setAlarm() throws RemoteException;

    void updateUI() throws RemoteException;
}

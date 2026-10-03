package com.heytap.health.watch.notification;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface INotificationECDHCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.notification.INotificationECDHCallback";

    public static class Default implements INotificationECDHCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.notification.INotificationECDHCallback
        public void onResult(String str, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationECDHCallback {
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements INotificationECDHCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return INotificationECDHCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.notification.INotificationECDHCallback
            public void onResult(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationECDHCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INotificationECDHCallback.DESCRIPTOR);
        }

        public static INotificationECDHCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationECDHCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationECDHCallback)) ? new Proxy(iBinder) : (INotificationECDHCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INotificationECDHCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INotificationECDHCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(String str, String str2) throws RemoteException;
}

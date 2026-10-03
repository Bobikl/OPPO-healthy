package com.heytap.health.watch.notification;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface INotificationIntCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.notification.INotificationIntCallback";

    public static class Default implements INotificationIntCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.notification.INotificationIntCallback
        public void onResult(int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationIntCallback {
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements INotificationIntCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return INotificationIntCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.notification.INotificationIntCallback
            public void onResult(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationIntCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INotificationIntCallback.DESCRIPTOR);
        }

        public static INotificationIntCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationIntCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationIntCallback)) ? new Proxy(iBinder) : (INotificationIntCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INotificationIntCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INotificationIntCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(int i) throws RemoteException;
}

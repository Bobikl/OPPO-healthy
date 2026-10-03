package com.heytap.health.watch.notification;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface INotificationBooleanCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.notification.INotificationBooleanCallback";

    public static class Default implements INotificationBooleanCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.notification.INotificationBooleanCallback
        public void onResult(boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationBooleanCallback {
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements INotificationBooleanCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return INotificationBooleanCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.notification.INotificationBooleanCallback
            public void onResult(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationBooleanCallback.DESCRIPTOR);
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
            attachInterface(this, INotificationBooleanCallback.DESCRIPTOR);
        }

        public static INotificationBooleanCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationBooleanCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationBooleanCallback)) ? new Proxy(iBinder) : (INotificationBooleanCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INotificationBooleanCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INotificationBooleanCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(boolean z) throws RemoteException;
}

package com.heytap.health.watch.notification;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface INotificationDataCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.notification.INotificationDataCallback";

    public static class Default implements INotificationDataCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.notification.INotificationDataCallback
        public void onResult(List<NotificationRoomBean> list) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationDataCallback {
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements INotificationDataCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return INotificationDataCallback.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.notification.INotificationDataCallback
            public void onResult(List<NotificationRoomBean> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationDataCallback.DESCRIPTOR);
                    a.b(parcelObtain, list, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INotificationDataCallback.DESCRIPTOR);
        }

        public static INotificationDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationDataCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationDataCallback)) ? new Proxy(iBinder) : (INotificationDataCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INotificationDataCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INotificationDataCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.createTypedArrayList(NotificationRoomBean.INSTANCE));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class a {
        public static <T extends Parcelable> void b(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                c(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onResult(List<NotificationRoomBean> list) throws RemoteException;
}

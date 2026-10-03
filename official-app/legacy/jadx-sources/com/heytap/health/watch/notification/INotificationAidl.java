package com.heytap.health.watch.notification;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.notification.StatusBarNotification;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface INotificationAidl extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.notification.INotificationAidl";

    public static class Default implements INotificationAidl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.notification.INotificationAidl
        public void batchSetSwitchStatus(List<String> list, boolean z, boolean z2, INotificationBooleanCallback iNotificationBooleanCallback) throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationAidl
        public void changeCloudSwitch(boolean z, int i, INotificationIntCallback iNotificationIntCallback) throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationAidl
        public void commonGet(Bundle bundle, INotificationBundleCallback iNotificationBundleCallback) throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationAidl
        public void commonSet(Bundle bundle, INotificationBooleanCallback iNotificationBooleanCallback) throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationAidl
        public void getAllSwitches(INotificationDataCallback iNotificationDataCallback) throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationAidl
        public void getSwitch(String str, INotificationDataCallback iNotificationDataCallback) throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationAidl
        public void negotiate(int i, int i2, String str, INotificationECDHCallback iNotificationECDHCallback) throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationAidl
        public void pushFakeNotification(String str, boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationAidl
        public void pushFakeNotification2(StatusBarNotification statusBarNotification) throws RemoteException {
        }

        @Override // com.heytap.health.watch.notification.INotificationAidl
        public void setSwitchStatus(String str, boolean z, boolean z2, INotificationBooleanCallback iNotificationBooleanCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationAidl {
        static final int TRANSACTION_batchSetSwitchStatus = 10;
        static final int TRANSACTION_changeCloudSwitch = 7;
        static final int TRANSACTION_commonGet = 9;
        static final int TRANSACTION_commonSet = 8;
        static final int TRANSACTION_getAllSwitches = 3;
        static final int TRANSACTION_getSwitch = 2;
        static final int TRANSACTION_negotiate = 6;
        static final int TRANSACTION_pushFakeNotification = 4;
        static final int TRANSACTION_pushFakeNotification2 = 5;
        static final int TRANSACTION_setSwitchStatus = 1;

        public static class Proxy implements INotificationAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.watch.notification.INotificationAidl
            public void batchSetSwitchStatus(List<String> list, boolean z, boolean z2, INotificationBooleanCallback iNotificationBooleanCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationAidl.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    int i = 1;
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i = 0;
                    }
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iNotificationBooleanCallback);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.notification.INotificationAidl
            public void changeCloudSwitch(boolean z, int i, INotificationIntCallback iNotificationIntCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationAidl.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(iNotificationIntCallback);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.notification.INotificationAidl
            public void commonGet(Bundle bundle, INotificationBundleCallback iNotificationBundleCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationAidl.DESCRIPTOR);
                    a.d(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongInterface(iNotificationBundleCallback);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.notification.INotificationAidl
            public void commonSet(Bundle bundle, INotificationBooleanCallback iNotificationBooleanCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationAidl.DESCRIPTOR);
                    a.d(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongInterface(iNotificationBooleanCallback);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.notification.INotificationAidl
            public void getAllSwitches(INotificationDataCallback iNotificationDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationAidl.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iNotificationDataCallback);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return INotificationAidl.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.notification.INotificationAidl
            public void getSwitch(String str, INotificationDataCallback iNotificationDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationAidl.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iNotificationDataCallback);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.notification.INotificationAidl
            public void negotiate(int i, int i2, String str, INotificationECDHCallback iNotificationECDHCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationAidl.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iNotificationECDHCallback);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.notification.INotificationAidl
            public void pushFakeNotification(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationAidl.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.notification.INotificationAidl
            public void pushFakeNotification2(StatusBarNotification statusBarNotification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationAidl.DESCRIPTOR);
                    a.d(parcelObtain, statusBarNotification, 0);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.notification.INotificationAidl
            public void setSwitchStatus(String str, boolean z, boolean z2, INotificationBooleanCallback iNotificationBooleanCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationAidl.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    parcelObtain.writeStrongInterface(iNotificationBooleanCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INotificationAidl.DESCRIPTOR);
        }

        public static INotificationAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationAidl.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationAidl)) ? new Proxy(iBinder) : (INotificationAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(INotificationAidl.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(INotificationAidl.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    setSwitchStatus(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, INotificationBooleanCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    getSwitch(parcel.readString(), INotificationDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    getAllSwitches(INotificationDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    pushFakeNotification(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    pushFakeNotification2((StatusBarNotification) a.c(parcel, StatusBarNotification.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    negotiate(parcel.readInt(), parcel.readInt(), parcel.readString(), INotificationECDHCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    changeCloudSwitch(parcel.readInt() != 0, parcel.readInt(), INotificationIntCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    commonSet((Bundle) a.c(parcel, Bundle.CREATOR), INotificationBooleanCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    commonGet((Bundle) a.c(parcel, Bundle.CREATOR), INotificationBundleCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    batchSetSwitchStatus(parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, INotificationBooleanCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class a {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void batchSetSwitchStatus(List<String> list, boolean z, boolean z2, INotificationBooleanCallback iNotificationBooleanCallback) throws RemoteException;

    void changeCloudSwitch(boolean z, int i, INotificationIntCallback iNotificationIntCallback) throws RemoteException;

    void commonGet(Bundle bundle, INotificationBundleCallback iNotificationBundleCallback) throws RemoteException;

    void commonSet(Bundle bundle, INotificationBooleanCallback iNotificationBooleanCallback) throws RemoteException;

    void getAllSwitches(INotificationDataCallback iNotificationDataCallback) throws RemoteException;

    void getSwitch(String str, INotificationDataCallback iNotificationDataCallback) throws RemoteException;

    void negotiate(int i, int i2, String str, INotificationECDHCallback iNotificationECDHCallback) throws RemoteException;

    void pushFakeNotification(String str, boolean z) throws RemoteException;

    void pushFakeNotification2(StatusBarNotification statusBarNotification) throws RemoteException;

    void setSwitchStatus(String str, boolean z, boolean z2, INotificationBooleanCallback iNotificationBooleanCallback) throws RemoteException;
}

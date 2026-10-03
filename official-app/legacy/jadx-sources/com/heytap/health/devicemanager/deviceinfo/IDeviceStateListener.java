package com.heytap.health.devicemanager.deviceinfo;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface IDeviceStateListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.devicemanager.deviceinfo.IDeviceStateListener";

    public static class Default implements IDeviceStateListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.devicemanager.deviceinfo.IDeviceStateListener
        public void notifyActiveMacChange(String str) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.deviceinfo.IDeviceStateListener
        public void notifyUpdateBattery(UserDeviceInfo userDeviceInfo, int i) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.deviceinfo.IDeviceStateListener
        public void notifyUpdateConnectState(UserDeviceInfo userDeviceInfo, int i) throws RemoteException {
        }

        @Override // com.heytap.health.devicemanager.deviceinfo.IDeviceStateListener
        public void notifyUpdateDeviceInfos(List<UserDeviceInfo> list, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDeviceStateListener {
        static final int TRANSACTION_notifyActiveMacChange = 4;
        static final int TRANSACTION_notifyUpdateBattery = 3;
        static final int TRANSACTION_notifyUpdateConnectState = 2;
        static final int TRANSACTION_notifyUpdateDeviceInfos = 1;

        public static class Proxy implements IDeviceStateListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDeviceStateListener.DESCRIPTOR;
            }

            @Override // com.heytap.health.devicemanager.deviceinfo.IDeviceStateListener
            public void notifyActiveMacChange(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceStateListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.deviceinfo.IDeviceStateListener
            public void notifyUpdateBattery(UserDeviceInfo userDeviceInfo, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceStateListener.DESCRIPTOR);
                    a.f(parcelObtain, userDeviceInfo, 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.deviceinfo.IDeviceStateListener
            public void notifyUpdateConnectState(UserDeviceInfo userDeviceInfo, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceStateListener.DESCRIPTOR);
                    a.f(parcelObtain, userDeviceInfo, 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.devicemanager.deviceinfo.IDeviceStateListener
            public void notifyUpdateDeviceInfos(List<UserDeviceInfo> list, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceStateListener.DESCRIPTOR);
                    a.e(parcelObtain, list, 0);
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
            attachInterface(this, IDeviceStateListener.DESCRIPTOR);
        }

        public static IDeviceStateListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDeviceStateListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeviceStateListener)) ? new Proxy(iBinder) : (IDeviceStateListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDeviceStateListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDeviceStateListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                notifyUpdateDeviceInfos(parcel.createTypedArrayList(UserDeviceInfo.CREATOR), parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 2) {
                notifyUpdateConnectState((UserDeviceInfo) a.d(parcel, UserDeviceInfo.CREATOR), parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 3) {
                notifyUpdateBattery((UserDeviceInfo) a.d(parcel, UserDeviceInfo.CREATOR), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                notifyActiveMacChange(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class a {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void notifyActiveMacChange(String str) throws RemoteException;

    void notifyUpdateBattery(UserDeviceInfo userDeviceInfo, int i) throws RemoteException;

    void notifyUpdateConnectState(UserDeviceInfo userDeviceInfo, int i) throws RemoteException;

    void notifyUpdateDeviceInfos(List<UserDeviceInfo> list, int i) throws RemoteException;
}

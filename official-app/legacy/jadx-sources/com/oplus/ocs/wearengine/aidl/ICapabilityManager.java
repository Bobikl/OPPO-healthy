package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.BatteryInfoParcelable;
import com.oplus.ocs.wearengine.bean.DeviceListParcelable;
import com.oplus.ocs.wearengine.bean.DeviceModuleParcelable;
import com.oplus.ocs.wearengine.common.Status;

/* JADX INFO: loaded from: classes8.dex */
public interface ICapabilityManager extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.ICapabilityManager";

    public static class Default implements ICapabilityManager {
        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
        public Status addListener(String str, ICapabilityListener iCapabilityListener) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
        public Status checkInstalled(String str, int i, boolean z) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
        public BatteryInfoParcelable getBatteryInfo(String str, int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
        public DeviceListParcelable getBindDeviceList(String str, int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
        public DeviceModuleParcelable getDeviceModule(String str, int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
        public Status getPackageInfo(String str, int i, boolean z) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
        public Status getServiceVersion(String str, int i, boolean z) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
        public Status removeListener(String str, ICapabilityListener iCapabilityListener) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
        public Status tryAwaken(String str, int i, String str2, int i2, String str3, String str4, boolean z) throws RemoteException {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
        public Status tryOpenUrl(String str, int i, String str2, boolean z) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ICapabilityManager {
        static final int TRANSACTION_addListener = 1;
        static final int TRANSACTION_checkInstalled = 3;
        static final int TRANSACTION_getBatteryInfo = 8;
        static final int TRANSACTION_getBindDeviceList = 9;
        static final int TRANSACTION_getDeviceModule = 10;
        static final int TRANSACTION_getPackageInfo = 5;
        static final int TRANSACTION_getServiceVersion = 7;
        static final int TRANSACTION_removeListener = 2;
        static final int TRANSACTION_tryAwaken = 4;
        static final int TRANSACTION_tryOpenUrl = 6;

        public static class Proxy implements ICapabilityManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
            public Status addListener(String str, ICapabilityListener iCapabilityListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iCapabilityListener);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
            public Status checkInstalled(String str, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
            public BatteryInfoParcelable getBatteryInfo(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (BatteryInfoParcelable) a.c(parcelObtain2, BatteryInfoParcelable.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
            public DeviceListParcelable getBindDeviceList(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceListParcelable) a.c(parcelObtain2, DeviceListParcelable.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
            public DeviceModuleParcelable getDeviceModule(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (DeviceModuleParcelable) a.c(parcelObtain2, DeviceModuleParcelable.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ICapabilityManager.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
            public Status getPackageInfo(String str, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
            public Status getServiceVersion(String str, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
            public Status removeListener(String str, ICapabilityListener iCapabilityListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iCapabilityListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
            public Status tryAwaken(String str, int i, String str2, int i2, String str3, String str4, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.ocs.wearengine.aidl.ICapabilityManager
            public Status tryOpenUrl(String str, int i, String str2, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICapabilityManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Status) a.c(parcelObtain2, Status.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICapabilityManager.DESCRIPTOR);
        }

        public static ICapabilityManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICapabilityManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICapabilityManager)) ? new Proxy(iBinder) : (ICapabilityManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICapabilityManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICapabilityManager.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    Status statusAddListener = addListener(parcel.readString(), ICapabilityListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    a.d(parcel2, statusAddListener, 1);
                    return true;
                case 2:
                    Status statusRemoveListener = removeListener(parcel.readString(), ICapabilityListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    a.d(parcel2, statusRemoveListener, 1);
                    return true;
                case 3:
                    Status statusCheckInstalled = checkInstalled(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    a.d(parcel2, statusCheckInstalled, 1);
                    return true;
                case 4:
                    Status statusTryAwaken = tryAwaken(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    a.d(parcel2, statusTryAwaken, 1);
                    return true;
                case 5:
                    Status packageInfo = getPackageInfo(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    a.d(parcel2, packageInfo, 1);
                    return true;
                case 6:
                    Status statusTryOpenUrl = tryOpenUrl(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    a.d(parcel2, statusTryOpenUrl, 1);
                    return true;
                case 7:
                    Status serviceVersion = getServiceVersion(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    a.d(parcel2, serviceVersion, 1);
                    return true;
                case 8:
                    BatteryInfoParcelable batteryInfo = getBatteryInfo(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    a.d(parcel2, batteryInfo, 1);
                    return true;
                case 9:
                    DeviceListParcelable bindDeviceList = getBindDeviceList(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    a.d(parcel2, bindDeviceList, 1);
                    return true;
                case 10:
                    DeviceModuleParcelable deviceModule = getDeviceModule(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    a.d(parcel2, deviceModule, 1);
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

    Status addListener(String str, ICapabilityListener iCapabilityListener) throws RemoteException;

    Status checkInstalled(String str, int i, boolean z) throws RemoteException;

    BatteryInfoParcelable getBatteryInfo(String str, int i) throws RemoteException;

    DeviceListParcelable getBindDeviceList(String str, int i) throws RemoteException;

    DeviceModuleParcelable getDeviceModule(String str, int i) throws RemoteException;

    Status getPackageInfo(String str, int i, boolean z) throws RemoteException;

    Status getServiceVersion(String str, int i, boolean z) throws RemoteException;

    Status removeListener(String str, ICapabilityListener iCapabilityListener) throws RemoteException;

    Status tryAwaken(String str, int i, String str2, int i2, String str3, String str4, boolean z) throws RemoteException;

    Status tryOpenUrl(String str, int i, String str2, boolean z) throws RemoteException;
}

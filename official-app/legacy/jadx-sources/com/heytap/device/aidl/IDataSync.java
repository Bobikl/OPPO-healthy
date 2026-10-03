package com.heytap.device.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes15.dex */
public interface IDataSync extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.device.aidl.IDataSync";

    public static class Default implements IDataSync {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.device.aidl.IDataSync
        public boolean isSportRelativeDataInSyncing() throws RemoteException {
            return false;
        }

        @Override // com.heytap.device.aidl.IDataSync
        public void onDeviceConnected(String str) throws RemoteException {
        }

        @Override // com.heytap.device.aidl.IDataSync
        public void onDeviceDisconnect(String str) throws RemoteException {
        }

        @Override // com.heytap.device.aidl.IDataSync
        public void syncByParam(SyncDataParam syncDataParam) throws RemoteException {
        }

        @Override // com.heytap.device.aidl.IDataSync
        public void syncCalorieAndStepToDevices() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDataSync {
        static final int TRANSACTION_isSportRelativeDataInSyncing = 5;
        static final int TRANSACTION_onDeviceConnected = 2;
        static final int TRANSACTION_onDeviceDisconnect = 3;
        static final int TRANSACTION_syncByParam = 1;
        static final int TRANSACTION_syncCalorieAndStepToDevices = 4;

        public static class Proxy implements IDataSync {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDataSync.DESCRIPTOR;
            }

            @Override // com.heytap.device.aidl.IDataSync
            public boolean isSportRelativeDataInSyncing() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDataSync.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.device.aidl.IDataSync
            public void onDeviceConnected(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDataSync.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.device.aidl.IDataSync
            public void onDeviceDisconnect(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDataSync.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.device.aidl.IDataSync
            public void syncByParam(SyncDataParam syncDataParam) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDataSync.DESCRIPTOR);
                    a.d(parcelObtain, syncDataParam, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.device.aidl.IDataSync
            public void syncCalorieAndStepToDevices() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDataSync.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDataSync.DESCRIPTOR);
        }

        public static IDataSync asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDataSync.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDataSync)) ? new Proxy(iBinder) : (IDataSync) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDataSync.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDataSync.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                syncByParam((SyncDataParam) a.c(parcel, SyncDataParam.CREATOR));
                parcel2.writeNoException();
            } else if (i == 2) {
                onDeviceConnected(parcel.readString());
                parcel2.writeNoException();
            } else if (i == 3) {
                onDeviceDisconnect(parcel.readString());
                parcel2.writeNoException();
            } else if (i == 4) {
                syncCalorieAndStepToDevices();
                parcel2.writeNoException();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                boolean zIsSportRelativeDataInSyncing = isSportRelativeDataInSyncing();
                parcel2.writeNoException();
                parcel2.writeInt(zIsSportRelativeDataInSyncing ? 1 : 0);
            }
            return true;
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

    boolean isSportRelativeDataInSyncing() throws RemoteException;

    void onDeviceConnected(String str) throws RemoteException;

    void onDeviceDisconnect(String str) throws RemoteException;

    void syncByParam(SyncDataParam syncDataParam) throws RemoteException;

    void syncCalorieAndStepToDevices() throws RemoteException;
}

package com.google.android.clockwork.companion.partnerapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface PartnerApi extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.clockwork.companion.partnerapi.PartnerApi";

    public static class Default implements PartnerApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.PartnerApi
        public int batchSetAppNotificationConfigs(List<AppNotificationConfig> list, BatchSetAppNotificationConfigsCallback batchSetAppNotificationConfigsCallback) throws RemoteException {
            return 0;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.PartnerApi
        public List<AppNotificationConfig> getAppNotificationConfigs() throws RemoteException {
            return null;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.PartnerApi
        public boolean reconnectByNodeId(String str) throws RemoteException {
            return false;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.PartnerApi
        public boolean removeDeviceByNodeId(String str, DeviceRemovalCallback deviceRemovalCallback) throws RemoteException {
            return false;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.PartnerApi
        public int setAppNotificationConfig(AppNotificationConfig appNotificationConfig) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements PartnerApi {
        static final int TRANSACTION_batchSetAppNotificationConfigs = 5;
        static final int TRANSACTION_getAppNotificationConfigs = 3;
        static final int TRANSACTION_reconnectByNodeId = 1;
        static final int TRANSACTION_removeDeviceByNodeId = 2;
        static final int TRANSACTION_setAppNotificationConfig = 4;

        public static class Proxy implements PartnerApi {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.google.android.clockwork.companion.partnerapi.PartnerApi
            public int batchSetAppNotificationConfigs(List<AppNotificationConfig> list, BatchSetAppNotificationConfigsCallback batchSetAppNotificationConfigsCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PartnerApi.DESCRIPTOR);
                    _Parcel.writeTypedList(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(batchSetAppNotificationConfigsCallback);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.android.clockwork.companion.partnerapi.PartnerApi
            public List<AppNotificationConfig> getAppNotificationConfigs() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PartnerApi.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(AppNotificationConfig.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return PartnerApi.DESCRIPTOR;
            }

            @Override // com.google.android.clockwork.companion.partnerapi.PartnerApi
            public boolean reconnectByNodeId(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PartnerApi.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.android.clockwork.companion.partnerapi.PartnerApi
            public boolean removeDeviceByNodeId(String str, DeviceRemovalCallback deviceRemovalCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PartnerApi.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(deviceRemovalCallback);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.android.clockwork.companion.partnerapi.PartnerApi
            public int setAppNotificationConfig(AppNotificationConfig appNotificationConfig) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PartnerApi.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, appNotificationConfig, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, PartnerApi.DESCRIPTOR);
        }

        public static PartnerApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(PartnerApi.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof PartnerApi)) ? new Proxy(iBinder) : (PartnerApi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(PartnerApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(PartnerApi.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                boolean zReconnectByNodeId = reconnectByNodeId(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zReconnectByNodeId ? 1 : 0);
            } else if (i == 2) {
                boolean zRemoveDeviceByNodeId = removeDeviceByNodeId(parcel.readString(), DeviceRemovalCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zRemoveDeviceByNodeId ? 1 : 0);
            } else if (i == 3) {
                List<AppNotificationConfig> appNotificationConfigs = getAppNotificationConfigs();
                parcel2.writeNoException();
                _Parcel.writeTypedList(parcel2, appNotificationConfigs, 1);
            } else if (i == 4) {
                int appNotificationConfig = setAppNotificationConfig((AppNotificationConfig) _Parcel.readTypedObject(parcel, AppNotificationConfig.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(appNotificationConfig);
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int iBatchSetAppNotificationConfigs = batchSetAppNotificationConfigs(parcel.createTypedArrayList(AppNotificationConfig.CREATOR), BatchSetAppNotificationConfigsCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iBatchSetAppNotificationConfigs);
            }
            return true;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                writeTypedObject(parcel, list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    int batchSetAppNotificationConfigs(List<AppNotificationConfig> list, BatchSetAppNotificationConfigsCallback batchSetAppNotificationConfigsCallback) throws RemoteException;

    List<AppNotificationConfig> getAppNotificationConfigs() throws RemoteException;

    boolean reconnectByNodeId(String str) throws RemoteException;

    boolean removeDeviceByNodeId(String str, DeviceRemovalCallback deviceRemovalCallback) throws RemoteException;

    int setAppNotificationConfig(AppNotificationConfig appNotificationConfig) throws RemoteException;
}

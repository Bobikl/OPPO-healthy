package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.accessory.bean.DeviceInfo;
import com.heytap.accessory.bean.Message;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IPeripheralCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IPeripheralCallback";

    public static class Default implements IPeripheralCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onAdvertiseFailure(int i) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onAdvertiseStopped() throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onAdvertiseSuccess() throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onPairFailure(DeviceInfo deviceInfo, Message message) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onPairSuccess(DeviceInfo deviceInfo) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onRequestAuthenticate(DeviceInfo deviceInfo, Message message) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeripheralCallback
        public void onRequestConnect(DeviceInfo deviceInfo, Message message) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IPeripheralCallback {
        static final int TRANSACTION_onAdvertiseFailure = 2;
        static final int TRANSACTION_onAdvertiseStopped = 3;
        static final int TRANSACTION_onAdvertiseSuccess = 1;
        static final int TRANSACTION_onPairFailure = 7;
        static final int TRANSACTION_onPairSuccess = 6;
        static final int TRANSACTION_onRequestAuthenticate = 5;
        static final int TRANSACTION_onRequestConnect = 4;

        public static class Proxy implements IPeripheralCallback {
            public static IPeripheralCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IPeripheralCallback.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IPeripheralCallback
            public void onAdvertiseFailure(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAdvertiseFailure(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPeripheralCallback
            public void onAdvertiseStopped() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralCallback.DESCRIPTOR);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAdvertiseStopped();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPeripheralCallback
            public void onAdvertiseSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralCallback.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAdvertiseSuccess();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPeripheralCallback
            public void onPairFailure(DeviceInfo deviceInfo, Message message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralCallback.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (message != null) {
                        parcelObtain.writeInt(1);
                        message.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPairFailure(deviceInfo, message);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPeripheralCallback
            public void onPairSuccess(DeviceInfo deviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralCallback.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPairSuccess(deviceInfo);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPeripheralCallback
            public void onRequestAuthenticate(DeviceInfo deviceInfo, Message message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralCallback.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (message != null) {
                        parcelObtain.writeInt(1);
                        message.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onRequestAuthenticate(deviceInfo, message);
                        return;
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        message.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPeripheralCallback
            public void onRequestConnect(DeviceInfo deviceInfo, Message message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralCallback.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (message != null) {
                        parcelObtain.writeInt(1);
                        message.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onRequestConnect(deviceInfo, message);
                        return;
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        message.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPeripheralCallback.DESCRIPTOR);
        }

        public static IPeripheralCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPeripheralCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPeripheralCallback)) ? new Proxy(iBinder) : (IPeripheralCallback) iInterfaceQueryLocalInterface;
        }

        public static IPeripheralCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPeripheralCallback iPeripheralCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iPeripheralCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPeripheralCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IPeripheralCallback.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(IPeripheralCallback.DESCRIPTOR);
                    onAdvertiseSuccess();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(IPeripheralCallback.DESCRIPTOR);
                    onAdvertiseFailure(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(IPeripheralCallback.DESCRIPTOR);
                    onAdvertiseStopped();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(IPeripheralCallback.DESCRIPTOR);
                    DeviceInfo deviceInfoCreateFromParcel = parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null;
                    Message messageCreateFromParcel = parcel.readInt() != 0 ? Message.CREATOR.createFromParcel(parcel) : null;
                    onRequestConnect(deviceInfoCreateFromParcel, messageCreateFromParcel);
                    parcel2.writeNoException();
                    if (messageCreateFromParcel != null) {
                        parcel2.writeInt(1);
                        messageCreateFromParcel.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(IPeripheralCallback.DESCRIPTOR);
                    DeviceInfo deviceInfoCreateFromParcel2 = parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null;
                    Message messageCreateFromParcel2 = parcel.readInt() != 0 ? Message.CREATOR.createFromParcel(parcel) : null;
                    onRequestAuthenticate(deviceInfoCreateFromParcel2, messageCreateFromParcel2);
                    parcel2.writeNoException();
                    if (messageCreateFromParcel2 != null) {
                        parcel2.writeInt(1);
                        messageCreateFromParcel2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface(IPeripheralCallback.DESCRIPTOR);
                    onPairSuccess(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(IPeripheralCallback.DESCRIPTOR);
                    onPairFailure(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Message.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onAdvertiseFailure(int i) throws RemoteException;

    void onAdvertiseStopped() throws RemoteException;

    void onAdvertiseSuccess() throws RemoteException;

    void onPairFailure(DeviceInfo deviceInfo, Message message) throws RemoteException;

    void onPairSuccess(DeviceInfo deviceInfo) throws RemoteException;

    void onRequestAuthenticate(DeviceInfo deviceInfo, Message message) throws RemoteException;

    void onRequestConnect(DeviceInfo deviceInfo, Message message) throws RemoteException;
}

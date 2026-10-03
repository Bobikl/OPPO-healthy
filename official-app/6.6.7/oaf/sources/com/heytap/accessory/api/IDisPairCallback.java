package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.accessory.bean.DeviceInfo;
import com.heytap.accessory.bean.Message;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IDisPairCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IDisPairCallback";

    public static class Default implements IDisPairCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IDisPairCallback
        public void onPairFailure(DeviceInfo deviceInfo, Message message) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IDisPairCallback
        public void onPairMessage(DeviceInfo deviceInfo, Message message) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IDisPairCallback
        public void onPairSuccess(DeviceInfo deviceInfo, Message message) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDisPairCallback {
        static final int TRANSACTION_onPairFailure = 3;
        static final int TRANSACTION_onPairMessage = 2;
        static final int TRANSACTION_onPairSuccess = 1;

        public static class Proxy implements IDisPairCallback {
            public static IDisPairCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDisPairCallback.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IDisPairCallback
            public void onPairFailure(DeviceInfo deviceInfo, Message message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDisPairCallback.DESCRIPTOR);
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
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPairFailure(deviceInfo, message);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IDisPairCallback
            public void onPairMessage(DeviceInfo deviceInfo, Message message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDisPairCallback.DESCRIPTOR);
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
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onPairMessage(deviceInfo, message);
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

            @Override // com.heytap.accessory.api.IDisPairCallback
            public void onPairSuccess(DeviceInfo deviceInfo, Message message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDisPairCallback.DESCRIPTOR);
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
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onPairSuccess(deviceInfo, message);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDisPairCallback.DESCRIPTOR);
        }

        public static IDisPairCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDisPairCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDisPairCallback)) ? new Proxy(iBinder) : (IDisPairCallback) iInterfaceQueryLocalInterface;
        }

        public static IDisPairCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDisPairCallback iDisPairCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDisPairCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDisPairCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IDisPairCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IDisPairCallback.DESCRIPTOR);
                onPairSuccess(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Message.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel.enforceInterface(IDisPairCallback.DESCRIPTOR);
                onPairFailure(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Message.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(IDisPairCallback.DESCRIPTOR);
            DeviceInfo deviceInfoCreateFromParcel = parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null;
            Message messageCreateFromParcel = parcel.readInt() != 0 ? Message.CREATOR.createFromParcel(parcel) : null;
            onPairMessage(deviceInfoCreateFromParcel, messageCreateFromParcel);
            parcel2.writeNoException();
            if (messageCreateFromParcel != null) {
                parcel2.writeInt(1);
                messageCreateFromParcel.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    void onPairFailure(DeviceInfo deviceInfo, Message message) throws RemoteException;

    void onPairMessage(DeviceInfo deviceInfo, Message message) throws RemoteException;

    void onPairSuccess(DeviceInfo deviceInfo, Message message) throws RemoteException;
}

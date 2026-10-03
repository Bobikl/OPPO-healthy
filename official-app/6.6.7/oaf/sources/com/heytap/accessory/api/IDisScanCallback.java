package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.accessory.bean.DeviceInfo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IDisScanCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IDisScanCallback";

    public static class Default implements IDisScanCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IDisScanCallback
        public void onCancel() throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IDisScanCallback
        public void onDeviceFound(DeviceInfo deviceInfo) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDisScanCallback {
        static final int TRANSACTION_onCancel = 2;
        static final int TRANSACTION_onDeviceFound = 1;

        public static class Proxy implements IDisScanCallback {
            public static IDisScanCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDisScanCallback.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IDisScanCallback
            public void onCancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDisScanCallback.DESCRIPTOR);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onCancel();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IDisScanCallback
            public void onDeviceFound(DeviceInfo deviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDisScanCallback.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onDeviceFound(deviceInfo);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDisScanCallback.DESCRIPTOR);
        }

        public static IDisScanCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDisScanCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDisScanCallback)) ? new Proxy(iBinder) : (IDisScanCallback) iInterfaceQueryLocalInterface;
        }

        public static IDisScanCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDisScanCallback iDisScanCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDisScanCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDisScanCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IDisScanCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IDisScanCallback.DESCRIPTOR);
                onDeviceFound(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IDisScanCallback.DESCRIPTOR);
            onCancel();
            parcel2.writeNoException();
            return true;
        }
    }

    void onCancel() throws RemoteException;

    void onDeviceFound(DeviceInfo deviceInfo) throws RemoteException;
}

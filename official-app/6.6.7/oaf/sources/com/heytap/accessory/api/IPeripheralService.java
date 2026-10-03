package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.accessory.bean.AdvertiseSetting;
import com.heytap.accessory.bean.DeviceInfo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IPeripheralService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IPeripheralService";

    public static class Default implements IPeripheralService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IPeripheralService
        public void createGroup(IPeripheralCallback iPeripheralCallback) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeripheralService
        public void responseAuthenticate(DeviceInfo deviceInfo, boolean z) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeripheralService
        public void responseConnect(DeviceInfo deviceInfo, int i) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeripheralService
        public void startAdvertising(AdvertiseSetting advertiseSetting, IPeripheralCallback iPeripheralCallback) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeripheralService
        public void stopAdvertising() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IPeripheralService {
        static final int TRANSACTION_createGroup = 5;
        static final int TRANSACTION_responseAuthenticate = 4;
        static final int TRANSACTION_responseConnect = 3;
        static final int TRANSACTION_startAdvertising = 1;
        static final int TRANSACTION_stopAdvertising = 2;

        public static class Proxy implements IPeripheralService {
            public static IPeripheralService sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.accessory.api.IPeripheralService
            public void createGroup(IPeripheralCallback iPeripheralCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralService.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iPeripheralCallback != null ? iPeripheralCallback.asBinder() : null);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().createGroup(iPeripheralCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IPeripheralService.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IPeripheralService
            public void responseAuthenticate(DeviceInfo deviceInfo, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralService.DESCRIPTOR);
                    int i = 1;
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().responseAuthenticate(deviceInfo, z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPeripheralService
            public void responseConnect(DeviceInfo deviceInfo, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralService.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().responseConnect(deviceInfo, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPeripheralService
            public void startAdvertising(AdvertiseSetting advertiseSetting, IPeripheralCallback iPeripheralCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralService.DESCRIPTOR);
                    if (advertiseSetting != null) {
                        parcelObtain.writeInt(1);
                        advertiseSetting.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iPeripheralCallback != null ? iPeripheralCallback.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startAdvertising(advertiseSetting, iPeripheralCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPeripheralService
            public void stopAdvertising() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPeripheralService.DESCRIPTOR);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopAdvertising();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPeripheralService.DESCRIPTOR);
        }

        public static IPeripheralService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPeripheralService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPeripheralService)) ? new Proxy(iBinder) : (IPeripheralService) iInterfaceQueryLocalInterface;
        }

        public static IPeripheralService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPeripheralService iPeripheralService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iPeripheralService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPeripheralService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IPeripheralService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IPeripheralService.DESCRIPTOR);
                startAdvertising(parcel.readInt() != 0 ? AdvertiseSetting.CREATOR.createFromParcel(parcel) : null, IPeripheralCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(IPeripheralService.DESCRIPTOR);
                stopAdvertising();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(IPeripheralService.DESCRIPTOR);
                responseConnect(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(IPeripheralService.DESCRIPTOR);
                responseAuthenticate(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IPeripheralService.DESCRIPTOR);
            createGroup(IPeripheralCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void createGroup(IPeripheralCallback iPeripheralCallback) throws RemoteException;

    void responseAuthenticate(DeviceInfo deviceInfo, boolean z) throws RemoteException;

    void responseConnect(DeviceInfo deviceInfo, int i) throws RemoteException;

    void startAdvertising(AdvertiseSetting advertiseSetting, IPeripheralCallback iPeripheralCallback) throws RemoteException;

    void stopAdvertising() throws RemoteException;
}

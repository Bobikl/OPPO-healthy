package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.heytap.accessory.bean.DeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface IWifiP2pService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IWifiP2pService";

    public static class Default implements IWifiP2pService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IWifiP2pService
        public List<DeviceInfo> getCurrentWifiP2pDevices() throws RemoteException {
            return null;
        }

        @Override // com.heytap.accessory.api.IWifiP2pService
        public String joinWifiP2p(DeviceInfo deviceInfo) throws RemoteException {
            return null;
        }

        @Override // com.heytap.accessory.api.IWifiP2pService
        public void leaveWifiP2p(DeviceInfo deviceInfo) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IWifiP2pService
        public boolean registerReceiver(IWifiP2pChangeReceiver iWifiP2pChangeReceiver) throws RemoteException {
            return false;
        }

        @Override // com.heytap.accessory.api.IWifiP2pService
        public boolean unregisterReceiver(IWifiP2pChangeReceiver iWifiP2pChangeReceiver) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IWifiP2pService {
        static final int TRANSACTION_getCurrentWifiP2pDevices = 1;
        static final int TRANSACTION_joinWifiP2p = 2;
        static final int TRANSACTION_leaveWifiP2p = 3;
        static final int TRANSACTION_registerReceiver = 4;
        static final int TRANSACTION_unregisterReceiver = 5;

        public static class Proxy implements IWifiP2pService {
            public static IWifiP2pService sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.accessory.api.IWifiP2pService
            public List<DeviceInfo> getCurrentWifiP2pDevices() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWifiP2pService.DESCRIPTOR);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurrentWifiP2pDevices();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(DeviceInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IWifiP2pService.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IWifiP2pService
            public String joinWifiP2p(DeviceInfo deviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWifiP2pService.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().joinWifiP2p(deviceInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IWifiP2pService
            public void leaveWifiP2p(DeviceInfo deviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWifiP2pService.DESCRIPTOR);
                    if (deviceInfo != null) {
                        parcelObtain.writeInt(1);
                        deviceInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().leaveWifiP2p(deviceInfo);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IWifiP2pService
            public boolean registerReceiver(IWifiP2pChangeReceiver iWifiP2pChangeReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWifiP2pService.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iWifiP2pChangeReceiver != null ? iWifiP2pChangeReceiver.asBinder() : null);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().registerReceiver(iWifiP2pChangeReceiver);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IWifiP2pService
            public boolean unregisterReceiver(IWifiP2pChangeReceiver iWifiP2pChangeReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWifiP2pService.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iWifiP2pChangeReceiver != null ? iWifiP2pChangeReceiver.asBinder() : null);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().unregisterReceiver(iWifiP2pChangeReceiver);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWifiP2pService.DESCRIPTOR);
        }

        public static IWifiP2pService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWifiP2pService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWifiP2pService)) ? new Proxy(iBinder) : (IWifiP2pService) iInterfaceQueryLocalInterface;
        }

        public static IWifiP2pService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IWifiP2pService iWifiP2pService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iWifiP2pService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iWifiP2pService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IWifiP2pService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IWifiP2pService.DESCRIPTOR);
                List<DeviceInfo> currentWifiP2pDevices = getCurrentWifiP2pDevices();
                parcel2.writeNoException();
                parcel2.writeTypedList(currentWifiP2pDevices);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(IWifiP2pService.DESCRIPTOR);
                String strJoinWifiP2p = joinWifiP2p(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(strJoinWifiP2p);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(IWifiP2pService.DESCRIPTOR);
                leaveWifiP2p(parcel.readInt() != 0 ? DeviceInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(IWifiP2pService.DESCRIPTOR);
                boolean zRegisterReceiver = registerReceiver(IWifiP2pChangeReceiver.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zRegisterReceiver ? 1 : 0);
                return true;
            }
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IWifiP2pService.DESCRIPTOR);
            boolean zUnregisterReceiver = unregisterReceiver(IWifiP2pChangeReceiver.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeInt(zUnregisterReceiver ? 1 : 0);
            return true;
        }
    }

    List<DeviceInfo> getCurrentWifiP2pDevices() throws RemoteException;

    String joinWifiP2p(DeviceInfo deviceInfo) throws RemoteException;

    void leaveWifiP2p(DeviceInfo deviceInfo) throws RemoteException;

    boolean registerReceiver(IWifiP2pChangeReceiver iWifiP2pChangeReceiver) throws RemoteException;

    boolean unregisterReceiver(IWifiP2pChangeReceiver iWifiP2pChangeReceiver) throws RemoteException;
}

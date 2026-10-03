package com.heytap.accessory.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IDiscoveryNativeService extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IDiscoveryNativeService";

    public static class Default implements IDiscoveryNativeService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IDiscoveryNativeService
        public IPeripheralService getAdvertiseService() throws RemoteException {
            return null;
        }

        @Override // com.heytap.accessory.api.IDiscoveryNativeService
        public ICentralService getScanService() throws RemoteException {
            return null;
        }

        @Override // com.heytap.accessory.api.IDiscoveryNativeService
        public IWifiP2pService getWfiP2pService() throws RemoteException {
            return null;
        }

        @Override // com.heytap.accessory.api.IDiscoveryNativeService
        public Bundle makeDiscoveryConnection(int i, String str, IDeathCallback iDeathCallback, int i2, IServiceConnectionIndicationCallback iServiceConnectionIndicationCallback) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IDiscoveryNativeService {
        static final int TRANSACTION_getAdvertiseService = 2;
        static final int TRANSACTION_getScanService = 1;
        static final int TRANSACTION_getWfiP2pService = 3;
        static final int TRANSACTION_makeDiscoveryConnection = 4;

        public static class Proxy implements IDiscoveryNativeService {
            public static IDiscoveryNativeService sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.accessory.api.IDiscoveryNativeService
            public IPeripheralService getAdvertiseService() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDiscoveryNativeService.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAdvertiseService();
                    }
                    parcelObtain2.readException();
                    return IPeripheralService.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IDiscoveryNativeService.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IDiscoveryNativeService
            public ICentralService getScanService() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDiscoveryNativeService.DESCRIPTOR);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getScanService();
                    }
                    parcelObtain2.readException();
                    return ICentralService.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IDiscoveryNativeService
            public IWifiP2pService getWfiP2pService() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDiscoveryNativeService.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getWfiP2pService();
                    }
                    parcelObtain2.readException();
                    return IWifiP2pService.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IDiscoveryNativeService
            public Bundle makeDiscoveryConnection(int i, String str, IDeathCallback iDeathCallback, int i2, IServiceConnectionIndicationCallback iServiceConnectionIndicationCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDiscoveryNativeService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iDeathCallback != null ? iDeathCallback.asBinder() : null);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongBinder(iServiceConnectionIndicationCallback != null ? iServiceConnectionIndicationCallback.asBinder() : null);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().makeDiscoveryConnection(i, str, iDeathCallback, i2, iServiceConnectionIndicationCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDiscoveryNativeService.DESCRIPTOR);
        }

        public static IDiscoveryNativeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDiscoveryNativeService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDiscoveryNativeService)) ? new Proxy(iBinder) : (IDiscoveryNativeService) iInterfaceQueryLocalInterface;
        }

        public static IDiscoveryNativeService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDiscoveryNativeService iDiscoveryNativeService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDiscoveryNativeService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDiscoveryNativeService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IDiscoveryNativeService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IDiscoveryNativeService.DESCRIPTOR);
                ICentralService scanService = getScanService();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(scanService != null ? scanService.asBinder() : null);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(IDiscoveryNativeService.DESCRIPTOR);
                IPeripheralService advertiseService = getAdvertiseService();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(advertiseService != null ? advertiseService.asBinder() : null);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(IDiscoveryNativeService.DESCRIPTOR);
                IWifiP2pService wfiP2pService = getWfiP2pService();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(wfiP2pService != null ? wfiP2pService.asBinder() : null);
                return true;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IDiscoveryNativeService.DESCRIPTOR);
            Bundle bundleMakeDiscoveryConnection = makeDiscoveryConnection(parcel.readInt(), parcel.readString(), IDeathCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), IServiceConnectionIndicationCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            if (bundleMakeDiscoveryConnection != null) {
                parcel2.writeInt(1);
                bundleMakeDiscoveryConnection.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    IPeripheralService getAdvertiseService() throws RemoteException;

    ICentralService getScanService() throws RemoteException;

    IWifiP2pService getWfiP2pService() throws RemoteException;

    Bundle makeDiscoveryConnection(int i, String str, IDeathCallback iDeathCallback, int i2, IServiceConnectionIndicationCallback iServiceConnectionIndicationCallback) throws RemoteException;
}

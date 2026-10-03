package com.heytap.accessory.api;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IGenFrameworkManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IGenFrameworkManager";

    public static class Default implements IGenFrameworkManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IGenFrameworkManager
        public boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException {
            return false;
        }

        @Override // com.heytap.accessory.api.IGenFrameworkManager
        public void registerDeathCallback(long j, ICMDeathCallback iCMDeathCallback) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IGenFrameworkManager
        public Bundle sendCommand(long j, int i, Bundle bundle) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IGenFrameworkManager {
        static final int TRANSACTION_handleAuthenticationWithPermission = 3;
        static final int TRANSACTION_registerDeathCallback = 1;
        static final int TRANSACTION_sendCommand = 2;

        public static class Proxy implements IGenFrameworkManager {
            public static IGenFrameworkManager sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IGenFrameworkManager.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IGenFrameworkManager
            public boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IGenFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().handleAuthenticationWithPermission(i, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IGenFrameworkManager
            public void registerDeathCallback(long j, ICMDeathCallback iCMDeathCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IGenFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeStrongBinder(iCMDeathCallback != null ? iCMDeathCallback.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerDeathCallback(j, iCMDeathCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IGenFrameworkManager
            public Bundle sendCommand(long j, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IGenFrameworkManager.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendCommand(j, i, bundle);
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
            attachInterface(this, IGenFrameworkManager.DESCRIPTOR);
        }

        public static IGenFrameworkManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IGenFrameworkManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGenFrameworkManager)) ? new Proxy(iBinder) : (IGenFrameworkManager) iInterfaceQueryLocalInterface;
        }

        public static IGenFrameworkManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IGenFrameworkManager iGenFrameworkManager) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iGenFrameworkManager == null) {
                return false;
            }
            Proxy.sDefaultImpl = iGenFrameworkManager;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IGenFrameworkManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IGenFrameworkManager.DESCRIPTOR);
                registerDeathCallback(parcel.readLong(), ICMDeathCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel.enforceInterface(IGenFrameworkManager.DESCRIPTOR);
                boolean zHandleAuthenticationWithPermission = handleAuthenticationWithPermission(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zHandleAuthenticationWithPermission ? 1 : 0);
                return true;
            }
            parcel.enforceInterface(IGenFrameworkManager.DESCRIPTOR);
            Bundle bundleSendCommand = sendCommand(parcel.readLong(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (bundleSendCommand != null) {
                parcel2.writeInt(1);
                bundleSendCommand.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException;

    void registerDeathCallback(long j, ICMDeathCallback iCMDeathCallback) throws RemoteException;

    Bundle sendCommand(long j, int i, Bundle bundle) throws RemoteException;
}

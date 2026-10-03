package com.heytap.accessory.core;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.heytap.accessory.api.IDeathCallback;

/* JADX INFO: loaded from: classes14.dex */
public interface IFileManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.core.IFileManager";

    public static class Default implements IFileManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.core.IFileManager
        public boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException {
            return false;
        }

        @Override // com.heytap.accessory.core.IFileManager
        public boolean registerCallbackFacilitator(int i, ResultReceiver resultReceiver) throws RemoteException {
            return false;
        }

        @Override // com.heytap.accessory.core.IFileManager
        public boolean registerDeathCallback(IDeathCallback iDeathCallback, long j2, long j3) throws RemoteException {
            return false;
        }

        @Override // com.heytap.accessory.core.IFileManager
        public Bundle sendCommand(String str) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IFileManager {
        static final int TRANSACTION_handleAuthenticationWithPermission = 3;
        static final int TRANSACTION_registerCallbackFacilitator = 1;
        static final int TRANSACTION_registerDeathCallback = 4;
        static final int TRANSACTION_sendCommand = 2;

        public static class Proxy implements IFileManager {
            public static IFileManager sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IFileManager.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.core.IFileManager
            public boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFileManager.DESCRIPTOR);
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

            @Override // com.heytap.accessory.core.IFileManager
            public boolean registerCallbackFacilitator(int i, ResultReceiver resultReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFileManager.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (resultReceiver != null) {
                        parcelObtain.writeInt(1);
                        resultReceiver.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().registerCallbackFacilitator(i, resultReceiver);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.core.IFileManager
            public boolean registerDeathCallback(IDeathCallback iDeathCallback, long j2, long j3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFileManager.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iDeathCallback != null ? iDeathCallback.asBinder() : null);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().registerDeathCallback(iDeathCallback, j2, j3);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.core.IFileManager
            public Bundle sendCommand(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IFileManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendCommand(str);
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
            attachInterface(this, IFileManager.DESCRIPTOR);
        }

        public static IFileManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IFileManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IFileManager)) ? new Proxy(iBinder) : (IFileManager) iInterfaceQueryLocalInterface;
        }

        public static IFileManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IFileManager iFileManager) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iFileManager == null) {
                return false;
            }
            Proxy.sDefaultImpl = iFileManager;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IFileManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IFileManager.DESCRIPTOR);
                boolean zRegisterCallbackFacilitator = registerCallbackFacilitator(parcel.readInt(), parcel.readInt() != 0 ? (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(zRegisterCallbackFacilitator ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(IFileManager.DESCRIPTOR);
                Bundle bundleSendCommand = sendCommand(parcel.readString());
                parcel2.writeNoException();
                if (bundleSendCommand != null) {
                    parcel2.writeInt(1);
                    bundleSendCommand.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(IFileManager.DESCRIPTOR);
                boolean zHandleAuthenticationWithPermission = handleAuthenticationWithPermission(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zHandleAuthenticationWithPermission ? 1 : 0);
                return true;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IFileManager.DESCRIPTOR);
            boolean zRegisterDeathCallback = registerDeathCallback(IDeathCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
            parcel2.writeInt(zRegisterDeathCallback ? 1 : 0);
            return true;
        }
    }

    boolean handleAuthenticationWithPermission(int i, String str) throws RemoteException;

    boolean registerCallbackFacilitator(int i, ResultReceiver resultReceiver) throws RemoteException;

    boolean registerDeathCallback(IDeathCallback iDeathCallback, long j2, long j3) throws RemoteException;

    Bundle sendCommand(String str) throws RemoteException;
}

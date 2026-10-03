package com.heytap.accessory.core;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IStreamManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.core.IStreamManager";

    public static class Default implements IStreamManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.core.IStreamManager
        public boolean registerCallbackFacilitator(int i, ResultReceiver resultReceiver) throws RemoteException {
            return false;
        }

        @Override // com.heytap.accessory.core.IStreamManager
        public Bundle sendCommand(String str, Bundle bundle) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IStreamManager {
        static final int TRANSACTION_registerCallbackFacilitator = 1;
        static final int TRANSACTION_sendCommand = 2;

        public static class Proxy implements IStreamManager {
            public static IStreamManager sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IStreamManager.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.core.IStreamManager
            public boolean registerCallbackFacilitator(int i, ResultReceiver resultReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IStreamManager.DESCRIPTOR);
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

            @Override // com.heytap.accessory.core.IStreamManager
            public Bundle sendCommand(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IStreamManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendCommand(str, bundle);
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
            attachInterface(this, IStreamManager.DESCRIPTOR);
        }

        public static IStreamManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IStreamManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IStreamManager)) ? new Proxy(iBinder) : (IStreamManager) iInterfaceQueryLocalInterface;
        }

        public static IStreamManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IStreamManager iStreamManager) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iStreamManager == null) {
                return false;
            }
            Proxy.sDefaultImpl = iStreamManager;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IStreamManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IStreamManager.DESCRIPTOR);
                boolean zRegisterCallbackFacilitator = registerCallbackFacilitator(parcel.readInt(), parcel.readInt() != 0 ? (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(zRegisterCallbackFacilitator ? 1 : 0);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IStreamManager.DESCRIPTOR);
            Bundle bundleSendCommand = sendCommand(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
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

    boolean registerCallbackFacilitator(int i, ResultReceiver resultReceiver) throws RemoteException;

    Bundle sendCommand(String str, Bundle bundle) throws RemoteException;
}

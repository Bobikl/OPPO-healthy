package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes14.dex */
public interface IDeathCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IDeathCallback";

    public static class Default implements IDeathCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IDeathCallback
        public String getAppName() throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IDeathCallback {
        static final int TRANSACTION_getAppName = 1;

        public static class Proxy implements IDeathCallback {
            public static IDeathCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.accessory.api.IDeathCallback
            public String getAppName() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeathCallback.DESCRIPTOR);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppName();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IDeathCallback.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IDeathCallback.DESCRIPTOR);
        }

        public static IDeathCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDeathCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeathCallback)) ? new Proxy(iBinder) : (IDeathCallback) iInterfaceQueryLocalInterface;
        }

        public static IDeathCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeathCallback iDeathCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDeathCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDeathCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IDeathCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IDeathCallback.DESCRIPTOR);
            String appName = getAppName();
            parcel2.writeNoException();
            parcel2.writeString(appName);
            return true;
        }
    }

    String getAppName() throws RemoteException;
}

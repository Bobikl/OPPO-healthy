package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes14.dex */
public interface ICMDeathCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.ICMDeathCallback";

    public static class Default implements ICMDeathCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.ICMDeathCallback
        public String getAppName() throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ICMDeathCallback {
        static final int TRANSACTION_getAppName = 1;

        public static class Proxy implements ICMDeathCallback {
            public static ICMDeathCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.accessory.api.ICMDeathCallback
            public String getAppName() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICMDeathCallback.DESCRIPTOR);
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
                return ICMDeathCallback.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, ICMDeathCallback.DESCRIPTOR);
        }

        public static ICMDeathCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICMDeathCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICMDeathCallback)) ? new Proxy(iBinder) : (ICMDeathCallback) iInterfaceQueryLocalInterface;
        }

        public static ICMDeathCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ICMDeathCallback iCMDeathCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iCMDeathCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iCMDeathCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(ICMDeathCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(ICMDeathCallback.DESCRIPTOR);
            String appName = getAppName();
            parcel2.writeNoException();
            parcel2.writeString(appName);
            return true;
        }
    }

    String getAppName() throws RemoteException;
}

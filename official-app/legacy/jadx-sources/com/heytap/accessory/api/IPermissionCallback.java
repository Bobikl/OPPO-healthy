package com.heytap.accessory.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes14.dex */
public interface IPermissionCallback extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.accessory.api.IPermissionCallback";

    public static class Default implements IPermissionCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.accessory.api.IPermissionCallback
        public void onGrantedFail(int i) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPermissionCallback
        public void onGrantedSuccess() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IPermissionCallback {
        static final int TRANSACTION_onGrantedFail = 2;
        static final int TRANSACTION_onGrantedSuccess = 1;

        public static class Proxy implements IPermissionCallback {
            public static IPermissionCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IPermissionCallback.DESCRIPTOR;
            }

            @Override // com.heytap.accessory.api.IPermissionCallback
            public void onGrantedFail(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPermissionCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onGrantedFail(i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.accessory.api.IPermissionCallback
            public void onGrantedSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IPermissionCallback.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onGrantedSuccess();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPermissionCallback.DESCRIPTOR);
        }

        public static IPermissionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPermissionCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IPermissionCallback)) ? new Proxy(iBinder) : (IPermissionCallback) iInterfaceQueryLocalInterface;
        }

        public static IPermissionCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPermissionCallback iPermissionCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iPermissionCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPermissionCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IPermissionCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IPermissionCallback.DESCRIPTOR);
                onGrantedSuccess();
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IPermissionCallback.DESCRIPTOR);
            onGrantedFail(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onGrantedFail(int i) throws RemoteException;

    void onGrantedSuccess() throws RemoteException;
}

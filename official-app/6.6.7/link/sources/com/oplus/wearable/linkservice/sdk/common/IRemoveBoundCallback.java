package com.oplus.wearable.linkservice.sdk.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IRemoveBoundCallback extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback";

    public static class Default implements IRemoveBoundCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback
        public void onDeviceRemovalFailed(String str, int i) throws RemoteException {
        }

        @Override // com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback
        public void onDeviceRemovalSucceeded(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRemoveBoundCallback {
        static final int TRANSACTION_onDeviceRemovalFailed = 2;
        static final int TRANSACTION_onDeviceRemovalSucceeded = 1;

        public static class Proxy implements IRemoveBoundCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IRemoveBoundCallback.DESCRIPTOR;
            }

            @Override // com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback
            public void onDeviceRemovalFailed(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoveBoundCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.wearable.linkservice.sdk.common.IRemoveBoundCallback
            public void onDeviceRemovalSucceeded(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoveBoundCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRemoveBoundCallback.DESCRIPTOR);
        }

        public static IRemoveBoundCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRemoveBoundCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoveBoundCallback)) ? new Proxy(iBinder) : (IRemoveBoundCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRemoveBoundCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRemoveBoundCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onDeviceRemovalSucceeded(parcel.readString());
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onDeviceRemovalFailed(parcel.readString(), parcel.readInt());
            }
            return true;
        }
    }

    void onDeviceRemovalFailed(String str, int i) throws RemoteException;

    void onDeviceRemovalSucceeded(String str) throws RemoteException;
}

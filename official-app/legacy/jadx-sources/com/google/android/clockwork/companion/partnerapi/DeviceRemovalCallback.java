package com.google.android.clockwork.companion.partnerapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes13.dex */
public interface DeviceRemovalCallback extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.clockwork.companion.partnerapi.DeviceRemovalCallback";

    public static class Default implements DeviceRemovalCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.DeviceRemovalCallback
        public void onDeviceRemovalFailed(String str, int i) throws RemoteException {
        }

        @Override // com.google.android.clockwork.companion.partnerapi.DeviceRemovalCallback
        public void onDeviceRemovalSucceeded(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements DeviceRemovalCallback {
        static final int TRANSACTION_onDeviceRemovalFailed = 2;
        static final int TRANSACTION_onDeviceRemovalSucceeded = 1;

        public static class Proxy implements DeviceRemovalCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return DeviceRemovalCallback.DESCRIPTOR;
            }

            @Override // com.google.android.clockwork.companion.partnerapi.DeviceRemovalCallback
            public void onDeviceRemovalFailed(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DeviceRemovalCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.android.clockwork.companion.partnerapi.DeviceRemovalCallback
            public void onDeviceRemovalSucceeded(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DeviceRemovalCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DeviceRemovalCallback.DESCRIPTOR);
        }

        public static DeviceRemovalCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DeviceRemovalCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof DeviceRemovalCallback)) ? new Proxy(iBinder) : (DeviceRemovalCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(DeviceRemovalCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(DeviceRemovalCallback.DESCRIPTOR);
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

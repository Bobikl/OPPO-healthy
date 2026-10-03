package com.oplus.deepthinker.sdk.app.aidl.eventfountain;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IEventCallback extends IInterface {

    public static class Default implements IEventCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventCallback
        public void onEventStateChanged(DeviceEventResult deviceEventResult) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IEventCallback {
        private static final String DESCRIPTOR = "com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventCallback";
        static final int TRANSACTION_onEventStateChanged = 1;

        public static class Proxy implements IEventCallback {
            public static IEventCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventCallback
            public void onEventStateChanged(DeviceEventResult deviceEventResult) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (deviceEventResult != null) {
                        parcelObtain.writeInt(1);
                        deviceEventResult.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onEventStateChanged(deviceEventResult);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IEventCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEventCallback)) ? new Proxy(iBinder) : (IEventCallback) iInterfaceQueryLocalInterface;
        }

        public static IEventCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IEventCallback iEventCallback) {
            if (Proxy.sDefaultImpl != null || iEventCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iEventCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onEventStateChanged(parcel.readInt() != 0 ? DeviceEventResult.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onEventStateChanged(DeviceEventResult deviceEventResult) throws RemoteException;
}

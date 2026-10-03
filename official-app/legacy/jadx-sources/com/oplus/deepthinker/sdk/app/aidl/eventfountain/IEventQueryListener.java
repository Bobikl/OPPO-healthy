package com.oplus.deepthinker.sdk.app.aidl.eventfountain;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IEventQueryListener extends IInterface {

    public static class Default implements IEventQueryListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener
        public void onFailure(int i) throws RemoteException {
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener
        public void onSuccess(DeviceEventResult deviceEventResult) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IEventQueryListener {
        private static final String DESCRIPTOR = "com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener";
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        public static class Proxy implements IEventQueryListener {
            public static IEventQueryListener sDefaultImpl;
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

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener
            public void onFailure(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onFailure(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener
            public void onSuccess(DeviceEventResult deviceEventResult) throws RemoteException {
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
                    Stub.getDefaultImpl().onSuccess(deviceEventResult);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IEventQueryListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEventQueryListener)) ? new Proxy(iBinder) : (IEventQueryListener) iInterfaceQueryLocalInterface;
        }

        public static IEventQueryListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IEventQueryListener iEventQueryListener) {
            if (Proxy.sDefaultImpl != null || iEventQueryListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iEventQueryListener;
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
                onSuccess(parcel.readInt() != 0 ? DeviceEventResult.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onFailure(parcel.readInt());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void onFailure(int i) throws RemoteException;

    void onSuccess(DeviceEventResult deviceEventResult) throws RemoteException;
}

package com.oplus.deepthinker.sdk.app.aidl.eventfountain;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IEventRegisterListener extends IInterface {

    public static class Default implements IEventRegisterListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventRegisterListener
        public void onFailure(int i) throws RemoteException {
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventRegisterListener
        public void onSuccess() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IEventRegisterListener {
        private static final String DESCRIPTOR = "com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventRegisterListener";
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        public static class Proxy implements IEventRegisterListener {
            public static IEventRegisterListener sDefaultImpl;
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

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventRegisterListener
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

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventRegisterListener
            public void onSuccess() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSuccess();
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IEventRegisterListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEventRegisterListener)) ? new Proxy(iBinder) : (IEventRegisterListener) iInterfaceQueryLocalInterface;
        }

        public static IEventRegisterListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IEventRegisterListener iEventRegisterListener) {
            if (Proxy.sDefaultImpl != null || iEventRegisterListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iEventRegisterListener;
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
                onSuccess();
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

    void onSuccess() throws RemoteException;
}

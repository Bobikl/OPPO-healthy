package com.oplus.onet.obcommon;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface IServerCallback extends IInterface {

    public static class Default implements IServerCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.onet.obcommon.IServerCallback
        public void onServerInitialized(int i, byte[] bArr) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IServerCallback {
        private static final String DESCRIPTOR = "com.oplus.onet.obcommon.IServerCallback";
        public static final int TRANSACTION_onServerInitialized = 1;

        public static class Proxy implements IServerCallback {
            public static IServerCallback sDefaultImpl;
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

            @Override // com.oplus.onet.obcommon.IServerCallback
            public void onServerInitialized(int i, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onServerInitialized(i, bArr);
                    } else {
                        parcelObtain2.readException();
                        parcelObtain2.readByteArray(bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IServerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServerCallback)) ? new Proxy(iBinder) : (IServerCallback) iInterfaceQueryLocalInterface;
        }

        public static IServerCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IServerCallback iServerCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iServerCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iServerCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            int i3 = parcel.readInt();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            onServerInitialized(i3, bArrCreateByteArray);
            parcel2.writeNoException();
            parcel2.writeByteArray(bArrCreateByteArray);
            return true;
        }
    }

    void onServerInitialized(int i, byte[] bArr) throws RemoteException;
}

package com.heytap.health.interconnection;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public interface IInterTransportApi extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.interconnection.IInterTransportApi";

    public static class Default implements IInterTransportApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.interconnection.IInterTransportApi
        public void sendCarBindInfo() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IInterTransportApi {
        static final int TRANSACTION_sendCarBindInfo = 1;

        public static class Proxy implements IInterTransportApi {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IInterTransportApi.DESCRIPTOR;
            }

            @Override // com.heytap.health.interconnection.IInterTransportApi
            public void sendCarBindInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInterTransportApi.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IInterTransportApi.DESCRIPTOR);
        }

        public static IInterTransportApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IInterTransportApi.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IInterTransportApi)) ? new Proxy(iBinder) : (IInterTransportApi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IInterTransportApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IInterTransportApi.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            sendCarBindInfo();
            parcel2.writeNoException();
            return true;
        }
    }

    void sendCarBindInfo() throws RemoteException;
}

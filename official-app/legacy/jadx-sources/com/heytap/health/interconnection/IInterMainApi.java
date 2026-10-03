package com.heytap.health.interconnection;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public interface IInterMainApi extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.interconnection.IInterMainApi";

    public static class Default implements IInterMainApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.interconnection.IInterMainApi
        public void startPage(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IInterMainApi {
        static final int TRANSACTION_startPage = 1;

        public static class Proxy implements IInterMainApi {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IInterMainApi.DESCRIPTOR;
            }

            @Override // com.heytap.health.interconnection.IInterMainApi
            public void startPage(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInterMainApi.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IInterMainApi.DESCRIPTOR);
        }

        public static IInterMainApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IInterMainApi.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IInterMainApi)) ? new Proxy(iBinder) : (IInterMainApi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IInterMainApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IInterMainApi.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            startPage(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void startPage(String str) throws RemoteException;
}

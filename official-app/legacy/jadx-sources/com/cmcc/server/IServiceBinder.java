package com.cmcc.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes13.dex */
public interface IServiceBinder extends IInterface {
    public static final String DESCRIPTOR = "com.cmcc.server.IServiceBinder";

    public static class Default implements IServiceBinder {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.cmcc.server.IServiceBinder
        public IBinder getServiceBinder(String str) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IServiceBinder {
        static final int TRANSACTION_getServiceBinder = 1;

        public static class Proxy implements IServiceBinder {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IServiceBinder.DESCRIPTOR;
            }

            @Override // com.cmcc.server.IServiceBinder
            public IBinder getServiceBinder(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceBinder.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IServiceBinder.DESCRIPTOR);
        }

        public static IServiceBinder asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IServiceBinder.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServiceBinder)) ? new Proxy(iBinder) : (IServiceBinder) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IServiceBinder.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IServiceBinder.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            IBinder serviceBinder = getServiceBinder(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(serviceBinder);
            return true;
        }
    }

    IBinder getServiceBinder(String str) throws RemoteException;
}

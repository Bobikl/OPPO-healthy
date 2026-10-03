package com.heytap.databaseengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes14.dex */
public interface IBinderPool extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.IBinderPool";

    public static class Default implements IBinderPool {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.IBinderPool
        public IBinder queryBinder(String str) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IBinderPool {
        static final int TRANSACTION_queryBinder = 1;

        public static class Proxy implements IBinderPool {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IBinderPool.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.IBinderPool
            public IBinder queryBinder(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IBinderPool.DESCRIPTOR);
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
            attachInterface(this, IBinderPool.DESCRIPTOR);
        }

        public static IBinderPool asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IBinderPool.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IBinderPool)) ? new Proxy(iBinder) : (IBinderPool) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBinderPool.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBinderPool.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            IBinder iBinderQueryBinder = queryBinder(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iBinderQueryBinder);
            return true;
        }
    }

    IBinder queryBinder(String str) throws RemoteException;
}

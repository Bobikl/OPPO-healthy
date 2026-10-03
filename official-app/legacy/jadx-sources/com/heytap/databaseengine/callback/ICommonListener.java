package com.heytap.databaseengine.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface ICommonListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.callback.ICommonListener";

    public static class Default implements ICommonListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.callback.ICommonListener
        public void onFailure(int i, List list) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.callback.ICommonListener
        public void onSuccess(int i, List list) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICommonListener {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        public static class Proxy implements ICommonListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICommonListener.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.callback.ICommonListener
            public void onFailure(int i, List list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeList(list);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.callback.ICommonListener
            public void onSuccess(int i, List list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICommonListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeList(list);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICommonListener.DESCRIPTOR);
        }

        public static ICommonListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICommonListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICommonListener)) ? new Proxy(iBinder) : (ICommonListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ICommonListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ICommonListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onSuccess(parcel.readInt(), parcel.readArrayList(getClass().getClassLoader()));
                parcel2.writeNoException();
            } else {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFailure(parcel.readInt(), parcel.readArrayList(getClass().getClassLoader()));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onFailure(int i, List list) throws RemoteException;

    void onSuccess(int i, List list) throws RemoteException;
}

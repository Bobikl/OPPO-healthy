package com.heytap.databaseengine.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface IDataReadResultListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.callback.IDataReadResultListener";

    public static class Default implements IDataReadResultListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.callback.IDataReadResultListener
        public void onResult(List list, int i, int i2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDataReadResultListener {
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements IDataReadResultListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDataReadResultListener.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.callback.IDataReadResultListener
            public void onResult(List list, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDataReadResultListener.DESCRIPTOR);
                    parcelObtain.writeList(list);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDataReadResultListener.DESCRIPTOR);
        }

        public static IDataReadResultListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDataReadResultListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDataReadResultListener)) ? new Proxy(iBinder) : (IDataReadResultListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDataReadResultListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDataReadResultListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.readArrayList(getClass().getClassLoader()), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(List list, int i, int i2) throws RemoteException;
}

package com.heytap.databaseengine.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface IDataOperateListener extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.callback.IDataOperateListener";

    public static class Default implements IDataOperateListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.callback.IDataOperateListener
        public void onResult(int i, List list) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDataOperateListener {
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements IDataOperateListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IDataOperateListener.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.callback.IDataOperateListener
            public void onResult(int i, List list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDataOperateListener.DESCRIPTOR);
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
            attachInterface(this, IDataOperateListener.DESCRIPTOR);
        }

        public static IDataOperateListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDataOperateListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDataOperateListener)) ? new Proxy(iBinder) : (IDataOperateListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDataOperateListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDataOperateListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult(parcel.readInt(), parcel.readArrayList(getClass().getClassLoader()));
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(int i, List list) throws RemoteException;
}

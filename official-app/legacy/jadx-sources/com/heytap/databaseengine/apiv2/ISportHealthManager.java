package com.heytap.databaseengine.apiv2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.databaseengine.apiv3.DataInsertRequest;
import com.heytap.databaseengine.apiv3.DataReadRequest;
import com.heytap.databaseengine.callback.IDataOperateListener;
import com.heytap.databaseengine.callback.IDataReadResultListener;
import com.heytap.databaseengine.option.DataReadOption;

/* JADX INFO: loaded from: classes15.dex */
public interface ISportHealthManager extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.apiv2.ISportHealthManager";

    public static class Default implements ISportHealthManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.apiv2.ISportHealthManager
        public void insert(DataInsertRequest dataInsertRequest, IDataOperateListener iDataOperateListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.ISportHealthManager
        public void query(String str, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.ISportHealthManager
        public void read(DataReadOption dataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.ISportHealthManager
        public void readv2(DataReadRequest dataReadRequest, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISportHealthManager {
        static final int TRANSACTION_insert = 4;
        static final int TRANSACTION_query = 2;
        static final int TRANSACTION_read = 1;
        static final int TRANSACTION_readv2 = 3;

        public static class Proxy implements ISportHealthManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISportHealthManager.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.apiv2.ISportHealthManager
            public void insert(DataInsertRequest dataInsertRequest, IDataOperateListener iDataOperateListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISportHealthManager.DESCRIPTOR);
                    a.d(parcelObtain, dataInsertRequest, 0);
                    parcelObtain.writeStrongInterface(iDataOperateListener);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.ISportHealthManager
            public void query(String str, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISportHealthManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.ISportHealthManager
            public void read(DataReadOption dataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISportHealthManager.DESCRIPTOR);
                    a.d(parcelObtain, dataReadOption, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.ISportHealthManager
            public void readv2(DataReadRequest dataReadRequest, IDataReadResultListener iDataReadResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISportHealthManager.DESCRIPTOR);
                    a.d(parcelObtain, dataReadRequest, 0);
                    parcelObtain.writeStrongInterface(iDataReadResultListener);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISportHealthManager.DESCRIPTOR);
        }

        public static ISportHealthManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISportHealthManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISportHealthManager)) ? new Proxy(iBinder) : (ISportHealthManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ISportHealthManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ISportHealthManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                read((DataReadOption) a.c(parcel, DataReadOption.CREATOR), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                query(parcel.readString(), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                readv2((DataReadRequest) a.c(parcel, DataReadRequest.CREATOR), IDataReadResultListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                insert((DataInsertRequest) a.c(parcel, DataInsertRequest.CREATOR), IDataOperateListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class a {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void insert(DataInsertRequest dataInsertRequest, IDataOperateListener iDataOperateListener) throws RemoteException;

    void query(String str, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void read(DataReadOption dataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void readv2(DataReadRequest dataReadRequest, IDataReadResultListener iDataReadResultListener) throws RemoteException;
}

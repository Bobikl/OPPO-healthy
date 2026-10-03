package com.oplus.health.apiprovider;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IServiceCallback extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.health.apiprovider.IServiceCallback";

    public static class Default implements IServiceCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.health.apiprovider.IServiceCallback
        public String dumpWithParam(String[] strArr) throws RemoteException {
            return null;
        }

        @Override // com.oplus.health.apiprovider.IServiceCallback
        public void onRemoteDied(String str) throws RemoteException {
        }

        @Override // com.oplus.health.apiprovider.IServiceCallback
        public void onServiceAdd(String str, String str2) throws RemoteException {
        }

        @Override // com.oplus.health.apiprovider.IServiceCallback
        public void onServiceRemoved(String str, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IServiceCallback {
        static final int TRANSACTION_dumpWithParam = 1;
        static final int TRANSACTION_onRemoteDied = 4;
        static final int TRANSACTION_onServiceAdd = 3;
        static final int TRANSACTION_onServiceRemoved = 2;

        public static class Proxy implements IServiceCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.health.apiprovider.IServiceCallback
            public String dumpWithParam(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceCallback.DESCRIPTOR);
                    parcelObtain.writeStringArray(strArr);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IServiceCallback.DESCRIPTOR;
            }

            @Override // com.oplus.health.apiprovider.IServiceCallback
            public void onRemoteDied(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.health.apiprovider.IServiceCallback
            public void onServiceAdd(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.health.apiprovider.IServiceCallback
            public void onServiceRemoved(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IServiceCallback.DESCRIPTOR);
        }

        public static IServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IServiceCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServiceCallback)) ? new Proxy(iBinder) : (IServiceCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IServiceCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IServiceCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                String strDumpWithParam = dumpWithParam(parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeString(strDumpWithParam);
            } else if (i == 2) {
                onServiceRemoved(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else if (i == 3) {
                onServiceAdd(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onRemoteDied(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    String dumpWithParam(String[] strArr) throws RemoteException;

    void onRemoteDied(String str) throws RemoteException;

    void onServiceAdd(String str, String str2) throws RemoteException;

    void onServiceRemoved(String str, String str2) throws RemoteException;
}

package com.oplus.health.apiprovider;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IServiceManager extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.health.apiprovider.IServiceManager";

    public static class Default implements IServiceManager {
        @Override // com.oplus.health.apiprovider.IServiceManager
        public void addCallback(String str, String str2, IServiceCallback iServiceCallback) throws RemoteException {
        }

        @Override // com.oplus.health.apiprovider.IServiceManager
        public void addService(String str, IBinder iBinder) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.health.apiprovider.IServiceManager
        public IBinder getService(String str, boolean z) throws RemoteException {
            return null;
        }

        @Override // com.oplus.health.apiprovider.IServiceManager
        public boolean hasService(String str) throws RemoteException {
            return false;
        }

        @Override // com.oplus.health.apiprovider.IServiceManager
        public void removeService(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IServiceManager {
        static final int TRANSACTION_addCallback = 5;
        static final int TRANSACTION_addService = 1;
        static final int TRANSACTION_getService = 4;
        static final int TRANSACTION_hasService = 3;
        static final int TRANSACTION_removeService = 2;

        public static class Proxy implements IServiceManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.oplus.health.apiprovider.IServiceManager
            public void addCallback(String str, String str2, IServiceCallback iServiceCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongInterface(iServiceCallback);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.health.apiprovider.IServiceManager
            public void addService(String str, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IServiceManager.DESCRIPTOR;
            }

            @Override // com.oplus.health.apiprovider.IServiceManager
            public IBinder getService(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.health.apiprovider.IServiceManager
            public boolean hasService(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.health.apiprovider.IServiceManager
            public void removeService(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IServiceManager.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IServiceManager.DESCRIPTOR);
        }

        public static IServiceManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IServiceManager.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServiceManager)) ? new Proxy(iBinder) : (IServiceManager) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IServiceManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IServiceManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                addService(parcel.readString(), parcel.readStrongBinder());
                parcel2.writeNoException();
            } else if (i == 2) {
                removeService(parcel.readString());
                parcel2.writeNoException();
            } else if (i == 3) {
                boolean zHasService = hasService(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zHasService ? 1 : 0);
            } else if (i == 4) {
                IBinder service = getService(parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(service);
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                addCallback(parcel.readString(), parcel.readString(), IServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void addCallback(String str, String str2, IServiceCallback iServiceCallback) throws RemoteException;

    void addService(String str, IBinder iBinder) throws RemoteException;

    IBinder getService(String str, boolean z) throws RemoteException;

    boolean hasService(String str) throws RemoteException;

    void removeService(String str) throws RemoteException;
}

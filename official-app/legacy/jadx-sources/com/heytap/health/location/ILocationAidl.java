package com.heytap.health.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public interface ILocationAidl extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.location.ILocationAidl";

    public static class Default implements ILocationAidl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.location.ILocationAidl
        public void start(ILocationCB iLocationCB) throws RemoteException {
        }

        @Override // com.heytap.health.location.ILocationAidl
        public void startCoarseOnce(ILocationCB iLocationCB) throws RemoteException {
        }

        @Override // com.heytap.health.location.ILocationAidl
        public void startOnce(ILocationCB iLocationCB) throws RemoteException {
        }

        @Override // com.heytap.health.location.ILocationAidl
        public void stop(ILocationCB iLocationCB) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ILocationAidl {
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_startCoarseOnce = 4;
        static final int TRANSACTION_startOnce = 3;
        static final int TRANSACTION_stop = 2;

        public static class Proxy implements ILocationAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ILocationAidl.DESCRIPTOR;
            }

            @Override // com.heytap.health.location.ILocationAidl
            public void start(ILocationCB iLocationCB) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ILocationAidl.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iLocationCB);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.location.ILocationAidl
            public void startCoarseOnce(ILocationCB iLocationCB) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ILocationAidl.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iLocationCB);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.location.ILocationAidl
            public void startOnce(ILocationCB iLocationCB) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ILocationAidl.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iLocationCB);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.location.ILocationAidl
            public void stop(ILocationCB iLocationCB) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ILocationAidl.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iLocationCB);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ILocationAidl.DESCRIPTOR);
        }

        public static ILocationAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ILocationAidl.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILocationAidl)) ? new Proxy(iBinder) : (ILocationAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ILocationAidl.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ILocationAidl.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                start(ILocationCB.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                stop(ILocationCB.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                startOnce(ILocationCB.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                startCoarseOnce(ILocationCB.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void start(ILocationCB iLocationCB) throws RemoteException;

    void startCoarseOnce(ILocationCB iLocationCB) throws RemoteException;

    void startOnce(ILocationCB iLocationCB) throws RemoteException;

    void stop(ILocationCB iLocationCB) throws RemoteException;
}

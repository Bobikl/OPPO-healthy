package com.euicc.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.euicc.server.model.IOpenEUICCCalbcak;

/* JADX INFO: loaded from: classes13.dex */
public interface IOpenEUICC extends IInterface {
    public static final String DESCRIPTOR = "com.euicc.server.IOpenEUICC";

    public static class Default implements IOpenEUICC {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.euicc.server.IOpenEUICC
        public void downloadEUICCProfile(String str) throws RemoteException {
        }

        @Override // com.euicc.server.IOpenEUICC
        public void getAttachedDeviceEUICCInfo() throws RemoteException {
        }

        @Override // com.euicc.server.IOpenEUICC
        public void registerCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException {
        }

        @Override // com.euicc.server.IOpenEUICC
        public void unRegisterCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOpenEUICC {
        static final int TRANSACTION_downloadEUICCProfile = 4;
        static final int TRANSACTION_getAttachedDeviceEUICCInfo = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unRegisterCallback = 2;

        public static class Proxy implements IOpenEUICC {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.euicc.server.IOpenEUICC
            public void downloadEUICCProfile(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenEUICC.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.euicc.server.IOpenEUICC
            public void getAttachedDeviceEUICCInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenEUICC.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IOpenEUICC.DESCRIPTOR;
            }

            @Override // com.euicc.server.IOpenEUICC
            public void registerCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenEUICC.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOpenEUICCCalbcak);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.euicc.server.IOpenEUICC
            public void unRegisterCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenEUICC.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOpenEUICCCalbcak);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOpenEUICC.DESCRIPTOR);
        }

        public static IOpenEUICC asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOpenEUICC.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOpenEUICC)) ? new Proxy(iBinder) : (IOpenEUICC) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOpenEUICC.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOpenEUICC.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                registerCallback(IOpenEUICCCalbcak.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                unRegisterCallback(IOpenEUICCCalbcak.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                getAttachedDeviceEUICCInfo();
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                downloadEUICCProfile(parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void downloadEUICCProfile(String str) throws RemoteException;

    void getAttachedDeviceEUICCInfo() throws RemoteException;

    void registerCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException;

    void unRegisterCallback(IOpenEUICCCalbcak iOpenEUICCCalbcak) throws RemoteException;
}

package com.cmcc.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.cmcc.server.model.IOpenMultiSimCallback;

/* JADX INFO: loaded from: classes13.dex */
public interface IOpenMultiSim extends IInterface {
    public static final String DESCRIPTOR = "com.cmcc.server.IOpenMultiSim";

    public static class Default implements IOpenMultiSim {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void downloadEsimProfile(String str, long j2, String str2) throws RemoteException {
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void getAttachedDeviceMultiSimInfo() throws RemoteException {
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void registerCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException {
        }

        @Override // com.cmcc.server.IOpenMultiSim
        public void unRegisterCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IOpenMultiSim {
        static final int TRANSACTION_downloadEsimProfile = 4;
        static final int TRANSACTION_getAttachedDeviceMultiSimInfo = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unRegisterCallback = 2;

        public static class Proxy implements IOpenMultiSim {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.cmcc.server.IOpenMultiSim
            public void downloadEsimProfile(String str, long j2, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.cmcc.server.IOpenMultiSim
            public void getAttachedDeviceMultiSimInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IOpenMultiSim.DESCRIPTOR;
            }

            @Override // com.cmcc.server.IOpenMultiSim
            public void registerCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOpenMultiSimCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.cmcc.server.IOpenMultiSim
            public void unRegisterCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOpenMultiSim.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iOpenMultiSimCallback);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IOpenMultiSim.DESCRIPTOR);
        }

        public static IOpenMultiSim asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOpenMultiSim.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOpenMultiSim)) ? new Proxy(iBinder) : (IOpenMultiSim) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IOpenMultiSim.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IOpenMultiSim.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                registerCallback(IOpenMultiSimCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 2) {
                unRegisterCallback(IOpenMultiSimCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else if (i == 3) {
                getAttachedDeviceMultiSimInfo();
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                downloadEsimProfile(parcel.readString(), parcel.readLong(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void downloadEsimProfile(String str, long j2, String str2) throws RemoteException;

    void getAttachedDeviceMultiSimInfo() throws RemoteException;

    void registerCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException;

    void unRegisterCallback(IOpenMultiSimCallback iOpenMultiSimCallback) throws RemoteException;
}
